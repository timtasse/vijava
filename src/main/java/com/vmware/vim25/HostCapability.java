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

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.5
 */

@SuppressWarnings("all")
public class HostCapability extends DynamicData {

    public Boolean recursiveResourcePoolsSupported;
    public Boolean cpuMemoryResourceConfigurationSupported;
    public Boolean rebootSupported;
    public Boolean shutdownSupported;
    public Boolean vmotionSupported;
    public Boolean standbySupported;
    public Boolean ipmiSupported;
    public Integer maxSupportedVMs;
    public Integer maxRunningVMs;
    public Integer maxSupportedVcpus;
    public Integer maxRegisteredVMs;
    public Boolean datastorePrincipalSupported;
    public Boolean sanSupported;
    public Boolean nfsSupported;
    public Boolean iscsiSupported;
    public Boolean vlanTaggingSupported;
    public Boolean nicTeamingSupported;
    public Boolean highGuestMemSupported;
    public Boolean maintenanceModeSupported;
    public Boolean suspendedRelocateSupported;
    public Boolean restrictedSnapshotRelocateSupported;
    public Boolean perVmSwapFiles;
    public Boolean localSwapDatastoreSupported;
    public Boolean unsharedSwapVMotionSupported;
    public Boolean backgroundSnapshotsSupported;
    public Boolean preAssignedPCIUnitNumbersSupported;
    public Boolean screenshotSupported;
    public Boolean scaledScreenshotSupported;
    public Boolean storageVMotionSupported;
    public Boolean vmotionWithStorageVMotionSupported;
    public Boolean vmotionAcrossNetworkSupported;
    public Boolean hbrNicSelectionSupported;
    @Deprecated
    public Boolean recordReplaySupported;
    @Deprecated
    public Boolean ftSupported;
    @Deprecated
    public String replayUnsupportedReason;
    @Deprecated
    public String[] replayCompatibilityIssues;
    @Deprecated
    public String[] ftCompatibilityIssues;
    public Boolean loginBySSLThumbprintSupported;
    public Boolean cloneFromSnapshotSupported;
    public Boolean deltaDiskBackingsSupported;
    public Boolean perVMNetworkTrafficShapingSupported;
    public Boolean tpmSupported;
    @Deprecated
    public HostCpuIdInfo[] supportedCpuFeature;
    public Boolean virtualExecUsageSupported;
    public Boolean storageIORMSupported;
    public Boolean vmDirectPathGen2Supported;
    public String[] vmDirectPathGen2UnsupportedReason;
    public String vmDirectPathGen2UnsupportedReasonExtended;
    public int[] supportedVmfsMajorVersion;
    public Boolean vStorageCapable;
    public Boolean snapshotRelayoutSupported;
    public Boolean firewallIpRulesSupported;
    public Boolean servicePackageInfoSupported;
    public Integer maxHostRunningVms;
    public Integer maxHostSupportedVcpus;
    public Boolean vmfsDatastoreMountCapable;
    public Boolean eightPlusHostVmfsSharedAccessSupported;
    public Boolean nestedHVSupported;
    public Boolean vPMCSupported;
    public Boolean interVMCommunicationThroughVMCISupported;
    public Boolean scheduledHardwareUpgradeSupported;
    public Boolean featureCapabilitiesSupported;
    public Boolean latencySensitivitySupported;
    public Boolean storagePolicySupported;
    public Boolean accel3dSupported;
    public Boolean reliableMemoryAware;
    public Boolean multipleNetworkStackInstanceSupported;
    public Boolean vsanSupported;
    public Boolean vFlashSupported;
    public Boolean cpuHwMmuSupported;
    public Boolean cryptoSupported;
    public Boolean encryptedVMotionSupported;
    public Boolean encryptionCBRCSupported;
    public Boolean encryptionChangeOnAddRemoveSupported;
    public Boolean encryptionFaultToleranceSupported;
    public Boolean encryptionHBRSupported;
    public Boolean encryptionHotOperationSupported;
    public Boolean encryptionMemorySaveSupported;
    public Boolean encryptionRDMSupported;
    public Boolean encryptionVFlashSupported;
    public Boolean encryptionWithSnapshotsSupported;
    public Boolean gatewayOnNicSupported, hostAccessManagerSupported, markAsLocalSupported, markAsSsdSupported;
    public Integer maxNumDisksSVMotion;
    public Integer maxVcpusPerFtVm;
    public Boolean messageBusProxySupported;
    public Boolean nfs41Krb5iSupported;
    public Boolean nfs41Supported;
    public Boolean oneKVolumeAPIsSupported;
    public Boolean provisioningNicSelectionSupported;
    public Boolean smartCardAuthenticationSupported;
    public String[] smpFtCompatibilityIssues;
    public Boolean smpFtSupported;
    public Boolean turnDiskLocatorLedSupported;
    public Boolean upitSupported;
    public Boolean virtualVolumeDatastoreSupported;
    public Boolean vrNfcNicSelectionSupported;

