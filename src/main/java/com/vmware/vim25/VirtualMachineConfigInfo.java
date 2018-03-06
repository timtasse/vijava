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

import java.util.Calendar;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.5
 */
@SuppressWarnings("all")
public class VirtualMachineConfigInfo extends DynamicData {

    public String changeVersion;
    public Calendar modified;
    public String name;
    public String guestFullName;
    public String version;
    public String uuid;
    public String instanceUuid;
    public long[] npivNodeWorldWideName;
    public long[] npivPortWorldWideName;
    public String npivWorldWideNameType;
    public Short npivDesiredNodeWwns;
    public Short npivDesiredPortWwns;
    public Boolean npivTemporaryDisabled;
    public Boolean npivOnNonRdmDisks;
    public String locationId;
    public boolean template;
    public String guestId;
    public String alternateGuestName;
    public String annotation;
    public VirtualMachineFileInfo files;
    public ToolsConfigInfo tools;
    public VirtualMachineFlagInfo flags;
    public VirtualMachineConsolePreferences consolePreferences;
    public VirtualMachineDefaultPowerOpInfo defaultPowerOps;
    public VirtualHardware hardware;
    public ResourceAllocationInfo cpuAllocation;
    public ResourceAllocationInfo memoryAllocation;
    public LatencySensitivity latencySensitivity;
    public Boolean memoryHotAddEnabled;
    public Boolean cpuHotAddEnabled;
    public Boolean cpuHotRemoveEnabled;
    public Long hotPlugMemoryLimit;
    public Long hotPlugMemoryIncrementSize;
    public VirtualMachineAffinityInfo cpuAffinity;
    @Deprecated
    public VirtualMachineAffinityInfo memoryAffinity;
    @Deprecated
    public VirtualMachineNetworkShaperInfo networkShaper;
    public OptionValue[] extraConfig;
    public HostCpuIdInfo[] cpuFeatureMask;
    public VirtualMachineConfigInfoDatastoreUrlPair[] datastoreUrl;
    public String swapPlacement;
    public VirtualMachineBootOptions bootOptions;
    public FaultToleranceConfigInfo ftInfo;
    public VmConfigInfo vAppConfig;
    public Boolean vAssertsEnabled;
    public Boolean changeTrackingEnabled;
    public String firmware;
    public Integer maxMksConnections;
    public Boolean guestAutoLockEnabled;
    public ManagedByInfo managedBy;
    public Boolean memoryReservationLockedToMax;
    public VirtualMachineConfigInfoOverheadInfo initialOverhead;
    public Boolean nestedHVEnabled;
    public Boolean vPMCEnabled;
    public ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo;
    public Long vFlashCacheReservation;
    public VirtualMachineForkConfigInfo forkConfigInfo;
    public VirtualMachineGuestIntegrityInfo guestIntegrityInfo;
    public CryptoKeyId keyId;
    public Boolean messageBusTunnelEnabled;
    public String migrateEncryption;
    public ReplicationConfigSpec repConfig;
    public String swapStorageObjectId;
    public String vmStorageObjectId;
    public byte[] vmxConfigChecksum;

    public String getChangeVersion() {
        return this.changeVersion;
    }

    public void setChangeVersion(String changeVersion) {
        this.changeVersion = changeVersion;
    }

    public Calendar getModified() {
        return this.modified;
    }

