package com.vmware.vim25;

import java.util.Arrays;

/**
 * This data object is a key-value pair whose key is the virtual storage object id, and value is the vm association information.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VStorageObjectAssociations extends DynamicData {

    private LocalizedMethodFault fault;
    private ID id;
    private VStorageObjectAssociationsVmDiskAssociations[] vmDiskAssociations;

    @Override
    public String toString() {
        return "VStorageObjectAssociations{" +
                "fault=" + fault +
                ", id=" + id +
                ", vmDiskAssociations=" + Arrays.toString(vmDiskAssociations) +
                "} " + super.toString();
    }

    public LocalizedMethodFault getFault() {
        return fault;
    }

    public void setFault(final LocalizedMethodFault fault) {
        this.fault = fault;
    }

    public ID getId() {
        return id;
    }

    public void setId(final ID id) {
        this.id = id;
    }

    public VStorageObjectAssociationsVmDiskAssociations[] getVmDiskAssociations() {
        return vmDiskAssociations;
    }

    public void setVmDiskAssociations(final VStorageObjectAssociationsVmDiskAssociations[] vmDiskAssociations) {
        this.vmDiskAssociations = vmDiskAssociations;
    }

}
