package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 * @since 6.7
 */
@SuppressWarnings("unused")
public class CryptoManagerHost extends CryptoManager {

    public CryptoManagerHost(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public Task changeKey(final CryptoKeyPlain newKey) throws InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("newKey", CryptoKeyPlain.class, newKey));
        try {
            return this.invokeWithTaskReturn("ChangeKey_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void disable() throws InvalidState, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("CryptoManagerHostDisable", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void enable(final CryptoKeyPlain initialKey) throws AlreadyExists, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("initialKey", CryptoKeyPlain.class, initialKey));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("CryptoManagerHostEnable", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void prepare() throws InvalidState, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("CryptoManagerHostPrepare", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
