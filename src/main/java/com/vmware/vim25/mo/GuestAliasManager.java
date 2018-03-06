package com.vmware.vim25.mo;

import com.vmware.vim25.*;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 28.03.18.
 *
 * @since 6.0
 */
public class GuestAliasManager extends ManagedObject {

    //private static final Logger LOGGER = LoggerFactory.getLogger(GuestAliasManager.class);

    private VirtualMachine vm;
    private GuestAuthentication auth;

    public GuestAliasManager(final ServerConnection serverConnection, final ManagedObjectReference mor,
                             final VirtualMachine vm, final GuestAuthentication auth) {
        super(serverConnection, mor);
        this.vm = vm;
        this.auth = auth;
    }

    public void AddGuestAlias(final String username, final boolean mapCert, final String base64Cert)
                            //, final GuestAuthAliasInfo aliasInfo)
            throws GuestComponentsOutOfDate, //GuestMultipleMappings,
            GuestOperationsFault, GuestOperationsUnavailable,
            GuestPermissionDenied, InvalidArgument, InvalidGuestLogin, InvalidPowerState, InvalidState,
            OperationDisabledByGuest, OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        // TODO: to implement, Exception and Argument needed too
        throw new NotImplemented();
    }

    public Object ListGuestAliases(final String username)
            throws GuestComponentsOutOfDate, GuestOperationsFault, GuestOperationsUnavailable, GuestPermissionDenied,
            InvalidGuestLogin, InvalidPowerState, InvalidState, OperationDisabledByGuest,
            OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        // TODO: to implement and returns GuestAliases[]
        throw new NotImplemented();
    }

    public Object ListGuestMappedAliases()
            throws GuestComponentsOutOfDate, GuestOperationsFault, GuestOperationsUnavailable, GuestPermissionDenied,
            InvalidGuestLogin, InvalidPowerState, InvalidState, OperationDisabledByGuest,
            OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        // TODO: to implement
        throw new NotImplemented();
    }

    public void RemoveGuestAlias(final String username, final String base64Cert, final Object //GuestAuthSubject
                                 subject)
            throws GuestComponentsOutOfDate, GuestOperationsFault, GuestOperationsUnavailable, GuestPermissionDenied,
            InvalidArgument, InvalidGuestLogin, InvalidPowerState, InvalidState, OperationDisabledByGuest,
            OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        // TODO: to implement, Argument needed too
        throw new NotImplemented();
    }

    public void RemoveGuestAliasByCert(final String username, final String base64Cert)
            throws GuestComponentsOutOfDate, GuestOperationsFault, GuestOperationsUnavailable, GuestPermissionDenied,
            InvalidArgument, InvalidGuestLogin, InvalidPowerState, InvalidState, OperationDisabledByGuest,
            OperationNotSupportedByGuest, RuntimeFault, TaskInProgress {
        // TODO: to implement, Argument needed too
        throw new NotImplemented();
    }

}
