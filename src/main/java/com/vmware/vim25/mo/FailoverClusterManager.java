package com.vmware.vim25.mo;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.VchaClusterHealth;
import com.vmware.vim25.VchaClusterMode;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import static org.doublecloud.ws.util.TypeUtil.asNullSafeList;

/**
 * FailoverClusterManager provides operations to manage a vCenter High Availability Cluster (VCHA Cluster).
 * A VCHA Cluster consists of three VMs. One is the Active vCenter VM that serves client requests.
 * Second is the Passive VM that is identical to the Active vCenter VM in terms of resources and capabilities.
 * Passive VM constantly receives updates from Active VM and takes over the role of Active vCenter VM in the event of failover.
 * Third is the Witness VM that acts as a quorum VM in a VCHA Cluster.
 * Sole purpose of Witness VM is to avoid classic split-brain problem in a VCHA Cluster.
 * A VCHA Cluster has following states:
 * 1. Healthy - All three nodes in a VCHA Cluster are healthy and connected.
 *    State replication between Active and Passive node is working and both nodes are in-sync.
 * 2. Degraded - A VCHA Cluster is said to be in degraded state when it has lost one of the three nodes.
 *    Node loss can be due to various reasons and as a result the lost node is not visible to other two nodes.
 *    If an Active node is lost, Passive node will take the role of Active node.
 *    If Passive or Witness node is lost, Active node will continue to serve requests.
 *    A VCHA Cluster can also be in degraded state if state replication fails between Active and Passive nodes.
 * 3. Isolated - All three nodes are isolated from each other. If this happens while VCHA Cluster is in enabled mode,
 *    Active node stops serving client requests. If nodes are isolated in a disabled VCHA Cluster mode,
 *    Active node continues to serve client requests.
 * A VCHA Cluster has following modes:
 * 1. Enabled - State replication between Active and Passive nodes is enabled and automatic failover happens if
 *    Active node fails while the VCHA Cluster is in a healthy state.
 * 2. Disabled - All three nodes are part of VCHA Cluster but state replication and automatic failover is disabled.
 * 3. Maintenance - All three nodes are part of VCHA Cluster but automatic failover is disabled while state replication continues.
 *    Active node continues to serve client requests even if Passive and Witness nodes are lost.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class FailoverClusterManager extends ManagedObject {

    /**
     * Constructor that reuse exiting web service connection
     * Use this contructor when you can re-use existing web service connection.
     *
     * @param serverConnection
     * @param mor
     */
    public FailoverClusterManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public List<String> disabledClusterMethod() {
        return asNullSafeList(getCurrentProperty("disabledClusterMethod", String[].class));
    }

    public VchaClusterMode getClusterMode() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("getClusterMode", this.getSingleSelfArgumentList(), VchaClusterMode.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public VchaClusterHealth getClusterHealth() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("GetVchaClusterHealth", this.getSingleSelfArgumentList(), VchaClusterHealth.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task initiateFailover_Task(final boolean planned) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("planned", planned));
        try {
            final var mor = this.getVimService().getWsc().invoke("initiateFailover_Task", params, ManagedObjectReference.class);
            return new Task(this.getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task setClusterMode_Task(final VchaClusterMode mode) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("mode", String.class, mode.name()));
        try {
            final var mor = this.getVimService().getWsc().invoke("setClusterMode_Task", params, ManagedObjectReference.class);
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
