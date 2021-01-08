package com.vmware.vim25;

/**
 * This data object contains infomation of a VM Disk associations.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VStorageObjectAssociationsVmDiskAssociations extends DynamicData {

    private int diskKey;
    private String vmId;

    @Override
    public String toString() {
        return "VStorageObjectAssociationsVmDiskAssociations{" +
                "diskKey=" + diskKey +
                ", vmId='" + vmId + '\'' +
                "} " + super.toString();
    }

    public int getDiskKey() {
        return diskKey;
    }

    public void setDiskKey(final int diskKey) {
        this.diskKey = diskKey;
    }

    public String getVmId() {
        return vmId;
    }

    public void setVmId(final String vmId) {
        this.vmId = vmId;
    }

}
