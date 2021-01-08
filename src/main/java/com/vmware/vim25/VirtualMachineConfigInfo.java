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
import java.util.Calendar;

/**
 * The ConfigInfo data object type encapsulates the configuration settings and virtual hardware for a virtual machine.
 * This type holds all the information that is present in the .vmx configuration file for the virtual machine.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */
@SuppressWarnings("all")
public class VirtualMachineConfigInfo extends DynamicData {

    private String alternateGuestName;
    private String annotation;
    private VirtualMachineBootOptions bootOptions;
    private Boolean changeTrackingEnabled;
    private String changeVersion;
    private VirtualMachineConsolePreferences consolePreferences;
    private VirtualMachineAffinityInfo cpuAffinity;
    private ResourceAllocationInfo cpuAllocation;
    private HostCpuIdInfo[] cpuFeatureMask;
    private Boolean cpuHotAddEnabled;
    private Boolean cpuHotRemoveEnabled;
    private Calendar createDate;
    private VirtualMachineConfigInfoDatastoreUrlPair[] datastoreUrl;
    private VirtualMachineDefaultPowerOpInfo defaultPowerOps;
    private OptionValue[] extraConfig;
    private VirtualMachineFileInfo files;
    private String firmware;
    private VirtualMachineFlagInfo flags;
    private VirtualMachineForkConfigInfo forkConfigInfo;
    private FaultToleranceConfigInfo ftInfo;
    private Boolean guestAutoLockEnabled;
    private String guestFullName;
    private String guestId;
    private VirtualMachineGuestIntegrityInfo guestIntegrityInfo;
    private VirtualHardware hardware;
    private Long hotPlugMemoryIncrementSize;
    private Long hotPlugMemoryLimit;
    private VirtualMachineConfigInfoOverheadInfo initialOverhead;
    private String instanceUuid;
    private CryptoKeyId keyId;
    private LatencySensitivity latencySensitivity;
    private String locationId;
    private ManagedByInfo managedBy;
    private Integer maxMksConnections;
    @Deprecated
    private VirtualMachineAffinityInfo memoryAffinity;
    private ResourceAllocationInfo memoryAllocation;
    private Boolean memoryHotAddEnabled;
    private Boolean memoryReservationLockedToMax;
    private Boolean messageBusTunnelEnabled;
    private String migrateEncryption;
    private Calendar modified;
    private String name;
    private Boolean nestedHVEnabled;
    @Deprecated
    private VirtualMachineNetworkShaperInfo networkShaper;
    private Short npivDesiredNodeWwns;
    private Short npivDesiredPortWwns;
    private long[] npivNodeWorldWideName;
    private Boolean npivOnNonRdmDisks;
    private long[] npivPortWorldWideName;
    private Boolean npivTemporaryDisabled;
    private String npivWorldWideNameType;
    private ReplicationConfigSpec repConfig;
    private ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo;
    private String swapPlacement;
    private String swapStorageObjectId;
    private boolean template;
    private ToolsConfigInfo tools;
    private String uuid;
    private VmConfigInfo vAppConfig;
    private Boolean vAssertsEnabled;
    private String version;
    private Long vFlashCacheReservation;
    private String vmStorageObjectId;
    private byte[] vmxConfigChecksum;
    private Boolean vPMCEnabled;

