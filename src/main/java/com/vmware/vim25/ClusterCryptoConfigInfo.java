package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class ClusterCryptoConfigInfo extends DynamicData {

    private String cryptoMode;

    @Override
    public String toString() {
        return "ClusterCryptoConfigInfo{" +
                "cryptoMode='" + cryptoMode + '\'' +
                "} " + super.toString();
    }

    public String getCryptoMode() {
        return cryptoMode;
    }

    public void setCryptoMode(final String cryptoMode) {
        this.cryptoMode = cryptoMode;
    }

}
