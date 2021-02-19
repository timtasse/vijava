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
 * This data object type encapsulates a typical set of host configuration information that is useful for displaying and configuring a host.
 * VirtualCenter can retrieve this set of information very efficiently even for a large set of hosts.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 7.0
 */
public class HostConfigInfo extends DynamicData {

    private ManagedObjectReference host;
    private AboutInfo product;
    private HostDeploymentInfo deploymentInfo;
    private HostHyperThreadScheduleInfo hyperThread;
    private ServiceConsoleReservationInfo consoleReservation;
    private VirtualMachineMemoryReservationInfo virtualMachineReservation;
    private HostStorageDeviceInfo storageDevice;
    private HostMultipathStateInfo multipathState;
    private HostFileSystemVolumeInfo fileSystemVolume;
    private String[] systemFile;
    private HostNetworkInfo network;
    @Deprecated
    private HostVMotionInfo vmotion;
    private HostVirtualNicManagerInfo virtualNicManagerInfo;
    private HostNetCapabilities capabilities;
    private HostDatastoreSystemCapabilities datastoreCapabilities;
    @Deprecated
    private HostNetOffloadCapabilities offloadCapabilities;
    private HostServiceInfo service;
    private HostFirewallInfo firewall;
    private HostAutoStartManagerConfig autoStart;
    private HostDiagnosticPartition activeDiagnosticPartition;
    private OptionValue[] option;
    private OptionDef[] optionDef;
    private String datastorePrincipal;
    private ManagedObjectReference localSwapDatastore;
    private HostSystemSwapConfiguration systemSwapConfiguration;
    private HostSystemResourceInfo systemResources;
    private HostDateTimeInfo dateTimeInfo;
    private HostFlagInfo flags;
    @Deprecated
    private Boolean adminDisabled;
    private HostLockdownMode lockdownMode;
    private HostIpmiInfo ipmi;
    @Deprecated
    private HostSslThumbprintInfo sslThumbprintInfo;
    private HostSslThumbprintInfo[] sslThumbprintData;
    private byte[] certificate;
    private HostPciPassthruInfo[] pciPassthruInfo;
    private HostAuthenticationManagerInfo authenticationManagerInfo;
    private HostFeatureVersionInfo[] featureVersion;
    private PowerSystemCapability powerSystemCapability;
    private PowerSystemInfo powerSystemInfo;
    private HostCacheConfigurationInfo[] cacheConfigurationInfo;
    private Boolean wakeOnLanCapable;
    private HostFeatureCapability[] featureCapability;
    private HostFeatureCapability[] maskedFeatureCapability;
    private HostVFlashManagerVFlashConfigInfo vFlashConfigInfo;
    private VsanHostConfigInfo vsanHostConfig;
    private String[] domainList;
    private byte[] scriptCheckSum;
    private byte[] hostConfigCheckSum;
    private byte[] descriptionTreeCheckSum;
    private HostGraphicsInfo[] graphicsInfo;
    private String[] sharedPassthruGpuTypes;
    private HostGraphicsConfig graphicsConfig;
    private HostSharedGpuCapabilities[] sharedGpuCapabilities;
    private HostIoFilterInfo[] ioFilterInfo;
    private HostSriovDevicePoolInfo[] sriovDevicePool;
    private HostAssignableHardwareBinding assignableHardwareBinding;
    private HostAssignableHardwareConfig assignableHardwareConfig;

