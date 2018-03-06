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

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.5
 */

@SuppressWarnings("all")
public class HostInternetScsiHbaIPProperties extends DynamicData {

    public String mac;
    public String address;
    public Boolean dhcpConfigurationEnabled;
    public String subnetMask;
    public String defaultGateway;
    public String primaryDnsServerAddress;
    public String alternateDnsServerAddress;
    public String ipv6Address;
    public String ipv6SubnetMask;
    public String ipv6DefaultGateway;
    public Boolean arpRedirectEnabled;
    public Integer mtu;
    public Boolean jumboFramesEnabled;
    public Boolean ipv4Enabled;
    public Boolean ipv6Enabled;
    public HostInternetScsiHbaIPv6Properties ipv6properties;

    public String getMac() {
        return this.mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean isDhcpConfigurationEnabled() {
        return this.dhcpConfigurationEnabled;
    }

    public void setDhcpConfigurationEnabled(Boolean dhcpConfigurationEnabled) {
        this.dhcpConfigurationEnabled = dhcpConfigurationEnabled;
    }

    public String getSubnetMask() {
        return this.subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    public String getDefaultGateway() {
        return this.defaultGateway;
    }

    public void setDefaultGateway(String defaultGateway) {
        this.defaultGateway = defaultGateway;
    }

    public String getPrimaryDnsServerAddress() {
        return this.primaryDnsServerAddress;
    }

    public void setPrimaryDnsServerAddress(String primaryDnsServerAddress) {
        this.primaryDnsServerAddress = primaryDnsServerAddress;
    }

    public String getAlternateDnsServerAddress() {
        return this.alternateDnsServerAddress;
    }

    public void setAlternateDnsServerAddress(String alternateDnsServerAddress) {
        this.alternateDnsServerAddress = alternateDnsServerAddress;
    }

    public String getIpv6Address() {
        return this.ipv6Address;
    }

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public String getIpv6SubnetMask() {
        return this.ipv6SubnetMask;
    }

    public void setIpv6SubnetMask(String ipv6SubnetMask) {
        this.ipv6SubnetMask = ipv6SubnetMask;
    }

    public String getIpv6DefaultGateway() {
        return this.ipv6DefaultGateway;
    }

    public void setIpv6DefaultGateway(String ipv6DefaultGateway) {
        this.ipv6DefaultGateway = ipv6DefaultGateway;
    }

    public Integer getMtu() {
        return this.mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public Boolean isIpv4Enabled() {
        return ipv4Enabled;
    }

    public void setIpv4Enabled(final Boolean ipv4Enabled) {
        this.ipv4Enabled = ipv4Enabled;
    }

    public Boolean isIpv6Enabled() {
        return ipv6Enabled;
    }

    public void setIpv6Enabled(final Boolean ipv6Enabled) {
        this.ipv6Enabled = ipv6Enabled;
    }

    public HostInternetScsiHbaIPv6Properties getIpv6properties() {
        return ipv6properties;
    }

    public void setIpv6properties(final HostInternetScsiHbaIPv6Properties ipv6properties) {
        this.ipv6properties = ipv6properties;
    }

    public Boolean isArpRedirectEnabled() {
        return arpRedirectEnabled;
    }

    public void setArpRedirectEnabled(final Boolean arpRedirectEnabled) {
        this.arpRedirectEnabled = arpRedirectEnabled;
    }

    public Boolean isJumboFramesEnabled() {
        return jumboFramesEnabled;
    }

    public void setJumboFramesEnabled(Boolean jumboFramesEnabled) {
        this.jumboFramesEnabled = jumboFramesEnabled;
    }
}