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
import java.util.Calendar;

/**
 * Configuration of a DistributedVirtualSwitch.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */

public class DVSConfigInfo extends DynamicData {

    private String configVersion;
    private DVSContactInfo contact;
    private Calendar createTime;
    private DVPortSetting defaultPortConfig;
    private Integer defaultProxySwitchMaxNumPorts;
    private String description;
    private String extensionKey;
    private DVSHealthCheckConfig[] healthCheckConfig;
    private DistributedVirtualSwitchHostMember[] host;
    private DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig;
    private int maxPorts;
    private String name;
    private DvsHostInfrastructureTrafficResource[] netResourcePoolTrafficResourceConfig;
    private String networkResourceControlVersion;
    private boolean networkResourceManagementEnabled;
    private int numPorts;
    private int numStandalonePorts;
    private Integer pnicCapacityRatioForReservation;
    private DVSPolicy policy;
    private DistributedVirtualSwitchProductSpec productInfo;
    private String switchIpAddress;
    private DistributedVirtualSwitchProductSpec targetInfo;
    private ManagedObjectReference[] uplinkPortgroup;
    private DVSUplinkPortPolicy uplinkPortPolicy;
    private String uuid;
    private DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;
    private DVSVmVnicNetworkResourcePool[] vmVnicNetworkResourcePool;

    @Override
    public String toString() {
        return "DVSConfigInfo{" +
                "configVersion='" + configVersion + '\'' +
                ", contact=" + contact +
                ", createTime=" + createTime +
                ", defaultPortConfig=" + defaultPortConfig +
                ", defaultProxySwitchMaxNumPorts=" + defaultProxySwitchMaxNumPorts +
                ", description='" + description + '\'' +
                ", extensionKey='" + extensionKey + '\'' +
                ", healthCheckConfig=" + Arrays.toString(healthCheckConfig) +
                ", host=" + Arrays.toString(host) +
                ", infrastructureTrafficResourceConfig=" + Arrays.toString(infrastructureTrafficResourceConfig) +
                ", maxPorts=" + maxPorts +
                ", name='" + name + '\'' +
                ", netResourcePoolTrafficResourceConfig=" + Arrays.toString(netResourcePoolTrafficResourceConfig) +
                ", networkResourceControlVersion='" + networkResourceControlVersion + '\'' +
                ", networkResourceManagementEnabled=" + networkResourceManagementEnabled +
                ", numPorts=" + numPorts +
                ", numStandalonePorts=" + numStandalonePorts +
                ", pnicCapacityRatioForReservation=" + pnicCapacityRatioForReservation +
                ", policy=" + policy +
                ", productInfo=" + productInfo +
                ", switchIpAddress='" + switchIpAddress + '\'' +
                ", targetInfo=" + targetInfo +
                ", uplinkPortgroup=" + Arrays.toString(uplinkPortgroup) +
                ", uplinkPortPolicy=" + uplinkPortPolicy +
                ", uuid='" + uuid + '\'' +
                ", vendorSpecificConfig=" + Arrays.toString(vendorSpecificConfig) +
                ", vmVnicNetworkResourcePool=" + Arrays.toString(vmVnicNetworkResourcePool) +
                "} " + super.toString();
    }

    public String getConfigVersion() {
        return configVersion;
    }

    public void setConfigVersion(final String configVersion) {
        this.configVersion = configVersion;
    }

    public DVSContactInfo getContact() {
        return contact;
    }

    public void setContact(final DVSContactInfo contact) {
        this.contact = contact;
    }

    public Calendar getCreateTime() {
        return createTime;
    }

    public void setCreateTime(final Calendar createTime) {
        this.createTime = createTime;
    }

    public DVPortSetting getDefaultPortConfig() {
        return defaultPortConfig;
    }

    public void setDefaultPortConfig(final DVPortSetting defaultPortConfig) {
        this.defaultPortConfig = defaultPortConfig;
    }

    public Integer getDefaultProxySwitchMaxNumPorts() {
        return defaultProxySwitchMaxNumPorts;
    }

