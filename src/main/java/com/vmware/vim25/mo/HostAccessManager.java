package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Managed object used to control direct access to the host.
 * This should be used to control users and privileges on the host directly, which are different from the users and privileges defined in vCenter.
 *
 * See AuthorizationManager for more information on permissions.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.0
 * @since 6.0
 */
public class HostAccessManager extends ManagedObject {

    public HostAccessManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public HostLockdownMode getLockdownMode() {
        return (HostLockdownMode) getCurrentProperty("lockdownMode");
    }

    public void changeAccessMode(final String principal, final boolean isGroup, final HostAccessMode accessMode)
            throws UserNotFound, AuthMinimumAdminPermission, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("principal", String.class, principal),
                new Argument("isGroup", "boolean", isGroup),
                new Argument("accessMode", HostAccessMode.class, accessMode));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ChangeAccessMode", params);
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof UserNotFound) {
                throw (UserNotFound) cause;
            }
            if (cause instanceof AuthMinimumAdminPermission) {
                throw (AuthMinimumAdminPermission) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void changeLockdownMode(final HostLockdownMode mode) throws AuthMinimumAdminPermission, RuntimeFault {
        if (mode == null) {
            throw new IllegalArgumentException("mode should not be null");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("mode", HostLockdownMode.class, mode));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ChangeLockdownMode", params);
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AuthMinimumAdminPermission) {
                throw (AuthMinimumAdminPermission) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<String> queryLockdownExceptions() throws RuntimeFault {
        try {
            return (List<String>) this.getVimService().getWsc().invoke("QueryLockdownExceptions", this.getSingleSelfArgumentList(), "List.String");
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<String> querySystemUsers() throws RuntimeFault {
        try {
            return (List<String>) this.getVimService().getWsc().invoke("QuerySystemUsers", this.getSingleSelfArgumentList(), "List.String");
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<HostAccessControlEntry> retrieveAccessEntries() throws RuntimeFault {
        try {
            return (List<HostAccessControlEntry>) this.getVimService().getWsc()
                    .invoke("RetrieveHostAccessControlEntries", this.getSingleSelfArgumentList(), "List.HostAccessControlEntry");
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateLockdownExceptions(final List<String> users) throws AuthMinimumAdminPermission, RuntimeFault, UserNotFound {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("users", String[].class, users.toArray()));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateLockdownExceptions", params);
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof UserNotFound) {
                throw (UserNotFound) cause;
            }
            if (cause instanceof AuthMinimumAdminPermission) {
                throw (AuthMinimumAdminPermission) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateSystemUsers(final List<String> users) throws UserNotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("users", String[].class, users.toArray()));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateSystemUsers", params);
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof UserNotFound) {
                throw (UserNotFound) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
