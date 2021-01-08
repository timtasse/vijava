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
 * Specifies the capabilities of the particular host.
 * This set of capabilities is referenced in other parts of the API specification to indicate under what circumstances an API will throw a NotSupported fault.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.7.2
 */

public class HostCapability extends DynamicData {

    private boolean accel3dSupported;
    private boolean backgroundSnapshotsSupported;
    private boolean cloneFromSnapshotSupported;
    private Boolean cpuHwMmuSupported;
    private boolean cpuMemoryResourceConfigurationSupported;
    private Boolean cryptoSupported;
    private boolean datastorePrincipalSupported;
    private boolean deltaDiskBackingsSupported;
    private boolean eightPlusHostVmfsSharedAccessSupported;
    private Boolean encryptedVMotionSupported;
    private Boolean encryptionCBRCSupported;
    private Boolean encryptionChangeOnAddRemoveSupported;
    private Boolean encryptionFaultToleranceSupported;
    private Boolean encryptionHBRSupported;
    private Boolean encryptionHotOperationSupported;
    private Boolean encryptionMemorySaveSupported;
    private Boolean encryptionRDMSupported;
    private Boolean encryptionVFlashSupported;
    private Boolean encryptionWithSnapshotsSupported;
    private boolean featureCapabilitiesSupported;
    private Boolean firewallIpRulesSupported;
    @Deprecated
    private String[] ftCompatibilityIssues;
    private Boolean ftEfiSupported;
    @Deprecated
    private boolean ftSupported;
    private Boolean ftVmcpSupported;
    private Boolean gatewayOnNicSupported;
    private boolean hbrNicSelectionSupported;
    private boolean highGuestMemSupported;
    private Boolean hostAccessManagerSupported;
    private boolean interVMCommunicationThroughVMCISupported;
    private Boolean ipmiSupported;
    private boolean iscsiSupported;
    private boolean latencySensitivitySupported;
    private boolean localSwapDatastoreSupported;
    private Boolean loginBySSLThumbprintSupported;
    private boolean maintenanceModeSupported;
    private Boolean markAsLocalSupported;
    private Boolean markAsSsdSupported;
    private Boolean markPerenniallyReservedSupported;
    private Integer maxHostRunningVms;
    private Integer maxHostSupportedVcpus;
    private Integer maxMemMBPerFtVm;
    private Integer maxNumDisksSVMotion;
    private Integer maxRegisteredVMs;
    private Integer maxRunningVMs;
    private Integer maxSupportedVcpus;
    private Integer maxSupportedVMs;
    private Integer maxVcpusPerFtVm;
    private Boolean messageBusProxySupported;
    private Boolean multipleNetworkStackInstanceSupported;
    private boolean nestedHVSupported;
    private Boolean nfs41Krb5iSupported;
    private Boolean nfs41Supported;
    private boolean nfsSupported;
    private boolean nicTeamingSupported;
    private Boolean oneKVolumeAPIsSupported;
    private boolean perVMNetworkTrafficShapingSupported;
    private boolean perVmSwapFiles;
    private Boolean pMemSnapshotSupported;
    private Boolean pMemSupported;
    private boolean preAssignedPCIUnitNumbersSupported;
    private boolean provisioningNicSelectionSupported;
    private Boolean quickBootSupported;
    private boolean rebootSupported;
    @Deprecated
    private boolean recordReplaySupported;
    private boolean recursiveResourcePoolsSupported;
    private Boolean reliableMemoryAware;
    @Deprecated
    private String[] replayCompatibilityIssues;
    @Deprecated
    private String replayUnsupportedReason;
    private boolean restrictedSnapshotRelocateSupported;
    private boolean sanSupported;
    private boolean scaledScreenshotSupported;
    private Boolean scheduledHardwareUpgradeSupported;
    private boolean screenshotSupported;
    private Boolean servicePackageInfoSupported;
    private boolean shutdownSupported;
    private Boolean smartCardAuthenticationSupported;
    private String[] smpFtCompatibilityIssues;
    private boolean smpFtSupported;
    private boolean snapshotRelayoutSupported;
    private boolean standbySupported;
    private boolean storageIORMSupported;
    private Boolean storagePolicySupported;
    private boolean storageVMotionSupported;
    @Deprecated
    private HostCpuIdInfo[] supportedCpuFeature;
    private int[] supportedVmfsMajorVersion;
    private boolean suspendedRelocateSupported;
    private boolean tpmSupported;
    private String tpmVersion;
    private Boolean turnDiskLocatorLedSupported;
    private Boolean txtEnabled;
    private String unmapMethodSupported;
    private boolean unsharedSwapVMotionSupported;
    private Boolean upitSupported;
    private Boolean vFlashSupported;
    private Boolean virtualExecUsageIgnored;
    private boolean virtualExecUsageSupported;
    private Boolean virtualMmuUsageIgnored;
    private Boolean virtualVolumeDatastoreSupported;
    private boolean vlanTaggingSupported;
    private Boolean vmCreateDateSupported;
    private boolean vmDirectPathGen2Supported;
    private String[] vmDirectPathGen2UnsupportedReason;
    private String vmDirectPathGen2UnsupportedReasonExtended;
    private Boolean vmfs3EOLSupported;
    private boolean vmfsDatastoreMountCapable;
    private Boolean vmotionAcrossNetworkSupported;
    private boolean vmotionSupported;
    private boolean vmotionWithStorageVMotionSupported;
    private boolean vPMCSupported;
    private boolean vrNfcNicSelectionSupported;
    private Boolean vsanSupported;
    private boolean vStorageCapable;

