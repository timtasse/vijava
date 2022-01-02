package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class VirtualMachineQuickStatsMemoryTierStats extends DynamicData {

    private HostMemoryTierType memoryTierType;
    private long readBandwidth;

    @Override
    public String toString() {
        return "VirtualMachineQuickStatsMemoryTierStats{" +
                "memoryTierType=" + memoryTierType +
                ", readBandwidth=" + readBandwidth +
                "} " + super.toString();
    }

    public HostMemoryTierType getMemoryTierType() {
        return memoryTierType;
    }

    public void setMemoryTierType(final HostMemoryTierType memoryTierType) {
        this.memoryTierType = memoryTierType;
    }

    public long getReadBandwidth() {
        return readBandwidth;
    }

    public void setReadBandwidth(final long readBandwidth) {
        this.readBandwidth = readBandwidth;
    }

}
