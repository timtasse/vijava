package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public enum DistributedVirtualSwitchNetworkResourceControlVersion {

    version2("version2"),
    version3("version3");

    private final String val;

    DistributedVirtualSwitchNetworkResourceControlVersion(final String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
