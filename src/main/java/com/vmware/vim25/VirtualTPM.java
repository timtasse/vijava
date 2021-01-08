package com.vmware.vim25;

/**
 * This data object type represents a TPM 2.0 module in a virtual machine.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualTPM extends VirtualDevice {

    private byte[] endorsementKeyCertificate;
    private byte[] endorsementKeyCertificateSigningRequest;

    public byte[] getEndorsementKeyCertificate() {
        return endorsementKeyCertificate;
    }

    public void setEndorsementKeyCertificate(final byte[] endorsementKeyCertificate) {
        this.endorsementKeyCertificate = endorsementKeyCertificate;
    }

    public byte[] getEndorsementKeyCertificateSigningRequest() {
        return endorsementKeyCertificateSigningRequest;
    }

    public void setEndorsementKeyCertificateSigningRequest(final byte[] endorsementKeyCertificateSigningRequest) {
        this.endorsementKeyCertificateSigningRequest = endorsementKeyCertificateSigningRequest;
    }

}
