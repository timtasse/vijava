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
import java.util.stream.Collectors;

/**
 * This managed object gets and sets configuration information about the host's storage subsystem.
 * The properties and operations are used to configure the host to make storage available for virtual machines.
 * This object contains properties that are specific to ESX Server and general to both the ESX Server system and the hosted architecture.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.3
 */
@SuppressWarnings("unused")
public class HostStorageSystem extends ExtensibleManagedObject {

    public HostStorageSystem(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public HostFileSystemVolumeInfo getFileSystemVolumeInfo() {
        return getCurrentProperty("fileSystemVolumeInfo", HostFileSystemVolumeInfo.class);
    }

    public HostMultipathStateInfo getMultipathStateInfo() {
        return getCurrentProperty("multipathStateInfo", HostMultipathStateInfo.class);
    }

    public HostStorageDeviceInfo getStorageDeviceInfo() {
        return getCurrentProperty("storageDeviceInfo", HostStorageDeviceInfo.class);
    }

    public List<String> getSystemFile() {
        final Optional<String[]> systemFile = Optional.ofNullable(getCurrentProperty("systemFile", String[].class));
        if (systemFile.isEmpty()) {
            return Collections.emptyList();
        }
        return systemFile.stream().flatMap(Arrays::stream).collect(Collectors.toList());
    }

    public void addInternetScsiSendTargets(final String iScsiHbaDevice, final List<HostInternetScsiHbaSendTarget> targets)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("iScsiHbaDevice", String.class, iScsiHbaDevice),
                new Argument("targets", HostInternetScsiHbaSendTarget[].class, targets));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("AddInternetScsiSendTargets", params);
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