    public Boolean isRecursiveResourcePoolsSupported() {
        return this.recursiveResourcePoolsSupported;
    }

    public Boolean isCpuMemoryResourceConfigurationSupported() {
        return this.cpuMemoryResourceConfigurationSupported;
    }

    public Boolean isRebootSupported() {
        return this.rebootSupported;
    }

    public Boolean isShutdownSupported() {
        return this.shutdownSupported;
    }

    public Boolean isVmotionSupported() {
        return this.vmotionSupported;
    }

    public Boolean isStandbySupported() {
        return this.standbySupported;
    }

    public Boolean getIpmiSupported() {
        return this.ipmiSupported;
    }

    public Integer getMaxSupportedVMs() {
        return this.maxSupportedVMs;
    }

    public Integer getMaxRunningVMs() {
        return this.maxRunningVMs;
    }

    public Integer getMaxSupportedVcpus() {
        return this.maxSupportedVcpus;
    }

    public Integer getMaxRegisteredVMs() {
        return this.maxRegisteredVMs;
    }

    public Boolean isDatastorePrincipalSupported() {
        return this.datastorePrincipalSupported;
    }

    public Boolean isSanSupported() {
        return this.sanSupported;
    }

    public Boolean isNfsSupported() {
        return this.nfsSupported;
    }

    public Boolean isIscsiSupported() {
        return this.iscsiSupported;
    }

    public Boolean isVlanTaggingSupported() {
        return this.vlanTaggingSupported;
    }

    public Boolean isNicTeamingSupported() {
        return this.nicTeamingSupported;
    }

    public Boolean isHighGuestMemSupported() {
        return this.highGuestMemSupported;
    }

    public Boolean isMaintenanceModeSupported() {
        return this.maintenanceModeSupported;
    }

    public Boolean isSuspendedRelocateSupported() {
        return this.suspendedRelocateSupported;
    }

    public Boolean isRestrictedSnapshotRelocateSupported() {
        return this.restrictedSnapshotRelocateSupported;
    }

    public Boolean isPerVmSwapFiles() {
        return this.perVmSwapFiles;
    }

    public Boolean isLocalSwapDatastoreSupported() {
        return this.localSwapDatastoreSupported;
    }

    public Boolean isUnsharedSwapVMotionSupported() {
        return this.unsharedSwapVMotionSupported;
    }

    public Boolean isBackgroundSnapshotsSupported() {
        return this.backgroundSnapshotsSupported;
    }

    public Boolean isPreAssignedPCIUnitNumbersSupported() {
        return this.preAssignedPCIUnitNumbersSupported;
    }

    public Boolean isScreenshotSupported() {
        return this.screenshotSupported;
    }

    public Boolean isScaledScreenshotSupported() {
        return this.scaledScreenshotSupported;
    }

    public Boolean getStorageVMotionSupported() {
        return this.storageVMotionSupported;
    }

