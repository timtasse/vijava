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
public class HostInternetScsiHbaIPCapabilities extends DynamicData {

    public Boolean addressSettable;
    public Boolean alternateDnsServerAddressSettable;
    public Boolean arpRedirectSettable;
    public Boolean defaultGatewaySettable;
    public Boolean hostNameAsTargetAddress;
    public Boolean ipConfigurationMethodSettable;
    public Boolean ipv4EnableSettable;
    public Boolean ipv6DefaultGatewaySettable;
    public Boolean ipv6DhcpConfigurationSettable;
    public Boolean ipv6EnableSettable;
    public Boolean ipv6LinkLocalAutoConfigurationSettable;
    public Integer ipv6MaxStaticAddressesSupported;
    public Integer ipv6PrefixLength;
    public Boolean ipv6PrefixLengthSettable;
    public Boolean ipv6RouterAdvertisementConfigurationSettable;
    public Boolean ipv6Supported;
    public Boolean mtuSettable;
    public Boolean nameAliasSettable;
    public Boolean primaryDnsServerAddressSettable;
    public Boolean subnetMaskSettable;

    public Boolean isAddressSettable() {
        return this.addressSettable;
    }

    public void setAddressSettable(Boolean addressSettable) {
        this.addressSettable = addressSettable;
    }

    public Boolean isIpConfigurationMethodSettable() {
        return this.ipConfigurationMethodSettable;
    }

    public void setIpConfigurationMethodSettable(Boolean ipConfigurationMethodSettable) {
        this.ipConfigurationMethodSettable = ipConfigurationMethodSettable;
    }

    public Boolean isSubnetMaskSettable() {
        return this.subnetMaskSettable;
    }

    public void setSubnetMaskSettable(Boolean subnetMaskSettable) {
        this.subnetMaskSettable = subnetMaskSettable;
    }

    public Boolean isDefaultGatewaySettable() {
        return this.defaultGatewaySettable;
    }

    public void setDefaultGatewaySettable(Boolean defaultGatewaySettable) {
        this.defaultGatewaySettable = defaultGatewaySettable;
    }

    public Boolean isPrimaryDnsServerAddressSettable() {
        return this.primaryDnsServerAddressSettable;
    }

    public void setPrimaryDnsServerAddressSettable(Boolean primaryDnsServerAddressSettable) {
        this.primaryDnsServerAddressSettable = primaryDnsServerAddressSettable;
    }

    public Boolean isAlternateDnsServerAddressSettable() {
        return this.alternateDnsServerAddressSettable;
    }

    public void setAlternateDnsServerAddressSettable(Boolean alternateDnsServerAddressSettable) {
        this.alternateDnsServerAddressSettable = alternateDnsServerAddressSettable;
    }

    public Boolean isArpRedirectSettable() {
        return arpRedirectSettable;
    }

    public void setArpRedirectSettable(final Boolean arpRedirectSettable) {
        this.arpRedirectSettable = arpRedirectSettable;
    }

    public Boolean isHostNameAsTargetAddress() {
        return hostNameAsTargetAddress;
    }

    public void setHostNameAsTargetAddress(final Boolean hostNameAsTargetAddress) {
        this.hostNameAsTargetAddress = hostNameAsTargetAddress;
    }

    public Boolean isIpv4EnableSettable() {
        return ipv4EnableSettable;
    }

    public void setIpv4EnableSettable(final Boolean ipv4EnableSettable) {
        this.ipv4EnableSettable = ipv4EnableSettable;
    }

    public Boolean isIpv6DefaultGatewaySettable() {
        return ipv6DefaultGatewaySettable;
    }

    public void setIpv6DefaultGatewaySettable(final Boolean ipv6DefaultGatewaySettable) {
        this.ipv6DefaultGatewaySettable = ipv6DefaultGatewaySettable;
    }

    public Boolean isIpv6DhcpConfigurationSettable() {
        return ipv6DhcpConfigurationSettable;
    }

    public void setIpv6DhcpConfigurationSettable(final Boolean ipv6DhcpConfigurationSettable) {
        this.ipv6DhcpConfigurationSettable = ipv6DhcpConfigurationSettable;
    }

    public Boolean isIpv6EnableSettable() {
        return ipv6EnableSettable;
    }

    public void setIpv6EnableSettable(final Boolean ipv6EnableSettable) {
        this.ipv6EnableSettable = ipv6EnableSettable;
    }

    public Boolean isIpv6LinkLocalAutoConfigurationSettable() {
        return ipv6LinkLocalAutoConfigurationSettable;
    }

    public void setIpv6LinkLocalAutoConfigurationSettable(final Boolean ipv6LinkLocalAutoConfigurationSettable) {
        this.ipv6LinkLocalAutoConfigurationSettable = ipv6LinkLocalAutoConfigurationSettable;
    }

    public Integer getIpv6MaxStaticAddressesSupported() {
        return ipv6MaxStaticAddressesSupported;
    }

    public void setIpv6MaxStaticAddressesSupported(final Integer ipv6MaxStaticAddressesSupported) {
        this.ipv6MaxStaticAddressesSupported = ipv6MaxStaticAddressesSupported;
    }

    public Integer getIpv6PrefixLength() {
        return ipv6PrefixLength;
    }

    public void setIpv6PrefixLength(final Integer ipv6PrefixLength) {
        this.ipv6PrefixLength = ipv6PrefixLength;
    }

    public Boolean isIpv6PrefixLengthSettable() {
        return ipv6PrefixLengthSettable;
    }

    public void setIpv6PrefixLengthSettable(final Boolean ipv6PrefixLengthSettable) {
        this.ipv6PrefixLengthSettable = ipv6PrefixLengthSettable;
    }

    public Boolean isIpv6RouterAdvertisementConfigurationSettable() {
        return ipv6RouterAdvertisementConfigurationSettable;
    }

    public void setIpv6RouterAdvertisementConfigurationSettable(final Boolean ipv6RouterAdvertisementConfigurationSettable) {
        this.ipv6RouterAdvertisementConfigurationSettable = ipv6RouterAdvertisementConfigurationSettable;
    }

    public Boolean isIpv6Supported() {
        return ipv6Supported;
    }

    public void setIpv6Supported(final Boolean ipv6Supported) {
        this.ipv6Supported = ipv6Supported;
    }

    public Boolean isMtuSettable() {
        return mtuSettable;
    }

    public void setMtuSettable(final Boolean mtuSettable) {
        this.mtuSettable = mtuSettable;
    }

    public Boolean isNameAliasSettable() {
        return nameAliasSettable;
    }

    public void setNameAliasSettable(final Boolean nameAliasSettable) {
        this.nameAliasSettable = nameAliasSettable;
    }
}