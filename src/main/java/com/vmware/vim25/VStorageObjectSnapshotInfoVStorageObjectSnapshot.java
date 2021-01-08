package com.vmware.vim25;

import java.util.Calendar;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VStorageObjectSnapshotInfoVStorageObjectSnapshot extends DynamicData {

    private String backingObjectId;
    private Calendar createTime;
    private String description;
    private ID id;

    @Override
    public String toString() {
        return "VStorageObjectSnapshotInfoVStorageObjectSnapshot{" +
                "backingObjectId='" + backingObjectId + '\'' +
                ", createTime=" + createTime +
                ", description='" + description + '\'' +
                ", id=" + id +
                "} " + super.toString();
    }

    public String getBackingObjectId() {
        return backingObjectId;
    }

    public void setBackingObjectId(final String backingObjectId) {
        this.backingObjectId = backingObjectId;
    }

    public Calendar getCreateTime() {
        return createTime;
    }

    public void setCreateTime(final Calendar createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public ID getId() {
        return id;
    }

    public void setId(final ID id) {
        this.id = id;
    }

}
