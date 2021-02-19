package com.vmware.vim25;

/**
 * Description of a Dynamic DirectPath PCI device.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualMachineDynamicPassthroughInfo extends VirtualMachineTargetInfo {

    private String vendorName;
    private String deviceName;
    private String customLabel;
    private int vendorId;
    private int deviceId;

    @Override
    public String toString() {
        return "VirtualMachineDynamicPassthroughInfo{" +
                "vendorName='" + vendorName + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", customLabel='" + customLabel + '\'' +
                ", vendorId=" + vendorId +
                ", deviceId=" + deviceId +
                "} " + super.toString();
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(final String vendorName) {
        this.vendorName = vendorName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(final String deviceName) {
        this.deviceName = deviceName;
    }

    public String getCustomLabel() {
        return customLabel;
    }

    public void setCustomLabel(final String customLabel) {
        this.customLabel = customLabel;
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

}
