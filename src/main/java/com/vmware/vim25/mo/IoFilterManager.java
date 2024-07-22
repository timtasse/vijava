package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Interface to manage IO Filters installed on the ESXi hosts and IO Filter configurations on virtual disks.
 * IO Filters are customized filters provided by third parties to process I/Os to virtual disks.
 * They can be used to provide data services such as flash caching and replication.
 * This interface is only supported on vCenter server.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0.0
 */
public class IoFilterManager extends ManagedObject {

    public IoFilterManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public Task installIoFilter(final String vibUrl, final ComputeResource compRes) throws AlreadyExists, RuntimeFault {
        return this.installIoFilter(vibUrl, compRes.getMOR());
    }

    public Task installIoFilter(final String vibUrl, final ManagedObjectReference compRes) throws AlreadyExists, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vibUrl", String.class, vibUrl),
                new Argument("compRes", ManagedObjectReference.class, compRes));
        try {
            final var mor = this.getVimService().getWsc().invoke("InstallIoFilter_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<VirtualDiskId> queryDisksUsingFilter(final String filterId, final ComputeResource compRes)
            throws NotFound, RuntimeFault {
        return this.queryDisksUsingFilter(filterId, compRes.getMOR());
    }

    public List<VirtualDiskId> queryDisksUsingFilter(final String filterId, final ManagedObjectReference compRes)
            throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("filterId", String.class, filterId),
                new Argument("compRes", ManagedObjectReference.class, compRes));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryDisksUsingFilter", params, VirtualDiskId.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<ClusterIoFilterInfo> queryIoFilterInfo(final ComputeResource compRes) throws RuntimeFault {
        return this.queryIoFilterInfo(compRes.getMOR());
    }

    public List<ClusterIoFilterInfo> queryIoFilterInfo(final ManagedObjectReference compRes) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("compRes", ManagedObjectReference.class, compRes));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryIoFilterInfo", params, ClusterIoFilterInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public IoFilterQueryIssueResult queryIssue(final String filterId, final ComputeResource compRes)
            throws NotFound, RuntimeFault {
        return this.queryIssue(filterId, compRes.getMOR());
    }

    public IoFilterQueryIssueResult queryIssue(final String filterId, final ManagedObjectReference compRes)
            throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("filterId", String.class, filterId),
                new Argument("compRes", ManagedObjectReference.class, compRes));
        try {
            return this.getVimService().getWsc().invoke("QueryIoFilterIssues", params, IoFilterQueryIssueResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task resolveInstallationErrorsOnCluster(final String filterId, final ClusterComputeResource cluster)
            throws NotFound, RuntimeFault {
        return this.resolveInstallationErrorsOnCluster(filterId, cluster.getMOR());
    }

    public Task resolveInstallationErrorsOnCluster(final String filterId, final ManagedObjectReference cluster)
            throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("filterId", String.class, filterId),
                new Argument("cluster", ManagedObjectReference.class, cluster));
        try {
            final var mor = this.getVimService().getWsc()
                    .invoke("ResolveInstallationErrorsOnCluster_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task resolveInstallationErrorsOnHost(final String filterId, final HostSystem host) throws NotFound, RuntimeFault {
        return this.resolveInstallationErrorsOnHost(filterId, host.getMOR());
    }

    public Task resolveInstallationErrorsOnHost(final String filterId, final ManagedObjectReference host) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("filterId", String.class, filterId),
                new Argument("host", ManagedObjectReference.class, host));
        try {
            final var mor = this.getVimService().getWsc()
                    .invoke("ResolveInstallationErrorsOnHost_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task uninstallIoFilter(final String filterId, final ComputeResource compRes)
            throws FilterInUse, InvalidState, NotFound, RuntimeFault {
        return this.uninstallIoFilter(filterId, compRes.getMOR());
    }

    public Task uninstallIoFilter(final String filterId, final ManagedObjectReference compRes)
            throws FilterInUse, InvalidState, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("filterId", String.class, filterId),
                new Argument("compRes", ManagedObjectReference.class, compRes));
        try {
            final var mor = this.getVimService().getWsc()
                    .invoke("UninstallIoFilter_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FilterInUse) {
                throw (FilterInUse) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
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

    public Task upgradeIoFilter(final String filterId, final ComputeResource compRes, final String vibUrl)
            throws InvalidState, NotFound, RuntimeFault {
        return this.upgradeIoFilter(filterId, compRes.getMOR(), vibUrl);
    }

    public Task upgradeIoFilter(final String filterId, final ManagedObjectReference compRes, final String vibUrl)
            throws InvalidState, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("filterId", String.class, filterId),
                new Argument("compRes", ManagedObjectReference.class, compRes),
                new Argument("vibUrl", String.class, vibUrl));
        try {
            final var mor = this.getVimService().getWsc()
                    .invoke("UpgradeIoFilter_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
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
