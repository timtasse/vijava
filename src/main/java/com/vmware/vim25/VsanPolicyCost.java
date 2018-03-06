package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 02.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VsanPolicyCost extends DynamicData {

    public Long changeDataSize;
    public Long changeFlashReadCacheSize;
    public Long copyDataSize;
    public Long currentDataSize;
    public Float currentDiskSpaceToAddressSpaceRatio;
    public Long currentFlashReadCacheSize;
    public Float diskSpaceToAddressSpaceRatio;
    public Long tempDataSize;

    public Long getChangeDataSize() {
        return changeDataSize;
    }

    public void setChangeDataSize(final Long changeDataSize) {
        this.changeDataSize = changeDataSize;
    }

    public Long getChangeFlashReadCacheSize() {
        return changeFlashReadCacheSize;
    }

    public void setChangeFlashReadCacheSize(final Long changeFlashReadCacheSize) {
        this.changeFlashReadCacheSize = changeFlashReadCacheSize;
    }

    public Long getCopyDataSize() {
        return copyDataSize;
    }

    public void setCopyDataSize(final Long copyDataSize) {
        this.copyDataSize = copyDataSize;
    }

    public Long getCurrentDataSize() {
        return currentDataSize;
    }

    public void setCurrentDataSize(final Long currentDataSize) {
        this.currentDataSize = currentDataSize;
    }

    public Float getCurrentDiskSpaceToAddressSpaceRatio() {
        return currentDiskSpaceToAddressSpaceRatio;
    }

    public void setCurrentDiskSpaceToAddressSpaceRatio(final Float currentDiskSpaceToAddressSpaceRatio) {
        this.currentDiskSpaceToAddressSpaceRatio = currentDiskSpaceToAddressSpaceRatio;
    }

    public Long getCurrentFlashReadCacheSize() {
        return currentFlashReadCacheSize;
    }

    public void setCurrentFlashReadCacheSize(final Long currentFlashReadCacheSize) {
        this.currentFlashReadCacheSize = currentFlashReadCacheSize;
    }

    public Float getDiskSpaceToAddressSpaceRatio() {
        return diskSpaceToAddressSpaceRatio;
    }

    public void setDiskSpaceToAddressSpaceRatio(final Float diskSpaceToAddressSpaceRatio) {
        this.diskSpaceToAddressSpaceRatio = diskSpaceToAddressSpaceRatio;
    }

    public Long getTempDataSize() {
        return tempDataSize;
    }

    public void setTempDataSize(final Long tempDataSize) {
        this.tempDataSize = tempDataSize;
    }
}
