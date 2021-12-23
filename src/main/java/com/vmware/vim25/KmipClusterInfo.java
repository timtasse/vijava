package com.vmware.vim25;

import java.util.Arrays;

/**
 * Data Object representing a cluster of KMIP servers. All servers in a cluster must provide the same keys.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2
 * @since 6.5
 */
public class KmipClusterInfo extends DynamicData {

    private KeyProviderId clusterId;
    private KmipServerInfo[] servers;
    private boolean useAsDefault;
    private String managementType;
    private ManagedObjectReference[] useAsEntityDefault;
    private Boolean hasBackup;
    private Boolean tpmRequired;
    private String keyId;

    @Override
    public String toString() {
        return "KmipClusterInfo{" +
                "clusterId=" + clusterId +
                ", servers=" + Arrays.toString(servers) +
                ", useAsDefault=" + useAsDefault +
                ", managementType='" + managementType + '\'' +
                ", useAsEntityDefault=" + Arrays.toString(useAsEntityDefault) +
                ", hasBackup=" + hasBackup +
                ", tpmRequired=" + tpmRequired +
                ", keyId='" + keyId + '\'' +
                '}';
    }

    public KeyProviderId getClusterId() {
        return clusterId;
    }

    public void setClusterId(final KeyProviderId clusterId) {
        this.clusterId = clusterId;
    }

    public KmipServerInfo[] getServers() {
        return servers;
    }

    public void setServers(final KmipServerInfo[] servers) {
        this.servers = servers;
    }

    public boolean isUseAsDefault() {
        return useAsDefault;
    }

    public void setUseAsDefault(final boolean useAsDefault) {
        this.useAsDefault = useAsDefault;
    }

    public String getManagementType() {
        return managementType;
    }

    public void setManagementType(final String managementType) {
        this.managementType = managementType;
    }

    public ManagedObjectReference[] getUseAsEntityDefault() {
        return useAsEntityDefault;
    }

    public void setUseAsEntityDefault(final ManagedObjectReference[] useAsEntityDefault) {
        this.useAsEntityDefault = useAsEntityDefault;
    }

    public Boolean getHasBackup() {
        return hasBackup;
    }

    public void setHasBackup(final Boolean hasBackup) {
        this.hasBackup = hasBackup;
    }

    public Boolean getTpmRequired() {
        return tpmRequired;
    }

    public void setTpmRequired(final Boolean tpmRequired) {
        this.tpmRequired = tpmRequired;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(final String keyId) {
        this.keyId = keyId;
    }

}
