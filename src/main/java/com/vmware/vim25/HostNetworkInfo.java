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
 * @version 7.0
 */
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
                "} " + super.toString();
    }

    public HostVirtualSwitch[] getVswitch() {
        return this.vswitch;
    }

    public void setVswitch(HostVirtualSwitch[] vswitch) {
        this.vswitch = vswitch;
    }

    public HostProxySwitch[] getProxySwitch() {
        return this.proxySwitch;
    }

    public void setProxySwitch(HostProxySwitch[] proxySwitch) {
        this.proxySwitch = proxySwitch;
    }

    public HostPortGroup[] getPortgroup() {
        return this.portgroup;
    }

    public void setPortgroup(HostPortGroup[] portgroup) {
        this.portgroup = portgroup;
    }

    public PhysicalNic[] getPnic() {
        return this.pnic;
    }

    public void setPnic(PhysicalNic[] pnic) {
        this.pnic = pnic;
    }

    public HostVirtualNic[] getVnic() {
        return this.vnic;
    }

    public void setVnic(HostVirtualNic[] vnic) {
        this.vnic = vnic;
    }

    public HostVirtualNic[] getConsoleVnic() {
        return this.consoleVnic;
    }

    public void setConsoleVnic(HostVirtualNic[] consoleVnic) {
        this.consoleVnic = consoleVnic;
    }

    public HostDnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    public void setDnsConfig(HostDnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    public HostIpRouteConfig getIpRouteConfig() {
        return this.ipRouteConfig;
    }

    public void setIpRouteConfig(HostIpRouteConfig ipRouteConfig) {
        this.ipRouteConfig = ipRouteConfig;
    }

    public HostIpRouteConfig getConsoleIpRouteConfig() {
        return this.consoleIpRouteConfig;
    }

    public void setConsoleIpRouteConfig(HostIpRouteConfig consoleIpRouteConfig) {
        this.consoleIpRouteConfig = consoleIpRouteConfig;
    }

    public HostIpRouteTableInfo getRouteTableInfo() {
        return this.routeTableInfo;
    }

    public void setRouteTableInfo(HostIpRouteTableInfo routeTableInfo) {
        this.routeTableInfo = routeTableInfo;
    }

    public HostDhcpService[] getDhcp() {
        return this.dhcp;
    }

    public void setDhcp(HostDhcpService[] dhcp) {
        this.dhcp = dhcp;
    }

    public HostNatService[] getNat() {
        return this.nat;
    }

    public void setNat(HostNatService[] nat) {
        this.nat = nat;
    }

    public Boolean getIpV6Enabled() {
        return this.ipV6Enabled;
    }

    public void setIpV6Enabled(Boolean ipV6Enabled) {
        this.ipV6Enabled = ipV6Enabled;
    }

    public Boolean getAtBootIpV6Enabled() {
        return this.atBootIpV6Enabled;
    }

    public void setAtBootIpV6Enabled(Boolean atBootIpV6Enabled) {
        this.atBootIpV6Enabled = atBootIpV6Enabled;
    }

    public HostNetStackInstance[] getNetStackInstance() {
        return this.netStackInstance;
    }

    public void setNetStackInstance(HostNetStackInstance[] netStackInstance) {
        this.netStackInstance = netStackInstance;
    }

    public HostOpaqueSwitch[] getOpaqueSwitch() {
        return this.opaqueSwitch;
    }

    public void setOpaqueSwitch(HostOpaqueSwitch[] opaqueSwitch) {
        this.opaqueSwitch = opaqueSwitch;
    }

    public HostOpaqueNetworkInfo[] getOpaqueNetwork() {
        return this.opaqueNetwork;
    }

    public void setOpaqueNetwork(HostOpaqueNetworkInfo[] opaqueNetwork) {
        this.opaqueNetwork = opaqueNetwork;
    }

    public HostRdmaDevice[] getRdmaDevice() {
        return rdmaDevice;
    }

    public void setRdmaDevice(final HostRdmaDevice[] rdmaDevice) {
        this.rdmaDevice = rdmaDevice;
    }

    public String getNsxTransportNodeId() {
        return nsxTransportNodeId;
    }

    public void setNsxTransportNodeId(final String nsxTransportNodeId) {
        this.nsxTransportNodeId = nsxTransportNodeId;
    }
}
