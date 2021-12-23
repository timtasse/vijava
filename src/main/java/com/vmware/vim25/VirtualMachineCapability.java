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
 * This data object type contains information about the operation/capabilities of a virtual machine
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 7.0.2
 */
@SuppressWarnings("unused")
public class VirtualMachineCapability extends DynamicData {

    private boolean bootOptionsSupported;
    private boolean bootRetryOptionsSupported;
    private boolean changeTrackingSupported;
    private boolean consolePreferencesSupported;
    private boolean cpuFeatureMaskSupported;
    @Deprecated
    private boolean disableSnapshotsSupported;
    private Boolean diskOnlySnapshotOnSuspendedVMSupported;
    private boolean diskSharesSupported;
    private boolean featureRequirementSupported;
    private boolean guestAutoLockSupported;
    private boolean hostBasedReplicationSupported;
    private boolean lockSnapshotsSupported;
    private boolean memoryReservationLockSupported;
    private boolean memorySnapshotsSupported;
    private boolean multipleCoresPerSocketSupported;
    private boolean multipleSnapshotsSupported;
    private boolean nestedHVSupported;
    private boolean npivWwnOnNonRdmVmSupported;
    private Boolean perVmEvcSupported;
    private boolean poweredOffSnapshotsSupported;
    private boolean poweredOnMonitorTypeChangeSupported;
    private boolean quiescedSnapshotsSupported;
    @Deprecated
    private boolean recordReplaySupported;
    private boolean revertToSnapshotSupported;
    private boolean s1AcpiManagementSupported;
    private Boolean secureBootSupported;
    private boolean seSparseDiskSupported;
    private boolean settingDisplayTopologySupported;
    private boolean settingScreenResolutionSupported;
    private boolean settingVideoRamSizeSupported;
    private boolean snapshotConfigSupported;
    private boolean snapshotOperationsSupported;
    private boolean swapPlacementSupported;
    private boolean toolsAutoUpdateSupported;
    private boolean toolsSyncTimeSupported;
    private Boolean virtualExecUsageIgnored;
    private Boolean virtualMmuUsageIgnored;
    private boolean virtualMmuUsageSupported;
    private boolean vmNpivWwnDisableSupported;
    private boolean vmNpivWwnSupported;
    private boolean vmNpivWwnUpdateSupported;
    private boolean vPMCSupported;
    private Boolean toolsSyncTimeAllowSupported;
    private Boolean sevSupported;
    private Boolean pmemFailoverSupported;
    private Boolean suspendToMemorySupported;

    @Override
    public String toString() {
        return "VirtualMachineCapability{" +
                "bootOptionsSupported=" + bootOptionsSupported +
                ", bootRetryOptionsSupported=" + bootRetryOptionsSupported +
                ", changeTrackingSupported=" + changeTrackingSupported +
                ", consolePreferencesSupported=" + consolePreferencesSupported +
                ", cpuFeatureMaskSupported=" + cpuFeatureMaskSupported +
                ", disableSnapshotsSupported=" + disableSnapshotsSupported +
                ", diskOnlySnapshotOnSuspendedVMSupported=" + diskOnlySnapshotOnSuspendedVMSupported +
                ", diskSharesSupported=" + diskSharesSupported +
                ", featureRequirementSupported=" + featureRequirementSupported +
                ", guestAutoLockSupported=" + guestAutoLockSupported +
                ", hostBasedReplicationSupported=" + hostBasedReplicationSupported +
                ", lockSnapshotsSupported=" + lockSnapshotsSupported +
                ", memoryReservationLockSupported=" + memoryReservationLockSupported +
                ", memorySnapshotsSupported=" + memorySnapshotsSupported +
                ", multipleCoresPerSocketSupported=" + multipleCoresPerSocketSupported +
                ", multipleSnapshotsSupported=" + multipleSnapshotsSupported +
                ", nestedHVSupported=" + nestedHVSupported +
                ", npivWwnOnNonRdmVmSupported=" + npivWwnOnNonRdmVmSupported +
                ", perVmEvcSupported=" + perVmEvcSupported +
                ", poweredOffSnapshotsSupported=" + poweredOffSnapshotsSupported +
                ", poweredOnMonitorTypeChangeSupported=" + poweredOnMonitorTypeChangeSupported +
                ", quiescedSnapshotsSupported=" + quiescedSnapshotsSupported +
                ", recordReplaySupported=" + recordReplaySupported +
                ", revertToSnapshotSupported=" + revertToSnapshotSupported +
                ", s1AcpiManagementSupported=" + s1AcpiManagementSupported +
                ", secureBootSupported=" + secureBootSupported +
                ", seSparseDiskSupported=" + seSparseDiskSupported +
                ", settingDisplayTopologySupported=" + settingDisplayTopologySupported +
                ", settingScreenResolutionSupported=" + settingScreenResolutionSupported +
                ", settingVideoRamSizeSupported=" + settingVideoRamSizeSupported +
                ", snapshotConfigSupported=" + snapshotConfigSupported +
                ", snapshotOperationsSupported=" + snapshotOperationsSupported +
                ", swapPlacementSupported=" + swapPlacementSupported +
                ", toolsAutoUpdateSupported=" + toolsAutoUpdateSupported +
                ", toolsSyncTimeSupported=" + toolsSyncTimeSupported +
                ", virtualExecUsageIgnored=" + virtualExecUsageIgnored +
                ", virtualMmuUsageIgnored=" + virtualMmuUsageIgnored +
                ", virtualMmuUsageSupported=" + virtualMmuUsageSupported +
                ", vmNpivWwnDisableSupported=" + vmNpivWwnDisableSupported +
                ", vmNpivWwnSupported=" + vmNpivWwnSupported +
                ", vmNpivWwnUpdateSupported=" + vmNpivWwnUpdateSupported +
                ", vPMCSupported=" + vPMCSupported +
                ", toolsSyncTimeAllowSupported=" + toolsSyncTimeAllowSupported +
                ", sevSupported=" + sevSupported +
                ", pmemFailoverSupported=" + pmemFailoverSupported +
                ", suspendToMemorySupported=" + suspendToMemorySupported +
                '}';
    }