    @Override
    public String toString() {
        return "HostCapability{" +
                "accel3dSupported=" + accel3dSupported +
                ", backgroundSnapshotsSupported=" + backgroundSnapshotsSupported +
                ", cloneFromSnapshotSupported=" + cloneFromSnapshotSupported +
                ", cpuHwMmuSupported=" + cpuHwMmuSupported +
                ", cpuMemoryResourceConfigurationSupported=" + cpuMemoryResourceConfigurationSupported +
                ", cryptoSupported=" + cryptoSupported +
                ", datastorePrincipalSupported=" + datastorePrincipalSupported +
                ", deltaDiskBackingsSupported=" + deltaDiskBackingsSupported +
                ", eightPlusHostVmfsSharedAccessSupported=" + eightPlusHostVmfsSharedAccessSupported +
                ", encryptedVMotionSupported=" + encryptedVMotionSupported +
                ", encryptionCBRCSupported=" + encryptionCBRCSupported +
                ", encryptionChangeOnAddRemoveSupported=" + encryptionChangeOnAddRemoveSupported +
                ", encryptionFaultToleranceSupported=" + encryptionFaultToleranceSupported +
                ", encryptionHBRSupported=" + encryptionHBRSupported +
                ", encryptionHotOperationSupported=" + encryptionHotOperationSupported +
                ", encryptionMemorySaveSupported=" + encryptionMemorySaveSupported +
                ", encryptionRDMSupported=" + encryptionRDMSupported +
                ", encryptionVFlashSupported=" + encryptionVFlashSupported +
                ", encryptionWithSnapshotsSupported=" + encryptionWithSnapshotsSupported +
                ", featureCapabilitiesSupported=" + featureCapabilitiesSupported +
                ", firewallIpRulesSupported=" + firewallIpRulesSupported +
                ", ftCompatibilityIssues=" + Arrays.toString(ftCompatibilityIssues) +
                ", ftEfiSupported=" + ftEfiSupported +
                ", ftSupported=" + ftSupported +
                ", ftVmcpSupported=" + ftVmcpSupported +
                ", gatewayOnNicSupported=" + gatewayOnNicSupported +
                ", hbrNicSelectionSupported=" + hbrNicSelectionSupported +
                ", highGuestMemSupported=" + highGuestMemSupported +
                ", hostAccessManagerSupported=" + hostAccessManagerSupported +
                ", interVMCommunicationThroughVMCISupported=" + interVMCommunicationThroughVMCISupported +
                ", ipmiSupported=" + ipmiSupported +
                ", iscsiSupported=" + iscsiSupported +
                ", latencySensitivitySupported=" + latencySensitivitySupported +
                ", localSwapDatastoreSupported=" + localSwapDatastoreSupported +
                ", loginBySSLThumbprintSupported=" + loginBySSLThumbprintSupported +
                ", maintenanceModeSupported=" + maintenanceModeSupported +
                ", markAsLocalSupported=" + markAsLocalSupported +
                ", markAsSsdSupported=" + markAsSsdSupported +
                ", markPerenniallyReservedSupported=" + markPerenniallyReservedSupported +
                ", maxHostRunningVms=" + maxHostRunningVms +
                ", maxHostSupportedVcpus=" + maxHostSupportedVcpus +
                ", maxMemMBPerFtVm=" + maxMemMBPerFtVm +
                ", maxNumDisksSVMotion=" + maxNumDisksSVMotion +
                ", maxRegisteredVMs=" + maxRegisteredVMs +
                ", maxRunningVMs=" + maxRunningVMs +
                ", maxSupportedVcpus=" + maxSupportedVcpus +
                ", maxSupportedVMs=" + maxSupportedVMs +
                ", maxVcpusPerFtVm=" + maxVcpusPerFtVm +
                ", messageBusProxySupported=" + messageBusProxySupported +
                ", multipleNetworkStackInstanceSupported=" + multipleNetworkStackInstanceSupported +
                ", nestedHVSupported=" + nestedHVSupported +
                ", nfs41Krb5iSupported=" + nfs41Krb5iSupported +
                ", nfs41Supported=" + nfs41Supported +
                ", nfsSupported=" + nfsSupported +
                ", nicTeamingSupported=" + nicTeamingSupported +
                ", oneKVolumeAPIsSupported=" + oneKVolumeAPIsSupported +
                ", perVMNetworkTrafficShapingSupported=" + perVMNetworkTrafficShapingSupported +
                ", perVmSwapFiles=" + perVmSwapFiles +
                ", pMemSnapshotSupported=" + pMemSnapshotSupported +
                ", pMemSupported=" + pMemSupported +
                ", preAssignedPCIUnitNumbersSupported=" + preAssignedPCIUnitNumbersSupported +
                ", provisioningNicSelectionSupported=" + provisioningNicSelectionSupported +
                ", quickBootSupported=" + quickBootSupported +
                ", rebootSupported=" + rebootSupported +
                ", recordReplaySupported=" + recordReplaySupported +
                ", recursiveResourcePoolsSupported=" + recursiveResourcePoolsSupported +
                ", reliableMemoryAware=" + reliableMemoryAware +
                ", replayCompatibilityIssues=" + Arrays.toString(replayCompatibilityIssues) +
                ", replayUnsupportedReason='" + replayUnsupportedReason + '\'' +
                ", restrictedSnapshotRelocateSupported=" + restrictedSnapshotRelocateSupported +
                ", sanSupported=" + sanSupported +
                ", scaledScreenshotSupported=" + scaledScreenshotSupported +
                ", scheduledHardwareUpgradeSupported=" + scheduledHardwareUpgradeSupported +
                ", screenshotSupported=" + screenshotSupported +
                ", servicePackageInfoSupported=" + servicePackageInfoSupported +
                ", shutdownSupported=" + shutdownSupported +
                ", smartCardAuthenticationSupported=" + smartCardAuthenticationSupported +
                ", smpFtCompatibilityIssues=" + Arrays.toString(smpFtCompatibilityIssues) +
                ", smpFtSupported=" + smpFtSupported +
                ", snapshotRelayoutSupported=" + snapshotRelayoutSupported +
                ", standbySupported=" + standbySupported +
                ", storageIORMSupported=" + storageIORMSupported +
                ", storagePolicySupported=" + storagePolicySupported +
                ", storageVMotionSupported=" + storageVMotionSupported +
                ", supportedCpuFeature=" + Arrays.toString(supportedCpuFeature) +
                ", supportedVmfsMajorVersion=" + Arrays.toString(supportedVmfsMajorVersion) +
                ", suspendedRelocateSupported=" + suspendedRelocateSupported +
                ", tpmSupported=" + tpmSupported +
                ", tpmVersion='" + tpmVersion + '\'' +
                ", turnDiskLocatorLedSupported=" + turnDiskLocatorLedSupported +
                ", txtEnabled=" + txtEnabled +
                ", unmapMethodSupported='" + unmapMethodSupported + '\'' +
                ", unsharedSwapVMotionSupported=" + unsharedSwapVMotionSupported +
                ", upitSupported=" + upitSupported +
                ", vFlashSupported=" + vFlashSupported +
                ", virtualExecUsageIgnored=" + virtualExecUsageIgnored +
                ", virtualExecUsageSupported=" + virtualExecUsageSupported +
                ", virtualMmuUsageIgnored=" + virtualMmuUsageIgnored +
                ", virtualVolumeDatastoreSupported=" + virtualVolumeDatastoreSupported +
                ", vlanTaggingSupported=" + vlanTaggingSupported +
                ", vmCreateDateSupported=" + vmCreateDateSupported +
                ", vmDirectPathGen2Supported=" + vmDirectPathGen2Supported +
                ", vmDirectPathGen2UnsupportedReason=" + Arrays.toString(vmDirectPathGen2UnsupportedReason) +
                ", vmDirectPathGen2UnsupportedReasonExtended='" + vmDirectPathGen2UnsupportedReasonExtended + '\'' +
                ", vmfs3EOLSupported=" + vmfs3EOLSupported +
                ", vmfsDatastoreMountCapable=" + vmfsDatastoreMountCapable +
                ", vmotionAcrossNetworkSupported=" + vmotionAcrossNetworkSupported +
                ", vmotionSupported=" + vmotionSupported +
                ", vmotionWithStorageVMotionSupported=" + vmotionWithStorageVMotionSupported +
                ", vPMCSupported=" + vPMCSupported +
                ", vrNfcNicSelectionSupported=" + vrNfcNicSelectionSupported +
                ", vsanSupported=" + vsanSupported +
                ", vStorageCapable=" + vStorageCapable +
                "} " + super.toString();
    }

