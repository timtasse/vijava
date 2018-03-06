package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class PlacementAction extends ClusterAction {

    public VirtualMachineRelocateSpec relocateSpec;
    public ManagedObjectReference targetHost;
    public ManagedObjectReference vm;

    public VirtualMachineRelocateSpec getRelocateSpec() {
        return relocateSpec;
    }

    public void setRelocateSpec(final VirtualMachineRelocateSpec relocateSpec) {
        this.relocateSpec = relocateSpec;
    }

    public ManagedObjectReference getTargetHost() {
        return targetHost;
    }

    public void setTargetHost(final ManagedObjectReference targetHost) {
        this.targetHost = targetHost;
    }

    public ManagedObjectReference getVm() {
        return vm;
    }

    public void setVm(final ManagedObjectReference vm) {
        this.vm = vm;
    }
}
