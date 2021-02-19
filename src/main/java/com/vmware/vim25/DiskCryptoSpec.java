package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class DiskCryptoSpec extends DynamicData {

    private DiskCryptoSpec parent;
    private CryptoSpec crypto;

    @Override
    public String toString() {
        return "DiskCryptoSpec{" +
                "parent=" + parent +
                ", crypto=" + crypto +
                "} " + super.toString();
    }

    public DiskCryptoSpec getParent() {
        return parent;
    }

    public void setParent(final DiskCryptoSpec parent) {
        this.parent = parent;
    }

    public CryptoSpec getCrypto() {
        return crypto;
    }

    public void setCrypto(final CryptoSpec crypto) {
        this.crypto = crypto;
    }

}