    public boolean isAccel3dSupported() {
        return accel3dSupported;
    }

    public void setAccel3dSupported(final boolean accel3dSupported) {
        this.accel3dSupported = accel3dSupported;
    }

    public boolean isBackgroundSnapshotsSupported() {
        return backgroundSnapshotsSupported;
    }

    public void setBackgroundSnapshotsSupported(final boolean backgroundSnapshotsSupported) {
        this.backgroundSnapshotsSupported = backgroundSnapshotsSupported;
    }

    public boolean isCloneFromSnapshotSupported() {
        return cloneFromSnapshotSupported;
    }

    public void setCloneFromSnapshotSupported(final boolean cloneFromSnapshotSupported) {
        this.cloneFromSnapshotSupported = cloneFromSnapshotSupported;
    }

    public Boolean getCpuHwMmuSupported() {
        return cpuHwMmuSupported;
    }

    public void setCpuHwMmuSupported(final Boolean cpuHwMmuSupported) {
        this.cpuHwMmuSupported = cpuHwMmuSupported;
    }

    public boolean isCpuMemoryResourceConfigurationSupported() {
        return cpuMemoryResourceConfigurationSupported;
    }

    public void setCpuMemoryResourceConfigurationSupported(final boolean cpuMemoryResourceConfigurationSupported) {
        this.cpuMemoryResourceConfigurationSupported = cpuMemoryResourceConfigurationSupported;
    }

    public Boolean getCryptoSupported() {
        return cryptoSupported;
    }

    public void setCryptoSupported(final Boolean cryptoSupported) {
        this.cryptoSupported = cryptoSupported;
    }

    public boolean isDatastorePrincipalSupported() {
        return datastorePrincipalSupported;
    }

    public void setDatastorePrincipalSupported(final boolean datastorePrincipalSupported) {
        this.datastorePrincipalSupported = datastorePrincipalSupported;
    }

    public boolean isDeltaDiskBackingsSupported() {
        return deltaDiskBackingsSupported;
    }

    public void setDeltaDiskBackingsSupported(final boolean deltaDiskBackingsSupported) {
        this.deltaDiskBackingsSupported = deltaDiskBackingsSupported;
    }

