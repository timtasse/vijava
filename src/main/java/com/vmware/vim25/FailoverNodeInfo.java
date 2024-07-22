package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class FailoverNodeInfo extends DynamicData {

    private CustomizationIPSettings clusterIpSettings;
    private CustomizationIPSettings failoverIp;
    private String biosUuid;

    public String getBiosUuid() {
        return biosUuid;
    }

    public void setBiosUuid(final String biosUuid) {
        this.biosUuid = biosUuid;
    }

    public CustomizationIPSettings getClusterIpSettings() {
        return clusterIpSettings;
    }

    public void setClusterIpSettings(final CustomizationIPSettings clusterIpSettings) {
        this.clusterIpSettings = clusterIpSettings;
    }

    public CustomizationIPSettings getFailoverIp() {
        return failoverIp;
    }

    public void setFailoverIp(final CustomizationIPSettings failoverIp) {
        this.failoverIp = failoverIp;
    }
}
