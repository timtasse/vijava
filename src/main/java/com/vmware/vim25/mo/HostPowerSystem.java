package com.vmware.vim25.mo;

import com.vmware.vim25.*;

import java.rmi.RemoteException;

public class HostPowerSystem extends ManagedObject {
    /**
     * Constructor that reuse exiting web service connection
     * Use this contructor when you can re-use existing web service connection.
     *
     * @param serverConnection
     * @param mor
     */
    public HostPowerSystem(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public PowerSystemCapability getCapability() {
        return (PowerSystemCapability) getCurrentProperty("capability");
    }

    public PowerSystemInfo getInfo() {
        return (PowerSystemInfo) getCurrentProperty("info");
    }

    public void configurePowerPolicy(int key) throws HostConfigFault, RuntimeFault, RemoteException {
        getVimService().configurePowerPolicy(getMOR(), key);
    }
}
