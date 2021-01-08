package com.vmware.vim25;

/**
 * This class contains cpu, memory and storage usage information at cluster level.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.0
 */
public class ClusterResourceUsageSummary extends DynamicData {

    private int cpuCapacityMHz;
    private int cpuUsedMHz;
    private int memCapacityMB;
    private int memUsedMB;
    private Long pMemAvailableMB;
    private Long pMemCapacityMB;
    private long storageCapacityMB;
    private long storageUsedMB;

    @Override
    public String toString() {
        return "ClusterResourceUsageSummary{" +
                "cpuCapacityMHz=" + cpuCapacityMHz +
                ", cpuUsedMHz=" + cpuUsedMHz +
                ", memCapacityMB=" + memCapacityMB +
                ", memUsedMB=" + memUsedMB +
                ", pMemAvailableMB=" + pMemAvailableMB +
                ", pMemCapacityMB=" + pMemCapacityMB +
                ", storageCapacityMB=" + storageCapacityMB +
                ", storageUsedMB=" + storageUsedMB +
                "} " + super.toString();
    }

    public int getCpuCapacityMHz() {
        return cpuCapacityMHz;
    }

    public void setCpuCapacityMHz(final int cpuCapacityMHz) {
        this.cpuCapacityMHz = cpuCapacityMHz;
    }

    public int getCpuUsedMHz() {
        return cpuUsedMHz;
    }

    public void setCpuUsedMHz(final int cpuUsedMHz) {
        this.cpuUsedMHz = cpuUsedMHz;
    }

    public int getMemCapacityMB() {
        return memCapacityMB;
    }

    public void setMemCapacityMB(final int memCapacityMB) {
        this.memCapacityMB = memCapacityMB;
    }

    public int getMemUsedMB() {
        return memUsedMB;
    }

    public void setMemUsedMB(final int memUsedMB) {
        this.memUsedMB = memUsedMB;
    }

    public long getStorageCapacityMB() {
        return storageCapacityMB;
    }

    public void setStorageCapacityMB(final long storageCapacityMB) {
        this.storageCapacityMB = storageCapacityMB;
    }

    public long getStorageUsedMB() {
        return storageUsedMB;
    }

    public void setStorageUsedMB(final long storageUsedMB) {
        this.storageUsedMB = storageUsedMB;
    }

    public Long getpMemAvailableMB() {
        return pMemAvailableMB;
    }

    public void setpMemAvailableMB(final Long pMemAvailableMB) {
        this.pMemAvailableMB = pMemAvailableMB;
    }

    public Long getpMemCapacityMB() {
        return pMemCapacityMB;
    }

    public void setpMemCapacityMB(final Long pMemCapacityMB) {
        this.pMemCapacityMB = pMemCapacityMB;
    }
}
