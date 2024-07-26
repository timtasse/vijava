package com.vmware.vim25;

import java.util.Calendar;

/**
 * This data object is used to encapsulate the X509 certificate metadata
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 * @version 8.0.1
 */
public class HostCertificateManagerCertificateInfo extends DynamicData {

    private HostCertificateManagerCertificateKind kind;
    private String issuer;
    private Calendar notBefore;
    private Calendar notAfter;
    private String subject;
    private HostCertificateManagerCertificateInfoCertificateStatus status;

    @Override
    public String toString() {
        return "HostCertificateManagerCertificateInfo{" +
                "kind=" + kind +
                ", issuer='" + issuer + '\'' +
                ", notBefore=" + notBefore +
                ", notAfter=" + notAfter +
                ", subject='" + subject + '\'' +
                ", status=" + status +
                '}';
    }

    public HostCertificateManagerCertificateKind getKind() {
        return kind;
    }

    public void setKind(final HostCertificateManagerCertificateKind kind) {
        this.kind = kind;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(final String issuer) {
        this.issuer = issuer;
    }

    public Calendar getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(final Calendar notAfter) {
        this.notAfter = notAfter;
    }

    public Calendar getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(final Calendar notBefore) {
        this.notBefore = notBefore;
    }

    public HostCertificateManagerCertificateInfoCertificateStatus getStatus() {
        return status;
    }

    public void setStatus(final HostCertificateManagerCertificateInfoCertificateStatus status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

}
