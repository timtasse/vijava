package com.vmware.vim25;

/**
 * Class describing a component device within this vendor device group.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualMachineVendorDeviceGroupInfoComponentDeviceInfo extends DynamicData {

    private String type;
    private String vendorName;
    private String deviceName;
    private boolean isConfigurable;
    private VirtualDevice device;

    @Override
    public String toString() {
        return "VirtualMachineVendorDeviceGroupInfoComponentDeviceInfo{" +
                "type='" + type + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", isConfigurable=" + isConfigurable +
                ", device=" + device +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
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

    public boolean isConfigurable() {
        return isConfigurable;
    }

    public void setConfigurable(final boolean configurable) {
        isConfigurable = configurable;
    }

    public VirtualDevice getDevice() {
        return device;
    }

    public void setDevice(final VirtualDevice device) {
        this.device = device;
    }

}
