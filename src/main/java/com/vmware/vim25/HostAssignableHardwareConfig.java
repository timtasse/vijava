package com.vmware.vim25;

import java.util.Arrays;

/**
 * The AssignableHardwareConfig data object describes properties of all assignable devices on the host.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostAssignableHardwareConfig extends DynamicData {

    private HostAssignableHardwareConfigAttributeOverride[] attributeOverride;

    @Override
    public String toString() {
        return "HostAssignableHardwareConfig{" +
                "attributeOverride=" + Arrays.toString(attributeOverride) +
                "} " + super.toString();
    }

    public HostAssignableHardwareConfigAttributeOverride[] getAttributeOverride() {
        return attributeOverride;
    }

    public void setAttributeOverride(final HostAssignableHardwareConfigAttributeOverride[] attributeOverride) {
        this.attributeOverride = attributeOverride;
    }

}
