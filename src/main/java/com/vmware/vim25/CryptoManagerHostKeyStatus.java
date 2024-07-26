package com.vmware.vim25;

/**
 * Status of a Crypto key on host
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.1
 */
@SuppressWarnings("unused")
public class CryptoManagerHostKeyStatus extends DynamicData {

    private CryptoKeyId keyId;
    private boolean present;
    private CryptoManagerHostKeyManagementType managementType;

    @Override
    public String toString() {
        return "CryptoManagerHostKeyStatus{" +
                "keyId=" + keyId +
                ", present=" + present +
                ", managementType=" + managementType +
                '}';
    }

    public CryptoKeyId getKeyId() {
        return keyId;
    }

    public void setKeyId(final CryptoKeyId keyId) {
        this.keyId = keyId;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(final boolean present) {
        this.present = present;
    }

    public CryptoManagerHostKeyManagementType getManagementType() {
        return managementType;
    }

    public void setManagementType(final CryptoManagerHostKeyManagementType managementType) {
        this.managementType = managementType;
    }

}
