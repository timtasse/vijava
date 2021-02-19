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
 * The DistributedVirtualSwitchHostMemberConfigInfo data object contains membership configuration information for the ESXi host.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
public class DistributedVirtualSwitchHostMemberConfigInfo extends DynamicData {

    private ManagedObjectReference host;
    private int maxProxySwitchPorts;
    private DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;
    private DistributedVirtualSwitchHostMemberBacking backing;
    private Boolean nsxSwitch;
    private Boolean ensEnabled;
    private Boolean ensInterruptEnabled;
    private DistributedVirtualSwitchHostMemberTransportZoneInfo[] transportZones;
    private String[] nsxtUsedUplinkNames;

    @Override
    public String toString() {
        return "DistributedVirtualSwitchHostMemberConfigInfo{" +
                "host=" + host +
                ", maxProxySwitchPorts=" + maxProxySwitchPorts +
                ", vendorSpecificConfig=" + Arrays.toString(vendorSpecificConfig) +
                ", backing=" + backing +
                ", nsxSwitch=" + nsxSwitch +
                ", ensEnabled=" + ensEnabled +
                ", ensInterruptEnabled=" + ensInterruptEnabled +
                ", transportZones=" + Arrays.toString(transportZones) +
                ", nsxtUsedUplinkNames=" + Arrays.toString(nsxtUsedUplinkNames) +
                "} " + super.toString();
    }

    public ManagedObjectReference getHost() {
        return this.host;
    }

    public void setHost(ManagedObjectReference host) {
        this.host = host;
    }

    public int getMaxProxySwitchPorts() {
        return this.maxProxySwitchPorts;
    }

    public void setMaxProxySwitchPorts(int maxProxySwitchPorts) {
        this.maxProxySwitchPorts = maxProxySwitchPorts;
    }

    public DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
        return this.vendorSpecificConfig;
    }

    public void setVendorSpecificConfig(DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    public DistributedVirtualSwitchHostMemberBacking getBacking() {
        return this.backing;
    }

    public void setBacking(DistributedVirtualSwitchHostMemberBacking backing) {
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

    public DistributedVirtualSwitchHostMemberTransportZoneInfo[] getTransportZones() {
        return transportZones;
    }

    public void setTransportZones(final DistributedVirtualSwitchHostMemberTransportZoneInfo[] transportZones) {
        this.transportZones = transportZones;
    }

    public String[] getNsxtUsedUplinkNames() {
        return nsxtUsedUplinkNames;
    }

    public void setNsxtUsedUplinkNames(final String[] nsxtUsedUplinkNames) {
        this.nsxtUsedUplinkNames = nsxtUsedUplinkNames;
    }

}
