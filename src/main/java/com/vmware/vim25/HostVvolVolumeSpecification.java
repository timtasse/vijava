package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostVvolVolumeSpecification extends DynamicData {

    public long maxSizeInMB;
    public VASAStorageArray[] storageArray;
    public String uuid;
    public VimVasaProviderInfo[] vasaProviderInfo;
    public String volumeName;

    public long getMaxSizeInMB() {
        return maxSizeInMB;
    }

    public void setMaxSizeInMB(final long maxSizeInMB) {
        this.maxSizeInMB = maxSizeInMB;
    }

    public VASAStorageArray[] getStorageArray() {
        return storageArray;
    }

    public void setStorageArray(final VASAStorageArray[] storageArray) {
        this.storageArray = storageArray;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public VimVasaProviderInfo[] getVasaProviderInfo() {
        return vasaProviderInfo;
    }

    public void setVasaProviderInfo(final VimVasaProviderInfo[] vasaProviderInfo) {
        this.vasaProviderInfo = vasaProviderInfo;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(final String volumeName) {
        this.volumeName = volumeName;
    }
}
