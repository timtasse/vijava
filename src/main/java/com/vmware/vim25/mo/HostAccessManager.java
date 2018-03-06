package com.vmware.vim25.mo;

import com.vmware.vim25.*;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 28.03.18.
 */
public class HostAccessManager extends ManagedObject {

    //private static final Logger LOGGER = LoggerFactory.getLogger(HostAccessManager.class);

    public HostAccessManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public HostLockdownMode getLockdownMode() {
        return (HostLockdownMode) getCurrentProperty("lockdownMode");
    }

    public void changeAccessMode(final String principal, final boolean isGroup, final HostAccessMode accessMode)
            throws UserNotFound, SecurityError, AuthMinimumAdminPermission, InvalidArgument, RuntimeFault {
        try {
            getVimService().changeAccessMode(getMOR(), principal, isGroup, accessMode);
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof UserNotFound) {
                throw (UserNotFound) cause;
            }
            if (cause instanceof SecurityError) {
                throw (SecurityError) cause;
            }
            if (cause instanceof InvalidArgument) {
                throw (InvalidArgument) cause;
            }
            if (cause instanceof AuthMinimumAdminPermission) {
                throw (AuthMinimumAdminPermission) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException("Exception not known", e);
        }
    }

    public List<String> querySystemUsers() throws RuntimeFault {
        try {
            return getVimService().querySystemUsers(getMOR());
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException("Exception not known", e);
        }
    }

    public List<HostAccessControlEntry> retrieveAccessEntries() throws RuntimeFault {
        try {
            for (int i = 0; i < 10; i++) {
                this.test();
            }
            for (int i = 0; i < 10; i++) {
                this.testNew();
            }
            return getVimService().retrieveAccessEntries(getMOR());
        } catch (RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException("Exception not known", e);
        }
    }

    public long test() {
        final long start = System.nanoTime();
        try {
            getVimService().retrieveAccessEntries(getMOR());
        } catch (RemoteException e) {
        }
        return System.nanoTime() - start;
    }

    public long testNew() {
        final long start = System.nanoTime();
        try {
            getVimService().retrieveAccessEntriesNew(getMOR());
        } catch (RemoteException e) {
        }
        return System.nanoTime() - start;
    }
    // TODO: implement the other Methods

}
