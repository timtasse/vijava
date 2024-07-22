package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 2.0
 */
@SuppressWarnings("unused")
public class VirtualMachineVirtualDeviceGroupsDeviceGroup extends DynamicData {

    private int groupInstanceKey;
    private Description deviceInfo;

    @Override
    public String toString() {
        return "VirtualMachineVirtualDeviceGroupsDeviceGroup{" +
                "groupInstanceKey=" + groupInstanceKey +
                ", deviceInfo=" + deviceInfo +
                '}';
    }

    public int getGroupInstanceKey() {
        return groupInstanceKey;
    }

    public void setGroupInstanceKey(final int groupInstanceKey) {
        this.groupInstanceKey = groupInstanceKey;
    }

    public Description getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(final Description deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

}
