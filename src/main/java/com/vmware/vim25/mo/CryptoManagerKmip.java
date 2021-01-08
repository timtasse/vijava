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
 * @version 6.7.2
 * @since 6.5
 */
@SuppressWarnings("unchecked")
public class CryptoManagerKmip extends CryptoManager {

    public CryptoManagerKmip(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public List<KmipClusterInfo> getKmipServers() {
        return Optional.ofNullable((KmipClusterInfo[]) this.getCurrentProperty("kmipServers")).map(List::of).orElse(List.of());
    }

    public String generateClientCsr(final KeyProviderId cluster) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster));
        return this.getVimService().getWsc().invoke("GenerateClientCsr", params, String.class);
    }

    public CryptoKeyResult generateKey(final KeyProviderId keyProvider) throws InvalidArgument, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("keyProvider", KeyProviderId.class, keyProvider));
        return this.getVimService().getWsc().invoke("GenerateKey", params, CryptoKeyResult.class);
    }

    public String generateSelfSignedClientCert(final KeyProviderId cluster) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster));
        return this.getVimService().getWsc().invoke("GenerateSelfSignedClientCert", params, String.class);
    }

    public List<KmipClusterInfo> listKmipServers(final Integer limit) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("limit", Integer.class, limit));
        return (List<KmipClusterInfo>) this.getVimService().getWsc().invoke("ListKmipServers", params, "List.KmipClusterInfo");
    }

    public void markDefault(final KeyProviderId clusterId) throws InvalidArgument, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("clusterId", KeyProviderId.class, clusterId));
        this.getVimService().getWsc().invokeWithoutReturn("MarkDefault", params);
    }

    public List<CryptoManagerKmipCryptoKeyStatus> queryCryptoKeyStatus(final List<CryptoKeyId> keyIds, final int checkKeyBitMap) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("keyIds", "CryptoKeyId[]", keyIds.toArray()),
                new Argument("checkKeyBitMap", "int", checkKeyBitMap));
        return (List<CryptoManagerKmipCryptoKeyStatus>) this.getVimService().getWsc().invoke("QueryCryptoKeyStatus", params, "List.CryptoManagerKmipCryptoKeyStatus");
    }

    public void registerKmipServer(final KmipServerSpec server) throws InvalidArgument, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("server", KmipServerSpec.class, server));
        this.getVimService().getWsc().invokeWithoutReturn("RegisterKmipServer", params);
    }

    public void removeKmipServer(final KeyProviderId clusterId, final String serverName) throws InvalidArgument, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("clusterId", KeyProviderId.class, clusterId),
                new Argument("serverName", String.class, serverName));
        this.getVimService().getWsc().invokeWithoutReturn("RemoveKmipServer", params);
    }

    public String retrieveClientCert(final KeyProviderId cluster) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster));
        return this.getVimService().getWsc().invoke("RetrieveClientCert", params, String.class);
    }

    public String retrieveClientCsr(final KeyProviderId cluster) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster));
        return this.getVimService().getWsc().invoke("RetrieveClientCsr", params, String.class);
    }

    public CryptoManagerKmipServerCertInfo retrieveKmipServerCert(final KeyProviderId keyProvider, final KmipServerInfo server) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("keyProvider", KeyProviderId.class, keyProvider),
                new Argument("server", KmipServerInfo.class, server));
        return this.getVimService().getWsc().invoke("RetrieveKmipServerCert", params, CryptoManagerKmipServerCertInfo.class);
    }

    public Task retrieveKmipServersStatus(final List<KmipClusterInfo> clusters) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("clusters", "KmipClusterInfo[]", clusters.toArray()));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("RetrieveKmipServersStatus_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public String retrieveSelfSignedClientCert(final KeyProviderId cluster) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster));
        return this.getVimService().getWsc().invoke("RetrieveSelfSignedClientCert", params, String.class);
    }

    public void updateKmipServer(final KmipServerSpec server) throws InvalidArgument, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("server", KmipServerSpec.class, server));
        this.getVimService().getWsc().invokeWithoutReturn("UpdateKmipServer", params);
    }

    public void updateKmsSignedCsrClientCert(final KeyProviderId cluster, final String certificate) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster),
                new Argument("certificate", String.class, certificate));
        this.getVimService().getWsc().invokeWithoutReturn("UpdateKmsSignedCsrClientCert", params);
    }

    public void updateSelfSignedClientCert(final KeyProviderId cluster, final String certificate) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster),
                new Argument("certificate", String.class, certificate));
        this.getVimService().getWsc().invokeWithoutReturn("UpdateSelfSignedClientCert", params);
    }

    public void uploadClientCert(final KeyProviderId cluster, final String certificate, final String privateKey) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster),
                new Argument("certificate", String.class, certificate),
                new Argument("privateKey", String.class, privateKey));
        this.getVimService().getWsc().invokeWithoutReturn("UploadClientCert", params);
    }

    public void uploadKmipServerCert(final KeyProviderId cluster, final String certificate) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", KeyProviderId.class, cluster),
                new Argument("certificate", String.class, certificate));
        this.getVimService().getWsc().invokeWithoutReturn("UploadKmipServerCert", params);
    }

}
