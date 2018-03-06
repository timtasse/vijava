package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 * @version 6.5
 */
public enum HostNasVolumeSecurityType {

    AUTH_SYS("AUTH_SYS"),
    SEC_KRB5("SEC_KRB5"),
    SEC_KRB5I("SEC_KRB5I");

    private final String val;

    HostNasVolumeSecurityType(final String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
