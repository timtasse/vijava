package com.vmware.vim25;

/**
 * VirtualDeviceDeviceGroupInfo contains information about the device group device is assigned to.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualDeviceDeviceGroupInfo extends DynamicData {

    private int groupInstanceKey;
    private int sequenceId;

    @Override
    public String toString() {
        return "VirtualDeviceDeviceGroupInfo{" +
                "groupInstanceKey=" + groupInstanceKey +
                ", sequenceId=" + sequenceId +
                '}';
    }

    public int getGroupInstanceKey() {
        return groupInstanceKey;
    }

    public void setGroupInstanceKey(final int groupInstanceKey) {
        this.groupInstanceKey = groupInstanceKey;
    }

    public int getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(final int sequenceId) {
        this.sequenceId = sequenceId;
    }

}
