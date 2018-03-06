package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public enum VMwareDVSVspanSessionEncapType {

    erspan2("erspan2"),
    erspan3("erspan3"),
    gre("gre");

    private final String val;

    VMwareDVSVspanSessionEncapType(final String val) {
        this.val = val;
    }

    public String getVal() {
        return this.val;
    }
}