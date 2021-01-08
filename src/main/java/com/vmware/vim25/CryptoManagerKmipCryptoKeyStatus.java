package com.vmware.vim25;

import java.util.Arrays;

/**
 * Status of a Crypto key
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.2
 */
public class CryptoManagerKmipCryptoKeyStatus extends DynamicData {

    private ManagedObjectReference[] affectedHosts;
    private ManagedObjectReference[] encryptedVMs;
    private Boolean keyAvailable;
    private CryptoKeyId keyId;
    private String reason;
    private String[] referencedByTags;

    @Override
    public String toString() {
        return "CryptoManagerKmipCryptoKeyStatus{" +
                "affectedHosts=" + Arrays.toString(affectedHosts) +
                ", encryptedVMs=" + Arrays.toString(encryptedVMs) +
                ", keyAvailable=" + keyAvailable +
                ", keyId=" + keyId +
                ", reason='" + reason + '\'' +
                ", referencedByTags=" + Arrays.toString(referencedByTags) +
                "} " + super.toString();
    }

    public ManagedObjectReference[] getAffectedHosts() {
        return affectedHosts;
    }

    public void setAffectedHosts(final ManagedObjectReference[] affectedHosts) {
        this.affectedHosts = affectedHosts;
    }

    public ManagedObjectReference[] getEncryptedVMs() {
        return encryptedVMs;
    }

    public void setEncryptedVMs(final ManagedObjectReference[] encryptedVMs) {
        this.encryptedVMs = encryptedVMs;
    }

    public Boolean getKeyAvailable() {
        return keyAvailable;
    }

    public void setKeyAvailable(final Boolean keyAvailable) {
        this.keyAvailable = keyAvailable;
    }

    public CryptoKeyId getKeyId() {
        return keyId;
    }

    public void setKeyId(final CryptoKeyId keyId) {
        this.keyId = keyId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public String[] getReferencedByTags() {
        return referencedByTags;
    }

    public void setReferencedByTags(final String[] referencedByTags) {
        this.referencedByTags = referencedByTags;
    }
}
