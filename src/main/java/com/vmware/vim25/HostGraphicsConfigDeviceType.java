package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 02.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class HostGraphicsConfigDeviceType extends DynamicData {

    public String deviceId;
    public String graphicsType;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(final String deviceId) {
        this.deviceId = deviceId;
    }

    public String getGraphicsType() {
        return graphicsType;
    }

    public void setGraphicsType(final String graphicsType) {
        this.graphicsType = graphicsType;
    }
}
