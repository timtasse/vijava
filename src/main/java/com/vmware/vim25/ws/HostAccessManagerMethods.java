package com.vmware.vim25.ws;

import com.vmware.vim25.HostAccessControlEntry;
import com.vmware.vim25.HostAccessMode;
import com.vmware.vim25.ManagedObjectReference;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 03.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public interface HostAccessManagerMethods extends WSClientBasedInterfaces {

    default void changeAccessMode(final ManagedObjectReference mor, final String principal, final boolean isGroup, final HostAccessMode accessMode)
            throws RemoteException {
        final List<Argument> params = Arrays.asList(
                new Argument("_this", "ManagedObjectReference", mor),
                new Argument("principal", "String", principal),
                new Argument("isGroup", "boolean", isGroup),
                new Argument("accessMode", "HostAccessMode", accessMode));
        getWsc().invoke("ChangeAccessMode", params, null);
    }

    default List<String> querySystemUsers(final ManagedObjectReference mor) throws RemoteException {
        final List<Argument> params = Arrays.asList(new Argument("_this", "ManagedObjectReference", mor));
        return (List<String>) getWsc().invoke("QuerySystemUsers", params, "List.String");
    }

    default List<HostAccessControlEntry> retrieveAccessEntries(final ManagedObjectReference mor) throws RemoteException {
        final Argument[] params = new Argument[1];
        params[0] = new Argument("_this", "ManagedObjectReference", mor);
        return (List<HostAccessControlEntry>) getWsc().invoke("RetrieveHostAccessControlEntries", params, "List.HostAccessControlEntry");
    }

    default List<HostAccessControlEntry> retrieveAccessEntriesNew(final ManagedObjectReference mor) throws RemoteException {
        final List<Argument> params = Arrays.asList(new Argument("_this", "ManagedObjectReference", mor));
        return (List<HostAccessControlEntry>) getWsc().invoke("RetrieveHostAccessControlEntries", params, "List.HostAccessControlEntry");
    }

}
