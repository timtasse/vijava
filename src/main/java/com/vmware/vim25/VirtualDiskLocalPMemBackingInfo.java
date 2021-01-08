package com.vmware.vim25;

/**
 * This data object type contains information about backing a virtual disk using non-volatile memory technologies (persistent memory).
 * Supported for ESX Server 6.5 and later.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualDiskLocalPMemBackingInfo extends VirtualDeviceFileBackingInfo {

    private String contentId;
    private String diskMode;
    private String uuid;
    private String volumeUUID;

    @Override
    public String toString() {
        return "VirtualDiskLocalPMemBackingInfo{" +
                "contentId='" + contentId + '\'' +
                ", diskMode='" + diskMode + '\'' +
                ", uuid='" + uuid + '\'' +
                ", volumeUUID='" + volumeUUID + '\'' +
                "} " + super.toString();
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(final String contentId) {
        this.contentId = contentId;
    }

    public String getDiskMode() {
        return diskMode;
    }

    public void setDiskMode(final String diskMode) {
        this.diskMode = diskMode;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public String getVolumeUUID() {
        return volumeUUID;
    }

    public void setVolumeUUID(final String volumeUUID) {
        this.volumeUUID = volumeUUID;
    }

}
