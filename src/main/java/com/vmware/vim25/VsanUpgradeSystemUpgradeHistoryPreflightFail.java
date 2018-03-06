package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VsanUpgradeSystemUpgradeHistoryPreflightFail extends VsanUpgradeSystemUpgradeHistoryItem {

    public VsanUpgradeSystemPreflightCheckResult preflightResult;

    public VsanUpgradeSystemPreflightCheckResult getPreflightResult() {
        return preflightResult;
    }

    public void setPreflightResult(final VsanUpgradeSystemPreflightCheckResult preflightResult) {
        this.preflightResult = preflightResult;
    }
}
