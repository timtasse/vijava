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
 * This data object type describes networking host configuration data objects.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2
 */
@SuppressWarnings("unused")
public class HostNetworkInfo extends DynamicData {

    private HostVirtualSwitch[] vswitch;
    private HostProxySwitch[] proxySwitch;
    private HostPortGroup[] portgroup;
    private PhysicalNic[] pnic;
    private HostRdmaDevice[] rdmaDevice;
    private HostVirtualNic[] vnic;
    private HostVirtualNic[] consoleVnic;
    @Deprecated(since = "5.5")
    private HostDnsConfig dnsConfig;
    @Deprecated(since = "5.5")
    private HostIpRouteConfig ipRouteConfig;
    private HostIpRouteConfig consoleIpRouteConfig;
    @Deprecated(since = "5.5")
    private HostIpRouteTableInfo routeTableInfo;
    private HostDhcpService[] dhcp;
    private HostNatService[] nat;
    private Boolean ipV6Enabled;
    private Boolean atBootIpV6Enabled;
    private HostNetStackInstance[] netStackInstance;
    private HostOpaqueSwitch[] opaqueSwitch;
    private HostOpaqueNetworkInfo[] opaqueNetwork;
    private String nsxTransportNodeId;
    private Boolean nvdsToVdsMigrationRequired;
    private String migrationStatus;

    @Override
    public String toString() {
        return "HostNetworkInfo{" +
                "vswitch=" + Arrays.toString(vswitch) +
                ", proxySwitch=" + Arrays.toString(proxySwitch) +
                ", portgroup=" + Arrays.toString(portgroup) +
                ", pnic=" + Arrays.toString(pnic) +
                ", rdmaDevice=" + Arrays.toString(rdmaDevice) +
                ", vnic=" + Arrays.toString(vnic) +
                ", consoleVnic=" + Arrays.toString(consoleVnic) +
                ", dnsConfig=" + dnsConfig +
                ", ipRouteConfig=" + ipRouteConfig +
                ", consoleIpRouteConfig=" + consoleIpRouteConfig +
                ", routeTableInfo=" + routeTableInfo +
                ", dhcp=" + Arrays.toString(dhcp) +
                ", nat=" + Arrays.toString(nat) +
                ", ipV6Enabled=" + ipV6Enabled +
                ", atBootIpV6Enabled=" + atBootIpV6Enabled +
                ", netStackInstance=" + Arrays.toString(netStackInstance) +
                ", opaqueSwitch=" + Arrays.toString(opaqueSwitch) +
                ", opaqueNetwork=" + Arrays.toString(opaqueNetwork) +
                ", nsxTransportNodeId='" + nsxTransportNodeId + '\'' +
                ", nvdsToVdsMigrationRequired=" + nvdsToVdsMigrationRequired +
                ", migrationStatus='" + migrationStatus + '\'' +
                '}';
    }

    public HostVirtualSwitch[] getVswitch() {
        return vswitch;
    }

    public void setVswitch(final HostVirtualSwitch[] vswitch) {
        this.vswitch = vswitch;
    }

    public HostProxySwitch[] getProxySwitch() {
        return proxySwitch;
    }

    public void setProxySwitch(final HostProxySwitch[] proxySwitch) {
        this.proxySwitch = proxySwitch;
    }

    public HostPortGroup[] getPortgroup() {
        return portgroup;
    }

    public void setPortgroup(final HostPortGroup[] portgroup) {
        this.portgroup = portgroup;
    }

    public PhysicalNic[] getPnic() {
        return pnic;
    }

    public void setPnic(final PhysicalNic[] pnic) {
        this.pnic = pnic;
    }

    public HostRdmaDevice[] getRdmaDevice() {
        return rdmaDevice;
    }

    public void setRdmaDevice(final HostRdmaDevice[] rdmaDevice) {
        this.rdmaDevice = rdmaDevice;
    }

    public HostVirtualNic[] getVnic() {
        return vnic;
    }

    public void setVnic(final HostVirtualNic[] vnic) {
        this.vnic = vnic;
    }

    public HostVirtualNic[] getConsoleVnic() {
        return consoleVnic;
    }

    public void setConsoleVnic(final HostVirtualNic[] consoleVnic) {
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

    public HostIpRouteTableInfo getRouteTableInfo() {
        return routeTableInfo;
    }

    public void setRouteTableInfo(final HostIpRouteTableInfo routeTableInfo) {
        this.routeTableInfo = routeTableInfo;
    }

    public HostDhcpService[] getDhcp() {
        return dhcp;
    }

    public void setDhcp(final HostDhcpService[] dhcp) {
        this.dhcp = dhcp;
    }

    public HostNatService[] getNat() {
        return nat;
    }

    public void setNat(final HostNatService[] nat) {
        this.nat = nat;
    }

    public Boolean getIpV6Enabled() {
        return ipV6Enabled;
    }

    public void setIpV6Enabled(final Boolean ipV6Enabled) {
        this.ipV6Enabled = ipV6Enabled;
    }

    public Boolean getAtBootIpV6Enabled() {
        return atBootIpV6Enabled;
    }

    public void setAtBootIpV6Enabled(final Boolean atBootIpV6Enabled) {
        this.atBootIpV6Enabled = atBootIpV6Enabled;
    }

    public HostNetStackInstance[] getNetStackInstance() {
        return netStackInstance;
    }

    public void setNetStackInstance(final HostNetStackInstance[] netStackInstance) {
        this.netStackInstance = netStackInstance;
    }

    public HostOpaqueSwitch[] getOpaqueSwitch() {
        return opaqueSwitch;
    }

    public void setOpaqueSwitch(final HostOpaqueSwitch[] opaqueSwitch) {
        this.opaqueSwitch = opaqueSwitch;
    }

    public HostOpaqueNetworkInfo[] getOpaqueNetwork() {
        return opaqueNetwork;
    }

    public void setOpaqueNetwork(final HostOpaqueNetworkInfo[] opaqueNetwork) {
        this.opaqueNetwork = opaqueNetwork;
    }

    public String getNsxTransportNodeId() {
        return nsxTransportNodeId;
    }

    public void setNsxTransportNodeId(final String nsxTransportNodeId) {
        this.nsxTransportNodeId = nsxTransportNodeId;
    }

    public Boolean getNvdsToVdsMigrationRequired() {
        return nvdsToVdsMigrationRequired;
    }

    public void setNvdsToVdsMigrationRequired(final Boolean nvdsToVdsMigrationRequired) {
        this.nvdsToVdsMigrationRequired = nvdsToVdsMigrationRequired;
    }

    public String getMigrationStatus() {
        return migrationStatus;
    }

    public void setMigrationStatus(final String migrationStatus) {
        this.migrationStatus = migrationStatus;
    }

}