    public boolean isEightPlusHostVmfsSharedAccessSupported() {
        return eightPlusHostVmfsSharedAccessSupported;
    }

    public void setEightPlusHostVmfsSharedAccessSupported(final boolean eightPlusHostVmfsSharedAccessSupported) {
        this.eightPlusHostVmfsSharedAccessSupported = eightPlusHostVmfsSharedAccessSupported;
    }

    public Boolean getEncryptedVMotionSupported() {
        return encryptedVMotionSupported;
    }

    public void setEncryptedVMotionSupported(final Boolean encryptedVMotionSupported) {
        this.encryptedVMotionSupported = encryptedVMotionSupported;
    }

    public Boolean getEncryptionCBRCSupported() {
        return encryptionCBRCSupported;
    }

    public void setEncryptionCBRCSupported(final Boolean encryptionCBRCSupported) {
        this.encryptionCBRCSupported = encryptionCBRCSupported;
    }

    public Boolean getEncryptionChangeOnAddRemoveSupported() {
        return encryptionChangeOnAddRemoveSupported;
    }

    public void setEncryptionChangeOnAddRemoveSupported(final Boolean encryptionChangeOnAddRemoveSupported) {
        this.encryptionChangeOnAddRemoveSupported = encryptionChangeOnAddRemoveSupported;
    }

    public Boolean getEncryptionFaultToleranceSupported() {
        return encryptionFaultToleranceSupported;
    }

    public void setEncryptionFaultToleranceSupported(final Boolean encryptionFaultToleranceSupported) {
        this.encryptionFaultToleranceSupported = encryptionFaultToleranceSupported;
    }

    public Boolean getEncryptionHBRSupported() {
        return encryptionHBRSupported;
    }

    public void setEncryptionHBRSupported(final Boolean encryptionHBRSupported) {
        this.encryptionHBRSupported = encryptionHBRSupported;
    }

    public Boolean getEncryptionHotOperationSupported() {
        return encryptionHotOperationSupported;
    }

    public void setEncryptionHotOperationSupported(final Boolean encryptionHotOperationSupported) {
        this.encryptionHotOperationSupported = encryptionHotOperationSupported;
    }

    public Boolean getEncryptionMemorySaveSupported() {
        return encryptionMemorySaveSupported;
    }

    public void setEncryptionMemorySaveSupported(final Boolean encryptionMemorySaveSupported) {
        this.encryptionMemorySaveSupported = encryptionMemorySaveSupported;
    }

    public Boolean getEncryptionRDMSupported() {
        return encryptionRDMSupported;
    }

    public void setEncryptionRDMSupported(final Boolean encryptionRDMSupported) {
        this.encryptionRDMSupported = encryptionRDMSupported;
    }

    public Boolean getEncryptionVFlashSupported() {
        return encryptionVFlashSupported;
    }

    public void setEncryptionVFlashSupported(final Boolean encryptionVFlashSupported) {
        this.encryptionVFlashSupported = encryptionVFlashSupported;
    }

    public Boolean getEncryptionWithSnapshotsSupported() {
        return encryptionWithSnapshotsSupported;
    }

    public void setEncryptionWithSnapshotsSupported(final Boolean encryptionWithSnapshotsSupported) {
        this.encryptionWithSnapshotsSupported = encryptionWithSnapshotsSupported;
    }

    public boolean isFeatureCapabilitiesSupported() {
        return featureCapabilitiesSupported;
    }

    public void setFeatureCapabilitiesSupported(final boolean featureCapabilitiesSupported) {
        this.featureCapabilitiesSupported = featureCapabilitiesSupported;
    }

    public Boolean getFirewallIpRulesSupported() {
        return firewallIpRulesSupported;
    }

    public void setFirewallIpRulesSupported(final Boolean firewallIpRulesSupported) {
        this.firewallIpRulesSupported = firewallIpRulesSupported;
    }

    public String[] getFtCompatibilityIssues() {
        return ftCompatibilityIssues;
    }

    public void setFtCompatibilityIssues(final String[] ftCompatibilityIssues) {
        this.ftCompatibilityIssues = ftCompatibilityIssues;
    }

    public Boolean getFtEfiSupported() {
        return ftEfiSupported;
    }

    public void setFtEfiSupported(final Boolean ftEfiSupported) {
        this.ftEfiSupported = ftEfiSupported;
    }

    public boolean isFtSupported() {
        return ftSupported;
    }

    public void setFtSupported(final boolean ftSupported) {
        this.ftSupported = ftSupported;
    }

    public Boolean getFtVmcpSupported() {
        return ftVmcpSupported;
    }

    public void setFtVmcpSupported(final Boolean ftVmcpSupported) {
        this.ftVmcpSupported = ftVmcpSupported;
    }

    public Boolean getGatewayOnNicSupported() {
        return gatewayOnNicSupported;
    }

    public void setGatewayOnNicSupported(final Boolean gatewayOnNicSupported) {
        this.gatewayOnNicSupported = gatewayOnNicSupported;
    }

    public boolean isHbrNicSelectionSupported() {
        return hbrNicSelectionSupported;
    }

    public void setHbrNicSelectionSupported(final boolean hbrNicSelectionSupported) {
        this.hbrNicSelectionSupported = hbrNicSelectionSupported;
    }

    public boolean isHighGuestMemSupported() {
        return highGuestMemSupported;
    }

    public void setHighGuestMemSupported(final boolean highGuestMemSupported) {
        this.highGuestMemSupported = highGuestMemSupported;
    }

