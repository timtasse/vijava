package com.vmware.vim25;

/**
 * Data object indicating a device instance has been allocated to a VM.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostAssignableHardwareBinding extends DynamicData {

    private String instanceId;
    private ManagedObjectReference vm;

    @Override
    public String toString() {
        return "HostAssignableHardwareBinding{" +
                "instanceId='" + instanceId + '\'' +
                ", vm=" + vm +
                "} " + super.toString();
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(final String instanceId) {
        this.instanceId = instanceId;
    }

    public ManagedObjectReference getVm() {
        return vm;
    }

    public void setVm(final ManagedObjectReference vm) {
        this.vm = vm;
    }

}
