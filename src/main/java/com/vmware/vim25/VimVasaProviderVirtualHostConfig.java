package com.vmware.vim25;

/**
 * Holds VirtualHost configuration information when VASA 5.0 or greater VVOL VASA Provider supports MultiVC through VirtualHosts
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.1
 */
@SuppressWarnings("unused")
public class VimVasaProviderVirtualHostConfig extends DynamicData {

    private String vhostName;
    private String serviceHost;
    private Integer servicePort;

    @Override
    public String toString() {
        return "VimVasaProviderVirtualHostConfig{" +
                "vhostName='" + vhostName + '\'' +
                ", serviceHost='" + serviceHost + '\'' +
                ", servicePort=" + servicePort +
                '}';
    }

    public String getVhostName() {
        return vhostName;
    }

    public void setVhostName(final String vhostName) {
        this.vhostName = vhostName;
    }

    public String getServiceHost() {
        return serviceHost;
    }

    public void setServiceHost(final String serviceHost) {
        this.serviceHost = serviceHost;
    }

    public Integer getServicePort() {
        return servicePort;
    }

    public void setServicePort(final Integer servicePort) {
        this.servicePort = servicePort;
    }

}
