/*================================================================================
Copyright (c) 2008 VMware, Inc. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation 
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25.mo;

import com.vmware.vim25.DynamicProperty;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ObjectContent;
import com.vmware.vim25.PropertyFilterSpec;
import com.vmware.vim25.mo.util.MorUtil;
import com.vmware.vim25.mo.util.PropertyCollectorUtil;
import com.vmware.vim25.ws.Argument;
import com.vmware.vim25.ws.VimStub;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class is intended to provide a wrapper around a managed object class.
 * The abstraction will hide the web service details and make the managed
 * objects OO style in the client side programming.
 * Every managed object class can inherit from this and take advantage of this
 * abstraction.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
public abstract class ManagedObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManagedObject.class);
    public static final String EXCEPTION_NOT_KNOWN = "Exception not known";

    private static final String MO_PACKAGE_NAME = ManagedObject.class.getPackage().getName();

    /**
     * holds the ServerConnection instance
     */
    private ServerConnection serverConnection;
    /**
     * holds the ExtensionManager managed object reference
     */
    private ManagedObjectReference mor;

    protected ManagedObject() {
    }

    /**
     * Constructor that reuse exiting web service connection
     * Use this constructor when you can re-use existing web service connection.
     *
     * @param serverConnection the existing ServerConnection
     * @param mor              the ManagedObjectReference
     */
    protected ManagedObject(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        this.serverConnection = serverConnection;
        this.mor = mor;
    }

    /**
     * Set the ManagedObjectReference object pointing to the managed object
     */
    protected void setMOR(final ManagedObjectReference mor) {
        this.mor = mor;
    }

    /**
     * get the ManagedObjectReference object pointing to the managed object
     *
     * @return the ManagedObjectReference
     */
    public ManagedObjectReference getMOR() {
        return this.mor;
    }

    /**
     * Get the web service
     *
     * @return the VimService
     */
    protected VimStub getVimService() {
        return serverConnection.getVimService();
    }

    protected Task invokeWithTaskReturn(final String methodName, final List<Argument> paras) throws RemoteException {
        final ManagedObjectReference thisMor = this.getVimService().getWsc().invoke(methodName, paras, ManagedObjectReference.class);
        return new Task(this.serverConnection, thisMor);
    }

    public ServerConnection getServerConnection() {
        return serverConnection;
    }

    /**
     * Set up the ServerConnection, only when it hasn't been set yet.
     *
     * @param sc the established ServerConnection
     */
    protected void setServerConnection(final ServerConnection sc) {
        if (this.serverConnection == null) {
            this.serverConnection = sc;
        }
    }

    protected ObjectContent retrieveObjectProperties(final String[] properties) {
        final PropertyFilterSpec pfSpec = PropertyFilterSpec.createDefault(this.mor, properties);

        final PropertyCollector pc = getServerConnection().getServiceInstance().getPropertyCollector();

        final ObjectContent[] objs;
        try {
            objs = pc.retrievePropertiesEx(List.of(pfSpec), null).getObjects();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }

        if (objs == null || objs[0] == null)
            return null;
        else
            return objs[0];
    }

    /**
     * @param propertyName The property name of current managed object
     * @return it will return either an array of related data objects, or a data object itself.
     * ManagedObjectReference objects are data objects!!!
     * @throws RemoteException any Exception is wrapped in a RemoteException
     */
    protected Object getCurrentProperty(final String propertyName) {
        final ObjectContent objContent = retrieveObjectProperties(new String[]{propertyName});
        Object propertyValue = null;

        if (objContent != null) {
            final DynamicProperty[] dynaProps = objContent.getPropSet();

            if ((dynaProps != null) && (dynaProps[0] != null)) {
                propertyValue = PropertyCollectorUtil.convertProperty(dynaProps[0].getVal());
            }
        }
        return propertyValue;
    }

    public Object getPropertyByPath(final String propPath) {
        return getCurrentProperty(propPath);
    }

    @SuppressWarnings("unchecked")
    protected <T> T getCurrentProperty(final String propertyName, final Class<T> clazz) {
        return (T) this.getCurrentProperty(propertyName);
    }

    protected ManagedObject[] getManagedObjects(final String propName, final boolean mixedType) {
        final Object object = getCurrentProperty(propName);
        ManagedObjectReference[] mors = null;
        if (object instanceof ManagedObjectReference[]) {
            mors = (ManagedObjectReference[]) object;
        }

        if (mors == null || mors.length == 0) {
            return new ManagedObject[]{};
        }

        Object mos = new ManagedObject[mors.length];

        try {
            Class<?> moClass = null;

            if (!mixedType) {
                moClass = Class.forName(MO_PACKAGE_NAME + "." + mors[0].getType());
                mos = Array.newInstance(moClass, mors.length);
            }

            for (int i = 0; i < mors.length; i++) {
                if (mixedType) {
                    moClass = Class.forName(MO_PACKAGE_NAME + "." + mors[i].getType());
                }
                final Constructor<?> constructor = moClass.getConstructor(ServerConnection.class, ManagedObjectReference.class);

                Array.set(mos, i, constructor.newInstance(getServerConnection(), mors[i]));
            }
        } catch (final Exception e) {
            LOGGER.error("ReflectionError during getManagedObjects", e);
        }

        return (ManagedObject[]) mos;
    }


    protected ManagedObject[] getManagedObjects(final String propName) {
        return getManagedObjects(propName, false);
    }

    protected List<Datastore> getDatastores(final String propName) {
        return Arrays.stream(this.getManagedObjects(propName))
                .map(Datastore.class::cast)
                .collect(Collectors.toList());
    }

    protected List<Network> getNetworks(final String propName) {
        return Arrays.stream(getManagedObjects(propName, true))
                .map(Network.class::cast)
                .collect(Collectors.toList());
    }

    protected List<VirtualMachine> getVms(final String propName) {
        return Arrays.stream(this.getManagedObjects(propName))
                .map(VirtualMachine.class::cast)
                .collect(Collectors.toList());
    }

    protected List<ResourcePool> getResourcePools(final String propName) {
        return Arrays.stream(this.getManagedObjects(propName, true))
                .map(ResourcePool.class::cast)
                .collect(Collectors.toList());
    }

    protected List<Task> getTasks(final String propName) {
        return Arrays.stream(this.getManagedObjects(propName))
                .map(Task.class::cast)
                .collect(Collectors.toList());
    }

    protected List<ScheduledTask> getScheduledTasks(final String propName) {
        return Arrays.stream(this.getManagedObjects(propName))
                .map(ScheduledTask.class::cast)
                .collect(Collectors.toList());
    }

    protected List<View> getViews(final String propName) {
        return Arrays.stream(this.getManagedObjects(propName))
                .map(View.class::cast)
                .collect(Collectors.toList());
    }

    protected List<HostSystem> getHosts(final String propName) {
        return Arrays.stream(this.getManagedObjects(propName))
                .map(HostSystem.class::cast)
                .collect(Collectors.toList());
    }

    protected ManagedObject getManagedObject(final String propName) {
        final ManagedObjectReference thisMor = getCurrentProperty(propName, ManagedObjectReference.class);
        return MorUtil.createExactManagedObject(getServerConnection(), thisMor);
    }

    @Override
    public String toString() {
        return mor.getType() + ":" + mor.getVal() + " @ " + getServerConnection().getUrl();
    }

    protected ManagedObjectReference[] convertMors(final ManagedObject[] mos) {
        ManagedObjectReference[] mors = null;
        if (mos != null) {
            mors = MorUtil.createMORs(mos);
        }
        return mors;
    }

    protected Argument getSelfArgument() {
        return new Argument("_this", ManagedObjectReference.class, this.getMOR());
    }

    protected List<Argument> getSingleSelfArgumentList() {
        return Collections.singletonList(this.getSelfArgument());
    }

}
