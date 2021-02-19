package com.vmware.vim25;

/**
 * Transport zone information.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class DistributedVirtualSwitchHostMemberTransportZoneInfo extends DynamicData {

    private String uuid;
    private String type;

    @Override
    public String toString() {
        return "DistributedVirtualSwitchHostMemberTransportZoneInfo{" +
                "uuid='" + uuid + '\'' +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

}
