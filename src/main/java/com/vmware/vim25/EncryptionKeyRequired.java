package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 25.05.18.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class EncryptionKeyRequired extends InvalidState {

    private CryptoKeyId[] requiredKey;

    public CryptoKeyId[] getRequiredKey() {
        return requiredKey;
    }

    public void setRequiredKey(final CryptoKeyId[] requiredKey) {
        this.requiredKey = requiredKey;
    }

}
