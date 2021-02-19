package com.vmware.vim25;

import java.util.Arrays;

/**
 * The VirtualPCIPassthrough.DynamicBackingInfo data object type contains information about the backing
 * that maps the virtual device onto a physical device for a Dynamic DirectPath device.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualPCIPassthroughDynamicBackingInfo extends VirtualDeviceDeviceBackingInfo {

    private VirtualPCIPassthroughAllowedDevice[] allowedDevice;
    private String customLabel;
    private String assignedId;

    @Override
    public String toString() {
        return "VirtualPCIPassthroughDynamicBackingInfo{" +
                "allowedDevice=" + Arrays.toString(allowedDevice) +
                ", customLabel='" + customLabel + '\'' +
                ", assignedId='" + assignedId + '\'' +
                "} " + super.toString();
    }

    public VirtualPCIPassthroughAllowedDevice[] getAllowedDevice() {
        return allowedDevice;
    }

    public void setAllowedDevice(final VirtualPCIPassthroughAllowedDevice[] allowedDevice) {
        this.allowedDevice = allowedDevice;
    }

    public String getCustomLabel() {
        return customLabel;
    }

    public void setCustomLabel(final String customLabel) {
        this.customLabel = customLabel;
    }

    public String getAssignedId() {
        return assignedId;
    }

    public void setAssignedId(final String assignedId) {
        this.assignedId = assignedId;
    }

}
