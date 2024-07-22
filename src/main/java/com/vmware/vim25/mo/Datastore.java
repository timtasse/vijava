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
import java.util.*;

/**
 * Represents a storage location for virtual machine files. A storage location can be a VMFS volume, a directory on Network Attached Storage, or a local file system path.
 * A datastore is platform-independent and host-independent. Therefore, datastores do not change when the virtual machines they contain are moved between hosts.
 * The scope of a datastore is a datacenter; the datastore is uniquely named within the datacenter.
 *
 * Any reference to a virtual machine or file accessed by any host within the datacenter must use a datastore path.
 * A datastore path has the form "[<datastore>] <path>", where <datastore> is the datastore name,
 * and <path> is a slash-delimited path from the root of the datastore. An example datastore path is "[storage] path/to/config.vmx".
 *
 * You may use the following characters in a path, but not in a datastore name: slash (/), backslash (\), and percent (%).
 *
 * All references to files in the VIM API are implicitly done using datastore paths.
 *
 * When a client creates a virtual machine, it may specify the name of the datastore, omitting the path; the system,
 * meaning VirtualCenter or the host, automatically assigns filenames and creates directories on the given datastore.
 * For example, specifying My_Datastore as a location for a virtual machine called MyVm results in a datastore location of My_Datastore\MyVm\MyVm.vmx.
 *
 * Datastores are configured per host. As part of host configuration, a HostSystem can be configured to mount a set of network drives.
 * Multiple hosts may be configured to point to the same storage location. There exists only one Datastore object per Datacenter,
 * for each such shared location. Each Datastore object keeps a reference to the set of hosts that have mounted the datastore.
 * A Datastore object can be removed only if no hosts currently have the datastore mounted.
 *
 * Thus, managing datastores is done both at the host level and the datacenter level.
 * Each host is configured explicitly with the set of datastores it can access. At the datacenter, a view of the datastores across the datacenter is shown.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.5
 */
@SuppressWarnings("unused")
public class Datastore extends ManagedEntity {

    public Datastore(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public HostDatastoreBrowser getBrowser() {
        return (HostDatastoreBrowser) getManagedObject("browser");
    }

    public DatastoreCapability getCapability() {
        return getCurrentProperty("capability", DatastoreCapability.class);
    }

    public List<DatastoreHostMount> getHost() {
        return Optional.ofNullable(getCurrentProperty("host", DatastoreHostMount[].class))
                .map(Arrays::asList)
                .orElse(Collections.emptyList());
    }

    public DatastoreInfo getInfo() {
        return getCurrentProperty("info", DatastoreInfo.class);
    }

    public StorageIORMInfo getIormConfiguration() {
        return getCurrentProperty("iormConfiguration", StorageIORMInfo.class);
    }

    public DatastoreSummary getSummary() {
        return getCurrentProperty("summary", DatastoreSummary.class);
    }

    public List<VirtualMachine> getVms() {
        return getVms("vm");
    }

    public StoragePlacementResult datastoreEnterMaintenanceMode() throws InvalidState, RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("DatastoreEnterMaintenanceMode", this.getSingleSelfArgumentList(), StoragePlacementResult.class);
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

    public Task datastoreExitMaintenanceMode() throws InvalidState, RuntimeFault {
        try {
            return this.invokeWithTaskReturn("DatastoreExitMaintenanceMode_Task", this.getSingleSelfArgumentList());
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
    public void destroyDatastore() throws ResourceInUse, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DestroyDatastore", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void refreshDatastore() throws NotFound, HostConfigFault, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RefreshDatastore", this.getSingleSelfArgumentList());
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

    public void refreshDatastoreStorageInfo() throws RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RefreshDatastoreStorageInfo", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "4.0")
    public void renameDatastore(final String newName) throws InvalidName, DuplicateName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("newName", String.class, newName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RenameDatastore", params);
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

    public Task updateVirtualMachineFiles(final List<DatastoreMountPathDatastorePair> mountPathDatastoreMapping)
            throws PlatformConfigFault, ResourceInUse, TaskInProgress, InvalidDatastore, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("mountPathDatastoreMapping", DatastoreMountPathDatastorePair[].class, mountPathDatastoreMapping.toArray()));
        try {
            return this.invokeWithTaskReturn("UpdateVirtualMachineFiles_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof PlatformConfigFault) {
                throw (PlatformConfigFault) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task updateVVolVirtualMachineFiles(final List<DatastoreVVolContainerFailoverPair> failoverPair)
            throws InvalidDatastore, NotSupported, PlatformConfigFault, TaskInProgress, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("failoverPair", DatastoreVVolContainerFailoverPair[].class, failoverPair.toArray()));
        try {
            return this.invokeWithTaskReturn("UpdateVVolVirtualMachineFiles_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof PlatformConfigFault) {
                throw (PlatformConfigFault) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof NotSupported) {
                throw (NotSupported) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
