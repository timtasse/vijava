package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Controls Enhanced vMotion Compatibility mode for a particular cluster given by ManagedCluster.
 * VMware Enhanced vMotion Compatibility (EVC) facilitates vMotion between different CPU generations through
 * the use of Intel Flex Migration and AMD-V Extended Migration technologies. When enabled for a cluster,
 * EVC ensures that all VMs are vMotion-compatible with the CPUs of all hosts in the cluster.
 * @see EVCMode
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.0.0
 */
@SuppressWarnings("unused")
public class ClusterEVCManager extends ExtensibleManagedObject {

    public ClusterEVCManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public ClusterComputeResource getManagedCluster() {
        return (ClusterComputeResource) getManagedObject("managedCluster");
    }

    public ClusterEVCManagerEVCState getEvcState() {
        return this.getCurrentProperty("evcState", ClusterEVCManagerEVCState.class);
    }

    public Task checkAddHostEvc(final HostConnectSpec cnxSpec) throws RuntimeFault, HostConnectFault, InvalidLogin {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("cnxSpec", HostConnectSpec.class, cnxSpec));
        try {
            final var mor = this.getVimService().getWsc().invoke("CheckAddHostEvc_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConnectFault) {
                throw (HostConnectFault) cause;
            }
            if (cause instanceof InvalidLogin) {
                throw (InvalidLogin) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task checkConfigureEvc(final String evcModeKey, final String evcGraphicsModeKey) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("evcModeKey", String.class, evcModeKey),
                new Argument("evcGraphicsModeKey", String.class, evcGraphicsModeKey));
        try {
            final var mor = this.getVimService().getWsc().invoke("CheckConfigureEvcMode_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task configureEvc(final String evcModeKey, final String evcGraphicsModeKey) throws EVCConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("evcModeKey", String.class, evcModeKey),
                new Argument("evcGraphicsModeKey", String.class, evcGraphicsModeKey));
        try {
            final var mor = this.getVimService().getWsc().invoke("ConfigureEvcMode_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof EVCConfigFault) {
                throw (EVCConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task disableEvc() throws RuntimeFault {
        try {
            final var mor = this.getVimService().getWsc().invoke("DisableEvcMode_Task", this.getSingleSelfArgumentList(), ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
