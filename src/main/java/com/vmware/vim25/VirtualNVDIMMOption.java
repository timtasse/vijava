package com.vmware.vim25;

/**
 * The VirtualNVDIMMOption contains information about a virtual NVDIMM capacity limits and rules for capacity growth operations.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualNVDIMMOption extends VirtualDeviceOption {

    private LongOption capacityInMB;
    private long granularityInMB;
    private boolean growable;
    private boolean hotGrowable;

    @Override
    public String toString() {
        return "VirtualNVDIMMOption{" +
                "capacityInMB=" + capacityInMB +
                ", granularityInMB=" + granularityInMB +
                ", growable=" + growable +
                ", hotGrowable=" + hotGrowable +
                "} " + super.toString();
    }

    public LongOption getCapacityInMB() {
        return capacityInMB;
    }

    public void setCapacityInMB(final LongOption capacityInMB) {
        this.capacityInMB = capacityInMB;
    }

    public long getGranularityInMB() {
        return granularityInMB;
    }

    public void setGranularityInMB(final long granularityInMB) {
        this.granularityInMB = granularityInMB;
    }

    public boolean isGrowable() {
        return growable;
    }

    public void setGrowable(final boolean growable) {
        this.growable = growable;
    }

    public boolean isHotGrowable() {
        return hotGrowable;
    }

    public void setHotGrowable(final boolean hotGrowable) {
        this.hotGrowable = hotGrowable;
    }

}
