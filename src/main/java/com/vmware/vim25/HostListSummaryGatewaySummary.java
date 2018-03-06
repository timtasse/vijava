package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostListSummaryGatewaySummary extends DynamicData {

    public String gatewayId;
    public String gatewayType;

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
}
