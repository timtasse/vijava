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
import com.vmware.vim25.mo.util.MorUtil;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * The Datacenter managed object provides the interface to the common container object for hosts, virtual machines, networks, and datastores.
 * These entities must be under a distinct datacenter in the inventory, and datacenters may not be nested under other datacenters.
 * Every Datacenter has the following set of dedicated folders. These folders are empty until you create entities for the Datacenter.
 *
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
@SuppressWarnings("unchecked")
public class Datacenter extends ManagedEntity {

    public Datacenter(ServerConnection sc, ManagedObjectReference mor) {
        super(sc, mor);
    }

    public DatacenterConfigInfo getConfiguration() {
        return (DatacenterConfigInfo) getCurrentProperty("configuration");
    }

    public Datastore[] getDatastores() {
        return getDatastores("datastore");
    }

    public Folder getDatastoreFolder() {
        return (Folder) getManagedObject("datastoreFolder");
    }

    public Folder getHostFolder() throws InvalidProperty, RuntimeFault, RemoteException {
        return (Folder) this.getManagedObject("hostFolder");
    }

    public Network[] getNetworks() throws InvalidProperty, RuntimeFault, RemoteException {
        return getNetworks("network");
    }

    public Folder getNetworkFolder() {
        return (Folder) getManagedObject("networkFolder");
    }

    public Folder getVmFolder() throws InvalidProperty, RuntimeFault, RemoteException {
        return (Folder) this.getManagedObject("vmFolder");
    }

    public List<DatacenterBasicConnectInfo> batchQueryConnectInfo(final List<HostConnectSpec> hostSpecs) throws NotSupported, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("hostSpecs", "HostConnectSpec[]", hostSpecs));
        return (List<DatacenterBasicConnectInfo>) this.getVimService().getWsc().invoke("BatchQueryConnectInfo", params, "List.DatacenterBasicConnectInfo");
    }

    /**
     * old signature for back compatibility with 2.5 and 4.0
     */
    public Task powerOnMultiVM_Task(VirtualMachine[] vms) throws RuntimeFault, RemoteException {
        return powerOnMultiVM_Task(vms, null);
    }

    /**
     * @since SDK4.1
     */
    public Task powerOnMultiVM_Task(VirtualMachine[] vms, OptionValue[] option) throws RuntimeFault, RemoteException {
        if (vms == null) {
            throw new IllegalArgumentException("vms must not be null.");
        }
        ManagedObjectReference[] mors = MorUtil.createMORs(vms);
        ManagedObjectReference tmor = getVimService().powerOnMultiVM_Task(getMOR(), mors, option);
        return new Task(getServerConnection(), tmor);
    }

    public HostConnectInfo queryConnectionInfo(String hostname, int port, String username, String password,
                                               String sslThumbprint) throws InvalidLogin, HostConnectFault, RuntimeFault, RemoteException {
        return getVimService().queryConnectionInfo(getMOR(), hostname, port, username, password, sslThumbprint);
    }

    public HostConnectInfo queryConnectionInfoViaSpec(final HostConnectSpec spec)
            throws GatewayConnectFault, GatewayHostNotReachable, GatewayNotFound, GatewayNotReachable, GatewayOperationRefused,
            GatewayToHostAuthFault, GatewayToHostTrustVerifyFault, HostConnectFault, InvalidArgument, InvalidLogin, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", HostConnectSpec.class, spec));
        return this.getVimService().getWsc().invoke("QueryConnectionInfoViaSpec", params, HostConnectInfo.class);
    }

    public List<VirtualMachineConfigOptionDescriptor> queryDatacenterConfigOptionDescriptor() throws RuntimeFault, RemoteException {
        return (List<VirtualMachineConfigOptionDescriptor>) this.getVimService().getWsc()
                .invoke("queryDatacenterConfigOptionDescriptor", this.getSingleSelfArgumentList(), "List.VirtualMachineConfigOptionDescriptor");
    }

    public Task reconfigureDatacenter_Task(DatacenterConfigSpec spec, boolean modify) throws RuntimeFault, RemoteException {
        ManagedObjectReference tmor = getVimService().reconfigureDatacenter_Task(getMOR(), spec, modify);
        return new Task(getServerConnection(), tmor);
    }

}