    public void setDefaultProxySwitchMaxNumPorts(final Integer defaultProxySwitchMaxNumPorts) {
        this.defaultProxySwitchMaxNumPorts = defaultProxySwitchMaxNumPorts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getExtensionKey() {
        return extensionKey;
    }

    public void setExtensionKey(final String extensionKey) {
        this.extensionKey = extensionKey;
    }

    public DVSHealthCheckConfig[] getHealthCheckConfig() {
        return healthCheckConfig;
    }

    public void setHealthCheckConfig(final DVSHealthCheckConfig[] healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    public DistributedVirtualSwitchHostMember[] getHost() {
        return host;
    }

    public void setHost(final DistributedVirtualSwitchHostMember[] host) {
        this.host = host;
    }

    public DvsHostInfrastructureTrafficResource[] getInfrastructureTrafficResourceConfig() {
        return infrastructureTrafficResourceConfig;
    }

    public void setInfrastructureTrafficResourceConfig(final DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig) {
        this.infrastructureTrafficResourceConfig = infrastructureTrafficResourceConfig;
    }

    public int getMaxPorts() {
        return maxPorts;
    }

    public void setMaxPorts(final int maxPorts) {
        this.maxPorts = maxPorts;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public DvsHostInfrastructureTrafficResource[] getNetResourcePoolTrafficResourceConfig() {
        return netResourcePoolTrafficResourceConfig;
    }

    public void setNetResourcePoolTrafficResourceConfig(final DvsHostInfrastructureTrafficResource[] netResourcePoolTrafficResourceConfig) {
        this.netResourcePoolTrafficResourceConfig = netResourcePoolTrafficResourceConfig;
    }

    public String getNetworkResourceControlVersion() {
        return networkResourceControlVersion;
    }

    public void setNetworkResourceControlVersion(final String networkResourceControlVersion) {
        this.networkResourceControlVersion = networkResourceControlVersion;
    }

    public boolean isNetworkResourceManagementEnabled() {
        return networkResourceManagementEnabled;
    }

    public void setNetworkResourceManagementEnabled(final boolean networkResourceManagementEnabled) {
        this.networkResourceManagementEnabled = networkResourceManagementEnabled;
    }

    public int getNumPorts() {
        return numPorts;
    }

    public void setNumPorts(final int numPorts) {
        this.numPorts = numPorts;
    }

    public int getNumStandalonePorts() {
        return numStandalonePorts;
    }

    public void setNumStandalonePorts(final int numStandalonePorts) {
        this.numStandalonePorts = numStandalonePorts;
    }

    public Integer getPnicCapacityRatioForReservation() {
        return pnicCapacityRatioForReservation;
    }

    public void setPnicCapacityRatioForReservation(final Integer pnicCapacityRatioForReservation) {
        this.pnicCapacityRatioForReservation = pnicCapacityRatioForReservation;
    }

    public DVSPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(final DVSPolicy policy) {
        this.policy = policy;
    }

    public DistributedVirtualSwitchProductSpec getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(final DistributedVirtualSwitchProductSpec productInfo) {
        this.productInfo = productInfo;
    }

    public String getSwitchIpAddress() {
        return switchIpAddress;
    }

    public void setSwitchIpAddress(final String switchIpAddress) {
        this.switchIpAddress = switchIpAddress;
    }

    public DistributedVirtualSwitchProductSpec getTargetInfo() {
        return targetInfo;
    }

    public void setTargetInfo(final DistributedVirtualSwitchProductSpec targetInfo) {
        this.targetInfo = targetInfo;
    }

    public ManagedObjectReference[] getUplinkPortgroup() {
        return uplinkPortgroup;
    }

    public void setUplinkPortgroup(final ManagedObjectReference[] uplinkPortgroup) {
        this.uplinkPortgroup = uplinkPortgroup;
    }

    public DVSUplinkPortPolicy getUplinkPortPolicy() {
        return uplinkPortPolicy;
    }

    public void setUplinkPortPolicy(final DVSUplinkPortPolicy uplinkPortPolicy) {
        this.uplinkPortPolicy = uplinkPortPolicy;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
        return vendorSpecificConfig;
    }

    public void setVendorSpecificConfig(final DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    public DVSVmVnicNetworkResourcePool[] getVmVnicNetworkResourcePool() {
        return vmVnicNetworkResourcePool;
    }

    public void setVmVnicNetworkResourcePool(final DVSVmVnicNetworkResourcePool[] vmVnicNetworkResourcePool) {
        this.vmVnicNetworkResourcePool = vmVnicNetworkResourcePool;
    }

}
