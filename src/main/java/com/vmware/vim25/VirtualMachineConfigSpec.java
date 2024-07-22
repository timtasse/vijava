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
 * This data object type encapsulates configuration settings when creating or reconfiguring a virtual machine.
 * To support incremental changes, these properties are all optional.
 * If an optional property is unset, or any nested optional property is unset, the property will not be changed unless 'unset' is a valid value for the property.
 * To determine whether 'unset' is a valid value for a particular property, refer to the documentation for that property.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualMachineConfigSpec extends DynamicData {

    private String changeVersion;
    private String name;
    private String version;
    private Calendar createDate;
    private String uuid;
    private String instanceUuid;
    private List<Long> npivNodeWorldWideName = List.of();
    private List<Long> npivPortWorldWideName = List.of();
    private VirtualMachineConfigInfoNpivWwnType npivWorldWideNameType;
    private Short npivDesiredNodeWwns;
    private Short npivDesiredPortWwns;
    private Boolean npivTemporaryDisabled;
    private Boolean npivOnNonRdmDisks;
    private VirtualMachineConfigSpecNpivWwnOp npivWorldWideNameOp;
    private String locationId;
    private VirtualMachineGuestOsIdentifier guestId;
    private String alternateGuestName;
    private String annotation;
    private VirtualMachineFileInfo files;
    private ToolsConfigInfo tools;
    private VirtualMachineFlagInfo flags;
    private VirtualMachineConsolePreferences consolePreferences;
    private VirtualMachineDefaultPowerOpInfo powerOpInfo;
    private Boolean rebootPowerOff;
    private Integer numCPUs;
    private List<VirtualMachineVcpuConfig> vcpuConfig = List.of();
    private Integer numCoresPerSocket;
    private Long memoryMB;
    private Boolean memoryHotAddEnabled;
    private Boolean cpuHotAddEnabled;
    private Boolean cpuHotRemoveEnabled;
    private Boolean virtualICH7MPresent;
    private Boolean virtualSMCPresent;
    private List<VirtualDeviceConfigSpec> deviceChange = List.of();
    private ResourceAllocationInfo cpuAllocation;
    private ResourceAllocationInfo memoryAllocation;
    private LatencySensitivity latencySensitivity;
    private VirtualMachineAffinityInfo cpuAffinity;
    /**
     * @deprecated since vSphere 6.0
     */
    @Deprecated
    private VirtualMachineAffinityInfo memoryAffinity;
    /**
     * @deprecated from vSphere 5.5, shaping policy on VM is not supported
     */
    @Deprecated
    private VirtualMachineNetworkShaperInfo networkShaper;
    private List<VirtualMachineCpuIdInfoSpec> cpuFeatureMask = List.of();
    private List<OptionValue> extraConfig = List.of();
    private VirtualMachineConfigInfoSwapPlacementType swapPlacement;
    private VirtualMachineBootOptions bootOptions;
    private VmConfigSpec vAppConfig;
    private FaultToleranceConfigInfo ftInfo;
    private ReplicationConfigSpec repConfig;
    private Boolean vAppConfigRemoved;
    private Boolean vAssertsEnabled;
    private Boolean changeTrackingEnabled;
    private GuestOsDescriptorFirmwareType firmware;
    private Integer maxMksConnections;
    private Boolean guestAutoLockEnabled;
    private ManagedByInfo managedBy;
    private Boolean memoryReservationLockedToMax;
    private Boolean nestedHVEnabled;
    private Boolean vPMCEnabled;
    private ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo;
    private List<VirtualMachineProfileSpec> vmProfile = List.of();
    private Boolean messageBusTunnelEnabled;
    private CryptoSpec crypto;
    private VirtualMachineConfigSpecEncryptedVMotionModes migrateEncryption;
    private VirtualMachineSgxInfo sgxInfo;
    private VirtualMachineConfigSpecEncryptedFtModes ftEncryptionMode;
    private VirtualMachineGuestMonitoringModeInfo guestMonitoringModeInfo;
    private Boolean sevEnabled;
    private VirtualMachineVirtualNuma virtualNuma;
    private VirtualHardwareMotherboardLayout motherboardLayout;
    private Boolean pmemFailoverEnabled;
    private Boolean vmxStatsCollectionEnabled;
    private Boolean vmOpNotificationToAppEnabled;
    private Long vmOpNotificationTimeout;
    private VirtualMachineVirtualDeviceSwap deviceSwap;
    private Integer simultaneousThreads;
    private VirtualMachineVirtualPMem pmem;
    private VirtualMachineVirtualDeviceGroups deviceGroups;

    @Override
    public String toString() {
        return "VirtualMachineConfigSpec{" +
                "changeVersion='" + changeVersion + '\'' +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", createDate=" + createDate +
                ", uuid='" + uuid + '\'' +
                ", instanceUuid='" + instanceUuid + '\'' +
                ", npivNodeWorldWideName=" + npivNodeWorldWideName +
                ", npivPortWorldWideName=" + npivPortWorldWideName +
                ", npivWorldWideNameType=" + npivWorldWideNameType +
                ", npivDesiredNodeWwns=" + npivDesiredNodeWwns +
                ", npivDesiredPortWwns=" + npivDesiredPortWwns +
                ", npivTemporaryDisabled=" + npivTemporaryDisabled +
                ", npivOnNonRdmDisks=" + npivOnNonRdmDisks +
                ", npivWorldWideNameOp=" + npivWorldWideNameOp +
                ", locationId='" + locationId + '\'' +
                ", guestId=" + guestId +
                ", alternateGuestName='" + alternateGuestName + '\'' +
                ", annotation='" + annotation + '\'' +
                ", files=" + files +
                ", tools=" + tools +
                ", flags=" + flags +
                ", consolePreferences=" + consolePreferences +
                ", powerOpInfo=" + powerOpInfo +
                ", rebootPowerOff=" + rebootPowerOff +
                ", numCPUs=" + numCPUs +
                ", vcpuConfig=" + vcpuConfig +
                ", numCoresPerSocket=" + numCoresPerSocket +
                ", memoryMB=" + memoryMB +
                ", memoryHotAddEnabled=" + memoryHotAddEnabled +
                ", cpuHotAddEnabled=" + cpuHotAddEnabled +
                ", cpuHotRemoveEnabled=" + cpuHotRemoveEnabled +
                ", virtualICH7MPresent=" + virtualICH7MPresent +
                ", virtualSMCPresent=" + virtualSMCPresent +
                ", deviceChange=" + deviceChange +
                ", cpuAllocation=" + cpuAllocation +
                ", memoryAllocation=" + memoryAllocation +
                ", latencySensitivity=" + latencySensitivity +
                ", cpuAffinity=" + cpuAffinity +
                ", memoryAffinity=" + memoryAffinity +
                ", networkShaper=" + networkShaper +
                ", cpuFeatureMask=" + cpuFeatureMask +
                ", extraConfig=" + extraConfig +
                ", swapPlacement=" + swapPlacement +
                ", bootOptions=" + bootOptions +
                ", vAppConfig=" + vAppConfig +
                ", ftInfo=" + ftInfo +
                ", repConfig=" + repConfig +
                ", vAppConfigRemoved=" + vAppConfigRemoved +
                ", vAssertsEnabled=" + vAssertsEnabled +
                ", changeTrackingEnabled=" + changeTrackingEnabled +
                ", firmware=" + firmware +
                ", maxMksConnections=" + maxMksConnections +
                ", guestAutoLockEnabled=" + guestAutoLockEnabled +
                ", managedBy=" + managedBy +
                ", memoryReservationLockedToMax=" + memoryReservationLockedToMax +
                ", nestedHVEnabled=" + nestedHVEnabled +
                ", vPMCEnabled=" + vPMCEnabled +
                ", scheduledHardwareUpgradeInfo=" + scheduledHardwareUpgradeInfo +
                ", vmProfile=" + vmProfile +
                ", messageBusTunnelEnabled=" + messageBusTunnelEnabled +
                ", crypto=" + crypto +
                ", migrateEncryption=" + migrateEncryption +
                ", sgxInfo=" + sgxInfo +
                ", ftEncryptionMode=" + ftEncryptionMode +
                ", guestMonitoringModeInfo=" + guestMonitoringModeInfo +
                ", sevEnabled=" + sevEnabled +
                ", virtualNuma=" + virtualNuma +
                ", motherboardLayout=" + motherboardLayout +
                ", pmemFailoverEnabled=" + pmemFailoverEnabled +
                ", vmxStatsCollectionEnabled=" + vmxStatsCollectionEnabled +
                ", vmOpNotificationToAppEnabled=" + vmOpNotificationToAppEnabled +
                ", vmOpNotificationTimeout=" + vmOpNotificationTimeout +
                ", deviceSwap=" + deviceSwap +
                ", simultaneousThreads=" + simultaneousThreads +
                ", pmem=" + pmem +
                ", deviceGroups=" + deviceGroups +
                '}';
    }

    public String getChangeVersion() {
        return changeVersion;
    }

    public void setChangeVersion(final String changeVersion) {
        this.changeVersion = changeVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public Calendar getCreateDate() {
        return createDate;
    }

    public void setCreateDate(final Calendar createDate) {
        this.createDate = createDate;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
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

    public VirtualMachineConfigSpecNpivWwnOp getNpivWorldWideNameOp() {
        return npivWorldWideNameOp;
    }

    public void setNpivWorldWideNameOp(final VirtualMachineConfigSpecNpivWwnOp npivWorldWideNameOp) {
        this.npivWorldWideNameOp = npivWorldWideNameOp;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(final String locationId) {
        this.locationId = locationId;
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

    public VirtualMachineDefaultPowerOpInfo getPowerOpInfo() {
        return powerOpInfo;
    }

    public void setPowerOpInfo(final VirtualMachineDefaultPowerOpInfo powerOpInfo) {
        this.powerOpInfo = powerOpInfo;
    }

    public Boolean getRebootPowerOff() {
        return rebootPowerOff;
    }

    public void setRebootPowerOff(final Boolean rebootPowerOff) {
        this.rebootPowerOff = rebootPowerOff;
    }

    public Integer getNumCPUs() {
        return numCPUs;
    }

    public void setNumCPUs(final Integer numCPUs) {
        this.numCPUs = numCPUs;
    }

    public List<VirtualMachineVcpuConfig> getVcpuConfig() {
        return vcpuConfig;
    }

    public void setVcpuConfig(final List<VirtualMachineVcpuConfig> vcpuConfig) {
        this.vcpuConfig = vcpuConfig;
    }

    public Integer getNumCoresPerSocket() {
        return numCoresPerSocket;
    }

    public void setNumCoresPerSocket(final Integer numCoresPerSocket) {
        this.numCoresPerSocket = numCoresPerSocket;
    }

    public Long getMemoryMB() {
        return memoryMB;
    }

    public void setMemoryMB(final Long memoryMB) {
        this.memoryMB = memoryMB;
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

    public Boolean getVirtualICH7MPresent() {
        return virtualICH7MPresent;
    }

    public void setVirtualICH7MPresent(final Boolean virtualICH7MPresent) {
        this.virtualICH7MPresent = virtualICH7MPresent;
    }

    public Boolean getVirtualSMCPresent() {
        return virtualSMCPresent;
    }

    public void setVirtualSMCPresent(final Boolean virtualSMCPresent) {
        this.virtualSMCPresent = virtualSMCPresent;
    }

    public List<VirtualDeviceConfigSpec> getDeviceChange() {
        return deviceChange;
    }

    public void setDeviceChange(final List<VirtualDeviceConfigSpec> deviceChange) {
        this.deviceChange = deviceChange;
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

    public List<VirtualMachineCpuIdInfoSpec> getCpuFeatureMask() {
        return cpuFeatureMask;
    }

    public void setCpuFeatureMask(final List<VirtualMachineCpuIdInfoSpec> cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public List<OptionValue> getExtraConfig() {
        return extraConfig;
    }

    public void setExtraConfig(final List<OptionValue> extraConfig) {
        this.extraConfig = extraConfig;
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

    public VmConfigSpec getvAppConfig() {
        return vAppConfig;
    }

    public void setvAppConfig(final VmConfigSpec vAppConfig) {
        this.vAppConfig = vAppConfig;
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

    public Boolean getvAppConfigRemoved() {
        return vAppConfigRemoved;
    }

    public void setvAppConfigRemoved(final Boolean vAppConfigRemoved) {
        this.vAppConfigRemoved = vAppConfigRemoved;
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

    public List<VirtualMachineProfileSpec> getVmProfile() {
        return vmProfile;
    }

    public void setVmProfile(final List<VirtualMachineProfileSpec> vmProfile) {
        this.vmProfile = vmProfile;
    }

    public Boolean getMessageBusTunnelEnabled() {
        return messageBusTunnelEnabled;
    }

    public void setMessageBusTunnelEnabled(final Boolean messageBusTunnelEnabled) {
        this.messageBusTunnelEnabled = messageBusTunnelEnabled;
    }

    public CryptoSpec getCrypto() {
        return crypto;
    }

    public void setCrypto(final CryptoSpec crypto) {
        this.crypto = crypto;
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

    public VirtualMachineVirtualNuma getVirtualNuma() {
        return virtualNuma;
    }

    public void setVirtualNuma(final VirtualMachineVirtualNuma virtualNuma) {
        this.virtualNuma = virtualNuma;
    }

    public VirtualHardwareMotherboardLayout getMotherboardLayout() {
        return motherboardLayout;
    }

    public void setMotherboardLayout(final VirtualHardwareMotherboardLayout motherboardLayout) {
        this.motherboardLayout = motherboardLayout;
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

    public Integer getSimultaneousThreads() {
        return simultaneousThreads;
    }

    public void setSimultaneousThreads(final Integer simultaneousThreads) {
        this.simultaneousThreads = simultaneousThreads;
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
