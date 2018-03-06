package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class CryptoSpecDeepRecrypt extends CryptoSpec {

    public CryptoKeyId newKeyId;

    public CryptoKeyId getNewKeyId() {
        return newKeyId;
    }

    public void setNewKeyId(final CryptoKeyId newKeyId) {
        this.newKeyId = newKeyId;
    }
}
