package com.vmware.vim25;

import java.io.Serializable;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 02.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class CryptoKeyId extends DynamicData implements Serializable {

    private String keyId;
    private KeyProviderId providerId;

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(final String keyId) {
        this.keyId = keyId;
    }

    public KeyProviderId getProviderId() {
        return providerId;
    }

    public void setProviderId(final KeyProviderId providerId) {
        this.providerId = providerId;
    }
}