    @Override
    public String toString() {
        return "HostConfigInfo{" +
                "host=" + host +
                ", product=" + product +
                ", deploymentInfo=" + deploymentInfo +
                ", hyperThread=" + hyperThread +
                ", consoleReservation=" + consoleReservation +
                ", virtualMachineReservation=" + virtualMachineReservation +
                ", storageDevice=" + storageDevice +
                ", multipathState=" + multipathState +
                ", fileSystemVolume=" + fileSystemVolume +
                ", systemFile=" + Arrays.toString(systemFile) +
                ", network=" + network +
                ", vmotion=" + vmotion +
                ", virtualNicManagerInfo=" + virtualNicManagerInfo +
                ", capabilities=" + capabilities +
                ", datastoreCapabilities=" + datastoreCapabilities +
                ", offloadCapabilities=" + offloadCapabilities +
                ", service=" + service +
                ", firewall=" + firewall +
                ", autoStart=" + autoStart +
                ", activeDiagnosticPartition=" + activeDiagnosticPartition +
                ", option=" + Arrays.toString(option) +
                ", optionDef=" + Arrays.toString(optionDef) +
                ", datastorePrincipal='" + datastorePrincipal + '\'' +
                ", localSwapDatastore=" + localSwapDatastore +
                ", systemSwapConfiguration=" + systemSwapConfiguration +
                ", systemResources=" + systemResources +
                ", dateTimeInfo=" + dateTimeInfo +
                ", flags=" + flags +
                ", adminDisabled=" + adminDisabled +
                ", lockdownMode=" + lockdownMode +
                ", ipmi=" + ipmi +
                ", sslThumbprintInfo=" + sslThumbprintInfo +
                ", sslThumbprintData=" + Arrays.toString(sslThumbprintData) +
                ", certificate=" + Arrays.toString(certificate) +
                ", pciPassthruInfo=" + Arrays.toString(pciPassthruInfo) +
                ", authenticationManagerInfo=" + authenticationManagerInfo +
                ", featureVersion=" + Arrays.toString(featureVersion) +
                ", powerSystemCapability=" + powerSystemCapability +
                ", powerSystemInfo=" + powerSystemInfo +
                ", cacheConfigurationInfo=" + Arrays.toString(cacheConfigurationInfo) +
                ", wakeOnLanCapable=" + wakeOnLanCapable +
                ", featureCapability=" + Arrays.toString(featureCapability) +
                ", maskedFeatureCapability=" + Arrays.toString(maskedFeatureCapability) +
                ", vFlashConfigInfo=" + vFlashConfigInfo +
                ", vsanHostConfig=" + vsanHostConfig +
                ", domainList=" + Arrays.toString(domainList) +
                ", scriptCheckSum=" + Arrays.toString(scriptCheckSum) +
                ", hostConfigCheckSum=" + Arrays.toString(hostConfigCheckSum) +
                ", descriptionTreeCheckSum=" + Arrays.toString(descriptionTreeCheckSum) +
                ", graphicsInfo=" + Arrays.toString(graphicsInfo) +
                ", sharedPassthruGpuTypes=" + Arrays.toString(sharedPassthruGpuTypes) +
                ", graphicsConfig=" + graphicsConfig +
                ", sharedGpuCapabilities=" + Arrays.toString(sharedGpuCapabilities) +
                ", ioFilterInfo=" + Arrays.toString(ioFilterInfo) +
                ", sriovDevicePool=" + Arrays.toString(sriovDevicePool) +
                ", assignableHardwareBinding=" + assignableHardwareBinding +
                ", assignableHardwareConfig=" + assignableHardwareConfig +
                "} " + super.toString();
    }

    public HostDiagnosticPartition getActiveDiagnosticPartition() {
        return activeDiagnosticPartition;
    }

    public void setActiveDiagnosticPartition(final HostDiagnosticPartition activeDiagnosticPartition) {
        this.activeDiagnosticPartition = activeDiagnosticPartition;
    }

    public Boolean getAdminDisabled() {
        return adminDisabled;
    }

    public void setAdminDisabled(final Boolean adminDisabled) {
        this.adminDisabled = adminDisabled;
    }

    public HostAuthenticationManagerInfo getAuthenticationManagerInfo() {
        return authenticationManagerInfo;
    }

    public void setAuthenticationManagerInfo(final HostAuthenticationManagerInfo authenticationManagerInfo) {
        this.authenticationManagerInfo = authenticationManagerInfo;
    }

    public HostAutoStartManagerConfig getAutoStart() {
        return autoStart;
    }

    public void setAutoStart(final HostAutoStartManagerConfig autoStart) {
        this.autoStart = autoStart;
    }

