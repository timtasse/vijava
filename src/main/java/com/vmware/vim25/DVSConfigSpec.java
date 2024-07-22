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
import java.util.List;

/**
 * The DVSConfigSpec data object contains configuration data for a DistributedVirtualSwitch.
 * Use the ReconfigureDvs_Task method to apply the configuration to the switch.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.7
 */
@SuppressWarnings("unused")
public class DVSConfigSpec extends DynamicData {

    private String configVersion;
    private String name;
    private Integer numStandalonePorts;
    private Integer maxPorts;
    private DVSUplinkPortPolicy uplinkPortPolicy;
    private List<ManagedObjectReference> uplinkPortgroup;
    private DVPortSetting defaultPortConfig;
    private List<DistributedVirtualSwitchHostMemberConfigSpec> host;
    private String extensionKey;
    private String description;
    private DVSPolicy policy;
    private List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig;
    private DVSContactInfo contact;
    private String switchIpAddress;
    private Integer defaultProxySwitchMaxNumPorts;
    private List<DvsHostInfrastructureTrafficResource> infrastructureTrafficResourceConfig;
    private List<DvsHostInfrastructureTrafficResource> netResourcePoolTrafficResourceConfig;
    private String networkResourceControlVersion;

    @Override
    public String toString() {
        return "DVSConfigSpec{" +
                "configVersion='" + configVersion + '\'' +
                ", name='" + name + '\'' +
                ", numStandalonePorts=" + numStandalonePorts +
                ", maxPorts=" + maxPorts +
                ", uplinkPortPolicy=" + uplinkPortPolicy +
                ", uplinkPortgroup=" + uplinkPortgroup +
                ", defaultPortConfig=" + defaultPortConfig +
                ", host=" + host +
                ", extensionKey='" + extensionKey + '\'' +
                ", description='" + description + '\'' +
                ", policy=" + policy +
                ", vendorSpecificConfig=" + vendorSpecificConfig +
                ", contact=" + contact +
                ", switchIpAddress='" + switchIpAddress + '\'' +
                ", defaultProxySwitchMaxNumPorts=" + defaultProxySwitchMaxNumPorts +
                ", infrastructureTrafficResourceConfig=" + infrastructureTrafficResourceConfig +
                ", netResourcePoolTrafficResourceConfig=" + netResourcePoolTrafficResourceConfig +
                ", networkResourceControlVersion='" + networkResourceControlVersion + '\'' +
                '}';
    }

    public String getConfigVersion() {
        return configVersion;
    }

    public void setConfigVersion(final String configVersion) {
        this.configVersion = configVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getNumStandalonePorts() {
        return numStandalonePorts;
    }

    public void setNumStandalonePorts(final Integer numStandalonePorts) {
        this.numStandalonePorts = numStandalonePorts;
    }

    public Integer getMaxPorts() {
        return maxPorts;
    }

    public void setMaxPorts(final Integer maxPorts) {
        this.maxPorts = maxPorts;
    }

    public DVSUplinkPortPolicy getUplinkPortPolicy() {
        return uplinkPortPolicy;
    }

    public void setUplinkPortPolicy(final DVSUplinkPortPolicy uplinkPortPolicy) {
        this.uplinkPortPolicy = uplinkPortPolicy;
    }

    public List<ManagedObjectReference> getUplinkPortgroup() {
        return uplinkPortgroup;
    }

    public void setUplinkPortgroup(final List<ManagedObjectReference> uplinkPortgroup) {
        this.uplinkPortgroup = uplinkPortgroup;
    }

    public DVPortSetting getDefaultPortConfig() {
        return defaultPortConfig;
    }

    public void setDefaultPortConfig(final DVPortSetting defaultPortConfig) {
        this.defaultPortConfig = defaultPortConfig;
    }

    public List<DistributedVirtualSwitchHostMemberConfigSpec> getHost() {
        return host;
    }

    public void setHost(final List<DistributedVirtualSwitchHostMemberConfigSpec> host) {
        this.host = host;
    }

    public String getExtensionKey() {
        return extensionKey;
    }

    public void setExtensionKey(final String extensionKey) {
        this.extensionKey = extensionKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public DVSPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(final DVSPolicy policy) {
        this.policy = policy;
    }

    public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificConfig() {
        return vendorSpecificConfig;
    }

    public void setVendorSpecificConfig(final List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    public DVSContactInfo getContact() {
        return contact;
    }

    public void setContact(final DVSContactInfo contact) {
        this.contact = contact;
    }

    public String getSwitchIpAddress() {
        return switchIpAddress;
    }

    public void setSwitchIpAddress(final String switchIpAddress) {
        this.switchIpAddress = switchIpAddress;
    }

    public Integer getDefaultProxySwitchMaxNumPorts() {
        return defaultProxySwitchMaxNumPorts;
    }

    public void setDefaultProxySwitchMaxNumPorts(final Integer defaultProxySwitchMaxNumPorts) {
        this.defaultProxySwitchMaxNumPorts = defaultProxySwitchMaxNumPorts;
    }

    public List<DvsHostInfrastructureTrafficResource> getInfrastructureTrafficResourceConfig() {
        return infrastructureTrafficResourceConfig;
    }

    public void setInfrastructureTrafficResourceConfig(final List<DvsHostInfrastructureTrafficResource> infrastructureTrafficResourceConfig) {
        this.infrastructureTrafficResourceConfig = infrastructureTrafficResourceConfig;
    }

    public List<DvsHostInfrastructureTrafficResource> getNetResourcePoolTrafficResourceConfig() {
        return netResourcePoolTrafficResourceConfig;
    }

    public void setNetResourcePoolTrafficResourceConfig(final List<DvsHostInfrastructureTrafficResource> netResourcePoolTrafficResourceConfig) {
        this.netResourcePoolTrafficResourceConfig = netResourcePoolTrafficResourceConfig;
    }

    public String getNetworkResourceControlVersion() {
        return networkResourceControlVersion;
    }

    public void setNetworkResourceControlVersion(final String networkResourceControlVersion) {
        this.networkResourceControlVersion = networkResourceControlVersion;
    }

}
