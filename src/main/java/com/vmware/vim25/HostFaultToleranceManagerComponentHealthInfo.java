package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostFaultToleranceManagerComponentHealthInfo extends DynamicData {

    public boolean isNetworkHealthy;
    public boolean isStorageHealthy;

    public boolean isNetworkHealthy() {
        return isNetworkHealthy;
    }

    public void setNetworkHealthy(final boolean networkHealthy) {
        isNetworkHealthy = networkHealthy;
    }

    public boolean isStorageHealthy() {
        return isStorageHealthy;
    }

    public void setStorageHealthy(final boolean storageHealthy) {
        isStorageHealthy = storageHealthy;
    }
}
