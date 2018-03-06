package com.vmware.vim25.mo;

import com.vmware.vim25.ManagedObjectReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 28.03.18.
 */
public class VsanUpgradeSystem extends ManagedObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(VsanUpgradeSystem.class);

    public VsanUpgradeSystem(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    //TODO: implement methods
}