    public HostCacheConfigurationInfo[] getCacheConfigurationInfo() {
        return cacheConfigurationInfo;
    }

    public void setCacheConfigurationInfo(final HostCacheConfigurationInfo[] cacheConfigurationInfo) {
        this.cacheConfigurationInfo = cacheConfigurationInfo;
    }

    public HostNetCapabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(final HostNetCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    public byte[] getCertificate() {
        return certificate;
    }

    public void setCertificate(final byte[] certificate) {
        this.certificate = certificate;
    }

    public ServiceConsoleReservationInfo getConsoleReservation() {
        return consoleReservation;
    }

    public void setConsoleReservation(final ServiceConsoleReservationInfo consoleReservation) {
        this.consoleReservation = consoleReservation;
    }

    public HostDatastoreSystemCapabilities getDatastoreCapabilities() {
        return datastoreCapabilities;
    }

    public void setDatastoreCapabilities(final HostDatastoreSystemCapabilities datastoreCapabilities) {
        this.datastoreCapabilities = datastoreCapabilities;
    }

    public String getDatastorePrincipal() {
        return datastorePrincipal;
    }

    public void setDatastorePrincipal(final String datastorePrincipal) {
        this.datastorePrincipal = datastorePrincipal;
    }

    public HostDateTimeInfo getDateTimeInfo() {
        return dateTimeInfo;
    }

    public void setDateTimeInfo(final HostDateTimeInfo dateTimeInfo) {
        this.dateTimeInfo = dateTimeInfo;
    }

    public HostDeploymentInfo getDeploymentInfo() {
        return deploymentInfo;
    }

    public void setDeploymentInfo(final HostDeploymentInfo deploymentInfo) {
        this.deploymentInfo = deploymentInfo;
    }

    public String[] getDomainList() {
        return domainList;
    }

    public void setDomainList(final String[] domainList) {
        this.domainList = domainList;
    }

    public HostFeatureCapability[] getFeatureCapability() {
        return featureCapability;
    }

    public void setFeatureCapability(final HostFeatureCapability[] featureCapability) {
        this.featureCapability = featureCapability;
    }

    public HostFeatureVersionInfo[] getFeatureVersion() {
        return featureVersion;
    }

    public void setFeatureVersion(final HostFeatureVersionInfo[] featureVersion) {
        this.featureVersion = featureVersion;
    }

    public HostFileSystemVolumeInfo getFileSystemVolume() {
        return fileSystemVolume;
    }

    public void setFileSystemVolume(final HostFileSystemVolumeInfo fileSystemVolume) {
        this.fileSystemVolume = fileSystemVolume;
    }

    public HostFirewallInfo getFirewall() {
        return firewall;
    }

    public void setFirewall(final HostFirewallInfo firewall) {
        this.firewall = firewall;
    }

    public HostFlagInfo getFlags() {
        return flags;
    }

    public void setFlags(final HostFlagInfo flags) {
        this.flags = flags;
    }

    public HostGraphicsConfig getGraphicsConfig() {
        return graphicsConfig;
    }

    public void setGraphicsConfig(final HostGraphicsConfig graphicsConfig) {
        this.graphicsConfig = graphicsConfig;
    }

    public HostGraphicsInfo[] getGraphicsInfo() {
        return graphicsInfo;
    }

    public void setGraphicsInfo(final HostGraphicsInfo[] graphicsInfo) {
        this.graphicsInfo = graphicsInfo;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public byte[] getHostConfigCheckSum() {
        return hostConfigCheckSum;
    }

    public void setHostConfigCheckSum(final byte[] hostConfigCheckSum) {
        this.hostConfigCheckSum = hostConfigCheckSum;
    }

    public HostHyperThreadScheduleInfo getHyperThread() {
        return hyperThread;
    }

    public void setHyperThread(final HostHyperThreadScheduleInfo hyperThread) {
        this.hyperThread = hyperThread;
    }

    public HostIoFilterInfo[] getIoFilterInfo() {
        return ioFilterInfo;
    }

    public void setIoFilterInfo(final HostIoFilterInfo[] ioFilterInfo) {
        this.ioFilterInfo = ioFilterInfo;
    }

    public HostIpmiInfo getIpmi() {
        return ipmi;
    }

    public void setIpmi(final HostIpmiInfo ipmi) {
        this.ipmi = ipmi;
    }

    public ManagedObjectReference getLocalSwapDatastore() {
        return localSwapDatastore;
    }

    public void setLocalSwapDatastore(final ManagedObjectReference localSwapDatastore) {
        this.localSwapDatastore = localSwapDatastore;
    }

    public HostLockdownMode getLockdownMode() {
        return lockdownMode;
    }

    public void setLockdownMode(final HostLockdownMode lockdownMode) {
        this.lockdownMode = lockdownMode;
    }

    public HostFeatureCapability[] getMaskedFeatureCapability() {
        return maskedFeatureCapability;
    }

    public void setMaskedFeatureCapability(final HostFeatureCapability[] maskedFeatureCapability) {
        this.maskedFeatureCapability = maskedFeatureCapability;
    }

    public HostMultipathStateInfo getMultipathState() {
        return multipathState;
    }

    public void setMultipathState(final HostMultipathStateInfo multipathState) {
        this.multipathState = multipathState;
    }

    public HostNetworkInfo getNetwork() {
        return network;
    }

    public void setNetwork(final HostNetworkInfo network) {
        this.network = network;
    }

    public HostNetOffloadCapabilities getOffloadCapabilities() {
        return offloadCapabilities;
    }

    public void setOffloadCapabilities(final HostNetOffloadCapabilities offloadCapabilities) {
        this.offloadCapabilities = offloadCapabilities;
    }

    public OptionValue[] getOption() {
        return option;
    }

    public void setOption(final OptionValue[] option) {
        this.option = option;
    }

    public OptionDef[] getOptionDef() {
        return optionDef;
    }

    public void setOptionDef(final OptionDef[] optionDef) {
        this.optionDef = optionDef;
    }

    public HostPciPassthruInfo[] getPciPassthruInfo() {
        return pciPassthruInfo;
    }

    public void setPciPassthruInfo(final HostPciPassthruInfo[] pciPassthruInfo) {
        this.pciPassthruInfo = pciPassthruInfo;
    }

    public PowerSystemCapability getPowerSystemCapability() {
        return powerSystemCapability;
    }

    public void setPowerSystemCapability(final PowerSystemCapability powerSystemCapability) {
        this.powerSystemCapability = powerSystemCapability;
    }

    public PowerSystemInfo getPowerSystemInfo() {
        return powerSystemInfo;
    }

    public void setPowerSystemInfo(final PowerSystemInfo powerSystemInfo) {
        this.powerSystemInfo = powerSystemInfo;
    }

    public AboutInfo getProduct() {
        return product;
    }

    public void setProduct(final AboutInfo product) {
        this.product = product;
    }

    public byte[] getScriptCheckSum() {
        return scriptCheckSum;
    }

    public void setScriptCheckSum(final byte[] scriptCheckSum) {
        this.scriptCheckSum = scriptCheckSum;
    }

    public HostServiceInfo getService() {
        return service;
    }

    public void setService(final HostServiceInfo service) {
        this.service = service;
    }

    public HostSharedGpuCapabilities[] getSharedGpuCapabilities() {
        return sharedGpuCapabilities;
    }

    public void setSharedGpuCapabilities(final HostSharedGpuCapabilities[] sharedGpuCapabilities) {
        this.sharedGpuCapabilities = sharedGpuCapabilities;
    }

    public String[] getSharedPassthruGpuTypes() {
        return sharedPassthruGpuTypes;
    }

    public void setSharedPassthruGpuTypes(final String[] sharedPassthruGpuTypes) {
        this.sharedPassthruGpuTypes = sharedPassthruGpuTypes;
    }

    public HostSriovDevicePoolInfo[] getSriovDevicePool() {
        return sriovDevicePool;
    }

    public void setSriovDevicePool(final HostSriovDevicePoolInfo[] sriovDevicePool) {
        this.sriovDevicePool = sriovDevicePool;
    }

    public HostSslThumbprintInfo[] getSslThumbprintData() {
        return sslThumbprintData;
    }

    public void setSslThumbprintData(final HostSslThumbprintInfo[] sslThumbprintData) {
        this.sslThumbprintData = sslThumbprintData;
    }

    public HostSslThumbprintInfo getSslThumbprintInfo() {
        return sslThumbprintInfo;
    }

    public void setSslThumbprintInfo(final HostSslThumbprintInfo sslThumbprintInfo) {
        this.sslThumbprintInfo = sslThumbprintInfo;
    }

    public HostStorageDeviceInfo getStorageDevice() {
        return storageDevice;
    }

    public void setStorageDevice(final HostStorageDeviceInfo storageDevice) {
        this.storageDevice = storageDevice;
    }

    public String[] getSystemFile() {
        return systemFile;
    }

    public void setSystemFile(final String[] systemFile) {
        this.systemFile = systemFile;
    }

    public HostSystemResourceInfo getSystemResources() {
        return systemResources;
    }

    public void setSystemResources(final HostSystemResourceInfo systemResources) {
        this.systemResources = systemResources;
    }

    public HostSystemSwapConfiguration getSystemSwapConfiguration() {
        return systemSwapConfiguration;
    }

    public void setSystemSwapConfiguration(final HostSystemSwapConfiguration systemSwapConfiguration) {
        this.systemSwapConfiguration = systemSwapConfiguration;
    }

    public HostVFlashManagerVFlashConfigInfo getvFlashConfigInfo() {
        return vFlashConfigInfo;
    }

    public void setvFlashConfigInfo(final HostVFlashManagerVFlashConfigInfo vFlashConfigInfo) {
        this.vFlashConfigInfo = vFlashConfigInfo;
    }

    public VirtualMachineMemoryReservationInfo getVirtualMachineReservation() {
        return virtualMachineReservation;
    }

    public void setVirtualMachineReservation(final VirtualMachineMemoryReservationInfo virtualMachineReservation) {
        this.virtualMachineReservation = virtualMachineReservation;
    }

    public HostVirtualNicManagerInfo getVirtualNicManagerInfo() {
        return virtualNicManagerInfo;
    }

    public void setVirtualNicManagerInfo(final HostVirtualNicManagerInfo virtualNicManagerInfo) {
        this.virtualNicManagerInfo = virtualNicManagerInfo;
    }

    public HostVMotionInfo getVmotion() {
        return vmotion;
    }

    public void setVmotion(final HostVMotionInfo vmotion) {
        this.vmotion = vmotion;
    }

    public VsanHostConfigInfo getVsanHostConfig() {
        return vsanHostConfig;
    }

    public void setVsanHostConfig(final VsanHostConfigInfo vsanHostConfig) {
        this.vsanHostConfig = vsanHostConfig;
    }

    public Boolean getWakeOnLanCapable() {
        return wakeOnLanCapable;
    }

    public void setWakeOnLanCapable(final Boolean wakeOnLanCapable) {
        this.wakeOnLanCapable = wakeOnLanCapable;
    }

    public byte[] getDescriptionTreeCheckSum() {
        return descriptionTreeCheckSum;
    }

    public void setDescriptionTreeCheckSum(final byte[] descriptionTreeCheckSum) {
        this.descriptionTreeCheckSum = descriptionTreeCheckSum;
    }

    public HostAssignableHardwareBinding getAssignableHardwareBinding() {
        return assignableHardwareBinding;
    }

    public void setAssignableHardwareBinding(final HostAssignableHardwareBinding assignableHardwareBinding) {
        this.assignableHardwareBinding = assignableHardwareBinding;
    }

    public HostAssignableHardwareConfig getAssignableHardwareConfig() {
        return assignableHardwareConfig;
    }

    public void setAssignableHardwareConfig(final HostAssignableHardwareConfig assignableHardwareConfig) {
        this.assignableHardwareConfig = assignableHardwareConfig;
    }
}
