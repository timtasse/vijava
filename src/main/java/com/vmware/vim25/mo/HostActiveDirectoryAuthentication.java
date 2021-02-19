package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * The HostActiveDirectoryAuthentication managed object indicates domain membership status and
 * provides methods for adding a host to and removing a host from a domain.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.0
 * @since 4.1
 */
@SuppressWarnings("unused")
public class HostActiveDirectoryAuthentication extends HostDirectoryStore {

    public HostActiveDirectoryAuthentication(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public void disableSmartCardAuthentication() throws ActiveDirectoryFault, HostConfigFault, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DisableSmartCardAuthentication", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ActiveDirectoryFault) {
                throw (ActiveDirectoryFault) cause;
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

    public void enableSmartCardAuthentication() throws ActiveDirectoryFault, HostConfigFault, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("EnableSmartCardAuthentication", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ActiveDirectoryFault) {
                throw (ActiveDirectoryFault) cause;
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

    public Task importCertificateForCAM(final String certPath, final String camServer)
            throws FileNotFound, InvalidCAMServer, ActiveDirectoryFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("certPath", String.class, certPath),
                new Argument("camServer", String.class, camServer));
        try {
            return this.invokeWithTaskReturn("ImportCertificateForCAM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileNotFound) {
                throw (FileNotFound) cause;
            }
            if (cause instanceof InvalidCAMServer) {
                throw (InvalidCAMServer) cause;
            }
            if (cause instanceof ActiveDirectoryFault) {
                throw (ActiveDirectoryFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void installSmartCardTrustAnchor(final String cert) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cert", String.class, cert));
        try {
            this.invokeWithTaskReturn("InstallSmartCardTrustAnchor", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task joinDomain(final String domainName, final String userName, final String password)
            throws InvalidState, HostConfigFault, InvalidLogin, ActiveDirectoryFault, TaskInProgress, BlockedByFirewall,
            ClockSkew, DomainNotFound, InvalidHostName, NoPermissionOnAD, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("domainName", String.class, domainName),
                new Argument("userName", String.class, userName),
                new Argument("password", String.class, password));
        try {
            return this.invokeWithTaskReturn("JoinDomain_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof BlockedByFirewall) {
                throw (BlockedByFirewall) cause;
            }
            if (cause instanceof ClockSkew) {
                throw (ClockSkew) cause;
            }
            if (cause instanceof DomainNotFound) {
                throw (DomainNotFound) cause;
            }
            if (cause instanceof InvalidHostName) {
                throw (InvalidHostName) cause;
            }
            if (cause instanceof NoPermissionOnAD) {
                throw (NoPermissionOnAD) cause;
            }
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
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task joinDomainWithCAM(final String domainName, final String camServer)
            throws BlockedByFirewall, CAMServerRefusedConnection, ClockSkew, DomainNotFound, InvalidCAMCertificate,
            InvalidCAMServer, InvalidHostName, InvalidState, HostConfigFault, ActiveDirectoryFault, TaskInProgress, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("domainName", String.class, domainName),
                new Argument("camServer", String.class, camServer));
        try {
            return this.invokeWithTaskReturn("JoinDomainWithCAM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof BlockedByFirewall) {
                throw (BlockedByFirewall) cause;
            }
            if (cause instanceof CAMServerRefusedConnection) {
                throw (CAMServerRefusedConnection) cause;
            }
            if (cause instanceof ClockSkew) {
                throw (ClockSkew) cause;
            }
            if (cause instanceof DomainNotFound) {
                throw (DomainNotFound) cause;
            }
            if (cause instanceof InvalidCAMCertificate) {
                throw (InvalidCAMCertificate) cause;
            }
            if (cause instanceof InvalidCAMServer) {
                throw (InvalidCAMServer) cause;
            }
            if (cause instanceof InvalidHostName) {
                throw (InvalidHostName) cause;
            }
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
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task leaveCurrentDomain(final boolean force)
            throws NonADUserRequired, InvalidState, AuthMinimumAdminPermission, ActiveDirectoryFault, TaskInProgress, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("force", "boolean", force));
        try {
            return this.invokeWithTaskReturn("LeaveCurrentDomain_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof AuthMinimumAdminPermission) {
                throw (AuthMinimumAdminPermission) cause;
            }
            if (cause instanceof NonADUserRequired) {
                throw (NonADUserRequired) cause;
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
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<String> listSmartCardTrustAnchors() throws HostConfigFault, RuntimeFault {
        try {
            return (List<String>) this.getVimService().getWsc()
                    .invoke("ListSmartCardTrustAnchors", this.getSingleSelfArgumentList(), "List.String");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated
    public void removeSmartCardTrustAnchor(final String issuer, final String serial) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("issuer", String.class, issuer),
                new Argument("serial", String.class, serial));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveSmartCardTrustAnchor", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void removeSmartCardTrustAnchorByFingerprint(final String fingerprint, final String digest)
            throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("fingerprint", String.class, fingerprint),
                new Argument("digest", String.class, digest));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveSmartCardTrustAnchorByFingerprint", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void replaceSmartCardTrustAnchors(final List<String> certs) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("certs", String[].class, certs.toArray()));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ReplaceSmartCardTrustAnchors", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
