package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class PassiveNodeNetworkSpec extends NodeNetworkSpec {

    public CustomizationIPSettings failoverIpSettings;

    public CustomizationIPSettings getFailoverIpSettings() {
        return failoverIpSettings;
    }

    public void setFailoverIpSettings(final CustomizationIPSettings failoverIpSettings) {
        this.failoverIpSettings = failoverIpSettings;
    }
}
