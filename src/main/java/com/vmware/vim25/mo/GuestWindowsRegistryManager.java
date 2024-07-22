package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * WindowsRegistryManager is the managed object that provides APIs to manipulate the Registry in a Windows guest OS.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.0.0
 */
public class GuestWindowsRegistryManager extends ManagedObject {

    private final GuestAuthentication auth;
    private final VirtualMachine vm;

    public GuestWindowsRegistryManager(final ServerConnection serverConnection, final ManagedObjectReference mor,
                                       final VirtualMachine vm, final GuestAuthentication auth) {
        super(serverConnection, mor);
        this.vm = vm;
        this.auth = auth;
    }

    public void createRegistryKey(final GuestRegKeyNameSpec keyName, final boolean isVolatile, final String classType)
            throws GuestComponentsOutOfDate, GuestOperationsFault, GuestOperationsUnavailable, GuestPermissionDenied,
            GuestRegistryKeyAlreadyExists, GuestRegistryKeyInvalid, GuestRegistryKeyParentVolatile, InvalidGuestLogin,
            InvalidPowerState, InvalidState, OperationDisabledByGuest, OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, this.vm.getMOR()),
                new Argument("auth", GuestAuthentication.class, this.auth),
                new Argument("keyName", GuestRegKeyNameSpec.class, keyName),
                Argument.fromBasicType("isVolatile", isVolatile),
                new Argument("classType", String.class, classType));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("CreateRegistryKeyInGuest", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof GuestRegistryKeyAlreadyExists) {
                throw (GuestRegistryKeyAlreadyExists) cause;
            }
            if (cause instanceof GuestRegistryKeyInvalid) {
                throw (GuestRegistryKeyInvalid) cause;
            }
            if (cause instanceof GuestRegistryKeyParentVolatile) {
                throw (GuestRegistryKeyParentVolatile) cause;
            }
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

    public void deleteRegistryKey(final GuestRegKeyNameSpec keyName, final boolean recursive)
            throws GuestComponentsOutOfDate, GuestOperationsFault, GuestOperationsUnavailable, GuestPermissionDenied,
            GuestRegistryKeyHasSubkeys, GuestRegistryKeyInvalid, InvalidGuestLogin, InvalidPowerState, InvalidState,
            OperationDisabledByGuest, OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, this.vm.getMOR()),
                new Argument("auth", GuestAuthentication.class, this.auth),
                new Argument("keyName", GuestRegKeyNameSpec.class, keyName),
                Argument.fromBasicType("recursive", recursive));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DeleteRegistryKeyInGuest", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof GuestRegistryKeyHasSubkeys) {
                throw (GuestRegistryKeyHasSubkeys) cause;
            }
            if (cause instanceof GuestRegistryKeyInvalid) {
                throw (GuestRegistryKeyInvalid) cause;
            }
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

    public void deleteRegistryValue(final GuestRegValueNameSpec valueName) throws GuestComponentsOutOfDate, GuestOperationsFault,
            GuestOperationsUnavailable, GuestPermissionDenied, GuestRegistryKeyInvalid, GuestRegistryValueNotFound, InvalidGuestLogin,
            InvalidPowerState, InvalidState, OperationDisabledByGuest, OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, this.vm.getMOR()),
                new Argument("auth", GuestAuthentication.class, this.auth),
                new Argument("valueName", GuestRegValueNameSpec.class, valueName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DeleteRegistryKeyInGuest", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof GuestRegistryValueNotFound) {
                throw (GuestRegistryValueNotFound) cause;
            }
            if (cause instanceof GuestRegistryKeyInvalid) {
                throw (GuestRegistryKeyInvalid) cause;
            }
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

    public List<GuestRegKeyRecordSpec> listRegistryKeys(final GuestRegKeyNameSpec keyName, final boolean recursive, final String matchPattern)
        throws GuestComponentsOutOfDate, GuestOperationsFault, GuestOperationsUnavailable, GuestPermissionDenied,
            GuestRegistryKeyInvalid, InvalidGuestLogin, InvalidPowerState, InvalidState, OperationDisabledByGuest,
            OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, this.vm.getMOR()),
                new Argument("auth", GuestAuthentication.class, this.auth),
                new Argument("keyName", GuestRegKeyNameSpec.class, keyName),
                Argument.fromBasicType("recursive", recursive),
                new Argument("matchPattern", String.class, matchPattern));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("ListRegistryKeysInGuest", params, GuestRegKeyRecordSpec.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof GuestRegistryKeyInvalid) {
                throw (GuestRegistryKeyInvalid) cause;
            }
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

    public List<GuestRegValueSpec> listRegistryValues(final GuestRegKeyNameSpec keyName, final boolean expandStrings, final String matchPattern)
            throws GuestComponentsOutOfDate, GuestOperationsFault, GuestOperationsUnavailable, GuestPermissionDenied,
            GuestRegistryKeyInvalid, InvalidGuestLogin, InvalidPowerState, InvalidState, OperationDisabledByGuest,
            OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, this.vm.getMOR()),
                new Argument("auth", GuestAuthentication.class, this.auth),
                new Argument("keyName", GuestRegKeyNameSpec.class, keyName),
                Argument.fromBasicType("expandStrings", expandStrings),
                new Argument("matchPattern", String.class, matchPattern));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("ListRegistryValuesInGuest", params, GuestRegValueSpec.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof GuestRegistryKeyInvalid) {
                throw (GuestRegistryKeyInvalid) cause;
            }
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

    public void setRegistryValue(final GuestRegValueSpec value) throws GuestComponentsOutOfDate, GuestOperationsFault,
            GuestOperationsUnavailable, GuestPermissionDenied, GuestRegistryKeyInvalid, InvalidGuestLogin, InvalidPowerState,
            InvalidState, OperationDisabledByGuest, OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, this.vm.getMOR()),
                new Argument("auth", GuestAuthentication.class, this.auth),
                new Argument("value", GuestRegValueSpec.class, value));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("SetRegistryValueInGuest", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof GuestRegistryKeyInvalid) {
                throw (GuestRegistryKeyInvalid) cause;
            }
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
