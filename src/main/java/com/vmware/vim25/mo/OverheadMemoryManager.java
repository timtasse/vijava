package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Provide static VM overhead memory values for (vm, host) pairs in Virtual Center.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0.0
 */
public class OverheadMemoryManager extends ManagedObject {

    public OverheadMemoryManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public long lookupVmOverheadMemory(final VirtualMachine vm, final HostSystem host) throws InvalidArgument,
            InvalidType, ManagedObjectNotFound, NotFound, RuntimeFault {
        return this.lookupVmOverheadMemory(vm.getMOR(), host.getMOR());
    }

    public long lookupVmOverheadMemory(final ManagedObjectReference vm, final ManagedObjectReference host) throws InvalidArgument,
            InvalidType, ManagedObjectNotFound, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, vm),
                new Argument("host", ManagedObjectReference.class, host));
        try {
            return this.getVimService().getWsc().invoke("LookupVmOverheadMemory", params, Long.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidArgument) {
                throw (InvalidArgument) cause;
            }
            if (cause instanceof InvalidType) {
                throw (InvalidType) cause;
            }
            if (cause instanceof ManagedObjectNotFound) {
                throw (ManagedObjectNotFound) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
