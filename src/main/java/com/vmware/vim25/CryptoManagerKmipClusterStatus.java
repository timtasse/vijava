package com.vmware.vim25;

import java.util.Arrays;

/**
 * Status of a KMIP cluster.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 * @since 6.5
 */
public class CryptoManagerKmipClusterStatus extends DynamicData {

    private KeyProviderId clusterId;
    private ManagedEntityStatus overallStatus;
    private String managementType;
    private CryptoManagerKmipServerStatus[] servers;
    private CryptoManagerKmipCertificateInfo clientCertInfo;

    @Override
    public String toString() {
        return "CryptoManagerKmipClusterStatus{" +
                "clusterId=" + clusterId +
                ", overallStatus=" + overallStatus +
                ", managementType='" + managementType + '\'' +
                ", servers=" + Arrays.toString(servers) +
                ", clientCertInfo=" + clientCertInfo +
                "} " + super.toString();
    }

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

    public ManagedEntityStatus getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(final ManagedEntityStatus overallStatus) {
        this.overallStatus = overallStatus;
    }

    public String getManagementType() {
        return managementType;
    }

    public void setManagementType(final String managementType) {
        this.managementType = managementType;
    }

}
