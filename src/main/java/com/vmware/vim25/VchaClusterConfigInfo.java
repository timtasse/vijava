package com.vmware.vim25;

/**
 * The VchaClusterConfigInfo class contains configuration information of the three nodes of a VCHA Cluster.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VchaClusterConfigInfo extends DynamicData {

    private FailoverNodeInfo failoverNodeInfo1;
    private FailoverNodeInfo failoverNodeInfo2;
    private WitnessNodeInfo witnessNodeInfo;
    private VchaState state;

    public FailoverNodeInfo getFailoverNodeInfo1() {
        return failoverNodeInfo1;
    }

    public void setFailoverNodeInfo1(final FailoverNodeInfo failoverNodeInfo1) {
        this.failoverNodeInfo1 = failoverNodeInfo1;
    }

    public FailoverNodeInfo getFailoverNodeInfo2() {
        return failoverNodeInfo2;
    }

    public void setFailoverNodeInfo2(final FailoverNodeInfo failoverNodeInfo2) {
        this.failoverNodeInfo2 = failoverNodeInfo2;
    }

    public VchaState getState() {
        return state;
    }

    public void setState(final VchaState state) {
        this.state = state;
    }

    public WitnessNodeInfo getWitnessNodeInfo() {
        return witnessNodeInfo;
    }

    public void setWitnessNodeInfo(final WitnessNodeInfo witnessNodeInfo) {
        this.witnessNodeInfo = witnessNodeInfo;
    }
}
