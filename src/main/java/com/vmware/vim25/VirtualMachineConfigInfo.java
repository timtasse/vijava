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
 * @version 7.0
 */
public class VirtualMachineConfigInfo extends DynamicData {

    private String changeVersion;
    private Calendar modified;
    private String name;
    private String guestFullName;
    private String version;
    private String uuid;
    private Calendar createDate;
    private String instanceUuid;
    private long[] npivNodeWorldWideName;
    private long[] npivPortWorldWideName;
    private String npivWorldWideNameType;
    private Short npivDesiredNodeWwns;
    private Short npivDesiredPortWwns;
    private Boolean npivTemporaryDisabled;
    private Boolean npivOnNonRdmDisks;
    private String locationId;
    private boolean template;
    private String guestId;
    private String alternateGuestName;
    private String annotation;
    private VirtualMachineFileInfo files;
    private ToolsConfigInfo tools;
    private VirtualMachineFlagInfo flags;
    private VirtualMachineConsolePreferences consolePreferences;
    private VirtualMachineDefaultPowerOpInfo defaultPowerOps;
    private VirtualHardware hardware;
    private VirtualMachineVcpuConfig[] vcpuConfig;
    private ResourceAllocationInfo cpuAllocation;
    private ResourceAllocationInfo memoryAllocation;
    private LatencySensitivity latencySensitivity;
    private Boolean memoryHotAddEnabled;
    private Boolean cpuHotAddEnabled;
    private Boolean cpuHotRemoveEnabled;
    private Long hotPlugMemoryLimit;
    private Long hotPlugMemoryIncrementSize;
    private VirtualMachineAffinityInfo cpuAffinity;
    @Deprecated
    private VirtualMachineAffinityInfo memoryAffinity;
    @Deprecated
    private VirtualMachineNetworkShaperInfo networkShaper;
    private OptionValue[] extraConfig;
    private HostCpuIdInfo[] cpuFeatureMask;
    private VirtualMachineConfigInfoDatastoreUrlPair[] datastoreUrl;
    private String swapPlacement;
    private VirtualMachineBootOptions bootOptions;
    private FaultToleranceConfigInfo ftInfo;
    private ReplicationConfigSpec repConfig;
    private VmConfigInfo vAppConfig;
    private Boolean vAssertsEnabled;
    private Boolean changeTrackingEnabled;
    private String firmware;
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
    private byte[] vmxConfigChecksum;
    private Boolean messageBusTunnelEnabled;
    private String vmStorageObjectId;
    private String swapStorageObjectId;
    private CryptoKeyId keyId;
    private VirtualMachineGuestIntegrityInfo guestIntegrityInfo;
    private String migrateEncryption;
    private VirtualMachineSgxInfo sgxInfo;
    private VirtualMachineContentLibraryItemInfo contentLibItemInfo;
    private VirtualMachineGuestMonitoringModeInfo guestMonitoringModeInfo;
    private Boolean sevEnabled;

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
                ", npivNodeWorldWideName=" + Arrays.toString(npivNodeWorldWideName) +
                ", npivPortWorldWideName=" + Arrays.toString(npivPortWorldWideName) +
                ", npivWorldWideNameType='" + npivWorldWideNameType + '\'' +
                ", npivDesiredNodeWwns=" + npivDesiredNodeWwns +
                ", npivDesiredPortWwns=" + npivDesiredPortWwns +
                ", npivTemporaryDisabled=" + npivTemporaryDisabled +
                ", npivOnNonRdmDisks=" + npivOnNonRdmDisks +
                ", locationId='" + locationId + '\'' +
                ", template=" + template +
                ", guestId='" + guestId + '\'' +
                ", alternateGuestName='" + alternateGuestName + '\'' +
                ", annotation='" + annotation + '\'' +
                ", files=" + files +
                ", tools=" + tools +
                ", flags=" + flags +
                ", consolePreferences=" + consolePreferences +
                ", defaultPowerOps=" + defaultPowerOps +
                ", hardware=" + hardware +
                ", vcpuConfig=" + Arrays.toString(vcpuConfig) +
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
                ", extraConfig=" + Arrays.toString(extraConfig) +
                ", cpuFeatureMask=" + Arrays.toString(cpuFeatureMask) +
                ", datastoreUrl=" + Arrays.toString(datastoreUrl) +
                ", swapPlacement='" + swapPlacement + '\'' +
                ", bootOptions=" + bootOptions +
                ", ftInfo=" + ftInfo +
                ", repConfig=" + repConfig +
                ", vAppConfig=" + vAppConfig +
                ", vAssertsEnabled=" + vAssertsEnabled +
                ", changeTrackingEnabled=" + changeTrackingEnabled +
                ", firmware='" + firmware + '\'' +
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
                ", vmxConfigChecksum=" + Arrays.toString(vmxConfigChecksum) +
                ", messageBusTunnelEnabled=" + messageBusTunnelEnabled +
                ", vmStorageObjectId='" + vmStorageObjectId + '\'' +
                ", swapStorageObjectId='" + swapStorageObjectId + '\'' +
                ", keyId=" + keyId +
                ", guestIntegrityInfo=" + guestIntegrityInfo +
                ", migrateEncryption='" + migrateEncryption + '\'' +
                ", sgxInfo=" + sgxInfo +
                ", contentLibItemInfo=" + contentLibItemInfo +
                ", guestMonitoringModeInfo=" + guestMonitoringModeInfo +
                ", sevEnabled=" + sevEnabled +
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

    public VirtualMachineVcpuConfig[] getVcpuConfig() {
        return vcpuConfig;
    }

    public void setVcpuConfig(final VirtualMachineVcpuConfig[] vcpuConfig) {
        this.vcpuConfig = vcpuConfig;
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

}
