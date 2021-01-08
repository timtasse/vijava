package com.vmware.vim25;

/**
 * This data object type contains the available options when backing a virtualdisk using persistent memory.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualDiskLocalPMemBackingOption extends VirtualDeviceFileBackingOption {

    private ChoiceOption diskMode;
    private boolean growable;
    private boolean hotGrowable;
    private boolean uuid;

    @Override
    public String toString() {
        return "VirtualDiskLocalPMemBackingOption{" +
                "diskMode=" + diskMode +
                ", growable=" + growable +
                ", hotGrowable=" + hotGrowable +
                ", uuid=" + uuid +
                "} " + super.toString();
    }

    public ChoiceOption getDiskMode() {
        return diskMode;
    }

    public void setDiskMode(final ChoiceOption diskMode) {
        this.diskMode = diskMode;
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

    public boolean isUuid() {
        return uuid;
    }

    public void setUuid(final boolean uuid) {
        this.uuid = uuid;
    }

}