    public Boolean getHostAccessManagerSupported() {
        return hostAccessManagerSupported;
    }

    public void setHostAccessManagerSupported(final Boolean hostAccessManagerSupported) {
        this.hostAccessManagerSupported = hostAccessManagerSupported;
    }

    public boolean isInterVMCommunicationThroughVMCISupported() {
        return interVMCommunicationThroughVMCISupported;
    }

    public void setInterVMCommunicationThroughVMCISupported(final boolean interVMCommunicationThroughVMCISupported) {
        this.interVMCommunicationThroughVMCISupported = interVMCommunicationThroughVMCISupported;
    }

    public Boolean getIpmiSupported() {
        return ipmiSupported;
    }

    public void setIpmiSupported(final Boolean ipmiSupported) {
        this.ipmiSupported = ipmiSupported;
    }

    public boolean isIscsiSupported() {
        return iscsiSupported;
    }

    public void setIscsiSupported(final boolean iscsiSupported) {
        this.iscsiSupported = iscsiSupported;
    }

    public boolean isLatencySensitivitySupported() {
        return latencySensitivitySupported;
    }

    public void setLatencySensitivitySupported(final boolean latencySensitivitySupported) {
        this.latencySensitivitySupported = latencySensitivitySupported;
    }

    public boolean isLocalSwapDatastoreSupported() {
        return localSwapDatastoreSupported;
    }

    public void setLocalSwapDatastoreSupported(final boolean localSwapDatastoreSupported) {
        this.localSwapDatastoreSupported = localSwapDatastoreSupported;
    }

    public Boolean getLoginBySSLThumbprintSupported() {
        return loginBySSLThumbprintSupported;
    }

    public void setLoginBySSLThumbprintSupported(final Boolean loginBySSLThumbprintSupported) {
        this.loginBySSLThumbprintSupported = loginBySSLThumbprintSupported;
    }

    public boolean isMaintenanceModeSupported() {
        return maintenanceModeSupported;
    }

    public void setMaintenanceModeSupported(final boolean maintenanceModeSupported) {
        this.maintenanceModeSupported = maintenanceModeSupported;
    }

    public Boolean getMarkAsLocalSupported() {
        return markAsLocalSupported;
    }

    public void setMarkAsLocalSupported(final Boolean markAsLocalSupported) {
        this.markAsLocalSupported = markAsLocalSupported;
    }

    public Boolean getMarkAsSsdSupported() {
        return markAsSsdSupported;
    }

    public void setMarkAsSsdSupported(final Boolean markAsSsdSupported) {
        this.markAsSsdSupported = markAsSsdSupported;
    }

    public Integer getMaxHostRunningVms() {
        return maxHostRunningVms;
    }

    public void setMaxHostRunningVms(final Integer maxHostRunningVms) {
        this.maxHostRunningVms = maxHostRunningVms;
    }

    public Integer getMaxHostSupportedVcpus() {
        return maxHostSupportedVcpus;
    }

    public void setMaxHostSupportedVcpus(final Integer maxHostSupportedVcpus) {
        this.maxHostSupportedVcpus = maxHostSupportedVcpus;
    }

    public Integer getMaxMemMBPerFtVm() {
        return maxMemMBPerFtVm;
    }

    public void setMaxMemMBPerFtVm(final Integer maxMemMBPerFtVm) {
        this.maxMemMBPerFtVm = maxMemMBPerFtVm;
    }

    public Integer getMaxNumDisksSVMotion() {
        return maxNumDisksSVMotion;
    }

    public void setMaxNumDisksSVMotion(final Integer maxNumDisksSVMotion) {
        this.maxNumDisksSVMotion = maxNumDisksSVMotion;
    }

    public Integer getMaxRegisteredVMs() {
        return maxRegisteredVMs;
    }

    public void setMaxRegisteredVMs(final Integer maxRegisteredVMs) {
        this.maxRegisteredVMs = maxRegisteredVMs;
    }

    public Integer getMaxRunningVMs() {
        return maxRunningVMs;
    }

    public void setMaxRunningVMs(final Integer maxRunningVMs) {
        this.maxRunningVMs = maxRunningVMs;
    }

    public Integer getMaxSupportedVcpus() {
        return maxSupportedVcpus;
    }

    public void setMaxSupportedVcpus(final Integer maxSupportedVcpus) {
        this.maxSupportedVcpus = maxSupportedVcpus;
    }

    public Integer getMaxSupportedVMs() {
        return maxSupportedVMs;
    }

    public void setMaxSupportedVMs(final Integer maxSupportedVMs) {
        this.maxSupportedVMs = maxSupportedVMs;
    }

    public Integer getMaxVcpusPerFtVm() {
        return maxVcpusPerFtVm;
    }

    public void setMaxVcpusPerFtVm(final Integer maxVcpusPerFtVm) {
        this.maxVcpusPerFtVm = maxVcpusPerFtVm;
    }

    public Boolean getMessageBusProxySupported() {
        return messageBusProxySupported;
    }

    public void setMessageBusProxySupported(final Boolean messageBusProxySupported) {
        this.messageBusProxySupported = messageBusProxySupported;
    }

    public Boolean getMultipleNetworkStackInstanceSupported() {
        return multipleNetworkStackInstanceSupported;
    }

    public void setMultipleNetworkStackInstanceSupported(final Boolean multipleNetworkStackInstanceSupported) {
        this.multipleNetworkStackInstanceSupported = multipleNetworkStackInstanceSupported;
    }

