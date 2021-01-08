/*================================================================================
Copyright (c) 2012 Steve Jin. All Rights Reserved.
Copyright (c) 2008 VMware, Inc. All Rights Reserved.

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

package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.mo.util.MorUtil;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * The HostSystem managed object type provides access to a virtualization host platform.
 *
 * Invoking destroy on a HostSystem of standalone type throws a NotSupported fault.
 * A standalone HostSystem can be destroyed only by invoking destroy on its parent ComputeResource.
 * Invoking destroy on a failover host throws a DisallowedOperationOnFailoverHost fault.
 * @see ClusterFailoverHostAdmissionControlPolicy
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7.1
 */

public class HostSystem extends ManagedEntity {

    private HostConfigManager configManager = null;

    public HostSystem(ServerConnection sc, ManagedObjectReference mor) {
        super(sc, mor);
    }

    public AnswerFileStatusResult getAnswerFileValidationResult() {
        return (AnswerFileStatusResult) this.getCurrentProperty("answerFileValidationResult");
    }

    public AnswerFileStatusResult getAnswerFileValidationState() {
        return (AnswerFileStatusResult) this.getCurrentProperty("answerFileValidationState");
    }

    public HostCapability getCapability() {
        return (HostCapability) getCurrentProperty("capability");
    }

    public ComplianceResult getComplianceCheckResult() {
        return (ComplianceResult) this.getCurrentProperty("complianceCheckResult");
    }

    public HostSystemComplianceCheckState getComplianceCheckState() {
        return (HostSystemComplianceCheckState) this.getCurrentProperty("complianceCheckState");
    }

    public HostConfigInfo getConfig() {
        return (HostConfigInfo) getCurrentProperty("config");
    }

    public HostConfigManager getConfigManager() throws InvalidProperty, RuntimeFault, RemoteException {
        if (configManager == null) {
            configManager = (HostConfigManager) getCurrentProperty("configManager");
        }
        return configManager;
    }

    public Datastore[] getDatastores() throws InvalidProperty, RuntimeFault, RemoteException {
        return getDatastores("datastore");
    }

