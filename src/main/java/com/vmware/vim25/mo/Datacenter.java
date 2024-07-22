/*================================================================================
Copyright (c) 2012 Steve Jin. All Rights Reserved.
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
 * The Datacenter managed object provides the interface to the common container object for hosts, virtual machines, networks, and datastores.
 * These entities must be under a distinct datacenter in the inventory, and datacenters may not be nested under other datacenters.
 * Every Datacenter has the following set of dedicated folders. These folders are empty until you create entities for the Datacenter.
 * <p>
 * A folder for VirtualMachine, template, and VirtualApp objects.
 * A folder for a ComputeResource hierarchy.
 * A folder for Network, DistributedVirtualSwitch, and DistributedVirtualPortgroup objects.
 * A folder for Datastore objects.
 * For a visual representation of the organization of objects in a vCenter hierarchy, see the description of the ServiceInstance object.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7.1
 */
@SuppressWarnings("unused")
public class Datacenter extends ManagedEntity {

    public Datacenter(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public DatacenterConfigInfo getConfiguration() {
        return getCurrentProperty("configuration", DatacenterConfigInfo.class);
    }

    public List<Datastore> getDatastores() {
        return this.getDatastores("datastore");
    }

    public Folder getDatastoreFolder() {
        return (Folder) this.getManagedObject("datastoreFolder");
    }

    public Folder getHostFolder() {
        return (Folder) this.getManagedObject("hostFolder");
    }

    public List<Network> getNetworks() {
        return this.getNetworks("network");
    }

    public Folder getNetworkFolder() {
        return (Folder) this.getManagedObject("networkFolder");
    }

    public Folder getVmFolder() {
        return (Folder) this.getManagedObject("vmFolder");
    }

    @SuppressWarnings("unchecked")
    public List<DatacenterBasicConnectInfo> batchQueryConnectInfo(final List<HostConnectSpec> hostSpecs) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("hostSpecs", HostConnectSpec[].class, hostSpecs));
        try {
            return (List<DatacenterBasicConnectInfo>) this.getVimService().getWsc()
                    .invoke("BatchQueryConnectInfo", params, "List.DatacenterBasicConnectInfo");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task powerOnMultiVM(final List<ManagedObjectReference> vms, final List<OptionValue> option) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vms", ManagedObjectReference[].class, vms),
                new Argument("option", OptionValue[].class, option));
        try {
            return this.invokeWithTaskReturn("PowerOnMultiVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public HostConnectInfo queryConnectionInfo(final String hostname, final int port, final String username,
                                               final String password, final String sslThumbprint)
            throws AlreadyConnected, InvalidLogin, NoHost, NotSupportedHost, SSLDisabledFault, SSLVerifyFault,
            HostConnectFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("hostname", String.class, hostname),
                Argument.fromBasicType("port", port),
                new Argument("username", String.class, username),
                new Argument("password", String.class, password),
                new Argument("sslThumbprint", String.class, sslThumbprint));
        try {
            return this.getVimService().getWsc().invoke("QueryConnectionInfo", params, HostConnectInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AlreadyConnected) {
                throw (AlreadyConnected) cause;
            }
            if (cause instanceof InvalidLogin) {
                throw (InvalidLogin) cause;
            }
            if (cause instanceof NoHost) {
                throw (NoHost) cause;
            }
            if (cause instanceof NotSupportedHost) {
                throw (NotSupportedHost) cause;
            }
            if (cause instanceof SSLDisabledFault) {
                throw (SSLDisabledFault) cause;
            }
            if (cause instanceof SSLVerifyFault) {
                throw (SSLVerifyFault) cause;
            }
            if (cause instanceof HostConnectFault) {
                throw (HostConnectFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public HostConnectInfo queryConnectionInfoViaSpec(final HostConnectSpec spec)
            throws GatewayConnectFault, GatewayHostNotReachable, GatewayNotFound, GatewayNotReachable, GatewayOperationRefused,
            GatewayToHostAuthFault, GatewayToHostTrustVerifyFault, HostConnectFault, InvalidLogin, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", HostConnectSpec.class, spec));
        try {
            return this.getVimService().getWsc().invoke("QueryConnectionInfoViaSpec", params, HostConnectInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof GatewayHostNotReachable) {
                throw (GatewayHostNotReachable) cause;
            }
            if (cause instanceof GatewayNotFound) {
                throw (GatewayNotFound) cause;
            }
            if (cause instanceof GatewayNotReachable) {
                throw (GatewayNotReachable) cause;
            }
            if (cause instanceof GatewayOperationRefused) {
                throw (GatewayOperationRefused) cause;
            }
            if (cause instanceof GatewayToHostAuthFault) {
                throw (GatewayToHostAuthFault) cause;
            }
            if (cause instanceof GatewayToHostTrustVerifyFault) {
                throw (GatewayToHostTrustVerifyFault) cause;
            }
            if (cause instanceof GatewayConnectFault) {
                throw (GatewayConnectFault) cause;
            }
            if (cause instanceof InvalidLogin) {
                throw (InvalidLogin) cause;
            }
            if (cause instanceof HostConnectFault) {
                throw (HostConnectFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<VirtualMachineConfigOptionDescriptor> queryDatacenterConfigOptionDescriptor() throws RuntimeFault {
        try {
            return (List<VirtualMachineConfigOptionDescriptor>) this.getVimService().getWsc()
                    .invoke("queryDatacenterConfigOptionDescriptor", this.getSingleSelfArgumentList(),
                            "List.VirtualMachineConfigOptionDescriptor");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task reconfigureDatacenter(final DatacenterConfigSpec spec, final boolean modify) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", DatacenterConfigSpec.class, spec),
                Argument.fromBasicType("modify", modify));
        try {
            return this.invokeWithTaskReturn("ReconfigureDatacenter_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
