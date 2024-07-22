package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import static org.doublecloud.ws.util.TypeUtil.asNullSafeList;

/**
 * FailoverClusterConfigurator provides operations to create and configure a vCenter High Availability Cluster (VCHA Cluster).
 * A VCHA Cluster consists of three VMs. One is the Active vCenter VM that serves client requests.
 * Second is the Passive VM that is identical to the Active vCenter VM in terms of resources and capabilities.
 * Passive VM constantly receives updates from Active VM and takes over the role of Active vCenter VM in the event of failover.
 * Third is the Witness VM that acts as a quorum VM in a VCHA Cluster.
 * Sole purpose of Witness VM is to avoid classic split-brain problem in a VCHA Cluster.
 * A VCHA Cluster can be deployed in two possible ways -
 *   1. Automatic deployment - Configuration (described below) inputs for each node in a VCHA Cluster is provided by the user.
 *      A Deployment workflow is used that automatically deploys Passive and Witness VM and configures each node to form a VCHA Cluster.
 *   2. Manual deployment - User provisions and creates Passive and Witness VMs and uses Configuration workflow to configure
 *      Active, Passive and Witness VM to form a VCHA Cluster. Passive and Witness VMs must be created using the VM-Clone operation
 *      with Active VM as the source.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
@SuppressWarnings("unused")
public class FailoverClusterConfigurator extends ManagedObject {

    /**
     * Constructor that reuse exiting web service connection
     * Use this contructor when you can re-use existing web service connection.
     *
     * @param serverConnection
     * @param mor
     */
    public FailoverClusterConfigurator(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public List<String> disabledConfigureMethod() {
        return asNullSafeList(getCurrentProperty("disabledConfigureMethod", String[].class));
    }

    public Task configureVcha_Task(final VchaClusterConfigSpec configSpec) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("configSpec", VchaClusterConfigSpec.class, configSpec));
        try {
            final var mor = this.getVimService().getWsc().invoke("configureVcha_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task createPassiveNode_Task(final PassiveNodeDeploymentSpec passiveDeploymentSpec, final SourceNodeSpec sourceVcSpec) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("passiveDeploymentSpec", PassiveNodeDeploymentSpec.class, passiveDeploymentSpec),
                new Argument("sourceVcSpec", SourceNodeSpec.class, sourceVcSpec));
        try {
            final var mor = this.getVimService().getWsc().invoke("createPassiveNode_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task createWitnessNode_Task(final NodeDeploymentSpec witnessDeploymentSpec, final SourceNodeSpec sourceVcSpec) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("witnessDeploymentSpec", NodeDeploymentSpec.class, witnessDeploymentSpec),
                new Argument("sourceVcSpec", SourceNodeSpec.class, sourceVcSpec));
        try {
            final var mor = this.getVimService().getWsc().invoke("createWitnessNode_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task deployVcha_Task(final VchaClusterDeploymentSpec deploymentSpec) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("deploymentSpec", VchaClusterDeploymentSpec.class, deploymentSpec));
        try {
            final var mor = this.getVimService().getWsc().invoke("deployVcha_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task destroyVcha_Task() throws RuntimeFault {
        try {
            final var mor = this.getVimService().getWsc().invoke("destroyVcha_Task", this.getSingleSelfArgumentList(), ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public VchaClusterConfigInfo getVchaConfig() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("getVchaConfig", this.getSingleSelfArgumentList(), VchaClusterConfigInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task prepareVcha_Task(final VchaClusterNetworkSpec networkSpec) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("networkSpec", VchaClusterNetworkSpec.class, networkSpec));
        try {
            final var mor = this.getVimService().getWsc().invoke("prepareVcha_Task", params, ManagedObjectReference.class);
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
