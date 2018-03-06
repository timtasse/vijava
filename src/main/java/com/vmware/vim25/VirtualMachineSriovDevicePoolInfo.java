package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VirtualMachineSriovDevicePoolInfo extends DynamicData {

    public String key;

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }
}
