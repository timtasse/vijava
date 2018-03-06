package com.vmware.vim25.mo;

import com.vmware.vim25.*;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 27.03.18.
 */
public class ClusterEVCManager extends ExtensibleManagedObject {

    public ClusterEVCManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public ClusterComputeResource getManagedCluster() {
        return (ClusterComputeResource) getManagedObject("managedCluster");
    }

    public ClusterEVCManagerEVCState getEvcState() {
        return (ClusterEVCManagerEVCState) this.getCurrentProperty("evcState");
    }

    public Task CheckAddHostEvc_Task(final HostConnectSpec cnxSpec) throws RuntimeFault {
        // TODO: to implement
        throw new NotImplemented();
    }

    public Task CheckConfigureEvcMode_Task(final String evcModeKey) throws RuntimeFault {
        // TODO: to implement
        throw new NotImplemented();
    }

    public Task ConfigureEvcMode_Task(final String evcModeKey) throws RuntimeFault {
        // TODO: to implement
        throw new NotImplemented();
    }

    public Task DisableEvcMode_Task() throws RuntimeFault {
        // TODO: to implement
        throw new NotImplemented();
    }

}
