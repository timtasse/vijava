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

import java.util.List;

/**
 * This class defines the VMware specific configuration for DistributedVirtualSwitch.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
@SuppressWarnings("unused")
public class VMwareDVSConfigInfo extends DVSConfigInfo {

    private List<VMwareVspanSession> vspanSession = List.of();
    private List<VMwareDVSPvlanMapEntry> pvlanConfig = List.of();
    private int maxMtu;
    private LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;
    private VMwareIpfixConfig ipfixConfig;
    private List<VMwareDvsLacpGroupConfig> lacpGroupConfig = List.of();
    private String lacpApiVersion;
    private String multicastFilteringMode;
    private String networkOffloadSpecId;

    @Override
    public String toString() {
        return "VMwareDVSConfigInfo{" +
                "vspanSession=" + vspanSession +
                ", pvlanConfig=" + pvlanConfig +
                ", maxMtu=" + maxMtu +
                ", linkDiscoveryProtocolConfig=" + linkDiscoveryProtocolConfig +
                ", ipfixConfig=" + ipfixConfig +
                ", lacpGroupConfig=" + lacpGroupConfig +
                ", lacpApiVersion='" + lacpApiVersion + '\'' +
                ", multicastFilteringMode='" + multicastFilteringMode + '\'' +
                ", networkOffloadSpecId='" + networkOffloadSpecId + '\'' +
                '}';
    }

    public List<VMwareVspanSession> getVspanSession() {
        return vspanSession;
    }

    public void setVspanSession(final List<VMwareVspanSession> vspanSession) {
        this.vspanSession = vspanSession;
    }

    public List<VMwareDVSPvlanMapEntry> getPvlanConfig() {
        return pvlanConfig;
    }

    public void setPvlanConfig(final List<VMwareDVSPvlanMapEntry> pvlanConfig) {
        this.pvlanConfig = pvlanConfig;
    }

    public int getMaxMtu() {
        return maxMtu;
    }

    public void setMaxMtu(final int maxMtu) {
        this.maxMtu = maxMtu;
    }

    public LinkDiscoveryProtocolConfig getLinkDiscoveryProtocolConfig() {
        return linkDiscoveryProtocolConfig;
    }

    public void setLinkDiscoveryProtocolConfig(final LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig) {
        this.linkDiscoveryProtocolConfig = linkDiscoveryProtocolConfig;
    }

    public VMwareIpfixConfig getIpfixConfig() {
        return ipfixConfig;
    }

    public void setIpfixConfig(final VMwareIpfixConfig ipfixConfig) {
        this.ipfixConfig = ipfixConfig;
    }

    public List<VMwareDvsLacpGroupConfig> getLacpGroupConfig() {
        return lacpGroupConfig;
    }

    public void setLacpGroupConfig(final List<VMwareDvsLacpGroupConfig> lacpGroupConfig) {
        this.lacpGroupConfig = lacpGroupConfig;
    }

    public String getLacpApiVersion() {
        return lacpApiVersion;
    }

    public void setLacpApiVersion(final String lacpApiVersion) {
        this.lacpApiVersion = lacpApiVersion;
    }

    public String getMulticastFilteringMode() {
        return multicastFilteringMode;
    }

    public void setMulticastFilteringMode(final String multicastFilteringMode) {
        this.multicastFilteringMode = multicastFilteringMode;
    }

    public String getNetworkOffloadSpecId() {
        return networkOffloadSpecId;
    }

    public void setNetworkOffloadSpecId(final String networkOffloadSpecId) {
        this.networkOffloadSpecId = networkOffloadSpecId;
    }

}
