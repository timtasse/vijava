package com.vmware.vim25;

import java.util.Calendar;

/**
 * Data object describing SGX host registration information.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class HostSgxRegistrationInfo extends DynamicData {

    private HostSgxRegistrationInfoRegistrationStatus status;
    private Integer biosError;
    private String registrationUrl;
    private HostSgxRegistrationInfoRegistrationType type;
    private String ppid;
    private Calendar lastRegisteredTime;

    @Override
    public String toString() {
        return "HostSgxRegistrationInfo{" +
                "status='" + status + '\'' +
                ", biosError=" + biosError +
                ", registrationUrl='" + registrationUrl + '\'' +
                ", type='" + type + '\'' +
                ", ppid='" + ppid + '\'' +
                ", lastRegisteredTime=" + lastRegisteredTime +
                '}';
    }

    public HostSgxRegistrationInfoRegistrationStatus getStatus() {
        return status;
    }

    public void setStatus(final HostSgxRegistrationInfoRegistrationStatus status) {
        this.status = status;
    }

    public Integer getBiosError() {
        return biosError;
    }

    public void setBiosError(final Integer biosError) {
        this.biosError = biosError;
    }

    public String getRegistrationUrl() {
        return registrationUrl;
    }

    public void setRegistrationUrl(final String registrationUrl) {
        this.registrationUrl = registrationUrl;
    }

    public HostSgxRegistrationInfoRegistrationType getType() {
        return type;
    }

    public void setType(final HostSgxRegistrationInfoRegistrationType type) {
        this.type = type;
    }

    public String getPpid() {
        return ppid;
    }

    public void setPpid(final String ppid) {
        this.ppid = ppid;
    }

    public Calendar getLastRegisteredTime() {
        return lastRegisteredTime;
    }

    public void setLastRegisteredTime(final Calendar lastRegisteredTime) {
        this.lastRegisteredTime = lastRegisteredTime;
    }

}
