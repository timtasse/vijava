package com.vmware.vim25.mo;

import com.vmware.vim25.ManagedObjectReference;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class CryptoManagerHostKMS  extends CryptoManagerHost {

    public CryptoManagerHostKMS(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

}
