package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VchaNodeRuntimeInfo extends DynamicData {

    public String nodeIp;
    public String nodeRole;
    public String nodeState;

    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(final String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(final String nodeRole) {
        this.nodeRole = nodeRole;
    }

    public String getNodeState() {
        return nodeState;
    }

    public void setNodeState(final String nodeState) {
        this.nodeState = nodeState;
    }
}
