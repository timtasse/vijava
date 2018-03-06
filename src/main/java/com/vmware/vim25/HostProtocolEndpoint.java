package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 * @version 6.5
 */
public class HostProtocolEndpoint extends DynamicData {

    public String deviceId;
    public ManagedObjectReference[] hostKey;
    public String nfsDir;
    public String nfsServer;
    public String nfsServerAuthType;
    public String nfsServerMajor;
    public String nfsServerScope;
    public String nfsServerUser;
    public String peType;
    public String storageArray;
    public String type;
    public String uuid;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(final String deviceId) {
        this.deviceId = deviceId;
    }

    public ManagedObjectReference[] getHostKey() {
        return hostKey;
    }

    public void setHostKey(final ManagedObjectReference[] hostKey) {
        this.hostKey = hostKey;
    }

    public String getNfsDir() {
        return nfsDir;
    }

    public void setNfsDir(final String nfsDir) {
        this.nfsDir = nfsDir;
    }

    public String getNfsServer() {
        return nfsServer;
    }

    public void setNfsServer(final String nfsServer) {
        this.nfsServer = nfsServer;
    }

    public String getNfsServerAuthType() {
        return nfsServerAuthType;
    }

    public void setNfsServerAuthType(final String nfsServerAuthType) {
        this.nfsServerAuthType = nfsServerAuthType;
    }

    public String getNfsServerMajor() {
        return nfsServerMajor;
    }

    public void setNfsServerMajor(final String nfsServerMajor) {
        this.nfsServerMajor = nfsServerMajor;
    }

    public String getNfsServerScope() {
        return nfsServerScope;
    }

    public void setNfsServerScope(final String nfsServerScope) {
        this.nfsServerScope = nfsServerScope;
    }

    public String getNfsServerUser() {
        return nfsServerUser;
    }

    public void setNfsServerUser(final String nfsServerUser) {
        this.nfsServerUser = nfsServerUser;
    }

    public String getPeType() {
        return peType;
    }

    public void setPeType(final String peType) {
        this.peType = peType;
    }

    public String getStorageArray() {
        return storageArray;
    }

    public void setStorageArray(final String storageArray) {
        this.storageArray = storageArray;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }
}