    public boolean isNestedHVSupported() {
        return nestedHVSupported;
    }

    public void setNestedHVSupported(final boolean nestedHVSupported) {
        this.nestedHVSupported = nestedHVSupported;
    }

    public Boolean getNfs41Krb5iSupported() {
        return nfs41Krb5iSupported;
    }

    public void setNfs41Krb5iSupported(final Boolean nfs41Krb5iSupported) {
        this.nfs41Krb5iSupported = nfs41Krb5iSupported;
    }

    public Boolean getNfs41Supported() {
        return nfs41Supported;
    }

    public void setNfs41Supported(final Boolean nfs41Supported) {
        this.nfs41Supported = nfs41Supported;
    }

    public boolean isNfsSupported() {
        return nfsSupported;
    }

    public void setNfsSupported(final boolean nfsSupported) {
        this.nfsSupported = nfsSupported;
    }

    public boolean isNicTeamingSupported() {
        return nicTeamingSupported;
    }

    public void setNicTeamingSupported(final boolean nicTeamingSupported) {
        this.nicTeamingSupported = nicTeamingSupported;
    }

    public Boolean getOneKVolumeAPIsSupported() {
        return oneKVolumeAPIsSupported;
    }

    public void setOneKVolumeAPIsSupported(final Boolean oneKVolumeAPIsSupported) {
        this.oneKVolumeAPIsSupported = oneKVolumeAPIsSupported;
    }

    public boolean isPerVMNetworkTrafficShapingSupported() {
        return perVMNetworkTrafficShapingSupported;
    }

    public void setPerVMNetworkTrafficShapingSupported(final boolean perVMNetworkTrafficShapingSupported) {
        this.perVMNetworkTrafficShapingSupported = perVMNetworkTrafficShapingSupported;
    }

    public boolean isPerVmSwapFiles() {
        return perVmSwapFiles;
    }

    public void setPerVmSwapFiles(final boolean perVmSwapFiles) {
        this.perVmSwapFiles = perVmSwapFiles;
    }

    public Boolean getpMemSnapshotSupported() {
        return pMemSnapshotSupported;
    }

    public void setpMemSnapshotSupported(final Boolean pMemSnapshotSupported) {
        this.pMemSnapshotSupported = pMemSnapshotSupported;
    }

    public Boolean getpMemSupported() {
        return pMemSupported;
    }

    public void setpMemSupported(final Boolean pMemSupported) {
        this.pMemSupported = pMemSupported;
    }

    public boolean isPreAssignedPCIUnitNumbersSupported() {
        return preAssignedPCIUnitNumbersSupported;
    }

    public void setPreAssignedPCIUnitNumbersSupported(final boolean preAssignedPCIUnitNumbersSupported) {
        this.preAssignedPCIUnitNumbersSupported = preAssignedPCIUnitNumbersSupported;
    }

    public boolean isProvisioningNicSelectionSupported() {
        return provisioningNicSelectionSupported;
    }

    public void setProvisioningNicSelectionSupported(final boolean provisioningNicSelectionSupported) {
        this.provisioningNicSelectionSupported = provisioningNicSelectionSupported;
    }

    public boolean isRebootSupported() {
        return rebootSupported;
    }

    public void setRebootSupported(final boolean rebootSupported) {
        this.rebootSupported = rebootSupported;
    }

    public boolean isRecordReplaySupported() {
        return recordReplaySupported;
    }

    public void setRecordReplaySupported(final boolean recordReplaySupported) {
        this.recordReplaySupported = recordReplaySupported;
    }

    public boolean isRecursiveResourcePoolsSupported() {
        return recursiveResourcePoolsSupported;
    }

    public void setRecursiveResourcePoolsSupported(final boolean recursiveResourcePoolsSupported) {
        this.recursiveResourcePoolsSupported = recursiveResourcePoolsSupported;
    }

    public Boolean getReliableMemoryAware() {
        return reliableMemoryAware;
    }

    public void setReliableMemoryAware(final Boolean reliableMemoryAware) {
        this.reliableMemoryAware = reliableMemoryAware;
    }

    public String[] getReplayCompatibilityIssues() {
        return replayCompatibilityIssues;
    }

    public void setReplayCompatibilityIssues(final String[] replayCompatibilityIssues) {
        this.replayCompatibilityIssues = replayCompatibilityIssues;
    }

    public String getReplayUnsupportedReason() {
        return replayUnsupportedReason;
    }

    public void setReplayUnsupportedReason(final String replayUnsupportedReason) {
        this.replayUnsupportedReason = replayUnsupportedReason;
    }

    public boolean isRestrictedSnapshotRelocateSupported() {
        return restrictedSnapshotRelocateSupported;
    }

    public void setRestrictedSnapshotRelocateSupported(final boolean restrictedSnapshotRelocateSupported) {
        this.restrictedSnapshotRelocateSupported = restrictedSnapshotRelocateSupported;
    }

    public boolean isSanSupported() {
        return sanSupported;
    }

    public void setSanSupported(final boolean sanSupported) {
        this.sanSupported = sanSupported;
    }

    public boolean isScaledScreenshotSupported() {
        return scaledScreenshotSupported;
    }

    public void setScaledScreenshotSupported(final boolean scaledScreenshotSupported) {
        this.scaledScreenshotSupported = scaledScreenshotSupported;
    }

    public Boolean getScheduledHardwareUpgradeSupported() {
        return scheduledHardwareUpgradeSupported;
    }

