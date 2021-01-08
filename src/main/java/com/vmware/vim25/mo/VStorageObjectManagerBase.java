package com.vmware.vim25.mo;

import com.vmware.vim25.ManagedObjectReference;

/**
 * Base interface to manage virtual storage object.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VStorageObjectManagerBase extends ManagedObject {

    public VStorageObjectManagerBase(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }
}
