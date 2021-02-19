package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * GuestCustomizationManager is a singleton managed object that provides APIs for guest customization of a running VM.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.8.7
 */
@SuppressWarnings("unused")
public class VirtualMachineGuestCustomizationManager extends ManagedObject {

    /**
     * Constructor that reuse exiting web service connection
     * Use this contructor when you can re-use existing web service connection.
     *
     * @param serverConnection
     * @param mor
     */
    public VirtualMachineGuestCustomizationManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public Task abortCustomization(final ManagedObjectReference vm, final GuestAuthentication auth)
            throws CustomizationFault, GuestPermissionDenied, InvalidGuestLogin, InvalidPowerState, InvalidState,
            TaskInProgress, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, vm),
                new Argument("auth", GuestAuthentication.class, auth));
        try {
            return this.invokeWithTaskReturn("AbortCustomization_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof CustomizationFault) {
                throw (CustomizationFault) cause;
            }
            if (cause instanceof GuestPermissionDenied) {
                throw (GuestPermissionDenied) cause;
            }
            if (cause instanceof InvalidGuestLogin) {
                throw (InvalidGuestLogin) cause;
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

    public Task customize(final ManagedObjectReference vm, final GuestAuthentication auth, final CustomizationSpec spec,
                          final List<OptionValue> configParams) throws CustomizationFault, GuestPermissionDenied,
            InvalidGuestLogin, InvalidPowerState, InvalidState, TaskInProgress, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, vm),
                new Argument("auth", GuestAuthentication.class, auth),
                new Argument("spec", CustomizationSpec.class, spec),
                new Argument("configParams", OptionValue[].class, configParams == null ? null : configParams.toArray()));
        try {
            return this.invokeWithTaskReturn("CustomizeGuest_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof CustomizationFault) {
                throw (CustomizationFault) cause;
            }
            if (cause instanceof GuestPermissionDenied) {
                throw (GuestPermissionDenied) cause;
            }
            if (cause instanceof InvalidGuestLogin) {
                throw (InvalidGuestLogin) cause;
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

    public Task startNetwork(final ManagedObjectReference vm, final GuestAuthentication auth) throws CustomizationFault,
            GuestPermissionDenied, InvalidGuestLogin, InvalidPowerState, InvalidState, TaskInProgress, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, vm),
                new Argument("auth", GuestAuthentication.class, auth));
        try {
            return this.invokeWithTaskReturn("StartGuestNetwork_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof CustomizationFault) {
                throw (CustomizationFault) cause;
            }
            if (cause instanceof GuestPermissionDenied) {
                throw (GuestPermissionDenied) cause;
            }
            if (cause instanceof InvalidGuestLogin) {
                throw (InvalidGuestLogin) cause;
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
