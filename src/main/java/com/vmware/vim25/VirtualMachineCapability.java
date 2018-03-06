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
public class VirtualMachineCapability extends DynamicData {

    public boolean bootOptionsSupported;
    public boolean bootRetryOptionsSupported;
    public boolean changeTrackingSupported;
    public boolean consolePreferencesSupported;
    public boolean cpuFeatureMaskSupported;
    @Deprecated
    public boolean disableSnapshotsSupported;
    public boolean diskSharesSupported;
    public boolean featureRequirementSupported;
    public boolean guestAutoLockSupported;
    public boolean hostBasedReplicationSupported;
    public boolean lockSnapshotsSupported;
    public boolean memoryReservationLockSupported;
    public boolean memorySnapshotsSupported;
    public boolean multipleCoresPerSocketSupported;
    public boolean multipleSnapshotsSupported;
    public boolean nestedHVSupported;
    public boolean npivWwnOnNonRdmVmSupported;
    public boolean poweredOffSnapshotsSupported;
    public boolean poweredOnMonitorTypeChangeSupported;
    public boolean quiescedSnapshotsSupported;
    @Deprecated
    public boolean recordReplaySupported;
    public boolean revertToSnapshotSupported;
    public boolean s1AcpiManagementSupported;
    public Boolean secureBootSupported;
    public boolean seSparseDiskSupported;
    public boolean settingDisplayTopologySupported;
    public boolean settingScreenResolutionSupported;
    public boolean settingVideoRamSizeSupported;
    public boolean snapshotConfigSupported;
    public boolean snapshotOperationsSupported;
    public boolean swapPlacementSupported;
    public boolean toolsAutoUpdateSupported;
    public boolean toolsSyncTimeSupported;
    public boolean vPMCSupported;
    public boolean virtualMmuUsageSupported;
    public boolean vmNpivWwnDisableSupported;
    public boolean vmNpivWwnSupported;
    public boolean vmNpivWwnUpdateSupported;

    public boolean isSnapshotOperationsSupported() {
        return this.snapshotOperationsSupported;
    }

    public void setSnapshotOperationsSupported(boolean snapshotOperationsSupported) {
        this.snapshotOperationsSupported = snapshotOperationsSupported;
    }

    public boolean isMultipleSnapshotsSupported() {
        return this.multipleSnapshotsSupported;
    }

    public void setMultipleSnapshotsSupported(boolean multipleSnapshotsSupported) {
        this.multipleSnapshotsSupported = multipleSnapshotsSupported;
    }

    public boolean isSnapshotConfigSupported() {
        return this.snapshotConfigSupported;
    }

    public void setSnapshotConfigSupported(boolean snapshotConfigSupported) {
        this.snapshotConfigSupported = snapshotConfigSupported;
    }

    public boolean isPoweredOffSnapshotsSupported() {
        return this.poweredOffSnapshotsSupported;
    }

    public void setPoweredOffSnapshotsSupported(boolean poweredOffSnapshotsSupported) {
        this.poweredOffSnapshotsSupported = poweredOffSnapshotsSupported;
    }

    public boolean isMemorySnapshotsSupported() {
        return this.memorySnapshotsSupported;
    }

    public void setMemorySnapshotsSupported(boolean memorySnapshotsSupported) {
        this.memorySnapshotsSupported = memorySnapshotsSupported;
    }

    public boolean isRevertToSnapshotSupported() {
        return this.revertToSnapshotSupported;
    }

    public void setRevertToSnapshotSupported(boolean revertToSnapshotSupported) {
        this.revertToSnapshotSupported = revertToSnapshotSupported;
    }

    public boolean isQuiescedSnapshotsSupported() {
        return this.quiescedSnapshotsSupported;
    }

    public void setQuiescedSnapshotsSupported(boolean quiescedSnapshotsSupported) {
        this.quiescedSnapshotsSupported = quiescedSnapshotsSupported;
    }

    @Deprecated
    public boolean isDisableSnapshotsSupported() {
        return this.disableSnapshotsSupported;
    }

