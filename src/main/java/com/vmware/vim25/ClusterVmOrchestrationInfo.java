package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class ClusterVmOrchestrationInfo extends DynamicData {

    public ManagedObjectReference vm;
    public ClusterVmReadiness vmReadiness;

    public ManagedObjectReference getVm() {
        return vm;
    }

    public void setVm(final ManagedObjectReference vm) {
        this.vm = vm;
    }

    public ClusterVmReadiness getVmReadiness() {
        return vmReadiness;
    }

    public void setVmReadiness(final ClusterVmReadiness vmReadiness) {
        this.vmReadiness = vmReadiness;
    }
}
