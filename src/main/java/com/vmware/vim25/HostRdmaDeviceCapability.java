package com.vmware.vim25;

/**
 * Represents device capabilies, e.g. supported protocols.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostRdmaDeviceCapability extends DynamicData {

    private boolean roceV1Capable;
    private boolean roceV2Capable;
    private boolean iWarpCapable;

    @Override
    public String toString() {
        return "HostRdmaDeviceCapability{" +
                "roceV1Capable=" + roceV1Capable +
                ", roceV2Capable=" + roceV2Capable +
                ", iWarpCapable=" + iWarpCapable +
                "} " + super.toString();
    }

    public boolean isRoceV1Capable() {
        return roceV1Capable;
    }

    public void setRoceV1Capable(final boolean roceV1Capable) {
        this.roceV1Capable = roceV1Capable;
    }

    public boolean isRoceV2Capable() {
        return roceV2Capable;
    }

    public void setRoceV2Capable(final boolean roceV2Capable) {
        this.roceV2Capable = roceV2Capable;
    }

    public boolean isiWarpCapable() {
        return iWarpCapable;
    }

    public void setiWarpCapable(final boolean iWarpCapable) {
        this.iWarpCapable = iWarpCapable;
    }

}
