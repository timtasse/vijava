package com.vmware.vim25.mo;

import com.vmware.vim25.AuthMinimumAdminPermission;
import com.vmware.vim25.ManagedObjectNotFound;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.mo.util.MorUtil;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * A singleton managed object for managing vCenter tenants.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
@SuppressWarnings("unused")
public class TenantTenantManager extends ManagedObject {

    /**
     * Constructor that reuse exiting web service connection
     * Use this contructor when you can re-use existing web service connection.
     *
     * @param serverConnection
     * @param mor
     */
    public TenantTenantManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public void markServiceProviderEntities(final List<ManagedObjectReference> entity)
            throws AuthMinimumAdminPermission, ManagedObjectNotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", ManagedObjectReference[].class, entity == null ? null : entity.toArray()));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("MarkServiceProviderEntities", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AuthMinimumAdminPermission) {
                throw (AuthMinimumAdminPermission) cause;
            }
            if (cause instanceof ManagedObjectNotFound) {
                throw (ManagedObjectNotFound) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<ManagedEntity> retrieveServiceProviderEntities() throws RuntimeFault {
        try {
            return Optional.ofNullable(this.getVimService().getWsc()
                    .invoke("RetrieveServiceProviderEntities", this.getSingleSelfArgumentList(), ManagedObjectReference[].class))
                    .map(Arrays::asList)
                    .stream().map(ManagedObjectReference.class::cast)
                    .map(mor -> MorUtil.createExactManagedEntity(this.getServerConnection(), mor, null))
                    .collect(Collectors.toList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void unmarkServiceProviderEntities(final List<ManagedObjectReference> entity)
            throws ManagedObjectNotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", ManagedObjectReference[].class, entity == null ? null : entity.toArray()));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UnmarkServiceProviderEntities", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ManagedObjectNotFound) {
                throw (ManagedObjectNotFound) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
