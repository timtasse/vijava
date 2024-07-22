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
import java.util.stream.Collectors;

/**
 * The DistributedVirtualSwitchManager provides methods that support the following operations:
 * Backup and restore operations for VmwareDistributedVirtualSwitch and associated DistributedVirtualPortgroup managed objects.
 * Query operations for information about portgroups and distributed virtual switches.
 * Distributed virtual switch configuration update operations.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 * @since 4.0
 */
@SuppressWarnings("unused")
public class DistributedVirtualSwitchManager extends ManagedObject {

    public DistributedVirtualSwitchManager(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public Task dVSManagerExportEntity(final List<SelectionSet> selectionSet) throws BackupBlobWriteFailure, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("selectionSet", SelectionSet[].class, selectionSet));
        try {
            return this.invokeWithTaskReturn("DVSManagerExportEntity_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof BackupBlobWriteFailure) {
                throw (BackupBlobWriteFailure) cause;
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

    public Task dVSManagerImportEntity(final List<EntityBackupConfig> entityBackup, final EntityImportType importType)
            throws DvsFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entityBackup", EntityBackupConfig[].class, entityBackup),
                new Argument("importType", String.class, importType.name()));
        try {
            return this.invokeWithTaskReturn("DVSManagerImportEntity_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DvsFault) {
                throw (DvsFault) cause;
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

    public DistributedVirtualPortgroup dVSManagerLookupDvPortGroup(final String switchUuid, final String portgroupKey)
            throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("switchUuid", String.class, switchUuid),
                new Argument("portgroupKey", String.class, portgroupKey));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc()
                    .invoke("DVSManagerLookupDvPortGroup", params, ManagedObjectReference.class);
            return new DistributedVirtualPortgroup(getServerConnection(), mor);
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

    public List<DistributedVirtualSwitchProductSpec> queryAvailableDvsSpec(final Boolean recommended) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("recommended", recommended));
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("QueryAvailableDvsSpec", params, DistributedVirtualSwitchProductSpec.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<HostSystem> queryCompatibleHostForExistingDvs(final ManagedObjectReference container,
                                                              final boolean recursive,
                                                              final ManagedObjectReference dvs)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("container", ManagedObjectReference.class, container),
                Argument.fromBasicType("recursive", recursive),
                new Argument("dvs", ManagedObjectReference.class, dvs));
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("QueryCompatibleHostForExistingDvs", params, ManagedObjectReference.class)
                    .stream()
                    .map(mor -> new HostSystem(this.getServerConnection(), mor))
                    .collect(Collectors.toList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<HostSystem> queryCompatibleHostForNewDvs(final ManagedObjectReference container,
                                                         final boolean recursive,
                                                         final DistributedVirtualSwitchProductSpec switchProductSpec)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("container", ManagedObjectReference.class, container),
                Argument.fromBasicType("recursive", recursive),
                new Argument("switchProductSpec", DistributedVirtualSwitchProductSpec.class, switchProductSpec));
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("QueryCompatibleHostForNewDvs", params, ManagedObjectReference.class)
                    .stream()
                    .map(mor -> new HostSystem(this.getServerConnection(), mor))
                    .collect(Collectors.toList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public DistributedVirtualSwitch queryDvsByUuid(final String uuid) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("uuid", String.class, uuid));
        try {
            final ManagedObjectReference mor = this.getVimService().getWsc()
                    .invoke("QueryDvsByUuid", params, ManagedObjectReference.class);
            return new DistributedVirtualSwitch(this.getServerConnection(), mor);
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

    public List<DistributedVirtualSwitchManagerCompatibilityResult> queryDvsCheckCompatibility(
            final DistributedVirtualSwitchManagerHostContainer hostContainer,
            final DistributedVirtualSwitchManagerDvsProductSpec dvsProductSpec,
            final List<DistributedVirtualSwitchManagerHostDvsFilterSpec> hostFilterSpec) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("hostContainer", DistributedVirtualSwitchManagerHostContainer.class, hostContainer),
                new Argument("dvsProductSpec", DistributedVirtualSwitchManagerDvsProductSpec.class, dvsProductSpec),
                new Argument("hostFilterSpec", DistributedVirtualSwitchManagerHostDvsFilterSpec[].class, hostFilterSpec));
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("QueryDvsCheckCompatibility", params, DistributedVirtualSwitchManagerCompatibilityResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<DistributedVirtualSwitchHostProductSpec> queryDvsCompatibleHostSpec(
            final DistributedVirtualSwitchProductSpec switchProductSpec) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("switchProductSpec", DistributedVirtualSwitchProductSpec.class, switchProductSpec));
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("QueryDvsCompatibleHostSpec", params, DistributedVirtualSwitchHostProductSpec.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public DVSManagerDvsConfigTarget queryDvsConfigTarget(final ManagedObjectReference host, final ManagedObjectReference dvs)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference.class, host),
                new Argument("dvs", ManagedObjectReference.class, dvs));
        try {
            return this.getVimService().getWsc().invoke("QueryDvsConfigTarget", params, DVSManagerDvsConfigTarget.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public DVSFeatureCapability queryDvsFeatureCapability(final DistributedVirtualSwitchProductSpec switchProductSpec)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("switchProductSpec", DistributedVirtualSwitchProductSpec.class, switchProductSpec));
        try {
            return this.getVimService().getWsc().invoke("QueryDvsFeatureCapability", params, DVSFeatureCapability.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task rectifyDvsOnHost(final List<ManagedObjectReference> hosts) throws DvsFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("hosts", ManagedObjectReference[].class, hosts));
        try {
            return this.invokeWithTaskReturn("RectifyDvsOnHost_Task", params);
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

    public List<DVSManagerPhysicalNicsList> queryCompatibleVmnicsFromHosts(final List<ManagedObjectReference> hosts, final ManagedObjectReference dvs) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("hosts", ManagedObjectReference[].class, hosts),
                new Argument("dvs", ManagedObjectReference.class, dvs));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryCompatibleVmnicsFromHosts", params, DVSManagerPhysicalNicsList.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<DistributedVirtualSwitchNetworkOffloadSpec> querySupportedNetworkOffloadSpec(final DistributedVirtualSwitchProductSpec switchProductSpec) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("switchProductSpec", DistributedVirtualSwitchProductSpec.class, switchProductSpec));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QuerySupportedNetworkOffloadSpec", params, DistributedVirtualSwitchNetworkOffloadSpec.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
