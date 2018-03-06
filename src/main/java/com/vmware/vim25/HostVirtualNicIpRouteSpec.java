package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 02.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class HostVirtualNicIpRouteSpec extends DynamicData {

    public HostIpRouteConfig ipRouteConfig;

    public HostIpRouteConfig getIpRouteConfig() {
        return ipRouteConfig;
    }

    public void setIpRouteConfig(final HostIpRouteConfig ipRouteConfig) {
        this.ipRouteConfig = ipRouteConfig;
    }
}
