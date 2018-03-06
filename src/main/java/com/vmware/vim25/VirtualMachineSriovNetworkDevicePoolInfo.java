package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VirtualMachineSriovNetworkDevicePoolInfo extends VirtualMachineSriovDevicePoolInfo {

    public String switchKey;
    public String switchUuid;

    public String getSwitchKey() {
        return switchKey;
    }

    public void setSwitchKey(final String switchKey) {
        this.switchKey = switchKey;
    }

    public String getSwitchUuid() {
        return switchUuid;
    }

    public void setSwitchUuid(final String switchUuid) {
        this.switchUuid = switchUuid;
    }
}
