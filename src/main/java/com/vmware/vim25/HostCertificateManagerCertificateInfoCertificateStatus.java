package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public enum HostCertificateManagerCertificateInfoCertificateStatus {

    expirationImminent("expirationImminent"),
    expired("expired"),
    expiring("expiring"),
    expiringShortly("expiringShortly"),
    good("good"),
    unknown("unknown");

    private final String val;

    HostCertificateManagerCertificateInfoCertificateStatus(final String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
