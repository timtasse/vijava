package com.vmware.vim25;

/**
 * HostConfigurationProfile describes the configuration of services and settings which gets applied on every host in the HCI cluster.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceHostConfigurationProfile extends DynamicData {

    private HostDateTimeConfig dateTimeConfig;
    private HostLockdownMode lockdownMode;

    @Override
    public String toString() {
        return "ClusterComputeResourceHostConfigurationProfile{" +
                "dateTimeConfig=" + dateTimeConfig +
                ", lockdownMode=" + lockdownMode +
                "} " + super.toString();
    }

    public HostDateTimeConfig getDateTimeConfig() {
        return dateTimeConfig;
    }

    public void setDateTimeConfig(final HostDateTimeConfig dateTimeConfig) {
        this.dateTimeConfig = dateTimeConfig;
    }

    public HostLockdownMode getLockdownMode() {
        return lockdownMode;
    }

    public void setLockdownMode(final HostLockdownMode lockdownMode) {
        this.lockdownMode = lockdownMode;
    }
}
