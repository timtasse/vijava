package com.vmware.vim25.mo;

import com.vmware.vim25.*;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 28.03.18.
 */
public class GuestWindowsRegistryManager extends ManagedObject {

    //private static final Logger LOGGER = LoggerFactory.getLogger(GuestWindowsRegistryManager.class);

    private final GuestAuthentication auth;
    private final VirtualMachine vm;

    public GuestWindowsRegistryManager(final ServerConnection serverConnection, final ManagedObjectReference mor,
                                       final VirtualMachine vm, final GuestAuthentication auth) {
        super(serverConnection, mor);
        this.vm = vm;
        this.auth = auth;
    }

    public void CreateRegistryKeyInGuest(final Object keyName, final boolean isVolatile, final String classType)
            throws RuntimeFault, TaskInProgress {
        // TODO: to implement, Argument and Exceptions too
        throw new NotImplemented();
    }

    // TODO: Other Methods implementation

}
