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
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2
 */
@SuppressWarnings("unused")
public class HostCapability extends DynamicData {

    private boolean recursiveResourcePoolsSupported;
    private boolean cpuMemoryResourceConfigurationSupported;
    private boolean rebootSupported;
    private boolean shutdownSupported;
    private boolean vmotionSupported;
    private boolean standbySupported;
    private Boolean ipmiSupported;
    private Integer maxSupportedVMs;
    private Integer maxRunningVMs;
    private Integer maxSupportedVcpus;
    private Integer maxRegisteredVMs;
    private boolean datastorePrincipalSupported;
    private boolean sanSupported;
    private boolean nfsSupported;
    private boolean iscsiSupported;
    private boolean vlanTaggingSupported;
    private boolean nicTeamingSupported;
    private boolean highGuestMemSupported;
    private boolean maintenanceModeSupported;
    private boolean suspendedRelocateSupported;
    private boolean restrictedSnapshotRelocateSupported;
    private boolean perVmSwapFiles;
    private boolean localSwapDatastoreSupported;
    private boolean unsharedSwapVMotionSupported;
    private boolean backgroundSnapshotsSupported;
    private boolean preAssignedPCIUnitNumbersSupported;
    private boolean screenshotSupported;
    private boolean scaledScreenshotSupported;
    private Boolean storageVMotionSupported;
    private Boolean vmotionWithStorageVMotionSupported;
    private Boolean vmotionAcrossNetworkSupported;
    private Integer maxNumDisksSVMotion;
    private Boolean hbrNicSelectionSupported;
    private Boolean vrNfcNicSelectionSupported;
    @Deprecated
    private Boolean recordReplaySupported;
    @Deprecated
    private Boolean ftSupported;
    @Deprecated
    private String replayUnsupportedReason;
    @Deprecated
    private String[] replayCompatibilityIssues;
    private Boolean smpFtSupported;
    @Deprecated
    private String[] ftCompatibilityIssues;
    private String[] smpFtCompatibilityIssues;
    private Integer maxVcpusPerFtVm;
    private Boolean loginBySSLThumbprintSupported;
    private Boolean cloneFromSnapshotSupported;
    private Boolean deltaDiskBackingsSupported;
    private Boolean perVMNetworkTrafficShapingSupported;
    private Boolean tpmSupported;
    private String tpmVersion;
    private Boolean txtEnabled;
    @Deprecated
    private HostCpuIdInfo[] supportedCpuFeature;
    private Boolean virtualExecUsageSupported;
    private Boolean storageIORMSupported;
    private Boolean vmDirectPathGen2Supported;
    private String[] vmDirectPathGen2UnsupportedReason;
    private String vmDirectPathGen2UnsupportedReasonExtended;
    private int[] supportedVmfsMajorVersion;
    private Boolean vStorageCapable;
    private Boolean snapshotRelayoutSupported;
    private Boolean firewallIpRulesSupported;
    private Boolean servicePackageInfoSupported;
    private Integer maxHostRunningVms;
    private Integer maxHostSupportedVcpus;
    private Boolean vmfsDatastoreMountCapable;
    private Boolean eightPlusHostVmfsSharedAccessSupported;
    private Boolean nestedHVSupported;
    private Boolean vPMCSupported;
    private Boolean interVMCommunicationThroughVMCISupported;
    private Boolean scheduledHardwareUpgradeSupported;
    private Boolean featureCapabilitiesSupported;
    private Boolean latencySensitivitySupported;
    private Boolean storagePolicySupported;
    private Boolean accel3dSupported;
    private Boolean reliableMemoryAware;
    private Boolean multipleNetworkStackInstanceSupported;
    private Boolean messageBusProxySupported;
    private Boolean vsanSupported;
    private Boolean vFlashSupported;
    private Boolean hostAccessManagerSupported;
    private Boolean provisioningNicSelectionSupported;
    private Boolean nfs41Supported;
    private Boolean nfs41Krb5iSupported;
    private Boolean turnDiskLocatorLedSupported;
    private Boolean virtualVolumeDatastoreSupported;
    private Boolean markAsSsdSupported;
    private Boolean markAsLocalSupported;
    private Boolean smartCardAuthenticationSupported;
    private Boolean pMemSupported;
    private Boolean pMemSnapshotSupported;
    private Boolean cryptoSupported;
    private Boolean oneKVolumeAPIsSupported;
    private Boolean gatewayOnNicSupported;
    private Boolean upitSupported;
    private Boolean cpuHwMmuSupported;
    private Boolean encryptedVMotionSupported;
    private Boolean encryptionChangeOnAddRemoveSupported;
    private Boolean encryptionHotOperationSupported;
    private Boolean encryptionWithSnapshotsSupported;
    private Boolean encryptionFaultToleranceSupported;
    private Boolean encryptionMemorySaveSupported;
    private Boolean encryptionRDMSupported;
    private Boolean encryptionVFlashSupported;
    private Boolean encryptionCBRCSupported;
    private Boolean encryptionHBRSupported;
    private Boolean ftEfiSupported;
    private String unmapMethodSupported;
    private Integer maxMemMBPerFtVm;
    private Boolean virtualMmuUsageIgnored;
    private Boolean virtualExecUsageIgnored;
    private Boolean vmCreateDateSupported;
    private Boolean vmfs3EOLSupported;
    private Boolean ftVmcpSupported;
    private Boolean quickBootSupported;
    private Boolean assignableHardwareSupported;
    private Boolean useFeatureReqsForOldHWv;
    private Boolean markPerenniallyReservedSupported;
    private Boolean hppPspSupported;
    private Boolean deviceRebindWithoutRebootSupported;
    private Boolean storagePolicyChangeSupported;
    private Boolean precisionTimeProtocolSupported;
    private Boolean remoteDeviceVMotionSupported;
    private Integer maxSupportedVmMemory;
    private Boolean ahDeviceHintsSupported;
    private Boolean assignHwPciConfigSupported;
    private Boolean pMemFailoverSupported;
    private Boolean hostConfigEncryptionSupported;

