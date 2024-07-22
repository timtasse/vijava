package com.vmware.vim25;

import java.util.Collections;
import java.util.List;

/**
 * Description of a PCI vendor device group device.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualMachineVendorDeviceGroupInfo extends VirtualMachineTargetInfo {

    private String deviceGroupName;
    private String deviceGroupDescription;
    private List<VirtualMachineVendorDeviceGroupInfoComponentDeviceInfo> componentDeviceInfo = Collections.emptyList();

    @Override
    public String toString() {
        return "VirtualMachineVendorDeviceGroupInfo{" +
                "deviceGroupName='" + deviceGroupName + '\'' +
                ", deviceGroupDescription='" + deviceGroupDescription + '\'' +
                ", componentDeviceInfo=" + componentDeviceInfo +
                '}';
    }

    public String getDeviceGroupName() {
        return deviceGroupName;
    }

    public void setDeviceGroupName(final String deviceGroupName) {
        this.deviceGroupName = deviceGroupName;
    }

    public String getDeviceGroupDescription() {
        return deviceGroupDescription;
    }

    public void setDeviceGroupDescription(final String deviceGroupDescription) {
        this.deviceGroupDescription = deviceGroupDescription;
    }

    public List<VirtualMachineVendorDeviceGroupInfoComponentDeviceInfo> getComponentDeviceInfo() {
        return componentDeviceInfo;
    }

    public void setComponentDeviceInfo(final List<VirtualMachineVendorDeviceGroupInfoComponentDeviceInfo> componentDeviceInfo) {
        this.componentDeviceInfo = componentDeviceInfo;
    }

}
