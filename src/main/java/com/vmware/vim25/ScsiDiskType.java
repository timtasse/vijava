package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.5
 */
public enum ScsiDiskType {

    emulated512("emulated512"),
    native4k("native4k"),
    native512("native512"),
    SoftwareEmulated4k("SoftwareEmulated4k"),
    unknown("unknown");

    private final String val;

    ScsiDiskType(final String val) {
        this.val = val;
    }

    public String getVal() {
        return this.val;
    }
}