package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class GatewayToHostTrustVerifyFault extends GatewayToHostConnectFault {

    public KeyValue[] propertiesToVerify;
    public String verificationToken;

    public KeyValue[] getPropertiesToVerify() {
        return propertiesToVerify;
    }

    public void setPropertiesToVerify(final KeyValue[] propertiesToVerify) {
        this.propertiesToVerify = propertiesToVerify;
    }

    public String getVerificationToken() {
        return verificationToken;
    }

    public void setVerificationToken(final String verificationToken) {
        this.verificationToken = verificationToken;
    }
}
