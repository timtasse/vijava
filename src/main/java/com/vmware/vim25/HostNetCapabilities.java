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
 * Capability vector indicating the available product features.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.1
 */
public class HostNetCapabilities extends DynamicData {

    private boolean canSetPhysicalNicLinkSpeed;
    private boolean supportsNicTeaming;
    private String[] nicTeamingPolicy;
    private boolean supportsVlan;
    private boolean usesServiceConsoleNic;
    private boolean supportsNetworkHints;
    private Integer maxPortGroupsPerVswitch;
    private boolean vswitchConfigSupported;
    private boolean vnicConfigSupported;
    private boolean ipRouteConfigSupported;
    private boolean dnsConfigSupported;
    private boolean dhcpOnVnicSupported;
    private Boolean ipV6Supported;
    private Boolean backupNfcNiocSupported;

    @Override
    public String toString() {
        return "HostNetCapabilities{" +
                "canSetPhysicalNicLinkSpeed=" + canSetPhysicalNicLinkSpeed +
                ", supportsNicTeaming=" + supportsNicTeaming +
                ", nicTeamingPolicy=" + Arrays.toString(nicTeamingPolicy) +
                ", supportsVlan=" + supportsVlan +
                ", usesServiceConsoleNic=" + usesServiceConsoleNic +
                ", supportsNetworkHints=" + supportsNetworkHints +
                ", maxPortGroupsPerVswitch=" + maxPortGroupsPerVswitch +
                ", vswitchConfigSupported=" + vswitchConfigSupported +
                ", vnicConfigSupported=" + vnicConfigSupported +
                ", ipRouteConfigSupported=" + ipRouteConfigSupported +
                ", dnsConfigSupported=" + dnsConfigSupported +
                ", dhcpOnVnicSupported=" + dhcpOnVnicSupported +
                ", ipV6Supported=" + ipV6Supported +
                ", backupNfcNiocSupported=" + backupNfcNiocSupported +
                "} " + super.toString();
    }

    public boolean isCanSetPhysicalNicLinkSpeed() {
        return this.canSetPhysicalNicLinkSpeed;
    }

    public void setCanSetPhysicalNicLinkSpeed(boolean canSetPhysicalNicLinkSpeed) {
        this.canSetPhysicalNicLinkSpeed = canSetPhysicalNicLinkSpeed;
    }

    public boolean isSupportsNicTeaming() {
        return this.supportsNicTeaming;
    }

    public void setSupportsNicTeaming(boolean supportsNicTeaming) {
        this.supportsNicTeaming = supportsNicTeaming;
    }

    public String[] getNicTeamingPolicy() {
        return this.nicTeamingPolicy;
    }

    public void setNicTeamingPolicy(String[] nicTeamingPolicy) {
        this.nicTeamingPolicy = nicTeamingPolicy;
    }

    public boolean isSupportsVlan() {
        return this.supportsVlan;
    }

    public void setSupportsVlan(boolean supportsVlan) {
        this.supportsVlan = supportsVlan;
    }

    public boolean isUsesServiceConsoleNic() {
        return this.usesServiceConsoleNic;
    }

    public void setUsesServiceConsoleNic(boolean usesServiceConsoleNic) {
        this.usesServiceConsoleNic = usesServiceConsoleNic;
    }

    public boolean isSupportsNetworkHints() {
        return this.supportsNetworkHints;
    }

    public void setSupportsNetworkHints(boolean supportsNetworkHints) {
        this.supportsNetworkHints = supportsNetworkHints;
    }

    public Integer getMaxPortGroupsPerVswitch() {
        return this.maxPortGroupsPerVswitch;
    }

    public void setMaxPortGroupsPerVswitch(Integer maxPortGroupsPerVswitch) {
        this.maxPortGroupsPerVswitch = maxPortGroupsPerVswitch;
    }

    public boolean isVswitchConfigSupported() {
        return this.vswitchConfigSupported;
    }

    public void setVswitchConfigSupported(boolean vswitchConfigSupported) {
        this.vswitchConfigSupported = vswitchConfigSupported;
    }

    public boolean isVnicConfigSupported() {
        return this.vnicConfigSupported;
    }

    public void setVnicConfigSupported(boolean vnicConfigSupported) {
        this.vnicConfigSupported = vnicConfigSupported;
    }

    public boolean isIpRouteConfigSupported() {
        return this.ipRouteConfigSupported;
    }

    public void setIpRouteConfigSupported(boolean ipRouteConfigSupported) {
        this.ipRouteConfigSupported = ipRouteConfigSupported;
    }

    public boolean isDnsConfigSupported() {
        return this.dnsConfigSupported;
    }

    public void setDnsConfigSupported(boolean dnsConfigSupported) {
        this.dnsConfigSupported = dnsConfigSupported;
    }

    public boolean isDhcpOnVnicSupported() {
        return this.dhcpOnVnicSupported;
    }

    public void setDhcpOnVnicSupported(boolean dhcpOnVnicSupported) {
        this.dhcpOnVnicSupported = dhcpOnVnicSupported;
    }

    public Boolean getIpV6Supported() {
        return this.ipV6Supported;
    }

    public void setIpV6Supported(Boolean ipV6Supported) {
        this.ipV6Supported = ipV6Supported;
    }

    public Boolean getBackupNfcNiocSupported() {
        return backupNfcNiocSupported;
    }

    public void setBackupNfcNiocSupported(final Boolean backupNfcNiocSupported) {
        this.backupNfcNiocSupported = backupNfcNiocSupported;
    }

}
