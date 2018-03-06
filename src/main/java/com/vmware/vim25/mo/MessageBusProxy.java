package com.vmware.vim25.mo;

import com.vmware.vim25.ManagedObjectReference;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 28.03.18.
 */
public class MessageBusProxy extends ManagedObject {

    //private static final Logger LOGGER = LoggerFactory.getLogger(MessageBusProxy.class);

    public MessageBusProxy(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

}
