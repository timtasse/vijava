package com.vmware.vim25;

/**
 * Arguments for creating a namespace
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class NvdimmNamespaceCreateSpec extends DynamicData {

    private long blockCount;
    private long blockSize;
    private String friendlyName;
    private int locationID;
    private String type;

    @Override
    public String toString() {
        return "NvdimmNamespaceCreateSpec{" +
                "blockCount=" + blockCount +
                ", blockSize=" + blockSize +
                ", friendlyName='" + friendlyName + '\'' +
                ", locationID=" + locationID +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }

    public long getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(final long blockCount) {
        this.blockCount = blockCount;
    }

    public long getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(final long blockSize) {
        this.blockSize = blockSize;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(final int locationID) {
        this.locationID = locationID;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

}
