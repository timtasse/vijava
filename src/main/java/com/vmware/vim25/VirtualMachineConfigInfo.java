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
import java.util.List;

/**
 * The ConfigInfo data object type encapsulates the configuration settings and virtual hardware for a virtual machine.
 * This type holds all the information that is present in the .vmx configuration file for the virtual machine.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.1
 */
@SuppressWarnings("unused")
public class VirtualMachineConfigInfo extends DynamicData {

    private String changeVersion;
    private Calendar modified;
    private String name;
    private String guestFullName;
    private String version;
    private String uuid;
    private Calendar createDate;
    private String instanceUuid;
    private List<Long> npivNodeWorldWideName = List.of();
    private List<Long> npivPortWorldWideName = List.of();
    private VirtualMachineConfigInfoNpivWwnType npivWorldWideNameType;
    private Short npivDesiredNodeWwns;
    private Short npivDesiredPortWwns;
    private Boolean npivTemporaryDisabled;
    private Boolean npivOnNonRdmDisks;
    private String locationId;
    private boolean template;
    private VirtualMachineGuestOsIdentifier guestId;
    private String alternateGuestName;
    private String annotation;
    private VirtualMachineFileInfo files;
    private ToolsConfigInfo tools;
    private VirtualMachineFlagInfo flags;
    private VirtualMachineConsolePreferences consolePreferences;
    private VirtualMachineDefaultPowerOpInfo defaultPowerOps;
    private Boolean rebootPowerOff;
    private VirtualHardware hardware;
    private List<VirtualMachineVcpuConfig> vcpuConfig = List.of();
    private ResourceAllocationInfo cpuAllocation;
    private ResourceAllocationInfo memoryAllocation;
    private LatencySensitivity latencySensitivity;
    private Boolean memoryHotAddEnabled;
    private Boolean cpuHotAddEnabled;
    private Boolean cpuHotRemoveEnabled;
    private Long hotPlugMemoryLimit;
    private Long hotPlugMemoryIncrementSize;
    private VirtualMachineAffinityInfo cpuAffinity;
    /**
     * @deprecated since vSphere 6.0
     */
    @Deprecated
    private VirtualMachineAffinityInfo memoryAffinity;
    /**
     * @deprecated from vSphere 5.5, shaping policy on VM is not supported.
     */
    @Deprecated
    private VirtualMachineNetworkShaperInfo networkShaper;
    private List<OptionValue> extraConfig;
    private List<HostCpuIdInfo> cpuFeatureMask;
    private List<VirtualMachineConfigInfoDatastoreUrlPair> datastoreUrl;
    private VirtualMachineConfigInfoSwapPlacementType swapPlacement;
    private VirtualMachineBootOptions bootOptions;
    private FaultToleranceConfigInfo ftInfo;
    private ReplicationConfigSpec repConfig;
    private VmConfigInfo vAppConfig;
    private Boolean vAssertsEnabled;
    private Boolean changeTrackingEnabled;
    private GuestOsDescriptorFirmwareType firmware;
    private Integer maxMksConnections;
    private Boolean guestAutoLockEnabled;
    private ManagedByInfo managedBy;
    private Boolean memoryReservationLockedToMax;
    private VirtualMachineConfigInfoOverheadInfo initialOverhead;
    private Boolean nestedHVEnabled;
    private Boolean vPMCEnabled;
    private ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo;
    private VirtualMachineForkConfigInfo forkConfigInfo;
    private Long vFlashCacheReservation;
    private String vmxConfigChecksum;
    private Boolean messageBusTunnelEnabled;
    private String vmStorageObjectId;
    private String swapStorageObjectId;
    private CryptoKeyId keyId;
    private VirtualMachineGuestIntegrityInfo guestIntegrityInfo;
    private VirtualMachineConfigSpecEncryptedVMotionModes migrateEncryption;
    private VirtualMachineSgxInfo sgxInfo;
    private VirtualMachineContentLibraryItemInfo contentLibItemInfo;
    private VirtualMachineConfigSpecEncryptedFtModes ftEncryptionMode;
    private VirtualMachineGuestMonitoringModeInfo guestMonitoringModeInfo;
    private Boolean sevEnabled;
    private VirtualMachineVirtualNumaInfo numaInfo;
    private Boolean pmemFailoverEnabled;
    private Boolean vmxStatsCollectionEnabled;
    private Boolean vmOpNotificationToAppEnabled;
    private Long vmOpNotificationTimeout;
    private VirtualMachineVirtualDeviceSwap deviceSwap;
    private VirtualMachineVirtualPMem pmem;
    private VirtualMachineVirtualDeviceGroups deviceGroups;
    private Boolean fixedPassthruHotPlugEnabled;

