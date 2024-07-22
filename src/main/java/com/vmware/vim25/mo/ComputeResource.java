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
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Represents a set of physical compute resources for a set of virtual machines.
 * The base type ComputeResource, when instantiated by calling AddStandaloneHost_Task, represents a single host.
 * The subclass ClusterComputeResource represents a cluster of hosts and adds distributed management features such as availability and resource scheduling.
 *
 * A ComputeResource always has a root ResourcePool associated with it.
 * Certain types of clusters such as those with VMware DRS enabled and standalone hosts (ESX Server 3) support the creation of ResourcePool hierarchies.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
@SuppressWarnings("unused")
public class ComputeResource extends ManagedEntity {

    public ComputeResource(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public ComputeResourceConfigInfo getConfigurationEx() {
        return this.getCurrentProperty("configurationEx", ComputeResourceConfigInfo.class);
    }

    public List<Datastore> getDatastores() {
        return getDatastores("datastore");
    }

    public EnvironmentBrowser getEnvironmentBrowser() {
        return (EnvironmentBrowser) this.getManagedObject("environmentBrowser");
    }

    public List<HostSystem> getHosts() {
        return getHosts("host");
    }

    public List<Network> getNetworks() {
        return getNetworks("network");
    }

    public ResourcePool getResourcePool() {
        return (ResourcePool) this.getManagedObject("resourcePool");
    }

    public ComputeResourceSummary getSummary() {
        return this.getCurrentProperty("summary", ComputeResourceSummary.class);
    }

    public Task reconfigureComputeResource(final ComputeResourceConfigSpec spec, final boolean modify)
            throws CannotDisableDrsOnClustersWithVApps, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", ComputeResourceConfigSpec.class, spec),
                new Argument("modify", "boolean", modify));
        try {
            return this.invokeWithTaskReturn("ReconfigureComputeResource_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof CannotDisableDrsOnClustersWithVApps) {
                throw (CannotDisableDrsOnClustersWithVApps) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
