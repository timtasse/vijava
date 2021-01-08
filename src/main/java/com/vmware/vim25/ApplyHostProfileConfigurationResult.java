package com.vmware.vim25;

import java.util.Arrays;
import java.util.Calendar;

/**
 * The ApplyHostConfigResult data object contains the remediation results for a host: the time that the remediation happens, the status, the errors, and optinal compliance result after reboot.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class ApplyHostProfileConfigurationResult extends DynamicData {

    private Calendar completeTime;
    private LocalizedMethodFault[] errors;
    private ManagedObjectReference host;
    private Calendar startTime;
    private String status;

    @Override
    public String toString() {
        return "ApplyHostProfileConfigurationResult{" +
                "completeTime=" + completeTime +
                ", errors=" + Arrays.toString(errors) +
                ", host=" + host +
                ", startTime=" + startTime +
                ", status='" + status + '\'' +
                "} " + super.toString();
    }

    public Calendar getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(final Calendar completeTime) {
        this.completeTime = completeTime;
    }

    public LocalizedMethodFault[] getErrors() {
        return errors;
    }

    public void setErrors(final LocalizedMethodFault[] errors) {
        this.errors = errors;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public void setStartTime(final Calendar startTime) {
        this.startTime = startTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }
}