    public boolean isBootOptionsSupported() {
        return bootOptionsSupported;
    }

    public void setBootOptionsSupported(final boolean bootOptionsSupported) {
        this.bootOptionsSupported = bootOptionsSupported;
    }

    public boolean isBootRetryOptionsSupported() {
        return bootRetryOptionsSupported;
    }

    public void setBootRetryOptionsSupported(final boolean bootRetryOptionsSupported) {
        this.bootRetryOptionsSupported = bootRetryOptionsSupported;
    }

    public boolean isChangeTrackingSupported() {
        return changeTrackingSupported;
    }

    public void setChangeTrackingSupported(final boolean changeTrackingSupported) {
        this.changeTrackingSupported = changeTrackingSupported;
    }

    public boolean isConsolePreferencesSupported() {
        return consolePreferencesSupported;
    }

    public void setConsolePreferencesSupported(final boolean consolePreferencesSupported) {
        this.consolePreferencesSupported = consolePreferencesSupported;
    }

    public boolean isCpuFeatureMaskSupported() {
        return cpuFeatureMaskSupported;
    }

    public void setCpuFeatureMaskSupported(final boolean cpuFeatureMaskSupported) {
        this.cpuFeatureMaskSupported = cpuFeatureMaskSupported;
    }

    public boolean isDisableSnapshotsSupported() {
        return disableSnapshotsSupported;
    }

    public void setDisableSnapshotsSupported(final boolean disableSnapshotsSupported) {
        this.disableSnapshotsSupported = disableSnapshotsSupported;
    }

    public Boolean getDiskOnlySnapshotOnSuspendedVMSupported() {
        return diskOnlySnapshotOnSuspendedVMSupported;
    }

    public void setDiskOnlySnapshotOnSuspendedVMSupported(final Boolean diskOnlySnapshotOnSuspendedVMSupported) {
        this.diskOnlySnapshotOnSuspendedVMSupported = diskOnlySnapshotOnSuspendedVMSupported;
    }

    public boolean isDiskSharesSupported() {
        return diskSharesSupported;
    }

    public void setDiskSharesSupported(final boolean diskSharesSupported) {
        this.diskSharesSupported = diskSharesSupported;
    }

    public boolean isFeatureRequirementSupported() {
        return featureRequirementSupported;
    }

    public void setFeatureRequirementSupported(final boolean featureRequirementSupported) {
        this.featureRequirementSupported = featureRequirementSupported;
    }

    public boolean isGuestAutoLockSupported() {
        return guestAutoLockSupported;
    }

    public void setGuestAutoLockSupported(final boolean guestAutoLockSupported) {
        this.guestAutoLockSupported = guestAutoLockSupported;
    }

    public boolean isHostBasedReplicationSupported() {
        return hostBasedReplicationSupported;
    }

    public void setHostBasedReplicationSupported(final boolean hostBasedReplicationSupported) {
        this.hostBasedReplicationSupported = hostBasedReplicationSupported;
    }

    public boolean isLockSnapshotsSupported() {
        return lockSnapshotsSupported;
    }

