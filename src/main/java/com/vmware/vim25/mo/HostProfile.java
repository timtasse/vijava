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
import java.util.Calendar;
import java.util.List;

/**
 * A host profile describes ESX Server configuration. The HostProfile managed object provides access to profile data,
 * and it defines methods to manipulate the profile.
 * A host profile is a combination of subprofiles, each of which contains configuration data for a specific capability.
 * Some examples of host capabilities are authentication, memory, networking, and security.
 * For access to individual subprofiles, see the HostApplyProfile data object (HostProfile.Config.applyProfile).
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.1
 * @since 4.0
 */
@SuppressWarnings("unused")
public class HostProfile extends Profile {

    public HostProfile(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public HostSystem getReferenceHost() {
        return (HostSystem) getManagedObject("referenceHost");
    }

    public HostProfileValidationFailureInfo validationFailureInfo() {
        return this.getCurrentProperty("validationFailureInfo", HostProfileValidationFailureInfo.class);
    }

    public String validationState() {
        return this.getCurrentProperty("validationState", String.class);
    }

    public Calendar validationStateUpdateTime() {
        return this.getCurrentProperty("validationStateUpdateTime", Calendar.class);
    }

    public Calendar complianceCheckTime() {
        return this.getCurrentProperty("complianceCheckTime", Calendar.class);
    }

    public ProfileExecuteResult executeHostProfile(final HostSystem host, final List<ProfileDeferredPolicyOptionParameter> deferredParam)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", "ManagedObjectReference", host.getMOR()),
                new Argument("deferredParam", ProfileDeferredPolicyOptionParameter[].class, deferredParam));
        try {
            return this.getVimService().getWsc().invoke("ExecuteHostProfile", params, ProfileExecuteResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void hostProfileResetValidationState() throws RuntimeFault {
        try {
            this.getVimService().getWsc()
                    .invokeWithoutReturn("HostProfileResetValidationState", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateHostProfile(final HostProfileConfigSpec config) throws DuplicateName, ProfileUpdateFailed, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("config", HostProfileConfigSpec.class, config));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateHostProfile", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof ProfileUpdateFailed) {
                throw (ProfileUpdateFailed) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateReferenceHost(final HostSystem host) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", "ManagedObjectReference", host == null ? null : host.getMOR()));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateReferenceHost", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
