package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class NodeNetworkSpec extends DynamicData {

    public CustomizationIPSettings ipSettings;

    public CustomizationIPSettings getIpSettings() {
        return ipSettings;
    }

    public void setIpSettings(final CustomizationIPSettings ipSettings) {
        this.ipSettings = ipSettings;
    }
}