    @Override
    public String toString() {
        return "VirtualMachineConfigInfo{" +
                "alternateGuestName='" + alternateGuestName + '\'' +
                ", annotation='" + annotation + '\'' +
                ", bootOptions=" + bootOptions +
                ", changeTrackingEnabled=" + changeTrackingEnabled +
                ", changeVersion='" + changeVersion + '\'' +
                ", consolePreferences=" + consolePreferences +
                ", cpuAffinity=" + cpuAffinity +
                ", cpuAllocation=" + cpuAllocation +
                ", cpuFeatureMask=" + Arrays.toString(cpuFeatureMask) +
                ", cpuHotAddEnabled=" + cpuHotAddEnabled +
                ", cpuHotRemoveEnabled=" + cpuHotRemoveEnabled +
                ", createDate=" + createDate +
                ", datastoreUrl=" + Arrays.toString(datastoreUrl) +
                ", defaultPowerOps=" + defaultPowerOps +
                ", extraConfig=" + Arrays.toString(extraConfig) +
                ", files=" + files +
                ", firmware='" + firmware + '\'' +
                ", flags=" + flags +
                ", forkConfigInfo=" + forkConfigInfo +
                ", ftInfo=" + ftInfo +
                ", guestAutoLockEnabled=" + guestAutoLockEnabled +
                ", guestFullName='" + guestFullName + '\'' +
                ", guestId='" + guestId + '\'' +
                ", guestIntegrityInfo=" + guestIntegrityInfo +
                ", hardware=" + hardware +
                ", hotPlugMemoryIncrementSize=" + hotPlugMemoryIncrementSize +
                ", hotPlugMemoryLimit=" + hotPlugMemoryLimit +
                ", initialOverhead=" + initialOverhead +
                ", instanceUuid='" + instanceUuid + '\'' +
                ", keyId=" + keyId +
                ", latencySensitivity=" + latencySensitivity +
                ", locationId='" + locationId + '\'' +
                ", managedBy=" + managedBy +
                ", maxMksConnections=" + maxMksConnections +
                ", memoryAffinity=" + memoryAffinity +
                ", memoryAllocation=" + memoryAllocation +
                ", memoryHotAddEnabled=" + memoryHotAddEnabled +
                ", memoryReservationLockedToMax=" + memoryReservationLockedToMax +
                ", messageBusTunnelEnabled=" + messageBusTunnelEnabled +
                ", migrateEncryption='" + migrateEncryption + '\'' +
                ", modified=" + modified +
                ", name='" + name + '\'' +
                ", nestedHVEnabled=" + nestedHVEnabled +
                ", networkShaper=" + networkShaper +
                ", npivDesiredNodeWwns=" + npivDesiredNodeWwns +
                ", npivDesiredPortWwns=" + npivDesiredPortWwns +
                ", npivNodeWorldWideName=" + Arrays.toString(npivNodeWorldWideName) +
                ", npivOnNonRdmDisks=" + npivOnNonRdmDisks +
                ", npivPortWorldWideName=" + Arrays.toString(npivPortWorldWideName) +
                ", npivTemporaryDisabled=" + npivTemporaryDisabled +
                ", npivWorldWideNameType='" + npivWorldWideNameType + '\'' +
                ", repConfig=" + repConfig +
                ", scheduledHardwareUpgradeInfo=" + scheduledHardwareUpgradeInfo +
                ", swapPlacement='" + swapPlacement + '\'' +
                ", swapStorageObjectId='" + swapStorageObjectId + '\'' +
                ", template=" + template +
                ", tools=" + tools +
                ", uuid='" + uuid + '\'' +
                ", vAppConfig=" + vAppConfig +
                ", vAssertsEnabled=" + vAssertsEnabled +
                ", version='" + version + '\'' +
                ", vFlashCacheReservation=" + vFlashCacheReservation +
                ", vmStorageObjectId='" + vmStorageObjectId + '\'' +
                ", vmxConfigChecksum=" + Arrays.toString(vmxConfigChecksum) +
                ", vPMCEnabled=" + vPMCEnabled +
                "} " + super.toString();
    }

    public String getAlternateGuestName() {
        return alternateGuestName;
    }