    public void addInternetScsiStaticTargets(final String iScsiHbaDevice, final List<HostInternetScsiHbaStaticTarget> targets)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("iScsiHbaDevice", String.class, iScsiHbaDevice),
                new Argument("targets", HostInternetScsiHbaStaticTarget.class, targets));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("AddInternetScsiStaticTargets", params);
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

    public void attachScsiLun(final String lunUuid) throws NotFound, HostConfigFault, InvalidState, RuntimeFault {
        final List<Argument> param = Arrays.asList(this.getSelfArgument(),
                new Argument("lunUuid", String.class, lunUuid));
        try {
            getVimService().getWsc().invokeWithoutReturn("AttachScsiLun", param);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
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

    public Task attachScsiLunEx(final List<String> lunUuid) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunUuid", String[].class, lunUuid.toArray()));
        try {
            return this.invokeWithTaskReturn("AttachScsiLunEx_Task", params);
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

    public void attachVmfsExtent(final String vmfsPath, final HostScsiDiskPartition extent)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsPath", String.class, vmfsPath),
                new Argument("extent", HostScsiDiskPartition.class, extent));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("AttachVmfsExtent", params);
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

    public void changeNFSUserPassword(final String password) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("password", String.class, password));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ChangeNFSUserPassword", params);
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

    public void clearNFSUser() throws HostConfigFault, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ClearNFSUser", this.getSingleSelfArgumentList());
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

    //SDK4.1 signature for back compatibility
    public HostDiskPartitionInfo computeDiskPartitionInfo(final String devicePath, final HostDiskPartitionLayout layout)
            throws HostConfigFault, NotFound, RuntimeFault {
        return this.computeDiskPartitionInfo(devicePath, layout, null);
    }

    //SDK5.0 signature
    public HostDiskPartitionInfo computeDiskPartitionInfo(final String devicePath, final HostDiskPartitionLayout layout,
                                                          final String partitionFormat)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("devicePath", String.class, devicePath),
                new Argument("layout", HostDiskPartitionLayout.class, layout),
                new Argument("partitionFormat", String.class, partitionFormat));
        try {
            return this.getVimService().getWsc().invoke("ComputeDiskPartitionInfo", params, HostDiskPartitionInfo.class);
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

    //SDK4.1 signature for back compatibility
    public HostDiskPartitionInfo computeDiskPartitionInfoForResize(final HostScsiDiskPartition partition,
                                                                   final HostDiskPartitionBlockRange blockRange)
            throws NotFound, HostConfigFault, RuntimeFault {
        return this.computeDiskPartitionInfoForResize(partition, blockRange, null);
    }

    //SDK5.0 signature
    public HostDiskPartitionInfo computeDiskPartitionInfoForResize(final HostScsiDiskPartition partition,
                                                                   final HostDiskPartitionBlockRange blockRange,
                                                                   final String partitionFormat)
            throws NotFound, HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("partition", HostScsiDiskPartition.class, partition),
                new Argument("blockRange", HostDiskPartitionBlockRange.class, blockRange),
                new Argument("partitionFormat", String.class, partitionFormat));
        try {
            return this.getVimService().getWsc().invoke("ComputeDiskPartitionInfoForResize", params, HostDiskPartitionInfo.class);
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

    public void connectNvmeController(final HostNvmeConnectSpec connectSpec) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("connectSpec", HostNvmeConnectSpec.class, connectSpec));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ConnectNvmeController", params);
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

    public Task connectNvmeControllerEx(final List<HostNvmeConnectSpec> connectSpec) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("connectSpec", HostNvmeConnectSpec[].class, connectSpec == null ? null : connectSpec.toArray()));
        try {
            return this.invokeWithTaskReturn("ConnectNvmeControllerEx_Task", params);
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

    public void createNvmeOverRdmaAdapter(final String rdmaDeviceName) throws ResourceInUse, HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("rdmaDeviceName", String.class, rdmaDeviceName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("CreateNvmeOverRdmaAdapter", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
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

    public void createSoftwareAdapter(final HostHbaCreateSpec spec) throws HostConfigFault, NotFound, ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(), new Argument("spec", HostHbaCreateSpec.class, spec));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("CreateSoftwareAdapter", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
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

    public void deleteScsiLunState(final String lunCanonicalName) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunCanonicalName", String.class, lunCanonicalName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DeleteScsiLunState", params);
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

    public void deleteVffsVolumeState(final String vffsUuid) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vffsUuid", String.class, vffsUuid));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DeleteVffsVolumeState", params);
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

    public void deleteVmfsVolumeState(final String vmfsUuid) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", String.class, vmfsUuid));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DeleteVmfsVolumeState", params);
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

    public void destroyVffs(final String vffsPath) throws NotFound, HostConfigFault, ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vffsPath", String.class, vffsPath));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DestroyVffs", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
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

    public void detachScsiLun(final String lunUuid) throws NotFound, HostConfigFault, InvalidState, ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunUuid", String.class, lunUuid));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DetachScsiLun", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
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

    public Task detachScsiLunEx(final List<String> lunUuid) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunUuid", String[].class, lunUuid.toArray()));
        try {
            return this.invokeWithTaskReturn("DetachScsiLunEx_Task", params);
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

    public void disableMultipathPath(final String pathName) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("pathName", String.class, pathName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DisableMultipathPath", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
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

    public void disconnectNvmeController(final HostNvmeDisconnectSpec disconnectSpec)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("disconnectSpec", HostNvmeDisconnectSpec.class, disconnectSpec));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DisconnectNvmeController", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
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

    public Task disconnectNvmeControllerEx(final List<HostNvmeDisconnectSpec> disconnectSpec) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(), new Argument("disconnectSpec",
                HostNvmeDisconnectSpec[].class, disconnectSpec == null ? null : disconnectSpec.toArray()));
        try {
            return this.invokeWithTaskReturn("DisconnectNvmeControllerEx_Task", params);
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

    public void discoverFcoeHbas(final FcoeConfigFcoeSpecification fcoeSpec)
            throws FcoeFaultPnicHasNoPortSet, HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("fcoeSpec", FcoeConfigFcoeSpecification.class, fcoeSpec));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DiscoverFcoeHbas", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FcoeFaultPnicHasNoPortSet) {
                throw (FcoeFaultPnicHasNoPortSet) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
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

    public HostNvmeDiscoveryLog discoverNvmeControllers(final HostNvmeDiscoverSpec discoverSpec)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("discoverSpec", HostNvmeDiscoverSpec.class, discoverSpec));
        try {
            return this.getVimService().getWsc().invoke("DiscoverNvmeControllers", params, HostNvmeDiscoveryLog.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
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

    public void enableMultipathPath(final String pathName) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("pathName", String.class, pathName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("EnableMultipathPath", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
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

    public void expandVmfsExtent(final String vmfsPath, final HostScsiDiskPartition extent)
            throws NotFound, HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsPath", String.class, vmfsPath),
                new Argument("extent", HostScsiDiskPartition.class, extent));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ExpandVmfsExtent", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
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

    public void extendVffs(final String vffsPath, final String devicePath, final HostDiskPartitionSpec spec)
            throws NotFound, HostConfigFault, ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vffsPath", String.class, vffsPath),
                new Argument("devicePath", String.class, devicePath),
                new Argument("spec", HostDiskPartitionSpec.class, spec));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ExtendVffs", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
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

    public HostVffsVolume formatVffs(final HostVffsSpec createSpec)
            throws AlreadyExists, HostConfigFault, ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("createSpec", HostVffsSpec.class, createSpec));
        try {
            return this.getVimService().getWsc().invoke("FormatVffs", params, HostVffsVolume.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
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

    public HostVmfsVolume formatVmfs(final HostVmfsSpec createSpec) throws HostConfigFault, AlreadyExists, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("createSpec", HostVmfsSpec.class, createSpec));
        try {
            return this.getVimService().getWsc().invoke("FormatVmfs", params, HostVmfsVolume.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
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

    public Task markAsLocal(final String scsiDiskUuid) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("scsiDiskUuid", String.class, scsiDiskUuid));
        try {
            return this.invokeWithTaskReturn("MarkAsLocal_Task", params);
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

    public Task markAsNonLocal(final String scsiDiskUuid) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("scsiDiskUuid", String.class, scsiDiskUuid));
        try {
            return this.invokeWithTaskReturn("MarkAsNonLocal_Task", params);
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

    public Task markAsNonSsd(final String scsiDiskUuid) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("scsiDiskUuid", String.class, scsiDiskUuid));
        try {
            return this.invokeWithTaskReturn("MarkAsNonSsd_Task", params);
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

    public Task markAsSsd(final String scsiDiskUuid) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("scsiDiskUuid", String.class, scsiDiskUuid));
        try {
            return this.invokeWithTaskReturn("MarkAsSsd_Task", params);
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

    public void markForRemoval(final String hbaName, final boolean remove) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("hbaName", String.class, hbaName),
                new Argument("remove", "boolean", remove));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("MarkForRemoval", params);
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

    public void markPerenniallyReserved(final String lunUuid, final boolean state) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunUuid", String.class, lunUuid),
                new Argument("state", "boolean", state));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("MarkPerenniallyReserved", params);
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

    public Task markPerenniallyReservedEx(final List<String> lunUuid, final boolean state) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunUuid", String[].class, lunUuid.toArray()),
                Argument.fromBasicType("state", state));
        try {
            return this.invokeWithTaskReturn("MarkPerenniallyReservedEx_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void mountVffsVolume(final String vffsUuid) throws NotFound, InvalidState, HostConfigFault, ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vffsUuid", String.class, vffsUuid));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("MountVffsVolume", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
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

    public void mountVmfsVolume(final String vmfsUuid) throws NotFound, InvalidState, HostConfigFault, ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", String.class, vmfsUuid));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("MountVmfsVolume", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
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

    public Task mountVmfsVolumeEx(final List<String> vmfsUuid) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", String[].class, vmfsUuid.toArray()));
        try {
            return this.invokeWithTaskReturn("MountVmfsVolumeEx_Task", params);
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

    public List<HostScsiDisk> queryAvailableSsds(final String vffsPath) throws NotFound, HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vffsPath", String.class, vffsPath));
        try {
            return getVimService().getWsc()
                    .invokeWithListReturn("QueryAvailableSsds", params, HostScsiDisk.class);
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

    public HostNasVolumeUserInfo queryNFSUser() throws HostConfigFault, RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("QueryNFSUser", this.getSingleSelfArgumentList(), HostNasVolumeUserInfo.class);
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

    public List<HostPathSelectionPolicyOption> queryPathSelectionPolicyOptions() throws HostConfigFault, RuntimeFault {
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryPathSelectionPolicyOptions",
                            this.getSingleSelfArgumentList(),
                            HostPathSelectionPolicyOption.class);
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

    public List<HostStorageArrayTypePolicyOption> queryStorageArrayTypePolicyOptions() throws HostConfigFault, RuntimeFault {
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryStorageArrayTypePolicyOptions",
                            this.getSingleSelfArgumentList(),
                            HostStorageArrayTypePolicyOption.class);
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

    public List<HostUnresolvedVmfsVolume> queryUnresolvedVmfsVolume() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryUnresolvedVmfsVolume",
                            this.getSingleSelfArgumentList(),
                            HostUnresolvedVmfsVolume.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<VmfsConfigOption> queryVmfsConfigOption() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryVmfsConfigOption",
                    this.getSingleSelfArgumentList(), VmfsConfigOption.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void refreshStorageSystem() throws RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RefreshStorageSystem", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void removeInternetScsiSendTargets(final String iScsiHbaDevice, final List<HostInternetScsiHbaSendTarget> targets)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("iScsiHbaDevice", String.class, iScsiHbaDevice),
                new Argument("targets", HostInternetScsiHbaSendTarget[].class, targets));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveInternetScsiSendTargets", params);
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

    public void removeInternetScsiStaticTargets(final String iScsiHbaDevice, final List<HostInternetScsiHbaStaticTarget> targets)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("iScsiHbaDevice", String.class, iScsiHbaDevice),
                new Argument("targets", HostInternetScsiHbaStaticTarget[].class, targets));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveInternetScsiStaticTargets", params);
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

    public void removeNvmeOverRdmaAdapter(final String hbaDeviceName) throws HostConfigFault, NotFound, ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("hbaDeviceName", String.class, hbaDeviceName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveNvmeOverRdmaAdapter", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
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

    public void removeSoftwareAdapter(final String hbaDeviceName) throws HostConfigFault, NotFound, ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(), new Argument("hbaDeviceName", String.class, hbaDeviceName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveSoftwareAdapter", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
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

    public void rescanAllHba() throws HostConfigFault, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RescanAllHba", this.getSingleSelfArgumentList());
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

    public void rescanHba(final String hbaDevice) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("hbaDevice", String.class, hbaDevice));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RescanHba", params);
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

    public void rescanVffs() throws HostConfigFault, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RescanVffs", this.getSingleSelfArgumentList());
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

    public void rescanVmfs() throws HostConfigFault, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RescanVmfs", this.getSingleSelfArgumentList());
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

    public List<HostUnresolvedVmfsResolutionResult> resolveMultipleUnresolvedVmfsVolumes(final List<HostUnresolvedVmfsResolutionSpec> resolutionSpec)
            throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("resolutionSpec", HostUnresolvedVmfsResolutionSpec[].class, resolutionSpec.toArray()));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("ResolveMultipleUnresolvedVmfsVolumes",
                    params, HostUnresolvedVmfsResolutionResult.class);
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

    public Task resolveMultipleUnresolvedVmfsVolumesEx(final List<HostUnresolvedVmfsResolutionSpec> resolutionSpec)
            throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("resolutionSpec", HostUnresolvedVmfsResolutionSpec[].class, resolutionSpec.toArray()));
        try {
            return this.invokeWithTaskReturn("ResolveMultipleUnresolvedVmfsVolumesEx_Task", params);
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

    public List<HostDiskPartitionInfo> retrieveDiskPartitionInfo(final List<String> devicePath) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("devicePath", String[].class, devicePath.toArray()));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("RetrieveDiskPartitionInfo",
                    params, HostDiskPartitionInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void setMultipathLunPolicy(final String lunId, final HostMultipathInfoLogicalUnitPolicy policy)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunId", String.class, lunId),
                new Argument("policy", HostMultipathInfoLogicalUnitPolicy.class, policy));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("SetMultipathLunPolicy", params);
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

    public void setNFSUser(final String user, final String password) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("user", String.class, user),
                new Argument("password", String.class, password));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("SetNFSUser", params);
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

    public Task turnDiskLocatorLedOff(final List<String> scsiDiskUuids) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("scsiDiskUuids", String[].class, scsiDiskUuids.toArray()));
        try {
            return this.invokeWithTaskReturn("TurnDiskLocatorLedOff_Task", params);
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

    public Task turnDiskLocatorLedOn(final List<String> scsiDiskUuids) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("scsiDiskUuids", String[].class, scsiDiskUuids.toArray()));
        try {
            return this.invokeWithTaskReturn("TurnDiskLocatorLedOn_Task", params);
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

    public Task unmapVmfsVolumeEx(final List<String> vmfsUuid) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", String[].class, vmfsUuid.toArray()));
        try {
            return this.invokeWithTaskReturn("UnmapVmfsVolumeEx_Task", params);
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

    public void unmountForceMountedVmfsVolume(final String vmfsUuid) throws NotFound, HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", String.class, vmfsUuid));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UnmountForceMountedVmfsVolume", params);
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

    public void unmountVffsVolume(final String vffsUuid) throws NotFound, InvalidState, HostConfigFault, ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vffsUuid", String.class, vffsUuid));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UnmountVffsVolume", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
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

    public void unmountVmfsVolume(final String vmfsUuid) throws NotFound, InvalidState, HostConfigFault, ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", String.class, vmfsUuid));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UnmountVmfsVolume", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
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

    public Task unmountVmfsVolumeEx(final List<String> vmfsUuids) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", "String[]", vmfsUuids.toArray()));
        try {
            return this.invokeWithTaskReturn("UnmountVmfsVolumeEx_Task", params);
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

    public void updateDiskPartitions(final String devicePath, final HostDiskPartitionSpec spec)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("devicePath", String.class, devicePath),
                new Argument("spec", HostDiskPartitionSpec.class, spec));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateDiskPartitions", params);
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

    public void updateHppMultipathLunPolicy(final String lunId, final HostMultipathInfoHppLogicalUnitPolicy policy)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunId", String.class, lunId),
                new Argument("policy", HostMultipathInfoHppLogicalUnitPolicy.class, policy));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateHppMultipathLunPolicy", params);
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
    public void updateInternetScsiAdvancedOptions(final String iScsiHbaDevice, final HostInternetScsiHbaTargetSet targetSet,
                                                  final List<HostInternetScsiHbaParamValue> options)
            throws NotFound, HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("iScsiHbaDevice", String.class, iScsiHbaDevice),
                new Argument("targetSet", HostInternetScsiHbaTargetSet.class, targetSet),
                new Argument("options", HostInternetScsiHbaParamValue[].class, options.toArray()));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateInternetScsiAdvancedOptions", params);
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

    public void updateInternetScsiAlias(final String iScsiHbaDevice, final String iScsiAlias)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("iScsiHbaDevice", String.class, iScsiHbaDevice),
                new Argument("iScsiAlias", String.class, iScsiAlias));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateInternetScsiAlias", params);
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

    //SDK2.5 signature for back compatibility
    public void updateInternetScsiAuthenticationProperties(final String iScsiHbaDevice,
                                                           final HostInternetScsiHbaAuthenticationProperties authenticationProperties)
            throws HostConfigFault, NotFound, RuntimeFault {
        this.updateInternetScsiAuthenticationProperties(iScsiHbaDevice, authenticationProperties, null);
    }

    public void updateInternetScsiAuthenticationProperties(final String iScsiHbaDevice,
                                                           final HostInternetScsiHbaAuthenticationProperties authenticationProperties,
                                                           final HostInternetScsiHbaTargetSet targetSet)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("iScsiHbaDevice", String.class, iScsiHbaDevice),
                new Argument("authenticationProperties", HostInternetScsiHbaAuthenticationProperties.class, authenticationProperties),
                new Argument("targetSet", HostInternetScsiHbaTargetSet.class, targetSet));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateInternetScsiAuthenticationProperties", params);
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

    public void updateInternetScsiDigestProperties(final String iScsiHbaDevice, final HostInternetScsiHbaTargetSet targetSet,
                                                   final HostInternetScsiHbaDigestProperties digestProperties)
            throws NotFound, HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("iScsiHbaDevice", String.class, iScsiHbaDevice),
                new Argument("targetSet", HostInternetScsiHbaTargetSet.class, targetSet),
                new Argument("digestProperties", HostInternetScsiHbaDigestProperties.class, digestProperties));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateInternetScsiDigestProperties", params);
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

    public void updateInternetScsiDiscoveryProperties(final String iScsiHbaDevice, final HostInternetScsiHbaDiscoveryProperties discoveryProperties)
            throws NotFound, RuntimeFault, HostConfigFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("iScsiHbaDevice", String.class, iScsiHbaDevice),
                new Argument("discoveryProperties", HostInternetScsiHbaDiscoveryProperties.class, discoveryProperties));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateInternetScsiDiscoveryProperties", params);
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

    public void updateInternetScsiIPProperties(final String iScsiHbaDevice, final HostInternetScsiHbaIPProperties ipProperties)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("iScsiHbaDevice", String.class, iScsiHbaDevice),
                new Argument("ipProperties", HostInternetScsiHbaIPProperties.class, ipProperties));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateInternetScsiIPProperties", params);
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

    public void updateInternetScsiName(final String iScsiHbaDevice, final String iScsiName)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("iScsiHbaDevice", String.class, iScsiHbaDevice),
                new Argument("iScsiName", String.class, iScsiName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateInternetScsiName", params);
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

    public void updateScsiLunDisplayName(final String lunUuid, final String displayName)
            throws NotFound, HostConfigFault, InvalidName, DuplicateName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunUuid", String.class, lunUuid),
                new Argument("displayName", String.class, displayName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateScsiLunDisplayName", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
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

    public void updateSoftwareInternetScsiEnabled(final boolean enabled) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("enabled", enabled));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateSoftwareInternetScsiEnabled", params);
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

    public void updateVmfsUnmapBandwidth(final String vmfsUuid, final VmfsUnmapBandwidthSpec unmapBandwidthSpec) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", String.class, vmfsUuid),
                new Argument("unmapBandwidthSpec", VmfsUnmapBandwidthSpec.class, unmapBandwidthSpec)
        );
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateVmfsUnmapBandwidth", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateVmfsUnmapPriority(final String vmfsUuid, final String unmapPriority) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", String.class, vmfsUuid),
                new Argument("unmapPriority", String.class, unmapPriority)
        );
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateVmfsUnmapPriority", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void upgradeVmfs(final String vmfsPath) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsPath", String.class, vmfsPath));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpgradeVmfs", params);
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

    public void upgradeVmLayout() throws RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpgradeVmLayout", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
