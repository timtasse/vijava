package com.vmware.vim25;

/**
 * Configuration of a PTP port, a logical entity providing an interface to the network for sending and receiving PTP messages with timestamping.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class HostPtpConfigPtpPort extends DynamicData {

    private int index;
    private HostPtpConfigDeviceType deviceType;
    private String device;
    private HostIpConfig ipConfig;

    @Override
    public String toString() {
        return "HostPtpConfigPtpPort{" +
                "index=" + index +
                ", deviceType=" + deviceType +
                ", device='" + device + '\'' +
                ", ipConfig=" + ipConfig +
                "} " + super.toString();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(final int index) {
        this.index = index;
    }

    public HostPtpConfigDeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(final HostPtpConfigDeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(final String device) {
        this.device = device;
    }

    public HostIpConfig getIpConfig() {
        return ipConfig;
    }

    public void setIpConfig(final HostIpConfig ipConfig) {
        this.ipConfig = ipConfig;
    }

}
