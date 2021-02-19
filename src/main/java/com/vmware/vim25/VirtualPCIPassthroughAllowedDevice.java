package com.vmware.vim25;

/**
 * A tuple of vendorId and deviceId indicating an allowed device for a Dynamic DirectPath device.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualPCIPassthroughAllowedDevice extends DynamicData {

    private int vendorId;
    private int deviceId;
    private Integer subVendorId;
    private Integer subDeviceId;
    private Integer revisionId;

    @Override
    public String toString() {
        return "VirtualPCIPassthroughAllowedDevice{" +
                "vendorId=" + vendorId +
                ", deviceId=" + deviceId +
                ", subVendorId=" + subVendorId +
                ", subDeviceId=" + subDeviceId +
                ", revisionId=" + revisionId +
                "} " + super.toString();
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(final int vendorId) {
        this.vendorId = vendorId;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(final int deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getSubVendorId() {
        return subVendorId;
    }

    public void setSubVendorId(final Integer subVendorId) {
        this.subVendorId = subVendorId;
    }

    public Integer getSubDeviceId() {
        return subDeviceId;
    }

    public void setSubDeviceId(final Integer subDeviceId) {
        this.subDeviceId = subDeviceId;
    }

    public Integer getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(final Integer revisionId) {
        this.revisionId = revisionId;
    }

}
