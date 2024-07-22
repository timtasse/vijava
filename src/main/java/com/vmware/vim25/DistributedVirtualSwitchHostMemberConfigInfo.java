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

import java.util.Collections;
import java.util.List;

/**
 * The DistributedVirtualSwitchHostMemberConfigInfo data object contains membership configuration information for the ESXi host.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
public class DistributedVirtualSwitchHostMemberConfigInfo extends DynamicData {

    private ManagedObjectReference host;
    private int maxProxySwitchPorts;
    private List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig = Collections.emptyList();
    private DistributedVirtualSwitchHostMemberBacking backing;
    private Boolean nsxSwitch;
    private Boolean ensEnabled;
    private Boolean ensInterruptEnabled;
    private List<DistributedVirtualSwitchHostMemberTransportZoneInfo> transportZones = Collections.emptyList();
    private List<String> nsxtUsedUplinkNames = Collections.emptyList();
    private Boolean networkOffloadingEnabled;

    @Override
    public String toString() {
        return "DistributedVirtualSwitchHostMemberConfigInfo{" +
                "host=" + host +
                ", maxProxySwitchPorts=" + maxProxySwitchPorts +
                ", vendorSpecificConfig=" + vendorSpecificConfig +
                ", backing=" + backing +
                ", nsxSwitch=" + nsxSwitch +
                ", ensEnabled=" + ensEnabled +
                ", ensInterruptEnabled=" + ensInterruptEnabled +
                ", transportZones=" + transportZones +
                ", nsxtUsedUplinkNames=" + nsxtUsedUplinkNames +
                ", networkOffloadingEnabled=" + networkOffloadingEnabled +
                '}';
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public int getMaxProxySwitchPorts() {
        return maxProxySwitchPorts;
    }

    public void setMaxProxySwitchPorts(final int maxProxySwitchPorts) {
        this.maxProxySwitchPorts = maxProxySwitchPorts;
    }

    public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificConfig() {
        return vendorSpecificConfig;
    }

    public void setVendorSpecificConfig(final List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    public DistributedVirtualSwitchHostMemberBacking getBacking() {
        return backing;
    }

    public void setBacking(final DistributedVirtualSwitchHostMemberBacking backing) {
        this.backing = backing;
    }

    public Boolean getNsxSwitch() {
        return nsxSwitch;
    }

    public void setNsxSwitch(final Boolean nsxSwitch) {
        this.nsxSwitch = nsxSwitch;
    }

    public Boolean getEnsEnabled() {
        return ensEnabled;
    }

    public void setEnsEnabled(final Boolean ensEnabled) {
        this.ensEnabled = ensEnabled;
    }

    public Boolean getEnsInterruptEnabled() {
        return ensInterruptEnabled;
    }

    public void setEnsInterruptEnabled(final Boolean ensInterruptEnabled) {
        this.ensInterruptEnabled = ensInterruptEnabled;
    }

    public List<DistributedVirtualSwitchHostMemberTransportZoneInfo> getTransportZones() {
        return transportZones;
    }

    public void setTransportZones(final List<DistributedVirtualSwitchHostMemberTransportZoneInfo> transportZones) {
        this.transportZones = transportZones;
    }

    public List<String> getNsxtUsedUplinkNames() {
        return nsxtUsedUplinkNames;
    }

    public void setNsxtUsedUplinkNames(final List<String> nsxtUsedUplinkNames) {
        this.nsxtUsedUplinkNames = nsxtUsedUplinkNames;
    }

    public Boolean getNetworkOffloadingEnabled() {
        return networkOffloadingEnabled;
    }

    public void setNetworkOffloadingEnabled(final Boolean networkOffloadingEnabled) {
        this.networkOffloadingEnabled = networkOffloadingEnabled;
    }

}
