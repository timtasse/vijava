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
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * The HostSystem managed object type provides access to a virtualization host platform.
 * <p>
 * Invoking destroy on a HostSystem of standalone type throws a NotSupported fault.
 * A standalone HostSystem can be destroyed only by invoking destroy on its parent ComputeResource.
 * Invoking destroy on a failover host throws a DisallowedOperationOnFailoverHost fault.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 * @see ClusterFailoverHostAdmissionControlPolicy
 */
@SuppressWarnings("unused")
public class HostSystem extends ManagedEntity {

    private HostConfigManager configManager = null;

    public HostSystem(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public AnswerFileStatusResult getAnswerFileValidationResult() {
        return this.getCurrentProperty("answerFileValidationResult", AnswerFileStatusResult.class);
    }

    public AnswerFileStatusResult getAnswerFileValidationState() {
        return this.getCurrentProperty("answerFileValidationState", AnswerFileStatusResult.class);
    }

    public HostCapability getCapability() {
        return getCurrentProperty("capability", HostCapability.class);
    }

    public ComplianceResult getComplianceCheckResult() {
        return this.getCurrentProperty("complianceCheckResult", ComplianceResult.class);
    }

    public HostSystemComplianceCheckState getComplianceCheckState() {
        return this.getCurrentProperty("complianceCheckState", HostSystemComplianceCheckState.class);
    }

    public HostConfigInfo getConfig() {
        return getCurrentProperty("config", HostConfigInfo.class);
    }

    public HostConfigManager getConfigManager() {
        if (configManager == null) {
            configManager = getCurrentProperty("configManager", HostConfigManager.class);
        }
        return configManager;
    }

    public List<Datastore> getDatastores() {
        return getDatastores("datastore");
    }

    public HostDatastoreBrowser getDatastoreBrowser() {
        return (HostDatastoreBrowser) getManagedObject("datastoreBrowser");
    }

    public HostHardwareInfo getHardware() {
        return getCurrentProperty("hardware", HostHardwareInfo.class);
    }

    public HostLicensableResourceInfo getLicensableResource() {
        return getCurrentProperty("licensableResource", HostLicensableResourceInfo.class);
    }

    public List<Network> getNetworks() {
        return getNetworks("network");
    }

    public ApplyHostProfileConfigurationSpec getPrecheckRemediationResult() {
        return this.getCurrentProperty("precheckRemediationResult", ApplyHostProfileConfigurationSpec.class);
    }

    public ApplyHostProfileConfigurationResult getRemediationResult() {
        return this.getCurrentProperty("remediationResult", ApplyHostProfileConfigurationResult.class);
    }

    public HostSystemRemediationState getRemediationState() {
        return this.getCurrentProperty("remediationState", HostSystemRemediationState.class);
    }

    public HostRuntimeInfo getRuntime() {
        return getCurrentProperty("runtime", HostRuntimeInfo.class);
    }

    public HostListSummary getSummary() {
        return getCurrentProperty("summary", HostListSummary.class);
    }

    public HostSystemResourceInfo getSystemResources() {
        return getCurrentProperty("systemResources", HostSystemResourceInfo.class);
    }

    public List<VirtualMachine> getVms() {
        return getVms("vm");
    }

    public HostServiceTicket acquireCimServicesTicket() throws RuntimeFault {
        try {
            return this.getVimService().getWsc()
                    .invoke("AcquireCimServicesTicket", this.getSingleSelfArgumentList(), HostServiceTicket.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void configureCryptoKey(final CryptoKeyId keyId) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("keyId", CryptoKeyId.class, keyId));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ConfigureCryptoKey", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task disconnectHost() throws RuntimeFault {
        try {
            return this.invokeWithTaskReturn("DisconnectHost_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void enableCrypto(final CryptoKeyPlain keyPlain) throws InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("keyPlain", CryptoKeyPlain.class, keyPlain));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("EnableCrypto", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "6.0")
    public void enterLockdownMode() throws AdminDisabled, DisableAdminNotSupported, HostConfigFault, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("EnterLockdownMode", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AdminDisabled) {
                throw (AdminDisabled) cause;
            }
            if (cause instanceof DisableAdminNotSupported) {
                throw (DisableAdminNotSupported) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task enterMaintenanceMode(final int timeout, final boolean evacuatePoweredOffVms)
            throws Timedout, InvalidState, RuntimeFault {
        return this.enterMaintenanceMode(timeout, evacuatePoweredOffVms, null);
    }

    public Task enterMaintenanceMode(final int timeout, final boolean evacuatePoweredOffVms, final HostMaintenanceSpec maintenanceSpec)
            throws Timedout, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("timeout", timeout),
                Argument.fromBasicType("evacuatePoweredOffVms", evacuatePoweredOffVms),
                new Argument("maintenanceSpec", HostMaintenanceSpec.class, maintenanceSpec));
        try {
            return this.invokeWithTaskReturn("EnterMaintenanceMode_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof Timedout) {
                throw (Timedout) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "6.0")
    public void exitLockdownMode() throws HostConfigFault, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ExitLockdownMode", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task exitMaintenanceMode(final int timeout) throws Timedout, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("timeout", timeout));
        try {
            return this.invokeWithTaskReturn("ExitMaintenanceMode_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof Timedout) {
                throw (Timedout) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task powerDownHostToStandBy(final int timeoutSec, final boolean evacuatePoweredOffVms)
            throws RequestCanceled, HostPowerOpFailed, NotSupported, Timedout, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("timeoutSec", timeoutSec),
                Argument.fromBasicType("evacuatePoweredOffVms", evacuatePoweredOffVms));
        try {
            return this.invokeWithTaskReturn("PowerDownHostToStandBy_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof Timedout) {
                throw (Timedout) cause;
            }
            if (cause instanceof RequestCanceled) {
                throw (RequestCanceled) cause;
            }
            if (cause instanceof HostPowerOpFailed) {
                throw (HostPowerOpFailed) cause;
            }
            if (cause instanceof NotSupported) {
                throw (NotSupported) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task powerUpHostFromStandBy(final int timeoutSec)
            throws HostPowerOpFailed, NotSupported, Timedout, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("timeoutSec", timeoutSec));
        try {
            return this.invokeWithTaskReturn("PowerUpHostFromStandBy_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof Timedout) {
                throw (Timedout) cause;
            }
            if (cause instanceof HostPowerOpFailed) {
                throw (HostPowerOpFailed) cause;
            }
            if (cause instanceof NotSupported) {
                throw (NotSupported) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void prepareCrypto() throws InvalidState, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("PrepareCrypto", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public HostConnectInfo queryHostConnectionInfo() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("QueryHostConnectionInfo", this.getSingleSelfArgumentList(), HostConnectInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "2.5")
    public long queryMemoryOverhead(final long memorySize, final Integer videoRamSize, final int numVcpus) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("memorySize", memorySize),
                new Argument("videoRamSize", "int", videoRamSize),
                Argument.fromBasicType("numVcpus", numVcpus));
        try {
            return (Long) this.getVimService().getWsc().invoke("QueryMemoryOverhead", params, "long");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "6.0")
    public long queryMemoryOverheadEx(final VirtualMachineConfigInfo vmConfigInfo) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmConfigInfo", VirtualMachineConfigInfo.class, vmConfigInfo));
        try {
            return (Long) this.getVimService().getWsc().invoke("QueryMemoryOverheadEx", params, "long");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String queryProductLockerLocation() throws HostConfigFault, RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("QueryProductLockerLocation", this.getSingleSelfArgumentList(), String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public HostTpmAttestationReport queryTpmAttestationReport() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("QueryTpmAttestationReport", this.getSingleSelfArgumentList(), HostTpmAttestationReport.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task rebootHost(final boolean force) throws InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("force", force));
        try {
            return this.invokeWithTaskReturn("RebootHost_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task reconfigureHostForDAS() throws DasConfigFault, RuntimeFault {
        try {
            return this.invokeWithTaskReturn("ReconfigureHostForDAS_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DasConfigFault) {
                throw (DasConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    //SDK4.1 signature for back compatibility
    public Task reconnectHost_Task(final HostConnectSpec cnxSpec)
            throws AlreadyBeingManaged, GatewayConnectFault, GatewayHostNotReachable, GatewayNotFound, GatewayNotReachable,
            GatewayOperationRefused, GatewayToHostAuthFault, GatewayToHostTrustVerifyFault, HostConnectFault, InvalidName,
            InvalidLogin, InvalidState, NoHost, NotSupportedHost, SSLVerifyFault, RuntimeFault {
        return this.reconnectHost_Task(cnxSpec, null);
    }

    public Task reconnectHost_Task(final HostConnectSpec cnxSpec, final HostSystemReconnectSpec reconnectSpec)
            throws AlreadyBeingManaged, GatewayConnectFault, GatewayHostNotReachable, GatewayNotFound, GatewayNotReachable,
            GatewayOperationRefused, GatewayToHostAuthFault, GatewayToHostTrustVerifyFault, HostConnectFault, InvalidName,
            InvalidLogin, InvalidState, NoHost, NotSupportedHost, SSLVerifyFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cnxSpec", HostConnectSpec.class, cnxSpec),
                new Argument("reconnectSpec", HostSystemReconnectSpec.class, reconnectSpec));
        try {
            return this.invokeWithTaskReturn("ReconnectHost_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AlreadyBeingManaged) {
                throw (AlreadyBeingManaged) cause;
            }
            if (cause instanceof GatewayHostNotReachable) {
                throw (GatewayHostNotReachable) cause;
            }
            if (cause instanceof GatewayNotFound) {
                throw (GatewayNotFound) cause;
            }
            if (cause instanceof GatewayNotReachable) {
                throw (GatewayNotReachable) cause;
            }
            if (cause instanceof GatewayOperationRefused) {
                throw (GatewayOperationRefused) cause;
            }
            if (cause instanceof GatewayToHostAuthFault) {
                throw (GatewayToHostAuthFault) cause;
            }
            if (cause instanceof GatewayToHostTrustVerifyFault) {
                throw (GatewayToHostTrustVerifyFault) cause;
            }
            if (cause instanceof GatewayConnectFault) {
                throw (GatewayConnectFault) cause;
            }
            if (cause instanceof NoHost) {
                throw (NoHost) cause;
            }
            if (cause instanceof NotSupportedHost) {
                throw (NotSupportedHost) cause;
            }
            if (cause instanceof SSLVerifyFault) {
                throw (SSLVerifyFault) cause;
            }
            if (cause instanceof HostConnectFault) {
                throw (HostConnectFault) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof InvalidLogin) {
                throw (InvalidLogin) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public long retrieveFreeEpcMemory() throws RuntimeFault {
        try {
            return (Long) this.getVimService().getWsc()
                    .invoke("RetrieveFreeEpcMemory", this.getSingleSelfArgumentList(), "long");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public long retrieveHardwareUptime() throws RuntimeFault {
        try {
            return (Long) this.getVimService().getWsc()
                    .invoke("RetrieveHardwareUptime", this.getSingleSelfArgumentList(), "long");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task shutdownHost(final boolean force) throws InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("force", force));
        try {
            return this.invokeWithTaskReturn("ShutdownHost_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateFlags(final HostFlagInfo flagInfo) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("flagInfo", HostFlagInfo.class, flagInfo));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateFlags", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateIpmi(final HostIpmiInfo ipmiInfo) throws InvalidIpmiLoginInfo, InvalidIpmiMacAddress, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("ipmiInfo", HostIpmiInfo.class, ipmiInfo));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateIpmi", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidIpmiLoginInfo) {
                throw (InvalidIpmiLoginInfo) cause;
            }
            if (cause instanceof InvalidIpmiMacAddress) {
                throw (InvalidIpmiMacAddress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task updateProductLockerLocation(final String path)
            throws FileNotFound, HostConfigFault, InvalidArgument, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("path", String.class, path));
        try {
            return this.invokeWithTaskReturn("UpdateProductLockerLocation_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileNotFound) {
                throw (FileNotFound) cause;
            }
            if (cause instanceof InvalidArgument) {
                throw (InvalidArgument) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "6.0")
    public void updateSystemResources(final HostSystemResourceInfo resourceInfo) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("resourceInfo", HostSystemResourceInfo.class, resourceInfo));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateSystemResources", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateSystemSwapConfiguration(final HostSystemSwapConfiguration sysSwapConfig) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("sysSwapConfig", HostSystemSwapConfiguration.class, sysSwapConfig));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateSystemSwapConfiguration", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    // Helper Methods for getting instances from ConfigManager
    public HostLocalAccountManager getHostLocalAccountManager() {
        final ManagedObjectReference mor = this.getConfigManager().getAccountManager();
        if (mor == null) {
            return null;
        }
        return new HostLocalAccountManager(this.getServerConnection(), mor);
    }

    public OptionManager getOptionManager() {
        final ManagedObjectReference mor = this.getConfigManager().getAdvancedOption();
        if (mor == null) {
            return null;
        }
        return new OptionManager(this.getServerConnection(), mor);
    }

    public HostAssignableHardwareManager getHostAssignableHardwareManager() {
        final ManagedObjectReference mor = this.getConfigManager().getAssignableHardwareManager();
        if (mor == null) {
            return null;
        }
        return new HostAssignableHardwareManager(this.getServerConnection(), mor);
    }

    public HostAuthenticationManager getHostAuthenticationManager() {
        final ManagedObjectReference mor = this.getConfigManager().getAuthenticationManager();
        if (mor == null) {
            return null;
        }
        return new HostAuthenticationManager(this.getServerConnection(), mor);
    }

    public HostAutoStartManager getHostAutoStartManager() {
        final ManagedObjectReference mor = this.getConfigManager().getAutoStartManager();
        if (mor == null) {
            return null;
        }
        return new HostAutoStartManager(this.getServerConnection(), mor);
    }

    public HostBootDeviceSystem getHostBootDeviceSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getBootDeviceSystem();
        if (mor == null) {
            return null;
        }
        return new HostBootDeviceSystem(this.getServerConnection(), mor);
    }

    public HostCacheConfigurationManager getHostCacheConfigurationManager() {
        final ManagedObjectReference mor = this.getConfigManager().getCacheConfigurationManager();
        if (mor == null) {
            return null;
        }
        return new HostCacheConfigurationManager(this.getServerConnection(), mor);
    }

    public HostCertificateManager getHostCertificateManager() {
        final ManagedObjectReference mor = this.getConfigManager().getCertificateManager();
        if (mor == null) {
            return null;
        }
        return new HostCertificateManager(this.getServerConnection(), mor);
    }

    public HostCpuSchedulerSystem getHostCpuSchedulerSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getCpuScheduler();
        if (mor == null) {
            return null;
        }
        return new HostCpuSchedulerSystem(this.getServerConnection(), mor);
    }

    public CryptoManager getCryptoManager() {
        final ManagedObjectReference mor = this.getConfigManager().getCryptoManager();
        if (mor == null) {
            return null;
        }
        return new CryptoManager(this.getServerConnection(), mor);
    }

    public HostDatastoreSystem getHostDatastoreSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getDatastoreSystem();
        if (mor == null) {
            return null;
        }
        return new HostDatastoreSystem(this.getServerConnection(), mor);
    }

    public HostDateTimeSystem getHostDateTimeSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getDateTimeSystem();
        if (mor == null) {
            return null;
        }
        return new HostDateTimeSystem(this.getServerConnection(), mor);
    }

    public HostDiagnosticSystem getHostDiagnosticSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getDiagnosticSystem();
        if (mor == null) {
            return null;
        }
        return new HostDiagnosticSystem(this.getServerConnection(), mor);
    }

    public HostEsxAgentHostManager getHostEsxAgentHostManager() {
        final ManagedObjectReference mor = this.getConfigManager().getEsxAgentHostManager();
        if (mor == null) {
            return null;
        }
        return new HostEsxAgentHostManager(this.getServerConnection(), mor);
    }

    public HostFirewallSystem getHostFirewallSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getFirewallSystem();
        if (mor == null) {
            return null;
        }
        return new HostFirewallSystem(this.getServerConnection(),
                mor);
    }

    public HostFirmwareSystem getHostFirmwareSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getFirmwareSystem();
        if (mor == null) {
            return null;
        }
        return new HostFirmwareSystem(this.getServerConnection(), mor);
    }

    public HostGraphicsManager getHostGraphicsManager() {
        final ManagedObjectReference mor = this.getConfigManager().getGraphicsManager();
        if (mor == null) {
            return null;
        }
        return new HostGraphicsManager(this.getServerConnection(), mor);
    }

    public HostHealthStatusSystem getHealthStatusSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getHealthStatusSystem();
        if (mor == null) {
            return null;
        }
        return new HostHealthStatusSystem(this.getServerConnection(), mor);
    }

    public HostAccessManager getHostAccessManager() {
        final ManagedObjectReference mor = this.getConfigManager().getHostAccessManager();
        if (mor == null) {
            return null;
        }
        return new HostAccessManager(this.getServerConnection(), mor);
    }

    public HostImageConfigManager getHostImageConfigManager() {
        final ManagedObjectReference mor = this.getConfigManager().getImageConfigManager();
        if (mor == null) {
            return null;
        }
        return new HostImageConfigManager(this.getServerConnection(), mor);
    }

    public IscsiManager getIscsiManager() {
        final ManagedObjectReference mor = this.getConfigManager().getIscsiManager();
        if (mor == null) {
            return null;
        }
        return new IscsiManager(this.getServerConnection(), mor);
    }

    public HostKernelModuleSystem getHostKernelModuleSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getKernelModuleSystem();
        if (mor == null) {
            return null;
        }
        return new HostKernelModuleSystem(this.getServerConnection(), mor);
    }

    public LicenseManager getLicenseManager() {
        final ManagedObjectReference mor = this.getConfigManager().getLicenseManager();
        if (mor == null) {
            return null;
        }
        return new LicenseManager(this.getServerConnection(), mor);
    }

    public HostMemorySystem getHostMemorySystem() {
        final ManagedObjectReference mor = this.getConfigManager().getMemoryManager();
        if (mor == null) {
            return null;
        }
        return new HostMemorySystem(this.getServerConnection(), mor);
    }

    public MessageBusProxy getMessageBusProxy() {
        final ManagedObjectReference mor = this.getConfigManager().getMessageBusProxy();
        if (mor == null) {
            return null;
        }
        return new MessageBusProxy(this.getServerConnection(), mor);
    }

    public HostNetworkSystem getHostNetworkSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getNetworkSystem();
        if (mor == null) {
            return null;
        }
        return new HostNetworkSystem(this.getServerConnection(), mor);
    }

    public HostNvdimmSystem getHostNvdimmSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getNvdimmSystem();
        if (mor == null) {
            return null;
        }
        return new HostNvdimmSystem(this.getServerConnection(), mor);
    }

    public HostPatchManager getHostPatchManager() {
        final ManagedObjectReference mor = this.getConfigManager().getPatchManager();
        if (mor == null) {
            return null;
        }
        return new HostPatchManager(this.getServerConnection(), mor);
    }

    public HostPciPassthruSystem getHostPciPassthruSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getPciPassthruSystem();
        if (mor == null) {
            return null;
        }
        return new HostPciPassthruSystem(this.getServerConnection(), mor);
    }

    public HostPowerSystem getHostPowerSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getPowerSystem();
        if (mor == null) {
            return null;
        }
        return new HostPowerSystem(this.getServerConnection(), mor);
    }

    public HostServiceSystem getHostServiceSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getServiceSystem();
        if (mor == null) {
            return null;
        }
        return new HostServiceSystem(this.getServerConnection(), mor);
    }

    public HostSnmpSystem getHostSnmpSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getSnmpSystem();
        if (mor == null) {
            return null;
        }
        return new HostSnmpSystem(this.getServerConnection(), mor);
    }

    public HostStorageSystem getHostStorageSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getStorageSystem();
        if (mor == null) {
            return null;
        }
        return new HostStorageSystem(this.getServerConnection(), mor);
    }

    public UserDirectory getUserDirectory() {
        final ManagedObjectReference mor = this.getConfigManager().getUserDirectory();
        if (mor == null) {
            return null;
        }
        return new UserDirectory(this.getServerConnection(), mor);
    }

    public HostVFlashManager getHostVFlashManager() {
        final ManagedObjectReference mor = this.getConfigManager().getvFlashManager();
        if (mor == null) {
            return null;
        }
        return new HostVFlashManager(this.getServerConnection(), mor);
    }

    public HostVirtualNicManager getHostVirtualNicManager() {
        final ManagedObjectReference mor = this.getConfigManager().getVirtualNicManager();
        if (mor == null) {
            return null;
        }
        return new HostVirtualNicManager(this.getServerConnection(), mor);
    }

    @Deprecated(since = "4.0")
    public HostVMotionSystem getHostVMotionSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getVmotionSystem();
        if (mor == null) {
            return null;
        }
        return new HostVMotionSystem(this.getServerConnection(), mor);
    }

    public HostVsanInternalSystem getHostVsanInternalSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getVsanInternalSystem();
        if (mor == null) {
            return null;
        }
        return new HostVsanInternalSystem(this.getServerConnection(), mor);
    }

    public HostVsanSystem getHostVsanSystem() {
        final ManagedObjectReference mor = this.getConfigManager().getVsanSystem();
        if (mor == null) {
            return null;
        }
        return new HostVsanSystem(this.getServerConnection(), mor);
    }

}
