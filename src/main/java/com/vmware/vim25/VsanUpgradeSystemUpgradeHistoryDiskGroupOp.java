package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VsanUpgradeSystemUpgradeHistoryDiskGroupOp extends VsanUpgradeSystemUpgradeHistoryItem {

    public VsanHostDiskMapping diskMapping;
    public String operation;

    public VsanHostDiskMapping getDiskMapping() {
        return diskMapping;
    }

    public void setDiskMapping(final VsanHostDiskMapping diskMapping) {
        this.diskMapping = diskMapping;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(final String operation) {
        this.operation = operation;
    }
}
