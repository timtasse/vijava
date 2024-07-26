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
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.1
 */
@SuppressWarnings("unused")
public class VirtualMachineCapability extends DynamicData {

    private boolean snapshotOperationsSupported;
    private boolean multipleSnapshotsSupported;
    private boolean snapshotConfigSupported;
    private boolean poweredOffSnapshotsSupported;
    private boolean memorySnapshotsSupported;
    private boolean revertToSnapshotSupported;
    private boolean quiescedSnapshotsSupported;
    @Deprecated
    private boolean disableSnapshotsSupported;
    private boolean lockSnapshotsSupported;
    private boolean consolePreferencesSupported;
    private boolean cpuFeatureMaskSupported;
    private boolean s1AcpiManagementSupported;
    private boolean settingScreenResolutionSupported;
    private boolean toolsAutoUpdateSupported;
    private boolean vmNpivWwnSupported;
    private boolean npivWwnOnNonRdmVmSupported;
    private Boolean vmNpivWwnDisableSupported;
    private Boolean vmNpivWwnUpdateSupported;
    private boolean swapPlacementSupported;
    private boolean toolsSyncTimeSupported;
    private boolean virtualMmuUsageSupported;
    private boolean diskSharesSupported;
    private boolean bootOptionsSupported;
    private Boolean bootRetryOptionsSupported;
    private boolean settingVideoRamSizeSupported;
    private Boolean settingDisplayTopologySupported;
    @Deprecated
    private Boolean recordReplaySupported;
    private Boolean changeTrackingSupported;
    private Boolean multipleCoresPerSocketSupported;
    private Boolean hostBasedReplicationSupported;
    private Boolean guestAutoLockSupported;
    private Boolean memoryReservationLockSupported;
    private Boolean featureRequirementSupported;
    private Boolean poweredOnMonitorTypeChangeSupported;
    private Boolean seSparseDiskSupported;
    private Boolean nestedHVSupported;
    private Boolean vPMCSupported;
    private Boolean secureBootSupported;
    private Boolean perVmEvcSupported;
    private Boolean virtualMmuUsageIgnored;
    private Boolean virtualExecUsageIgnored;
    private Boolean diskOnlySnapshotOnSuspendedVMSupported;
    private Boolean suspendToMemorySupported;
    private Boolean toolsSyncTimeAllowSupported;
    private Boolean sevSupported;
    private Boolean pmemFailoverSupported;
    private Boolean requireSgxAttestationSupported;
    private Boolean changeModeDisksSupported;
    private Boolean vendorDeviceGroupSupported;

