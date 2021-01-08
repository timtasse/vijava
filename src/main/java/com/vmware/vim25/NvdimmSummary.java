package com.vmware.vim25;

/**
 * Get summary of nvdimm
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class NvdimmSummary extends DynamicData {

    private long availableCapacity;
    private long blockCapacity;
    private String healthStatus;
    private int numDimms;
    private int numInterleavesets;
    private int numNamespaces;
    private long persistentCapacity;
    private long totalCapacity;

    @Override
    public String toString() {
        return "NvdimmSummary{" +
                "availableCapacity=" + availableCapacity +
                ", blockCapacity=" + blockCapacity +
                ", healthStatus='" + healthStatus + '\'' +
                ", numDimms=" + numDimms +
                ", numInterleavesets=" + numInterleavesets +
                ", numNamespaces=" + numNamespaces +
                ", persistentCapacity=" + persistentCapacity +
                ", totalCapacity=" + totalCapacity +
                "} " + super.toString();
    }

    public long getAvailableCapacity() {
        return availableCapacity;
    }

    public void setAvailableCapacity(final long availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    public long getBlockCapacity() {
        return blockCapacity;
    }

    public void setBlockCapacity(final long blockCapacity) {
        this.blockCapacity = blockCapacity;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(final String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public int getNumDimms() {
        return numDimms;
    }

    public void setNumDimms(final int numDimms) {
        this.numDimms = numDimms;
    }

    public int getNumInterleavesets() {
        return numInterleavesets;
    }

    public void setNumInterleavesets(final int numInterleavesets) {
        this.numInterleavesets = numInterleavesets;
    }

    public int getNumNamespaces() {
        return numNamespaces;
    }

    public void setNumNamespaces(final int numNamespaces) {
        this.numNamespaces = numNamespaces;
    }

    public long getPersistentCapacity() {
        return persistentCapacity;
    }

    public void setPersistentCapacity(final long persistentCapacity) {
        this.persistentCapacity = persistentCapacity;
    }

    public long getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(final long totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

}