    public Boolean getVmotionWithStorageVMotionSupported() {
        return this.vmotionWithStorageVMotionSupported;
    }

    public Boolean getVmotionAcrossNetworkSupported() {
        return this.vmotionAcrossNetworkSupported;
    }

    public Boolean getHbrNicSelectionSupported() {
        return this.hbrNicSelectionSupported;
    }

    @Deprecated
    public Boolean getRecordReplaySupported() {
        return this.recordReplaySupported;
    }

    @Deprecated
    public Boolean getFtSupported() {
        return this.ftSupported;
    }

    @Deprecated
    public String getReplayUnsupportedReason() {
        return this.replayUnsupportedReason;
    }

    @Deprecated
    public String[] getReplayCompatibilityIssues() {
        return this.replayCompatibilityIssues;
    }

    @Deprecated
    public String[] getFtCompatibilityIssues() {
        return this.ftCompatibilityIssues;
    }

    public Boolean getLoginBySSLThumbprintSupported() {
        return this.loginBySSLThumbprintSupported;
    }

    public Boolean getCloneFromSnapshotSupported() {
        return this.cloneFromSnapshotSupported;
    }

    public Boolean getDeltaDiskBackingsSupported() {
        return this.deltaDiskBackingsSupported;
    }

    public Boolean getPerVMNetworkTrafficShapingSupported() {
        return this.perVMNetworkTrafficShapingSupported;
    }

    public Boolean getTpmSupported() {
        return this.tpmSupported;
    }

    @Deprecated
    public HostCpuIdInfo[] getSupportedCpuFeature() {
        return this.supportedCpuFeature;
    }

    public Boolean getVirtualExecUsageSupported() {
        return this.virtualExecUsageSupported;
    }

    public Boolean getStorageIORMSupported() {
        return this.storageIORMSupported;
    }

    public Boolean getVmDirectPathGen2Supported() {
        return this.vmDirectPathGen2Supported;
    }

    public String[] getVmDirectPathGen2UnsupportedReason() {
        return this.vmDirectPathGen2UnsupportedReason;
    }

    public String getVmDirectPathGen2UnsupportedReasonExtended() {
        return this.vmDirectPathGen2UnsupportedReasonExtended;
    }

    public int[] getSupportedVmfsMajorVersion() {
        return this.supportedVmfsMajorVersion;
    }

    public Boolean getVStorageCapable() {
        return this.vStorageCapable;
    }

    public Boolean getSnapshotRelayoutSupported() {
        return this.snapshotRelayoutSupported;
    }

    public Boolean getFirewallIpRulesSupported() {
        return this.firewallIpRulesSupported;
    }

    public Boolean getServicePackageInfoSupported() {
        return this.servicePackageInfoSupported;
    }

    public Integer getMaxHostRunningVms() {
        return this.maxHostRunningVms;
    }

    public Integer getMaxHostSupportedVcpus() {
        return this.maxHostSupportedVcpus;
    }

    public Boolean getVmfsDatastoreMountCapable() {
        return this.vmfsDatastoreMountCapable;
    }

    public Boolean getEightPlusHostVmfsSharedAccessSupported() {
        return this.eightPlusHostVmfsSharedAccessSupported;
    }

    public Boolean getNestedHVSupported() {
        return this.nestedHVSupported;
    }

    public Boolean getVPMCSupported() {
        return this.vPMCSupported;
    }

    public Boolean getInterVMCommunicationThroughVMCISupported() {
        return this.interVMCommunicationThroughVMCISupported;
    }

    public Boolean getScheduledHardwareUpgradeSupported() {
        return this.scheduledHardwareUpgradeSupported;
    }

    public Boolean getFeatureCapabilitiesSupported() {
        return this.featureCapabilitiesSupported;
    }

    public Boolean getLatencySensitivitySupported() {
        return this.latencySensitivitySupported;
    }

    public Boolean getStoragePolicySupported() {
        return this.storagePolicySupported;
    }

