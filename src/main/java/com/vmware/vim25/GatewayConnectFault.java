package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 27.03.18.
 */
public class GatewayConnectFault extends HostConnectFault {

    public LocalizableMessage details;
    public String gatewayId;
    public String gatewayInfo;
    public String gatewayType;

    public LocalizableMessage getDetails() {
        return details;
    }

    public void setDetails(final LocalizableMessage details) {
        this.details = details;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(final String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getGatewayInfo() {
        return gatewayInfo;
    }

    public void setGatewayInfo(final String gatewayInfo) {
        this.gatewayInfo = gatewayInfo;
    }

    public String getGatewayType() {
        return gatewayType;
    }

    public void setGatewayType(final String gatewayType) {
        this.gatewayType = gatewayType;
    }
}
