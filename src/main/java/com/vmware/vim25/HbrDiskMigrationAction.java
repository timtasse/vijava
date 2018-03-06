package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HbrDiskMigrationAction extends ClusterAction {

    public String collectionId;
    public String collectionName;
    public ManagedObjectReference destination;
    public String[] diskIds;
    public Float ioLatencyDstBefore;
    public Float ioLatencySrcBefore;
    public long sizeTransferred;
    public ManagedObjectReference source;
    public Float spaceUtilDstAfter;
    public Float spaceUtilDstBefore;
    public Float spaceUtilSrcAfter;
    public Float spaceUtilSrcBefore;

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(final String collectionId) {
        this.collectionId = collectionId;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(final String collectionName) {
        this.collectionName = collectionName;
    }

    public ManagedObjectReference getDestination() {
        return destination;
    }

    public void setDestination(final ManagedObjectReference destination) {
        this.destination = destination;
    }

    public String[] getDiskIds() {
        return diskIds;
    }

    public void setDiskIds(final String[] diskIds) {
        this.diskIds = diskIds;
    }

    public float getIoLatencyDstBefore() {
        return ioLatencyDstBefore;
    }

    public void setIoLatencyDstBefore(final float ioLatencyDstBefore) {
        this.ioLatencyDstBefore = ioLatencyDstBefore;
    }

    public float getIoLatencySrcBefore() {
        return ioLatencySrcBefore;
    }

    public void setIoLatencySrcBefore(final float ioLatencySrcBefore) {
        this.ioLatencySrcBefore = ioLatencySrcBefore;
    }

    public long getSizeTransferred() {
        return sizeTransferred;
    }

    public void setSizeTransferred(final long sizeTransferred) {
        this.sizeTransferred = sizeTransferred;
    }

    public ManagedObjectReference getSource() {
        return source;
    }

    public void setSource(final ManagedObjectReference source) {
        this.source = source;
    }

    public float getSpaceUtilDstAfter() {
        return spaceUtilDstAfter;
    }

    public void setSpaceUtilDstAfter(final float spaceUtilDstAfter) {
        this.spaceUtilDstAfter = spaceUtilDstAfter;
    }

    public float getSpaceUtilDstBefore() {
        return spaceUtilDstBefore;
    }

    public void setSpaceUtilDstBefore(final float spaceUtilDstBefore) {
        this.spaceUtilDstBefore = spaceUtilDstBefore;
    }

    public float getSpaceUtilSrcAfter() {
        return spaceUtilSrcAfter;
    }

    public void setSpaceUtilSrcAfter(final float spaceUtilSrcAfter) {
        this.spaceUtilSrcAfter = spaceUtilSrcAfter;
    }

    public float getSpaceUtilSrcBefore() {
        return spaceUtilSrcBefore;
    }

    public void setSpaceUtilSrcBefore(final float spaceUtilSrcBefore) {
        this.spaceUtilSrcBefore = spaceUtilSrcBefore;
    }
}