    public Boolean getAccel3dSupported() {
        return this.accel3dSupported;
    }

    public Boolean getReliableMemoryAware() {
        return this.reliableMemoryAware;
    }

    public Boolean getMultipleNetworkStackInstanceSupported() {
        return this.multipleNetworkStackInstanceSupported;
    }

    public Boolean getVsanSupported() {
        return this.vsanSupported;
    }

    public Boolean getVFlashSupported() {
        return this.vFlashSupported;
    }

    public void setRecursiveResourcePoolsSupported(Boolean recursiveResourcePoolsSupported) {
        this.recursiveResourcePoolsSupported = recursiveResourcePoolsSupported;
    }

    public void setCpuMemoryResourceConfigurationSupported(Boolean cpuMemoryResourceConfigurationSupported) {
        this.cpuMemoryResourceConfigurationSupported = cpuMemoryResourceConfigurationSupported;
    }

    public void setRebootSupported(Boolean rebootSupported) {
        this.rebootSupported = rebootSupported;
    }

    public void setShutdownSupported(Boolean shutdownSupported) {
        this.shutdownSupported = shutdownSupported;
    }

    public void setVmotionSupported(Boolean vmotionSupported) {
        this.vmotionSupported = vmotionSupported;
    }

    public void setStandbySupported(Boolean standbySupported) {
        this.standbySupported = standbySupported;
    }

    public void setIpmiSupported(Boolean ipmiSupported) {
        this.ipmiSupported = ipmiSupported;
    }

    public void setMaxSupportedVMs(Integer maxSupportedVMs) {
        this.maxSupportedVMs = maxSupportedVMs;
    }

    public void setMaxRunningVMs(Integer maxRunningVMs) {
        this.maxRunningVMs = maxRunningVMs;
    }

    public void setMaxSupportedVcpus(Integer maxSupportedVcpus) {
        this.maxSupportedVcpus = maxSupportedVcpus;
    }

    public void setMaxRegisteredVMs(Integer maxRegisteredVMs) {
        this.maxRegisteredVMs = maxRegisteredVMs;
    }

    public void setDatastorePrincipalSupported(Boolean datastorePrincipalSupported) {
        this.datastorePrincipalSupported = datastorePrincipalSupported;
    }

    public void setSanSupported(Boolean sanSupported) {
        this.sanSupported = sanSupported;
    }

    public void setNfsSupported(Boolean nfsSupported) {
        this.nfsSupported = nfsSupported;
    }

    public void setIscsiSupported(Boolean iscsiSupported) {
        this.iscsiSupported = iscsiSupported;
    }

    public void setVlanTaggingSupported(Boolean vlanTaggingSupported) {
        this.vlanTaggingSupported = vlanTaggingSupported;
    }

    public void setNicTeamingSupported(Boolean nicTeamingSupported) {
        this.nicTeamingSupported = nicTeamingSupported;
    }

    public void setHighGuestMemSupported(Boolean highGuestMemSupported) {
        this.highGuestMemSupported = highGuestMemSupported;
    }

    public void setMaintenanceModeSupported(Boolean maintenanceModeSupported) {
        this.maintenanceModeSupported = maintenanceModeSupported;
    }

    public void setSuspendedRelocateSupported(Boolean suspendedRelocateSupported) {
        this.suspendedRelocateSupported = suspendedRelocateSupported;
    }

    public void setRestrictedSnapshotRelocateSupported(Boolean restrictedSnapshotRelocateSupported) {
        this.restrictedSnapshotRelocateSupported = restrictedSnapshotRelocateSupported;
    }

    public void setPerVmSwapFiles(Boolean perVmSwapFiles) {
        this.perVmSwapFiles = perVmSwapFiles;
    }

    public void setLocalSwapDatastoreSupported(Boolean localSwapDatastoreSupported) {
        this.localSwapDatastoreSupported = localSwapDatastoreSupported;
    }

