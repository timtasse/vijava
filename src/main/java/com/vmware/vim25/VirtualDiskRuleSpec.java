package com.vmware.vim25;

import java.util.Arrays;

/**
 * The set of virtual disks that are currently disabled
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualDiskRuleSpec extends ClusterRuleInfo {

    private String diskRuleType;
    private int[] diskId;

    @Override
    public String toString() {
        return "VirtualDiskRuleSpec{" +
                "diskId=" + Arrays.toString(diskId) +
                ", diskRuleType='" + diskRuleType + '\'' +
                "} " + super.toString();
    }

    public int[] getDiskId() {
        return diskId;
    }

    public void setDiskId(final int[] diskId) {
        this.diskId = diskId;
    }

    public String getDiskRuleType() {
        return diskRuleType;
    }

    public void setDiskRuleType(final String diskRuleType) {
        this.diskRuleType = diskRuleType;
    }

}
