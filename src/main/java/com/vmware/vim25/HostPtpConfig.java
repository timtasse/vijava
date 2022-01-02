package com.vmware.vim25;

import java.util.List;

/**
 * Configuration information for the host PTP (Precision Time Protocol) service.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class HostPtpConfig extends DynamicData {

    private Integer domain;
    private List<HostPtpConfigPtpPort> port;

    @Override
    public String toString() {
        return "HostPtpConfig{" +
                "domain=" + domain +
                ", port=" + port +
                "} " + super.toString();
    }

    public Integer getDomain() {
        return domain;
    }

    public void setDomain(final Integer domain) {
        this.domain = domain;
    }

    public List<HostPtpConfigPtpPort> getPort() {
        return port;
    }

    public void setPort(final List<HostPtpConfigPtpPort> port) {
        this.port = port;
    }

}
