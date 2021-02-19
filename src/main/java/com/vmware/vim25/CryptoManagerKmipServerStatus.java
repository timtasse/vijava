package com.vmware.vim25;

/**
 * Status of a KMIP server.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class CryptoManagerKmipServerStatus extends DynamicData {

    private String name;
    private ManagedEntityStatus status;
    private String connectionStatus;
    private CryptoManagerKmipCertificateInfo certInfo;
    private Boolean clientTrustServer;
    private Boolean serverTrustClient;

    @Override
    public String toString() {
        return "CryptoManagerKmipServerStatus{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", connectionStatus='" + connectionStatus + '\'' +
                ", certInfo=" + certInfo +
                ", clientTrustServer=" + clientTrustServer +
                ", serverTrustClient=" + serverTrustClient +
                "} " + super.toString();
    }

    public CryptoManagerKmipCertificateInfo getCertInfo() {
        return certInfo;
    }

    public void setCertInfo(final CryptoManagerKmipCertificateInfo certInfo) {
        this.certInfo = certInfo;
    }

    public Boolean isClientTrustServer() {
        return clientTrustServer;
    }

    public void setClientTrustServer(final Boolean clientTrustServer) {
        this.clientTrustServer = clientTrustServer;
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(final String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean isServerTrustClient() {
        return serverTrustClient;
    }

    public void setServerTrustClient(final Boolean serverTrustClient) {
        this.serverTrustClient = serverTrustClient;
    }

    public ManagedEntityStatus getStatus() {
        return status;
    }

    public void setStatus(final ManagedEntityStatus status) {
        this.status = status;
    }
}
