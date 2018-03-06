package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class ClusterUsageSummary extends DynamicData {

    public int cpuDemandMhz;
    public int cpuEntitledMhz;
    public int cpuReservationMhz;
    public int memDemandMB;
    public int memEntitledMB;
    public int memReservationMB;
    public Integer poweredOffCpuReservationMhz;
    public Integer poweredOffMemReservationMB;
    public int poweredOffVmCount;
    public long statsGenNumber;
    public int totalCpuCapacityMhz;
    public int totalMemCapacityMB;
    public int totalVmCount;

    public int getCpuDemandMhz() {
        return cpuDemandMhz;
    }

    public void setCpuDemandMhz(final int cpuDemandMhz) {
        this.cpuDemandMhz = cpuDemandMhz;
    }

    public int getCpuEntitledMhz() {
        return cpuEntitledMhz;
    }

    public void setCpuEntitledMhz(final int cpuEntitledMhz) {
        this.cpuEntitledMhz = cpuEntitledMhz;
    }

    public int getCpuReservationMhz() {
        return cpuReservationMhz;
    }

    public void setCpuReservationMhz(final int cpuReservationMhz) {
        this.cpuReservationMhz = cpuReservationMhz;
    }

    public int getMemDemandMB() {
        return memDemandMB;
    }

    public void setMemDemandMB(final int memDemandMB) {
        this.memDemandMB = memDemandMB;
    }

    public int getMemEntitledMB() {
        return memEntitledMB;
    }

    public void setMemEntitledMB(final int memEntitledMB) {
        this.memEntitledMB = memEntitledMB;
    }

    public int getMemReservationMB() {
        return memReservationMB;
    }

    public void setMemReservationMB(final int memReservationMB) {
        this.memReservationMB = memReservationMB;
    }

    public int getPoweredOffCpuReservationMhz() {
        return poweredOffCpuReservationMhz;
    }

    public void setPoweredOffCpuReservationMhz(final int poweredOffCpuReservationMhz) {
        this.poweredOffCpuReservationMhz = poweredOffCpuReservationMhz;
    }

    public int getPoweredOffMemReservationMB() {
        return poweredOffMemReservationMB;
    }

    public void setPoweredOffMemReservationMB(final int poweredOffMemReservationMB) {
        this.poweredOffMemReservationMB = poweredOffMemReservationMB;
    }

    public int getPoweredOffVmCount() {
        return poweredOffVmCount;
    }

    public void setPoweredOffVmCount(final int poweredOffVmCount) {
        this.poweredOffVmCount = poweredOffVmCount;
    }

    public long getStatsGenNumber() {
        return statsGenNumber;
    }

    public void setStatsGenNumber(final long statsGenNumber) {
        this.statsGenNumber = statsGenNumber;
    }

    public int getTotalCpuCapacityMhz() {
        return totalCpuCapacityMhz;
    }

    public void setTotalCpuCapacityMhz(final int totalCpuCapacityMhz) {
        this.totalCpuCapacityMhz = totalCpuCapacityMhz;
    }

    public int getTotalMemCapacityMB() {
        return totalMemCapacityMB;
    }

    public void setTotalMemCapacityMB(final int totalMemCapacityMB) {
        this.totalMemCapacityMB = totalMemCapacityMB;
    }

    public int getTotalVmCount() {
        return totalVmCount;
    }

    public void setTotalVmCount(final int totalVmCount) {
        this.totalVmCount = totalVmCount;
    }
}