    public void setUnsharedSwapVMotionSupported(Boolean unsharedSwapVMotionSupported) {
        this.unsharedSwapVMotionSupported = unsharedSwapVMotionSupported;
    }

    public void setBackgroundSnapshotsSupported(Boolean backgroundSnapshotsSupported) {
        this.backgroundSnapshotsSupported = backgroundSnapshotsSupported;
    }

    public void setPreAssignedPCIUnitNumbersSupported(Boolean preAssignedPCIUnitNumbersSupported) {
        this.preAssignedPCIUnitNumbersSupported = preAssignedPCIUnitNumbersSupported;
    }

    public void setScreenshotSupported(Boolean screenshotSupported) {
        this.screenshotSupported = screenshotSupported;
    }

    public void setScaledScreenshotSupported(Boolean scaledScreenshotSupported) {
        this.scaledScreenshotSupported = scaledScreenshotSupported;
    }

    public void setStorageVMotionSupported(Boolean storageVMotionSupported) {
        this.storageVMotionSupported = storageVMotionSupported;
    }

    public void setVmotionWithStorageVMotionSupported(Boolean vmotionWithStorageVMotionSupported) {
        this.vmotionWithStorageVMotionSupported = vmotionWithStorageVMotionSupported;
    }

    public void setVmotionAcrossNetworkSupported(Boolean vmotionAcrossNetworkSupported) {
        this.vmotionAcrossNetworkSupported = vmotionAcrossNetworkSupported;
    }

    public void setHbrNicSelectionSupported(Boolean hbrNicSelectionSupported) {
        this.hbrNicSelectionSupported = hbrNicSelectionSupported;
    }

    @Deprecated
    public void setRecordReplaySupported(Boolean recordReplaySupported) {
        this.recordReplaySupported = recordReplaySupported;
    }

    @Deprecated
    public void setFtSupported(Boolean ftSupported) {
        this.ftSupported = ftSupported;
    }

    @Deprecated
    public void setReplayUnsupportedReason(String replayUnsupportedReason) {
        this.replayUnsupportedReason = replayUnsupportedReason;
    }

    @Deprecated
    public void setReplayCompatibilityIssues(String[] replayCompatibilityIssues) {
        this.replayCompatibilityIssues = replayCompatibilityIssues;
    }

    @Deprecated
    public void setFtCompatibilityIssues(String[] ftCompatibilityIssues) {
        this.ftCompatibilityIssues = ftCompatibilityIssues;
    }

    public void setLoginBySSLThumbprintSupported(Boolean loginBySSLThumbprintSupported) {
        this.loginBySSLThumbprintSupported = loginBySSLThumbprintSupported;
    }

    public void setCloneFromSnapshotSupported(Boolean cloneFromSnapshotSupported) {
        this.cloneFromSnapshotSupported = cloneFromSnapshotSupported;
    }

    public void setDeltaDiskBackingsSupported(Boolean deltaDiskBackingsSupported) {
        this.deltaDiskBackingsSupported = deltaDiskBackingsSupported;
    }

    public void setPerVMNetworkTrafficShapingSupported(Boolean perVMNetworkTrafficShapingSupported) {
        this.perVMNetworkTrafficShapingSupported = perVMNetworkTrafficShapingSupported;
    }

    public void setTpmSupported(Boolean tpmSupported) {
        this.tpmSupported = tpmSupported;
    }

    @Deprecated
    public void setSupportedCpuFeature(HostCpuIdInfo[] supportedCpuFeature) {
        this.supportedCpuFeature = supportedCpuFeature;
    }

    public void setVirtualExecUsageSupported(Boolean virtualExecUsageSupported) {
        this.virtualExecUsageSupported = virtualExecUsageSupported;
    }

    public void setStorageIORMSupported(Boolean storageIORMSupported) {
        this.storageIORMSupported = storageIORMSupported;
    }

