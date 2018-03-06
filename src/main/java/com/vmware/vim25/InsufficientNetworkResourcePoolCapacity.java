package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class InsufficientNetworkResourcePoolCapacity extends InsufficientResourcesFault {

    public long available;
    public String[] device;
    public String dvsName;
    public String dvsUuid;
    public long requested;
    public String resourcePoolKey;

    public long getAvailable() {
        return available;
    }

    public void setAvailable(final long available) {
        this.available = available;
    }

    public String[] getDevice() {
        return device;
    }

    public void setDevice(final String[] device) {
        this.device = device;
    }

    public String getDvsName() {
        return dvsName;
    }

    public void setDvsName(final String dvsName) {
        this.dvsName = dvsName;
    }

    public String getDvsUuid() {
        return dvsUuid;
    }

    public void setDvsUuid(final String dvsUuid) {
        this.dvsUuid = dvsUuid;
    }

    public long getRequested() {
        return requested;
    }

    public void setRequested(final long requested) {
        this.requested = requested;
    }

    public String getResourcePoolKey() {
        return resourcePoolKey;
    }

    public void setResourcePoolKey(final String resourcePoolKey) {
        this.resourcePoolKey = resourcePoolKey;
    }
}
