package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class CryptoSpecEncrypt extends CryptoSpec {

    public CryptoKeyId cryptoKeyId;

    public CryptoKeyId getCryptoKeyId() {
        return cryptoKeyId;
    }

    public void setCryptoKeyId(final CryptoKeyId cryptoKeyId) {
        this.cryptoKeyId = cryptoKeyId;
    }
}