    public HostDatastoreBrowser getDatastoreBrowser() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostDatastoreBrowser) getManagedObject("datastoreBrowser");
    }

    public HostHardwareInfo getHardware() {
        return (HostHardwareInfo) getCurrentProperty("hardware");
    }

    /**
     * @since SDK5.0
     */
    public HostLicensableResourceInfo getLicensableResource() {
        return (HostLicensableResourceInfo) getCurrentProperty("licensableResource");
    }

    public Network[] getNetworks() throws InvalidProperty, RuntimeFault, RemoteException {
        return getNetworks("network");
    }

    public ApplyHostProfileConfigurationSpec getPrecheckRemediationResult() {
        return (ApplyHostProfileConfigurationSpec) this.getCurrentProperty("precheckRemediationResult");
    }

    public ApplyHostProfileConfigurationResult getRemediationResult() {
        return (ApplyHostProfileConfigurationResult) this.getCurrentProperty("remediationResult");
    }

    public HostSystemRemediationState getRemediationState() {
        return (HostSystemRemediationState) this.getCurrentProperty("remediationState");
    }

    public HostRuntimeInfo getRuntime() {
        return (HostRuntimeInfo) getCurrentProperty("runtime");
    }

    public HostListSummary getSummary() {
        return (HostListSummary) getCurrentProperty("summary");
    }

    public HostSystemResourceInfo getSystemResources() {
        return (HostSystemResourceInfo) getCurrentProperty("systemResources");
    }

    public VirtualMachine[] getVms() throws InvalidProperty, RuntimeFault, RemoteException {
        return getVms("vm");
    }

    public HostServiceTicket acquireCimServicesTicket() throws RuntimeFault, RemoteException {
        return getVimService().acquireCimServicesTicket(getMOR());
    }

    public void configureCryptoKey(final CryptoKeyId keyId) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("keyId", CryptoKeyId.class, keyId));
        this.getVimService().getWsc().invokeWithoutReturn("ConfigureCryptoKey", params);
    }

    public Task disconnectHost() throws RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().disconnectHost_Task(getMOR());
        return new Task(getServerConnection(), mor);
    }

    public void enableCrypto(final CryptoKeyPlain keyPlain) throws InvalidState, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("keyPlain", CryptoKeyPlain.class, keyPlain));
        this.getVimService().getWsc().invokeWithoutReturn("EnableCrypto", params);
    }

    /**
     * @since SDK4.1
     */
    @Deprecated(since = "6.0")
    public void enterLockdownMode() throws HostConfigFault, RuntimeFault, RemoteException {
        getVimService().enterLockdownMode(getMOR());
    }

    /**
     * keep the old signature for compatibility
     */
    public Task enterMaintenanceMode(int timeout, boolean evacuatePoweredOffVms) throws Timedout, InvalidState, RuntimeFault, RemoteException {
        return enterMaintenanceMode(timeout, evacuatePoweredOffVms, null);
    }

    /**
     * @since SDK5.5
     */
    public Task enterMaintenanceMode(int timeout, boolean evacuatePoweredOffVms, HostMaintenanceSpec maintenanceSpec) throws Timedout, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().enterMaintenanceMode_Task(getMOR(), timeout, Boolean.valueOf(evacuatePoweredOffVms), maintenanceSpec);
        return new Task(getServerConnection(), mor);
    }

    /**
     * @since SDK4.1
     */
    @Deprecated(since = "6.0")
    public void exitLockdownMode() throws HostConfigFault, RuntimeFault, RemoteException {
        getVimService().exitLockdownMode(getMOR());
    }

    public Task exitMaintenanceMode(int timeout) throws Timedout, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().exitMaintenanceMode_Task(getMOR(), timeout);
        return new Task(getServerConnection(), mor);
    }

    public Task powerDownHostToStandBy(int timeSec, boolean evacuatePoweredOffVms) throws RequestCanceled, HostPowerOpFailed, NotSupported, Timedout, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().powerDownHostToStandBy_Task(getMOR(), timeSec, Boolean.valueOf(evacuatePoweredOffVms));
        return new Task(getServerConnection(), mor);
    }

    public Task powerUpHostFromStandBy(int timeSec) throws HostPowerOpFailed, NotSupported, Timedout, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().powerUpHostFromStandBy_Task(getMOR(), timeSec);
        return new Task(getServerConnection(), mor);
    }

    public void prepareCrypto() throws InvalidState, RuntimeFault, RemoteException {
        this.getVimService().getWsc().invokeWithoutReturn("PrepareCrypto", this.getSingleSelfArgumentList());
    }

    public HostConnectInfo queryHostConnectionInfo() throws RuntimeFault, RemoteException {
        return getVimService().queryHostConnectionInfo(getMOR());
    }

    @Deprecated(since = "2.5")
    public long queryMemoryOverhead(long memorySize, int videoRamSize, int numVcpus) throws RuntimeFault, RemoteException {
        return getVimService().queryMemoryOverhead(getMOR(), memorySize, new Integer(videoRamSize), numVcpus);
    }

    @Deprecated(since = "6.0")
    public long queryMemoryOverheadEx(VirtualMachineConfigInfo vmConfigInfo) throws RuntimeFault, RemoteException {
        return getVimService().queryMemoryOverheadEx(getMOR(), vmConfigInfo);
    }

    public String queryProductLockerLocation() throws HostConfigFault, RuntimeFault, RemoteException {
        return this.getVimService().getWsc().invoke("QueryProductLockerLocation", this.getSingleSelfArgumentList(), String.class);
    }

    /**
     * @since SDK5.1
     */
    public HostTpmAttestationReport queryTpmAttestationReport() throws RuntimeFault, RemoteException {
        return getVimService().queryTpmAttestationReport(getMOR());
    }

    public Task rebootHost(boolean force) throws InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().rebootHost_Task(getMOR(), force);
        return new Task(getServerConnection(), mor);
    }

    public Task reconfigureHostForDAS() throws DasConfigFault, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().reconfigureHostForDAS_Task(getMOR());
        return new Task(getServerConnection(), mor);
    }

    //SDK4.1 signature for back compatibility
    public Task reconnectHost_Task(HostConnectSpec hcs) throws InvalidName, InvalidLogin, InvalidState, HostConnectFault, RuntimeFault, RemoteException {
        return reconnectHost_Task(hcs, null);
    }

    //SDK5.0 signature
    public Task reconnectHost_Task(HostConnectSpec cnxSpec, HostSystemReconnectSpec reconnectSpec) throws InvalidName, InvalidLogin, InvalidState, HostConnectFault, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().reconnectHost_Task(getMOR(), cnxSpec, reconnectSpec);
        return new Task(getServerConnection(), mor);
    }

    /**
     * @since SDK4.1
     */
    public long retrieveHardwareUptime() throws RuntimeFault, RemoteException {
        return getVimService().retrieveHardwareUptime(getMOR());
    }

    public Task shutdownHost_Task(boolean force) throws InvalidState, NotSupported, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().shutdownHost_Task(getMOR(), force);
        return new Task(getServerConnection(), mor);
    }

    public void updateFlags(HostFlagInfo hfi) throws RuntimeFault, RemoteException {
        getVimService().updateFlags(getMOR(), hfi);
    }

    /**
     * @since 4.0
     */
    public void updateIpmi(HostIpmiInfo ipmiInfo) throws InvalidIpmiLoginInfo, InvalidIpmiMacAddress, RuntimeFault, RemoteException {
        getVimService().updateIpmi(getMOR(), ipmiInfo);
    }

    public Task updateProductLockerLocation(final String path) throws FileNotFound, HostConfigFault, InvalidArgument, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("path", String.class, path));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("UpdateProductLockerLocation_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    @Deprecated(since = "6.0")
    public void updateSystemResources(HostSystemResourceInfo resourceInfo) throws RuntimeFault, RemoteException {
        getVimService().updateSystemResources(getMOR(), resourceInfo);
    }

    /**
     * @since SDK5.1
     */
    public void updateSystemSwapConfiguration(HostSystemSwapConfiguration sysSwapConfig) throws RuntimeFault, RemoteException {
        getVimService().updateSystemSwapConfiguration(getMOR(), sysSwapConfig);
    }

    // Helper Methods for getting instances from ConfigManager
    public HostLocalAccountManager getHostLocalAccountManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return new HostLocalAccountManager(getServerConnection(), getConfigManager().getAccountManager());
    }

    public OptionManager getOptionManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return new OptionManager(getServerConnection(), getConfigManager().getAdvancedOption());
    }

    public HostAuthenticationManager getHostAuthenticationManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return new HostAuthenticationManager(this.getServerConnection(), this.getConfigManager().getAuthenticationManager());
    }

    public HostAutoStartManager getHostAutoStartManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return new HostAutoStartManager(getServerConnection(), getConfigManager().getAutoStartManager());
    }

    public HostBootDeviceSystem getHostBootDeviceSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostBootDeviceSystem) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getBootDeviceSystem());
    }

    public HostCacheConfigurationManager getHostCacheConfigurationManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostCacheConfigurationManager) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getCacheConfigurationManager());
    }

    public HostCertificateManager getHostCertificateManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return new HostCertificateManager(getServerConnection(), getConfigManager().getCertificateManager());
    }

    public HostCpuSchedulerSystem getHostCpuSchedulerSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostCpuSchedulerSystem) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getCpuScheduler());
    }

    public CryptoManager getCryptoManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return new CryptoManager(getServerConnection(), getConfigManager().getCryptoManager());
    }

    public HostDatastoreSystem getHostDatastoreSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostDatastoreSystem) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getDatastoreSystem());
    }

    public HostDateTimeSystem getHostDateTimeSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostDateTimeSystem) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getDateTimeSystem());
    }

    public HostDiagnosticSystem getHostDiagnosticSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostDiagnosticSystem) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getDiagnosticSystem());
    }

    public HostEsxAgentHostManager getHostEsxAgentHostManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostEsxAgentHostManager) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getEsxAgentHostManager());
    }

    public HostFirewallSystem getHostFirewallSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostFirewallSystem) MorUtil.createExactManagedObject(getServerConnection(),
                getConfigManager().getFirewallSystem());
    }

    public HostFirmwareSystem getHostFirmwareSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostFirmwareSystem) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getFirmwareSystem());
    }

    public HostGraphicsManager getHostGraphicsManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostGraphicsManager) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getGraphicsManager());
    }

    public HostHealthStatusSystem getHealthStatusSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostHealthStatusSystem) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getHealthStatusSystem());
    }

    public HostAccessManager getHostAccessManager()  throws InvalidProperty, RuntimeFault, RemoteException {
        return new HostAccessManager(getServerConnection(), getConfigManager().getHostAccessManager());
    }

    public HostImageConfigManager getHostImageConfigManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostImageConfigManager) MorUtil.createExactManagedObject(getServerConnection(),
                getConfigManager().getImageConfigManager());
    }

    public IscsiManager getIscsiManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return (IscsiManager) MorUtil.createExactManagedObject(getServerConnection(),
                getConfigManager().getIscsiManager());
    }

    public HostKernelModuleSystem getHostKernelModuleSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostKernelModuleSystem) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getKernelModuleSystem());
    }

    public LicenseManager getLicenseManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return (LicenseManager) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getLicenseManager());
    }

    public HostMemorySystem getHostMemorySystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostMemorySystem) MorUtil.createExactManagedObject(getServerConnection(),
                getConfigManager().getMemoryManager());
    }

    public MessageBusProxy getMessageBusProxy() throws InvalidProperty, RuntimeFault, RemoteException {
        return new MessageBusProxy(getServerConnection(), getConfigManager().getMessageBusProxy());
    }

    public HostNetworkSystem getHostNetworkSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostNetworkSystem) MorUtil.createExactManagedObject(getServerConnection(),
                getConfigManager().getNetworkSystem());
    }

    public HostNvdimmSystem getHostNvdimmSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return new HostNvdimmSystem(this.getServerConnection(), this.getConfigManager().getNvdimmSystem());
    }

    public HostPatchManager getHostPatchManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostPatchManager) MorUtil.createExactManagedObject(getServerConnection(),
                getConfigManager().getPatchManager());
    }

    public HostPciPassthruSystem getHostPciPassthruSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostPciPassthruSystem) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getPciPassthruSystem());
    }

    public HostPowerSystem getHostPowerSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return new HostPowerSystem(this.getServerConnection(), this.getConfigManager().getPowerSystem());
    }

    public HostServiceSystem getHostServiceSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostServiceSystem) MorUtil.createExactManagedObject(getServerConnection(),
                getConfigManager().getServiceSystem());
    }

    public HostSnmpSystem getHostSnmpSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostSnmpSystem) MorUtil.createExactManagedObject(getServerConnection(),
                getConfigManager().getSnmpSystem());
    }

    public HostStorageSystem getHostStorageSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostStorageSystem) MorUtil.createExactManagedObject(getServerConnection(),
                getConfigManager().getStorageSystem());
    }

    public UserDirectory getUserDirectory() throws InvalidProperty, RuntimeFault, RemoteException {
        return new UserDirectory(getServerConnection(), getConfigManager().getUserDirectory());
    }

    public HostVFlashManager getHostVFlashManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostVFlashManager) MorUtil.createExactManagedObject(getServerConnection(),
                getConfigManager().getVFlashManager());
    }

    public HostVirtualNicManager getHostVirtualNicManager() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostVirtualNicManager) MorUtil.createExactManagedObject(getServerConnection(), getConfigManager().getVirtualNicManager());
    }

    @Deprecated(since = "4.0")
    public HostVMotionSystem getHostVMotionSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostVMotionSystem) MorUtil.createExactManagedObject(getServerConnection(),
                getConfigManager().getVmotionSystem());
    }

    public HostVsanInternalSystem getHostVsanInternalSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostVsanInternalSystem) MorUtil.createExactManagedObject(getServerConnection(),
                getConfigManager().getVsanInternalSystem());
    }

    public HostVsanSystem getHostVsanSystem() throws InvalidProperty, RuntimeFault, RemoteException {
        return (HostVsanSystem) MorUtil.createExactManagedObject(getServerConnection(),
                getConfigManager().getVsanSystem());
    }

}
