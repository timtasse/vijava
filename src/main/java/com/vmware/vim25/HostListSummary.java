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
 * This data object type encapsulates a typical set of host information that is useful for list views and summary pages.
 * VirtualCenter can retrieve this information very efficiently, even for a large set of hosts.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.7
 */

@SuppressWarnings("all")
public class HostListSummary extends DynamicData {

    private HostConfigSummary config;
    private String currentEVCModeKey;
    private CustomFieldValue[] customValue;
    private HostListSummaryGatewaySummary gateway;
    private HostHardwareSummary hardware;
    private ManagedObjectReference host;
    private String managementServerIp;
    private String maxEVCModeKey;
    private ManagedEntityStatus overallStatus;
    private HostListSummaryQuickStats quickStats;
    private boolean rebootRequired;
    private HostRuntimeInfo runtime;
    private HostTpmAttestationInfo tpmAttestation;

    @Override
    public String toString() {
        return "HostListSummary{" +
                "config=" + config +
                ", currentEVCModeKey='" + currentEVCModeKey + '\'' +
                ", customValue=" + Arrays.toString(customValue) +
                ", gateway=" + gateway +
                ", hardware=" + hardware +
                ", host=" + host +
                ", managementServerIp='" + managementServerIp + '\'' +
                ", maxEVCModeKey='" + maxEVCModeKey + '\'' +
                ", overallStatus=" + overallStatus +
                ", quickStats=" + quickStats +
                ", rebootRequired=" + rebootRequired +
                ", runtime=" + runtime +
                ", tpmAttestation=" + tpmAttestation +
                "} " + super.toString();
    }

    public ManagedObjectReference getHost() {
        return this.host;
    }

    public void setHost(ManagedObjectReference host) {
        this.host = host;
    }

    public HostHardwareSummary getHardware() {
        return this.hardware;
    }

    public void setHardware(HostHardwareSummary hardware) {
        this.hardware = hardware;
    }

    public HostRuntimeInfo getRuntime() {
        return this.runtime;
    }

    public void setRuntime(HostRuntimeInfo runtime) {
        this.runtime = runtime;
    }

    public HostConfigSummary getConfig() {
        return this.config;
    }

    public void setConfig(HostConfigSummary config) {
        this.config = config;
    }

    public HostListSummaryQuickStats getQuickStats() {
        return this.quickStats;
    }

    public void setQuickStats(HostListSummaryQuickStats quickStats) {
        this.quickStats = quickStats;
    }

    public ManagedEntityStatus getOverallStatus() {
        return this.overallStatus;
    }

    public void setOverallStatus(ManagedEntityStatus overallStatus) {
        this.overallStatus = overallStatus;
    }

    public boolean isRebootRequired() {
        return this.rebootRequired;
    }

    public void setRebootRequired(boolean rebootRequired) {
        this.rebootRequired = rebootRequired;
    }

    public CustomFieldValue[] getCustomValue() {
        return this.customValue;
    }

    public void setCustomValue(CustomFieldValue[] customValue) {
        this.customValue = customValue;
    }

    public String getManagementServerIp() {
        return this.managementServerIp;
    }

    public void setManagementServerIp(String managementServerIp) {
        this.managementServerIp = managementServerIp;
    }

    public String getMaxEVCModeKey() {
        return this.maxEVCModeKey;
    }

    public void setMaxEVCModeKey(String maxEVCModeKey) {
        this.maxEVCModeKey = maxEVCModeKey;
    }

    public String getCurrentEVCModeKey() {
        return this.currentEVCModeKey;
    }

    public void setCurrentEVCModeKey(String currentEVCModeKey) {
        this.currentEVCModeKey = currentEVCModeKey;
    }

    public HostListSummaryGatewaySummary getGateway() {
        return gateway;
    }

    public void setGateway(final HostListSummaryGatewaySummary gateway) {
        this.gateway = gateway;
    }

    public HostTpmAttestationInfo getTpmAttestation() {
        return tpmAttestation;
    }

    public void setTpmAttestation(final HostTpmAttestationInfo tpmAttestation) {
        this.tpmAttestation = tpmAttestation;
    }

}