    public void setModified(Calendar modified) {
        this.modified = modified;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuestFullName() {
        return this.guestFullName;
    }

    public void setGuestFullName(String guestFullName) {
        this.guestFullName = guestFullName;
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

    public long[] getNpivNodeWorldWideName() {
        return this.npivNodeWorldWideName;
    }

    public void setNpivNodeWorldWideName(long[] npivNodeWorldWideName) {
        this.npivNodeWorldWideName = npivNodeWorldWideName;
    }

    public long[] getNpivPortWorldWideName() {
        return this.npivPortWorldWideName;
    }

    public void setNpivPortWorldWideName(long[] npivPortWorldWideName) {
        this.npivPortWorldWideName = npivPortWorldWideName;
    }

    public String getNpivWorldWideNameType() {
        return this.npivWorldWideNameType;
    }

    public void setNpivWorldWideNameType(String npivWorldWideNameType) {
        this.npivWorldWideNameType = npivWorldWideNameType;
    }

    public short getNpivDesiredNodeWwns() {
        return this.npivDesiredNodeWwns;
    }

    public void setNpivDesiredNodeWwns(short npivDesiredNodeWwns) {
        this.npivDesiredNodeWwns = npivDesiredNodeWwns;
    }

    public short getNpivDesiredPortWwns() {
        return this.npivDesiredPortWwns;
    }

    public void setNpivDesiredPortWwns(short npivDesiredPortWwns) {
        this.npivDesiredPortWwns = npivDesiredPortWwns;
    }

    public String getLocationId() {
        return this.locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public boolean isTemplate() {
        return this.template;
    }

    public void setTemplate(boolean template) {
        this.template = template;
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

    public VirtualMachineDefaultPowerOpInfo getDefaultPowerOps() {
        return this.defaultPowerOps;
    }

    public void setDefaultPowerOps(VirtualMachineDefaultPowerOpInfo defaultPowerOps) {
        this.defaultPowerOps = defaultPowerOps;
    }

    public VirtualHardware getHardware() {
        return this.hardware;
    }

    public void setHardware(VirtualHardware hardware) {
        this.hardware = hardware;
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

    public long getHotPlugMemoryLimit() {
        return this.hotPlugMemoryLimit;
    }

    public void setHotPlugMemoryLimit(long hotPlugMemoryLimit) {
        this.hotPlugMemoryLimit = hotPlugMemoryLimit;
    }

    public long getHotPlugMemoryIncrementSize() {
        return this.hotPlugMemoryIncrementSize;
    }

    public void setHotPlugMemoryIncrementSize(long hotPlugMemoryIncrementSize) {
        this.hotPlugMemoryIncrementSize = hotPlugMemoryIncrementSize;
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

    public OptionValue[] getExtraConfig() {
        return this.extraConfig;
    }

    public void setExtraConfig(OptionValue[] extraConfig) {
        this.extraConfig = extraConfig;
    }

    public HostCpuIdInfo[] getCpuFeatureMask() {
        return this.cpuFeatureMask;
    }

    public void setCpuFeatureMask(HostCpuIdInfo[] cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public VirtualMachineConfigInfoDatastoreUrlPair[] getDatastoreUrl() {
        return this.datastoreUrl;
    }

    public void setDatastoreUrl(VirtualMachineConfigInfoDatastoreUrlPair[] datastoreUrl) {
        this.datastoreUrl = datastoreUrl;
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

    public FaultToleranceConfigInfo getFtInfo() {
        return this.ftInfo;
    }

    public void setFtInfo(FaultToleranceConfigInfo ftInfo) {
        this.ftInfo = ftInfo;
    }

    public VmConfigInfo getVAppConfig() {
        return this.vAppConfig;
    }

    public void setVAppConfig(VmConfigInfo vAppConfig) {
        this.vAppConfig = vAppConfig;
    }

    public String getFirmware() {
        return this.firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public int getMaxMksConnections() {
        return this.maxMksConnections;
    }

    public void setMaxMksConnections(int maxMksConnections) {
        this.maxMksConnections = maxMksConnections;
    }

    public ManagedByInfo getManagedBy() {
        return this.managedBy;
    }

    public void setManagedBy(ManagedByInfo managedBy) {
        this.managedBy = managedBy;
    }

    public VirtualMachineConfigInfoOverheadInfo getInitialOverhead() {
        return this.initialOverhead;
    }

    public void setInitialOverhead(VirtualMachineConfigInfoOverheadInfo initialOverhead) {
        this.initialOverhead = initialOverhead;
    }

    public void setVPMCEnabled(boolean vPMCEnabled) {
        this.vPMCEnabled = vPMCEnabled;
    }

    public ScheduledHardwareUpgradeInfo getScheduledHardwareUpgradeInfo() {
        return this.scheduledHardwareUpgradeInfo;
    }

    public void setScheduledHardwareUpgradeInfo(ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo) {
        this.scheduledHardwareUpgradeInfo = scheduledHardwareUpgradeInfo;
    }

    public long getVFlashCacheReservation() {
        return this.vFlashCacheReservation;
    }

    public void setVFlashCacheReservation(long vFlashCacheReservation) {
        this.vFlashCacheReservation = vFlashCacheReservation;
    }

    public boolean isNpivTemporaryDisabled() {
        return npivTemporaryDisabled;
    }

    public void setNpivTemporaryDisabled(boolean npivTemporaryDisabled) {
        this.npivTemporaryDisabled = npivTemporaryDisabled;
    }

    public boolean isNpivOnNonRdmDisks() {
        return npivOnNonRdmDisks;
    }

    public void setNpivOnNonRdmDisks(boolean npivOnNonRdmDisks) {
        this.npivOnNonRdmDisks = npivOnNonRdmDisks;
    }

    public boolean isMemoryHotAddEnabled() {
        return memoryHotAddEnabled;
    }

    public void setMemoryHotAddEnabled(boolean memoryHotAddEnabled) {
        this.memoryHotAddEnabled = memoryHotAddEnabled;
    }

    public boolean isCpuHotAddEnabled() {
        return cpuHotAddEnabled;
    }

    public void setCpuHotAddEnabled(boolean cpuHotAddEnabled) {
        this.cpuHotAddEnabled = cpuHotAddEnabled;
    }

    public boolean isCpuHotRemoveEnabled() {
        return cpuHotRemoveEnabled;
    }

    public void setCpuHotRemoveEnabled(boolean cpuHotRemoveEnabled) {
        this.cpuHotRemoveEnabled = cpuHotRemoveEnabled;
    }

    public VmConfigInfo getvAppConfig() {
        return vAppConfig;
    }

    public void setvAppConfig(final VmConfigInfo vAppConfig) {
        this.vAppConfig = vAppConfig;
    }

    public boolean isvAssertsEnabled() {
        return vAssertsEnabled;
    }

    public void setvAssertsEnabled(final boolean vAssertsEnabled) {
        this.vAssertsEnabled = vAssertsEnabled;
    }

    public boolean isChangeTrackingEnabled() {
        return changeTrackingEnabled;
    }

    public void setChangeTrackingEnabled(boolean changeTrackingEnabled) {
        this.changeTrackingEnabled = changeTrackingEnabled;
    }

    public boolean isGuestAutoLockEnabled() {
        return guestAutoLockEnabled;
    }

    public void setGuestAutoLockEnabled(boolean guestAutoLockEnabled) {
        this.guestAutoLockEnabled = guestAutoLockEnabled;
    }

    public boolean isMemoryReservationLockedToMax() {
        return memoryReservationLockedToMax;
    }

    public void setMemoryReservationLockedToMax(boolean memoryReservationLockedToMax) {
        this.memoryReservationLockedToMax = memoryReservationLockedToMax;
    }

    public boolean isNestedHVEnabled() {
        return nestedHVEnabled;
    }

    public void setNestedHVEnabled(boolean nestedHVEnabled) {
        this.nestedHVEnabled = nestedHVEnabled;
    }

    public boolean isvPMCEnabled() {
        return vPMCEnabled;
    }

    public void setvPMCEnabled(final boolean vPMCEnabled) {
        this.vPMCEnabled = vPMCEnabled;
    }

    public long getvFlashCacheReservation() {
        return vFlashCacheReservation;
    }

    public void setvFlashCacheReservation(final long vFlashCacheReservation) {
        this.vFlashCacheReservation = vFlashCacheReservation;
    }

    public VirtualMachineForkConfigInfo getForkConfigInfo() {
        return forkConfigInfo;
    }

    public void setForkConfigInfo(final VirtualMachineForkConfigInfo forkConfigInfo) {
        this.forkConfigInfo = forkConfigInfo;
    }

    public VirtualMachineGuestIntegrityInfo getGuestIntegrityInfo() {
        return guestIntegrityInfo;
    }

    public void setGuestIntegrityInfo(final VirtualMachineGuestIntegrityInfo guestIntegrityInfo) {
        this.guestIntegrityInfo = guestIntegrityInfo;
    }

    public CryptoKeyId getKeyId() {
        return keyId;
    }

    public void setKeyId(final CryptoKeyId keyId) {
        this.keyId = keyId;
    }

    public boolean isMessageBusTunnelEnabled() {
        return messageBusTunnelEnabled;
    }

    public void setMessageBusTunnelEnabled(final boolean messageBusTunnelEnabled) {
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

    public String getSwapStorageObjectId() {
        return swapStorageObjectId;
    }

    public void setSwapStorageObjectId(final String swapStorageObjectId) {
        this.swapStorageObjectId = swapStorageObjectId;
    }

    public String getVmStorageObjectId() {
        return vmStorageObjectId;
    }

    public void setVmStorageObjectId(final String vmStorageObjectId) {
        this.vmStorageObjectId = vmStorageObjectId;
    }

    public byte[] getVmxConfigChecksum() {
        return vmxConfigChecksum;
    }

    public void setVmxConfigChecksum(final byte[] vmxConfigChecksum) {
        this.vmxConfigChecksum = vmxConfigChecksum;
    }
}