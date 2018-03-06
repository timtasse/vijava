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
public class VirtualMachineConfigSpec extends DynamicData {

    public String changeVersion;
    public String name;
    public String version;
    public String uuid;
    public String instanceUuid;
    public Long[] npivNodeWorldWideName;
    public Long[] npivPortWorldWideName;
    public String npivWorldWideNameType;
    public Short npivDesiredNodeWwns;
    public Short npivDesiredPortWwns;
    public Boolean npivTemporaryDisabled;
    public Boolean npivOnNonRdmDisks;
    public String npivWorldWideNameOp;
    public String locationId;
    public String guestId;
    public String alternateGuestName;
    public String annotation;
    public VirtualMachineFileInfo files;
    public ToolsConfigInfo tools;
    public VirtualMachineFlagInfo flags;
    public VirtualMachineConsolePreferences consolePreferences;
    public VirtualMachineDefaultPowerOpInfo powerOpInfo;
    public Integer numCPUs;
    public Integer numCoresPerSocket;
    public Long memoryMB;
    public Boolean memoryHotAddEnabled;
    public Boolean cpuHotAddEnabled;
    public Boolean cpuHotRemoveEnabled;
    public Boolean virtualICH7MPresent;
    public Boolean virtualSMCPresent;
    public VirtualDeviceConfigSpec[] deviceChange;
    public ResourceAllocationInfo cpuAllocation;
    public ResourceAllocationInfo memoryAllocation;
    public LatencySensitivity latencySensitivity;
    public VirtualMachineAffinityInfo cpuAffinity;
    @Deprecated
    public VirtualMachineAffinityInfo memoryAffinity;
    @Deprecated
    public VirtualMachineNetworkShaperInfo networkShaper;
    public VirtualMachineCpuIdInfoSpec[] cpuFeatureMask;
    public OptionValue[] extraConfig;
    public String swapPlacement;
    public VirtualMachineBootOptions bootOptions;
    public VmConfigSpec vAppConfig;
    public FaultToleranceConfigInfo ftInfo;
    public ReplicationConfigSpec repConfig;
    public Boolean vAppConfigRemoved;
    public Boolean vAssertsEnabled;
    public Boolean changeTrackingEnabled;
    public String firmware;
    public Integer maxMksConnections;
    public Boolean guestAutoLockEnabled;
    public ManagedByInfo managedBy;
    public Boolean memoryReservationLockedToMax;
    public Boolean nestedHVEnabled;
    public Boolean vPMCEnabled;
    public ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo;
    public VirtualMachineProfileSpec[] vmProfile;
    public Boolean messageBusTunnelEnabled;
    public CryptoSpec crypto;
    public String migrateEncryption;

    public String getChangeVersion() {
        return this.changeVersion;
    }

