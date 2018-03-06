package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class CryptoManagerKmipClusterStatus extends DynamicData {

    public CryptoManagerKmipCertificateInfo clientCertInfo;
    public KeyProviderId clusterId;
    public CryptoManagerKmipServerStatus[] servers;

    public CryptoManagerKmipCertificateInfo getClientCertInfo() {
        return clientCertInfo;
    }

    public void setClientCertInfo(final CryptoManagerKmipCertificateInfo clientCertInfo) {
        this.clientCertInfo = clientCertInfo;
    }

    public KeyProviderId getClusterId() {
        return clusterId;
    }

    public void setClusterId(final KeyProviderId clusterId) {
        this.clusterId = clusterId;
    }

    public CryptoManagerKmipServerStatus[] getServers() {
        return servers;
    }

    public void setServers(final CryptoManagerKmipServerStatus[] servers) {
        this.servers = servers;
    }
}
