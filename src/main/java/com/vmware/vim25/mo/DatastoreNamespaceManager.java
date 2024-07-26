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

package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The DatastoreNamespaceManager managed object exposes APIs for manipulating top-level directories of datastores
 * which do not support the traditional top-level directory creation
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.1
 * @since SDK5.5
 */
@SuppressWarnings("unused")
public class DatastoreNamespaceManager extends ManagedObject {

    public DatastoreNamespaceManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public String createDirectory(final Datastore datastore, final String displayName, final String policy)
            throws CannotCreateFile, FileAlreadyExists, InvalidDatastore, RuntimeFault {
        return this.createDirectoryMOR(datastore.getMOR(), displayName, policy);
    }

    public String createDirectoryMOR(final ManagedObjectReference datastore, final String displayName, final String policy)
            throws CannotCreateFile, FileAlreadyExists, InvalidDatastore, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("displayName", String.class, displayName),
                new Argument("policy", String.class, policy));
        try {
            return this.getVimService().getWsc().invoke("CreateDirectory", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof CannotCreateFile) {
                throw (CannotCreateFile) cause;
            }
            if (cause instanceof FileAlreadyExists) {
                throw (FileAlreadyExists) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void deleteDirectory(final Datacenter datacenter, final String datastorePath)
            throws FileNotFound, InvalidDatastorePath, FileFault, InvalidDatastore, RuntimeFault {
        this.deleteDirectoryMOR(datacenter.getMOR(), datastorePath);
    }

    public void deleteDirectoryMOR(final ManagedObjectReference datacenter, final String datastorePath)
            throws FileNotFound, InvalidDatastorePath, FileFault, InvalidDatastore, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datacenter", ManagedObjectReference.class, datacenter),
                new Argument("datastorePath", String.class, datastorePath));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DeleteDirectory", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileNotFound) {
                throw (FileNotFound) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof InvalidDatastorePath) {
                throw (InvalidDatastorePath) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String convertNamespacePathToUuidPath(final Datacenter datacenter, final String namespaceUrl)
            throws InvalidDatastorePath, InvalidDatastore, RuntimeFault {
        return this.convertNamespacePathToUuidPathMOR(datacenter.getMOR(), namespaceUrl);
    }

    public String convertNamespacePathToUuidPathMOR(final ManagedObjectReference datacenter, final String namespaceUrl)
            throws InvalidDatastorePath, InvalidDatastore, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datacenter", ManagedObjectReference.class, datacenter),
                new Argument("namespaceUrl", String.class, namespaceUrl));
        try {
            return this.getVimService().getWsc().invoke("ConvertNamespacePathToUuidPath", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidDatastorePath) {
                throw (InvalidDatastorePath) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void increaseDirectorySize(final Datacenter datacenter, final String stableName, final long size)
            throws FileFault, FileNotFound, InvalidArgument, InvalidDatastore, RuntimeFault, NotSupported {
        this.increaseDirectorySizeMOR(datacenter.getMOR(), stableName, size);
    }

    public void increaseDirectorySizeMOR(final ManagedObjectReference datacenter, final String stableName, final long size)
            throws FileFault, FileNotFound, InvalidArgument, InvalidDatastore, RuntimeFault, NotSupported {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datacenter", ManagedObjectReference.class, datacenter),
                new Argument("stableName", String.class, stableName),
                Argument.fromBasicType("size", size));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("IncreaseDirectorySize", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileNotFound) {
                throw (FileNotFound) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof InvalidArgument) {
                throw (InvalidArgument) cause;
            }
            if (cause instanceof NotSupported) {
                throw (NotSupported) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public DatastoreNamespaceManagerDirectoryInfo queryDirectoryInfo(final Datacenter datacenter, final String stableName)
            throws FileNotFound, FileFault, InvalidDatastore, NotSupported, RuntimeFault {
        return this.queryDirectoryInfoMOR(datacenter.getMOR(), stableName);
    }

    public DatastoreNamespaceManagerDirectoryInfo queryDirectoryInfoMOR(final ManagedObjectReference datacenter, final String stableName)
            throws FileNotFound, FileFault, InvalidDatastore, NotSupported, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datacenter", ManagedObjectReference.class, datacenter),
                new Argument("stableName", String.class, stableName));
        try {
            return this.getVimService().getWsc().invoke("QueryDirectoryInfo", params, DatastoreNamespaceManagerDirectoryInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileNotFound) {
                throw (FileNotFound) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof NotSupported) {
                throw (NotSupported) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