    public void setChangeVersion(String changeVersion) {
        this.changeVersion = changeVersion;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    public void setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    public Long[] getNpivNodeWorldWideName() {
        return this.npivNodeWorldWideName;
    }

    public void setNpivNodeWorldWideName(Long[] npivNodeWorldWideName) {
        this.npivNodeWorldWideName = npivNodeWorldWideName;
    }

    public Long[] getNpivPortWorldWideName() {
        return this.npivPortWorldWideName;
    }

    public void setNpivPortWorldWideName(Long[] npivPortWorldWideName) {
        this.npivPortWorldWideName = npivPortWorldWideName;
    }

    public String getNpivWorldWideNameType() {
        return this.npivWorldWideNameType;
    }

    public void setNpivWorldWideNameType(String npivWorldWideNameType) {
        this.npivWorldWideNameType = npivWorldWideNameType;
    }

    public Short getNpivDesiredNodeWwns() {
        return this.npivDesiredNodeWwns;
    }

    public void setNpivDesiredNodeWwns(Short npivDesiredNodeWwns) {
        this.npivDesiredNodeWwns = npivDesiredNodeWwns;
    }

    public Short getNpivDesiredPortWwns() {
        return this.npivDesiredPortWwns;
    }

    public void setNpivDesiredPortWwns(Short npivDesiredPortWwns) {
        this.npivDesiredPortWwns = npivDesiredPortWwns;
    }

    public String getNpivWorldWideNameOp() {
        return this.npivWorldWideNameOp;
    }

    public void setNpivWorldWideNameOp(String npivWorldWideNameOp) {
        this.npivWorldWideNameOp = npivWorldWideNameOp;
    }

    public String getLocationId() {
        return this.locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getGuestId() {
        return this.guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getAlternateGuestName() {
        return this.alternateGuestName;
    }

    public void setAlternateGuestName(String alternateGuestName) {
        this.alternateGuestName = alternateGuestName;
    }

    public String getAnnotation() {
        return this.annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public VirtualMachineFileInfo getFiles() {
        return this.files;
    }

    public void setFiles(VirtualMachineFileInfo files) {
        this.files = files;
    }

    public ToolsConfigInfo getTools() {
        return this.tools;
    }

    public void setTools(ToolsConfigInfo tools) {
        this.tools = tools;
    }

    public VirtualMachineFlagInfo getFlags() {
        return this.flags;
    }

    public void setFlags(VirtualMachineFlagInfo flags) {
        this.flags = flags;
    }

    public VirtualMachineConsolePreferences getConsolePreferences() {
        return this.consolePreferences;
    }

    public void setConsolePreferences(VirtualMachineConsolePreferences consolePreferences) {
        this.consolePreferences = consolePreferences;
    }

    public VirtualMachineDefaultPowerOpInfo getPowerOpInfo() {
        return this.powerOpInfo;
    }

    public void setPowerOpInfo(VirtualMachineDefaultPowerOpInfo powerOpInfo) {
        this.powerOpInfo = powerOpInfo;
    }

    public Integer getNumCPUs() {
        return this.numCPUs;
    }

    public void setNumCPUs(Integer numCPUs) {
        this.numCPUs = numCPUs;
    }

    public Integer getNumCoresPerSocket() {
        return this.numCoresPerSocket;
    }

    public void setNumCoresPerSocket(Integer numCoresPerSocket) {
        this.numCoresPerSocket = numCoresPerSocket;
    }

    public Long getMemoryMB() {
        return this.memoryMB;
    }

    public void setMemoryMB(Long memoryMB) {
        this.memoryMB = memoryMB;
    }

    public VirtualDeviceConfigSpec[] getDeviceChange() {
        return this.deviceChange;
    }

    public void setDeviceChange(VirtualDeviceConfigSpec[] deviceChange) {
        this.deviceChange = deviceChange;
    }

    public ResourceAllocationInfo getCpuAllocation() {
        return this.cpuAllocation;
    }

    public void setCpuAllocation(ResourceAllocationInfo cpuAllocation) {
        this.cpuAllocation = cpuAllocation;
    }

    public ResourceAllocationInfo getMemoryAllocation() {
        return this.memoryAllocation;
    }

    public void setMemoryAllocation(ResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }

    public LatencySensitivity getLatencySensitivity() {
        return this.latencySensitivity;
    }

    public void setLatencySensitivity(LatencySensitivity latencySensitivity) {
        this.latencySensitivity = latencySensitivity;
    }

    public VirtualMachineAffinityInfo getCpuAffinity() {
        return this.cpuAffinity;
    }

    public void setCpuAffinity(VirtualMachineAffinityInfo cpuAffinity) {
        this.cpuAffinity = cpuAffinity;
    }

    @Deprecated
    public VirtualMachineAffinityInfo getMemoryAffinity() {
        return this.memoryAffinity;
    }

    @Deprecated
    public void setMemoryAffinity(VirtualMachineAffinityInfo memoryAffinity) {
        this.memoryAffinity = memoryAffinity;
    }

    @Deprecated
    public VirtualMachineNetworkShaperInfo getNetworkShaper() {
        return this.networkShaper;
    }

    @Deprecated
    public void setNetworkShaper(VirtualMachineNetworkShaperInfo networkShaper) {
        this.networkShaper = networkShaper;
    }

    public VirtualMachineCpuIdInfoSpec[] getCpuFeatureMask() {
        return this.cpuFeatureMask;
    }

    public void setCpuFeatureMask(VirtualMachineCpuIdInfoSpec[] cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public OptionValue[] getExtraConfig() {
        return this.extraConfig;
    }

    public void setExtraConfig(OptionValue[] extraConfig) {
        this.extraConfig = extraConfig;
    }

    public String getSwapPlacement() {
        return this.swapPlacement;
    }

    public void setSwapPlacement(String swapPlacement) {
        this.swapPlacement = swapPlacement;
    }

    public VirtualMachineBootOptions getBootOptions() {
        return this.bootOptions;
    }

    public void setBootOptions(VirtualMachineBootOptions bootOptions) {
        this.bootOptions = bootOptions;
    }

    public VmConfigSpec getVAppConfig() {
        return this.vAppConfig;
    }

    public void setVAppConfig(VmConfigSpec vAppConfig) {
        this.vAppConfig = vAppConfig;
    }

    public FaultToleranceConfigInfo getFtInfo() {
        return this.ftInfo;
    }

    public void setFtInfo(FaultToleranceConfigInfo ftInfo) {
        this.ftInfo = ftInfo;
    }

    public Boolean getVAssertsEnabled() {
        return this.vAssertsEnabled;
    }

    public void setVAssertsEnabled(Boolean vAssertsEnabled) {
        this.vAssertsEnabled = vAssertsEnabled;
    }

    public String getFirmware() {
        return this.firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public Integer getMaxMksConnections() {
        return this.maxMksConnections;
    }

    public void setMaxMksConnections(Integer maxMksConnections) {
        this.maxMksConnections = maxMksConnections;
    }

    public ManagedByInfo getManagedBy() {
        return this.managedBy;
    }

    public void setManagedBy(ManagedByInfo managedBy) {
        this.managedBy = managedBy;
    }

    public ScheduledHardwareUpgradeInfo getScheduledHardwareUpgradeInfo() {
        return this.scheduledHardwareUpgradeInfo;
    }

    public void setScheduledHardwareUpgradeInfo(ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo) {
        this.scheduledHardwareUpgradeInfo = scheduledHardwareUpgradeInfo;
    }

    public VirtualMachineProfileSpec[] getVmProfile() {
        return this.vmProfile;
    }

    public void setVmProfile(VirtualMachineProfileSpec[] vmProfile) {
        this.vmProfile = vmProfile;
    }

    public Boolean isNpivTemporaryDisabled() {
        return npivTemporaryDisabled;
    }

    public void setNpivTemporaryDisabled(Boolean npivTemporaryDisabled) {
        this.npivTemporaryDisabled = npivTemporaryDisabled;
    }

    public Boolean isNpivOnNonRdmDisks() {
        return npivOnNonRdmDisks;
    }

    public void setNpivOnNonRdmDisks(Boolean npivOnNonRdmDisks) {
        this.npivOnNonRdmDisks = npivOnNonRdmDisks;
    }

    public Boolean isMemoryHotAddEnabled() {
        return memoryHotAddEnabled;
    }

    public void setMemoryHotAddEnabled(Boolean memoryHotAddEnabled) {
        this.memoryHotAddEnabled = memoryHotAddEnabled;
    }

    public Boolean isCpuHotAddEnabled() {
        return cpuHotAddEnabled;
    }

    public void setCpuHotAddEnabled(Boolean cpuHotAddEnabled) {
        this.cpuHotAddEnabled = cpuHotAddEnabled;
    }

    public Boolean isCpuHotRemoveEnabled() {
        return cpuHotRemoveEnabled;
    }

    public void setCpuHotRemoveEnabled(Boolean cpuHotRemoveEnabled) {
        this.cpuHotRemoveEnabled = cpuHotRemoveEnabled;
    }

    public Boolean isVirtualICH7MPresent() {
        return virtualICH7MPresent;
    }

    public void setVirtualICH7MPresent(Boolean virtualICH7MPresent) {
        this.virtualICH7MPresent = virtualICH7MPresent;
    }

    public Boolean isVirtualSMCPresent() {
        return virtualSMCPresent;
    }

    public void setVirtualSMCPresent(Boolean virtualSMCPresent) {
        this.virtualSMCPresent = virtualSMCPresent;
    }

    public VmConfigSpec getvAppConfig() {
        return vAppConfig;
    }

    public void setvAppConfig(final VmConfigSpec vAppConfig) {
        this.vAppConfig = vAppConfig;
    }

    public Boolean isvAppConfigRemoved() {
        return vAppConfigRemoved;
    }

    public void setvAppConfigRemoved(final Boolean vAppConfigRemoved) {
        this.vAppConfigRemoved = vAppConfigRemoved;
    }

    public Boolean isvAssertsEnabled() {
        return vAssertsEnabled;
    }

    public void setvAssertsEnabled(final Boolean vAssertsEnabled) {
        this.vAssertsEnabled = vAssertsEnabled;
    }

    public Boolean isChangeTrackingEnabled() {
        return changeTrackingEnabled;
    }

    public void setChangeTrackingEnabled(Boolean changeTrackingEnabled) {
        this.changeTrackingEnabled = changeTrackingEnabled;
    }

    public Boolean isGuestAutoLockEnabled() {
        return guestAutoLockEnabled;
    }

    public void setGuestAutoLockEnabled(Boolean guestAutoLockEnabled) {
        this.guestAutoLockEnabled = guestAutoLockEnabled;
    }

    public Boolean isMemoryReservationLockedToMax() {
        return memoryReservationLockedToMax;
    }

    public void setMemoryReservationLockedToMax(Boolean memoryReservationLockedToMax) {
        this.memoryReservationLockedToMax = memoryReservationLockedToMax;
    }

    public Boolean isNestedHVEnabled() {
        return nestedHVEnabled;
    }

    public void setNestedHVEnabled(Boolean nestedHVEnabled) {
        this.nestedHVEnabled = nestedHVEnabled;
    }

    public Boolean isvPMCEnabled() {
        return vPMCEnabled;
    }

    public void setvPMCEnabled(final Boolean vPMCEnabled) {
        this.vPMCEnabled = vPMCEnabled;
    }

    public CryptoSpec getCrypto() {
        return crypto;
    }

    public void setCrypto(final CryptoSpec crypto) {
        this.crypto = crypto;
    }

    public Boolean isMessageBusTunnelEnabled() {
        return messageBusTunnelEnabled;
    }

    public void setMessageBusTunnelEnabled(final Boolean messageBusTunnelEnabled) {
        this.messageBusTunnelEnabled = messageBusTunnelEnabled;
    }

    public String getMigrateEncryption() {
        return migrateEncryption;
    }

    public void setMigrateEncryption(final String migrateEncryption) {
        this.migrateEncryption = migrateEncryption;
    }

    public ReplicationConfigSpec getRepConfig() {
        return repConfig;
    }

    public void setRepConfig(final ReplicationConfigSpec repConfig) {
        this.repConfig = repConfig;
    }
}