    @Override
    public String toString() {
        return "HostCapability{" +
                "recursiveResourcePoolsSupported=" + recursiveResourcePoolsSupported +
                ", cpuMemoryResourceConfigurationSupported=" + cpuMemoryResourceConfigurationSupported +
                ", rebootSupported=" + rebootSupported +
                ", shutdownSupported=" + shutdownSupported +
                ", vmotionSupported=" + vmotionSupported +
                ", standbySupported=" + standbySupported +
                ", ipmiSupported=" + ipmiSupported +
                ", maxSupportedVMs=" + maxSupportedVMs +
                ", maxRunningVMs=" + maxRunningVMs +
                ", maxSupportedVcpus=" + maxSupportedVcpus +
                ", maxRegisteredVMs=" + maxRegisteredVMs +
                ", datastorePrincipalSupported=" + datastorePrincipalSupported +
                ", sanSupported=" + sanSupported +
                ", nfsSupported=" + nfsSupported +
                ", iscsiSupported=" + iscsiSupported +
                ", vlanTaggingSupported=" + vlanTaggingSupported +
                ", nicTeamingSupported=" + nicTeamingSupported +
                ", highGuestMemSupported=" + highGuestMemSupported +
                ", maintenanceModeSupported=" + maintenanceModeSupported +
                ", suspendedRelocateSupported=" + suspendedRelocateSupported +
                ", restrictedSnapshotRelocateSupported=" + restrictedSnapshotRelocateSupported +
                ", perVmSwapFiles=" + perVmSwapFiles +
                ", localSwapDatastoreSupported=" + localSwapDatastoreSupported +
                ", unsharedSwapVMotionSupported=" + unsharedSwapVMotionSupported +
                ", backgroundSnapshotsSupported=" + backgroundSnapshotsSupported +
                ", preAssignedPCIUnitNumbersSupported=" + preAssignedPCIUnitNumbersSupported +
                ", screenshotSupported=" + screenshotSupported +
                ", scaledScreenshotSupported=" + scaledScreenshotSupported +
                ", storageVMotionSupported=" + storageVMotionSupported +
                ", vmotionWithStorageVMotionSupported=" + vmotionWithStorageVMotionSupported +
                ", vmotionAcrossNetworkSupported=" + vmotionAcrossNetworkSupported +
                ", maxNumDisksSVMotion=" + maxNumDisksSVMotion +
                ", hbrNicSelectionSupported=" + hbrNicSelectionSupported +
                ", vrNfcNicSelectionSupported=" + vrNfcNicSelectionSupported +
                ", recordReplaySupported=" + recordReplaySupported +
                ", ftSupported=" + ftSupported +
                ", replayUnsupportedReason='" + replayUnsupportedReason + '\'' +
                ", replayCompatibilityIssues=" + Arrays.toString(replayCompatibilityIssues) +
                ", smpFtSupported=" + smpFtSupported +
                ", ftCompatibilityIssues=" + Arrays.toString(ftCompatibilityIssues) +
                ", smpFtCompatibilityIssues=" + Arrays.toString(smpFtCompatibilityIssues) +
                ", maxVcpusPerFtVm=" + maxVcpusPerFtVm +
                ", loginBySSLThumbprintSupported=" + loginBySSLThumbprintSupported +
                ", cloneFromSnapshotSupported=" + cloneFromSnapshotSupported +
                ", deltaDiskBackingsSupported=" + deltaDiskBackingsSupported +
                ", perVMNetworkTrafficShapingSupported=" + perVMNetworkTrafficShapingSupported +
                ", tpmSupported=" + tpmSupported +
                ", tpmVersion='" + tpmVersion + '\'' +
                ", txtEnabled=" + txtEnabled +
                ", supportedCpuFeature=" + Arrays.toString(supportedCpuFeature) +
                ", virtualExecUsageSupported=" + virtualExecUsageSupported +
                ", storageIORMSupported=" + storageIORMSupported +
                ", vmDirectPathGen2Supported=" + vmDirectPathGen2Supported +
                ", vmDirectPathGen2UnsupportedReason=" + Arrays.toString(vmDirectPathGen2UnsupportedReason) +
                ", vmDirectPathGen2UnsupportedReasonExtended='" + vmDirectPathGen2UnsupportedReasonExtended + '\'' +
                ", supportedVmfsMajorVersion=" + Arrays.toString(supportedVmfsMajorVersion) +
                ", vStorageCapable=" + vStorageCapable +
                ", snapshotRelayoutSupported=" + snapshotRelayoutSupported +
                ", firewallIpRulesSupported=" + firewallIpRulesSupported +
                ", servicePackageInfoSupported=" + servicePackageInfoSupported +
                ", maxHostRunningVms=" + maxHostRunningVms +
                ", maxHostSupportedVcpus=" + maxHostSupportedVcpus +
                ", vmfsDatastoreMountCapable=" + vmfsDatastoreMountCapable +
                ", eightPlusHostVmfsSharedAccessSupported=" + eightPlusHostVmfsSharedAccessSupported +
                ", nestedHVSupported=" + nestedHVSupported +
                ", vPMCSupported=" + vPMCSupported +
                ", interVMCommunicationThroughVMCISupported=" + interVMCommunicationThroughVMCISupported +
                ", scheduledHardwareUpgradeSupported=" + scheduledHardwareUpgradeSupported +
                ", featureCapabilitiesSupported=" + featureCapabilitiesSupported +
                ", latencySensitivitySupported=" + latencySensitivitySupported +
                ", storagePolicySupported=" + storagePolicySupported +
                ", accel3dSupported=" + accel3dSupported +
                ", reliableMemoryAware=" + reliableMemoryAware +
                ", multipleNetworkStackInstanceSupported=" + multipleNetworkStackInstanceSupported +
                ", messageBusProxySupported=" + messageBusProxySupported +
                ", vsanSupported=" + vsanSupported +
                ", vFlashSupported=" + vFlashSupported +
                ", hostAccessManagerSupported=" + hostAccessManagerSupported +
                ", provisioningNicSelectionSupported=" + provisioningNicSelectionSupported +
                ", nfs41Supported=" + nfs41Supported +
                ", nfs41Krb5iSupported=" + nfs41Krb5iSupported +
                ", turnDiskLocatorLedSupported=" + turnDiskLocatorLedSupported +
                ", virtualVolumeDatastoreSupported=" + virtualVolumeDatastoreSupported +
                ", markAsSsdSupported=" + markAsSsdSupported +
                ", markAsLocalSupported=" + markAsLocalSupported +
                ", smartCardAuthenticationSupported=" + smartCardAuthenticationSupported +
                ", pMemSupported=" + pMemSupported +
                ", pMemSnapshotSupported=" + pMemSnapshotSupported +
                ", cryptoSupported=" + cryptoSupported +
                ", oneKVolumeAPIsSupported=" + oneKVolumeAPIsSupported +
                ", gatewayOnNicSupported=" + gatewayOnNicSupported +
                ", upitSupported=" + upitSupported +
                ", cpuHwMmuSupported=" + cpuHwMmuSupported +
                ", encryptedVMotionSupported=" + encryptedVMotionSupported +
                ", encryptionChangeOnAddRemoveSupported=" + encryptionChangeOnAddRemoveSupported +
                ", encryptionHotOperationSupported=" + encryptionHotOperationSupported +
                ", encryptionWithSnapshotsSupported=" + encryptionWithSnapshotsSupported +
                ", encryptionFaultToleranceSupported=" + encryptionFaultToleranceSupported +
                ", encryptionMemorySaveSupported=" + encryptionMemorySaveSupported +
                ", encryptionRDMSupported=" + encryptionRDMSupported +
                ", encryptionVFlashSupported=" + encryptionVFlashSupported +
                ", encryptionCBRCSupported=" + encryptionCBRCSupported +
                ", encryptionHBRSupported=" + encryptionHBRSupported +
                ", ftEfiSupported=" + ftEfiSupported +
                ", unmapMethodSupported='" + unmapMethodSupported + '\'' +
                ", maxMemMBPerFtVm=" + maxMemMBPerFtVm +
                ", virtualMmuUsageIgnored=" + virtualMmuUsageIgnored +
                ", virtualExecUsageIgnored=" + virtualExecUsageIgnored +
                ", vmCreateDateSupported=" + vmCreateDateSupported +
                ", vmfs3EOLSupported=" + vmfs3EOLSupported +
                ", ftVmcpSupported=" + ftVmcpSupported +
                ", quickBootSupported=" + quickBootSupported +
                ", assignableHardwareSupported=" + assignableHardwareSupported +
                ", useFeatureReqsForOldHWv=" + useFeatureReqsForOldHWv +
                ", markPerenniallyReservedSupported=" + markPerenniallyReservedSupported +
                ", hppPspSupported=" + hppPspSupported +
                ", deviceRebindWithoutRebootSupported=" + deviceRebindWithoutRebootSupported +
                ", storagePolicyChangeSupported=" + storagePolicyChangeSupported +
                ", precisionTimeProtocolSupported=" + precisionTimeProtocolSupported +
                ", remoteDeviceVMotionSupported=" + remoteDeviceVMotionSupported +
                ", maxSupportedVmMemory=" + maxSupportedVmMemory +
                ", ahDeviceHintsSupported=" + ahDeviceHintsSupported +
                ", assignHwPciConfigSupported=" + assignHwPciConfigSupported +
                ", pMemFailoverSupported=" + pMemFailoverSupported +
                ", hostConfigEncryptionSupported=" + hostConfigEncryptionSupported +
                '}';
    }

