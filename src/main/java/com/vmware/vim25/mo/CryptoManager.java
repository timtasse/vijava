package com.vmware.vim25.mo;

import com.vmware.vim25.ManagedObjectReference;

/**
 * Singleton Managed Object used to manage cryptographic keys.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class CryptoManager extends ManagedObject {

    public CryptoManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public boolean isEnabled() {
        return (Boolean) this.getCurrentProperty("enabled");
    }

}
