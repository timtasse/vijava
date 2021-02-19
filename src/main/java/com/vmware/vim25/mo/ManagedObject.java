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

import com.vmware.vim25.*;
import com.vmware.vim25.mo.util.MorUtil;
import com.vmware.vim25.mo.util.PropertyCollectorUtil;
import com.vmware.vim25.ws.Argument;
import com.vmware.vim25.ws.VimStub;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.rmi.RemoteException;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

/**
 * This class is intended to provide a wrapper around a managed object class.
 * The abstraction will hide the web service details and make the managed
 * objects OO style in the client side programming.
 * Every managed object class can inherit from this and take advantage of this
 * abstraction.
 *
 * @author Steve JIN (http://www.doublecloud.org)
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
     * Use this contructor when you can re-use existing web service connection.
     *
     * @param serverConnection
     * @param mor
     */
    public ManagedObject(final ServerConnection serverConnection, final ManagedObjectReference mor) {
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
     * @return
     */
    public ManagedObjectReference getMOR() {
        return this.mor;
    }

    /**
     * Get the web service
     *
     * @return
     */
    protected VimStub getVimService() {
        return serverConnection.getVimService();
    }

    protected Task invokeWithTaskReturn(final String methodName, final List<Argument> paras) throws RemoteException {
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke(methodName, paras, ManagedObjectReference.class);
        return new Task(this.serverConnection, mor);
    }

    public ServerConnection getServerConnection() {
        return serverConnection;
    }

    /**
     * Set up the ServerConnection, only when it hasn't been set yet.
     *
     * @param sc
     */
    protected void setServerConnection(final ServerConnection sc) {
        if (this.serverConnection == null) {
            this.serverConnection = sc;
        }
    }

    protected ObjectContent retrieveObjectProperties(final String[] properties) {
        final ObjectSpec oSpec = PropertyCollectorUtil.creatObjectSpec(
                getMOR(), Boolean.FALSE, null);

        final PropertySpec pSpec = PropertyCollectorUtil.createPropertySpec(
                getMOR().getType(),
                properties == null || properties.length == 0, //if true, all props of this obj are to be read regardless of propName
                properties);

        final PropertyFilterSpec pfSpec = new PropertyFilterSpec();
        pfSpec.setObjectSet(new ObjectSpec[]{oSpec});
        pfSpec.setPropSet(new PropertySpec[]{pSpec});

        final PropertyCollector pc = getServerConnection().getServiceInstance().getPropertyCollector();

        final ObjectContent[] objs;
        try {
            objs = pc.retrievePropertiesEx(new PropertyFilterSpec[]{pfSpec}, null).getObjects();
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
     * @return it will return either an array of related data objects, or an data object itself.
     * ManagedObjectReference objects are data objects!!!
     * @throws RemoteException
     * @throws RuntimeFault
     * @throws InvalidProperty
     * @
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

    protected Datastore[] getDatastores(final String propName) {
        final Object[] objs = getManagedObjects(propName);
        if (objs.length == 0) {
            return new Datastore[]{};
        }
        return (Datastore[]) objs;
    }

    protected Network[] getNetworks(final String propName) {
        final Object[] objs = getManagedObjects(propName, true);
        if (objs.length == 0) {
            return new Network[]{};
        }
        final Network[] nets = new Network[objs.length];
        for (int i = 0; i < objs.length; i++) {
            nets[i] = (Network) objs[i];
        }
        return nets;
    }

    protected VirtualMachine[] getVms(final String propName) {
        final ManagedObject[] objs = getManagedObjects(propName);
        if (objs.length == 0) {
            return new VirtualMachine[]{};
        }
        return (VirtualMachine[]) objs;
    }

    protected PropertyFilter[] getFilter(final String propName) {
        final Object[] objs = getManagedObjects(propName);
        if (objs.length == 0) {
            return new PropertyFilter[]{};
        }
        return (PropertyFilter[]) objs;
    }

    protected ResourcePool[] getResourcePools(final String propName) {
        final Object[] objs = getManagedObjects(propName, true);
        final ResourcePool[] rps = new ResourcePool[objs.length];
        for (int i = 0; i < rps.length; i++) {
            rps[i] = (ResourcePool) objs[i];
        }
        return rps;
    }

    protected Task[] getTasks(final String propName) {
        final Object[] objs = getManagedObjects(propName);
        if (objs.length == 0) {
            return new Task[]{};
        }
        return (Task[]) objs;
    }

    protected ScheduledTask[] getScheduledTasks(final String propName) {
        final Object[] objs = getManagedObjects(propName);
        if (objs.length == 0) {
            return new ScheduledTask[]{};
        }
        return (ScheduledTask[]) objs;
    }

    protected View[] getViews(final String propName) {
        final Object[] objs = getManagedObjects(propName);
        if (objs.length == 0) {
            return new View[]{};
        }
        return (View[]) objs;
    }

    protected HostSystem[] getHosts(final String propName) {
        final Object[] objs = getManagedObjects(propName);
        if (objs.length == 0) {
            return new HostSystem[]{};
        }
        return (HostSystem[]) objs;
    }

    protected ManagedObject getManagedObject(final String propName) {
        final ManagedObjectReference mor = getCurrentProperty(propName, ManagedObjectReference.class);
        return MorUtil.createExactManagedObject(getServerConnection(), mor);
    }

    /**
     * Handle Updates for a single object.
     * waits till expected values of properties to check are reached
     * Destroys the ObjectFilter when done.
     *
     * @param filterProps  Properties list to filter
     * @param endWaitProps Properties list to check for expected values
     *                     these be properties of a property in the filter properties list
     * @param expectedVals values for properties to end the wait
     * @return true indicating expected values were met, and false otherwise
     * @throws RemoteException
     * @throws RuntimeFault
     * @throws InvalidProperty
     */
    protected Object[] waitForValues(final String[] filterProps, final String[] endWaitProps, final Object[][] expectedVals) throws InvalidProperty, RuntimeFault, RemoteException {
        String version = "";
        final Object[] endVals = new Object[endWaitProps.length];
        final Object[] filterVals = new Object[filterProps.length];

        final ObjectSpec oSpec = PropertyCollectorUtil.creatObjectSpec(
                getMOR(), Boolean.FALSE, null);

        final PropertySpec pSpec = PropertyCollectorUtil.createPropertySpec(
                getMOR().getType(),
                filterProps.length == 0, //if true, all props of this obj are to be read regardless of propName
                filterProps);

        final PropertyFilterSpec spec = new PropertyFilterSpec();
        spec.setObjectSet(new ObjectSpec[]{oSpec});
        spec.setPropSet(new PropertySpec[]{pSpec});

        final PropertyCollector pc = serverConnection.getServiceInstance().getPropertyCollector();
        final PropertyFilter pf = pc.createFilter(spec, true);

        boolean reached = false;

        while (!reached) {
            final UpdateSet updateset = pc.waitForUpdates(version);
            if (updateset == null) {
                continue;
            }
            version = updateset.getVersion();
            final PropertyFilterUpdate[] filtupary = updateset.getFilterSet();
            if (filtupary == null) {
                continue;
            }

            // Make this code more general purpose when PropCol changes later.
            for (final PropertyFilterUpdate filtup : filtupary) {
                if (filtup == null) {
                    continue;
                }
                final ObjectUpdate[] objupary = filtup.getObjectSet();
                for (int j = 0; objupary != null && j < objupary.length; j++) {
                    final ObjectUpdate objup = objupary[j];
                    if (objup == null) {
                        continue;
                    }
                    final PropertyChange[] propchgary = objup.getChangeSet();
                    for (int k = 0; propchgary != null && k < propchgary.length; k++) {
                        final PropertyChange propchg = propchgary[k];
                        updateValues(endWaitProps, endVals, propchg);
                        updateValues(filterProps, filterVals, propchg);
                    }
                }
            }

            // Check if the expected values have been reached and exit the loop if done.
            // Also exit the WaitForUpdates loop if this is the case.
            for (int chgi = 0; chgi < endVals.length && !reached; chgi++) {
                for (int vali = 0; vali < expectedVals[chgi].length && !reached; vali++) {
                    final Object expctdval = expectedVals[chgi][vali];
                    reached = expctdval.equals(endVals[chgi]);
                }
            }
        }

        pf.destroyPropertyFilter();

        return filterVals;
    }

    private void updateValues(final String[] props, final Object[] vals, final PropertyChange propchg) {
        for (int i = 0; i < props.length; i++) {
            if (propchg.getName().lastIndexOf(props[i]) >= 0) {
                if (propchg.getOp() == PropertyChangeOp.remove) {
                    vals[i] = "";
                } else {
                    vals[i] = propchg.getVal();
                }
            }
        }
    }

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
