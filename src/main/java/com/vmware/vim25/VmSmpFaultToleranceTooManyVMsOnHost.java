package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VmSmpFaultToleranceTooManyVMsOnHost extends InsufficientResourcesFault {

    public String hostName;
    public int maxNumSmpFtVms;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(final String hostName) {
        this.hostName = hostName;
    }

    public int getMaxNumSmpFtVms() {
        return maxNumSmpFtVms;
    }

    public void setMaxNumSmpFtVms(final int maxNumSmpFtVms) {
        this.maxNumSmpFtVms = maxNumSmpFtVms;
    }
}
