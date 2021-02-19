package com.vmware.vim25;

/**
 * The result of an InstantClone InitiateSource task. Contains the timestamp value at the time of different operations.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostVMotionManagerSrcInstantCloneResult extends DynamicData {

    private Long startTime;
    private Long quiesceTime;
    private Long quiesceDoneTime;
    private Long resumeDoneTime;
    private Long endTime;

    @Override
    public String toString() {
        return "HostVMotionManagerSrcInstantCloneResult{" +
                "startTime=" + startTime +
                ", quiesceTime=" + quiesceTime +
                ", quiesceDoneTime=" + quiesceDoneTime +
                ", resumeDoneTime=" + resumeDoneTime +
                ", endTime=" + endTime +
                "} " + super.toString();
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(final Long startTime) {
        this.startTime = startTime;
    }

    public Long getQuiesceTime() {
        return quiesceTime;
    }

    public void setQuiesceTime(final Long quiesceTime) {
        this.quiesceTime = quiesceTime;
    }

    public Long getQuiesceDoneTime() {
        return quiesceDoneTime;
    }

    public void setQuiesceDoneTime(final Long quiesceDoneTime) {
        this.quiesceDoneTime = quiesceDoneTime;
    }

    public Long getResumeDoneTime() {
        return resumeDoneTime;
    }

    public void setResumeDoneTime(final Long resumeDoneTime) {
        this.resumeDoneTime = resumeDoneTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(final Long endTime) {
        this.endTime = endTime;
    }

}