    public void setVmDirectPathGen2Supported(Boolean vmDirectPathGen2Supported) {
        this.vmDirectPathGen2Supported = vmDirectPathGen2Supported;
    }

    public void setVmDirectPathGen2UnsupportedReason(String[] vmDirectPathGen2UnsupportedReason) {
        this.vmDirectPathGen2UnsupportedReason = vmDirectPathGen2UnsupportedReason;
    }

    public void setVmDirectPathGen2UnsupportedReasonExtended(String vmDirectPathGen2UnsupportedReasonExtended) {
        this.vmDirectPathGen2UnsupportedReasonExtended = vmDirectPathGen2UnsupportedReasonExtended;
    }

    public void setSupportedVmfsMajorVersion(int[] supportedVmfsMajorVersion) {
        this.supportedVmfsMajorVersion = supportedVmfsMajorVersion;
    }

    public void setVStorageCapable(Boolean vStorageCapable) {
        this.vStorageCapable = vStorageCapable;
    }

    public void setSnapshotRelayoutSupported(Boolean snapshotRelayoutSupported) {
        this.snapshotRelayoutSupported = snapshotRelayoutSupported;
    }

    public void setFirewallIpRulesSupported(Boolean firewallIpRulesSupported) {
        this.firewallIpRulesSupported = firewallIpRulesSupported;
    }

    public void setServicePackageInfoSupported(Boolean servicePackageInfoSupported) {
        this.servicePackageInfoSupported = servicePackageInfoSupported;
    }

    public void setMaxHostRunningVms(Integer maxHostRunningVms) {
        this.maxHostRunningVms = maxHostRunningVms;
    }

    public void setMaxHostSupportedVcpus(Integer maxHostSupportedVcpus) {
        this.maxHostSupportedVcpus = maxHostSupportedVcpus;
    }

    public void setVmfsDatastoreMountCapable(Boolean vmfsDatastoreMountCapable) {
        this.vmfsDatastoreMountCapable = vmfsDatastoreMountCapable;
    }

    public void setEightPlusHostVmfsSharedAccessSupported(Boolean eightPlusHostVmfsSharedAccessSupported) {
        this.eightPlusHostVmfsSharedAccessSupported = eightPlusHostVmfsSharedAccessSupported;
    }

    public void setNestedHVSupported(Boolean nestedHVSupported) {
        this.nestedHVSupported = nestedHVSupported;
    }

    public void setVPMCSupported(Boolean vPMCSupported) {
        this.vPMCSupported = vPMCSupported;
    }

    public void setInterVMCommunicationThroughVMCISupported(Boolean interVMCommunicationThroughVMCISupported) {
        this.interVMCommunicationThroughVMCISupported = interVMCommunicationThroughVMCISupported;
    }

    public void setScheduledHardwareUpgradeSupported(Boolean scheduledHardwareUpgradeSupported) {
        this.scheduledHardwareUpgradeSupported = scheduledHardwareUpgradeSupported;
    }

    public void setFeatureCapabilitiesSupported(Boolean featureCapabilitiesSupported) {
        this.featureCapabilitiesSupported = featureCapabilitiesSupported;
    }

    public void setLatencySensitivitySupported(Boolean latencySensitivitySupported) {
        this.latencySensitivitySupported = latencySensitivitySupported;
    }

    public void setStoragePolicySupported(Boolean storagePolicySupported) {
        this.storagePolicySupported = storagePolicySupported;
    }

    public void setAccel3dSupported(Boolean accel3dSupported) {
        this.accel3dSupported = accel3dSupported;
    }

    public void setReliableMemoryAware(Boolean reliableMemoryAware) {
        this.reliableMemoryAware = reliableMemoryAware;
    }

    public void setMultipleNetworkStackInstanceSupported(Boolean multipleNetworkStackInstanceSupported) {
        this.multipleNetworkStackInstanceSupported = multipleNetworkStackInstanceSupported;
    }

    public void setVsanSupported(Boolean vsanSupported) {
        this.vsanSupported = vsanSupported;
    }