    public boolean isRecursiveResourcePoolsSupported() {
        return recursiveResourcePoolsSupported;
    }

    public void setRecursiveResourcePoolsSupported(final boolean recursiveResourcePoolsSupported) {
        this.recursiveResourcePoolsSupported = recursiveResourcePoolsSupported;
    }

    public boolean isCpuMemoryResourceConfigurationSupported() {
        return cpuMemoryResourceConfigurationSupported;
    }

    public void setCpuMemoryResourceConfigurationSupported(final boolean cpuMemoryResourceConfigurationSupported) {
        this.cpuMemoryResourceConfigurationSupported = cpuMemoryResourceConfigurationSupported;
    }

    public boolean isRebootSupported() {
        return rebootSupported;
    }

    public void setRebootSupported(final boolean rebootSupported) {
        this.rebootSupported = rebootSupported;
    }

    public boolean isShutdownSupported() {
        return shutdownSupported;
    }

    public void setShutdownSupported(final boolean shutdownSupported) {
        this.shutdownSupported = shutdownSupported;
    }

    public boolean isVmotionSupported() {
        return vmotionSupported;
    }

    public void setVmotionSupported(final boolean vmotionSupported) {
        this.vmotionSupported = vmotionSupported;
    }

    public boolean isStandbySupported() {
        return standbySupported;
    }

    public void setStandbySupported(final boolean standbySupported) {
        this.standbySupported = standbySupported;
    }

    public Boolean getIpmiSupported() {
        return ipmiSupported;
    }

    public void setIpmiSupported(final Boolean ipmiSupported) {
        this.ipmiSupported = ipmiSupported;
    }

