package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class KmipClusterInfo extends DynamicData {

    public KeyProviderId clusterId;
    public KmipServerInfo[] servers;
    public boolean useAsDefault;

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
}
