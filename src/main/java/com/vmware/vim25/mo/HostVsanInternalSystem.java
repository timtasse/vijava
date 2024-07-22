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
import java.util.Arrays;
import java.util.List;

/**
 * The VsanInternalSystem exposes low level access to CMMDS,
 * as well as draft versions of VSAN object and disk management APIs that are subject to change in future releases.
 * No compatibility is guaranteed on any of the APIs, including their prototype, behavior or result encoding.
 *
 * @author Steve JIN (http://www.doublecloud.orgo)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 5.5
 * @version 6.5.0
 */
@SuppressWarnings("unused")
public class HostVsanInternalSystem extends ManagedObject {

    public HostVsanInternalSystem(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public List<String> abdicateDomOwnership(final List<String> uuids) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("uuids", String[].class, uuids));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("AbdicateDomOwnership", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<VsanPolicySatisfiability> canProvisionObjects(final List<VsanNewPolicyBatch> npbs, final Boolean ignoreSatisfiability)
            throws VimFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("npbs", VsanNewPolicyBatch[].class, npbs),
                new Argument("ignoreSatisfiability", Boolean.class, ignoreSatisfiability));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("CanProvisionObjects", params, VsanPolicySatisfiability.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VimFault) {
                throw (VimFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<HostVsanInternalSystemDeleteVsanObjectsResult> deleteVsanObjects(final List<String> uuids, final Boolean force)
            throws VimFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("uuids", String[].class, uuids),
                new Argument("force", Boolean.class, force));
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("DeleteVsanObjects", params, HostVsanInternalSystemDeleteVsanObjectsResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VimFault) {
                throw (VimFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String getVsanObjExtAttrs(final List<String> uuids) throws VimFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("uuids", String[].class, uuids));
        try {
            return this.getVimService().getWsc().invoke("GetVsanObjExtAttrs", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VimFault) {
                throw (VimFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String queryCmmds(final List<HostVsanInternalSystemCmmdsQuery> queries) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("queries", HostVsanInternalSystemCmmdsQuery[].class, queries));
        try {
            return this.getVimService().getWsc().invoke("QueryCmmds", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String queryObjectsOnPhysicalVsanDisk(final List<String> disks) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("disks", String[].class, disks));
        try {
            return this.getVimService().getWsc().invoke("QueryObjectsOnPhysicalVsanDisk", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String queryPhysicalVsanDisks(final List<String> props) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("props", String[].class, props));
        try {
            return this.getVimService().getWsc().invoke("QueryPhysicalVsanDisks", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String querySyncingVsanObjects(final List<String> uuids) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("uuids", String[].class, uuids));
        try {
            return this.getVimService().getWsc().invoke("QuerySyncingVsanObjects", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String queryVsanObjects(final List<String> uuids) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("uuids", String[].class, uuids));
        try {
            return this.getVimService().getWsc().invoke("QueryVsanObjects", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<String> queryVsanObjectUuidsByFilter(final List<String> uuids, final Integer limit, final Integer version)
            throws VsanFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("uuids", String[].class, uuids),
                new Argument("limit", Integer.class, limit),
                new Argument("version", Integer.class, version));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryVsanObjectUuidsByFilter", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VsanFault) {
                throw (VsanFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String queryVsanStatistics(final List<String> labels) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("labels", String[].class, labels));
        try {
            return this.getVimService().getWsc().invoke("QueryVsanStatistics", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<VsanPolicySatisfiability> reconfigurationSatisfiable(final List<VsanPolicyChangeBatch> pcbs, final Boolean ignoreSatisfiability)
            throws VimFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("pcbs", VsanPolicyChangeBatch[].class, pcbs),
                new Argument("ignoreSatisfiability", Boolean.class, ignoreSatisfiability));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("ReconfigurationSatisfiable", params, VsanPolicySatisfiability.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VimFault) {
                throw (VimFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void reconfigureDomObject(final String uuid, final String policy) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("uuid", String.class, uuid),
                new Argument("policy", String.class, policy));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ReconfigureDomObject", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult> runVsanPhysicalDiskDiagnostics(final List<String> disks)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("disks", String[].class, disks));
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("RunVsanPhysicalDiskDiagnostics", params,
                            HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<HostVsanInternalSystemVsanObjectOperationResult> upgradeVsanObjects(final List<String> uuids, final int newVersion)
            throws VsanFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("uuids", String[].class, uuids),
                Argument.fromBasicType("newVersion", newVersion));
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("UpgradeVsanObjects", params, HostVsanInternalSystemVsanObjectOperationResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VsanFault) {
                throw (VsanFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
