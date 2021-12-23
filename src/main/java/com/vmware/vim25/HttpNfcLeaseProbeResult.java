package com.vmware.vim25;

/**
 * Descriptor of ProbeResult
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.2
 */
public class HttpNfcLeaseProbeResult extends DynamicData {

    private boolean serverAccessible;

    @Override
    public String toString() {
        return "HttpNfcLeaseProbeResult{" +
                "serverAccessible=" + serverAccessible +
                '}';
    }

    public boolean isServerAccessible() {
        return serverAccessible;
    }

    public void setServerAccessible(final boolean serverAccessible) {
        this.serverAccessible = serverAccessible;
    }

}
