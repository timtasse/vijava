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
 * The ServiceContent data object defines properties for the ServiceInstance managed object.
 * The ServiceInstance itself does not have directly-accessible properties because reading the properties of a managed object requires the use of a property collector,
 * and the property collector itself is a property of the ServiceInstance. For this reason, use the method RetrieveServiceContent to retrieve the ServiceContent object.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7.2
 */
@SuppressWarnings("all")
public class ServiceContent extends DynamicData {

    private AboutInfo about;
    private ManagedObjectReference accountManager;
    private ManagedObjectReference alarmManager;
    private ManagedObjectReference authorizationManager;
    private ManagedObjectReference certificateManager;
    private ManagedObjectReference clusterProfileManager;
    private ManagedObjectReference complianceManager;
    private ManagedObjectReference cryptoManager;
    private ManagedObjectReference customFieldsManager;
    private ManagedObjectReference customizationSpecManager;
    private ManagedObjectReference datastoreNamespaceManager;
    private ManagedObjectReference diagnosticManager;
    private ManagedObjectReference dvSwitchManager;
    private ManagedObjectReference eventManager;
    private ManagedObjectReference extensionManager;
    private ManagedObjectReference failoverClusterConfigurator;
    private ManagedObjectReference failoverClusterManager;
    private ManagedObjectReference fileManager;
    private ManagedObjectReference guestOperationsManager;
    private ManagedObjectReference healthUpdateManager;
    private ManagedObjectReference hostProfileManager;
    private ManagedObjectReference hostSpecManager;
    private ManagedObjectReference ioFilterManager;
    private ManagedObjectReference ipPoolManager;
    private ManagedObjectReference licenseManager;
    private ManagedObjectReference localizationManager;
    private ManagedObjectReference overheadMemoryManager;
    private ManagedObjectReference ovfManager;
    private ManagedObjectReference perfManager;
    private ManagedObjectReference propertyCollector;
    private ManagedObjectReference rootFolder;
    private ManagedObjectReference scheduledTaskManager;
    private ManagedObjectReference searchIndex;
    private ManagedObjectReference serviceManager;
    private ManagedObjectReference sessionManager;
    private ManagedObjectReference setting;
    private ManagedObjectReference snmpSystem;
    private ManagedObjectReference storageQueryManager;
    private ManagedObjectReference storageResourceManager;
    private ManagedObjectReference taskManager;
    private ManagedObjectReference userDirectory;
    private ManagedObjectReference viewManager;
    private ManagedObjectReference virtualDiskManager;
    @Deprecated
    private ManagedObjectReference virtualizationManager;
    private ManagedObjectReference vmCompatibilityChecker;
    private ManagedObjectReference vmProvisioningChecker;
    private ManagedObjectReference vStorageObjectManager;

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

    public ManagedObjectReference getFailoverClusterConfigurator() {
        return failoverClusterConfigurator;
    }

    public void setFailoverClusterConfigurator(final ManagedObjectReference failoverClusterConfigurator) {
        this.failoverClusterConfigurator = failoverClusterConfigurator;
    }

    public ManagedObjectReference getFailoverClusterManager() {
        return failoverClusterManager;
    }

    public void setFailoverClusterManager(final ManagedObjectReference failoverClusterManager) {
        this.failoverClusterManager = failoverClusterManager;
    }

    public ManagedObjectReference getHealthUpdateManager() {
        return healthUpdateManager;
    }

    public void setHealthUpdateManager(final ManagedObjectReference healthUpdateManager) {
        this.healthUpdateManager = healthUpdateManager;
    }

    public ManagedObjectReference getHostSpecManager() {
        return hostSpecManager;
    }

    public void setHostSpecManager(final ManagedObjectReference hostSpecManager) {
        this.hostSpecManager = hostSpecManager;
    }

    public ManagedObjectReference getIoFilterManager() {
        return ioFilterManager;
    }

    public void setIoFilterManager(final ManagedObjectReference ioFilterManager) {
        this.ioFilterManager = ioFilterManager;
    }

    public ManagedObjectReference getOverheadMemoryManager() {
        return overheadMemoryManager;
    }

    public void setOverheadMemoryManager(final ManagedObjectReference overheadMemoryManager) {
        this.overheadMemoryManager = overheadMemoryManager;
    }

