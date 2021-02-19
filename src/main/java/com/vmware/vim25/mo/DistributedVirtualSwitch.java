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
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * A DistributedVirtualSwitch managed object is a virtual network switch that is located on a vCenter Server.
 * A distributed virtual switch manages configuration for proxy switches (HostProxySwitch).
 * A proxy switch is located on an ESXi host that is managed by the vCenter Server and is a member of the switch.
 * A distributed switch also provides virtual port state management so that port state is maintained
 * when vCenter Server operations move a virtual machine from one host to another.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.0
 * @since 4.0
 */
@SuppressWarnings("unused")
public class DistributedVirtualSwitch extends ManagedEntity {

    public DistributedVirtualSwitch(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public DVSCapability getCapability() {
        return getCurrentProperty("capability", DVSCapability.class);
    }

    public DVSConfigInfo getConfig() {
        return getCurrentProperty("config", DVSConfigInfo.class);
    }

    public List<DVSNetworkResourcePool> getNetworkResourcePool() {
        return Optional.ofNullable(getCurrentProperty("networkResourcePool", DVSNetworkResourcePool[].class))
                .map(Arrays::asList)
                .orElse(Collections.emptyList());
    }

    public List<DistributedVirtualPortgroup> getPortgroup() {
        return Optional.ofNullable(this.getCurrentProperty("portgroup", ManagedObjectReference[].class)).stream()
                .flatMap(Arrays::stream)
                .map(mor -> new DistributedVirtualPortgroup(this.getServerConnection(), mor))
                .collect(Collectors.toList());
    }

    public DVSRuntimeInfo getRuntime() {
        return getCurrentProperty("runtime", DVSRuntimeInfo.class);
    }

    public DVSSummary getSummary() {
        return getCurrentProperty("summary", DVSSummary.class);
    }

    public String getUuid() {
        return getCurrentProperty("uuid", String.class);
    }

    public Task addPortgroups(final List<DVPortgroupConfigSpec> spec)
            throws DvsNotAuthorized, DvsFault, DuplicateName, InvalidName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", DVPortgroupConfigSpec[].class, spec.toArray()));
        try {
            return this.invokeWithTaskReturn("AddDVPortgroup_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DvsNotAuthorized) {
                throw (DvsNotAuthorized) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "6.0")
    public void addNetworkResourcePool(final List<DVSNetworkResourcePoolConfigSpec> configSpec)
            throws DvsNotAuthorized, DvsFault, InvalidName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("configSpec", DVSNetworkResourcePoolConfigSpec[].class, configSpec.toArray()));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("AddNetworkResourcePool", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DvsNotAuthorized) {
                throw (DvsNotAuthorized) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task addPortgroup(final DVPortgroupConfigSpec spec) throws DvsFault, DuplicateName, InvalidName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", DVPortgroupConfigSpec.class, spec));
        try {
            return this.invokeWithTaskReturn("CreateDVPortgroup_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task reconfigureVmVnicNetworkResourcePool(final List<DvsVmVnicResourcePoolConfigSpec> configSpec)
        throws ConcurrentAccess, ConflictingConfiguration, DvsNotAuthorized, DvsFault, InvalidName, NotFound,
            ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("configSpec", DvsVmVnicResourcePoolConfigSpec[].class, configSpec));
        try {
            return this.invokeWithTaskReturn("DvsReconfigureVmVnicNetworkResourcePool_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ConcurrentAccess) {
                throw (ConcurrentAccess) cause;
            }
            if (cause instanceof ConflictingConfiguration) {
                throw (ConflictingConfiguration) cause;
            }
            if (cause instanceof DvsNotAuthorized) {
                throw (DvsNotAuthorized) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task rollback(final EntityBackupConfig entityBackup) throws RollbackFailure, DvsFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entityBackup", EntityBackupConfig.class, entityBackup));
        try {
            return this.invokeWithTaskReturn("DVSRollback_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RollbackFailure) {
                throw (RollbackFailure) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void enableNetworkResourceManagement(final boolean enable) throws DvsNotAuthorized, DvsFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("enable", enable));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("EnableNetworkResourceManagement", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DvsNotAuthorized) {
                throw (DvsNotAuthorized) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<String> fetchDVPortKeys(final DistributedVirtualSwitchPortCriteria criteria) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("criteria", DistributedVirtualSwitchPortCriteria.class, criteria));
        try {
            return (List<String>) this.getVimService().getWsc()
                    .invoke("FetchDVPortKeys", params, "List.String");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<DistributedVirtualPort> fetchDVPorts(final DistributedVirtualSwitchPortCriteria criteria) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("criteria", DistributedVirtualSwitchPortCriteria.class, criteria));
        try {
            return (List<DistributedVirtualPort>) this.getVimService().getWsc()
                    .invoke("FetchDVPorts", params, "List.DistributedVirtualPort");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public DistributedVirtualPortgroup lookupDvPortGroup(final String portgroupKey) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("portgroupKey", String.class, portgroupKey));
        try {
            return Optional.ofNullable(this.getVimService().getWsc().invoke("LookupDvPortGroup", params, ManagedObjectReference.class))
                    .map(mor -> new DistributedVirtualPortgroup(this.getServerConnection(), (ManagedObjectReference) mor))
                    .orElse(null);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "5.5")
    public Task mergeDvs(final ManagedObjectReference dvs)
            throws InvalidHostState, DvsNotAuthorized, DvsFault, NotFound, ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("dvs", ManagedObjectReference.class, dvs));
        try {
            return this.invokeWithTaskReturn("MergeDvs_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidHostState) {
                throw (InvalidHostState) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof DvsNotAuthorized) {
                throw (DvsNotAuthorized) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "6.0")
    public Task moveDVPort(final List<String> portKey, final String destinationPortgroupKey)
            throws DvsNotAuthorized, DvsFault, NotFound, ConcurrentAccess, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("portKey", String[].class, portKey.toArray()),
                new Argument("destinationPortgroupKey", String.class, destinationPortgroupKey));
        try {
            return this.invokeWithTaskReturn("MoveDVPort_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ConcurrentAccess) {
                throw (ConcurrentAccess) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof DvsNotAuthorized) {
                throw (DvsNotAuthorized) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task performDvsProductSpecOperation(final DistributedVirtualSwitchProductSpecOperationType operation,
                                               final DistributedVirtualSwitchProductSpec productSpec)
            throws TaskInProgress, InvalidState, DvsNotAuthorized, DvsFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("operation", String.class, operation.name()),
                new Argument("productSpec", DistributedVirtualSwitchProductSpec.class, productSpec));
        try {
            return this.invokeWithTaskReturn("PerformDvsProductSpecOperation_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof DvsNotAuthorized) {
                throw (DvsNotAuthorized) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Integer> queryUsedVlanIds() throws RuntimeFault {
        try {
            return (List<Integer>) this.getVimService().getWsc()
                    .invoke("QueryUsedVlanIdInDvs", this.getSingleSelfArgumentList(), "List.Integer");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task reconfigurePort(final List<DVPortConfigSpec> port)
            throws DvsNotAuthorized, DvsFault, NotFound, ResourceInUse, ConcurrentAccess, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("port", DVPortConfigSpec[].class, port.toArray()));
        try {
            return this.invokeWithTaskReturn("ReconfigureDVPort_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof ConcurrentAccess) {
                throw (ConcurrentAccess) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof DvsNotAuthorized) {
                throw (DvsNotAuthorized) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task reconfigure(final DVSConfigSpec spec)
            throws DvsNotAuthorized, DvsFault, ConcurrentAccess, DuplicateName, InvalidState, InvalidName, NotFound,
            VspanDestPortConflict, VspanPortConflict, VspanPromiscuousPortNotSupported, VspanSameSessionPortConflict,
            AlreadyExists, LimitExceeded, ResourceInUse, ResourceNotAvailable, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", DVSConfigSpec.class, spec));
        try {
            return this.invokeWithTaskReturn("ReconfigureDvs_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof ResourceNotAvailable) {
                throw (ResourceNotAvailable) cause;
            }
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof LimitExceeded) {
                throw (LimitExceeded) cause;
            }
            if (cause instanceof ConcurrentAccess) {
                throw (ConcurrentAccess) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof VspanDestPortConflict) {
                throw (VspanDestPortConflict) cause;
            }
            if (cause instanceof VspanPortConflict) {
                throw (VspanPortConflict) cause;
            }
            if (cause instanceof VspanPromiscuousPortNotSupported) {
                throw (VspanPromiscuousPortNotSupported) cause;
            }
            if (cause instanceof VspanSameSessionPortConflict) {
                throw (VspanSameSessionPortConflict) cause;
            }
            if (cause instanceof DvsNotAuthorized) {
                throw (DvsNotAuthorized) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "5.0")
    public Task rectifyHost(final List<ManagedObjectReference> hosts) throws DvsFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("hosts", ManagedObjectReference[].class, hosts.toArray()));
        try {
            return this.invokeWithTaskReturn("RectifyDvsHost_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void refreshPortState(final List<String> portKeys) throws DvsFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("portKeys", String[].class, portKeys != null ? portKeys.toArray() : null));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RefreshDVPortState", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "6.0")
    public void removeNetworkResourcePool(final List<String> key)
            throws DvsNotAuthorized, DvsFault, NotFound, InvalidName, ResourceInUse, RuntimeFault {
        if (key == null) {
            throw new IllegalArgumentException("key must not be null");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("key", String[].class, key.toArray()));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveNetworkResourcePool", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof DvsNotAuthorized) {
                throw (DvsNotAuthorized) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateCapability(final DVSCapability capability) throws DvsNotAuthorized, DvsFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("capability", DVSCapability.class, capability));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateDvsCapability", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DvsNotAuthorized) {
                throw (DvsNotAuthorized) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task updateHealthCheckConfig(final List<DVSHealthCheckConfig> healthCheckConfig)
            throws DvsFault, RuntimeFault {
        if (healthCheckConfig == null) {
            throw new IllegalArgumentException("healthCheckConfig must not be null");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("healthCheckConfig", DVSHealthCheckConfig[].class, healthCheckConfig));
        try {
            return this.invokeWithTaskReturn("UpdateDVSHealthCheckConfig_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "6.0")
    public void updateNetworkResourcePool(final List<DVSNetworkResourcePoolConfigSpec> configSpec)
            throws ConcurrentAccess, DvsNotAuthorized, DvsFault, NotFound, InvalidName, RuntimeFault {
        if (configSpec == null) {
            throw new IllegalArgumentException("configSpec must not be null");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("configSpec", DVSNetworkResourcePoolConfigSpec[].class, configSpec));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateNetworkResourcePool", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ConcurrentAccess) {
                throw (ConcurrentAccess) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof DvsNotAuthorized) {
                throw (DvsNotAuthorized) cause;
            }
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
