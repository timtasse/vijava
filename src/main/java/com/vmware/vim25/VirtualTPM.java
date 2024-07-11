package com.vmware.vim25;

import java.util.List;

/**
 * This data object type represents a TPM 2.0 module in a virtual machine.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualTPM extends VirtualDevice {

    private List<String> endorsementKeyCertificateSigningRequest;
    private List<String> endorsementKeyCertificate;

    public List<String> getEndorsementKeyCertificate() {
        return endorsementKeyCertificate;
    }

    public void setEndorsementKeyCertificate(final List<String> endorsementKeyCertificate) {
        this.endorsementKeyCertificate = endorsementKeyCertificate;
    }

    public List<String> getEndorsementKeyCertificateSigningRequest() {
        return endorsementKeyCertificateSigningRequest;
    }

    public void setEndorsementKeyCertificateSigningRequest(final List<String> endorsementKeyCertificateSigningRequest) {
        this.endorsementKeyCertificateSigningRequest = endorsementKeyCertificateSigningRequest;
    }

}
