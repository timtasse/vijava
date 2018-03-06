package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VsanUpgradeSystemNotEnoughFreeCapacityIssue extends VsanUpgradeSystemPreflightCheckIssue {

    public boolean reducedRedundancyUpgradePossible;

    public boolean isReducedRedundancyUpgradePossible() {
        return reducedRedundancyUpgradePossible;
    }

    public void setReducedRedundancyUpgradePossible(final boolean reducedRedundancyUpgradePossible) {
        this.reducedRedundancyUpgradePossible = reducedRedundancyUpgradePossible;
    }
}
