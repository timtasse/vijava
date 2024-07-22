package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The HostSpecificationManager provides the functionality to update, retrieve and delete HostSpecification and HostSubSpecification.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5.0
 * @version 6.5.0
 */
public class HostSpecificationManager extends ManagedObject {

    /**
     * Constructor that reuse exiting web service connection
     * Use this contructor when you can re-use existing web service connection.
     *
     * @param serverConnection
     * @param mor
     */
    public HostSpecificationManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public void deleteHostSpecification(final HostSystem host) throws HostSpecificationOperationFailed, RuntimeFault {
        this.deleteHostSpecification(host.getMOR());
    }

    public void deleteHostSpecification(final ManagedObjectReference host) throws HostSpecificationOperationFailed, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference.class, host));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DeleteHostSpecification", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostSpecificationOperationFailed) {
                throw (HostSpecificationOperationFailed) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void deleteHostSubSpecification(final HostSystem host, final String subSpecName)
            throws HostSpecificationOperationFailed, RuntimeFault {
        this.deleteHostSubSpecification(host.getMOR(), subSpecName);
    }

    public void deleteHostSubSpecification(final ManagedObjectReference host, final String subSpecName)
            throws HostSpecificationOperationFailed, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference.class, host),
                new Argument("subSpecName", String.class, subSpecName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DeleteHostSubSpecification", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostSpecificationOperationFailed) {
                throw (HostSpecificationOperationFailed) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<HostSystem> getUpdatedHosts(final String startChangeID, final String endChangeID) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("startChangeID", String.class, startChangeID),
                new Argument("endChangeID", String.class, endChangeID));
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("HostSpecGetUpdatedHosts", params, ManagedObjectReference.class)
                    .stream().map(mor -> new HostSystem(this.getServerConnection(), mor)).collect(Collectors.toList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public HostSpecification retrieveHostSpecification(final HostSystem host, final boolean fromHost)
            throws HostSpecificationOperationFailed, RuntimeFault {
        return this.retrieveHostSpecification(host.getMOR(), fromHost);
    }

    public HostSpecification retrieveHostSpecification(final ManagedObjectReference host, final boolean fromHost)
            throws HostSpecificationOperationFailed, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference.class, host),
                Argument.fromBasicType("fromHost", fromHost));
        try {
            return this.getVimService().getWsc().invoke("RetrieveHostSpecification", params, HostSpecification.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostSpecificationOperationFailed) {
                throw (HostSpecificationOperationFailed) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateHostSpecification(final HostSystem host, final HostSpecification hostSpec)
            throws HostSpecificationOperationFailed, RuntimeFault {
        this.updateHostSpecification(host.getMOR(), hostSpec);
    }

    public void updateHostSpecification(final ManagedObjectReference host, final HostSpecification hostSpec)
            throws HostSpecificationOperationFailed, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference.class, host),
                new Argument("hostSpec", HostSpecification.class, hostSpec));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateHostSpecification", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostSpecificationOperationFailed) {
                throw (HostSpecificationOperationFailed) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateHostSubSpecification(final HostSystem host, final HostSubSpecification hostSubSpec)
            throws HostSpecificationOperationFailed, RuntimeFault {
        this.updateHostSubSpecification(host.getMOR(), hostSubSpec);
    }

    public void updateHostSubSpecification(final ManagedObjectReference host, final HostSubSpecification hostSubSpec)
            throws HostSpecificationOperationFailed, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference.class, host),
                new Argument("hostSubSpec", HostSpecification.class, hostSubSpec));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateHostSubSpecification", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostSpecificationOperationFailed) {
                throw (HostSpecificationOperationFailed) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
