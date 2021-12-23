/*================================================================================
Copyright (c) 2013 Steve Jin. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation 
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25;

import java.util.Arrays;

/**
 * This data object type describes networking host configuration data objects. These objects contain only the configuration information for networking.
 * The runtime information is available from the NetworkInfo data object type. {@see HostNetworkInfo}
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2
 * @since 2.0
 */
@SuppressWarnings("unused")
public class HostNetworkConfig extends DynamicData {

    private HostVirtualSwitchConfig[] vswitch;
    private HostProxySwitchConfig[] proxySwitch;
    private HostPortGroupConfig[] portgroup;
    private PhysicalNicConfig[] pnic;
    private HostVirtualNicConfig[] vnic;
    private HostVirtualNicConfig[] consoleVnic;
    private HostDnsConfig dnsConfig;
    private HostIpRouteConfig ipRouteConfig;
    private HostIpRouteConfig consoleIpRouteConfig;
    private HostIpRouteTableConfig routeTableConfig;
    private HostDhcpServiceConfig[] dhcp;
    private HostNatServiceConfig[] nat;
    private Boolean ipV6Enabled;
    private HostNetworkConfigNetStackSpec[] netStackSpec;
    private String migrationStatus;

    @Override
    public String toString() {
        return "HostNetworkConfig{" +
                "vswitch=" + Arrays.toString(vswitch) +
                ", proxySwitch=" + Arrays.toString(proxySwitch) +
                ", portgroup=" + Arrays.toString(portgroup) +
                ", pnic=" + Arrays.toString(pnic) +
                ", vnic=" + Arrays.toString(vnic) +
                ", consoleVnic=" + Arrays.toString(consoleVnic) +
                ", dnsConfig=" + dnsConfig +
                ", ipRouteConfig=" + ipRouteConfig +
                ", consoleIpRouteConfig=" + consoleIpRouteConfig +
                ", routeTableConfig=" + routeTableConfig +
                ", dhcp=" + Arrays.toString(dhcp) +
                ", nat=" + Arrays.toString(nat) +
                ", ipV6Enabled=" + ipV6Enabled +
                ", netStackSpec=" + Arrays.toString(netStackSpec) +
                ", migrationStatus='" + migrationStatus + '\'' +
                '}';
    }

    public HostVirtualSwitchConfig[] getVswitch() {
        return vswitch;
    }

    public void setVswitch(final HostVirtualSwitchConfig[] vswitch) {
        this.vswitch = vswitch;
    }

    public HostProxySwitchConfig[] getProxySwitch() {
        return proxySwitch;
    }

    public void setProxySwitch(final HostProxySwitchConfig[] proxySwitch) {
        this.proxySwitch = proxySwitch;
    }

    public HostPortGroupConfig[] getPortgroup() {
        return portgroup;
    }

    public void setPortgroup(final HostPortGroupConfig[] portgroup) {
        this.portgroup = portgroup;
    }

    public PhysicalNicConfig[] getPnic() {
        return pnic;
    }

    public void setPnic(final PhysicalNicConfig[] pnic) {
        this.pnic = pnic;
    }

    public HostVirtualNicConfig[] getVnic() {
        return vnic;
    }

    public void setVnic(final HostVirtualNicConfig[] vnic) {
        this.vnic = vnic;
    }

    public HostVirtualNicConfig[] getConsoleVnic() {
        return consoleVnic;
    }

    public void setConsoleVnic(final HostVirtualNicConfig[] consoleVnic) {
        this.consoleVnic = consoleVnic;
    }

    public HostDnsConfig getDnsConfig() {
        return dnsConfig;
    }

    public void setDnsConfig(final HostDnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    public HostIpRouteConfig getIpRouteConfig() {
        return ipRouteConfig;
    }

    public void setIpRouteConfig(final HostIpRouteConfig ipRouteConfig) {
        this.ipRouteConfig = ipRouteConfig;
    }

    public HostIpRouteConfig getConsoleIpRouteConfig() {
        return consoleIpRouteConfig;
    }

    public void setConsoleIpRouteConfig(final HostIpRouteConfig consoleIpRouteConfig) {
        this.consoleIpRouteConfig = consoleIpRouteConfig;
    }

    public HostIpRouteTableConfig getRouteTableConfig() {
        return routeTableConfig;
    }

    public void setRouteTableConfig(final HostIpRouteTableConfig routeTableConfig) {
        this.routeTableConfig = routeTableConfig;
    }

    public HostDhcpServiceConfig[] getDhcp() {
        return dhcp;
    }

    public void setDhcp(final HostDhcpServiceConfig[] dhcp) {
        this.dhcp = dhcp;
    }

    public HostNatServiceConfig[] getNat() {
        return nat;
    }

    public void setNat(final HostNatServiceConfig[] nat) {
        this.nat = nat;
    }

    public Boolean getIpV6Enabled() {
        return ipV6Enabled;
    }

    public void setIpV6Enabled(final Boolean ipV6Enabled) {
        this.ipV6Enabled = ipV6Enabled;
    }

    public HostNetworkConfigNetStackSpec[] getNetStackSpec() {
        return netStackSpec;
    }

    public void setNetStackSpec(final HostNetworkConfigNetStackSpec[] netStackSpec) {
        this.netStackSpec = netStackSpec;
    }

    public String getMigrationStatus() {
        return migrationStatus;
    }

    public void setMigrationStatus(final String migrationStatus) {
        this.migrationStatus = migrationStatus;
    }

}