    public void setScheduledHardwareUpgradeSupported(final Boolean scheduledHardwareUpgradeSupported) {
        this.scheduledHardwareUpgradeSupported = scheduledHardwareUpgradeSupported;
    }

    public boolean isScreenshotSupported() {
        return screenshotSupported;
    }

    public void setScreenshotSupported(final boolean screenshotSupported) {
        this.screenshotSupported = screenshotSupported;
    }

    public Boolean getServicePackageInfoSupported() {
        return servicePackageInfoSupported;
    }

    public void setServicePackageInfoSupported(final Boolean servicePackageInfoSupported) {
        this.servicePackageInfoSupported = servicePackageInfoSupported;
    }

    public boolean isShutdownSupported() {
        return shutdownSupported;
    }

    public void setShutdownSupported(final boolean shutdownSupported) {
        this.shutdownSupported = shutdownSupported;
    }

    public Boolean getSmartCardAuthenticationSupported() {
        return smartCardAuthenticationSupported;
    }

    public void setSmartCardAuthenticationSupported(final Boolean smartCardAuthenticationSupported) {
        this.smartCardAuthenticationSupported = smartCardAuthenticationSupported;
    }

    public String[] getSmpFtCompatibilityIssues() {
        return smpFtCompatibilityIssues;
    }

    public void setSmpFtCompatibilityIssues(final String[] smpFtCompatibilityIssues) {
        this.smpFtCompatibilityIssues = smpFtCompatibilityIssues;
    }

    public boolean isSmpFtSupported() {
        return smpFtSupported;
    }

    public void setSmpFtSupported(final boolean smpFtSupported) {
        this.smpFtSupported = smpFtSupported;
    }

    public boolean isSnapshotRelayoutSupported() {
        return snapshotRelayoutSupported;
    }

    public void setSnapshotRelayoutSupported(final boolean snapshotRelayoutSupported) {
        this.snapshotRelayoutSupported = snapshotRelayoutSupported;
    }

    public boolean isStandbySupported() {
        return standbySupported;
    }

    public void setStandbySupported(final boolean standbySupported) {
        this.standbySupported = standbySupported;
    }

    public boolean isStorageIORMSupported() {
        return storageIORMSupported;
    }

    public void setStorageIORMSupported(final boolean storageIORMSupported) {
        this.storageIORMSupported = storageIORMSupported;
    }

    public Boolean getStoragePolicySupported() {
        return storagePolicySupported;
    }

    public void setStoragePolicySupported(final Boolean storagePolicySupported) {
        this.storagePolicySupported = storagePolicySupported;
    }

    public boolean isStorageVMotionSupported() {
        return storageVMotionSupported;
    }

    public void setStorageVMotionSupported(final boolean storageVMotionSupported) {
        this.storageVMotionSupported = storageVMotionSupported;
    }

    public HostCpuIdInfo[] getSupportedCpuFeature() {
        return supportedCpuFeature;
    }

    public void setSupportedCpuFeature(final HostCpuIdInfo[] supportedCpuFeature) {
        this.supportedCpuFeature = supportedCpuFeature;
    }

    public int[] getSupportedVmfsMajorVersion() {
        return supportedVmfsMajorVersion;
    }

    public void setSupportedVmfsMajorVersion(final int[] supportedVmfsMajorVersion) {
        this.supportedVmfsMajorVersion = supportedVmfsMajorVersion;
    }

    public boolean isSuspendedRelocateSupported() {
        return suspendedRelocateSupported;
    }

    public void setSuspendedRelocateSupported(final boolean suspendedRelocateSupported) {
        this.suspendedRelocateSupported = suspendedRelocateSupported;
    }

    public boolean isTpmSupported() {
        return tpmSupported;
    }

    public void setTpmSupported(final boolean tpmSupported) {
        this.tpmSupported = tpmSupported;
    }

    public String getTpmVersion() {
        return tpmVersion;
    }

    public void setTpmVersion(final String tpmVersion) {
        this.tpmVersion = tpmVersion;
    }

    public Boolean getTurnDiskLocatorLedSupported() {
        return turnDiskLocatorLedSupported;
    }

    public void setTurnDiskLocatorLedSupported(final Boolean turnDiskLocatorLedSupported) {
        this.turnDiskLocatorLedSupported = turnDiskLocatorLedSupported;
    }

    public Boolean getTxtEnabled() {
        return txtEnabled;
    }

    public void setTxtEnabled(final Boolean txtEnabled) {
        this.txtEnabled = txtEnabled;
    }

    public String getUnmapMethodSupported() {
        return unmapMethodSupported;
    }

    public void setUnmapMethodSupported(final String unmapMethodSupported) {
        this.unmapMethodSupported = unmapMethodSupported;
    }

    public boolean isUnsharedSwapVMotionSupported() {
        return unsharedSwapVMotionSupported;
    }

    public void setUnsharedSwapVMotionSupported(final boolean unsharedSwapVMotionSupported) {
        this.unsharedSwapVMotionSupported = unsharedSwapVMotionSupported;
    }

    public Boolean getUpitSupported() {
        return upitSupported;
    }

    public void setUpitSupported(final Boolean upitSupported) {
        this.upitSupported = upitSupported;
    }

    public Boolean getvFlashSupported() {
        return vFlashSupported;
    }

    public void setvFlashSupported(final Boolean vFlashSupported) {
        this.vFlashSupported = vFlashSupported;
    }

    public Boolean getVirtualExecUsageIgnored() {
        return virtualExecUsageIgnored;
    }

