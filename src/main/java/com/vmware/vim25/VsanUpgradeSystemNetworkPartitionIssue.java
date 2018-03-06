package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VsanUpgradeSystemNetworkPartitionIssue extends VsanUpgradeSystemPreflightCheckIssue {

    public VsanUpgradeSystemNetworkPartitionInfo[] partitions;

    public VsanUpgradeSystemNetworkPartitionInfo[] getPartitions() {
        return partitions;
    }

    public void setPartitions(final VsanUpgradeSystemNetworkPartitionInfo[] partitions) {
        this.partitions = partitions;
    }
}
