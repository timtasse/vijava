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
import java.util.stream.Collectors;

/**
 * Provides an interface for obtaining diagnostic information on a host (e.g. generating and retrieving support logs on the host, reading audit records).
 * For VirtualCenter, this includes the log files for the server daemon. For an ESX Server host, this includes detailed log files for the VMkernel.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.3
 */
public class DiagnosticManager extends ManagedObject {

    public DiagnosticManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    /**
     * Returns part of a log file. Log entries are always returned chronologically, typically with the newest event last.
     *
     * @param host  Specifies the host. If not specified, then it defaults to the default server.
     *              For example, if called on VirtualCenter, then the value defaults to VirtualCenter logs.
     * @param key   A string key specifying the key for the log file to browse. Keys can be obtained using the queryDescriptions method.
     * @param start The line number for the first entry to be returned. If the parameter is not specified,
     *              then the operation returns with lines starting from the top of the log.
     * @param lines The number of lines to return. If not specified, then all lines are returned from the start value to the end of the file.
     * @return A LogHeader that includes the log lines. Sometimes fewer log lines are returned than were requested.
     * For example, fewer lines are returned than expected if the client requests lines that do not exist
     * or if the server limits the number of lines that it returns. If zero lines are returned,
     * then the end of the log file may have been reached.
     * @throws CannotAccessFile Thrown if the key refers to a file that cannot be accessed at the present time.
     * @throws RuntimeFault     Thrown if any type of runtime fault is thrown that is not covered by the other faults; for example, a communication error.
     */
    public DiagnosticManagerLogHeader browseDiagnosticLog(final ManagedObjectReference host, final String key, final Integer start, final Integer lines)
            throws CannotAccessFile, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference.class, host),
                new Argument("key", String.class, key),
                Argument.fromBasicType("start", start),
                Argument.fromBasicType("lines", lines));
        try {
            return this.getVimService().getWsc().invoke("BrowseDiagnosticLog", params, DiagnosticManagerLogHeader.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof CannotAccessFile) {
                throw (CannotAccessFile) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public DiagnosticManagerLogHeader browseDiagnosticLog(final HostSystem host, final String key, final Integer start, final Integer lines)
            throws CannotAccessFile, RuntimeFault {
        return this.browseDiagnosticLog(host != null ? host.getMOR() : null, key, start, lines);
    }

    @Deprecated
    public Task generateLogBundles_Task(final boolean includeDefault, final HostSystem[] hosts)
            throws LogBundlingFailed, RuntimeFault, TaskInProgress {
        return this.generateLogBundles(includeDefault, Arrays.stream(hosts).map(HostSystem::getMOR).collect(Collectors.toList()));
    }

    /**
     * The caller can download the bundles using an HTTP GET operation for each returned URL.
     * Bundles are usually available for at least 24 hours, but the caller should not assume that the returned URLs are valid indefinitely.
     * Servers often automatically delete generated diagnostic bundles after some given period of time.
     * <p>
     * Instructs the server to generate diagnostic bundles.
     * A diagnostic bundle includes log files and other configuration information that can be used to investigate potential server issues.
     * Virtual machine and guest operation system state is excluded from diagnostic bundles.
     *
     * @param includeDefault Specifies if the bundle should include the default server. If called on a VirtualCenter server,
     *                       then this means the VirtualCenter diagnostic files.
     *                       If called directly on a host, then includeDefault must be set to true.
     * @param host           Lists hosts that are included. This is only used when called on VirtualCenter.
     *                       If called directly on a host, then this parameter must be empty.
     * @return This method returns a Task object with which to monitor the operation.
     * Upon success, the result property in the Task contains a list of DiagnosticManagerBundleInfo objects
     * for each diagnostic bundle that has been generated.
     * @throws LogBundlingFailed Thrown if generation of support bundle failed.
     * @throws RuntimeFault      Thrown if any type of runtime fault is thrown that is not covered by the other faults; for example, a communication error.
     * @throws TaskInProgress    Thrown if there is a pending request to generate a support bundle.
     * @deprecated since version 5.0 M/N it is recommended to use the CGI interface for the host bundles,
     * use the address instead: https:<>/cgi-bin/vm-support.cgi for the VC bundles, use https:<>/appliance/support-bundle
     */
    @Deprecated
    public Task generateLogBundles(final boolean includeDefault, final List<ManagedObjectReference> host)
            throws LogBundlingFailed, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("includeDefault", includeDefault),
                new Argument("host", ManagedObjectReference[].class, host == null ? null : host.toArray()));
        try {
            return this.invokeWithTaskReturn("GenerateLogBundles_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof LogBundlingFailed) {
                throw (LogBundlingFailed) cause;
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

    /**
     * Returns a list of diagnostic files for a given system.
     *
     * @param host Specifies the host. If not specified, then it defaults to the server itself.
     *             For example, if called on VirtualCenter, then the value defaults to VirtualCenter logs.
     *             When called on an ESX server host, the host should not be specified.
     * @return List of DiagnosticManagerLogDescriptor
     * @throws RuntimeFault Thrown if any type of runtime fault is thrown that is not covered by the other faults; for example, a communication error.
     */
    public List<DiagnosticManagerLogDescriptor> queryDescriptions(final ManagedObjectReference host) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(), new Argument("host", ManagedObjectReference.class, host));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryDescriptions", params, DiagnosticManagerLogDescriptor.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<DiagnosticManagerLogDescriptor> queryDescriptions(final HostSystem host) throws RuntimeFault {
        return this.queryDescriptions(host == null ? null : host.getMOR());
    }

    /**
     * Retrieve audit records from their storage on the specified host. Audit records are stored on the host in a (large) FIFO.
     * The FIFO is continuously being written to due to system activities.
     * It is the responsibility of the caller to issue reads fast enough to keep ahead of the write traffic.
     *
     * @param token The token to be used for the operation. The first call must be made without a token.
     *              All subsequent calls use the token returned in AuditRecordStatus.
     * @return DiagnosticManagerAuditRecordResult
     * @throws InvalidState The reader has failed to keep up with the write data rate. Data has been lost.
     *                      It is up to the caller to decide how to react to this. One possibility is to "start again from the beginning" with a call with no token.
     * @throws RuntimeFault Thrown if any type of runtime fault is thrown that is not covered by the other faults; for example, a communication error.
     * @throws SystemError  One more more errors (on the host) have occurred. One or more error strings are available to detail the issues.
     */
    public DiagnosticManagerAuditRecordResult fetchAuditRecords(final String token) throws InvalidState, RuntimeFault, SystemError {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(), new Argument("token", String.class, token));
        try {
            return this.getVimService().getWsc().invoke("FetchAuditRecords", params, DiagnosticManagerAuditRecordResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof SystemError) {
                throw (SystemError) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
