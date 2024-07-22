package com.vmware.vim25;

/**
 * The VchaNodeRuntimeInfo class describes a node's runtime information in a VCHA Cluster.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VchaNodeRuntimeInfo extends DynamicData {

    private VchaNodeState nodeState;
    private VchaNodeRole nodeRole;
    private String nodeIp;

    @Override
    public String toString() {
        return "VchaNodeRuntimeInfo{" +
                "nodeState=" + nodeState +
                ", nodeRole=" + nodeRole +
                ", nodeIp='" + nodeIp + '\'' +
                '}';
    }

    public VchaNodeState getNodeState() {
        return nodeState;
    }

    public void setNodeState(final VchaNodeState nodeState) {
        this.nodeState = nodeState;
    }

    public VchaNodeRole getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(final VchaNodeRole nodeRole) {
        this.nodeRole = nodeRole;
    }

    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(final String nodeIp) {
        this.nodeIp = nodeIp;
    }

}
