package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VchaClusterRuntimeInfo extends DynamicData {

    public String clusterMode;
    public String clusterState;
    public VchaNodeRuntimeInfo[] nodeInfo;

    public String getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(final String clusterMode) {
        this.clusterMode = clusterMode;
    }

    public String getClusterState() {
        return clusterState;
    }

    public void setClusterState(final String clusterState) {
        this.clusterState = clusterState;
    }

    public VchaNodeRuntimeInfo[] getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(final VchaNodeRuntimeInfo[] nodeInfo) {
        this.nodeInfo = nodeInfo;
    }
}
