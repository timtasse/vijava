package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class FaultToleranceVMConfigSpec extends DynamicData {

    public ManagedObjectReference vmConfig;
    public FaultToleranceDiskSpec[] disks;

    public FaultToleranceDiskSpec[] getDisks() {
        return disks;
    }

    public void setDisks(final FaultToleranceDiskSpec[] disks) {
        this.disks = disks;
    }

    public ManagedObjectReference getVmConfig() {
        return vmConfig;
    }

    public void setVmConfig(final ManagedObjectReference vmConfig) {
        this.vmConfig = vmConfig;
    }
}
