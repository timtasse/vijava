package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VchaClusterConfigInfo extends DynamicData {

    public FailoverNodeInfo failoverNodeInfo1;
    public FailoverNodeInfo failoverNodeInfo2;
    public String state;
    public FailoverNodeInfo witnessNodeInfo;

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

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public FailoverNodeInfo getWitnessNodeInfo() {
        return witnessNodeInfo;
    }

    public void setWitnessNodeInfo(final FailoverNodeInfo witnessNodeInfo) {
        this.witnessNodeInfo = witnessNodeInfo;
    }
}
