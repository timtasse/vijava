package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class ReplicationVmInProgressFault extends ReplicationVmFault {

    public String inProgressActivity;
    public String requestedActivity;

    public String getRequestedActivity() {
        return requestedActivity;
    }

    public void setRequestedActivity(final String requestedActivity) {
        this.requestedActivity = requestedActivity;
    }

    public String getInProgressActivity() {

        return inProgressActivity;
    }

    public void setInProgressActivity(final String inProgressActivity) {
        this.inProgressActivity = inProgressActivity;
    }
}
