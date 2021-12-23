package com.vmware.vim25;

/**
 * Indicators of support for version-specific supported MTU.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.2
 */
public class VMwareDvsMtuCapability extends DynamicData {

    private int minMtuSupported;
    private int maxMtuSupported;

    @Override
    public String toString() {
        return "VMwareDvsMtuCapability{" +
                "minMtuSupported=" + minMtuSupported +
                ", maxMtuSupported=" + maxMtuSupported +
                '}';
    }

    public int getMinMtuSupported() {
        return minMtuSupported;
    }

    public void setMinMtuSupported(final int minMtuSupported) {
        this.minMtuSupported = minMtuSupported;
    }

    public int getMaxMtuSupported() {
        return maxMtuSupported;
    }

    public void setMaxMtuSupported(final int maxMtuSupported) {
        this.maxMtuSupported = maxMtuSupported;
    }

}
