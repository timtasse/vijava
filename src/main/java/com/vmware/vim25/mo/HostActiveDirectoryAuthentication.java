package com.vmware.vim25.mo;

import com.vmware.vim25.*;

import java.rmi.RemoteException;

/**
 * @since 4.1
 */
public class HostActiveDirectoryAuthentication extends HostDirectoryStore {

    public HostActiveDirectoryAuthentication(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    /**
     * @since 5.0
     */
    public Task importCertificateForCAM_Task(final String certPath, final String camServer)
            throws FileNotFound, ActiveDirectoryFault, RuntimeFault {
        try {
            final ManagedObjectReference mor = getVimService().importCertificateForCAM_Task(getMOR(), certPath, camServer);
            return new Task(getServerConnection(), mor);
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileNotFound) {
                throw (FileNotFound) cause;
            }
            if (cause instanceof ActiveDirectoryFault) {
                throw (ActiveDirectoryFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException("Exception not known", e);
        }
    }

    public Task joinDomain_Task(final String domainName, final String userName, final String password)
            throws InvalidState, HostConfigFault, InvalidLogin, ActiveDirectoryFault, TaskInProgress, RuntimeFault {
        try {
            final ManagedObjectReference mor = getVimService().joinDomain_Task(getMOR(), domainName, userName, password);
            return new Task(getServerConnection(), mor);
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof InvalidLogin) {
                throw (InvalidLogin) cause;
            }
            if (cause instanceof ActiveDirectoryFault) {
                throw (ActiveDirectoryFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException("Exception not known", e);
        }
    }

    /**
     * @since 5.0
     */
    public Task joinDomainWithCAM_Task(final String domainName, final String camServer)
            throws InvalidState, HostConfigFault, ActiveDirectoryFault, TaskInProgress, RuntimeFault {
        try {
            final ManagedObjectReference mor = getVimService().joinDomainWithCAM_Task(getMOR(), domainName, camServer);
            return new Task(getServerConnection(), mor);
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof ActiveDirectoryFault) {
                throw (ActiveDirectoryFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException("Exception not known", e);
        }
    }

    public Task leaveCurrentDomain_Task(final boolean force)
            throws InvalidState, AuthMinimumAdminPermission, ActiveDirectoryFault, TaskInProgress, RuntimeFault {
        try {
            final ManagedObjectReference mor = getVimService().leaveCurrentDomain_Task(getMOR(), force);
            return new Task(getServerConnection(), mor);
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof AuthMinimumAdminPermission) {
                throw (AuthMinimumAdminPermission) cause;
            }
            if (cause instanceof ActiveDirectoryFault) {
                throw (ActiveDirectoryFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException("Exception not known", e);
        }
    }

}
