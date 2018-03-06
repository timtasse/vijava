package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostVvolVolume extends HostFileSystemVolume {

    public VVolHostPE[] hostPE;
    public String scId;
    public VASAStorageArray[] storageArray;
    public VimVasaProviderInfo[] vasaProviderInfo;

    public VVolHostPE[] getHostPE() {
        return hostPE;
    }

    public void setHostPE(final VVolHostPE[] hostPE) {
        this.hostPE = hostPE;
    }

    public String getScId() {
        return scId;
    }

    public void setScId(final String scId) {
        this.scId = scId;
    }

    public VASAStorageArray[] getStorageArray() {
        return storageArray;
    }

    public void setStorageArray(final VASAStorageArray[] storageArray) {
        this.storageArray = storageArray;
    }

    public VimVasaProviderInfo[] getVasaProviderInfo() {
        return vasaProviderInfo;
    }

    public void setVasaProviderInfo(final VimVasaProviderInfo[] vasaProviderInfo) {
        this.vasaProviderInfo = vasaProviderInfo;
    }
}
