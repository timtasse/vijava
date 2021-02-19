package com.vmware.vim25;

/**
 * Data Object representing a cryptographic key operation result.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.1
 */
public class CryptoKeyResult extends DynamicData {

    private CryptoKeyId keyId;
    private boolean success;
    private String reason;
    private LocalizedMethodFault fault;

    @Override
    public String toString() {
        return "CryptoKeyResult{" +
                "keyId=" + keyId +
                ", success=" + success +
                ", reason='" + reason + '\'' +
                ", fault=" + fault +
                "} " + super.toString();
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

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(final boolean success) {
        this.success = success;
    }

    public LocalizedMethodFault getFault() {
        return fault;
    }

    public void setFault(final LocalizedMethodFault fault) {
        this.fault = fault;
    }

}
