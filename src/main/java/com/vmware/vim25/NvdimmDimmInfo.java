package com.vmware.vim25;

import java.util.Arrays;

/**
 * Get detailed information of a nvdimm
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class NvdimmDimmInfo extends DynamicData {

    private long availablePersistentCapacity;
    private long availableVolatileCapacity;
    private long blockCapacity;
    private int  dimmHandle;
    private NvdimmHealthInfo healthInfo;
    private long persistentCapacity;
    private NvdimmRegionInfo[] regionInfo;
    private String representationString;
    private long totalCapacity;
    private long volatileCapacity;

    @Override
    public String toString() {
        return "NvdimmDimmInfo{" +
                "availablePersistentCapacity=" + availablePersistentCapacity +
                ", availableVolatileCapacity=" + availableVolatileCapacity +
                ", blockCapacity=" + blockCapacity +
                ", dimmHandle=" + dimmHandle +
                ", healthInfo=" + healthInfo +
                ", persistentCapacity=" + persistentCapacity +
                ", regionInfo=" + Arrays.toString(regionInfo) +
                ", representationString='" + representationString + '\'' +
                ", totalCapacity=" + totalCapacity +
                ", volatileCapacity=" + volatileCapacity +
                "} " + super.toString();
    }

    public long getAvailablePersistentCapacity() {
        return availablePersistentCapacity;
    }

    public void setAvailablePersistentCapacity(final long availablePersistentCapacity) {
        this.availablePersistentCapacity = availablePersistentCapacity;
    }

    public long getAvailableVolatileCapacity() {
        return availableVolatileCapacity;
    }

    public void setAvailableVolatileCapacity(final long availableVolatileCapacity) {
        this.availableVolatileCapacity = availableVolatileCapacity;
    }

    public long getBlockCapacity() {
        return blockCapacity;
    }

    public void setBlockCapacity(final long blockCapacity) {
        this.blockCapacity = blockCapacity;
    }

    public int getDimmHandle() {
        return dimmHandle;
    }

    public void setDimmHandle(final int dimmHandle) {
        this.dimmHandle = dimmHandle;
    }

    public NvdimmHealthInfo getHealthInfo() {
        return healthInfo;
    }

    public void setHealthInfo(final NvdimmHealthInfo healthInfo) {
        this.healthInfo = healthInfo;
    }

    public long getPersistentCapacity() {
        return persistentCapacity;
    }

    public void setPersistentCapacity(final long persistentCapacity) {
        this.persistentCapacity = persistentCapacity;
    }

    public NvdimmRegionInfo[] getRegionInfo() {
        return regionInfo;
    }

    public void setRegionInfo(final NvdimmRegionInfo[] regionInfo) {
        this.regionInfo = regionInfo;
    }

    public String getRepresentationString() {
        return representationString;
    }

    public void setRepresentationString(final String representationString) {
        this.representationString = representationString;
    }

    public long getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(final long totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public long getVolatileCapacity() {
        return volatileCapacity;
    }

    public void setVolatileCapacity(final long volatileCapacity) {
        this.volatileCapacity = volatileCapacity;
    }

}
