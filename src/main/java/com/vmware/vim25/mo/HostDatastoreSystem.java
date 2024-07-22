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
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * This managed object creates and removes datastores from the host.
 * To a host, a datastore is a storage abstraction that is backed by one of several types of storage volumes:
 * <p>
 * Local file system
 * A datastore that is backed by a local file system volume uses a host native local file system such as NTFS or ext3.
 * The datastore is created by identifying a file path for a directory in which virtual machine data will be stored.
 * When the datastore is deleted, the mapping from the datastore to the file is deleted. The contents of the directory are not deleted.
 * NAS Volume
 * A datastore that is backed by a network-attached storage device is created by specifying the required data needed to attach the volume to the host.
 * Destroying the datastore detaches the volume from the host.
 * VMFS
 * A datastore that is backed by a VMware File System (VMFS) is created by specifying a disk with unpartitioned space,
 * the desired disk partition format on the disk, and some VMFS attributes.
 * An ESX Server system automatically discovers the VMFS volume on attached Logical Unit Numbers (LUNs) on startup and
 * after re-scanning the host bus adapter. Datastores are automatically created. The datastore label is based on the VMFS volume label.
 * If there is a conflict with an existing datastore, it is made unique by appending a suffix. The VMFS volume label will be unchanged.
 * <p>
 * Destroying the datastore removes the partitions that compose the VMFS volume.
 * <p>
 * Datastores are never automatically removed because transient storage connection outages may occur. They must be removed from the host using this interface.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 * @see Datastore
 */
@SuppressWarnings("unused")
public class HostDatastoreSystem extends ManagedObject {

    public HostDatastoreSystem(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public HostDatastoreSystemCapabilities getCapabilities() {
        return getCurrentProperty("capabilities", HostDatastoreSystemCapabilities.class);
    }

    public List<Datastore> getDatastores() {
        final ManagedObjectReference[] datastores = getCurrentProperty("datastore", ManagedObjectReference[].class);
        if (datastores == null) {
            return Collections.emptyList();
        }
        return Arrays.stream(datastores)
                .filter(Objects::nonNull)
                .map(mor -> new Datastore(this.getServerConnection(), mor))
                .collect(Collectors.toList());
    }

    public void configureDatastorePrincipal(final String userName, final String password) throws HostConfigFault, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("userName", String.class, userName),
                new Argument("password", String.class, password));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ConfigureDatastorePrincipal", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
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

