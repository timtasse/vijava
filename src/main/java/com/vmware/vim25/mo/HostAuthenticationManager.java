package com.vmware.vim25.mo;

import com.vmware.vim25.HostAuthenticationManagerInfo;
import com.vmware.vim25.ManagedObjectReference;

public class HostAuthenticationManager extends ManagedObject {

    /**
     * Constructor that reuse exiting web service connection
     * Use this contructor when you can re-use existing web service connection.
     *
     * @param serverConnection
     * @param mor
     */
    public HostAuthenticationManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public HostAuthenticationManagerInfo getInfo() {
        return (HostAuthenticationManagerInfo) getCurrentProperty("info");
    }

    public HostAuthenticationStore[] getSupportedStore() {
        ManagedObjectReference[] mors = (ManagedObjectReference[]) getCurrentProperty("supportedStore");
        HostAuthenticationStore[] hass = new HostAuthenticationStore[mors.length];

        for (int i = 0; i < mors.length; i++) {
            hass[i] = new HostAuthenticationStore(getServerConnection(), mors[i]);
        }
        return hass;
    }
}
