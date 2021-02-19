package com.vmware.vim25;

/**
 * This data object represents a Remote Direct Memory Access device as seen by the primary operating system.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostRdmaDevice extends DynamicData {

    private String key;
    private String device;
    private String driver;
    private String description;
    private HostRdmaDeviceBacking backing;
    private HostRdmaDeviceConnectionInfo connectionInfo;
    private HostRdmaDeviceCapability capability;

    @Override
    public String toString() {
        return "HostRdmaDevice{" +
                "key='" + key + '\'' +
                ", device='" + device + '\'' +
                ", driver='" + driver + '\'' +
                ", description='" + description + '\'' +
                ", backing=" + backing +
                ", connectionInfo=" + connectionInfo +
                ", capability=" + capability +
                "} " + super.toString();
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(final String device) {
        this.device = device;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public HostRdmaDeviceBacking getBacking() {
        return backing;
    }

    public void setBacking(final HostRdmaDeviceBacking backing) {
        this.backing = backing;
    }

    public HostRdmaDeviceConnectionInfo getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(final HostRdmaDeviceConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    public HostRdmaDeviceCapability getCapability() {
        return capability;
    }

    public void setCapability(final HostRdmaDeviceCapability capability) {
        this.capability = capability;
    }

}