    public Datastore createLocalDatastore(final String name, final String path)
            throws HostConfigFault, DuplicateName, FileNotFound, InvalidName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name),
                new Argument("path", String.class, path));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc()
                    .invoke("CreateLocalDatastore", params, ManagedObjectReference.class);
            return new Datastore(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof FileNotFound) {
                throw (FileNotFound) cause;
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

    public Datastore createNasDatastore(final HostNasVolumeSpec spec)
            throws HostConfigFault, DuplicateName, AlreadyExists, NoGateway, NoVirtualNic, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", HostNasVolumeSpec.class, spec));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc()
                    .invoke("CreateNasDatastore", params, ManagedObjectReference.class);
            return new Datastore(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof NoGateway) {
                throw (NoGateway) cause;
            }
            if (cause instanceof NoVirtualNic) {
                throw (NoVirtualNic) cause;
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

    public Datastore createVmfsDatastore(final VmfsDatastoreCreateSpec spec) throws HostConfigFault, DuplicateName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", VmfsDatastoreCreateSpec.class, spec));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc()
                    .invoke("CreateVmfsDatastore", params, ManagedObjectReference.class);
            return new Datastore(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
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

    public Datastore createVvolDatastore(final HostDatastoreSystemVvolDatastoreSpec spec)
            throws DuplicateName, HostConfigFault, InvalidName, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", HostDatastoreSystemVvolDatastoreSpec.class, spec));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc().invoke("CreateVvolDatastore", params, ManagedObjectReference.class);
            return new Datastore(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
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

    public void disableClusteredVmdkSupport(final ManagedObjectReference datastore) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DisableClusteredVmdkSupport", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
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

    public void enableClusteredVmdkSupport(final ManagedObjectReference datastore) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("EnableClusteredVmdkSupport", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
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

    public Datastore expandVmfsDatastore(final Datastore datastore, final VmfsDatastoreExpandSpec spec)
            throws NotFound, HostConfigFault, RuntimeFault {
        if (datastore == null) {
            throw new IllegalArgumentException("datastore should not be null");
        }
        return this.expandVmfsDatastore(datastore.getMOR(), spec);
    }

    public Datastore expandVmfsDatastore(final ManagedObjectReference datastore, final VmfsDatastoreExpandSpec spec)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("spec", VmfsDatastoreExpandSpec.class, spec));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc()
                    .invoke("ExpandVmfsDatastore", params, ManagedObjectReference.class);
            return new Datastore(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
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

    public Datastore extendVmfsDatastore(final Datastore datastore, final VmfsDatastoreExtendSpec spec)
            throws HostConfigFault, NotFound, RuntimeFault {
        if (datastore == null) {
            throw new IllegalArgumentException("datastore should not be null.");
        }
        return this.extendVmfsDatastore(datastore.getMOR(), spec);
    }

    public Datastore extendVmfsDatastore(final ManagedObjectReference datastore, final VmfsDatastoreExtendSpec spec)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("spec", VmfsDatastoreExtendSpec.class, spec));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc()
                    .invoke("ExtendVmfsDatastore", params, ManagedObjectReference.class);
            return new Datastore(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
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

    public List<HostScsiDisk> queryAvailableDisksForVmfs(final Datastore datastore) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore == null ? null : datastore.getMOR()));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryAvailableDisksForVmfs", params, HostScsiDisk.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
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

    public List<HostUnresolvedVmfsVolume> queryUnresolvedVmfsVolumes() throws RuntimeFault {
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("QueryUnresolvedVmfsVolumes", this.getSingleSelfArgumentList(), HostUnresolvedVmfsVolume.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<VmfsDatastoreOption> queryVmfsDatastoreCreateOptions(final String devicePath, final int vmfsMajorVersion)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("devicePath", String.class, devicePath),
                new Argument("vmfsMajorVersion", "int", vmfsMajorVersion));
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("QueryVmfsDatastoreCreateOptions", params, VmfsDatastoreOption.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
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

    public List<VmfsDatastoreOption> queryVmfsDatastoreExtendOptions(final Datastore datastore, final String devicePath, final Boolean suppressExpandCandidates)
            throws HostConfigFault, NotFound, RuntimeFault {
        if (datastore == null) {
            throw new IllegalArgumentException("datastore must not be null.");
        }
        return this.queryVmfsDatastoreExtendOptions(datastore.getMOR(), devicePath, suppressExpandCandidates);
    }

    public List<VmfsDatastoreOption> queryVmfsDatastoreExtendOptions(final ManagedObjectReference datastore, final String devicePath, final Boolean suppressExpandCandidates)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("devicePath", String.class, devicePath),
                new Argument("suppressExpandCandidates", "boolean", suppressExpandCandidates));
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("QueryVmfsDatastoreExtendOptions", params, VmfsDatastoreOption.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
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

    public List<VmfsDatastoreOption> queryVmfsDatastoreExpandOptions(final Datastore datastore)
            throws NotFound, HostConfigFault, RuntimeFault {
        if (datastore == null) {
            throw new IllegalArgumentException("datastore must not be null.");
        }
        return this.queryVmfsDatastoreExpandOptions(datastore.getMOR());
    }

    public List<VmfsDatastoreOption> queryVmfsDatastoreExpandOptions(final ManagedObjectReference datastore)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("QueryVmfsDatastoreExpandOptions", params, VmfsDatastoreOption.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
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

    public void removeDatastore(final Datastore datastore) throws HostConfigFault, ResourceInUse, NotFound, RuntimeFault {
        if (datastore == null) {
            throw new IllegalArgumentException("datastore must not be null.");
        }
        this.removeDatastore(datastore.getMOR());
    }

    public void removeDatastore(final ManagedObjectReference datastore) throws HostConfigFault, ResourceInUse, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveDatastore", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
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

    public Task removeDatastoreEx(final List<ManagedObjectReference> datastore) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference[].class, datastore.toArray()));
        try {
            return this.invokeWithTaskReturn("RemoveDatastoreEx_Task", params);
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

    public Task resignatureUnresolvedVmfsVolume(final HostUnresolvedVmfsResignatureSpec resolutionSpec)
            throws VmfsAmbiguousMount, HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("resolutionSpec", HostUnresolvedVmfsResignatureSpec.class, resolutionSpec));
        try {
            return this.invokeWithTaskReturn("ResignatureUnresolvedVmfsVolume_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmfsAmbiguousMount) {
                throw (VmfsAmbiguousMount) cause;
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

    public void updateLocalSwapDatastore(final Datastore datastore) throws InaccessibleDatastore, DatastoreNotWritableOnHost, RuntimeFault {
        this.updateLocalSwapDatastore(datastore == null ? null : datastore.getMOR());
    }

    public void updateLocalSwapDatastore(final ManagedObjectReference datastore) throws InaccessibleDatastore, DatastoreNotWritableOnHost, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateLocalSwapDatastore", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InaccessibleDatastore) {
                throw (InaccessibleDatastore) cause;
            }
            if (cause instanceof DatastoreNotWritableOnHost) {
                throw (DatastoreNotWritableOnHost) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public long queryMaxQueueDepth(final Datastore datastore) throws NotFound, RuntimeFault {
        if (datastore == null) {
            throw new IllegalArgumentException("datastore must not be null.");
        }
        return this.queryMaxQueueDepth(datastore.getMOR());
    }

    public long queryMaxQueueDepth(final ManagedObjectReference datastore) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        try {
            return this.getVimService().getWsc().invoke("QueryMaxQueueDepth", params, long.class);
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

    public void setMaxQueueDepth(final Datastore datastore, final long maxQdepth) throws NotFound, RuntimeFault {
        if (datastore == null) {
            throw new IllegalArgumentException("datastore must not be null.");
        }
        this.setMaxQueueDepth(datastore.getMOR(), maxQdepth);
    }

    public void setMaxQueueDepth(final ManagedObjectReference datastore, final long maxQdepth) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                Argument.fromBasicType("maxQdepth", maxQdepth));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("SetMaxQueueDepth", params);
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

}
