package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue extends VsanUpgradeSystemPreflightCheckIssue {

    public String[] uuids;

    public String[] getUuids() {
        return uuids;
    }

    public void setUuids(final String[] uuids) {
        this.uuids = uuids;
    }
}
