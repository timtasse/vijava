package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class CryptoManagerKmipServerCertInfo extends DynamicData {

    public String certificate;
    public CryptoManagerKmipCertificateInfo certInfo;
    public Boolean clientTrustServer;

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
