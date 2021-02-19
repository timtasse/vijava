package com.vmware.vim25;

/**
 * Information for file backing of a virtual storage object. File backing is mainly used for virtual disks.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 * @since 6.5
 */
public class BaseConfigInfoFileBackingInfo extends BaseConfigInfoBackingInfo {

    private String filePath;
    private String backingObjectId;
    private BaseConfigInfoFileBackingInfo parent;
    private Long deltaSizeInMB;
    private CryptoKeyId keyId;

    @Override
    public String toString() {
        return "BaseConfigInfoFileBackingInfo{" +
                "filePath='" + filePath + '\'' +
                ", backingObjectId='" + backingObjectId + '\'' +
                ", parent=" + parent +
                ", deltaSizeInMB=" + deltaSizeInMB +
                ", keyId=" + keyId +
                "} " + super.toString();
    }

    public String getBackingObjectId() {
        return backingObjectId;
    }

    public void setBackingObjectId(final String backingObjectId) {
        this.backingObjectId = backingObjectId;
    }

    public Long getDeltaSizeInMB() {
        return deltaSizeInMB;
    }

    public void setDeltaSizeInMB(final Long deltaSizeInMB) {
        this.deltaSizeInMB = deltaSizeInMB;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(final String filePath) {
        this.filePath = filePath;
    }

    public BaseConfigInfoFileBackingInfo getParent() {
        return parent;
    }

    public void setParent(final BaseConfigInfoFileBackingInfo parent) {
        this.parent = parent;
    }

    public CryptoKeyId getKeyId() {
        return keyId;
    }

    public void setKeyId(final CryptoKeyId keyId) {
        this.keyId = keyId;
    }

}
