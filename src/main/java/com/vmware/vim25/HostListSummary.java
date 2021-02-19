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
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.1
 */
@SuppressWarnings("unused")
public class HostListSummary extends DynamicData {

    private ManagedObjectReference host;
    private HostHardwareSummary hardware;
    private HostRuntimeInfo runtime;
    private HostConfigSummary config;
    private HostListSummaryQuickStats quickStats;
    private ManagedEntityStatus overallStatus;
    private boolean rebootRequired;
    private CustomFieldValue[] customValue;
    private String managementServerIp;
    private String maxEVCModeKey;
    private String currentEVCModeKey;
    private String currentEVCGraphicsModeKey;
    private HostListSummaryGatewaySummary gateway;
    private HostTpmAttestationInfo tpmAttestation;
    private HostTrustAuthorityAttestationInfo trustAuthorityAttestationInfos;

    @Override
    public String toString() {
        return "HostListSummary{" +
                "host=" + host +
                ", hardware=" + hardware +
                ", runtime=" + runtime +
                ", config=" + config +
                ", quickStats=" + quickStats +
                ", overallStatus=" + overallStatus +
                ", rebootRequired=" + rebootRequired +
                ", customValue=" + Arrays.toString(customValue) +
                ", managementServerIp='" + managementServerIp + '\'' +
                ", maxEVCModeKey='" + maxEVCModeKey + '\'' +
                ", currentEVCModeKey='" + currentEVCModeKey + '\'' +
                ", currentEVCGraphicsModeKey='" + currentEVCGraphicsModeKey + '\'' +
                ", gateway=" + gateway +
                ", tpmAttestation=" + tpmAttestation +
                ", trustAuthorityAttestationInfos=" + trustAuthorityAttestationInfos +
                "} " + super.toString();
    }

    public ManagedObjectReference getHost() {
        return this.host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public HostHardwareSummary getHardware() {
        return this.hardware;
    }

    public void setHardware(final HostHardwareSummary hardware) {
        this.hardware = hardware;
    }

    public HostRuntimeInfo getRuntime() {
        return this.runtime;
    }

    public void setRuntime(final HostRuntimeInfo runtime) {
        this.runtime = runtime;
    }

    public HostConfigSummary getConfig() {
        return this.config;
    }

    public void setConfig(final HostConfigSummary config) {
        this.config = config;
    }

    public HostListSummaryQuickStats getQuickStats() {
        return this.quickStats;
    }

    public void setQuickStats(final HostListSummaryQuickStats quickStats) {
        this.quickStats = quickStats;
    }

    public ManagedEntityStatus getOverallStatus() {
        return this.overallStatus;
    }

    public void setOverallStatus(final ManagedEntityStatus overallStatus) {
        this.overallStatus = overallStatus;
    }

    public boolean isRebootRequired() {
        return this.rebootRequired;
    }

    public void setRebootRequired(final boolean rebootRequired) {
        this.rebootRequired = rebootRequired;
    }

    public CustomFieldValue[] getCustomValue() {
        return this.customValue;
    }

    public void setCustomValue(final CustomFieldValue[] customValue) {
        this.customValue = customValue;
    }

    public String getManagementServerIp() {
        return this.managementServerIp;
    }

    public void setManagementServerIp(final String managementServerIp) {
        this.managementServerIp = managementServerIp;
    }

    public String getMaxEVCModeKey() {
        return this.maxEVCModeKey;
    }

    public void setMaxEVCModeKey(final String maxEVCModeKey) {
        this.maxEVCModeKey = maxEVCModeKey;
    }

    public String getCurrentEVCModeKey() {
        return this.currentEVCModeKey;
    }

    public void setCurrentEVCModeKey(final String currentEVCModeKey) {
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

    public String getCurrentEVCGraphicsModeKey() {
        return currentEVCGraphicsModeKey;
    }

    public void setCurrentEVCGraphicsModeKey(final String currentEVCGraphicsModeKey) {
        this.currentEVCGraphicsModeKey = currentEVCGraphicsModeKey;
    }

    public HostTrustAuthorityAttestationInfo getTrustAuthorityAttestationInfos() {
        return trustAuthorityAttestationInfos;
    }

    public void setTrustAuthorityAttestationInfos(final HostTrustAuthorityAttestationInfo trustAuthorityAttestationInfos) {
        this.trustAuthorityAttestationInfos = trustAuthorityAttestationInfos;
    }

}