    public void setLockSnapshotsSupported(final boolean lockSnapshotsSupported) {
        this.lockSnapshotsSupported = lockSnapshotsSupported;
    }

    public boolean isMemoryReservationLockSupported() {
        return memoryReservationLockSupported;
    }

    public void setMemoryReservationLockSupported(final boolean memoryReservationLockSupported) {
        this.memoryReservationLockSupported = memoryReservationLockSupported;
    }

    public boolean isMemorySnapshotsSupported() {
        return memorySnapshotsSupported;
    }

    public void setMemorySnapshotsSupported(final boolean memorySnapshotsSupported) {
        this.memorySnapshotsSupported = memorySnapshotsSupported;
    }

    public boolean isMultipleCoresPerSocketSupported() {
        return multipleCoresPerSocketSupported;
    }

    public void setMultipleCoresPerSocketSupported(final boolean multipleCoresPerSocketSupported) {
        this.multipleCoresPerSocketSupported = multipleCoresPerSocketSupported;
    }

    public boolean isMultipleSnapshotsSupported() {
        return multipleSnapshotsSupported;
    }

    public void setMultipleSnapshotsSupported(final boolean multipleSnapshotsSupported) {
        this.multipleSnapshotsSupported = multipleSnapshotsSupported;
    }

    public boolean isNestedHVSupported() {
        return nestedHVSupported;
    }

    public void setNestedHVSupported(final boolean nestedHVSupported) {
        this.nestedHVSupported = nestedHVSupported;
    }

    public boolean isNpivWwnOnNonRdmVmSupported() {
        return npivWwnOnNonRdmVmSupported;
    }

    public void setNpivWwnOnNonRdmVmSupported(final boolean npivWwnOnNonRdmVmSupported) {
        this.npivWwnOnNonRdmVmSupported = npivWwnOnNonRdmVmSupported;
    }

    public Boolean getPerVmEvcSupported() {
        return perVmEvcSupported;
    }

    public void setPerVmEvcSupported(final Boolean perVmEvcSupported) {
        this.perVmEvcSupported = perVmEvcSupported;
    }

    public boolean isPoweredOffSnapshotsSupported() {
        return poweredOffSnapshotsSupported;
    }

    public void setPoweredOffSnapshotsSupported(final boolean poweredOffSnapshotsSupported) {
        this.poweredOffSnapshotsSupported = poweredOffSnapshotsSupported;
    }

    public boolean isPoweredOnMonitorTypeChangeSupported() {
        return poweredOnMonitorTypeChangeSupported;
    }

    public void setPoweredOnMonitorTypeChangeSupported(final boolean poweredOnMonitorTypeChangeSupported) {
        this.poweredOnMonitorTypeChangeSupported = poweredOnMonitorTypeChangeSupported;
    }

    public boolean isQuiescedSnapshotsSupported() {
        return quiescedSnapshotsSupported;
    }

    public void setQuiescedSnapshotsSupported(final boolean quiescedSnapshotsSupported) {
        this.quiescedSnapshotsSupported = quiescedSnapshotsSupported;
    }

    public boolean isRecordReplaySupported() {
        return recordReplaySupported;
    }

    public void setRecordReplaySupported(final boolean recordReplaySupported) {
        this.recordReplaySupported = recordReplaySupported;
    }

    public boolean isRevertToSnapshotSupported() {
        return revertToSnapshotSupported;
    }

    public void setRevertToSnapshotSupported(final boolean revertToSnapshotSupported) {
        this.revertToSnapshotSupported = revertToSnapshotSupported;
    }

    public boolean isS1AcpiManagementSupported() {
        return s1AcpiManagementSupported;
    }

    public void setS1AcpiManagementSupported(final boolean s1AcpiManagementSupported) {
        this.s1AcpiManagementSupported = s1AcpiManagementSupported;
    }

    public Boolean getSecureBootSupported() {
        return secureBootSupported;
    }

    public void setSecureBootSupported(final Boolean secureBootSupported) {
        this.secureBootSupported = secureBootSupported;
    }

    public boolean isSeSparseDiskSupported() {
        return seSparseDiskSupported;
    }

    public void setSeSparseDiskSupported(final boolean seSparseDiskSupported) {
        this.seSparseDiskSupported = seSparseDiskSupported;
    }

    public boolean isSettingDisplayTopologySupported() {
        return settingDisplayTopologySupported;
    }

    public void setSettingDisplayTopologySupported(final boolean settingDisplayTopologySupported) {
        this.settingDisplayTopologySupported = settingDisplayTopologySupported;
    }

    public boolean isSettingScreenResolutionSupported() {
        return settingScreenResolutionSupported;
    }

