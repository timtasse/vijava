package com.vmware.vim25;

/**
 * The VirtualNVDIMMBackingInfo data object type defines information about a resource that backs a device in a virtual machine.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualNVDIMMBackingInfo extends VirtualDeviceFileBackingInfo {

    private String changeId;
    private VirtualNVDIMMBackingInfo parent;

    @Override
    public String toString() {
        return "VirtualNVDIMMBackingInfo{" +
                "changeId='" + changeId + '\'' +
                ", parent=" + parent +
                "} " + super.toString();
    }

    public String getChangeId() {
        return changeId;
    }

    public void setChangeId(final String changeId) {
        this.changeId = changeId;
    }

    public VirtualNVDIMMBackingInfo getParent() {
        return parent;
    }

    public void setParent(final VirtualNVDIMMBackingInfo parent) {
        this.parent = parent;
    }

}
