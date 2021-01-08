package com.vmware.vim25;

/**
 * Detailed information about a particular namespace.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class NvdimmNamespaceDetails extends DynamicData {

    private String friendlyName;
    private int interleavesetID;
    private String namespaceHealthStatus;
    private long size;
    private String state;
    private String type;
    private String uuid;

    @Override
    public String toString() {
        return "NvdimmNamespaceDetails{" +
                "friendlyName='" + friendlyName + '\'' +
                ", interleavesetID=" + interleavesetID +
                ", namespaceHealthStatus='" + namespaceHealthStatus + '\'' +
                ", size=" + size +
                ", state='" + state + '\'' +
                ", type='" + type + '\'' +
                ", uuid='" + uuid + '\'' +
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

    public String getNamespaceHealthStatus() {
        return namespaceHealthStatus;
    }

    public void setNamespaceHealthStatus(final String namespaceHealthStatus) {
        this.namespaceHealthStatus = namespaceHealthStatus;
    }

    public long getSize() {
        return size;
    }

    public void setSize(final long size) {
        this.size = size;
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
