package com.vmware.vim25;

/**
 * Arguments for creating a persistent memory mode namespace
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class NvdimmPMemNamespaceCreateSpec extends DynamicData {

    private String friendlyName;
    private int interleavesetID;
    private long size;

    @Override
    public String toString() {
        return "NvdimmPMemNamespaceCreateSpec{" +
                "friendlyName='" + friendlyName + '\'' +
                ", interleavesetID=" + interleavesetID +
                ", size=" + size +
                "} " + super.toString();
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public int getInterleavesetID() {
        return interleavesetID;
    }

    public void setInterleavesetID(final int interleavesetID) {
        this.interleavesetID = interleavesetID;
    }

    public long getSize() {
        return size;
    }

    public void setSize(final long size) {
        this.size = size;
    }
}
