package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Singleton Managed Object used to manage cryptographic keys.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.1
 * @since 6.5
 */
@SuppressWarnings("unused")
public class CryptoManagerKmip extends CryptoManager {

    public CryptoManagerKmip(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public List<KmipClusterInfo> getKmipServers() {
        return Optional.ofNullable((KmipClusterInfo[]) this.getCurrentProperty("kmipServers")).map(List::of).orElse(List.of());
    }

    public String generateClientCsr(final KeyProviderId cluster) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster));
        try {
            return this.getVimService().getWsc().invoke("GenerateClientCsr", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public CryptoKeyResult generateKey(final KeyProviderId keyProvider) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("keyProvider", KeyProviderId.class, keyProvider));
        try {
            return this.getVimService().getWsc().invoke("GenerateKey", params, CryptoKeyResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String generateSelfSignedClientCert(final KeyProviderId cluster) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster));
        try {
            return this.getVimService().getWsc().invoke("GenerateSelfSignedClientCert", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public KeyProviderId getDefaultKmsCluster(final ManagedObjectReference entity, final Boolean defaultsToParent) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", ManagedObjectReference.class, entity),
                new Argument("defaultsToParent", "boolean", defaultsToParent));
        try {
            return this.getVimService().getWsc().invoke("GetDefaultKmsCluster", params, KeyProviderId.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public boolean isKmsClusterActive(final KeyProviderId cluster) throws InvalidArgument, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster));
        try {
            return this.getVimService().getWsc().invoke("IsKmsClusterActive", params, Boolean.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidArgument) {
                throw (InvalidArgument) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<KmipClusterInfo> listKmipServers(final Integer limit) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("limit", Integer.class, limit));
        try {
            return (List<KmipClusterInfo>) this.getVimService().getWsc()
                    .invoke("ListKmipServers", params, "List.KmipClusterInfo");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<KmipClusterInfo> listKmsClusters(final Boolean includeKmsServers, final Integer managementTypeFilter, final Integer statusFilter)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("includeKmsServers", Boolean.class, includeKmsServers),
                new Argument("managementTypeFilter", Integer.class, managementTypeFilter),
                new Argument("statusFilter", Integer.class, statusFilter));
        try {
            return (List<KmipClusterInfo>) this.getVimService().getWsc()
                    .invoke("ListKmsClusters", params, "List.KmipClusterInfo");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void markDefault(final KeyProviderId clusterId) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("clusterId", KeyProviderId.class, clusterId));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("MarkDefault", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<CryptoManagerKmipCryptoKeyStatus> queryCryptoKeyStatus(final List<CryptoKeyId> keyIds, final int checkKeyBitMap)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("keyIds", "CryptoKeyId[]", keyIds.toArray()),
                new Argument("checkKeyBitMap", "int", checkKeyBitMap));
        try {
            return (List<CryptoManagerKmipCryptoKeyStatus>) this.getVimService().getWsc()
                    .invoke("QueryCryptoKeyStatus", params, "List.CryptoManagerKmipCryptoKeyStatus");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void registerKmipServer(final KmipServerSpec server) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("server", KmipServerSpec.class, server));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RegisterKmipServer", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void registerKmsCluster(final KeyProviderId clusterId, final String managementType) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("clusterId", KeyProviderId.class, clusterId),
                new Argument("managementType", String.class, managementType));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RegisterKmsCluster", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void removeKmipServer(final KeyProviderId clusterId, final String serverName) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("clusterId", KeyProviderId.class, clusterId),
                new Argument("serverName", String.class, serverName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveKmipServer", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String retrieveClientCert(final KeyProviderId cluster) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster));
        try {
            return this.getVimService().getWsc().invoke("RetrieveClientCert", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String retrieveClientCsr(final KeyProviderId cluster) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster));
        try {
            return this.getVimService().getWsc().invoke("RetrieveClientCsr", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public CryptoManagerKmipServerCertInfo retrieveKmipServerCert(final KeyProviderId keyProvider, final KmipServerInfo server)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("keyProvider", KeyProviderId.class, keyProvider),
                new Argument("server", KmipServerInfo.class, server));
        try {
            return this.getVimService().getWsc().invoke("RetrieveKmipServerCert", params, CryptoManagerKmipServerCertInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task retrieveKmipServersStatus(final List<KmipClusterInfo> clusters) throws RuntimeFault {
        if (clusters == null) {
            throw new IllegalArgumentException("clusters should not be null");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("clusters", "KmipClusterInfo[]", clusters.toArray()));
        try {
            return this.invokeWithTaskReturn("RetrieveKmipServersStatus_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String retrieveSelfSignedClientCert(final KeyProviderId cluster) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster));
        try {
            return this.getVimService().getWsc().invoke("RetrieveSelfSignedClientCert", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void setDefaultKmsCluster(final ManagedObjectReference entity, final KeyProviderId clusterId) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", ManagedObjectReference.class, entity),
                new Argument("clusterId", KeyProviderId.class, clusterId));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("SetDefaultKmsCluster", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void unregisterKmsCluster(final KeyProviderId clusterId) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("clusterId", KeyProviderId.class, clusterId));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UnregisterKmsCluster", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateKmipServer(final KmipServerSpec server) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("server", KmipServerSpec.class, server));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateKmipServer", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateKmsSignedCsrClientCert(final KeyProviderId cluster, final String certificate) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster),
                new Argument("certificate", String.class, certificate));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateKmsSignedCsrClientCert", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateSelfSignedClientCert(final KeyProviderId cluster, final String certificate) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster),
                new Argument("certificate", String.class, certificate));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateSelfSignedClientCert", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void uploadClientCert(final KeyProviderId cluster, final String certificate, final String privateKey) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster),
                new Argument("certificate", String.class, certificate),
                new Argument("privateKey", String.class, privateKey));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UploadClientCert", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void uploadKmipServerCert(final KeyProviderId cluster, final String certificate) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster),
                new Argument("certificate", String.class, certificate));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UploadKmipServerCert", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public CryptoKeyResult setKeyCustomAttributes(final CryptoKeyId keyId, final CryptoManagerKmipCustomAttributeSpec spec)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("keyId", CryptoKeyId.class, keyId),
                new Argument("spec", CryptoManagerKmipCustomAttributeSpec.class, spec));
        try {
            return this.getVimService().getWsc().invoke("SetKeyCustomAttributes", params, CryptoKeyResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
