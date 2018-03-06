package com.vmware.vim25.mo;

import com.vmware.vim25.ManagedObjectReference;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 06.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class HealthUpdateManager extends ManagedObject {

    /**
     * Constructor that reuse exiting web service connection
     * Use this contructor when you can re-use existing web service connection.
     *
     * @param serverConnection
     * @param mor
     */
    public HealthUpdateManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    // TODO: Implement Methods
}
