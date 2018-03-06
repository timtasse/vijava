package com.vmware.vim25.mo;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NotImplemented;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 28.03.18.
 */
public class HostCertificateManager extends ManagedObject {

    //private static final Logger LOGGER = LoggerFactory.getLogger(HostCertificateManager.class);

    public HostCertificateManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public Object getCertificateInfo() {
        // TODO: to implement and correct return value
        throw new RuntimeException(new NotImplemented());
    }

    //TODO: implement other Methods

}