    @Override
    public String toString() {
        return "VirtualMachineCapability{" +
                "snapshotOperationsSupported=" + snapshotOperationsSupported +
                ", multipleSnapshotsSupported=" + multipleSnapshotsSupported +
                ", snapshotConfigSupported=" + snapshotConfigSupported +
                ", poweredOffSnapshotsSupported=" + poweredOffSnapshotsSupported +
                ", memorySnapshotsSupported=" + memorySnapshotsSupported +
                ", revertToSnapshotSupported=" + revertToSnapshotSupported +
                ", quiescedSnapshotsSupported=" + quiescedSnapshotsSupported +
                ", disableSnapshotsSupported=" + disableSnapshotsSupported +
                ", lockSnapshotsSupported=" + lockSnapshotsSupported +
                ", consolePreferencesSupported=" + consolePreferencesSupported +
                ", cpuFeatureMaskSupported=" + cpuFeatureMaskSupported +
                ", s1AcpiManagementSupported=" + s1AcpiManagementSupported +
                ", settingScreenResolutionSupported=" + settingScreenResolutionSupported +
                ", toolsAutoUpdateSupported=" + toolsAutoUpdateSupported +
                ", vmNpivWwnSupported=" + vmNpivWwnSupported +
                ", npivWwnOnNonRdmVmSupported=" + npivWwnOnNonRdmVmSupported +
                ", vmNpivWwnDisableSupported=" + vmNpivWwnDisableSupported +
                ", vmNpivWwnUpdateSupported=" + vmNpivWwnUpdateSupported +
                ", swapPlacementSupported=" + swapPlacementSupported +
                ", toolsSyncTimeSupported=" + toolsSyncTimeSupported +
                ", virtualMmuUsageSupported=" + virtualMmuUsageSupported +
                ", diskSharesSupported=" + diskSharesSupported +
                ", bootOptionsSupported=" + bootOptionsSupported +
                ", bootRetryOptionsSupported=" + bootRetryOptionsSupported +
                ", settingVideoRamSizeSupported=" + settingVideoRamSizeSupported +
                ", settingDisplayTopologySupported=" + settingDisplayTopologySupported +
                ", recordReplaySupported=" + recordReplaySupported +
                ", changeTrackingSupported=" + changeTrackingSupported +
                ", multipleCoresPerSocketSupported=" + multipleCoresPerSocketSupported +
                ", hostBasedReplicationSupported=" + hostBasedReplicationSupported +
                ", guestAutoLockSupported=" + guestAutoLockSupported +
                ", memoryReservationLockSupported=" + memoryReservationLockSupported +
                ", featureRequirementSupported=" + featureRequirementSupported +
                ", poweredOnMonitorTypeChangeSupported=" + poweredOnMonitorTypeChangeSupported +
                ", seSparseDiskSupported=" + seSparseDiskSupported +
                ", nestedHVSupported=" + nestedHVSupported +
                ", vPMCSupported=" + vPMCSupported +
                ", secureBootSupported=" + secureBootSupported +
                ", perVmEvcSupported=" + perVmEvcSupported +
                ", virtualMmuUsageIgnored=" + virtualMmuUsageIgnored +
                ", virtualExecUsageIgnored=" + virtualExecUsageIgnored +
                ", diskOnlySnapshotOnSuspendedVMSupported=" + diskOnlySnapshotOnSuspendedVMSupported +
                ", suspendToMemorySupported=" + suspendToMemorySupported +
                ", toolsSyncTimeAllowSupported=" + toolsSyncTimeAllowSupported +
                ", sevSupported=" + sevSupported +
                ", pmemFailoverSupported=" + pmemFailoverSupported +
                ", requireSgxAttestationSupported=" + requireSgxAttestationSupported +
                ", changeModeDisksSupported=" + changeModeDisksSupported +
                ", vendorDeviceGroupSupported=" + vendorDeviceGroupSupported +
                "} " + super.toString();
    }

    public boolean isSnapshotOperationsSupported() {
        return snapshotOperationsSupported;
    }

    public void setSnapshotOperationsSupported(final boolean snapshotOperationsSupported) {
        this.snapshotOperationsSupported = snapshotOperationsSupported;
    }

    public boolean isMultipleSnapshotsSupported() {
        return multipleSnapshotsSupported;
    }

    public void setMultipleSnapshotsSupported(final boolean multipleSnapshotsSupported) {
        this.multipleSnapshotsSupported = multipleSnapshotsSupported;
    }

    public boolean isSnapshotConfigSupported() {
        return snapshotConfigSupported;
    }

    public void setSnapshotConfigSupported(final boolean snapshotConfigSupported) {
        this.snapshotConfigSupported = snapshotConfigSupported;
    }

    public boolean isPoweredOffSnapshotsSupported() {
        return poweredOffSnapshotsSupported;
    }

    public void setPoweredOffSnapshotsSupported(final boolean poweredOffSnapshotsSupported) {
        this.poweredOffSnapshotsSupported = poweredOffSnapshotsSupported;
    }

    public boolean isMemorySnapshotsSupported() {
        return memorySnapshotsSupported;
    }

    public void setMemorySnapshotsSupported(final boolean memorySnapshotsSupported) {
        this.memorySnapshotsSupported = memorySnapshotsSupported;
    }

    public boolean isRevertToSnapshotSupported() {
        return revertToSnapshotSupported;
    }

    public void setRevertToSnapshotSupported(final boolean revertToSnapshotSupported) {
        this.revertToSnapshotSupported = revertToSnapshotSupported;
    }

    public boolean isQuiescedSnapshotsSupported() {
        return quiescedSnapshotsSupported;
    }

    public void setQuiescedSnapshotsSupported(final boolean quiescedSnapshotsSupported) {
        this.quiescedSnapshotsSupported = quiescedSnapshotsSupported;
    }

    public boolean isDisableSnapshotsSupported() {
        return disableSnapshotsSupported;
    }

    public void setDisableSnapshotsSupported(final boolean disableSnapshotsSupported) {
        this.disableSnapshotsSupported = disableSnapshotsSupported;
    }

    public boolean isLockSnapshotsSupported() {
        return lockSnapshotsSupported;
    }

