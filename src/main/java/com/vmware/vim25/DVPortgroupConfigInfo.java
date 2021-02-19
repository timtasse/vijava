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
 * The DVPortgroupConfigInfo data object defines the configuration of a DistributedVirtualPortgroup.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
public class DVPortgroupConfigInfo extends DynamicData {

    private String key;
    private String name;
    private int numPorts;
    private ManagedObjectReference distributedVirtualSwitch;
    private DVPortSetting defaultPortConfig;
    private String description;
    private String type;
    private String backingType;
    private DVPortgroupPolicy policy;
    private String portNameFormat;
    private ManagedObjectReference[] scope;
    private DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;
    private String configVersion;
    private Boolean autoExpand;
    private String vmVnicNetworkResourcePoolKey;
    private Boolean uplink;
    private String transportZoneUuid;
    private String transportZoneName;
    private String logicalSwitchUuid;
    private String segmentId;

    @Override
    public String toString() {
        return "DVPortgroupConfigInfo{" +
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", numPorts=" + numPorts +
                ", distributedVirtualSwitch=" + distributedVirtualSwitch +
                ", defaultPortConfig=" + defaultPortConfig +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", backingType='" + backingType + '\'' +
                ", policy=" + policy +
                ", portNameFormat='" + portNameFormat + '\'' +
                ", scope=" + Arrays.toString(scope) +
                ", vendorSpecificConfig=" + Arrays.toString(vendorSpecificConfig) +
                ", configVersion='" + configVersion + '\'' +
                ", autoExpand=" + autoExpand +
                ", vmVnicNetworkResourcePoolKey='" + vmVnicNetworkResourcePoolKey + '\'' +
                ", uplink=" + uplink +
                ", transportZoneUuid='" + transportZoneUuid + '\'' +
                ", transportZoneName='" + transportZoneName + '\'' +
                ", logicalSwitchUuid='" + logicalSwitchUuid + '\'' +
                ", segmentId='" + segmentId + '\'' +
                "} " + super.toString();
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public int getNumPorts() {
        return this.numPorts;
    }

    public ManagedObjectReference getDistributedVirtualSwitch() {
        return this.distributedVirtualSwitch;
    }

    public DVPortSetting getDefaultPortConfig() {
        return this.defaultPortConfig;
    }

    public String getDescription() {
        return this.description;
    }

    public String getType() {
        return this.type;
    }

    public DVPortgroupPolicy getPolicy() {
        return this.policy;
    }

    public String getPortNameFormat() {
        return this.portNameFormat;
    }

    @Deprecated
    public ManagedObjectReference[] getScope() {
        return this.scope;
    }

    public DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
        return this.vendorSpecificConfig;
    }

    public String getConfigVersion() {
        return this.configVersion;
    }

    public Boolean getAutoExpand() {
        return this.autoExpand;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }

    public void setDistributedVirtualSwitch(ManagedObjectReference distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }

    public void setDefaultPortConfig(DVPortSetting defaultPortConfig) {
        this.defaultPortConfig = defaultPortConfig;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPolicy(DVPortgroupPolicy policy) {
        this.policy = policy;
    }

    public void setPortNameFormat(String portNameFormat) {
        this.portNameFormat = portNameFormat;
    }

    @Deprecated
    public void setScope(ManagedObjectReference[] scope) {
        this.scope = scope;
    }

    public void setVendorSpecificConfig(DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

    public void setAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
    }

    public Boolean isUplink() {
        return uplink;
    }

    public void setUplink(final Boolean uplink) {
        this.uplink = uplink;
    }

    public String getVmVnicNetworkResourcePoolKey() {
        return vmVnicNetworkResourcePoolKey;
    }

    public void setVmVnicNetworkResourcePoolKey(final String vmVnicNetworkResourcePoolKey) {
        this.vmVnicNetworkResourcePoolKey = vmVnicNetworkResourcePoolKey;
    }

    public String getBackingType() {
        return backingType;
    }

    public void setBackingType(final String backingType) {
        this.backingType = backingType;
    }

    public Boolean getUplink() {
        return uplink;
    }

    public String getTransportZoneUuid() {
        return transportZoneUuid;
    }

    public void setTransportZoneUuid(final String transportZoneUuid) {
        this.transportZoneUuid = transportZoneUuid;
    }

    public String getTransportZoneName() {
        return transportZoneName;
    }

    public void setTransportZoneName(final String transportZoneName) {
        this.transportZoneName = transportZoneName;
    }

    public String getLogicalSwitchUuid() {
        return logicalSwitchUuid;
    }

    public void setLogicalSwitchUuid(final String logicalSwitchUuid) {
        this.logicalSwitchUuid = logicalSwitchUuid;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(final String segmentId) {
        this.segmentId = segmentId;
    }

}
