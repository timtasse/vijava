package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VirtualDeviceConfigSpecBackingSpec extends DynamicData {

    public VirtualDeviceConfigSpecBackingSpec parent;
    public CryptoSpec crypto;

    public CryptoSpec getCrypto() {
        return crypto;
    }

    public void setCrypto(final CryptoSpec crypto) {
        this.crypto = crypto;
    }

    public VirtualDeviceConfigSpecBackingSpec getParent() {
        return parent;
    }

    public void setParent(final VirtualDeviceConfigSpecBackingSpec parent) {
        this.parent = parent;
    }
}
