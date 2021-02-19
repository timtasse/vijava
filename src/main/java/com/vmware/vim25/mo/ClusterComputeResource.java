/*================================================================================
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
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * The ClusterComputeResource data object aggregates the compute resources of
 * associated HostSystem objects into a single compute resource for use by virtual machines.
 * The cluster services such as HA (High Availability), DRS (Distributed Resource Scheduling),
 * and EVC (Enhanced vMotion Compatibility), enhance the utility of this single compute resource.
 * Use the Folder.CreateClusterEx method to create an instance of this object.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
@SuppressWarnings("unused")
public class ClusterComputeResource extends ComputeResource {

    public ClusterComputeResource(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public List<ClusterActionHistory> getActionHistory() {
        return Optional.ofNullable(this.getCurrentProperty("actionHistory", ClusterActionHistory[].class))
                .map(Arrays::asList)
                .orElse(Collections.emptyList());
    }

    @Deprecated
    public ClusterConfigInfo getConfiguration() {
        return getCurrentProperty("configuration", ClusterConfigInfo.class);
    }

    public List<ClusterDrsFaults> getDrsFault() {
        return Optional.ofNullable(getCurrentProperty("drsFault", ClusterDrsFaults[].class))
                .map(Arrays::asList)
                .orElse(Collections.emptyList());
    }

    @Deprecated
    public List<ClusterDrsRecommendation> getDrsRecommendation() {
        return Optional.ofNullable(getCurrentProperty("drsRecommendation", ClusterDrsRecommendation[].class))
                .map(Arrays::asList)
                .orElse(Collections.emptyList());
    }

    public ClusterComputeResourceHCIConfigInfo getClusterComputeResourceHCIConfigInfo() {
        return this.getCurrentProperty("hciConfig", ClusterComputeResourceHCIConfigInfo.class);
    }

    public List<ClusterDrsMigration> getMigrationHistory() {
        return Optional.ofNullable(getCurrentProperty("migrationHistory", ClusterDrsMigration[].class))
                .map(Arrays::asList)
                .orElse(Collections.emptyList());
    }

    public List<ClusterRecommendation> getRecommendation() {
        return Optional.ofNullable(getCurrentProperty("recommendation", ClusterRecommendation[].class))
                .map(Arrays::asList)
                .orElse(Collections.emptyList());
    }

    public void abandonHciWorkflow() throws InvalidState, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("AbandonHciWorkflow", this.getSingleSelfArgumentList());
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

    public Task addHost(final HostConnectSpec spec, final boolean asConnected, final ManagedObjectReference resourcePool, final String license)
            throws AgentInstallFailed, AlreadyBeingManaged, AlreadyConnected, DuplicateName, GatewayConnectFault, GatewayHostNotReachable,
            GatewayNotFound, GatewayNotReachable, GatewayOperationRefused, GatewayToHostAuthFault, GatewayToHostTrustVerifyFault,
            HostConnectFault, InvalidLogin, NoHost, NotSupportedHost, RuntimeFault, SSLVerifyFault, TooManyHosts {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", HostConnectSpec.class, spec),
                Argument.fromBasicType("asConnected", asConnected),
                new Argument("resourcePool", ManagedObjectReference.class, resourcePool),
                new Argument("license", String.class, license));
        try {
            return this.invokeWithTaskReturn("AddHost_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof AgentInstallFailed) {
                throw (AgentInstallFailed) cause;
            }
            if (cause instanceof AlreadyBeingManaged) {
                throw (AlreadyBeingManaged) cause;
            }
            if (cause instanceof AlreadyConnected) {
                throw (AlreadyConnected) cause;
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
            if (cause instanceof NoHost) {
                throw (NoHost) cause;
            }
            if (cause instanceof NotSupportedHost) {
                throw (NotSupportedHost) cause;
            }
            if (cause instanceof SSLVerifyFault) {
                throw (SSLVerifyFault) cause;
            }
            if (cause instanceof TooManyHosts) {
                throw (TooManyHosts) cause;
            }
            if (cause instanceof GatewayConnectFault) {
                throw (GatewayConnectFault) cause;
            }
            if (cause instanceof HostConnectFault) {
                throw (HostConnectFault) cause;
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

    public void applyRecommendation(final String key) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("key", String.class, key));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ApplyRecommendation", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void cancelRecommendation(final String key) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("key", String.class, key));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("CancelRecommendation", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public ClusterEnterMaintenanceResult enterMaintenanceMode(final List<ManagedObjectReference> host, final List<OptionValue> option)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference[].class, host.toArray()),
                new Argument("option", OptionValue[].class, option.toArray()));
        try {
            return this.getVimService().getWsc().invoke("ClusterEnterMaintenanceMode", params, ClusterEnterMaintenanceResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task configureHCI(final ClusterComputeResourceHCIConfigSpec clusterSpec, final List<ClusterComputeResourceHostConfigurationInput> hostInputs)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("clusterSpec", ClusterComputeResourceHCIConfigSpec.class, clusterSpec),
                new Argument("hostInputs", "ClusterComputeResourceHostConfigurationInput[]", hostInputs.toArray()));
        try {
            return this.invokeWithTaskReturn("ConfigureHCI_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public ClusterEVCManager getEvcManager() throws RuntimeFault {
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc()
                    .invoke("EvcManager", this.getSingleSelfArgumentList(), ManagedObjectReference.class);
            if (mor == null) {
                return null;
            }
            return new ClusterEVCManager(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task extendHCI(final List<ClusterComputeResourceHostConfigurationInput> hostInputs, final SDDCBase vSanConfigSpec)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("hostInputs", "ClusterComputeResourceHostConfigurationInput[]", hostInputs),
                new Argument("vSanConfigSpec", SDDCBase.class, vSanConfigSpec));
        try {
            return this.invokeWithTaskReturn("ExtendHCI_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<ClusterRuleInfo> findRulesForVm(final ManagedObjectReference vm) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, vm));
        try {
            return (List<ClusterRuleInfo>) this.getVimService().getWsc().invoke("FindRulesForVm", params, "List.ClusterRuleInfo");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public ClusterResourceUsageSummary getResourceUsage() throws RuntimeFault {
        try {
            return this.getVimService().getWsc()
                    .invoke("GetResourceUsage", this.getSingleSelfArgumentList(), ClusterResourceUsageSummary.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task moveHostInto(final ManagedObjectReference host, final ManagedObjectReference resourcePool)
            throws InvalidState, RuntimeFault, TooManyHosts {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference.class, host),
                new Argument("resourcePool", ManagedObjectReference.class, resourcePool));
        try {
            return this.invokeWithTaskReturn("MoveHostInto_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof TooManyHosts) {
                throw (TooManyHosts) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task moveInto(final List<ManagedObjectReference> host) throws DuplicateName, InvalidState, RuntimeFault, TooManyHosts {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference[].class, host.toArray()));
        try {
            return this.invokeWithTaskReturn("MoveInto_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof TooManyHosts) {
                throw (TooManyHosts) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public PlacementResult placeVm(final PlacementSpec placementSpec) throws InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("placementSpec", PlacementSpec.class, placementSpec));
        try {
            return this.getVimService().getWsc().invoke("PlaceVm", params, PlacementResult.class);
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

    @Deprecated
    @SuppressWarnings("unchecked")
    public List<ClusterHostRecommendation> recommendHostsForVm(final VirtualMachine vm, final ResourcePool pool)
            throws RuntimeFault {
        if (vm == null) {
            throw new IllegalArgumentException("vm must not be null.");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, vm.getMOR()),
                new Argument("pool", ManagedObjectReference.class, pool == null ? null : pool.getMOR()));
        try {
            return (List<ClusterHostRecommendation>) this.getVimService().getWsc()
                    .invoke("RecommendHostsForVm", params, "List.ClusterHostRecommendation");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated
    public Task reconfigureCluster(final ClusterConfigSpec spec, final boolean modify) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", ClusterConfigSpec.class, spec),
                new Argument("modify", "boolean", modify));
        try {
            return this.invokeWithTaskReturn("ReconfigureCluster_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void refreshRecommendation() throws RuntimeFault {
        try {
            getVimService().getWsc().invokeWithoutReturn("RefreshRecommendation", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public ClusterDasAdvancedRuntimeInfo retrieveDasAdvancedRuntimeInfo() throws RuntimeFault {
        try {
            return this.getVimService().getWsc()
                    .invoke("RetrieveDasAdvancedRuntimeInfo", this.getSingleSelfArgumentList(), ClusterDasAdvancedRuntimeInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void setCryptoMode(final String cryptoMode) throws InvalidArgument, InvalidRequest, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cryptoMode", String.class, cryptoMode));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("SetCryptoMode", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidArgument) {
                throw (InvalidArgument) cause;
            }
            if (cause instanceof InvalidRequest) {
                throw (InvalidRequest) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task stampAllRulesWithUuid() throws RuntimeFault {
        try {
            return this.invokeWithTaskReturn("StampAllRulesWithUuid_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<ClusterComputeResourceValidationResultBase> validateHCIConfiguration(
            final ClusterComputeResourceHCIConfigSpec hciConfigSpec, final List<ManagedObjectReference> hosts)
            throws InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("hciConfigSpec", ClusterComputeResourceHCIConfigSpec.class, hciConfigSpec),
                new Argument("hosts", "ManagedObjectReference[]", hosts));
        try {
            return (List<ClusterComputeResourceValidationResultBase>) this.getVimService().getWsc()
                    .invoke("ValidateHCIConfiguration", params, "List.ClusterComputeResourceValidationResultBase");
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

}