    public void setAlternateGuestName(final String alternateGuestName) {
        this.alternateGuestName = alternateGuestName;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(final String annotation) {
        this.annotation = annotation;
    }

    public VirtualMachineBootOptions getBootOptions() {
        return bootOptions;
    }

    public void setBootOptions(final VirtualMachineBootOptions bootOptions) {
        this.bootOptions = bootOptions;
    }

    public Boolean getChangeTrackingEnabled() {
        return changeTrackingEnabled;
    }

    public void setChangeTrackingEnabled(final Boolean changeTrackingEnabled) {
        this.changeTrackingEnabled = changeTrackingEnabled;
    }

    public String getChangeVersion() {
        return changeVersion;
    }

    public void setChangeVersion(final String changeVersion) {
        this.changeVersion = changeVersion;
    }

    public VirtualMachineConsolePreferences getConsolePreferences() {
        return consolePreferences;
    }

    public void setConsolePreferences(final VirtualMachineConsolePreferences consolePreferences) {
        this.consolePreferences = consolePreferences;
    }

    public VirtualMachineAffinityInfo getCpuAffinity() {
        return cpuAffinity;
    }

    public void setCpuAffinity(final VirtualMachineAffinityInfo cpuAffinity) {
        this.cpuAffinity = cpuAffinity;
    }

    public ResourceAllocationInfo getCpuAllocation() {
        return cpuAllocation;
    }

    public void setCpuAllocation(final ResourceAllocationInfo cpuAllocation) {
        this.cpuAllocation = cpuAllocation;
    }

    public HostCpuIdInfo[] getCpuFeatureMask() {
        return cpuFeatureMask;
    }

    public void setCpuFeatureMask(final HostCpuIdInfo[] cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public Boolean getCpuHotAddEnabled() {
        return cpuHotAddEnabled;
    }

    public void setCpuHotAddEnabled(final Boolean cpuHotAddEnabled) {
        this.cpuHotAddEnabled = cpuHotAddEnabled;
    }

    public Boolean getCpuHotRemoveEnabled() {
        return cpuHotRemoveEnabled;
    }

    public void setCpuHotRemoveEnabled(final Boolean cpuHotRemoveEnabled) {
        this.cpuHotRemoveEnabled = cpuHotRemoveEnabled;
    }

    public Calendar getCreateDate() {
        return createDate;
    }

    public void setCreateDate(final Calendar createDate) {
        this.createDate = createDate;
    }

    public VirtualMachineConfigInfoDatastoreUrlPair[] getDatastoreUrl() {
        return datastoreUrl;
    }

    public void setDatastoreUrl(final VirtualMachineConfigInfoDatastoreUrlPair[] datastoreUrl) {
        this.datastoreUrl = datastoreUrl;
    }

    public VirtualMachineDefaultPowerOpInfo getDefaultPowerOps() {
        return defaultPowerOps;
    }

    public void setDefaultPowerOps(final VirtualMachineDefaultPowerOpInfo defaultPowerOps) {
        this.defaultPowerOps = defaultPowerOps;
    }

    public OptionValue[] getExtraConfig() {
        return extraConfig;
    }

    public void setExtraConfig(final OptionValue[] extraConfig) {
        this.extraConfig = extraConfig;
    }

    public VirtualMachineFileInfo getFiles() {
        return files;
    }

    public void setFiles(final VirtualMachineFileInfo files) {
        this.files = files;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(final String firmware) {
        this.firmware = firmware;
    }

    public VirtualMachineFlagInfo getFlags() {
        return flags;
    }

    public void setFlags(final VirtualMachineFlagInfo flags) {
        this.flags = flags;
    }

    public VirtualMachineForkConfigInfo getForkConfigInfo() {
        return forkConfigInfo;
    }

    public void setForkConfigInfo(final VirtualMachineForkConfigInfo forkConfigInfo) {
        this.forkConfigInfo = forkConfigInfo;
    }

    public FaultToleranceConfigInfo getFtInfo() {
        return ftInfo;
    }

    public void setFtInfo(final FaultToleranceConfigInfo ftInfo) {
        this.ftInfo = ftInfo;
    }

    public Boolean getGuestAutoLockEnabled() {
        return guestAutoLockEnabled;
    }

    public void setGuestAutoLockEnabled(final Boolean guestAutoLockEnabled) {
        this.guestAutoLockEnabled = guestAutoLockEnabled;
    }

    public String getGuestFullName() {
        return guestFullName;
    }

    public void setGuestFullName(final String guestFullName) {
        this.guestFullName = guestFullName;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(final String guestId) {
        this.guestId = guestId;
    }

    public VirtualMachineGuestIntegrityInfo getGuestIntegrityInfo() {
        return guestIntegrityInfo;
    }

    public void setGuestIntegrityInfo(final VirtualMachineGuestIntegrityInfo guestIntegrityInfo) {
        this.guestIntegrityInfo = guestIntegrityInfo;
    }

    public VirtualHardware getHardware() {
        return hardware;
    }

    public void setHardware(final VirtualHardware hardware) {
        this.hardware = hardware;
    }

    public Long getHotPlugMemoryIncrementSize() {
        return hotPlugMemoryIncrementSize;
    }

    public void setHotPlugMemoryIncrementSize(final Long hotPlugMemoryIncrementSize) {
        this.hotPlugMemoryIncrementSize = hotPlugMemoryIncrementSize;
    }

    public Long getHotPlugMemoryLimit() {
        return hotPlugMemoryLimit;
    }

    public void setHotPlugMemoryLimit(final Long hotPlugMemoryLimit) {
        this.hotPlugMemoryLimit = hotPlugMemoryLimit;
    }

    public VirtualMachineConfigInfoOverheadInfo getInitialOverhead() {
        return initialOverhead;
    }

    public void setInitialOverhead(final VirtualMachineConfigInfoOverheadInfo initialOverhead) {
        this.initialOverhead = initialOverhead;
    }

    public String getInstanceUuid() {
        return instanceUuid;
    }

    public void setInstanceUuid(final String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    public CryptoKeyId getKeyId() {
        return keyId;
    }

    public void setKeyId(final CryptoKeyId keyId) {
        this.keyId = keyId;
    }

    public LatencySensitivity getLatencySensitivity() {
        return latencySensitivity;
    }

    public void setLatencySensitivity(final LatencySensitivity latencySensitivity) {
        this.latencySensitivity = latencySensitivity;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(final String locationId) {
        this.locationId = locationId;
    }

    public ManagedByInfo getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(final ManagedByInfo managedBy) {
        this.managedBy = managedBy;
    }

    public Integer getMaxMksConnections() {
        return maxMksConnections;
    }

    public void setMaxMksConnections(final Integer maxMksConnections) {
        this.maxMksConnections = maxMksConnections;
    }

    public VirtualMachineAffinityInfo getMemoryAffinity() {
        return memoryAffinity;
    }

    public void setMemoryAffinity(final VirtualMachineAffinityInfo memoryAffinity) {
        this.memoryAffinity = memoryAffinity;
    }

    public ResourceAllocationInfo getMemoryAllocation() {
        return memoryAllocation;
    }

    public void setMemoryAllocation(final ResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }

    public Boolean getMemoryHotAddEnabled() {
        return memoryHotAddEnabled;
    }

    public void setMemoryHotAddEnabled(final Boolean memoryHotAddEnabled) {
        this.memoryHotAddEnabled = memoryHotAddEnabled;
    }

    public Boolean getMemoryReservationLockedToMax() {
        return memoryReservationLockedToMax;
    }

    public void setMemoryReservationLockedToMax(final Boolean memoryReservationLockedToMax) {
        this.memoryReservationLockedToMax = memoryReservationLockedToMax;
    }

    public Boolean getMessageBusTunnelEnabled() {
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

    public Calendar getModified() {
        return modified;
    }

    public void setModified(final Calendar modified) {
        this.modified = modified;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getNestedHVEnabled() {
        return nestedHVEnabled;
    }

    public void setNestedHVEnabled(final Boolean nestedHVEnabled) {
        this.nestedHVEnabled = nestedHVEnabled;
    }

    public VirtualMachineNetworkShaperInfo getNetworkShaper() {
        return networkShaper;
    }

    public void setNetworkShaper(final VirtualMachineNetworkShaperInfo networkShaper) {
        this.networkShaper = networkShaper;
    }

    public Short getNpivDesiredNodeWwns() {
        return npivDesiredNodeWwns;
    }

    public void setNpivDesiredNodeWwns(final Short npivDesiredNodeWwns) {
        this.npivDesiredNodeWwns = npivDesiredNodeWwns;
    }

    public Short getNpivDesiredPortWwns() {
        return npivDesiredPortWwns;
    }

    public void setNpivDesiredPortWwns(final Short npivDesiredPortWwns) {
        this.npivDesiredPortWwns = npivDesiredPortWwns;
    }

    public long[] getNpivNodeWorldWideName() {
        return npivNodeWorldWideName;
    }

    public void setNpivNodeWorldWideName(final long[] npivNodeWorldWideName) {
        this.npivNodeWorldWideName = npivNodeWorldWideName;
    }

    public Boolean getNpivOnNonRdmDisks() {
        return npivOnNonRdmDisks;
    }

    public void setNpivOnNonRdmDisks(final Boolean npivOnNonRdmDisks) {
        this.npivOnNonRdmDisks = npivOnNonRdmDisks;
    }

    public long[] getNpivPortWorldWideName() {
        return npivPortWorldWideName;
    }

    public void setNpivPortWorldWideName(final long[] npivPortWorldWideName) {
        this.npivPortWorldWideName = npivPortWorldWideName;
    }

    public Boolean getNpivTemporaryDisabled() {
        return npivTemporaryDisabled;
    }

    public void setNpivTemporaryDisabled(final Boolean npivTemporaryDisabled) {
        this.npivTemporaryDisabled = npivTemporaryDisabled;
    }

    public String getNpivWorldWideNameType() {
        return npivWorldWideNameType;
    }

    public void setNpivWorldWideNameType(final String npivWorldWideNameType) {
        this.npivWorldWideNameType = npivWorldWideNameType;
    }

    public ReplicationConfigSpec getRepConfig() {
        return repConfig;
    }

    public void setRepConfig(final ReplicationConfigSpec repConfig) {
        this.repConfig = repConfig;
    }

    public ScheduledHardwareUpgradeInfo getScheduledHardwareUpgradeInfo() {
        return scheduledHardwareUpgradeInfo;
    }

    public void setScheduledHardwareUpgradeInfo(final ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo) {
        this.scheduledHardwareUpgradeInfo = scheduledHardwareUpgradeInfo;
    }

    public String getSwapPlacement() {
        return swapPlacement;
    }

    public void setSwapPlacement(final String swapPlacement) {
        this.swapPlacement = swapPlacement;
    }

    public String getSwapStorageObjectId() {
        return swapStorageObjectId;
    }

    public void setSwapStorageObjectId(final String swapStorageObjectId) {
        this.swapStorageObjectId = swapStorageObjectId;
    }

    public boolean isTemplate() {
        return template;
    }

    public void setTemplate(final boolean template) {
        this.template = template;
    }

    public ToolsConfigInfo getTools() {
        return tools;
    }

    public void setTools(final ToolsConfigInfo tools) {
        this.tools = tools;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public VmConfigInfo getvAppConfig() {
        return vAppConfig;
    }

    public void setvAppConfig(final VmConfigInfo vAppConfig) {
        this.vAppConfig = vAppConfig;
    }

    public Boolean getvAssertsEnabled() {
        return vAssertsEnabled;
    }

    public void setvAssertsEnabled(final Boolean vAssertsEnabled) {
        this.vAssertsEnabled = vAssertsEnabled;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public Long getvFlashCacheReservation() {
        return vFlashCacheReservation;
    }

    public void setvFlashCacheReservation(final Long vFlashCacheReservation) {
        this.vFlashCacheReservation = vFlashCacheReservation;
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

    public Boolean getvPMCEnabled() {
        return vPMCEnabled;
    }

    public void setvPMCEnabled(final Boolean vPMCEnabled) {
        this.vPMCEnabled = vPMCEnabled;
    }

}