    public ManagedObjectReference getvStorageObjectManager() {
        return vStorageObjectManager;
    }

    public void setvStorageObjectManager(final ManagedObjectReference vStorageObjectManager) {
        this.vStorageObjectManager = vStorageObjectManager;
    }

    public ManagedObjectReference getRootFolder() {
        return this.rootFolder;
    }

    public void setRootFolder(ManagedObjectReference rootFolder) {
        this.rootFolder = rootFolder;
    }

    public ManagedObjectReference getPropertyCollector() {
        return this.propertyCollector;
    }

    public void setPropertyCollector(ManagedObjectReference propertyCollector) {
        this.propertyCollector = propertyCollector;
    }

    public ManagedObjectReference getViewManager() {
        return this.viewManager;
    }

    public void setViewManager(ManagedObjectReference viewManager) {
        this.viewManager = viewManager;
    }

    public AboutInfo getAbout() {
        return this.about;
    }

    public void setAbout(AboutInfo about) {
        this.about = about;
    }

    public ManagedObjectReference getSetting() {
        return this.setting;
    }

    public void setSetting(ManagedObjectReference setting) {
        this.setting = setting;
    }

    public ManagedObjectReference getUserDirectory() {
        return this.userDirectory;
    }

    public void setUserDirectory(ManagedObjectReference userDirectory) {
        this.userDirectory = userDirectory;
    }

    public ManagedObjectReference getSessionManager() {
        return this.sessionManager;
    }

    public void setSessionManager(ManagedObjectReference sessionManager) {
        this.sessionManager = sessionManager;
    }

    public ManagedObjectReference getAuthorizationManager() {
        return this.authorizationManager;
    }

    public void setAuthorizationManager(ManagedObjectReference authorizationManager) {
        this.authorizationManager = authorizationManager;
    }

    public ManagedObjectReference getServiceManager() {
        return this.serviceManager;
    }

    public void setServiceManager(ManagedObjectReference serviceManager) {
        this.serviceManager = serviceManager;
    }

    public ManagedObjectReference getPerfManager() {
        return this.perfManager;
    }

    public void setPerfManager(ManagedObjectReference perfManager) {
        this.perfManager = perfManager;
    }

    public ManagedObjectReference getScheduledTaskManager() {
        return this.scheduledTaskManager;
    }

    public void setScheduledTaskManager(ManagedObjectReference scheduledTaskManager) {
        this.scheduledTaskManager = scheduledTaskManager;
    }

    public ManagedObjectReference getAlarmManager() {
        return this.alarmManager;
    }

    public void setAlarmManager(ManagedObjectReference alarmManager) {
        this.alarmManager = alarmManager;
    }

    public ManagedObjectReference getEventManager() {
        return this.eventManager;
    }

    public void setEventManager(ManagedObjectReference eventManager) {
        this.eventManager = eventManager;
    }

    public ManagedObjectReference getTaskManager() {
        return this.taskManager;
    }

    public void setTaskManager(ManagedObjectReference taskManager) {
        this.taskManager = taskManager;
    }

    public ManagedObjectReference getExtensionManager() {
        return this.extensionManager;
    }

    public void setExtensionManager(ManagedObjectReference extensionManager) {
        this.extensionManager = extensionManager;
    }

    public ManagedObjectReference getCustomizationSpecManager() {
        return this.customizationSpecManager;
    }

    public void setCustomizationSpecManager(ManagedObjectReference customizationSpecManager) {
        this.customizationSpecManager = customizationSpecManager;
    }

    public ManagedObjectReference getCustomFieldsManager() {
        return this.customFieldsManager;
    }

    public void setCustomFieldsManager(ManagedObjectReference customFieldsManager) {
        this.customFieldsManager = customFieldsManager;
    }

    public ManagedObjectReference getAccountManager() {
        return this.accountManager;
    }

    public void setAccountManager(ManagedObjectReference accountManager) {
        this.accountManager = accountManager;
    }

    public ManagedObjectReference getDiagnosticManager() {
        return this.diagnosticManager;
    }

    public void setDiagnosticManager(ManagedObjectReference diagnosticManager) {
        this.diagnosticManager = diagnosticManager;
    }

    public ManagedObjectReference getLicenseManager() {
        return this.licenseManager;
    }

    public void setLicenseManager(ManagedObjectReference licenseManager) {
        this.licenseManager = licenseManager;
    }

