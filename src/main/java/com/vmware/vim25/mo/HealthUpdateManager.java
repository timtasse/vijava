package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5.0
 */
@SuppressWarnings("unused")
public class HealthUpdateManager extends ManagedObject {

    /**
     * Constructor that reuse exiting web service connection
     * Use this contructor when you can re-use existing web service connection.
     *
     * @param serverConnection
     * @param mor
     */
    public HealthUpdateManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public String addFilter(final String providerId, final String filterName, final List<String> infoIds) throws
            NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("providerId", String.class, providerId),
                new Argument("filterName", String.class, filterName),
                new Argument("infoIds", String[].class, infoIds));
        try {
            return this.getVimService().getWsc().invoke("AddFilter", params, String.class);
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

    public void addFilterEntities(final String filterId, final List<ManagedEntity> entities) throws
            NotFound, RuntimeFault {
        this.addFilterEntitiesByMOR(filterId, entities.stream().map(ManagedEntity::getMOR).collect(Collectors.toList()));
    }

    public void addFilterEntitiesByMOR(final String filterId, final List<ManagedObjectReference> entities) throws
            NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("filterId", String.class, filterId),
                new Argument("entities", ManagedObjectReference[].class, entities));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("AddFilterEntities", params);
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

    public void addMonitoredEntities(final String providerId, final List<ManagedEntity> entities) throws
            NotFound, RuntimeFault {
        this.addMonitoredEntitiesByMOR(providerId, entities.stream().map(ManagedEntity::getMOR).collect(Collectors.toList()));
    }

    public void addMonitoredEntitiesByMOR(final String providerId, final List<ManagedObjectReference> entities) throws
            NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("providerId", String.class, providerId),
                new Argument("entities", ManagedObjectReference[].class, entities));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("AddMonitoredEntities", params);
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

    public boolean hasMonitoredEntity(final String providerId, final List<ManagedEntity> entities) throws NotFound, RuntimeFault {
        return this.hasMonitoredEntityByMOR(providerId, entities.stream().map(ManagedEntity::getMOR).collect(Collectors.toList()));
    }

    public boolean hasMonitoredEntityByMOR(final String providerId, final List<ManagedObjectReference> entities) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("providerId", String.class, providerId),
                new Argument("entities", ManagedObjectReference[].class, entities));
        try {
            return this.getVimService().getWsc().invoke("HasMonitoredEntity", params, Boolean.class);
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

    public boolean hasProvider(final String id) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", String.class, id));
        try {
            return this.getVimService().getWsc().invoke("HasProvider", params, Boolean.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void postHealthUpdates(final String providerId, final List<HealthUpdate> updates) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("providerId", String.class, providerId),
                new Argument("updates", HealthUpdate[].class, updates));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("PostHealthUpdates", params);
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

    public List<ManagedEntity> queryFilterEntities(final String filterId) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("filterId", String.class, filterId));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryFilterEntities", params, ManagedObjectReference.class)
                    .stream().map(mor -> new ManagedEntity(this.getServerConnection(), mor)).collect(Collectors.toList());
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

    public List<String> queryFilterInfoIds(final String filterId) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("filterId", String.class, filterId));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryFilterInfoIds", params, String.class);
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

    public List<String> queryFilterList(final String providerId) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("providerId", String.class, providerId));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryFilterList", params, String.class);
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

    public String queryFilterName(final String filterId) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("filterId", String.class, filterId));
        try {
            return this.getVimService().getWsc().invoke("QueryFilterName", params, String.class);
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

    public List<HealthUpdateInfo> queryHealthUpdateInfos(final String providerId) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("providerId", String.class, providerId));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryHealthUpdateInfos", params, HealthUpdateInfo.class);
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

    public List<HealthUpdate> queryHealthUpdates(final String providerId) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("providerId", String.class, providerId));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryHealthUpdates", params, HealthUpdate.class);
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

    public List<ManagedEntity> queryMonitoredEntities(final String providerId) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("providerId", String.class, providerId));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryMonitoredEntities", params, ManagedObjectReference.class)
                    .stream().map(mor -> new ManagedEntity(this.getServerConnection(), mor)).collect(Collectors.toList());
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

    public List<String> queryProviderList() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryProviderList", this.getSingleSelfArgumentList(), String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String queryProviderName(final String id) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", String.class, id));
        try {
            return this.getVimService().getWsc().invoke("QueryProviderName", params, String.class);
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

    public List<HostSystem> queryUnmonitoredHosts(final String providerId, final ClusterComputeResource cluster)
            throws NotFound, RuntimeFault {
        return this.queryUnmonitoredHosts(providerId, cluster.getMOR());
    }

    public List<HostSystem> queryUnmonitoredHosts(final String providerId, final ManagedObjectReference cluster)
            throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("providerId", String.class, providerId),
                new Argument("cluster", ManagedObjectReference.class, cluster));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryUnmonitoredHosts", params, ManagedObjectReference.class)
                    .stream().map(mor -> new HostSystem(this.getServerConnection(), mor)).collect(Collectors.toList());
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

    public String registerProvider(final String name, final List<HealthUpdateInfo> healthUpdateInfo) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name),
                new Argument("healthUpdateInfo", HealthUpdateInfo[].class, healthUpdateInfo));
        try {
            return this.getVimService().getWsc().invoke("RegisterHealthUpdateProvider", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void removeFilter(final String filterId) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("filterId", String.class, filterId));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveFilter", params);
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

    public void removeFilterEntities(final String filterId, final List<ManagedEntity> entities) throws NotFound, RuntimeFault {
        this.removeFilterEntitiesByMOR(filterId, entities.stream().map(ManagedEntity::getMOR).collect(Collectors.toList()));
    }

    public void removeFilterEntitiesByMOR(final String filterId, final List<ManagedObjectReference> entities) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("filterId", String.class, filterId),
                new Argument("entities", ManagedObjectReference[].class, entities));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveFilterEntities", params);
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


    public void removeMonitoredEntities(final String providerId, final List<ManagedEntity> entities)
            throws InvalidState, NotFound, RuntimeFault {
        this.removeMonitoredEntitiesByMOR(providerId, entities.stream().map(ManagedEntity::getMOR).collect(Collectors.toList()));
    }

    public void removeMonitoredEntitiesByMOR(final String providerId, final List<ManagedObjectReference> entities)
            throws InvalidState, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("providerId", String.class, providerId),
                new Argument("entities", ManagedObjectReference[].class, entities));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveMonitoredEntities", params);
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

    public void unregisterProvider(final String providerId) throws InvalidState, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("providerId", String.class, providerId));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UnregisterHealthUpdateProvider", params);
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
