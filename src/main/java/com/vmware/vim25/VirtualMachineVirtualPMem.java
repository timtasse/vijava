package com.vmware.vim25;

/**
 * Virtual Persistent Memory configuration for the VM.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class VirtualMachineVirtualPMem extends DynamicData {

    private VirtualMachineVirtualPMemSnapshotMode snapshotMode;

    @Override
    public String toString() {
        return "VirtualMachineVirtualPMem{" +
                "snapshotMode=" + snapshotMode +
                "} " + super.toString();
    }

    public VirtualMachineVirtualPMemSnapshotMode getSnapshotMode() {
        return snapshotMode;
    }

    public void setSnapshotMode(final VirtualMachineVirtualPMemSnapshotMode snapshotMode) {
        this.snapshotMode = snapshotMode;
    }

}
