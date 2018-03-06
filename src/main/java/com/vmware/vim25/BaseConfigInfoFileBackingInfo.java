package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class BaseConfigInfoFileBackingInfo extends BaseConfigInfoBackingInfo {

    public String backingObjectId;
    public Long deltaSizeInMB;
    public String filePath;
    public BaseConfigInfoFileBackingInfo parent;

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
}
