package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class CryptoManagerHost extends CryptoManager {

    public CryptoManagerHost(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public Task changeKey(final CryptoKeyPlain newKey) throws InvalidState, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("newKey", CryptoKeyPlain.class, newKey));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("ChangeKey_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public void enable(final CryptoKeyPlain initialKey) throws AlreadyExists, InvalidState, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("initialKey", CryptoKeyPlain.class, initialKey));
        this.getVimService().getWsc().invokeWithoutReturn("CryptoManagerHostEnable", params);
    }

    public void prepare() throws InvalidState, RuntimeFault, RemoteException {
        this.getVimService().getWsc().invokeWithoutReturn("CryptoManagerHostPrepare", this.getSingleSelfArgumentList());
    }

}