    @Override
    public String toString() {
        return "VirtualMachineConfigInfo{" +
                "changeVersion='" + changeVersion + '\'' +
                ", modified=" + modified +
                ", name='" + name + '\'' +
                ", guestFullName='" + guestFullName + '\'' +
                ", version='" + version + '\'' +
                ", uuid='" + uuid + '\'' +
                ", createDate=" + createDate +
                ", instanceUuid='" + instanceUuid + '\'' +
                ", npivNodeWorldWideName=" + npivNodeWorldWideName +
                ", npivPortWorldWideName=" + npivPortWorldWideName +
                ", npivWorldWideNameType=" + npivWorldWideNameType +
                ", npivDesiredNodeWwns=" + npivDesiredNodeWwns +
                ", npivDesiredPortWwns=" + npivDesiredPortWwns +
                ", npivTemporaryDisabled=" + npivTemporaryDisabled +
                ", npivOnNonRdmDisks=" + npivOnNonRdmDisks +
                ", locationId='" + locationId + '\'' +
                ", template=" + template +
                ", guestId=" + guestId +
                ", alternateGuestName='" + alternateGuestName + '\'' +
                ", annotation='" + annotation + '\'' +
                ", files=" + files +
                ", tools=" + tools +
                ", flags=" + flags +
                ", consolePreferences=" + consolePreferences +
                ", defaultPowerOps=" + defaultPowerOps +
                ", rebootPowerOff=" + rebootPowerOff +
                ", hardware=" + hardware +
                ", vcpuConfig=" + vcpuConfig +
                ", cpuAllocation=" + cpuAllocation +
                ", memoryAllocation=" + memoryAllocation +
                ", latencySensitivity=" + latencySensitivity +
                ", memoryHotAddEnabled=" + memoryHotAddEnabled +
                ", cpuHotAddEnabled=" + cpuHotAddEnabled +
                ", cpuHotRemoveEnabled=" + cpuHotRemoveEnabled +
                ", hotPlugMemoryLimit=" + hotPlugMemoryLimit +
                ", hotPlugMemoryIncrementSize=" + hotPlugMemoryIncrementSize +
                ", cpuAffinity=" + cpuAffinity +
                ", memoryAffinity=" + memoryAffinity +
                ", networkShaper=" + networkShaper +
                ", extraConfig=" + extraConfig +
                ", cpuFeatureMask=" + cpuFeatureMask +
                ", datastoreUrl=" + datastoreUrl +
                ", swapPlacement=" + swapPlacement +
                ", bootOptions=" + bootOptions +
                ", ftInfo=" + ftInfo +
                ", repConfig=" + repConfig +
                ", vAppConfig=" + vAppConfig +
                ", vAssertsEnabled=" + vAssertsEnabled +
                ", changeTrackingEnabled=" + changeTrackingEnabled +
                ", firmware=" + firmware +
                ", maxMksConnections=" + maxMksConnections +
                ", guestAutoLockEnabled=" + guestAutoLockEnabled +
                ", managedBy=" + managedBy +
                ", memoryReservationLockedToMax=" + memoryReservationLockedToMax +
                ", initialOverhead=" + initialOverhead +
                ", nestedHVEnabled=" + nestedHVEnabled +
                ", vPMCEnabled=" + vPMCEnabled +
                ", scheduledHardwareUpgradeInfo=" + scheduledHardwareUpgradeInfo +
                ", forkConfigInfo=" + forkConfigInfo +
                ", vFlashCacheReservation=" + vFlashCacheReservation +
                ", vmxConfigChecksum='" + vmxConfigChecksum + '\'' +
                ", messageBusTunnelEnabled=" + messageBusTunnelEnabled +
                ", vmStorageObjectId='" + vmStorageObjectId + '\'' +
                ", swapStorageObjectId='" + swapStorageObjectId + '\'' +
                ", keyId=" + keyId +
                ", guestIntegrityInfo=" + guestIntegrityInfo +
                ", migrateEncryption=" + migrateEncryption +
                ", sgxInfo=" + sgxInfo +
                ", contentLibItemInfo=" + contentLibItemInfo +
                ", ftEncryptionMode=" + ftEncryptionMode +
                ", guestMonitoringModeInfo=" + guestMonitoringModeInfo +
                ", sevEnabled=" + sevEnabled +
                ", numaInfo=" + numaInfo +
                ", pmemFailoverEnabled=" + pmemFailoverEnabled +
                ", vmxStatsCollectionEnabled=" + vmxStatsCollectionEnabled +
                ", vmOpNotificationToAppEnabled=" + vmOpNotificationToAppEnabled +
                ", vmOpNotificationTimeout=" + vmOpNotificationTimeout +
                ", deviceSwap=" + deviceSwap +
                ", pmem=" + pmem +
                ", deviceGroups=" + deviceGroups +
                ", fixedPassthruHotPlugEnabled=" + fixedPassthruHotPlugEnabled +
                '}';
    }

