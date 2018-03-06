package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VsanUpgradeSystemPreflightCheckResult extends DynamicData {

    public VsanHostDiskMapping diskMappingToRestore;
    public VsanUpgradeSystemPreflightCheckIssue[] issues;

    public VsanHostDiskMapping getDiskMappingToRestore() {
        return diskMappingToRestore;
    }

    public void setDiskMappingToRestore(final VsanHostDiskMapping diskMappingToRestore) {
        this.diskMappingToRestore = diskMappingToRestore;
    }

    public VsanUpgradeSystemPreflightCheckIssue[] getIssues() {
        return issues;
    }

    public void setIssues(final VsanUpgradeSystemPreflightCheckIssue[] issues) {
        this.issues = issues;
    }
}
