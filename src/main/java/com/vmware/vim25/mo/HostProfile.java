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
 * The managed object class corresponding to the one defined in VI SDK API reference.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 4.0
 */
public class HostProfile extends Profile {

    public HostProfile(ServerConnection sc, ManagedObjectReference mor) {
        super(sc, mor);
    }

    public HostSystem getReferenceHost() {
        return (HostSystem) getManagedObject("referenceHost");
    }

    public HostProfileValidationFailureInfo validationFailureInfo() {
        return (HostProfileValidationFailureInfo) this.getCurrentProperty("validationFailureInfo");
    }

    public String validationState() {
        return (String) this.getCurrentProperty("validationState");
    }

    public Calendar validationStateUpdateTime() {
        return (Calendar) this.getCurrentProperty("validationStateUpdateTime");
    }

    public ProfileExecuteResult executeHostProfile(HostSystem host, ProfileDeferredPolicyOptionParameter[] deferredParam) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", "ManagedObjectReference", host.getMOR()),
                new Argument("deferredParam", "ProfileDeferredPolicyOptionParameter[]", deferredParam));
        return (ProfileExecuteResult) this.getVimService().getWsc().invoke("ExecuteHostProfile", params, "ProfileExecuteResult");
    }

    public void updateHostProfile(HostProfileConfigSpec config) throws DuplicateName, ProfileUpdateFailed, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("config", "HostProfileConfigSpec", config));
        this.getVimService().getWsc().invokeWithoutReturn("UpdateHostProfile", params);
    }

    public void updateReferenceHost(HostSystem host) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", "ManagedObjectReference", host == null ? null : host.getMOR()));
        this.getVimService().getWsc().invokeWithoutReturn("UpdateReferenceHost", params);
    }

    public void hostProfileResetValidationState() throws RuntimeFault, RemoteException {
        this.getVimService().getWsc().invokeWithoutReturn("HostProfileResetValidationState", this.getSingleSelfArgumentList());
    }

}
