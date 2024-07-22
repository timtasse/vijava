package com.vmware.vim25;

/**
 * The feature capabilities of Dpu Features supported by the vSphere Distributed Switch.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class VMwareDvsDpuCapability extends DynamicData {

    private Boolean networkOffloadSupported;

    @Override
    public String toString() {
        return "VMwareDvsDpuCapability{" +
                "networkOffloadSupported=" + networkOffloadSupported +
                '}';
    }

    public Boolean getNetworkOffloadSupported() {
        return networkOffloadSupported;
    }

    public void setNetworkOffloadSupported(final Boolean networkOffloadSupported) {
        this.networkOffloadSupported = networkOffloadSupported;
    }

}
