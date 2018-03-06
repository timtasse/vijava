package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 02.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class HostGraphicsConfig extends DynamicData {

    public HostGraphicsConfigDeviceType[] deviceType;
    public String hostDefaultGraphicsType;
    public String sharedPassthruAssignmentPolicy;

    public HostGraphicsConfigDeviceType[] getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(final HostGraphicsConfigDeviceType[] deviceType) {
        this.deviceType = deviceType;
    }

    public String getHostDefaultGraphicsType() {
        return hostDefaultGraphicsType;
    }

    public void setHostDefaultGraphicsType(final String hostDefaultGraphicsType) {
        this.hostDefaultGraphicsType = hostDefaultGraphicsType;
    }

    public String getSharedPassthruAssignmentPolicy() {
        return sharedPassthruAssignmentPolicy;
    }

    public void setSharedPassthruAssignmentPolicy(final String sharedPassthruAssignmentPolicy) {
        this.sharedPassthruAssignmentPolicy = sharedPassthruAssignmentPolicy;
    }
}
