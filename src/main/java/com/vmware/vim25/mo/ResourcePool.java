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
 * Represents a set of physical resources: a single host, a subset of a host's resources, or resources spanning multiple hosts.
 * Resource pools can be subdivided by creating child resource pools.
 * In order to run, a virtual machine must be associated as a child of a resource pool.
 * <p>
 * In a parent/child hierarchy of resource pools and virtual machines,
 * the single resource pool that has no parent pool is known as the root resource pool.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
@SuppressWarnings("unused")
public class ResourcePool extends ManagedEntity {

    public ResourcePool(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public List<ResourceConfigSpec> getChildConfiguration() {
        return Optional.ofNullable(this.getCurrentProperty("childConfiguration", ResourceConfigSpec[].class))
                .map(Arrays::asList)
                .orElse(Collections.emptyList());
    }

    public ResourceConfigSpec getConfig() {
        return this.getCurrentProperty("config", ResourceConfigSpec.class);
    }

    public String getNamespace() {
        return this.getCurrentProperty("namespace", String.class);
    }

    public ComputeResource getOwner() {
        return (ComputeResource) this.getManagedObject("owner");
    }

    public List<ResourcePool> getResourcePools() {
        return getResourcePools("resourcePool");
    }

    public ResourcePoolRuntimeInfo getRuntime() {
        return this.getCurrentProperty("runtime", ResourcePoolRuntimeInfo.class);
    }

    public ResourcePoolSummary getSummary() {
        return this.getCurrentProperty("summary", ResourcePoolSummary.class);
    }

    public List<VirtualMachine> getVMs() {
        return getVms("vm");
    }

    public Task createChildVM(final VirtualMachineConfigSpec config, final ManagedObjectReference host)
            throws VmWwnConflict, VmConfigFault, InvalidDatastore, FileAlreadyExists, FileFault, OutOfBounds, InvalidName,
            InvalidDatastore, InsufficientResourcesFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("config", VirtualMachineConfigSpec.class, config),
                new Argument("host", ManagedObjectReference.class, host));
        try {
            return this.invokeWithTaskReturn("CreateChildVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmWwnConflict) {
                throw (VmWwnConflict) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof FileAlreadyExists) {
                throw (FileAlreadyExists) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof OutOfBounds) {
                throw (OutOfBounds) cause;
            }
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
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

    public ResourcePool createResourcePool(final String name, final ResourceConfigSpec spec)
            throws InvalidName, DuplicateName, InsufficientResourcesFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name),
                new Argument("spec", ResourceConfigSpec.class, spec));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc().invoke("CreateResourcePool", params, ManagedObjectReference.class);
            return new ResourcePool(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
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

    public VirtualApp createVApp(final String name, final ResourceConfigSpec resSpec, final VAppConfigSpec configSpec, final Folder vmFolder)
            throws InvalidName, DuplicateName, InsufficientResourcesFault, InvalidState, VmConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name),
                new Argument("resSpec", ResourceConfigSpec.class, resSpec),
                new Argument("configSpec", VAppConfigSpec.class, configSpec),
                new Argument("vmFolder", ManagedObjectReference.class, vmFolder == null ? null : vmFolder.getMOR()));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc().invoke("CreateVApp", params, ManagedObjectReference.class);
            return new VirtualApp(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
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

    public void destroyChildren() throws RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DestroyChildren", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public HttpNfcLease importVApp(final ImportSpec spec, final ManagedObjectReference folder, final ManagedObjectReference host)
            throws VmWwnConflict, VmConfigFault, FileAlreadyExists, FileFault, OutOfBounds, DuplicateName, InvalidName,
            InsufficientResourcesFault, InvalidDatastore, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", ImportSpec.class, spec),
                new Argument("folder", ManagedObjectReference.class, folder),
                new Argument("host", ManagedObjectReference.class, host));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc().invoke("ImportVApp", params, ManagedObjectReference.class);
            return new HttpNfcLease(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmWwnConflict) {
                throw (VmWwnConflict) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof FileAlreadyExists) {
                throw (FileAlreadyExists) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof OutOfBounds) {
                throw (OutOfBounds) cause;
            }
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void moveIntoResourcePool(final List<ManagedEntity> entities)
            throws DuplicateName, InsufficientResourcesFault, RuntimeFault {
        if (entities == null) {
            throw new IllegalArgumentException("entities must not be null.");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("list", ManagedObjectReference[].class, entities.stream().map(ManagedObject::getMOR).toArray()));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("MoveIntoResourcePool", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "6.5")
    public ResourceConfigOption queryResourceConfigOption() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("QueryResourceConfigOption", this.getSingleSelfArgumentList(), ResourceConfigOption.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void refreshRuntime() throws RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RefreshRuntime", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task registerChildVM(final String path, final String name, final ManagedObjectReference host)
            throws OutOfBounds, AlreadyExists, InvalidDatastore, NotFound, InvalidName, VmConfigFault,
            InsufficientResourcesFault, FileFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("path", String.class, path),
                new Argument("name", String.class, name),
                new Argument("host", ManagedObjectReference.class, host));
        try {
            return this.invokeWithTaskReturn("RegisterChildVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof OutOfBounds) {
                throw (OutOfBounds) cause;
            }
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
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

    public void updateChildResourceConfiguration(final List<ResourceConfigSpec> spec)
            throws InvalidState, InsufficientResourcesFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", ResourceConfigSpec[].class, spec));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateChildResourceConfiguration", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
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

    public void updateConfig(final String name, final ResourceConfigSpec config)
            throws InvalidName, DuplicateName, ConcurrentAccess, InsufficientResourcesFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name),
                new Argument("config", ResourceConfigSpec.class, config));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateConfig", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ConcurrentAccess) {
                throw (ConcurrentAccess) cause;
            }
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
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

}