    public void setLockSnapshotsSupported(final boolean lockSnapshotsSupported) {
        this.lockSnapshotsSupported = lockSnapshotsSupported;
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

    public boolean isS1AcpiManagementSupported() {
        return s1AcpiManagementSupported;
    }

    public void setS1AcpiManagementSupported(final boolean s1AcpiManagementSupported) {
        this.s1AcpiManagementSupported = s1AcpiManagementSupported;
    }

    public boolean isSettingScreenResolutionSupported() {
        return settingScreenResolutionSupported;
    }

    public void setSettingScreenResolutionSupported(final boolean settingScreenResolutionSupported) {
        this.settingScreenResolutionSupported = settingScreenResolutionSupported;
    }

    public boolean isToolsAutoUpdateSupported() {
        return toolsAutoUpdateSupported;
    }

    public void setToolsAutoUpdateSupported(final boolean toolsAutoUpdateSupported) {
        this.toolsAutoUpdateSupported = toolsAutoUpdateSupported;
    }

    public boolean isVmNpivWwnSupported() {
        return vmNpivWwnSupported;
    }

    public void setVmNpivWwnSupported(final boolean vmNpivWwnSupported) {
        this.vmNpivWwnSupported = vmNpivWwnSupported;
    }

    public boolean isNpivWwnOnNonRdmVmSupported() {
        return npivWwnOnNonRdmVmSupported;
    }

    public void setNpivWwnOnNonRdmVmSupported(final boolean npivWwnOnNonRdmVmSupported) {
        this.npivWwnOnNonRdmVmSupported = npivWwnOnNonRdmVmSupported;
    }

    public Boolean getVmNpivWwnDisableSupported() {
        return vmNpivWwnDisableSupported;
    }

    public void setVmNpivWwnDisableSupported(final Boolean vmNpivWwnDisableSupported) {
        this.vmNpivWwnDisableSupported = vmNpivWwnDisableSupported;
    }

    public Boolean getVmNpivWwnUpdateSupported() {
        return vmNpivWwnUpdateSupported;
    }

    public void setVmNpivWwnUpdateSupported(final Boolean vmNpivWwnUpdateSupported) {
        this.vmNpivWwnUpdateSupported = vmNpivWwnUpdateSupported;
    }

    public boolean isSwapPlacementSupported() {
        return swapPlacementSupported;
    }

    public void setSwapPlacementSupported(final boolean swapPlacementSupported) {
        this.swapPlacementSupported = swapPlacementSupported;
    }

    public boolean isToolsSyncTimeSupported() {
        return toolsSyncTimeSupported;
    }

    public void setToolsSyncTimeSupported(final boolean toolsSyncTimeSupported) {
        this.toolsSyncTimeSupported = toolsSyncTimeSupported;
    }

    public boolean isVirtualMmuUsageSupported() {
        return virtualMmuUsageSupported;
    }

    public void setVirtualMmuUsageSupported(final boolean virtualMmuUsageSupported) {
        this.virtualMmuUsageSupported = virtualMmuUsageSupported;
    }

    public boolean isDiskSharesSupported() {
        return diskSharesSupported;
    }

    public void setDiskSharesSupported(final boolean diskSharesSupported) {
        this.diskSharesSupported = diskSharesSupported;
    }

    public boolean isBootOptionsSupported() {
        return bootOptionsSupported;
    }

    public void setBootOptionsSupported(final boolean bootOptionsSupported) {
        this.bootOptionsSupported = bootOptionsSupported;
    }

    public Boolean getBootRetryOptionsSupported() {
        return bootRetryOptionsSupported;
    }

    public void setBootRetryOptionsSupported(final Boolean bootRetryOptionsSupported) {
        this.bootRetryOptionsSupported = bootRetryOptionsSupported;
    }

    public boolean isSettingVideoRamSizeSupported() {
        return settingVideoRamSizeSupported;
    }

    public void setSettingVideoRamSizeSupported(final boolean settingVideoRamSizeSupported) {
        this.settingVideoRamSizeSupported = settingVideoRamSizeSupported;
    }

    public Boolean getSettingDisplayTopologySupported() {
        return settingDisplayTopologySupported;
    }

    public void setSettingDisplayTopologySupported(final Boolean settingDisplayTopologySupported) {
        this.settingDisplayTopologySupported = settingDisplayTopologySupported;
    }

    public Boolean getRecordReplaySupported() {
        return recordReplaySupported;
    }

    public void setRecordReplaySupported(final Boolean recordReplaySupported) {
        this.recordReplaySupported = recordReplaySupported;
    }

    public Boolean getChangeTrackingSupported() {
        return changeTrackingSupported;
    }

    public void setChangeTrackingSupported(final Boolean changeTrackingSupported) {
        this.changeTrackingSupported = changeTrackingSupported;
    }

    public Boolean getMultipleCoresPerSocketSupported() {
        return multipleCoresPerSocketSupported;
    }

    public void setMultipleCoresPerSocketSupported(final Boolean multipleCoresPerSocketSupported) {
        this.multipleCoresPerSocketSupported = multipleCoresPerSocketSupported;
    }

    public Boolean getHostBasedReplicationSupported() {
        return hostBasedReplicationSupported;
    }

    public void setHostBasedReplicationSupported(final Boolean hostBasedReplicationSupported) {
        this.hostBasedReplicationSupported = hostBasedReplicationSupported;
    }

    public Boolean getGuestAutoLockSupported() {
        return guestAutoLockSupported;
    }

    public void setGuestAutoLockSupported(final Boolean guestAutoLockSupported) {
        this.guestAutoLockSupported = guestAutoLockSupported;
    }

    public Boolean getMemoryReservationLockSupported() {
        return memoryReservationLockSupported;
    }

    public void setMemoryReservationLockSupported(final Boolean memoryReservationLockSupported) {
        this.memoryReservationLockSupported = memoryReservationLockSupported;
    }

    public Boolean getFeatureRequirementSupported() {
        return featureRequirementSupported;
    }

    public void setFeatureRequirementSupported(final Boolean featureRequirementSupported) {
        this.featureRequirementSupported = featureRequirementSupported;
    }

    public Boolean getPoweredOnMonitorTypeChangeSupported() {
        return poweredOnMonitorTypeChangeSupported;
    }

    public void setPoweredOnMonitorTypeChangeSupported(final Boolean poweredOnMonitorTypeChangeSupported) {
        this.poweredOnMonitorTypeChangeSupported = poweredOnMonitorTypeChangeSupported;
    }

    public Boolean getSeSparseDiskSupported() {
        return seSparseDiskSupported;
    }

    public void setSeSparseDiskSupported(final Boolean seSparseDiskSupported) {
        this.seSparseDiskSupported = seSparseDiskSupported;
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

    public Boolean getSecureBootSupported() {
        return secureBootSupported;
    }

    public void setSecureBootSupported(final Boolean secureBootSupported) {
        this.secureBootSupported = secureBootSupported;
    }

    public Boolean getPerVmEvcSupported() {
        return perVmEvcSupported;
    }

    public void setPerVmEvcSupported(final Boolean perVmEvcSupported) {
        this.perVmEvcSupported = perVmEvcSupported;
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

    public Boolean getDiskOnlySnapshotOnSuspendedVMSupported() {
        return diskOnlySnapshotOnSuspendedVMSupported;
    }

    public void setDiskOnlySnapshotOnSuspendedVMSupported(final Boolean diskOnlySnapshotOnSuspendedVMSupported) {
        this.diskOnlySnapshotOnSuspendedVMSupported = diskOnlySnapshotOnSuspendedVMSupported;
    }

    public Boolean getSuspendToMemorySupported() {
        return suspendToMemorySupported;
    }

    public void setSuspendToMemorySupported(final Boolean suspendToMemorySupported) {
        this.suspendToMemorySupported = suspendToMemorySupported;
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

    public Boolean getRequireSgxAttestationSupported() {
        return requireSgxAttestationSupported;
    }

    public void setRequireSgxAttestationSupported(final Boolean requireSgxAttestationSupported) {
        this.requireSgxAttestationSupported = requireSgxAttestationSupported;
    }

    public Boolean getChangeModeDisksSupported() {
        return changeModeDisksSupported;
    }

    public void setChangeModeDisksSupported(final Boolean changeModeDisksSupported) {
        this.changeModeDisksSupported = changeModeDisksSupported;
    }

    public Boolean getVendorDeviceGroupSupported() {
        return vendorDeviceGroupSupported;
    }

    public void setVendorDeviceGroupSupported(final Boolean vendorDeviceGroupSupported) {
        this.vendorDeviceGroupSupported = vendorDeviceGroupSupported;
    }

}
