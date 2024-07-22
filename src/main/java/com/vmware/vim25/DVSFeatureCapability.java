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
 * The DVSFeatureCapability data object represents the capabilities supported by a DistributedVirtualSwitch.
 * These properties are read-only with the exception of vmDirectPathGen2Supported.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */
@SuppressWarnings("unused")
public class DVSFeatureCapability extends DynamicData {

    private boolean networkResourceManagementSupported;
    private Boolean vmDirectPathGen2Supported;
    private List<String> nicTeamingPolicy = List.of();
    private Integer networkResourcePoolHighShareValue;
    private DVSNetworkResourceManagementCapability networkResourceManagementCapability;
    private DVSHealthCheckCapability healthCheckCapability;
    private DVSRollbackCapability rollbackCapability;
    private DVSBackupRestoreCapability backupRestoreCapability;
    private Boolean networkFilterSupported;
    private Boolean macLearningSupported;

    @Override
    public String toString() {
        return "DVSFeatureCapability{" +
                "networkResourceManagementSupported=" + networkResourceManagementSupported +
                ", vmDirectPathGen2Supported=" + vmDirectPathGen2Supported +
                ", nicTeamingPolicy=" + nicTeamingPolicy +
                ", networkResourcePoolHighShareValue=" + networkResourcePoolHighShareValue +
                ", networkResourceManagementCapability=" + networkResourceManagementCapability +
                ", healthCheckCapability=" + healthCheckCapability +
                ", rollbackCapability=" + rollbackCapability +
                ", backupRestoreCapability=" + backupRestoreCapability +
                ", networkFilterSupported=" + networkFilterSupported +
                ", macLearningSupported=" + macLearningSupported +
                '}';
    }

    public DVSBackupRestoreCapability getBackupRestoreCapability() {
        return backupRestoreCapability;
    }

    public void setBackupRestoreCapability(final DVSBackupRestoreCapability backupRestoreCapability) {
        this.backupRestoreCapability = backupRestoreCapability;
    }

    public DVSHealthCheckCapability getHealthCheckCapability() {
        return healthCheckCapability;
    }

    public void setHealthCheckCapability(final DVSHealthCheckCapability healthCheckCapability) {
        this.healthCheckCapability = healthCheckCapability;
    }

    public Boolean getMacLearningSupported() {
        return macLearningSupported;
    }

    public void setMacLearningSupported(final Boolean macLearningSupported) {
        this.macLearningSupported = macLearningSupported;
    }

    public Boolean getNetworkFilterSupported() {
        return networkFilterSupported;
    }

    public void setNetworkFilterSupported(final Boolean networkFilterSupported) {
        this.networkFilterSupported = networkFilterSupported;
    }

    public DVSNetworkResourceManagementCapability getNetworkResourceManagementCapability() {
        return networkResourceManagementCapability;
    }

    public void setNetworkResourceManagementCapability(final DVSNetworkResourceManagementCapability networkResourceManagementCapability) {
        this.networkResourceManagementCapability = networkResourceManagementCapability;
    }

    public boolean isNetworkResourceManagementSupported() {
        return networkResourceManagementSupported;
    }

    public void setNetworkResourceManagementSupported(final boolean networkResourceManagementSupported) {
        this.networkResourceManagementSupported = networkResourceManagementSupported;
    }

    public Integer getNetworkResourcePoolHighShareValue() {
        return networkResourcePoolHighShareValue;
    }

    public void setNetworkResourcePoolHighShareValue(final Integer networkResourcePoolHighShareValue) {
        this.networkResourcePoolHighShareValue = networkResourcePoolHighShareValue;
    }

    public List<String> getNicTeamingPolicy() {
        return nicTeamingPolicy;
    }

    public void setNicTeamingPolicy(final List<String> nicTeamingPolicy) {
        this.nicTeamingPolicy = nicTeamingPolicy;
    }

    public DVSRollbackCapability getRollbackCapability() {
        return rollbackCapability;
    }

    public void setRollbackCapability(final DVSRollbackCapability rollbackCapability) {
        this.rollbackCapability = rollbackCapability;
    }

    public boolean isVmDirectPathGen2Supported() {
        return vmDirectPathGen2Supported;
    }

    public void setVmDirectPathGen2Supported(final boolean vmDirectPathGen2Supported) {
        this.vmDirectPathGen2Supported = vmDirectPathGen2Supported;
    }
}
