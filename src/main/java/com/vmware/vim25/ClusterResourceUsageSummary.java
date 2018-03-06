package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class ClusterResourceUsageSummary extends DynamicData {

    public int cpuCapacityMHz;
    public int cpuUsedMHz;
    public int memCapacityMB;
    public int memUsedMB;
    public long storageCapacityMB;
    public long storageUsedMB;

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
}
