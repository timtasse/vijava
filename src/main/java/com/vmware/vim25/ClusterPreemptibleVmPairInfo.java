package com.vmware.vim25;

/**
 * The ClusterPreemptibleVmPairInfo data object contains the monitored and the preemptible VM pair in a HA-enabled cluster.
 * Monitored virtual machine is a desired protected virtual machine in HA-enabled cluster when it is powered on.
 * Any failures of this VM will continue to be handled by HA based on the VM's settings in cluster.
 * <p>
 * Preemptible virtual machine is the desired protected virtual machine in HA when it is powered on.
 * The lowest restart priority "disabled" ClusterDasVmSettingsRestartPriority will be enforced for the preemptibleVm.
 * A virtual machine can be marked as preemptible irrespective of its powerState but its extra configuration should identify it as preemptible.
 * <p>
 * In case of failure of monitoredVm, the preemptibleVm will be terminated. This will free up any resources associated with preemptibleVm.
 * <p>
 * In case of insufficient resources for failover of any VM in the cluster, the preemptibleVm will be terminated to free up resources.
 * <p>
 * This data object is intended for VMware use and other usage is not supported. This data object will be removed in a future release.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class ClusterPreemptibleVmPairInfo extends DynamicData {

    private Integer id;
    private ManagedObjectReference monitoredVm;
    private ManagedObjectReference preemptibleVm;

    @Override
    public String toString() {
        return "ClusterPreemptibleVmPairInfo{" +
                "id=" + id +
                ", monitoredVm=" + monitoredVm +
                ", preemptibleVm=" + preemptibleVm +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public ManagedObjectReference getMonitoredVm() {
        return monitoredVm;
    }

    public void setMonitoredVm(final ManagedObjectReference monitoredVm) {
        this.monitoredVm = monitoredVm;
    }

    public ManagedObjectReference getPreemptibleVm() {
        return preemptibleVm;
    }

    public void setPreemptibleVm(final ManagedObjectReference preemptibleVm) {
        this.preemptibleVm = preemptibleVm;
    }

}
