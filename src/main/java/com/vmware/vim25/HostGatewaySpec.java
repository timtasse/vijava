package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostGatewaySpec extends DynamicData {

    public String gatewayType;
    public String gatewayId;
    public String trustVerificationToken;
    public KeyValue[] hostAuthParams;

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(final String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getGatewayType() {
        return gatewayType;
    }

    public void setGatewayType(final String gatewayType) {
        this.gatewayType = gatewayType;
    }

    public KeyValue[] getHostAuthParams() {
        return hostAuthParams;
    }

    public void setHostAuthParams(final KeyValue[] hostAuthParams) {
        this.hostAuthParams = hostAuthParams;
    }

    public String getTrustVerificationToken() {
        return trustVerificationToken;
    }

    public void setTrustVerificationToken(final String trustVerificationToken) {
        this.trustVerificationToken = trustVerificationToken;
    }
}
