package com.vmware.vim25;

import java.util.Arrays;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class FolderBatchAddStandaloneHostsResult extends DynamicData {

    private ManagedObjectReference[] addedHosts;
    private FolderFailedHostResult[] hostsFailedInventoryAdd;

    @Override
    public String toString() {
        return "FolderBatchAddStandaloneHostsResult{" +
                "addedHosts=" + Arrays.toString(addedHosts) +
                ", hostsFailedInventoryAdd=" + Arrays.toString(hostsFailedInventoryAdd) +
                "} " + super.toString();
    }

    public ManagedObjectReference[] getAddedHosts() {
        return addedHosts;
    }

    public void setAddedHosts(final ManagedObjectReference[] addedHosts) {
        this.addedHosts = addedHosts;
    }

    public FolderFailedHostResult[] getHostsFailedInventoryAdd() {
        return hostsFailedInventoryAdd;
    }

    public void setHostsFailedInventoryAdd(final FolderFailedHostResult[] hostsFailedInventoryAdd) {
        this.hostsFailedInventoryAdd = hostsFailedInventoryAdd;
    }
}
