package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class IoFilterQueryIssueResult extends DynamicData {

    public IoFilterHostIssue[] hostIssue;
    public String opType;

    public IoFilterHostIssue[] getHostIssue() {
        return hostIssue;
    }

    public void setHostIssue(final IoFilterHostIssue[] hostIssue) {
        this.hostIssue = hostIssue;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(final String opType) {
        this.opType = opType;
    }
}