    public void setSettingScreenResolutionSupported(final boolean settingScreenResolutionSupported) {
        this.settingScreenResolutionSupported = settingScreenResolutionSupported;
    }

    public boolean isSettingVideoRamSizeSupported() {
        return settingVideoRamSizeSupported;
    }

    public void setSettingVideoRamSizeSupported(final boolean settingVideoRamSizeSupported) {
        this.settingVideoRamSizeSupported = settingVideoRamSizeSupported;
    }

    public boolean isSnapshotConfigSupported() {
        return snapshotConfigSupported;
    }

    public void setSnapshotConfigSupported(final boolean snapshotConfigSupported) {
        this.snapshotConfigSupported = snapshotConfigSupported;
    }

    public boolean isSnapshotOperationsSupported() {
        return snapshotOperationsSupported;
    }

    public void setSnapshotOperationsSupported(final boolean snapshotOperationsSupported) {
        this.snapshotOperationsSupported = snapshotOperationsSupported;
    }

    public boolean isSwapPlacementSupported() {
        return swapPlacementSupported;
    }

    public void setSwapPlacementSupported(final boolean swapPlacementSupported) {
        this.swapPlacementSupported = swapPlacementSupported;
    }

    public boolean isToolsAutoUpdateSupported() {
        return toolsAutoUpdateSupported;
    }

    public void setToolsAutoUpdateSupported(final boolean toolsAutoUpdateSupported) {
        this.toolsAutoUpdateSupported = toolsAutoUpdateSupported;
    }

    public boolean isToolsSyncTimeSupported() {
        return toolsSyncTimeSupported;
    }

    public void setToolsSyncTimeSupported(final boolean toolsSyncTimeSupported) {
        this.toolsSyncTimeSupported = toolsSyncTimeSupported;
    }

    public Boolean getVirtualExecUsageIgnored() {
        return virtualExecUsageIgnored;
    }

    public void setVirtualExecUsageIgnored(final Boolean virtualExecUsageIgnored) {
        this.virtualExecUsageIgnored = virtualExecUsageIgnored;
    }

    public Boolean getVirtualMmuUsageIgnored() {
        return virtualMmuUsageIgnored;
    }

    public void setVirtualMmuUsageIgnored(final Boolean virtualMmuUsageIgnored) {
        this.virtualMmuUsageIgnored = virtualMmuUsageIgnored;
    }

    public boolean isVirtualMmuUsageSupported() {
        return virtualMmuUsageSupported;
    }

    public void setVirtualMmuUsageSupported(final boolean virtualMmuUsageSupported) {
        this.virtualMmuUsageSupported = virtualMmuUsageSupported;
    }

    public boolean isVmNpivWwnDisableSupported() {
        return vmNpivWwnDisableSupported;
    }

    public void setVmNpivWwnDisableSupported(final boolean vmNpivWwnDisableSupported) {
        this.vmNpivWwnDisableSupported = vmNpivWwnDisableSupported;
    }

    public boolean isVmNpivWwnSupported() {
        return vmNpivWwnSupported;
    }

    public void setVmNpivWwnSupported(final boolean vmNpivWwnSupported) {
        this.vmNpivWwnSupported = vmNpivWwnSupported;
    }

    public boolean isVmNpivWwnUpdateSupported() {
        return vmNpivWwnUpdateSupported;
    }

    public void setVmNpivWwnUpdateSupported(final boolean vmNpivWwnUpdateSupported) {
        this.vmNpivWwnUpdateSupported = vmNpivWwnUpdateSupported;
    }

    public boolean isvPMCSupported() {
        return vPMCSupported;
    }

    public void setvPMCSupported(final boolean vPMCSupported) {
        this.vPMCSupported = vPMCSupported;
    }

    public Boolean getToolsSyncTimeAllowSupported() {
        return toolsSyncTimeAllowSupported;
    }

    public void setToolsSyncTimeAllowSupported(final Boolean toolsSyncTimeAllowSupported) {
        this.toolsSyncTimeAllowSupported = toolsSyncTimeAllowSupported;
    }

    public Boolean getSevSupported() {
        return sevSupported;
    }

    public void setSevSupported(final Boolean sevSupported) {
        this.sevSupported = sevSupported;
    }

    public Boolean getPmemFailoverSupported() {
        return pmemFailoverSupported;
    }

    public void setPmemFailoverSupported(final Boolean pmemFailoverSupported) {
        this.pmemFailoverSupported = pmemFailoverSupported;
    }

    public Boolean getSuspendToMemorySupported() {
        return suspendToMemorySupported;
    }

    public void setSuspendToMemorySupported(final Boolean suspendToMemorySupported) {
        this.suspendToMemorySupported = suspendToMemorySupported;
    }

}
