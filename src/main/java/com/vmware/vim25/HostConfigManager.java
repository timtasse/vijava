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
 * This data object type describes the configuration of a host across products and versions.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
public class HostConfigManager extends DynamicData {

    private ManagedObjectReference accountManager;
    private ManagedObjectReference advancedOption;
    private ManagedObjectReference assignableHardwareManager;
    private ManagedObjectReference authenticationManager;
    private ManagedObjectReference autoStartManager;
    private ManagedObjectReference bootDeviceSystem;
    private ManagedObjectReference cacheConfigurationManager;
    private ManagedObjectReference certificateManager;
    private ManagedObjectReference cpuScheduler;
    private ManagedObjectReference cryptoManager;
    private ManagedObjectReference datastoreSystem;
    private ManagedObjectReference dateTimeSystem;
    private ManagedObjectReference diagnosticSystem;
    private ManagedObjectReference esxAgentHostManager;
    private ManagedObjectReference firewallSystem;
    private ManagedObjectReference firmwareSystem;
    private ManagedObjectReference graphicsManager;
    private ManagedObjectReference healthStatusSystem;
    private ManagedObjectReference hostAccessManager;
    private ManagedObjectReference imageConfigManager;
    private ManagedObjectReference iscsiManager;
    private ManagedObjectReference kernelModuleSystem;
    private ManagedObjectReference licenseManager;
    private ManagedObjectReference memoryManager;
    private ManagedObjectReference messageBusProxy;
    private ManagedObjectReference networkSystem;
    private ManagedObjectReference nvdimmSystem;
    private ManagedObjectReference patchManager;
    private ManagedObjectReference pciPassthruSystem;
    private ManagedObjectReference powerSystem;
    private ManagedObjectReference serviceSystem;
    private ManagedObjectReference snmpSystem;
    private ManagedObjectReference storageSystem;
    private ManagedObjectReference userDirectory;
    private ManagedObjectReference vFlashManager;
    private ManagedObjectReference virtualNicManager;
    @Deprecated
    private ManagedObjectReference vmotionSystem;
    private ManagedObjectReference vsanInternalSystem;
    private ManagedObjectReference vsanSystem;

    public ManagedObjectReference getCpuScheduler() {
        return this.cpuScheduler;
    }

    public void setCpuScheduler(ManagedObjectReference cpuScheduler) {
        this.cpuScheduler = cpuScheduler;
    }

    public ManagedObjectReference getDatastoreSystem() {
        return this.datastoreSystem;
    }

    public void setDatastoreSystem(ManagedObjectReference datastoreSystem) {
        this.datastoreSystem = datastoreSystem;
    }

    public ManagedObjectReference getMemoryManager() {
        return this.memoryManager;
    }

    public void setMemoryManager(ManagedObjectReference memoryManager) {
        this.memoryManager = memoryManager;
    }

    public ManagedObjectReference getStorageSystem() {
        return this.storageSystem;
    }

    public void setStorageSystem(ManagedObjectReference storageSystem) {
        this.storageSystem = storageSystem;
    }

    public ManagedObjectReference getNetworkSystem() {
        return this.networkSystem;
    }

    public void setNetworkSystem(ManagedObjectReference networkSystem) {
        this.networkSystem = networkSystem;
    }

    @Deprecated
    public ManagedObjectReference getVmotionSystem() {
        return this.vmotionSystem;
    }

    @Deprecated
    public void setVmotionSystem(ManagedObjectReference vmotionSystem) {
        this.vmotionSystem = vmotionSystem;
    }

    public ManagedObjectReference getVirtualNicManager() {
        return this.virtualNicManager;
    }

    public void setVirtualNicManager(ManagedObjectReference virtualNicManager) {
        this.virtualNicManager = virtualNicManager;
    }

    public ManagedObjectReference getServiceSystem() {
        return this.serviceSystem;
    }

    public void setServiceSystem(ManagedObjectReference serviceSystem) {
        this.serviceSystem = serviceSystem;
    }

    public ManagedObjectReference getFirewallSystem() {
        return this.firewallSystem;
    }

    public void setFirewallSystem(ManagedObjectReference firewallSystem) {
        this.firewallSystem = firewallSystem;
    }

    public ManagedObjectReference getAdvancedOption() {
        return this.advancedOption;
    }

    public void setAdvancedOption(ManagedObjectReference advancedOption) {
        this.advancedOption = advancedOption;
    }

    public ManagedObjectReference getDiagnosticSystem() {
        return this.diagnosticSystem;
    }

    public void setDiagnosticSystem(ManagedObjectReference diagnosticSystem) {
        this.diagnosticSystem = diagnosticSystem;
    }

    public ManagedObjectReference getAutoStartManager() {
        return this.autoStartManager;
    }

    public void setAutoStartManager(ManagedObjectReference autoStartManager) {
        this.autoStartManager = autoStartManager;
    }

    public ManagedObjectReference getSnmpSystem() {
        return this.snmpSystem;
    }

    public void setSnmpSystem(ManagedObjectReference snmpSystem) {
        this.snmpSystem = snmpSystem;
    }

    public ManagedObjectReference getDateTimeSystem() {
        return this.dateTimeSystem;
    }

    public void setDateTimeSystem(ManagedObjectReference dateTimeSystem) {
        this.dateTimeSystem = dateTimeSystem;
    }

    public ManagedObjectReference getPatchManager() {
        return this.patchManager;
    }

    public void setPatchManager(ManagedObjectReference patchManager) {
        this.patchManager = patchManager;
    }

