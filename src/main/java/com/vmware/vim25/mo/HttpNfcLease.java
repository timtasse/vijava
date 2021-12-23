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
import java.util.List;

/**
 * Represents a lease on a VirtualMachine or a VirtualApp, which can be used to import or export disks for the entity.
 * While the lease is held, operations that alter the state of the virtual machines covered by the lease are blocked.
 * Examples of blocked operations are PowerOn, Destroy, Migrate, etc.
 *
 * A lease is in one of four states:
 * Initializing
 *   This is the initial state. The lease remains in this state while the corresponding import/export task is preparing the objects. In an import session, this involves creating inventory objects.
 * Ready
 *   The lease changes to this state once the corresponding import/export task is done preparing the lease. The leased objects are now ready, and the client can use the information provided in the info property to determine where to up/download disks. The client must call HttpNfcLeaseProgress periodically to keep the lease alive and report progress to the corresponding import/export task. Failure to do so causes the lease to time out and enter the error state.
 * Done
 *   When the client is done transferring disks, it calls HttpNfcLeaseComplete to signal the end of the import/export session. This causes the corresponding import/export task to complete successfully.
 * Error
 *   If an error occurs during initialization or the lease times out, it will change to this state. The client can also abort the lease manually by calling HttpNfcLeaseAbort. In this state, the error property can be read to determine the cause. If the lease belongs to an import session, all objects created during the import are removed when the lease enters this state.
 *
 * The import/export task corresponding to the lease continues running while the lease is held.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2
 * @since 4.0
 */
@SuppressWarnings({"unused", "unchecked"})
public class HttpNfcLease extends ManagedObject {

    public HttpNfcLease(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public HttpNfcLeaseCapabilities getCapabilities() {
        return (HttpNfcLeaseCapabilities) getCurrentProperty("capabilities");
    }

    public LocalizedMethodFault getError() {
        return (LocalizedMethodFault) getCurrentProperty("error");
    }

    public HttpNfcLeaseInfo getInfo() {
        return (HttpNfcLeaseInfo) getCurrentProperty("info");
    }

    public int getInitializeProgress() {
        return (Integer) getCurrentProperty("initializeProgress");
    }

    public String getMode() {
        return (String) getCurrentProperty("mode");
    }

    public HttpNfcLeaseState getState() {
        return (HttpNfcLeaseState) getCurrentProperty("state");
    }

    public int getTransferProgress() {
        return (Integer) getCurrentProperty("transferProgress");
    }

    public void httpNfcLeaseAbort(final LocalizedMethodFault fault) throws Timedout, InvalidState, RuntimeFault, RemoteException {
        getVimService().httpNfcLeaseAbort(getMOR(), fault);
    }

    public void httpNfcLeaseComplete() throws Timedout, InvalidState, RuntimeFault, RemoteException {
        getVimService().httpNfcLeaseComplete(getMOR());
    }

    public HttpNfcLeaseManifestEntry[] httpNfcLeaseGetManifest() throws Timedout, InvalidState, RuntimeFault, RemoteException {
        return getVimService().httpNfcLeaseGetManifest(getMOR());
    }

    public void httpNfcLeaseProgress(final int percent) throws Timedout, RuntimeFault, RemoteException {
        getVimService().httpNfcLeaseProgress(getMOR(), percent);
    }

    public Task pullFromUrls(final List<HttpNfcLeaseSourceFile> files) throws HttpFault, InvalidState, RuntimeFault, SSLVerifyFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("files", "HttpNfcLeaseSourceFile[]", files.toArray()));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc()
                .invoke("HttpNfcLeasePullFromUrls_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public void setManifestChecksumType(final List<KeyValue> deviceUrlsToChecksumTypes) throws InvalidState, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("deviceUrlsToChecksumTypes", "KeyValue[]", deviceUrlsToChecksumTypes));
        this.getVimService().getWsc().invokeWithoutReturn("HttpNfcLeaseSetManifestChecksumType", params);
    }

    public List<HttpNfcLeaseProbeResult> probeUrls(final List<HttpNfcLeaseSourceFile> files, final Integer timeout)
            throws InvalidState, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("files", "HttpNfcLeaseSourceFile[]", files),
                Argument.fromBasicType("timeout", timeout));
        return (List<HttpNfcLeaseProbeResult>) this.getVimService().getWsc()
                .invoke("HttpNfcLeaseProbeUrls", params, "List.HttpNfcLeaseProbeResult");
    }

}