    public void setVFlashSupported(Boolean vFlashSupported) {
        this.vFlashSupported = vFlashSupported;
    }

    public Boolean isCpuHwMmuSupported() {
        return cpuHwMmuSupported;
    }

    public void setCpuHwMmuSupported(final Boolean cpuHwMmuSupported) {
        this.cpuHwMmuSupported = cpuHwMmuSupported;
    }

    public Boolean isCryptoSupported() {
        return cryptoSupported;
    }

    public void setCryptoSupported(final Boolean cryptoSupported) {
        this.cryptoSupported = cryptoSupported;
    }

    public Boolean isEncryptedVMotionSupported() {
        return encryptedVMotionSupported;
    }

    public void setEncryptedVMotionSupported(final Boolean encryptedVMotionSupported) {
        this.encryptedVMotionSupported = encryptedVMotionSupported;
    }

    public Boolean isEncryptionCBRCSupported() {
        return encryptionCBRCSupported;
    }

    public void setEncryptionCBRCSupported(final Boolean encryptionCBRCSupported) {
        this.encryptionCBRCSupported = encryptionCBRCSupported;
    }

    public Boolean isEncryptionChangeOnAddRemoveSupported() {
        return encryptionChangeOnAddRemoveSupported;
    }

    public void setEncryptionChangeOnAddRemoveSupported(final Boolean encryptionChangeOnAddRemoveSupported) {
        this.encryptionChangeOnAddRemoveSupported = encryptionChangeOnAddRemoveSupported;
    }

    public Boolean isEncryptionFaultToleranceSupported() {
        return encryptionFaultToleranceSupported;
    }

    public void setEncryptionFaultToleranceSupported(final Boolean encryptionFaultToleranceSupported) {
        this.encryptionFaultToleranceSupported = encryptionFaultToleranceSupported;
    }

    public Boolean isEncryptionHBRSupported() {
        return encryptionHBRSupported;
    }

    public void setEncryptionHBRSupported(final Boolean encryptionHBRSupported) {
        this.encryptionHBRSupported = encryptionHBRSupported;
    }

    public Boolean isEncryptionHotOperationSupported() {
        return encryptionHotOperationSupported;
    }

    public void setEncryptionHotOperationSupported(final Boolean encryptionHotOperationSupported) {
        this.encryptionHotOperationSupported = encryptionHotOperationSupported;
    }

    public Boolean isEncryptionMemorySaveSupported() {
        return encryptionMemorySaveSupported;
    }

    public void setEncryptionMemorySaveSupported(final Boolean encryptionMemorySaveSupported) {
        this.encryptionMemorySaveSupported = encryptionMemorySaveSupported;
    }

    public Boolean isEncryptionRDMSupported() {
        return encryptionRDMSupported;
    }

    public void setEncryptionRDMSupported(final Boolean encryptionRDMSupported) {
        this.encryptionRDMSupported = encryptionRDMSupported;
    }

    public Boolean isEncryptionVFlashSupported() {
        return encryptionVFlashSupported;
    }

    public void setEncryptionVFlashSupported(final Boolean encryptionVFlashSupported) {
        this.encryptionVFlashSupported = encryptionVFlashSupported;
    }

    public Boolean isEncryptionWithSnapshotsSupported() {
        return encryptionWithSnapshotsSupported;
    }

    public void setEncryptionWithSnapshotsSupported(final Boolean encryptionWithSnapshotsSupported) {
        this.encryptionWithSnapshotsSupported = encryptionWithSnapshotsSupported;
    }

    public Boolean isGatewayOnNicSupported() {
        return gatewayOnNicSupported;
    }

    public void setGatewayOnNicSupported(final Boolean gatewayOnNicSupported) {
        this.gatewayOnNicSupported = gatewayOnNicSupported;
    }

    public Boolean isHostAccessManagerSupported() {
        return hostAccessManagerSupported;
    }

