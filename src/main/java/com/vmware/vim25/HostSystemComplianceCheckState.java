package com.vmware.vim25;

import java.util.Calendar;

/**
 * The host profile compliance check state.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class HostSystemComplianceCheckState extends DynamicData {

    private Calendar checkTime;
    private String   state;

    @Override
    public String toString() {
        return "HostSystemComplianceCheckState{" +
                "checkTime=" + checkTime +
                ", state='" + state + '\'' +
                "} " + super.toString();
    }

    public Calendar getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(final Calendar checkTime) {
        this.checkTime = checkTime;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

}
