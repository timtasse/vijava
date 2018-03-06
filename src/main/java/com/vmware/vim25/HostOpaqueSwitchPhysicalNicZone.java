package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostOpaqueSwitchPhysicalNicZone extends DynamicData {

    public String key;
    public String[] pnicDevice;

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String[] getPnicDevice() {
        return pnicDevice;
    }

    public void setPnicDevice(final String[] pnicDevice) {
        this.pnicDevice = pnicDevice;
    }
}
