package com.vmware.vim25;

/**
 * The VirtualPrecisionClockSystemClockBackingInfo data object contains information about
 * using host system clock as the backing reference clock for this virtual device.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualPrecisionClockSystemClockBackingInfo extends VirtualDeviceBackingInfo {

    private String protocol;

    @Override
    public String toString() {
        return "VirtualPrecisionClockSystemClockBackingInfo{" +
                "protocol='" + protocol + '\'' +
                "} " + super.toString();
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }

}
