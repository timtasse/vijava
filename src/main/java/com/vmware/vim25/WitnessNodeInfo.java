package com.vmware.vim25;

/**
 * The WitnessNodeInfo class defines configuration information for the Witness node in the cluster
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class WitnessNodeInfo extends DynamicData {

    private CustomizationIPSettings ipSettings;
    private String biosUuid;

    public String getBiosUuid() {
        return biosUuid;
    }

    public void setBiosUuid(final String biosUuid) {
        this.biosUuid = biosUuid;
    }

    public CustomizationIPSettings getIpSettings() {
        return ipSettings;
    }

    public void setIpSettings(final CustomizationIPSettings ipSettings) {
        this.ipSettings = ipSettings;
    }
}
