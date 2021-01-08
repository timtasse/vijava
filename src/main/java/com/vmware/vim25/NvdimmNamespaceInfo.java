package com.vmware.vim25;

/**
 * Detailed information about a particular namespace.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class NvdimmNamespaceInfo extends DynamicData {

    private long blockCount;
    private long blockSize;
    private String friendlyName;
    private int locationID;
    private String namespaceHealthStatus;
    private String state;
    private String type;
    private String uuid;

    @Override
    public String toString() {
        return "NvdimmNamespaceInfo{" +
                "blockCount=" + blockCount +
                ", blockSize=" + blockSize +
                ", friendlyName='" + friendlyName + '\'' +
                ", locationID=" + locationID +
                ", namespaceHealthStatus='" + namespaceHealthStatus + '\'' +
                ", state='" + state + '\'' +
                ", type='" + type + '\'' +
                ", uuid='" + uuid + '\'' +
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

    public String getNamespaceHealthStatus() {
        return namespaceHealthStatus;
    }

    public void setNamespaceHealthStatus(final String namespaceHealthStatus) {
        this.namespaceHealthStatus = namespaceHealthStatus;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

}
