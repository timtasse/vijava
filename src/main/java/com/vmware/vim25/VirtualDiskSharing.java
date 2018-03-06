package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public enum VirtualDiskSharing {

    sharingMultiWriter("sharingMultiWriter"),
    sharingNone("sharingNone");

    private final String val;

    VirtualDiskSharing(final String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
