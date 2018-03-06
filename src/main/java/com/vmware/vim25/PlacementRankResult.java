package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class PlacementRankResult extends DynamicData {

    public ManagedObjectReference candidate;
    public LocalizedMethodFault[] faults;
    public String key;
    public long reservedSpaceMB;
    public long totalSpaceMB;
    public long usedSpaceMB;
    public double utilization;

    public ManagedObjectReference getCandidate() {
        return candidate;
    }

    public void setCandidate(final ManagedObjectReference candidate) {
        this.candidate = candidate;
    }

    public LocalizedMethodFault[] getFaults() {
        return faults;
    }

    public void setFaults(final LocalizedMethodFault[] faults) {
        this.faults = faults;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public long getReservedSpaceMB() {
        return reservedSpaceMB;
    }

    public void setReservedSpaceMB(final long reservedSpaceMB) {
        this.reservedSpaceMB = reservedSpaceMB;
    }

    public long getTotalSpaceMB() {
        return totalSpaceMB;
    }

    public void setTotalSpaceMB(final long totalSpaceMB) {
        this.totalSpaceMB = totalSpaceMB;
    }

    public long getUsedSpaceMB() {
        return usedSpaceMB;
    }

    public void setUsedSpaceMB(final long usedSpaceMB) {
        this.usedSpaceMB = usedSpaceMB;
    }

    public double getUtilization() {
        return utilization;
    }

    public void setUtilization(final double utilization) {
        this.utilization = utilization;
    }
}
