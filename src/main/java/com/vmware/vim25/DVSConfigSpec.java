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
 * The DVSConfigSpec data object contains configuration data for a DistributedVirtualSwitch.
 * Use the ReconfigureDvs_Task method to apply the configuration to the switch.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.7
 */

public class DVSConfigSpec extends DynamicData {

    private String configVersion;
    private DVSContactInfo contact;
    private DVPortSetting defaultPortConfig;
    private Integer defaultProxySwitchMaxNumPorts;
    private String description;
    private String extensionKey;
    private DistributedVirtualSwitchHostMemberConfigSpec[] host;
    private DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig;
    private Integer maxPorts;
    private String name;
    private DvsHostInfrastructureTrafficResource[] netResourcePoolTrafficResourceConfig;
    private String networkResourceControlVersion;
    private Integer numStandalonePorts;
    private DVSPolicy policy;
    private String switchIpAddress;
    private ManagedObjectReference[] uplinkPortgroup;
    private DVSUplinkPortPolicy uplinkPortPolicy;
    private DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;

    @Override
    public String toString() {
        return "DVSConfigSpec{" +
                "configVersion='" + configVersion + '\'' +
                ", contact=" + contact +
                ", defaultPortConfig=" + defaultPortConfig +
                ", defaultProxySwitchMaxNumPorts=" + defaultProxySwitchMaxNumPorts +
                ", description='" + description + '\'' +
                ", extensionKey='" + extensionKey + '\'' +
                ", host=" + Arrays.toString(host) +
                ", infrastructureTrafficResourceConfig=" + Arrays.toString(infrastructureTrafficResourceConfig) +
                ", maxPorts=" + maxPorts +
                ", name='" + name + '\'' +
                ", netResourcePoolTrafficResourceConfig=" + Arrays.toString(netResourcePoolTrafficResourceConfig) +
                ", networkResourceControlVersion='" + networkResourceControlVersion + '\'' +
                ", numStandalonePorts=" + numStandalonePorts +
                ", policy=" + policy +
                ", switchIpAddress='" + switchIpAddress + '\'' +
                ", uplinkPortgroup=" + Arrays.toString(uplinkPortgroup) +
                ", uplinkPortPolicy=" + uplinkPortPolicy +
                ", vendorSpecificConfig=" + Arrays.toString(vendorSpecificConfig) +
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

    public DistributedVirtualSwitchHostMemberConfigSpec[] getHost() {
        return host;
    }

    public void setHost(final DistributedVirtualSwitchHostMemberConfigSpec[] host) {
        this.host = host;
    }

    public DvsHostInfrastructureTrafficResource[] getInfrastructureTrafficResourceConfig() {
        return infrastructureTrafficResourceConfig;
    }

    public void setInfrastructureTrafficResourceConfig(final DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig) {
        this.infrastructureTrafficResourceConfig = infrastructureTrafficResourceConfig;
    }

    public Integer getMaxPorts() {
        return maxPorts;
    }

    public void setMaxPorts(final Integer maxPorts) {
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

    public Integer getNumStandalonePorts() {
        return numStandalonePorts;
    }

    public void setNumStandalonePorts(final Integer numStandalonePorts) {
        this.numStandalonePorts = numStandalonePorts;
    }

    public DVSPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(final DVSPolicy policy) {
        this.policy = policy;
    }

    public String getSwitchIpAddress() {
        return switchIpAddress;
    }

    public void setSwitchIpAddress(final String switchIpAddress) {
        this.switchIpAddress = switchIpAddress;
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

    public DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
        return vendorSpecificConfig;
    }

    public void setVendorSpecificConfig(final DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

}