    @Deprecated
    public void setDisableSnapshotsSupported(boolean disableSnapshotsSupported) {
        this.disableSnapshotsSupported = disableSnapshotsSupported;
    }

    public boolean isLockSnapshotsSupported() {
        return this.lockSnapshotsSupported;
    }

    public void setLockSnapshotsSupported(boolean lockSnapshotsSupported) {
        this.lockSnapshotsSupported = lockSnapshotsSupported;
    }

    public boolean isConsolePreferencesSupported() {
        return this.consolePreferencesSupported;
    }

    public void setConsolePreferencesSupported(boolean consolePreferencesSupported) {
        this.consolePreferencesSupported = consolePreferencesSupported;
    }

    public boolean isCpuFeatureMaskSupported() {
        return this.cpuFeatureMaskSupported;
    }

    public void setCpuFeatureMaskSupported(boolean cpuFeatureMaskSupported) {
        this.cpuFeatureMaskSupported = cpuFeatureMaskSupported;
    }

    public boolean isS1AcpiManagementSupported() {
        return this.s1AcpiManagementSupported;
    }

    public void setS1AcpiManagementSupported(boolean s1AcpiManagementSupported) {
        this.s1AcpiManagementSupported = s1AcpiManagementSupported;
    }

    public boolean isSettingScreenResolutionSupported() {
        return this.settingScreenResolutionSupported;
    }

    public void setSettingScreenResolutionSupported(boolean settingScreenResolutionSupported) {
        this.settingScreenResolutionSupported = settingScreenResolutionSupported;
    }

    public boolean isToolsAutoUpdateSupported() {
        return this.toolsAutoUpdateSupported;
    }

    public void setToolsAutoUpdateSupported(boolean toolsAutoUpdateSupported) {
        this.toolsAutoUpdateSupported = toolsAutoUpdateSupported;
    }

    public boolean isVmNpivWwnSupported() {
        return this.vmNpivWwnSupported;
    }

    public void setVmNpivWwnSupported(boolean vmNpivWwnSupported) {
        this.vmNpivWwnSupported = vmNpivWwnSupported;
    }

    public boolean isNpivWwnOnNonRdmVmSupported() {
        return this.npivWwnOnNonRdmVmSupported;
    }

    public void setNpivWwnOnNonRdmVmSupported(boolean npivWwnOnNonRdmVmSupported) {
        this.npivWwnOnNonRdmVmSupported = npivWwnOnNonRdmVmSupported;
    }

    public boolean isSwapPlacementSupported() {
        return this.swapPlacementSupported;
    }

    public void setSwapPlacementSupported(boolean swapPlacementSupported) {
        this.swapPlacementSupported = swapPlacementSupported;
    }

    public boolean isToolsSyncTimeSupported() {
        return this.toolsSyncTimeSupported;
    }

    public void setToolsSyncTimeSupported(boolean toolsSyncTimeSupported) {
        this.toolsSyncTimeSupported = toolsSyncTimeSupported;
    }

    public boolean isVirtualMmuUsageSupported() {
        return this.virtualMmuUsageSupported;
    }

    public void setVirtualMmuUsageSupported(boolean virtualMmuUsageSupported) {
        this.virtualMmuUsageSupported = virtualMmuUsageSupported;
    }

    public boolean isDiskSharesSupported() {
        return this.diskSharesSupported;
    }

    public void setDiskSharesSupported(boolean diskSharesSupported) {
        this.diskSharesSupported = diskSharesSupported;
    }

    public boolean isBootOptionsSupported() {
        return this.bootOptionsSupported;
    }

    public void setBootOptionsSupported(boolean bootOptionsSupported) {
        this.bootOptionsSupported = bootOptionsSupported;
    }

    public boolean isSettingVideoRamSizeSupported() {
        return this.settingVideoRamSizeSupported;
    }

    public void setSettingVideoRamSizeSupported(boolean settingVideoRamSizeSupported) {
        this.settingVideoRamSizeSupported = settingVideoRamSizeSupported;
    }

    public boolean isBootRetryOptionsSupported() {
        return bootRetryOptionsSupported;
    }