    public Integer getMaxSupportedVMs() {
        return maxSupportedVMs;
    }

    public void setMaxSupportedVMs(final Integer maxSupportedVMs) {
        this.maxSupportedVMs = maxSupportedVMs;
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

    public Integer getMaxRegisteredVMs() {
        return maxRegisteredVMs;
    }

    public void setMaxRegisteredVMs(final Integer maxRegisteredVMs) {
        this.maxRegisteredVMs = maxRegisteredVMs;
    }

    public boolean isDatastorePrincipalSupported() {
        return datastorePrincipalSupported;
    }

    public void setDatastorePrincipalSupported(final boolean datastorePrincipalSupported) {
        this.datastorePrincipalSupported = datastorePrincipalSupported;
    }

    public boolean isSanSupported() {
        return sanSupported;
    }

    public void setSanSupported(final boolean sanSupported) {
        this.sanSupported = sanSupported;
    }

    public boolean isNfsSupported() {
        return nfsSupported;
    }

    public void setNfsSupported(final boolean nfsSupported) {
        this.nfsSupported = nfsSupported;
    }

    public boolean isIscsiSupported() {
        return iscsiSupported;
    }

    public void setIscsiSupported(final boolean iscsiSupported) {
        this.iscsiSupported = iscsiSupported;
    }

    public boolean isVlanTaggingSupported() {
        return vlanTaggingSupported;
    }

    public void setVlanTaggingSupported(final boolean vlanTaggingSupported) {
        this.vlanTaggingSupported = vlanTaggingSupported;
    }

    public boolean isNicTeamingSupported() {
        return nicTeamingSupported;
    }

    public void setNicTeamingSupported(final boolean nicTeamingSupported) {
        this.nicTeamingSupported = nicTeamingSupported;
    }

    public boolean isHighGuestMemSupported() {
        return highGuestMemSupported;
    }

    public void setHighGuestMemSupported(final boolean highGuestMemSupported) {
        this.highGuestMemSupported = highGuestMemSupported;
    }

    public boolean isMaintenanceModeSupported() {
        return maintenanceModeSupported;
    }

    public void setMaintenanceModeSupported(final boolean maintenanceModeSupported) {
        this.maintenanceModeSupported = maintenanceModeSupported;
    }

    public boolean isSuspendedRelocateSupported() {
        return suspendedRelocateSupported;
    }

    public void setSuspendedRelocateSupported(final boolean suspendedRelocateSupported) {
        this.suspendedRelocateSupported = suspendedRelocateSupported;
    }

    public boolean isRestrictedSnapshotRelocateSupported() {
        return restrictedSnapshotRelocateSupported;
    }

    public void setRestrictedSnapshotRelocateSupported(final boolean restrictedSnapshotRelocateSupported) {
        this.restrictedSnapshotRelocateSupported = restrictedSnapshotRelocateSupported;
    }

    public boolean isPerVmSwapFiles() {
        return perVmSwapFiles;
    }

    public void setPerVmSwapFiles(final boolean perVmSwapFiles) {
        this.perVmSwapFiles = perVmSwapFiles;
    }

    public boolean isLocalSwapDatastoreSupported() {
        return localSwapDatastoreSupported;
    }

    public void setLocalSwapDatastoreSupported(final boolean localSwapDatastoreSupported) {
        this.localSwapDatastoreSupported = localSwapDatastoreSupported;
    }

    public boolean isUnsharedSwapVMotionSupported() {
        return unsharedSwapVMotionSupported;
    }

    public void setUnsharedSwapVMotionSupported(final boolean unsharedSwapVMotionSupported) {
        this.unsharedSwapVMotionSupported = unsharedSwapVMotionSupported;
    }

    public boolean isBackgroundSnapshotsSupported() {
        return backgroundSnapshotsSupported;
    }

    public void setBackgroundSnapshotsSupported(final boolean backgroundSnapshotsSupported) {
        this.backgroundSnapshotsSupported = backgroundSnapshotsSupported;
    }

    public boolean isPreAssignedPCIUnitNumbersSupported() {
        return preAssignedPCIUnitNumbersSupported;
    }

    public void setPreAssignedPCIUnitNumbersSupported(final boolean preAssignedPCIUnitNumbersSupported) {
        this.preAssignedPCIUnitNumbersSupported = preAssignedPCIUnitNumbersSupported;
    }

    public boolean isScreenshotSupported() {
        return screenshotSupported;
    }

    public void setScreenshotSupported(final boolean screenshotSupported) {
        this.screenshotSupported = screenshotSupported;
    }

    public boolean isScaledScreenshotSupported() {
        return scaledScreenshotSupported;
    }

    public void setScaledScreenshotSupported(final boolean scaledScreenshotSupported) {
        this.scaledScreenshotSupported = scaledScreenshotSupported;
    }

    public Boolean getStorageVMotionSupported() {
        return storageVMotionSupported;
    }

    public void setStorageVMotionSupported(final Boolean storageVMotionSupported) {
        this.storageVMotionSupported = storageVMotionSupported;
    }

    public Boolean getVmotionWithStorageVMotionSupported() {
        return vmotionWithStorageVMotionSupported;
    }

    public void setVmotionWithStorageVMotionSupported(final Boolean vmotionWithStorageVMotionSupported) {
        this.vmotionWithStorageVMotionSupported = vmotionWithStorageVMotionSupported;
    }

    public Boolean getVmotionAcrossNetworkSupported() {
        return vmotionAcrossNetworkSupported;
    }

    public void setVmotionAcrossNetworkSupported(final Boolean vmotionAcrossNetworkSupported) {
        this.vmotionAcrossNetworkSupported = vmotionAcrossNetworkSupported;
    }

    public Integer getMaxNumDisksSVMotion() {
        return maxNumDisksSVMotion;
    }

    public void setMaxNumDisksSVMotion(final Integer maxNumDisksSVMotion) {
        this.maxNumDisksSVMotion = maxNumDisksSVMotion;
    }

    public Boolean getHbrNicSelectionSupported() {
        return hbrNicSelectionSupported;
    }

    public void setHbrNicSelectionSupported(final Boolean hbrNicSelectionSupported) {
        this.hbrNicSelectionSupported = hbrNicSelectionSupported;
    }

    public Boolean getVrNfcNicSelectionSupported() {
        return vrNfcNicSelectionSupported;
    }

    public void setVrNfcNicSelectionSupported(final Boolean vrNfcNicSelectionSupported) {
        this.vrNfcNicSelectionSupported = vrNfcNicSelectionSupported;
    }

    public Boolean getRecordReplaySupported() {
        return recordReplaySupported;
    }

    public void setRecordReplaySupported(final Boolean recordReplaySupported) {
        this.recordReplaySupported = recordReplaySupported;
    }

    public Boolean getFtSupported() {
        return ftSupported;
    }

    public void setFtSupported(final Boolean ftSupported) {
        this.ftSupported = ftSupported;
    }

    public String getReplayUnsupportedReason() {
        return replayUnsupportedReason;
    }

    public void setReplayUnsupportedReason(final String replayUnsupportedReason) {
        this.replayUnsupportedReason = replayUnsupportedReason;
    }

    public String[] getReplayCompatibilityIssues() {
        return replayCompatibilityIssues;
    }

    public void setReplayCompatibilityIssues(final String[] replayCompatibilityIssues) {
        this.replayCompatibilityIssues = replayCompatibilityIssues;
    }

    public Boolean getSmpFtSupported() {
        return smpFtSupported;
    }

    public void setSmpFtSupported(final Boolean smpFtSupported) {
        this.smpFtSupported = smpFtSupported;
    }

    public String[] getFtCompatibilityIssues() {
        return ftCompatibilityIssues;
    }

    public void setFtCompatibilityIssues(final String[] ftCompatibilityIssues) {
        this.ftCompatibilityIssues = ftCompatibilityIssues;
    }

    public String[] getSmpFtCompatibilityIssues() {
        return smpFtCompatibilityIssues;
    }

    public void setSmpFtCompatibilityIssues(final String[] smpFtCompatibilityIssues) {
        this.smpFtCompatibilityIssues = smpFtCompatibilityIssues;
    }

    public Integer getMaxVcpusPerFtVm() {
        return maxVcpusPerFtVm;
    }

    public void setMaxVcpusPerFtVm(final Integer maxVcpusPerFtVm) {
        this.maxVcpusPerFtVm = maxVcpusPerFtVm;
    }

    public Boolean getLoginBySSLThumbprintSupported() {
        return loginBySSLThumbprintSupported;
    }

    public void setLoginBySSLThumbprintSupported(final Boolean loginBySSLThumbprintSupported) {
        this.loginBySSLThumbprintSupported = loginBySSLThumbprintSupported;
    }

    public Boolean getCloneFromSnapshotSupported() {
        return cloneFromSnapshotSupported;
    }

    public void setCloneFromSnapshotSupported(final Boolean cloneFromSnapshotSupported) {
        this.cloneFromSnapshotSupported = cloneFromSnapshotSupported;
    }

    public Boolean getDeltaDiskBackingsSupported() {
        return deltaDiskBackingsSupported;
    }

    public void setDeltaDiskBackingsSupported(final Boolean deltaDiskBackingsSupported) {
        this.deltaDiskBackingsSupported = deltaDiskBackingsSupported;
    }

    public Boolean getPerVMNetworkTrafficShapingSupported() {
        return perVMNetworkTrafficShapingSupported;
    }

    public void setPerVMNetworkTrafficShapingSupported(final Boolean perVMNetworkTrafficShapingSupported) {
        this.perVMNetworkTrafficShapingSupported = perVMNetworkTrafficShapingSupported;
    }

    public Boolean getTpmSupported() {
        return tpmSupported;
    }

    public void setTpmSupported(final Boolean tpmSupported) {
        this.tpmSupported = tpmSupported;
    }

    public String getTpmVersion() {
        return tpmVersion;
    }

    public void setTpmVersion(final String tpmVersion) {
        this.tpmVersion = tpmVersion;
    }

    public Boolean getTxtEnabled() {
        return txtEnabled;
    }

    public void setTxtEnabled(final Boolean txtEnabled) {
        this.txtEnabled = txtEnabled;
    }

    public HostCpuIdInfo[] getSupportedCpuFeature() {
        return supportedCpuFeature;
    }

    public void setSupportedCpuFeature(final HostCpuIdInfo[] supportedCpuFeature) {
        this.supportedCpuFeature = supportedCpuFeature;
    }

    public Boolean getVirtualExecUsageSupported() {
        return virtualExecUsageSupported;
    }

    public void setVirtualExecUsageSupported(final Boolean virtualExecUsageSupported) {
        this.virtualExecUsageSupported = virtualExecUsageSupported;
    }

    public Boolean getStorageIORMSupported() {
        return storageIORMSupported;
    }

    public void setStorageIORMSupported(final Boolean storageIORMSupported) {
        this.storageIORMSupported = storageIORMSupported;
    }

    public Boolean getVmDirectPathGen2Supported() {
        return vmDirectPathGen2Supported;
    }

    public void setVmDirectPathGen2Supported(final Boolean vmDirectPathGen2Supported) {
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

    public int[] getSupportedVmfsMajorVersion() {
        return supportedVmfsMajorVersion;
    }

    public void setSupportedVmfsMajorVersion(final int[] supportedVmfsMajorVersion) {
        this.supportedVmfsMajorVersion = supportedVmfsMajorVersion;
    }

    public Boolean getvStorageCapable() {
        return vStorageCapable;
    }

    public void setvStorageCapable(final Boolean vStorageCapable) {
        this.vStorageCapable = vStorageCapable;
    }

    public Boolean getSnapshotRelayoutSupported() {
        return snapshotRelayoutSupported;
    }

    public void setSnapshotRelayoutSupported(final Boolean snapshotRelayoutSupported) {
        this.snapshotRelayoutSupported = snapshotRelayoutSupported;
    }

    public Boolean getFirewallIpRulesSupported() {
        return firewallIpRulesSupported;
    }

    public void setFirewallIpRulesSupported(final Boolean firewallIpRulesSupported) {
        this.firewallIpRulesSupported = firewallIpRulesSupported;
    }

    public Boolean getServicePackageInfoSupported() {
        return servicePackageInfoSupported;
    }

    public void setServicePackageInfoSupported(final Boolean servicePackageInfoSupported) {
        this.servicePackageInfoSupported = servicePackageInfoSupported;
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

    public Boolean getVmfsDatastoreMountCapable() {
        return vmfsDatastoreMountCapable;
    }

    public void setVmfsDatastoreMountCapable(final Boolean vmfsDatastoreMountCapable) {
        this.vmfsDatastoreMountCapable = vmfsDatastoreMountCapable;
    }

    public Boolean getEightPlusHostVmfsSharedAccessSupported() {
        return eightPlusHostVmfsSharedAccessSupported;
    }

    public void setEightPlusHostVmfsSharedAccessSupported(final Boolean eightPlusHostVmfsSharedAccessSupported) {
        this.eightPlusHostVmfsSharedAccessSupported = eightPlusHostVmfsSharedAccessSupported;
    }

    public Boolean getNestedHVSupported() {
        return nestedHVSupported;
    }

    public void setNestedHVSupported(final Boolean nestedHVSupported) {
        this.nestedHVSupported = nestedHVSupported;
    }

    public Boolean getvPMCSupported() {
        return vPMCSupported;
    }

    public void setvPMCSupported(final Boolean vPMCSupported) {
        this.vPMCSupported = vPMCSupported;
    }

    public Boolean getInterVMCommunicationThroughVMCISupported() {
        return interVMCommunicationThroughVMCISupported;
    }

    public void setInterVMCommunicationThroughVMCISupported(final Boolean interVMCommunicationThroughVMCISupported) {
        this.interVMCommunicationThroughVMCISupported = interVMCommunicationThroughVMCISupported;
    }

    public Boolean getScheduledHardwareUpgradeSupported() {
        return scheduledHardwareUpgradeSupported;
    }

    public void setScheduledHardwareUpgradeSupported(final Boolean scheduledHardwareUpgradeSupported) {
        this.scheduledHardwareUpgradeSupported = scheduledHardwareUpgradeSupported;
    }

    public Boolean getFeatureCapabilitiesSupported() {
        return featureCapabilitiesSupported;
    }

    public void setFeatureCapabilitiesSupported(final Boolean featureCapabilitiesSupported) {
        this.featureCapabilitiesSupported = featureCapabilitiesSupported;
    }

    public Boolean getLatencySensitivitySupported() {
        return latencySensitivitySupported;
    }

    public void setLatencySensitivitySupported(final Boolean latencySensitivitySupported) {
        this.latencySensitivitySupported = latencySensitivitySupported;
    }

    public Boolean getStoragePolicySupported() {
        return storagePolicySupported;
    }

    public void setStoragePolicySupported(final Boolean storagePolicySupported) {
        this.storagePolicySupported = storagePolicySupported;
    }

    public Boolean getAccel3dSupported() {
        return accel3dSupported;
    }

    public void setAccel3dSupported(final Boolean accel3dSupported) {
        this.accel3dSupported = accel3dSupported;
    }

    public Boolean getReliableMemoryAware() {
        return reliableMemoryAware;
    }

    public void setReliableMemoryAware(final Boolean reliableMemoryAware) {
        this.reliableMemoryAware = reliableMemoryAware;
    }

    public Boolean getMultipleNetworkStackInstanceSupported() {
        return multipleNetworkStackInstanceSupported;
    }

    public void setMultipleNetworkStackInstanceSupported(final Boolean multipleNetworkStackInstanceSupported) {
        this.multipleNetworkStackInstanceSupported = multipleNetworkStackInstanceSupported;
    }

    public Boolean getMessageBusProxySupported() {
        return messageBusProxySupported;
    }

    public void setMessageBusProxySupported(final Boolean messageBusProxySupported) {
        this.messageBusProxySupported = messageBusProxySupported;
    }

    public Boolean getVsanSupported() {
        return vsanSupported;
    }

    public void setVsanSupported(final Boolean vsanSupported) {
        this.vsanSupported = vsanSupported;
    }

    public Boolean getvFlashSupported() {
        return vFlashSupported;
    }

    public void setvFlashSupported(final Boolean vFlashSupported) {
        this.vFlashSupported = vFlashSupported;
    }

    public Boolean getHostAccessManagerSupported() {
        return hostAccessManagerSupported;
    }

    public void setHostAccessManagerSupported(final Boolean hostAccessManagerSupported) {
        this.hostAccessManagerSupported = hostAccessManagerSupported;
    }

    public Boolean getProvisioningNicSelectionSupported() {
        return provisioningNicSelectionSupported;
    }

    public void setProvisioningNicSelectionSupported(final Boolean provisioningNicSelectionSupported) {
        this.provisioningNicSelectionSupported = provisioningNicSelectionSupported;
    }

    public Boolean getNfs41Supported() {
        return nfs41Supported;
    }

    public void setNfs41Supported(final Boolean nfs41Supported) {
        this.nfs41Supported = nfs41Supported;
    }

    public Boolean getNfs41Krb5iSupported() {
        return nfs41Krb5iSupported;
    }

    public void setNfs41Krb5iSupported(final Boolean nfs41Krb5iSupported) {
        this.nfs41Krb5iSupported = nfs41Krb5iSupported;
    }

    public Boolean getTurnDiskLocatorLedSupported() {
        return turnDiskLocatorLedSupported;
    }

    public void setTurnDiskLocatorLedSupported(final Boolean turnDiskLocatorLedSupported) {
        this.turnDiskLocatorLedSupported = turnDiskLocatorLedSupported;
    }

    public Boolean getVirtualVolumeDatastoreSupported() {
        return virtualVolumeDatastoreSupported;
    }

    public void setVirtualVolumeDatastoreSupported(final Boolean virtualVolumeDatastoreSupported) {
        this.virtualVolumeDatastoreSupported = virtualVolumeDatastoreSupported;
    }

    public Boolean getMarkAsSsdSupported() {
        return markAsSsdSupported;
    }

    public void setMarkAsSsdSupported(final Boolean markAsSsdSupported) {
        this.markAsSsdSupported = markAsSsdSupported;
    }

    public Boolean getMarkAsLocalSupported() {
        return markAsLocalSupported;
    }

    public void setMarkAsLocalSupported(final Boolean markAsLocalSupported) {
        this.markAsLocalSupported = markAsLocalSupported;
    }

    public Boolean getSmartCardAuthenticationSupported() {
        return smartCardAuthenticationSupported;
    }

    public void setSmartCardAuthenticationSupported(final Boolean smartCardAuthenticationSupported) {
        this.smartCardAuthenticationSupported = smartCardAuthenticationSupported;
    }

    public Boolean getpMemSupported() {
        return pMemSupported;
    }

    public void setpMemSupported(final Boolean pMemSupported) {
        this.pMemSupported = pMemSupported;
    }

    public Boolean getpMemSnapshotSupported() {
        return pMemSnapshotSupported;
    }

    public void setpMemSnapshotSupported(final Boolean pMemSnapshotSupported) {
        this.pMemSnapshotSupported = pMemSnapshotSupported;
    }

    public Boolean getCryptoSupported() {
        return cryptoSupported;
    }

    public void setCryptoSupported(final Boolean cryptoSupported) {
        this.cryptoSupported = cryptoSupported;
    }

    public Boolean getOneKVolumeAPIsSupported() {
        return oneKVolumeAPIsSupported;
    }

    public void setOneKVolumeAPIsSupported(final Boolean oneKVolumeAPIsSupported) {
        this.oneKVolumeAPIsSupported = oneKVolumeAPIsSupported;
    }

    public Boolean getGatewayOnNicSupported() {
        return gatewayOnNicSupported;
    }

    public void setGatewayOnNicSupported(final Boolean gatewayOnNicSupported) {
        this.gatewayOnNicSupported = gatewayOnNicSupported;
    }

    public Boolean getUpitSupported() {
        return upitSupported;
    }

    public void setUpitSupported(final Boolean upitSupported) {
        this.upitSupported = upitSupported;
    }

    public Boolean getCpuHwMmuSupported() {
        return cpuHwMmuSupported;
    }

    public void setCpuHwMmuSupported(final Boolean cpuHwMmuSupported) {
        this.cpuHwMmuSupported = cpuHwMmuSupported;
    }

    public Boolean getEncryptedVMotionSupported() {
        return encryptedVMotionSupported;
    }

    public void setEncryptedVMotionSupported(final Boolean encryptedVMotionSupported) {
        this.encryptedVMotionSupported = encryptedVMotionSupported;
    }

    public Boolean getEncryptionChangeOnAddRemoveSupported() {
        return encryptionChangeOnAddRemoveSupported;
    }

    public void setEncryptionChangeOnAddRemoveSupported(final Boolean encryptionChangeOnAddRemoveSupported) {
        this.encryptionChangeOnAddRemoveSupported = encryptionChangeOnAddRemoveSupported;
    }

    public Boolean getEncryptionHotOperationSupported() {
        return encryptionHotOperationSupported;
    }

    public void setEncryptionHotOperationSupported(final Boolean encryptionHotOperationSupported) {
        this.encryptionHotOperationSupported = encryptionHotOperationSupported;
    }

    public Boolean getEncryptionWithSnapshotsSupported() {
        return encryptionWithSnapshotsSupported;
    }

    public void setEncryptionWithSnapshotsSupported(final Boolean encryptionWithSnapshotsSupported) {
        this.encryptionWithSnapshotsSupported = encryptionWithSnapshotsSupported;
    }

    public Boolean getEncryptionFaultToleranceSupported() {
        return encryptionFaultToleranceSupported;
    }

    public void setEncryptionFaultToleranceSupported(final Boolean encryptionFaultToleranceSupported) {
        this.encryptionFaultToleranceSupported = encryptionFaultToleranceSupported;
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

    public Boolean getEncryptionCBRCSupported() {
        return encryptionCBRCSupported;
    }

    public void setEncryptionCBRCSupported(final Boolean encryptionCBRCSupported) {
        this.encryptionCBRCSupported = encryptionCBRCSupported;
    }

    public Boolean getEncryptionHBRSupported() {
        return encryptionHBRSupported;
    }

    public void setEncryptionHBRSupported(final Boolean encryptionHBRSupported) {
        this.encryptionHBRSupported = encryptionHBRSupported;
    }

    public Boolean getFtEfiSupported() {
        return ftEfiSupported;
    }

    public void setFtEfiSupported(final Boolean ftEfiSupported) {
        this.ftEfiSupported = ftEfiSupported;
    }

    public String getUnmapMethodSupported() {
        return unmapMethodSupported;
    }

    public void setUnmapMethodSupported(final String unmapMethodSupported) {
        this.unmapMethodSupported = unmapMethodSupported;
    }

    public Integer getMaxMemMBPerFtVm() {
        return maxMemMBPerFtVm;
    }

    public void setMaxMemMBPerFtVm(final Integer maxMemMBPerFtVm) {
        this.maxMemMBPerFtVm = maxMemMBPerFtVm;
    }

    public Boolean getVirtualMmuUsageIgnored() {
        return virtualMmuUsageIgnored;
    }

    public void setVirtualMmuUsageIgnored(final Boolean virtualMmuUsageIgnored) {
        this.virtualMmuUsageIgnored = virtualMmuUsageIgnored;
    }

    public Boolean getVirtualExecUsageIgnored() {
        return virtualExecUsageIgnored;
    }

    public void setVirtualExecUsageIgnored(final Boolean virtualExecUsageIgnored) {
        this.virtualExecUsageIgnored = virtualExecUsageIgnored;
    }

    public Boolean getVmCreateDateSupported() {
        return vmCreateDateSupported;
    }

    public void setVmCreateDateSupported(final Boolean vmCreateDateSupported) {
        this.vmCreateDateSupported = vmCreateDateSupported;
    }

    public Boolean getVmfs3EOLSupported() {
        return vmfs3EOLSupported;
    }

    public void setVmfs3EOLSupported(final Boolean vmfs3EOLSupported) {
        this.vmfs3EOLSupported = vmfs3EOLSupported;
    }

    public Boolean getFtVmcpSupported() {
        return ftVmcpSupported;
    }

    public void setFtVmcpSupported(final Boolean ftVmcpSupported) {
        this.ftVmcpSupported = ftVmcpSupported;
    }

    public Boolean getQuickBootSupported() {
        return quickBootSupported;
    }

    public void setQuickBootSupported(final Boolean quickBootSupported) {
        this.quickBootSupported = quickBootSupported;
    }

    public Boolean getAssignableHardwareSupported() {
        return assignableHardwareSupported;
    }

    public void setAssignableHardwareSupported(final Boolean assignableHardwareSupported) {
        this.assignableHardwareSupported = assignableHardwareSupported;
    }

    public Boolean getUseFeatureReqsForOldHWv() {
        return useFeatureReqsForOldHWv;
    }

    public void setUseFeatureReqsForOldHWv(final Boolean useFeatureReqsForOldHWv) {
        this.useFeatureReqsForOldHWv = useFeatureReqsForOldHWv;
    }

    public Boolean getMarkPerenniallyReservedSupported() {
        return markPerenniallyReservedSupported;
    }

    public void setMarkPerenniallyReservedSupported(final Boolean markPerenniallyReservedSupported) {
        this.markPerenniallyReservedSupported = markPerenniallyReservedSupported;
    }

    public Boolean getHppPspSupported() {
        return hppPspSupported;
    }

    public void setHppPspSupported(final Boolean hppPspSupported) {
        this.hppPspSupported = hppPspSupported;
    }

    public Boolean getDeviceRebindWithoutRebootSupported() {
        return deviceRebindWithoutRebootSupported;
    }

    public void setDeviceRebindWithoutRebootSupported(final Boolean deviceRebindWithoutRebootSupported) {
        this.deviceRebindWithoutRebootSupported = deviceRebindWithoutRebootSupported;
    }

    public Boolean getStoragePolicyChangeSupported() {
        return storagePolicyChangeSupported;
    }

    public void setStoragePolicyChangeSupported(final Boolean storagePolicyChangeSupported) {
        this.storagePolicyChangeSupported = storagePolicyChangeSupported;
    }

    public Boolean getPrecisionTimeProtocolSupported() {
        return precisionTimeProtocolSupported;
    }

    public void setPrecisionTimeProtocolSupported(final Boolean precisionTimeProtocolSupported) {
        this.precisionTimeProtocolSupported = precisionTimeProtocolSupported;
    }

    public Boolean getRemoteDeviceVMotionSupported() {
        return remoteDeviceVMotionSupported;
    }

    public void setRemoteDeviceVMotionSupported(final Boolean remoteDeviceVMotionSupported) {
        this.remoteDeviceVMotionSupported = remoteDeviceVMotionSupported;
    }

    public Integer getMaxSupportedVmMemory() {
        return maxSupportedVmMemory;
    }

    public void setMaxSupportedVmMemory(final Integer maxSupportedVmMemory) {
        this.maxSupportedVmMemory = maxSupportedVmMemory;
    }

    public Boolean getAhDeviceHintsSupported() {
        return ahDeviceHintsSupported;
    }

    public void setAhDeviceHintsSupported(final Boolean ahDeviceHintsSupported) {
        this.ahDeviceHintsSupported = ahDeviceHintsSupported;
    }

    public Boolean getAssignHwPciConfigSupported() {
        return assignHwPciConfigSupported;
    }

    public void setAssignHwPciConfigSupported(final Boolean assignHwPciConfigSupported) {
        this.assignHwPciConfigSupported = assignHwPciConfigSupported;
    }

    public Boolean getpMemFailoverSupported() {
        return pMemFailoverSupported;
    }

    public void setpMemFailoverSupported(final Boolean pMemFailoverSupported) {
        this.pMemFailoverSupported = pMemFailoverSupported;
    }

    public Boolean getHostConfigEncryptionSupported() {
        return hostConfigEncryptionSupported;
    }

    public void setHostConfigEncryptionSupported(final Boolean hostConfigEncryptionSupported) {
        this.hostConfigEncryptionSupported = hostConfigEncryptionSupported;
    }

}
