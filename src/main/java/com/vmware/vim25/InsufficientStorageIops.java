package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class InsufficientStorageIops extends VimFault {

    public String datastoreName;
    public long requestedIops;
    public long unreservedIops;

    public String getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(final String datastoreName) {
        this.datastoreName = datastoreName;
    }

    public long getRequestedIops() {
        return requestedIops;
    }

    public void setRequestedIops(final long requestedIops) {
        this.requestedIops = requestedIops;
    }

    public long getUnreservedIops() {
        return unreservedIops;
    }

    public void setUnreservedIops(final long unreservedIops) {
        this.unreservedIops = unreservedIops;
    }
}
