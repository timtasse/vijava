package com.vmware.vim25;

/**
 * Descriptor of the lease capabilities.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class HttpNfcLeaseCapabilities extends DynamicData {

    private boolean corsSupported;
    private boolean pullModeSupported;

    @Override
    public String toString() {
        return "HttpNfcLeaseCapabilities{" +
                "corsSupported=" + corsSupported +
                ", pullModeSupported=" + pullModeSupported +
                "} " + super.toString();
    }

    public boolean isCorsSupported() {
        return corsSupported;
    }

    public void setCorsSupported(final boolean corsSupported) {
        this.corsSupported = corsSupported;
    }

    public boolean isPullModeSupported() {
        return pullModeSupported;
    }

    public void setPullModeSupported(final boolean pullModeSupported) {
        this.pullModeSupported = pullModeSupported;
    }

}
