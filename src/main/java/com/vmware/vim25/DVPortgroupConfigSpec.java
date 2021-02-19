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
 * The DVPortgroupConfigSpec data object contains configuration data for a DistributedVirtualPortgroup.
 * Use the ReconfigureDVPortgroup_Task method to apply the configuration to the portgroup.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
public class DVPortgroupConfigSpec extends DynamicData {

    private String configVersion;
    private String name;
    private Integer numPorts;
    private String portNameFormat;
    private DVPortSetting defaultPortConfig;
    private String description;
    private String type;
    private String backingType;
    private ManagedObjectReference[] scope;
    private DVPortgroupPolicy policy;
    private DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;
    private Boolean autoExpand;
    private String vmVnicNetworkResourcePoolKey;
    private String transportZoneUuid;
    private String transportZoneName;
    private String logicalSwitchUuid;
    private String segmentId;

    @Override
    public String toString() {
        return "DVPortgroupConfigSpec{" +
                "configVersion='" + configVersion + '\'' +
                ", name='" + name + '\'' +
                ", numPorts=" + numPorts +
                ", portNameFormat='" + portNameFormat + '\'' +
                ", defaultPortConfig=" + defaultPortConfig +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", backingType='" + backingType + '\'' +
                ", scope=" + Arrays.toString(scope) +
                ", policy=" + policy +
                ", vendorSpecificConfig=" + Arrays.toString(vendorSpecificConfig) +
                ", autoExpand=" + autoExpand +
                ", vmVnicNetworkResourcePoolKey='" + vmVnicNetworkResourcePoolKey + '\'' +
                ", transportZoneUuid='" + transportZoneUuid + '\'' +
                ", transportZoneName='" + transportZoneName + '\'' +
                ", logicalSwitchUuid='" + logicalSwitchUuid + '\'' +
                ", segmentId='" + segmentId + '\'' +
                "} " + super.toString();
    }

    public String getConfigVersion() {
        return this.configVersion;
    }

    public String getName() {
        return this.name;
    }

    public Integer getNumPorts() {
        return this.numPorts;
    }

    public String getPortNameFormat() {
        return this.portNameFormat;
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

    @Deprecated
    public ManagedObjectReference[] getScope() {
        return this.scope;
    }

    public DVPortgroupPolicy getPolicy() {
        return this.policy;
    }

    public DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
        return this.vendorSpecificConfig;
    }

    public Boolean getAutoExpand() {
        return this.autoExpand;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumPorts(Integer numPorts) {
        this.numPorts = numPorts;
    }

    public void setPortNameFormat(String portNameFormat) {
        this.portNameFormat = portNameFormat;
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

    @Deprecated
    public void setScope(ManagedObjectReference[] scope) {
        this.scope = scope;
    }

    public void setPolicy(DVPortgroupPolicy policy) {
        this.policy = policy;
    }

    public void setVendorSpecificConfig(DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    public void setAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
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
