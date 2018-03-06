package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 02.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class HostSriovNetworkDevicePoolInfo extends HostSriovDevicePoolInfo {

    public PhysicalNic[] pnic;
    public String switchKey;
    public String switchUuid;

    public PhysicalNic[] getPnic() {
        return pnic;
    }

    public void setPnic(final PhysicalNic[] pnic) {
        this.pnic = pnic;
    }

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
