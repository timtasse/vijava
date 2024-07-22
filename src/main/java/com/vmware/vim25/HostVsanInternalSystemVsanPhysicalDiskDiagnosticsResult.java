package com.vmware.vim25;

/**
 * Result structure for a VSAN Physical Disk Diagnostics run. Specifies the result of a single disk.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0.0
 */
@SuppressWarnings("unused")
public class HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult {

    private String diskUuid;
    private boolean success;
    private String failureReason;

    @Override
    public String toString() {
        return "HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult{" +
                "diskUuid='" + diskUuid + '\'' +
                ", success=" + success +
                ", failureReason='" + failureReason + '\'' +
                '}';
    }

    public String getDiskUuid() {
        return diskUuid;
    }

    public void setDiskUuid(final String diskUuid) {
        this.diskUuid = diskUuid;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(final boolean success) {
        this.success = success;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(final String failureReason) {
        this.failureReason = failureReason;
    }

}
