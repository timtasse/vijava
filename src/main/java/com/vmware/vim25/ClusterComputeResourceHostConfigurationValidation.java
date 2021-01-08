package com.vmware.vim25;

/**
 * Describes the validations applicable to the settings on the host.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceHostConfigurationValidation extends ClusterComputeResourceValidationResultBase {

    private ManagedObjectReference host;
    private Boolean isDvsSettingValid;
    private Boolean isLockdownModeValid;
    private Boolean isNtpSettingValid;
    private Boolean isVmknicSettingValid;

    @Override
    public String toString() {
        return "ClusterComputeResourceHostConfigurationValidation{" +
                "host=" + host +
                ", isDvsSettingValid=" + isDvsSettingValid +
                ", isLockdownModeValid=" + isLockdownModeValid +
                ", isNtpSettingValid=" + isNtpSettingValid +
                ", isVmknicSettingValid=" + isVmknicSettingValid +
                "} " + super.toString();
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public Boolean getDvsSettingValid() {
        return isDvsSettingValid;
    }

    public void setDvsSettingValid(final Boolean dvsSettingValid) {
        isDvsSettingValid = dvsSettingValid;
    }

    public Boolean getLockdownModeValid() {
        return isLockdownModeValid;
    }

    public void setLockdownModeValid(final Boolean lockdownModeValid) {
        isLockdownModeValid = lockdownModeValid;
    }

    public Boolean getNtpSettingValid() {
        return isNtpSettingValid;
    }

    public void setNtpSettingValid(final Boolean ntpSettingValid) {
        isNtpSettingValid = ntpSettingValid;
    }

    public Boolean getVmknicSettingValid() {
        return isVmknicSettingValid;
    }

    public void setVmknicSettingValid(final Boolean vmknicSettingValid) {
        isVmknicSettingValid = vmknicSettingValid;
    }
}
