package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo extends DynamicData {

    public boolean storageAPDSupported;
    public boolean storagePDLSupported;

    public boolean isStorageAPDSupported() {
        return storageAPDSupported;
    }

    public void setStorageAPDSupported(final boolean storageAPDSupported) {
        this.storageAPDSupported = storageAPDSupported;
    }

    public boolean isStoragePDLSupported() {
        return storagePDLSupported;
    }

    public void setStoragePDLSupported(final boolean storagePDLSupported) {
        this.storagePDLSupported = storagePDLSupported;
    }
}
