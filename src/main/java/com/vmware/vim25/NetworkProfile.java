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
 * The NetworkProfile data object contains a set of subprofiles for network configuration.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 * @since 4.0
 */
public class NetworkProfile extends ApplyProfile {

    private VirtualSwitchProfile[] vswitch;
    private VmPortGroupProfile[] vmPortGroup;
    private HostPortGroupProfile[] hostPortGroup;
    private ServiceConsolePortGroupProfile[] serviceConsolePortGroup;
    private NetworkProfileDnsConfigProfile dnsConfig;
    private IpRouteProfile ipRouteConfig;
    private IpRouteProfile consoleIpRouteConfig;
    private PhysicalNicProfile[] pnic;
    private DvsProfile[] dvswitch;
    private DvsServiceConsoleVNicProfile[] dvsServiceConsoleNic;
    private DvsHostVNicProfile[] dvsHostNic;
    private NsxHostVNicProfile[] nsxHostNic;
    private NetStackInstanceProfile[] netStackInstance;
    private OpaqueSwitchProfile opaqueSwitch;

    @Override
    public String toString() {
        return "NetworkProfile{" +
                "vswitch=" + Arrays.toString(vswitch) +
                ", vmPortGroup=" + Arrays.toString(vmPortGroup) +
                ", hostPortGroup=" + Arrays.toString(hostPortGroup) +
                ", serviceConsolePortGroup=" + Arrays.toString(serviceConsolePortGroup) +
                ", dnsConfig=" + dnsConfig +
                ", ipRouteConfig=" + ipRouteConfig +
                ", consoleIpRouteConfig=" + consoleIpRouteConfig +
                ", pnic=" + Arrays.toString(pnic) +
                ", dvswitch=" + Arrays.toString(dvswitch) +
                ", dvsServiceConsoleNic=" + Arrays.toString(dvsServiceConsoleNic) +
                ", dvsHostNic=" + Arrays.toString(dvsHostNic) +
                ", nsxHostNic=" + Arrays.toString(nsxHostNic) +
                ", netStackInstance=" + Arrays.toString(netStackInstance) +
                ", opaqueSwitch=" + opaqueSwitch +
                "} " + super.toString();
    }

    public VirtualSwitchProfile[] getVswitch() {
        return this.vswitch;
    }

    public void setVswitch(VirtualSwitchProfile[] vswitch) {
        this.vswitch = vswitch;
    }

    public VmPortGroupProfile[] getVmPortGroup() {
        return this.vmPortGroup;
    }

    public void setVmPortGroup(VmPortGroupProfile[] vmPortGroup) {
        this.vmPortGroup = vmPortGroup;
    }

    public HostPortGroupProfile[] getHostPortGroup() {
        return this.hostPortGroup;
    }

    public void setHostPortGroup(HostPortGroupProfile[] hostPortGroup) {
        this.hostPortGroup = hostPortGroup;
    }

    public ServiceConsolePortGroupProfile[] getServiceConsolePortGroup() {
        return this.serviceConsolePortGroup;
    }

    public void setServiceConsolePortGroup(ServiceConsolePortGroupProfile[] serviceConsolePortGroup) {
        this.serviceConsolePortGroup = serviceConsolePortGroup;
    }

    public NetworkProfileDnsConfigProfile getDnsConfig() {
        return this.dnsConfig;
    }

    public void setDnsConfig(NetworkProfileDnsConfigProfile dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    public IpRouteProfile getIpRouteConfig() {
        return this.ipRouteConfig;
    }

    public void setIpRouteConfig(IpRouteProfile ipRouteConfig) {
        this.ipRouteConfig = ipRouteConfig;
    }

    public IpRouteProfile getConsoleIpRouteConfig() {
        return this.consoleIpRouteConfig;
    }

    public void setConsoleIpRouteConfig(IpRouteProfile consoleIpRouteConfig) {
        this.consoleIpRouteConfig = consoleIpRouteConfig;
    }

    public PhysicalNicProfile[] getPnic() {
        return this.pnic;
    }

    public void setPnic(PhysicalNicProfile[] pnic) {
        this.pnic = pnic;
    }

    public DvsProfile[] getDvswitch() {
        return this.dvswitch;
    }

    public void setDvswitch(DvsProfile[] dvswitch) {
        this.dvswitch = dvswitch;
    }

    public DvsServiceConsoleVNicProfile[] getDvsServiceConsoleNic() {
        return this.dvsServiceConsoleNic;
    }

    public void setDvsServiceConsoleNic(DvsServiceConsoleVNicProfile[] dvsServiceConsoleNic) {
        this.dvsServiceConsoleNic = dvsServiceConsoleNic;
    }

    public DvsHostVNicProfile[] getDvsHostNic() {
        return this.dvsHostNic;
    }

    public void setDvsHostNic(DvsHostVNicProfile[] dvsHostNic) {
        this.dvsHostNic = dvsHostNic;
    }

    public NetStackInstanceProfile[] getNetStackInstance() {
        return this.netStackInstance;
    }

    public void setNetStackInstance(NetStackInstanceProfile[] netStackInstance) {
        this.netStackInstance = netStackInstance;
    }

    public NsxHostVNicProfile[] getNsxHostNic() {
        return nsxHostNic;
    }

    public void setNsxHostNic(final NsxHostVNicProfile[] nsxHostNic) {
        this.nsxHostNic = nsxHostNic;
    }

    public OpaqueSwitchProfile getOpaqueSwitch() {
        return opaqueSwitch;
    }

    public void setOpaqueSwitch(final OpaqueSwitchProfile opaqueSwitch) {
        this.opaqueSwitch = opaqueSwitch;
    }

}
