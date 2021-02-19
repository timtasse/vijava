package com.vmware.vim25;

/**
 * Information about the KMIP server certificate.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class CryptoManagerKmipServerCertInfo extends DynamicData {

    private String certificate;
    private CryptoManagerKmipCertificateInfo certInfo;
    private Boolean clientTrustServer;

    @Override
    public String toString() {
        return "CryptoManagerKmipServerCertInfo{" +
                "certificate='" + certificate + '\'' +
                ", certInfo=" + certInfo +
                ", clientTrustServer=" + clientTrustServer +
                "} " + super.toString();
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(final String certificate) {
        this.certificate = certificate;
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
}
