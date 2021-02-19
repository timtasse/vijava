package com.vmware.vim25;

/**
 * This data object type describes the options for
 * the VirtualPrecisionClockSystemClockBackingInfo VirtualPrecisionClockSystemClockBackingInfo} data object type.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualPrecisionClockSystemClockBackingOption extends VirtualDeviceBackingOption {

    private ChoiceOption protocol;

    @Override
    public String toString() {
        return "VirtualPrecisionClockSystemClockBackingOption{" +
                "protocol=" + protocol +
                "} " + super.toString();
    }

    public ChoiceOption getProtocol() {
        return protocol;
    }

    public void setProtocol(final ChoiceOption protocol) {
        this.protocol = protocol;
    }

}
