package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public enum GuestRegKeyWowSpec {

    WOW32("WOW32"),
    WOW64("WOW64"),
    WOWNative("WOWNative");

    private String val;

    GuestRegKeyWowSpec(final String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
