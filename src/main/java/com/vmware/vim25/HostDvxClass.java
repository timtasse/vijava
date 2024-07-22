package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class HostDvxClass extends DynamicData {

    private String deviceClass;
    private boolean checkpointSupported;
    private boolean swDMATracingSupported;
    private boolean sriovNic;

    @Override
    public String toString() {
        return "HostDvxClass{" +
                "deviceClass='" + deviceClass + '\'' +
                ", checkpointSupported=" + checkpointSupported +
                ", swDMATracingSupported=" + swDMATracingSupported +
                ", sriovNic=" + sriovNic +
                '}';
    }

    public String getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(final String deviceClass) {
        this.deviceClass = deviceClass;
    }

    public boolean isCheckpointSupported() {
        return checkpointSupported;
    }

    public void setCheckpointSupported(final boolean checkpointSupported) {
        this.checkpointSupported = checkpointSupported;
    }

    public boolean isSwDMATracingSupported() {
        return swDMATracingSupported;
    }

    public void setSwDMATracingSupported(final boolean swDMATracingSupported) {
        this.swDMATracingSupported = swDMATracingSupported;
    }

    public boolean isSriovNic() {
        return sriovNic;
    }

    public void setSriovNic(final boolean sriovNic) {
        this.sriovNic = sriovNic;
    }

}