    public ManagedObjectReference getSearchIndex() {
        return this.searchIndex;
    }

    public void setSearchIndex(ManagedObjectReference searchIndex) {
        this.searchIndex = searchIndex;
    }

    public ManagedObjectReference getFileManager() {
        return this.fileManager;
    }

    public void setFileManager(ManagedObjectReference fileManager) {
        this.fileManager = fileManager;
    }

    public ManagedObjectReference getDatastoreNamespaceManager() {
        return this.datastoreNamespaceManager;
    }

    public void setDatastoreNamespaceManager(ManagedObjectReference datastoreNamespaceManager) {
        this.datastoreNamespaceManager = datastoreNamespaceManager;
    }

    public ManagedObjectReference getVirtualDiskManager() {
        return this.virtualDiskManager;
    }

    public void setVirtualDiskManager(ManagedObjectReference virtualDiskManager) {
        this.virtualDiskManager = virtualDiskManager;
    }

    @Deprecated
    public ManagedObjectReference getVirtualizationManager() {
        return this.virtualizationManager;
    }

    @Deprecated
    public void setVirtualizationManager(ManagedObjectReference virtualizationManager) {
        this.virtualizationManager = virtualizationManager;
    }

    public ManagedObjectReference getSnmpSystem() {
        return this.snmpSystem;
    }

    public void setSnmpSystem(ManagedObjectReference snmpSystem) {
        this.snmpSystem = snmpSystem;
    }

    public ManagedObjectReference getVmProvisioningChecker() {
        return this.vmProvisioningChecker;
    }

    public void setVmProvisioningChecker(ManagedObjectReference vmProvisioningChecker) {
        this.vmProvisioningChecker = vmProvisioningChecker;
    }

    public ManagedObjectReference getVmCompatibilityChecker() {
        return this.vmCompatibilityChecker;
    }

    public void setVmCompatibilityChecker(ManagedObjectReference vmCompatibilityChecker) {
        this.vmCompatibilityChecker = vmCompatibilityChecker;
    }

    public ManagedObjectReference getOvfManager() {
        return this.ovfManager;
    }

    public void setOvfManager(ManagedObjectReference ovfManager) {
        this.ovfManager = ovfManager;
    }

    public ManagedObjectReference getIpPoolManager() {
        return this.ipPoolManager;
    }

    public void setIpPoolManager(ManagedObjectReference ipPoolManager) {
        this.ipPoolManager = ipPoolManager;
    }

    public ManagedObjectReference getDvSwitchManager() {
        return this.dvSwitchManager;
    }

    public void setDvSwitchManager(ManagedObjectReference dvSwitchManager) {
        this.dvSwitchManager = dvSwitchManager;
    }

    public ManagedObjectReference getHostProfileManager() {
        return this.hostProfileManager;
    }

    public void setHostProfileManager(ManagedObjectReference hostProfileManager) {
        this.hostProfileManager = hostProfileManager;
    }

    public ManagedObjectReference getClusterProfileManager() {
        return this.clusterProfileManager;
    }

    public void setClusterProfileManager(ManagedObjectReference clusterProfileManager) {
        this.clusterProfileManager = clusterProfileManager;
    }

    public ManagedObjectReference getComplianceManager() {
        return this.complianceManager;
    }

    public void setComplianceManager(ManagedObjectReference complianceManager) {
        this.complianceManager = complianceManager;
    }

    public ManagedObjectReference getLocalizationManager() {
        return this.localizationManager;
    }

    public void setLocalizationManager(ManagedObjectReference localizationManager) {
        this.localizationManager = localizationManager;
    }

    public ManagedObjectReference getStorageResourceManager() {
        return this.storageResourceManager;
    }

    public void setStorageResourceManager(ManagedObjectReference storageResourceManager) {
        this.storageResourceManager = storageResourceManager;
    }

    public ManagedObjectReference getGuestOperationsManager() {
        return this.guestOperationsManager;
    }

    public void setGuestOperationsManager(ManagedObjectReference guestOperationsManager) {
        this.guestOperationsManager = guestOperationsManager;
    }

    public ManagedObjectReference getStorageQueryManager() {
        return storageQueryManager;
    }

    public void setStorageQueryManager(final ManagedObjectReference storageQueryManager) {
        this.storageQueryManager = storageQueryManager;
    }
}
