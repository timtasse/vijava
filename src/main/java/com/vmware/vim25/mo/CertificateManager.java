package com.vmware.vim25.mo;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * CertificateManager provides an interface for managing the SSL certificates used by the ESX server.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.0.0
 */
@SuppressWarnings("unused")
public class CertificateManager extends ManagedObject {

    public CertificateManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public Task CertMgrRefreshCACertificatesAndCRLs_Task(final List<HostSystem> hosts) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference[].class, hosts.stream().map(HostSystem::getMOR).collect(Collectors.toList())));
        try {
            final var mor = this.getVimService().getWsc().invoke("CertMgrRefreshCACertificatesAndCRLs_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task CertMgrRefreshCertificates_Task(final List<HostSystem> hosts) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference[].class, hosts.stream().map(HostSystem::getMOR).collect(Collectors.toList())));
        try {
            final var mor = this.getVimService().getWsc().invoke("CertMgrRefreshCertificates_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task CertMgrRevokeCertificates_Task(final List<HostSystem> hosts) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference[].class, hosts.stream().map(HostSystem::getMOR).collect(Collectors.toList())));
        try {
            final var mor = this.getVimService().getWsc().invoke("CertMgrRevokeCertificates_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
