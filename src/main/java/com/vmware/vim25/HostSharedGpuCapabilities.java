package com.vmware.vim25;

/**
 * Capability vector indicating the available shared graphics features.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class HostSharedGpuCapabilities extends DynamicData {

    private boolean diskSnapshotSupported;
    private boolean memorySnapshotSupported;
    private boolean migrateSupported;
    private boolean suspendSupported;
    private String  vgpu;

    @Override
    public String toString() {
        return "HostSharedGpuCapabilities{" +
                "diskSnapshotSupported=" + diskSnapshotSupported +
                ", memorySnapshotSupported=" + memorySnapshotSupported +
                ", migrateSupported=" + migrateSupported +
                ", suspendSupported=" + suspendSupported +
                ", vgpu='" + vgpu + '\'' +
                "} " + super.toString();
    }

    public boolean isDiskSnapshotSupported() {
        return diskSnapshotSupported;
    }

    public void setDiskSnapshotSupported(final boolean diskSnapshotSupported) {
        this.diskSnapshotSupported = diskSnapshotSupported;
    }

    public boolean isMemorySnapshotSupported() {
        return memorySnapshotSupported;
    }

    public void setMemorySnapshotSupported(final boolean memorySnapshotSupported) {
        this.memorySnapshotSupported = memorySnapshotSupported;
    }

    public boolean isMigrateSupported() {
        return migrateSupported;
    }

    public void setMigrateSupported(final boolean migrateSupported) {
        this.migrateSupported = migrateSupported;
    }

    public boolean isSuspendSupported() {
        return suspendSupported;
    }

    public void setSuspendSupported(final boolean suspendSupported) {
        this.suspendSupported = suspendSupported;
    }

    public String getVgpu() {
        return vgpu;
    }

    public void setVgpu(final String vgpu) {
        this.vgpu = vgpu;
    }

}
