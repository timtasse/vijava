package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class StorageDrsHbrDiskNotMovable extends VimFault {

    public String nonMovableDiskIds;

    public String getNonMovableDiskIds() {
        return nonMovableDiskIds;
    }

    public void setNonMovableDiskIds(final String nonMovableDiskIds) {
        this.nonMovableDiskIds = nonMovableDiskIds;
    }
}
