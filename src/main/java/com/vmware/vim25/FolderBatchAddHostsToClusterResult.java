package com.vmware.vim25;

import java.util.Arrays;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class FolderBatchAddHostsToClusterResult extends DynamicData {

    private ManagedObjectReference[] hostsAddedToCluster;
    private FolderFailedHostResult[] hostsFailedInventoryAdd;
    private FolderFailedHostResult[] hostsFailedMoveToCluster;

    @Override
    public String toString() {
        return "FolderBatchAddHostsToClusterResult{" +
                "hostsAddedToCluster=" + Arrays.toString(hostsAddedToCluster) +
                ", hostsFailedInventoryAdd=" + Arrays.toString(hostsFailedInventoryAdd) +
                ", hostsFailedMoveToCluster=" + Arrays.toString(hostsFailedMoveToCluster) +
                "} " + super.toString();
    }

    public ManagedObjectReference[] getHostsAddedToCluster() {
        return hostsAddedToCluster;
    }

    public void setHostsAddedToCluster(final ManagedObjectReference[] hostsAddedToCluster) {
        this.hostsAddedToCluster = hostsAddedToCluster;
    }

    public FolderFailedHostResult[] getHostsFailedInventoryAdd() {
        return hostsFailedInventoryAdd;
    }

    public void setHostsFailedInventoryAdd(final FolderFailedHostResult[] hostsFailedInventoryAdd) {
        this.hostsFailedInventoryAdd = hostsFailedInventoryAdd;
    }

    public FolderFailedHostResult[] getHostsFailedMoveToCluster() {
        return hostsFailedMoveToCluster;
    }

    public void setHostsFailedMoveToCluster(final FolderFailedHostResult[] hostsFailedMoveToCluster) {
        this.hostsFailedMoveToCluster = hostsFailedMoveToCluster;
    }
}