    public void setHostAccessManagerSupported(final Boolean hostAccessManagerSupported) {
        this.hostAccessManagerSupported = hostAccessManagerSupported;
    }

    public Boolean isMarkAsLocalSupported() {
        return markAsLocalSupported;
    }

    public void setMarkAsLocalSupported(final Boolean markAsLocalSupported) {
        this.markAsLocalSupported = markAsLocalSupported;
    }

    public Boolean isMarkAsSsdSupported() {
        return markAsSsdSupported;
    }

    public void setMarkAsSsdSupported(final Boolean markAsSsdSupported) {
        this.markAsSsdSupported = markAsSsdSupported;
    }

    public Integer getMaxNumDisksSVMotion() {
        return maxNumDisksSVMotion;
    }

    public void setMaxNumDisksSVMotion(final Integer maxNumDisksSVMotion) {
        this.maxNumDisksSVMotion = maxNumDisksSVMotion;
    }

    public Integer getMaxVcpusPerFtVm() {
        return maxVcpusPerFtVm;
    }

    public void setMaxVcpusPerFtVm(final Integer maxVcpusPerFtVm) {
        this.maxVcpusPerFtVm = maxVcpusPerFtVm;
    }

    public Boolean isMessageBusProxySupported() {
        return messageBusProxySupported;
    }

    public void setMessageBusProxySupported(final Boolean messageBusProxySupported) {
        this.messageBusProxySupported = messageBusProxySupported;
    }

    public Boolean isNfs41Krb5iSupported() {
        return nfs41Krb5iSupported;
    }

    public void setNfs41Krb5iSupported(final Boolean nfs41Krb5iSupported) {
        this.nfs41Krb5iSupported = nfs41Krb5iSupported;
    }

    public Boolean isNfs41Supported() {
        return nfs41Supported;
    }

    public void setNfs41Supported(final Boolean nfs41Supported) {
        this.nfs41Supported = nfs41Supported;
    }

    public Boolean isOneKVolumeAPIsSupported() {
        return oneKVolumeAPIsSupported;
    }

    public void setOneKVolumeAPIsSupported(final Boolean oneKVolumeAPIsSupported) {
        this.oneKVolumeAPIsSupported = oneKVolumeAPIsSupported;
    }

    public Boolean isProvisioningNicSelectionSupported() {
        return provisioningNicSelectionSupported;
    }

    public void setProvisioningNicSelectionSupported(final Boolean provisioningNicSelectionSupported) {
        this.provisioningNicSelectionSupported = provisioningNicSelectionSupported;
    }

    public Boolean isSmartCardAuthenticationSupported() {
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

    public Boolean isSmpFtSupported() {
        return smpFtSupported;
    }

    public void setSmpFtSupported(final Boolean smpFtSupported) {
        this.smpFtSupported = smpFtSupported;
    }

    public Boolean isTurnDiskLocatorLedSupported() {
        return turnDiskLocatorLedSupported;
    }

    public void setTurnDiskLocatorLedSupported(final Boolean turnDiskLocatorLedSupported) {
        this.turnDiskLocatorLedSupported = turnDiskLocatorLedSupported;
    }

    public Boolean isUpitSupported() {
        return upitSupported;
    }

    public void setUpitSupported(final Boolean upitSupported) {
        this.upitSupported = upitSupported;
    }

    public Boolean isVirtualVolumeDatastoreSupported() {
        return virtualVolumeDatastoreSupported;
    }

    public void setVirtualVolumeDatastoreSupported(final Boolean virtualVolumeDatastoreSupported) {
        this.virtualVolumeDatastoreSupported = virtualVolumeDatastoreSupported;
    }

    public Boolean isVrNfcNicSelectionSupported() {
        return vrNfcNicSelectionSupported;
    }

    public void setVrNfcNicSelectionSupported(final Boolean vrNfcNicSelectionSupported) {
        this.vrNfcNicSelectionSupported = vrNfcNicSelectionSupported;
    }
}