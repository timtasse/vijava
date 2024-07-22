package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 *  The GuestAliasManager supports single sign-on for virtual machine access to perform guest operations.
 *  The GuestAliasManager provides methods to create and access aliases.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0.0
 */
@SuppressWarnings("unused")
public class GuestAliasManager extends ManagedObject {

    private final VirtualMachine vm;
    private final GuestAuthentication auth;

    public GuestAliasManager(final ServerConnection serverConnection, final ManagedObjectReference mor,
                             final VirtualMachine vm, final GuestAuthentication auth) {
        super(serverConnection, mor);
        this.vm = vm;
        this.auth = auth;
    }

    public void AddGuestAlias(final String username, final boolean mapCert, final String base64Cert, final GuestAuthAliasInfo aliasInfo)
            throws GuestComponentsOutOfDate, GuestMultipleMappings,
            GuestOperationsFault, GuestOperationsUnavailable,
            GuestPermissionDenied, InvalidGuestLogin, InvalidPowerState, InvalidState,
            OperationDisabledByGuest, OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, this.vm.getMOR()),
                new Argument("auth", GuestAuthentication.class, this.auth),
                new Argument("username", String.class, username),
                Argument.fromBasicType("mapCert", mapCert),
                new Argument("base64Cert", String.class, base64Cert),
                new Argument("aliasInfo", GuestAuthAliasInfo.class, aliasInfo));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("AddGuestAlias", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof GuestOperationsUnavailable) {
                throw (GuestOperationsUnavailable) cause;
            }
            if (cause instanceof GuestPermissionDenied) {
                throw (GuestPermissionDenied) cause;
            }
            if (cause instanceof InvalidGuestLogin) {
                throw (InvalidGuestLogin) cause;
            }
            if (cause instanceof GuestComponentsOutOfDate) {
                throw (GuestComponentsOutOfDate) cause;
            }
            if (cause instanceof GuestMultipleMappings) {
                throw (GuestMultipleMappings) cause;
            }
            if (cause instanceof OperationDisabledByGuest) {
                throw (OperationDisabledByGuest) cause;
            }
            if (cause instanceof OperationNotSupportedByGuest) {
                throw (OperationNotSupportedByGuest) cause;
            }
            if (cause instanceof GuestOperationsFault) {
                throw (GuestOperationsFault) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
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

    public List<GuestAliases> ListGuestAliases(final String username)
            throws GuestComponentsOutOfDate, GuestOperationsFault, GuestOperationsUnavailable, GuestPermissionDenied,
            InvalidGuestLogin, InvalidPowerState, InvalidState, OperationDisabledByGuest,
            OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, this.vm.getMOR()),
                new Argument("auth", GuestAuthentication.class, this.auth),
                new Argument("username", String.class, username));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("ListGuestAliases", params, GuestAliases.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof GuestOperationsUnavailable) {
                throw (GuestOperationsUnavailable) cause;
            }
            if (cause instanceof GuestPermissionDenied) {
                throw (GuestPermissionDenied) cause;
            }
            if (cause instanceof InvalidGuestLogin) {
                throw (InvalidGuestLogin) cause;
            }
            if (cause instanceof GuestComponentsOutOfDate) {
                throw (GuestComponentsOutOfDate) cause;
            }
            if (cause instanceof OperationDisabledByGuest) {
                throw (OperationDisabledByGuest) cause;
            }
            if (cause instanceof OperationNotSupportedByGuest) {
                throw (OperationNotSupportedByGuest) cause;
            }
            if (cause instanceof GuestOperationsFault) {
                throw (GuestOperationsFault) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
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

    public List<GuestMappedAliases> ListGuestMappedAliases()
            throws GuestComponentsOutOfDate, GuestOperationsFault, GuestOperationsUnavailable, GuestPermissionDenied,
            InvalidGuestLogin, InvalidPowerState, InvalidState, OperationDisabledByGuest,
            OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, this.vm.getMOR()),
                new Argument("auth", GuestAuthentication.class, this.auth));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("ListGuestMappedAliases", params, GuestMappedAliases.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof GuestOperationsUnavailable) {
                throw (GuestOperationsUnavailable) cause;
            }
            if (cause instanceof GuestPermissionDenied) {
                throw (GuestPermissionDenied) cause;
            }
            if (cause instanceof InvalidGuestLogin) {
                throw (InvalidGuestLogin) cause;
            }
            if (cause instanceof GuestComponentsOutOfDate) {
                throw (GuestComponentsOutOfDate) cause;
            }
            if (cause instanceof OperationDisabledByGuest) {
                throw (OperationDisabledByGuest) cause;
            }
            if (cause instanceof OperationNotSupportedByGuest) {
                throw (OperationNotSupportedByGuest) cause;
            }
            if (cause instanceof GuestOperationsFault) {
                throw (GuestOperationsFault) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
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

    public void RemoveGuestAlias(final String username, final String base64Cert, final GuestAuthSubject subject)
            throws GuestComponentsOutOfDate, GuestOperationsFault, GuestOperationsUnavailable, GuestPermissionDenied,
            InvalidArgument, InvalidGuestLogin, InvalidPowerState, InvalidState, OperationDisabledByGuest,
            OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, this.vm.getMOR()),
                new Argument("auth", GuestAuthentication.class, this.auth),
                new Argument("subject", GuestAuthSubject.class, subject));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveGuestAlias", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof GuestOperationsUnavailable) {
                throw (GuestOperationsUnavailable) cause;
            }
            if (cause instanceof GuestPermissionDenied) {
                throw (GuestPermissionDenied) cause;
            }
            if (cause instanceof InvalidGuestLogin) {
                throw (InvalidGuestLogin) cause;
            }
            if (cause instanceof GuestComponentsOutOfDate) {
                throw (GuestComponentsOutOfDate) cause;
            }
            if (cause instanceof OperationDisabledByGuest) {
                throw (OperationDisabledByGuest) cause;
            }
            if (cause instanceof OperationNotSupportedByGuest) {
                throw (OperationNotSupportedByGuest) cause;
            }
            if (cause instanceof GuestOperationsFault) {
                throw (GuestOperationsFault) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
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

    public void RemoveGuestAliasByCert(final String username, final String base64Cert)
            throws GuestComponentsOutOfDate, GuestOperationsFault, GuestOperationsUnavailable, GuestPermissionDenied,
            InvalidArgument, InvalidGuestLogin, InvalidPowerState, InvalidState, OperationDisabledByGuest,
            OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, this.vm.getMOR()),
                new Argument("auth", GuestAuthentication.class, this.auth),
                new Argument("username", String.class, username),
                new Argument("base64Cert", String.class, base64Cert));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveGuestAliasByCert", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof GuestOperationsUnavailable) {
                throw (GuestOperationsUnavailable) cause;
            }
            if (cause instanceof GuestPermissionDenied) {
                throw (GuestPermissionDenied) cause;
            }
            if (cause instanceof InvalidGuestLogin) {
                throw (InvalidGuestLogin) cause;
            }
            if (cause instanceof GuestComponentsOutOfDate) {
                throw (GuestComponentsOutOfDate) cause;
            }
            if (cause instanceof OperationDisabledByGuest) {
                throw (OperationDisabledByGuest) cause;
            }
            if (cause instanceof OperationNotSupportedByGuest) {
                throw (OperationNotSupportedByGuest) cause;
            }
            if (cause instanceof GuestOperationsFault) {
                throw (GuestOperationsFault) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
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

}
