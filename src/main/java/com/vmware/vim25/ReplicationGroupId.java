package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class ReplicationGroupId extends DynamicData {

    public DeviceGroupId deviceGroupId;
    public FaultDomainId faultDomainId;

    public DeviceGroupId getDeviceGroupId() {
        return deviceGroupId;
    }

    public void setDeviceGroupId(final DeviceGroupId deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
    }

    public FaultDomainId getFaultDomainId() {
        return faultDomainId;
    }

    public void setFaultDomainId(final FaultDomainId faultDomainId) {
        this.faultDomainId = faultDomainId;
    }
}