    public void setVirtualExecUsageIgnored(final Boolean virtualExecUsageIgnored) {
        this.virtualExecUsageIgnored = virtualExecUsageIgnored;
    }

    public boolean isVirtualExecUsageSupported() {
        return virtualExecUsageSupported;
    }

    public void setVirtualExecUsageSupported(final boolean virtualExecUsageSupported) {
        this.virtualExecUsageSupported = virtualExecUsageSupported;
    }

    public Boolean getVirtualMmuUsageIgnored() {
        return virtualMmuUsageIgnored;
    }

    public void setVirtualMmuUsageIgnored(final Boolean virtualMmuUsageIgnored) {
        this.virtualMmuUsageIgnored = virtualMmuUsageIgnored;
    }

    public Boolean getVirtualVolumeDatastoreSupported() {
        return virtualVolumeDatastoreSupported;
    }

    public void setVirtualVolumeDatastoreSupported(final Boolean virtualVolumeDatastoreSupported) {
        this.virtualVolumeDatastoreSupported = virtualVolumeDatastoreSupported;
    }

    public boolean isVlanTaggingSupported() {
        return vlanTaggingSupported;
    }

    public void setVlanTaggingSupported(final boolean vlanTaggingSupported) {
        this.vlanTaggingSupported = vlanTaggingSupported;
    }

    public Boolean getVmCreateDateSupported() {
        return vmCreateDateSupported;
    }

    public void setVmCreateDateSupported(final Boolean vmCreateDateSupported) {
        this.vmCreateDateSupported = vmCreateDateSupported;
    }

    public boolean isVmDirectPathGen2Supported() {
        return vmDirectPathGen2Supported;
    }

    public void setVmDirectPathGen2Supported(final boolean vmDirectPathGen2Supported) {
        this.vmDirectPathGen2Supported = vmDirectPathGen2Supported;
    }

    public String[] getVmDirectPathGen2UnsupportedReason() {
        return vmDirectPathGen2UnsupportedReason;
    }

    public void setVmDirectPathGen2UnsupportedReason(final String[] vmDirectPathGen2UnsupportedReason) {
        this.vmDirectPathGen2UnsupportedReason = vmDirectPathGen2UnsupportedReason;
    }

    public String getVmDirectPathGen2UnsupportedReasonExtended() {
        return vmDirectPathGen2UnsupportedReasonExtended;
    }

    public void setVmDirectPathGen2UnsupportedReasonExtended(final String vmDirectPathGen2UnsupportedReasonExtended) {
        this.vmDirectPathGen2UnsupportedReasonExtended = vmDirectPathGen2UnsupportedReasonExtended;
    }

    public Boolean getVmfs3EOLSupported() {
        return vmfs3EOLSupported;
    }

    public void setVmfs3EOLSupported(final Boolean vmfs3EOLSupported) {
        this.vmfs3EOLSupported = vmfs3EOLSupported;
    }

    public boolean isVmfsDatastoreMountCapable() {
        return vmfsDatastoreMountCapable;
    }

    public void setVmfsDatastoreMountCapable(final boolean vmfsDatastoreMountCapable) {
        this.vmfsDatastoreMountCapable = vmfsDatastoreMountCapable;
    }

    public Boolean getVmotionAcrossNetworkSupported() {
        return vmotionAcrossNetworkSupported;
    }

    public void setVmotionAcrossNetworkSupported(final Boolean vmotionAcrossNetworkSupported) {
        this.vmotionAcrossNetworkSupported = vmotionAcrossNetworkSupported;
    }

    public boolean isVmotionSupported() {
        return vmotionSupported;
    }

    public void setVmotionSupported(final boolean vmotionSupported) {
        this.vmotionSupported = vmotionSupported;
    }

    public boolean isVmotionWithStorageVMotionSupported() {
        return vmotionWithStorageVMotionSupported;
    }

    public void setVmotionWithStorageVMotionSupported(final boolean vmotionWithStorageVMotionSupported) {
        this.vmotionWithStorageVMotionSupported = vmotionWithStorageVMotionSupported;
    }

    public boolean isvPMCSupported() {
        return vPMCSupported;
    }

    public void setvPMCSupported(final boolean vPMCSupported) {
        this.vPMCSupported = vPMCSupported;
    }

    public boolean isVrNfcNicSelectionSupported() {
        return vrNfcNicSelectionSupported;
    }

    public void setVrNfcNicSelectionSupported(final boolean vrNfcNicSelectionSupported) {
        this.vrNfcNicSelectionSupported = vrNfcNicSelectionSupported;
    }

    public Boolean getVsanSupported() {
        return vsanSupported;
    }

    public void setVsanSupported(final Boolean vsanSupported) {
        this.vsanSupported = vsanSupported;
    }

    public boolean isvStorageCapable() {
        return vStorageCapable;
    }

    public void setvStorageCapable(final boolean vStorageCapable) {
        this.vStorageCapable = vStorageCapable;
    }

    public Boolean getMarkPerenniallyReservedSupported() {
        return markPerenniallyReservedSupported;
    }

    public void setMarkPerenniallyReservedSupported(final Boolean markPerenniallyReservedSupported) {
        this.markPerenniallyReservedSupported = markPerenniallyReservedSupported;
    }

    public Boolean getQuickBootSupported() {
        return quickBootSupported;
    }

    public void setQuickBootSupported(final Boolean quickBootSupported) {
        this.quickBootSupported = quickBootSupported;
    }
}
