package com.vmware.vim25;

import java.util.Calendar;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostCertificateManagerCertificateInfo extends DynamicData {

    public String issuer;
    public Calendar notAfter;
    public Calendar notBefore;
    public String status;
    public String subject;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }
}
