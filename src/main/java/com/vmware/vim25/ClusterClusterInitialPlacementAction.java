package com.vmware.vim25;

/**
 * Describes an action for the initial placement of a virtual machine in a cluster.
 * This action is used by the cross cluster placement API when a virtual machine needs to be placed across a set of given clusters.
 * See PlaceVmsXCluster.
 * This action encapsulates details about the chosen cluster (via the resource pool inside that cluster),
 * the chosen host and the chosen datastores for the disks of the virtual machine.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class ClusterClusterInitialPlacementAction extends ClusterAction {

    private ManagedObjectReference targetHost;
    private ManagedObjectReference pool;
    private VirtualMachineConfigSpec configSpec;

    @Override
    public String toString() {
        return "ClusterClusterInitialPlacementAction{" +
                "targetHost=" + targetHost +
                ", pool=" + pool +
                ", configSpec=" + configSpec +
                '}';
    }

    public ManagedObjectReference getTargetHost() {
        return targetHost;
    }

    public void setTargetHost(final ManagedObjectReference targetHost) {
        this.targetHost = targetHost;
    }

    public ManagedObjectReference getPool() {
        return pool;
    }

    public void setPool(final ManagedObjectReference pool) {
        this.pool = pool;
    }

    public VirtualMachineConfigSpec getConfigSpec() {
        return configSpec;
    }

    public void setConfigSpec(final VirtualMachineConfigSpec configSpec) {
        this.configSpec = configSpec;
    }

}