    public void setBootRetryOptionsSupported(boolean bootRetryOptionsSupported) {
        this.bootRetryOptionsSupported = bootRetryOptionsSupported;
    }

    public boolean isChangeTrackingSupported() {
        return changeTrackingSupported;
    }

    public void setChangeTrackingSupported(boolean changeTrackingSupported) {
        this.changeTrackingSupported = changeTrackingSupported;
    }

    public boolean isFeatureRequirementSupported() {
        return featureRequirementSupported;
    }

    public void setFeatureRequirementSupported(boolean featureRequirementSupported) {
        this.featureRequirementSupported = featureRequirementSupported;
    }

    public boolean isGuestAutoLockSupported() {
        return guestAutoLockSupported;
    }

    public void setGuestAutoLockSupported(boolean guestAutoLockSupported) {
        this.guestAutoLockSupported = guestAutoLockSupported;
    }

    public boolean isHostBasedReplicationSupported() {
        return hostBasedReplicationSupported;
    }

    public void setHostBasedReplicationSupported(boolean hostBasedReplicationSupported) {
        this.hostBasedReplicationSupported = hostBasedReplicationSupported;
    }

    public boolean isMemoryReservationLockSupported() {
        return memoryReservationLockSupported;
    }

    public void setMemoryReservationLockSupported(boolean memoryReservationLockSupported) {
        this.memoryReservationLockSupported = memoryReservationLockSupported;
    }

    public boolean isMultipleCoresPerSocketSupported() {
        return multipleCoresPerSocketSupported;
    }

    public void setMultipleCoresPerSocketSupported(boolean multipleCoresPerSocketSupported) {
        this.multipleCoresPerSocketSupported = multipleCoresPerSocketSupported;
    }

    public boolean isNestedHVSupported() {
        return nestedHVSupported;
    }

    public void setNestedHVSupported(boolean nestedHVSupported) {
        this.nestedHVSupported = nestedHVSupported;
    }

    public boolean isPoweredOnMonitorTypeChangeSupported() {
        return poweredOnMonitorTypeChangeSupported;
    }

    public void setPoweredOnMonitorTypeChangeSupported(boolean poweredOnMonitorTypeChangeSupported) {
        this.poweredOnMonitorTypeChangeSupported = poweredOnMonitorTypeChangeSupported;
    }

    @Deprecated
    public boolean isRecordReplaySupported() {
        return recordReplaySupported;
    }

    @Deprecated
    public void setRecordReplaySupported(boolean recordReplaySupported) {
        this.recordReplaySupported = recordReplaySupported;
    }

    public boolean isSecureBootSupported() {
        return secureBootSupported;
    }

    public void setSecureBootSupported(final boolean secureBootSupported) {
        this.secureBootSupported = secureBootSupported;
    }

    public boolean isSeSparseDiskSupported() {
        return seSparseDiskSupported;
    }

    public void setSeSparseDiskSupported(boolean seSparseDiskSupported) {
        this.seSparseDiskSupported = seSparseDiskSupported;
    }

    public boolean isSettingDisplayTopologySupported() {
        return settingDisplayTopologySupported;
    }

    public void setSettingDisplayTopologySupported(boolean settingDisplayTopologySupported) {
        this.settingDisplayTopologySupported = settingDisplayTopologySupported;
    }

    public boolean isvPMCSupported() {
        return vPMCSupported;
    }

    public void setvPMCSupported(final boolean vPMCSupported) {
        this.vPMCSupported = vPMCSupported;
    }

    public boolean isVmNpivWwnDisableSupported() {
        return vmNpivWwnDisableSupported;
    }

    public void setVmNpivWwnDisableSupported(boolean vmNpivWwnDisableSupported) {
        this.vmNpivWwnDisableSupported = vmNpivWwnDisableSupported;
    }

    public boolean isVmNpivWwnUpdateSupported() {
        return vmNpivWwnUpdateSupported;
    }

    public void setVmNpivWwnUpdateSupported(boolean vmNpivWwnUpdateSupported) {
        this.vmNpivWwnUpdateSupported = vmNpivWwnUpdateSupported;
    }
}