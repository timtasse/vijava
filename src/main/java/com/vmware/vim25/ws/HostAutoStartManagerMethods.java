package com.vmware.vim25.ws;

import com.vmware.vim25.HostAutoStartManagerConfig;
import com.vmware.vim25.ManagedObjectReference;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 10.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public interface HostAutoStartManagerMethods extends WSClientBasedInterfaces {

    default void reconfigureAutostart(final ManagedObjectReference mor, final HostAutoStartManagerConfig spec) throws RemoteException {
        final List<Argument> paras = Arrays.asList(
                new Argument("_this", "ManagedObjectReference", mor),
                new Argument("spec", "HostAutoStartManagerConfig", spec));
        getWsc().invoke("ReconfigureAutostart", paras, null);
    }

    default void autoStartPowerOn(ManagedObjectReference mor) throws RemoteException {
        List<Argument> paras = Arrays.asList(
                new Argument("_this", "ManagedObjectReference", mor));
        getWsc().invoke("AutoStartPowerOn", paras, null);
    }

    default void autoStartPowerOff(ManagedObjectReference mor) throws RemoteException {
        List<Argument> paras = Arrays.asList(
                new Argument("_this", "ManagedObjectReference", mor));
        getWsc().invoke("AutoStartPowerOff", paras, null);
    }
}
