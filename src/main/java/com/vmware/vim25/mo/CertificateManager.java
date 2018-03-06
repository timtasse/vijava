package com.vmware.vim25.mo;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NotImplemented;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.SystemError;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 28.03.18.
 */
public class CertificateManager extends ManagedObject {

    //private static final Logger LOGGER = LoggerFactory.getLogger(CertificateManager.class);

    public CertificateManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public Task CertMgrRefreshCACertificatesAndCRLs_Task(final HostSystem[] hosts) throws RuntimeFault, SystemError {
        // TODO: to implement
        throw new NotImplemented();
    }

    public Task CertMgrRefreshCertificates_Task(final HostSystem[] hosts) throws RuntimeFault, SystemError {
        // TODO: to implement
        throw new NotImplemented();
    }

    public Task CertMgrRevokeCertificates_Task(final HostSystem[] hosts) throws RuntimeFault, SystemError {
        // TODO: to implement
        throw new NotImplemented();
    }

}
