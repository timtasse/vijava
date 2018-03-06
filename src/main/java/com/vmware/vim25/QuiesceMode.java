package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public enum QuiesceMode {

    application("application"),
    filesystem("filesystem"),
    none("none");

    private final String val;

    QuiesceMode(final String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
