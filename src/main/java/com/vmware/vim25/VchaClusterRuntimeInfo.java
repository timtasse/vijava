package com.vmware.vim25;

import java.util.List;

/**
 * The VchaClusterRuntimeInfo class describes the runtime information of a VCHA Cluster.
 * This includes the last known state of the cluster and last known states of each node.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VchaClusterRuntimeInfo extends DynamicData {

    private VchaClusterState clusterState;
    private List<VchaNodeRuntimeInfo> nodeInfo = List.of();
    private VchaClusterMode clusterMode;

    @Override
    public String toString() {
        return "VchaClusterRuntimeInfo{" +
                "clusterState=" + clusterState +
                ", nodeInfo=" + nodeInfo +
                ", clusterMode=" + clusterMode +
                '}';
    }

    public VchaClusterState getClusterState() {
        return clusterState;
    }

    public void setClusterState(final VchaClusterState clusterState) {
        this.clusterState = clusterState;
    }

    public List<VchaNodeRuntimeInfo> getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(final List<VchaNodeRuntimeInfo> nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public VchaClusterMode getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(final VchaClusterMode clusterMode) {
        this.clusterMode = clusterMode;
    }

}
