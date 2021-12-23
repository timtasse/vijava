package com.vmware.vim25;

import java.util.Calendar;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.2
 */
public class GuestInfoCustomizationInfo extends DynamicData {

    private String customizationStatus;
    private Calendar startTime;
    private Calendar endTime;
    private String errorMsg;

    @Override
    public String toString() {
        return "GuestInfoCustomizationInfo{" +
                "customizationStatus='" + customizationStatus + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    public String getCustomizationStatus() {
        return customizationStatus;
    }

    public void setCustomizationStatus(final String customizationStatus) {
        this.customizationStatus = customizationStatus;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public void setStartTime(final Calendar startTime) {
        this.startTime = startTime;
    }

    public Calendar getEndTime() {
        return endTime;
    }

    public void setEndTime(final Calendar endTime) {
        this.endTime = endTime;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(final String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
