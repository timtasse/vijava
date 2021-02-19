package com.vmware.vim25;

/**
 * The HostMultipathInfoHppLogicalUnitPolicy data object describes a multipathing policy for a HPP claimed logical unit
 * and its configuration.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostMultipathInfoHppLogicalUnitPolicy extends HostMultipathInfoLogicalUnitPolicy {

    private Long bytes;
    private Long iops;
    private String path;
    private Long latencyEvalTime;
    private Long samplingIosPerPath;

    @Override
    public String toString() {
        return "HostMultipathInfoHppLogicalUnitPolicy{" +
                "bytes=" + bytes +
                ", iops=" + iops +
                ", path='" + path + '\'' +
                ", latencyEvalTime=" + latencyEvalTime +
                ", samplingIosPerPath=" + samplingIosPerPath +
                "} " + super.toString();
    }

    public Long getBytes() {
        return bytes;
    }

    public void setBytes(final Long bytes) {
        this.bytes = bytes;
    }

    public Long getIops() {
        return iops;
    }

    public void setIops(final Long iops) {
        this.iops = iops;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public Long getLatencyEvalTime() {
        return latencyEvalTime;
    }

    public void setLatencyEvalTime(final Long latencyEvalTime) {
        this.latencyEvalTime = latencyEvalTime;
    }

    public Long getSamplingIosPerPath() {
        return samplingIosPerPath;
    }

    public void setSamplingIosPerPath(final Long samplingIosPerPath) {
        this.samplingIosPerPath = samplingIosPerPath;
    }

}