    public ManagedObjectReference getImageConfigManager() {
        return this.imageConfigManager;
    }

    public void setImageConfigManager(ManagedObjectReference imageConfigManager) {
        this.imageConfigManager = imageConfigManager;
    }

    public ManagedObjectReference getBootDeviceSystem() {
        return this.bootDeviceSystem;
    }

    public void setBootDeviceSystem(ManagedObjectReference bootDeviceSystem) {
        this.bootDeviceSystem = bootDeviceSystem;
    }

    public ManagedObjectReference getFirmwareSystem() {
        return this.firmwareSystem;
    }

    public void setFirmwareSystem(ManagedObjectReference firmwareSystem) {
        this.firmwareSystem = firmwareSystem;
    }

    public ManagedObjectReference getHealthStatusSystem() {
        return this.healthStatusSystem;
    }

    public void setHealthStatusSystem(ManagedObjectReference healthStatusSystem) {
        this.healthStatusSystem = healthStatusSystem;
    }

    public ManagedObjectReference getPciPassthruSystem() {
        return this.pciPassthruSystem;
    }

    public void setPciPassthruSystem(ManagedObjectReference pciPassthruSystem) {
        this.pciPassthruSystem = pciPassthruSystem;
    }

    public ManagedObjectReference getLicenseManager() {
        return this.licenseManager;
    }

    public void setLicenseManager(ManagedObjectReference licenseManager) {
        this.licenseManager = licenseManager;
    }

    public ManagedObjectReference getKernelModuleSystem() {
        return this.kernelModuleSystem;
    }

    public void setKernelModuleSystem(ManagedObjectReference kernelModuleSystem) {
        this.kernelModuleSystem = kernelModuleSystem;
    }

    public ManagedObjectReference getAuthenticationManager() {
        return this.authenticationManager;
    }

    public void setAuthenticationManager(ManagedObjectReference authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    public ManagedObjectReference getPowerSystem() {
        return this.powerSystem;
    }

    public void setPowerSystem(ManagedObjectReference powerSystem) {
        this.powerSystem = powerSystem;
    }

    public ManagedObjectReference getCacheConfigurationManager() {
        return this.cacheConfigurationManager;
    }

    public void setCacheConfigurationManager(ManagedObjectReference cacheConfigurationManager) {
        this.cacheConfigurationManager = cacheConfigurationManager;
    }

    public ManagedObjectReference getEsxAgentHostManager() {
        return this.esxAgentHostManager;
    }

    public void setEsxAgentHostManager(ManagedObjectReference esxAgentHostManager) {
        this.esxAgentHostManager = esxAgentHostManager;
    }

    public ManagedObjectReference getIscsiManager() {
        return this.iscsiManager;
    }

    public void setIscsiManager(ManagedObjectReference iscsiManager) {
        this.iscsiManager = iscsiManager;
    }

    public ManagedObjectReference getVFlashManager() {
        return this.vFlashManager;
    }

    public void setVFlashManager(ManagedObjectReference vFlashManager) {
        this.vFlashManager = vFlashManager;
    }

    public ManagedObjectReference getVsanSystem() {
        return this.vsanSystem;
    }

    public void setVsanSystem(ManagedObjectReference vsanSystem) {
        this.vsanSystem = vsanSystem;
    }

    public ManagedObjectReference getGraphicsManager() {
        return this.graphicsManager;
    }

    public void setGraphicsManager(ManagedObjectReference graphicsManager) {
        this.graphicsManager = graphicsManager;
    }

    public ManagedObjectReference getVsanInternalSystem() {
        return this.vsanInternalSystem;
    }

    public void setVsanInternalSystem(ManagedObjectReference vsanInternalSystem) {
        this.vsanInternalSystem = vsanInternalSystem;
    }

    public ManagedObjectReference getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(final ManagedObjectReference accountManager) {
        this.accountManager = accountManager;
    }

    public ManagedObjectReference getCertificateManager() {
        return certificateManager;
    }

    public void setCertificateManager(final ManagedObjectReference certificateManager) {
        this.certificateManager = certificateManager;
    }

    public ManagedObjectReference getCryptoManager() {
        return cryptoManager;
    }

    public void setCryptoManager(final ManagedObjectReference cryptoManager) {
        this.cryptoManager = cryptoManager;
    }

    public ManagedObjectReference getHostAccessManager() {
        return hostAccessManager;
    }

    public void setHostAccessManager(final ManagedObjectReference hostAccessManager) {
        this.hostAccessManager = hostAccessManager;
    }

    public ManagedObjectReference getMessageBusProxy() {
        return messageBusProxy;
    }

    public void setMessageBusProxy(final ManagedObjectReference messageBusProxy) {
        this.messageBusProxy = messageBusProxy;
    }

    public ManagedObjectReference getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(final ManagedObjectReference userDirectory) {
        this.userDirectory = userDirectory;
    }

    public ManagedObjectReference getNvdimmSystem() {
        return nvdimmSystem;
    }

    public void setNvdimmSystem(final ManagedObjectReference nvdimmSystem) {
        this.nvdimmSystem = nvdimmSystem;
    }

    public ManagedObjectReference getvFlashManager() {
        return vFlashManager;
    }

    public void setvFlashManager(final ManagedObjectReference vFlashManager) {
        this.vFlashManager = vFlashManager;
    }

    public ManagedObjectReference getAssignableHardwareManager() {
        return assignableHardwareManager;
    }

    public void setAssignableHardwareManager(final ManagedObjectReference assignableHardwareManager) {
        this.assignableHardwareManager = assignableHardwareManager;
    }
}
