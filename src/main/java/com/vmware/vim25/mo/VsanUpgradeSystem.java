package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * VSAN Upgrade System. Used to perform and monitor VSAN on-disk format upgrades.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.0.0
 */
@SuppressWarnings("unused")
public class VsanUpgradeSystem extends ManagedObject {

    public VsanUpgradeSystem(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public Task performUpgrade(final ManagedObjectReference cluster, final Boolean performObjectUpgrade,
                               final Boolean downgradeFormat, final Boolean allowReducedRedundancy,
                               final List<ManagedObjectReference> excludeHosts) throws VsanFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", ManagedObjectReference.class, cluster),
                new Argument("performObjectUpgrade", Boolean.class, performObjectUpgrade),
                new Argument("downgradeFormat", Boolean.class, downgradeFormat),
                new Argument("allowReducedRedundancy", Boolean.class, allowReducedRedundancy),
                new Argument("excludeHosts", ManagedObjectReference[].class, excludeHosts));
        try {
            final var mor = this.getVimService().getWsc()
                    .invoke("PerformVsanUpgrade_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VsanFault) {
                throw (VsanFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public VsanUpgradeSystemPreflightCheckResult performUpgradePreflightCheck(final ManagedObjectReference cluster,
                                                                              final Boolean downgradeFormat)
            throws VsanFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", ManagedObjectReference.class, cluster),
                new Argument("downgradeFormat", Boolean.class, downgradeFormat));
        try {
            return this.getVimService().getWsc()
                    .invoke("PerformVsanUpgradePreflightCheck", params, VsanUpgradeSystemPreflightCheckResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VsanFault) {
                throw (VsanFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public VsanUpgradeSystemUpgradeStatus queryUpgradeStatus(final ManagedObjectReference cluster) throws VsanFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cluster", ManagedObjectReference.class, cluster));
        try {
            return this.getVimService().getWsc().invoke("QueryVsanUpgradeStatus", params, VsanUpgradeSystemUpgradeStatus.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VsanFault) {
                throw (VsanFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