    public Boolean getFixedPassthruHotPlugEnabled() {
        return fixedPassthruHotPlugEnabled;
    }

    public void setFixedPassthruHotPlugEnabled(final Boolean fixedPassthruHotPlugEnabled) {
        this.fixedPassthruHotPlugEnabled = fixedPassthruHotPlugEnabled;
    }

    public String getChangeVersion() {
        return changeVersion;
    }

    public void setChangeVersion(final String changeVersion) {
        this.changeVersion = changeVersion;
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

    public String getGuestFullName() {
        return guestFullName;
    }

    public void setGuestFullName(final String guestFullName) {
        this.guestFullName = guestFullName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public Calendar getCreateDate() {
        return createDate;
    }

    public void setCreateDate(final Calendar createDate) {
        this.createDate = createDate;
    }

    public String getInstanceUuid() {
        return instanceUuid;
    }

    public void setInstanceUuid(final String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    public List<Long> getNpivNodeWorldWideName() {
        return npivNodeWorldWideName;
    }

    public void setNpivNodeWorldWideName(final List<Long> npivNodeWorldWideName) {
        this.npivNodeWorldWideName = npivNodeWorldWideName;
    }

    public List<Long> getNpivPortWorldWideName() {
        return npivPortWorldWideName;
    }

    public void setNpivPortWorldWideName(final List<Long> npivPortWorldWideName) {
        this.npivPortWorldWideName = npivPortWorldWideName;
    }

    public VirtualMachineConfigInfoNpivWwnType getNpivWorldWideNameType() {
        return npivWorldWideNameType;
    }

    public void setNpivWorldWideNameType(final VirtualMachineConfigInfoNpivWwnType npivWorldWideNameType) {
        this.npivWorldWideNameType = npivWorldWideNameType;
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

    public Boolean getNpivTemporaryDisabled() {
        return npivTemporaryDisabled;
    }

    public void setNpivTemporaryDisabled(final Boolean npivTemporaryDisabled) {
        this.npivTemporaryDisabled = npivTemporaryDisabled;
    }

    public Boolean getNpivOnNonRdmDisks() {
        return npivOnNonRdmDisks;
    }

    public void setNpivOnNonRdmDisks(final Boolean npivOnNonRdmDisks) {
        this.npivOnNonRdmDisks = npivOnNonRdmDisks;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(final String locationId) {
        this.locationId = locationId;
    }

    public boolean isTemplate() {
        return template;
    }

    public void setTemplate(final boolean template) {
        this.template = template;
    }

    public VirtualMachineGuestOsIdentifier getGuestId() {
        return guestId;
    }

    public void setGuestId(final VirtualMachineGuestOsIdentifier guestId) {
        this.guestId = guestId;
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

    public VirtualMachineFileInfo getFiles() {
        return files;
    }

    public void setFiles(final VirtualMachineFileInfo files) {
        this.files = files;
    }

    public ToolsConfigInfo getTools() {
        return tools;
    }

    public void setTools(final ToolsConfigInfo tools) {
        this.tools = tools;
    }

    public VirtualMachineFlagInfo getFlags() {
        return flags;
    }

    public void setFlags(final VirtualMachineFlagInfo flags) {
        this.flags = flags;
    }

    public VirtualMachineConsolePreferences getConsolePreferences() {
        return consolePreferences;
    }

    public void setConsolePreferences(final VirtualMachineConsolePreferences consolePreferences) {
        this.consolePreferences = consolePreferences;
    }

    public VirtualMachineDefaultPowerOpInfo getDefaultPowerOps() {
        return defaultPowerOps;
    }

    public void setDefaultPowerOps(final VirtualMachineDefaultPowerOpInfo defaultPowerOps) {
        this.defaultPowerOps = defaultPowerOps;
    }

    public Boolean getRebootPowerOff() {
        return rebootPowerOff;
    }

    public void setRebootPowerOff(final Boolean rebootPowerOff) {
        this.rebootPowerOff = rebootPowerOff;
    }

    public VirtualHardware getHardware() {
        return hardware;
    }

    public void setHardware(final VirtualHardware hardware) {
        this.hardware = hardware;
    }

    public List<VirtualMachineVcpuConfig> getVcpuConfig() {
        return vcpuConfig;
    }

    public void setVcpuConfig(final List<VirtualMachineVcpuConfig> vcpuConfig) {
        this.vcpuConfig = vcpuConfig;
    }

    public ResourceAllocationInfo getCpuAllocation() {
        return cpuAllocation;
    }

    public void setCpuAllocation(final ResourceAllocationInfo cpuAllocation) {
        this.cpuAllocation = cpuAllocation;
    }

    public ResourceAllocationInfo getMemoryAllocation() {
        return memoryAllocation;
    }

    public void setMemoryAllocation(final ResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }

    public LatencySensitivity getLatencySensitivity() {
        return latencySensitivity;
    }

    public void setLatencySensitivity(final LatencySensitivity latencySensitivity) {
        this.latencySensitivity = latencySensitivity;
    }

    public Boolean getMemoryHotAddEnabled() {
        return memoryHotAddEnabled;
    }

    public void setMemoryHotAddEnabled(final Boolean memoryHotAddEnabled) {
        this.memoryHotAddEnabled = memoryHotAddEnabled;
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

    public Long getHotPlugMemoryLimit() {
        return hotPlugMemoryLimit;
    }

    public void setHotPlugMemoryLimit(final Long hotPlugMemoryLimit) {
        this.hotPlugMemoryLimit = hotPlugMemoryLimit;
    }

    public Long getHotPlugMemoryIncrementSize() {
        return hotPlugMemoryIncrementSize;
    }

    public void setHotPlugMemoryIncrementSize(final Long hotPlugMemoryIncrementSize) {
        this.hotPlugMemoryIncrementSize = hotPlugMemoryIncrementSize;
    }

    public VirtualMachineAffinityInfo getCpuAffinity() {
        return cpuAffinity;
    }

    public void setCpuAffinity(final VirtualMachineAffinityInfo cpuAffinity) {
        this.cpuAffinity = cpuAffinity;
    }

    public VirtualMachineAffinityInfo getMemoryAffinity() {
        return memoryAffinity;
    }

    public void setMemoryAffinity(final VirtualMachineAffinityInfo memoryAffinity) {
        this.memoryAffinity = memoryAffinity;
    }

    public VirtualMachineNetworkShaperInfo getNetworkShaper() {
        return networkShaper;
    }

    public void setNetworkShaper(final VirtualMachineNetworkShaperInfo networkShaper) {
        this.networkShaper = networkShaper;
    }

    public List<OptionValue> getExtraConfig() {
        return extraConfig;
    }

    public void setExtraConfig(final List<OptionValue> extraConfig) {
        this.extraConfig = extraConfig;
    }

    public List<HostCpuIdInfo> getCpuFeatureMask() {
        return cpuFeatureMask;
    }

    public void setCpuFeatureMask(final List<HostCpuIdInfo> cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public List<VirtualMachineConfigInfoDatastoreUrlPair> getDatastoreUrl() {
        return datastoreUrl;
    }

    public void setDatastoreUrl(final List<VirtualMachineConfigInfoDatastoreUrlPair> datastoreUrl) {
        this.datastoreUrl = datastoreUrl;
    }

    public VirtualMachineConfigInfoSwapPlacementType getSwapPlacement() {
        return swapPlacement;
    }

    public void setSwapPlacement(final VirtualMachineConfigInfoSwapPlacementType swapPlacement) {
        this.swapPlacement = swapPlacement;
    }

    public VirtualMachineBootOptions getBootOptions() {
        return bootOptions;
    }

    public void setBootOptions(final VirtualMachineBootOptions bootOptions) {
        this.bootOptions = bootOptions;
    }

    public FaultToleranceConfigInfo getFtInfo() {
        return ftInfo;
    }

    public void setFtInfo(final FaultToleranceConfigInfo ftInfo) {
        this.ftInfo = ftInfo;
    }

    public ReplicationConfigSpec getRepConfig() {
        return repConfig;
    }

    public void setRepConfig(final ReplicationConfigSpec repConfig) {
        this.repConfig = repConfig;
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

    public Boolean getChangeTrackingEnabled() {
        return changeTrackingEnabled;
    }

    public void setChangeTrackingEnabled(final Boolean changeTrackingEnabled) {
        this.changeTrackingEnabled = changeTrackingEnabled;
    }

    public GuestOsDescriptorFirmwareType getFirmware() {
        return firmware;
    }

    public void setFirmware(final GuestOsDescriptorFirmwareType firmware) {
        this.firmware = firmware;
    }

    public Integer getMaxMksConnections() {
        return maxMksConnections;
    }

    public void setMaxMksConnections(final Integer maxMksConnections) {
        this.maxMksConnections = maxMksConnections;
    }

    public Boolean getGuestAutoLockEnabled() {
        return guestAutoLockEnabled;
    }

    public void setGuestAutoLockEnabled(final Boolean guestAutoLockEnabled) {
        this.guestAutoLockEnabled = guestAutoLockEnabled;
    }

    public ManagedByInfo getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(final ManagedByInfo managedBy) {
        this.managedBy = managedBy;
    }

    public Boolean getMemoryReservationLockedToMax() {
        return memoryReservationLockedToMax;
    }

    public void setMemoryReservationLockedToMax(final Boolean memoryReservationLockedToMax) {
        this.memoryReservationLockedToMax = memoryReservationLockedToMax;
    }

    public VirtualMachineConfigInfoOverheadInfo getInitialOverhead() {
        return initialOverhead;
    }

    public void setInitialOverhead(final VirtualMachineConfigInfoOverheadInfo initialOverhead) {
        this.initialOverhead = initialOverhead;
    }

    public Boolean getNestedHVEnabled() {
        return nestedHVEnabled;
    }

    public void setNestedHVEnabled(final Boolean nestedHVEnabled) {
        this.nestedHVEnabled = nestedHVEnabled;
    }

    public Boolean getvPMCEnabled() {
        return vPMCEnabled;
    }

    public void setvPMCEnabled(final Boolean vPMCEnabled) {
        this.vPMCEnabled = vPMCEnabled;
    }

    public ScheduledHardwareUpgradeInfo getScheduledHardwareUpgradeInfo() {
        return scheduledHardwareUpgradeInfo;
    }

    public void setScheduledHardwareUpgradeInfo(final ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo) {
        this.scheduledHardwareUpgradeInfo = scheduledHardwareUpgradeInfo;
    }

    public VirtualMachineForkConfigInfo getForkConfigInfo() {
        return forkConfigInfo;
    }

    public void setForkConfigInfo(final VirtualMachineForkConfigInfo forkConfigInfo) {
        this.forkConfigInfo = forkConfigInfo;
    }

    public Long getvFlashCacheReservation() {
        return vFlashCacheReservation;
    }

    public void setvFlashCacheReservation(final Long vFlashCacheReservation) {
        this.vFlashCacheReservation = vFlashCacheReservation;
    }

    public String getVmxConfigChecksum() {
        return vmxConfigChecksum;
    }

    public void setVmxConfigChecksum(final String vmxConfigChecksum) {
        this.vmxConfigChecksum = vmxConfigChecksum;
    }

    public Boolean getMessageBusTunnelEnabled() {
        return messageBusTunnelEnabled;
    }

    public void setMessageBusTunnelEnabled(final Boolean messageBusTunnelEnabled) {
        this.messageBusTunnelEnabled = messageBusTunnelEnabled;
    }

    public String getVmStorageObjectId() {
        return vmStorageObjectId;
    }

    public void setVmStorageObjectId(final String vmStorageObjectId) {
        this.vmStorageObjectId = vmStorageObjectId;
    }

    public String getSwapStorageObjectId() {
        return swapStorageObjectId;
    }

    public void setSwapStorageObjectId(final String swapStorageObjectId) {
        this.swapStorageObjectId = swapStorageObjectId;
    }

    public CryptoKeyId getKeyId() {
        return keyId;
    }

    public void setKeyId(final CryptoKeyId keyId) {
        this.keyId = keyId;
    }

    public VirtualMachineGuestIntegrityInfo getGuestIntegrityInfo() {
        return guestIntegrityInfo;
    }

    public void setGuestIntegrityInfo(final VirtualMachineGuestIntegrityInfo guestIntegrityInfo) {
        this.guestIntegrityInfo = guestIntegrityInfo;
    }

    public VirtualMachineConfigSpecEncryptedVMotionModes getMigrateEncryption() {
        return migrateEncryption;
    }

    public void setMigrateEncryption(final VirtualMachineConfigSpecEncryptedVMotionModes migrateEncryption) {
        this.migrateEncryption = migrateEncryption;
    }

    public VirtualMachineSgxInfo getSgxInfo() {
        return sgxInfo;
    }

    public void setSgxInfo(final VirtualMachineSgxInfo sgxInfo) {
        this.sgxInfo = sgxInfo;
    }

    public VirtualMachineContentLibraryItemInfo getContentLibItemInfo() {
        return contentLibItemInfo;
    }

    public void setContentLibItemInfo(final VirtualMachineContentLibraryItemInfo contentLibItemInfo) {
        this.contentLibItemInfo = contentLibItemInfo;
    }

    public VirtualMachineConfigSpecEncryptedFtModes getFtEncryptionMode() {
        return ftEncryptionMode;
    }

    public void setFtEncryptionMode(final VirtualMachineConfigSpecEncryptedFtModes ftEncryptionMode) {
        this.ftEncryptionMode = ftEncryptionMode;
    }

    public VirtualMachineGuestMonitoringModeInfo getGuestMonitoringModeInfo() {
        return guestMonitoringModeInfo;
    }

    public void setGuestMonitoringModeInfo(final VirtualMachineGuestMonitoringModeInfo guestMonitoringModeInfo) {
        this.guestMonitoringModeInfo = guestMonitoringModeInfo;
    }

    public Boolean getSevEnabled() {
        return sevEnabled;
    }

    public void setSevEnabled(final Boolean sevEnabled) {
        this.sevEnabled = sevEnabled;
    }

    public VirtualMachineVirtualNumaInfo getNumaInfo() {
        return numaInfo;
    }

    public void setNumaInfo(final VirtualMachineVirtualNumaInfo numaInfo) {
        this.numaInfo = numaInfo;
    }

    public Boolean getPmemFailoverEnabled() {
        return pmemFailoverEnabled;
    }

    public void setPmemFailoverEnabled(final Boolean pmemFailoverEnabled) {
        this.pmemFailoverEnabled = pmemFailoverEnabled;
    }

    public Boolean getVmxStatsCollectionEnabled() {
        return vmxStatsCollectionEnabled;
    }

    public void setVmxStatsCollectionEnabled(final Boolean vmxStatsCollectionEnabled) {
        this.vmxStatsCollectionEnabled = vmxStatsCollectionEnabled;
    }

    public Boolean getVmOpNotificationToAppEnabled() {
        return vmOpNotificationToAppEnabled;
    }

    public void setVmOpNotificationToAppEnabled(final Boolean vmOpNotificationToAppEnabled) {
        this.vmOpNotificationToAppEnabled = vmOpNotificationToAppEnabled;
    }

    public Long getVmOpNotificationTimeout() {
        return vmOpNotificationTimeout;
    }

    public void setVmOpNotificationTimeout(final Long vmOpNotificationTimeout) {
        this.vmOpNotificationTimeout = vmOpNotificationTimeout;
    }

    public VirtualMachineVirtualDeviceSwap getDeviceSwap() {
        return deviceSwap;
    }

    public void setDeviceSwap(final VirtualMachineVirtualDeviceSwap deviceSwap) {
        this.deviceSwap = deviceSwap;
    }

    public VirtualMachineVirtualPMem getPmem() {
        return pmem;
    }

    public void setPmem(final VirtualMachineVirtualPMem pmem) {
        this.pmem = pmem;
    }

    public VirtualMachineVirtualDeviceGroups getDeviceGroups() {
        return deviceGroups;
    }

    public void setDeviceGroups(final VirtualMachineVirtualDeviceGroups deviceGroups) {
        this.deviceGroups = deviceGroups;
    }

}
