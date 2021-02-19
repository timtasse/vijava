package com.vmware.vim25;

/**
 * The result of an InstantClone task. Contains the dest VM id and timestamp values at the time of different operations.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostVMotionManagerDstInstantCloneResult extends DynamicData {

    private Integer dstVmId;
    private Long startTime;
    private Long cptLoadTime;
    private Long cptLoadDoneTime;
    private Long replicateMemDoneTime;
    private Long endTime;
    private Long cptXferTime;
    private Long cptCacheUsed;
    private Long devCptStreamSize;
    private Long devCptStreamTime;

    @Override
    public String toString() {
        return "HostVMotionManagerDstInstantCloneResult{" +
                "dstVmId=" + dstVmId +
                ", startTime=" + startTime +
                ", cptLoadTime=" + cptLoadTime +
                ", cptLoadDoneTime=" + cptLoadDoneTime +
                ", replicateMemDoneTime=" + replicateMemDoneTime +
                ", endTime=" + endTime +
                ", cptXferTime=" + cptXferTime +
                ", cptCacheUsed=" + cptCacheUsed +
                ", devCptStreamSize=" + devCptStreamSize +
                ", devCptStreamTime=" + devCptStreamTime +
                "} " + super.toString();
    }

    public Integer getDstVmId() {
        return dstVmId;
    }

    public void setDstVmId(final Integer dstVmId) {
        this.dstVmId = dstVmId;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(final Long startTime) {
        this.startTime = startTime;
    }

    public Long getCptLoadTime() {
        return cptLoadTime;
    }

    public void setCptLoadTime(final Long cptLoadTime) {
        this.cptLoadTime = cptLoadTime;
    }

    public Long getCptLoadDoneTime() {
        return cptLoadDoneTime;
    }

    public void setCptLoadDoneTime(final Long cptLoadDoneTime) {
        this.cptLoadDoneTime = cptLoadDoneTime;
    }

    public Long getReplicateMemDoneTime() {
        return replicateMemDoneTime;
    }

    public void setReplicateMemDoneTime(final Long replicateMemDoneTime) {
        this.replicateMemDoneTime = replicateMemDoneTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(final Long endTime) {
        this.endTime = endTime;
    }

    public Long getCptXferTime() {
        return cptXferTime;
    }

    public void setCptXferTime(final Long cptXferTime) {
        this.cptXferTime = cptXferTime;
    }

    public Long getCptCacheUsed() {
        return cptCacheUsed;
    }

    public void setCptCacheUsed(final Long cptCacheUsed) {
        this.cptCacheUsed = cptCacheUsed;
    }

    public Long getDevCptStreamSize() {
        return devCptStreamSize;
    }

    public void setDevCptStreamSize(final Long devCptStreamSize) {
        this.devCptStreamSize = devCptStreamSize;
    }

    public Long getDevCptStreamTime() {
        return devCptStreamTime;
    }

    public void setDevCptStreamTime(final Long devCptStreamTime) {
        this.devCptStreamTime = devCptStreamTime;
    }

}
