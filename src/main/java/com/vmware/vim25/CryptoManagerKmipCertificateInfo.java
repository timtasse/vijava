package com.vmware.vim25;

import java.util.Calendar;

/**
 * Basic information of a certificate.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class CryptoManagerKmipCertificateInfo extends DynamicData {

    private String subject;
    private String issuer;
    private String serialNumber;
    private Calendar notBefore;
    private Calendar notAfter;
    private String fingerprInteger;
    private Calendar checkTime;
    private Integer secondsSinceValid;
    private Integer secondsBeforeExpire;

    @Override
    public String toString() {
        return "CryptoManagerKmipCertificateInfo{" +
                "subject='" + subject + '\'' +
                ", issuer='" + issuer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", notBefore=" + notBefore +
                ", notAfter=" + notAfter +
                ", fingerprInteger='" + fingerprInteger + '\'' +
                ", checkTime=" + checkTime +
                ", secondsSinceValid=" + secondsSinceValid +
                ", secondsBeforeExpire=" + secondsBeforeExpire +
                "} " + super.toString();
    }

    public Calendar getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(final Calendar checkTime) {
        this.checkTime = checkTime;
    }

    public String getFingerprInteger() {
        return fingerprInteger;
    }

    public void setFingerprInteger(final String fingerprint) {
        this.fingerprInteger = fingerprint;
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

    public Integer getSecondsBeforeExpire() {
        return secondsBeforeExpire;
    }

    public void setSecondsBeforeExpire(final Integer secondsBeforeExpire) {
        this.secondsBeforeExpire = secondsBeforeExpire;
    }

    public Integer getSecondsSinceValid() {
        return secondsSinceValid;
    }

    public void setSecondsSinceValid(final Integer secondsSinceValid) {
        this.secondsSinceValid = secondsSinceValid;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(final String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }
}
