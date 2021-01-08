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
 * This data object type describes the DNS configuration.
 * All IPv4 addresses, subnet addresses, and netmasks are specified using dotted decimal notation.
 * For example, "192.0.2.1". IPv6 addresses are 128-bit addresses represented as eight fields of up to four hexadecimal digits.
 * A colon separates each field (:). For example, 2001:DB8:101::230:6eff:fe04:d9ff.
 * The address can also consist of the symbol '::' to represent multiple 16-bit groups of contiguous 0's only once in an address as described in RFC 2373.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */

@SuppressWarnings("all")
public class HostDnsConfig extends DynamicData {

    private String[] address;
    private boolean dhcp;
    private String domainName;
    private String hostName;
    private String ipv6VirtualNicDevice;
    private String[] searchDomain;
    private String virtualNicDevice;

    @Override
    public String toString() {
        return "HostDnsConfig{" +
                "address=" + Arrays.toString(address) +
                ", dhcp=" + dhcp +
                ", domainName='" + domainName + '\'' +
                ", hostName='" + hostName + '\'' +
                ", ipv6VirtualNicDevice='" + ipv6VirtualNicDevice + '\'' +
                ", searchDomain=" + Arrays.toString(searchDomain) +
                ", virtualNicDevice='" + virtualNicDevice + '\'' +
                "} " + super.toString();
    }

    public boolean isDhcp() {
        return this.dhcp;
    }

    public void setDhcp(boolean dhcp) {
        this.dhcp = dhcp;
    }

    public String getVirtualNicDevice() {
        return this.virtualNicDevice;
    }

    public void setVirtualNicDevice(String virtualNicDevice) {
        this.virtualNicDevice = virtualNicDevice;
    }

    public String getHostName() {
        return this.hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getDomainName() {
        return this.domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String[] getAddress() {
        return this.address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String[] getSearchDomain() {
        return this.searchDomain;
    }

    public void setSearchDomain(String[] searchDomain) {
        this.searchDomain = searchDomain;
    }

    public String getIpv6VirtualNicDevice() {
        return ipv6VirtualNicDevice;
    }

    public void setIpv6VirtualNicDevice(final String ipv6VirtualNicDevice) {
        this.ipv6VirtualNicDevice = ipv6VirtualNicDevice;
    }

}
