package com.vmware.vim25;

/**
 * Represents connection information for the RDMA device.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostRdmaDeviceConnectionInfo extends DynamicData {

    private String state;
    private int mtu;
    private int speedInMbps;

    @Override
    public String toString() {
        return "HostRdmaDeviceConnectionInfo{" +
                "state='" + state + '\'' +
                ", mtu=" + mtu +
                ", speedInMbps=" + speedInMbps +
                "} " + super.toString();
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public int getMtu() {
        return mtu;
    }

    public void setMtu(final int mtu) {
        this.mtu = mtu;
    }

    public int getSpeedInMbps() {
        return speedInMbps;
    }

    public void setSpeedInMbps(final int speedInMbps) {
        this.speedInMbps = speedInMbps;
    }

}
