package com.vmware.vim25;

import java.util.Calendar;

/**
 * The valid remediation states. Host profile apply has two stages: precheck remediation and remediation.
 * Precheck remediation generates task list and task requirement: apply may fail when task requirements are not satisfied.
 * Remediation stage can be started only when precheck remediation succeeded.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class HostSystemRemediationState extends DynamicData {

    private Calendar operationTime;
    private String   state;

    @Override
    public String toString() {
        return "HostSystemRemediationState{" +
                "operationTime=" + operationTime +
                ", state='" + state + '\'' +
                "} " + super.toString();
    }

    public Calendar getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(final Calendar operationTime) {
        this.operationTime = operationTime;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

}
