package com.vmware.vim25;

/**
 * The Virtual NVDIMM device.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualNVDIMM extends VirtualDevice {

    private long capacityInMB;
    private Long configuredCapacityInMB;

    @Override
    public String toString() {
        return "VirtualNVDIMM{" +
                "capacityInMB=" + capacityInMB +
                ", configuredCapacityInMB=" + configuredCapacityInMB +
                '}';
    }

    public long getCapacityInMB() {
        return capacityInMB;
    }

    public void setCapacityInMB(final long capacityInMB) {
        this.capacityInMB = capacityInMB;
    }

    public Long getConfiguredCapacityInMB() {
        return configuredCapacityInMB;
    }

    public void setConfiguredCapacityInMB(final Long configuredCapacityInMB) {
        this.configuredCapacityInMB = configuredCapacityInMB;
    }

}
