package com.vmware.vim25;

/**
 * Host Hardware information about configured and available persistent memory on a host.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class HostPersistentMemoryInfo extends DynamicData {

    private Long   capacityInMB;
    private String volumeUUID;

    @Override
    public String toString() {
        return "HostPersistentMemoryInfo{" +
                "capacityInMB=" + capacityInMB +
                ", volumeUUID='" + volumeUUID + '\'' +
                "} " + super.toString();
    }

    public Long getCapacityInMB() {
        return capacityInMB;
    }

    public void setCapacityInMB(final Long capacityInMB) {
        this.capacityInMB = capacityInMB;
    }

    public String getVolumeUUID() {
        return volumeUUID;
    }

    public void setVolumeUUID(final String volumeUUID) {
        this.volumeUUID = volumeUUID;
    }

}
