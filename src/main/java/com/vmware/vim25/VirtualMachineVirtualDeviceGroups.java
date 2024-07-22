package com.vmware.vim25;

import java.util.List;

/**
 * The VirtualDeviceGroups data object type contains information about the backing that maps the virtual device
 * onto a physical device for a Vendor Device Group device.
 * Vendor Device Groups allow third-parties to define collections of devices that must be allocated to a virtual machine as a unit.
 * Typically, this is because the set of devices are related in a some way, e.g. a physical link connects the devices.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualMachineVirtualDeviceGroups extends DynamicData {

    private List<VirtualMachineVirtualDeviceGroupsDeviceGroup> deviceGroup;

    @Override
    public String toString() {
        return "VirtualMachineVirtualDeviceGroups{" +
                "deviceGroup=" + deviceGroup +
                '}';
    }

    public List<VirtualMachineVirtualDeviceGroupsDeviceGroup> getDeviceGroup() {
        return deviceGroup;
    }

    public void setDeviceGroup(final List<VirtualMachineVirtualDeviceGroupsDeviceGroup> deviceGroup) {
        this.deviceGroup = deviceGroup;
    }

}
