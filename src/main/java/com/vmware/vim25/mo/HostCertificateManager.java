package com.vmware.vim25.mo;

import com.vmware.vim25.HostCertificateManagerCertificateInfo;
import com.vmware.vim25.HostConfigFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * CertificateManager provides an interface for managing the SSL certificates used by the server.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.0.0
 */
@SuppressWarnings("unused")
public class HostCertificateManager extends ManagedObject {

    public HostCertificateManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public Object getCertificateInfo() {
        return this.getCurrentProperty("certificateInfo", HostCertificateManagerCertificateInfo.class);
    }

    public String generateCertificateSigningRequest(final boolean useIpAddressAsCommonName) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("useIpAddressAsCommonName", useIpAddressAsCommonName));
        try {
            return this.getVimService().getWsc().invoke("GenerateCertificateSigningRequest", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String generateCertificateSigningRequestByDn(final String distinguishedName) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("distinguishedName", String.class, distinguishedName));
        try {
            return this.getVimService().getWsc().invoke("GenerateCertificateSigningRequestByDn", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void installServerCertificate(final String cert) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cert", String.class, cert));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("InstallServerCertificate", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<String> listCACertificateRevocationLists() throws HostConfigFault, RuntimeFault {
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("ListCACertificateRevocationLists", this.getSingleSelfArgumentList(), String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<String> listCACertificates() throws HostConfigFault, RuntimeFault {
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("ListCACertificates", this.getSingleSelfArgumentList(), String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void replaceCACertificatesAndCRLs(final List<String> caCert, final List<String> caCrl) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("caCert", String[].class, caCert),
                new Argument("caCrl", String[].class, caCrl));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ReplaceCACertificatesAndCRLs", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
