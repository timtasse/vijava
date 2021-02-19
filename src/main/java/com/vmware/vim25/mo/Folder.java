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
import com.vmware.vim25.mo.util.MorUtil;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * The Folder managed object is a container for storing and organizing inventory objects. Folders can contain folders and other objects.
 * The childType property identifies a folder's type and determines the types of folders and objects the folder can contain.
 *  A folder can contain a child folder of the same type as the parent folder.
 *  All Datacenter objects contain dedicated folders for:
 *      VirtualMachine, templates, and VirtualApp objects.
 *      ComputeResource hierarchies.
 *      Network, DistributedVirtualSwitch, and DistributedVirtualPortgroup objects.
 *      Datastore objects.
 *  A folder can contain child objects of type childType. Virtual machine and network entity folders can also contain additional object types.
 *  The root folder is a data center folder.
 *
 * See ServiceInstance for a representation of the organization of the inventory.
 *
 * The Folder managed object also acts as a factory object, meaning it creates new entities in a folder.
 * The object provides methods to create child folders and objects, methods to add existing objects to folders, and methods to remove objects from folders and to delete folders.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
@SuppressWarnings("unused")
public class Folder extends ManagedEntity {

    public Folder(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    // the array could have different real types, therefore cannot use getManagedObjects()
    public List<ManagedEntity> getChildEntity() {
        return Optional.ofNullable(this.getCurrentProperty("childEntity", ManagedObjectReference[].class))
                .stream()
                .flatMap(Arrays::stream)
                .map(val -> MorUtil.createExactManagedEntity(this.getServerConnection(), val, null))
                .collect(Collectors.toList());
    }

    public List<String> getChildType() {
        return Optional.ofNullable(this.getCurrentProperty("childType", String[].class))
                .map(Arrays::asList)
                .orElse(Collections.emptyList());
    }

    public String getNamespace() {
        return this.getCurrentProperty("namespace", String.class);
    }

    public Task addStandaloneHost(final HostConnectSpec spec, final ComputeResourceConfigSpec compResSpec,
                                       final boolean addConnected, final String license)
            throws AgentInstallFailed, AlreadyBeingManaged, AlreadyConnected, DuplicateName, GatewayToHostTrustVerifyFault,
            GatewayToHostAuthFault, GatewayOperationRefused, GatewayNotReachable, GatewayNotFound, GatewayHostNotReachable,
            GatewayConnectFault, NotSupportedHost, SSLVerifyFault, InvalidLogin, HostConnectFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", HostConnectSpec.class, spec),
                new Argument("compResSpec", ComputeResourceConfigSpec.class, compResSpec),
                Argument.fromBasicType("addConnected", addConnected),
                new Argument("license", String.class, license));
        try {
            return this.invokeWithTaskReturn("AddStandaloneHost_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AgentInstallFailed) {
                throw (AgentInstallFailed) cause;
            }
            if (cause instanceof AlreadyBeingManaged) {
                throw (AlreadyBeingManaged) cause;
            }
            if (cause instanceof AlreadyConnected) {
                throw (AlreadyConnected) cause;
            }
            if (cause instanceof GatewayToHostTrustVerifyFault) {
                throw (GatewayToHostTrustVerifyFault) cause;
            }
            if (cause instanceof GatewayToHostAuthFault) {
                throw (GatewayToHostAuthFault) cause;
            }
            if (cause instanceof GatewayOperationRefused) {
                throw (GatewayOperationRefused) cause;
            }
            if (cause instanceof GatewayNotReachable) {
                throw (GatewayNotReachable) cause;
            }
            if (cause instanceof GatewayNotFound) {
                throw (GatewayNotFound) cause;
            }
            if (cause instanceof GatewayHostNotReachable) {
                throw (GatewayHostNotReachable) cause;
            }
            if (cause instanceof GatewayConnectFault) {
                throw (GatewayConnectFault) cause;
            }
            if (cause instanceof NotSupportedHost) {
                throw (NotSupportedHost) cause;
            }
            if (cause instanceof SSLVerifyFault) {
                throw (SSLVerifyFault) cause;
            }
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof InvalidLogin) {
                throw (InvalidLogin) cause;
            }
            if (cause instanceof HostConnectFault) {
                throw (HostConnectFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task batchAddHostsToCluster(final ManagedObjectReference cluster,
                                       final List<FolderNewHostSpec> newHosts,
                                       final List<ManagedObjectReference> existingHosts,
                                       final ComputeResourceConfigSpec compResSpec,
                                       final String desiredState)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", ManagedObjectReference.class, cluster),
                new Argument("newHosts", "FolderNewHostSpec[]", newHosts.toArray()),
                new Argument("existingHosts", "ManagedObjectReference[]", existingHosts.toArray()),
                new Argument("compResSpec", ComputeResourceConfigSpec.class, compResSpec),
                new Argument("desiredState", "String", desiredState));
        try {
            return this.invokeWithTaskReturn("BatchAddHostsToCluster_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task batchAddStandaloneHosts(final List<FolderNewHostSpec> newHosts,
                                        final ComputeResourceConfigSpec compResSpec,
                                        final boolean addConnected)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("newHosts", "FolderNewHostSpec[]", newHosts.toArray()),
                new Argument("compResSpec", ComputeResourceConfigSpec.class, compResSpec),
                new Argument("addConnected", "boolean", addConnected));
        try {
            return this.invokeWithTaskReturn("BatchAddStandaloneHosts_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "2.5")
    public ClusterComputeResource createCluster(final String name, final ClusterConfigSpec spec)
            throws InvalidName, DuplicateName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name),
                new Argument("spec", ClusterConfigSpec.class, spec));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc()
                    .invoke("CreateCluster", params, ManagedObjectReference.class);
            return new ClusterComputeResource(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
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

    public ClusterComputeResource createClusterEx(final String name, final ClusterConfigSpecEx spec)
            throws InvalidName, DuplicateName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name),
                new Argument("spec", ClusterConfigSpecEx.class, spec));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc()
                    .invoke("CreateClusterEx", params, ManagedObjectReference.class);
            return new ClusterComputeResource(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
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

    public Datacenter createDatacenter(final String name) throws InvalidName, DuplicateName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc()
                    .invoke("CreateDatacenter", params, ManagedObjectReference.class);
            return new Datacenter(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
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

    public Task createDVS(final DVSCreateSpec spec)
            throws DvsNotAuthorized, DvsFault, DuplicateName, InvalidName, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", DVSCreateSpec.class, spec));
        try {
            return this.invokeWithTaskReturn("CreateDVS_Task", params);
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
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Folder createFolder(final String name) throws InvalidName, DuplicateName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc()
                    .invoke("CreateFolder", params, ManagedObjectReference.class);
            return new Folder(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
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

    public StoragePod createStoragePod(final String name) throws DuplicateName, InvalidName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc()
                    .invoke("CreateStoragePod", params, ManagedObjectReference.class);
            return new StoragePod(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
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

    public Task createVM(final VirtualMachineConfigSpec config, final ResourcePool pool, final HostSystem host)
            throws InvalidName, InvalidState, AlreadyExists, VmConfigFault, DuplicateName, FileFault, OutOfBounds,
            InsufficientResourcesFault, InvalidDatastore, FileAlreadyExists, VmWwnConflict, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("config", VirtualMachineConfigSpec.class, config),
                new Argument("pool", ManagedObjectReference.class, pool.getMOR()),
                new Argument("host", ManagedObjectReference.class, host == null ? null : host.getMOR()));
        try {
            return this.invokeWithTaskReturn("CreateVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileAlreadyExists) {
                throw (FileAlreadyExists) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof VmWwnConflict) {
                throw (VmWwnConflict) cause;
            }
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof OutOfBounds) {
                throw (OutOfBounds) cause;
            }
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task moveIntoFolder(final List<ManagedEntity> entities)
            throws VmAlreadyExistsInDatacenter, DuplicateName, InvalidState, InvalidFolder, RuntimeFault {
        if (entities == null) {
            throw new IllegalArgumentException("entities must not be null");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("list", ManagedObjectReference[].class, entities.stream().map(ManagedObject::getMOR).toArray()));
        try {
            return this.invokeWithTaskReturn("MoveIntoFolder_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmAlreadyExistsInDatacenter) {
                throw (VmAlreadyExistsInDatacenter) cause;
            }
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof InvalidFolder) {
                throw (InvalidFolder) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task registerVM(final String path, final String name, final boolean asTemplate,
                                final ResourcePool pool, final HostSystem host)
            throws VmConfigFault, InvalidName, DuplicateName, FileFault, OutOfBounds, InsufficientResourcesFault,
            InvalidDatastore, InvalidState, AlreadyExists, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("path", String.class, path),
                new Argument("name", String.class, name),
                Argument.fromBasicType("asTemplate", asTemplate),
                new Argument("pool", ManagedObjectReference.class, pool == null ? null : pool.getMOR()),
                new Argument("host", ManagedObjectReference.class, host == null ? null : host.getMOR()));
        try {
            return this.invokeWithTaskReturn("RegisterVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof OutOfBounds) {
                throw (OutOfBounds) cause;
            }
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task unregisterAndDestroy() throws InvalidState, ConcurrentAccess, RuntimeFault {
        try {
            return this.invokeWithTaskReturn("UnregisterAndDestroy_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ConcurrentAccess) {
                throw (ConcurrentAccess) cause;
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

}
