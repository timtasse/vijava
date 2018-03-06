package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VmFaultToleranceTooManyFtVcpusOnHost extends InsufficientResourcesFault {

    public String hostName;
    public int maxNumFtVcpus;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(final String hostName) {
        this.hostName = hostName;
    }

    public int getMaxNumFtVcpus() {
        return maxNumFtVcpus;
    }

    public void setMaxNumFtVcpus(final int maxNumFtVcpus) {
        this.maxNumFtVcpus = maxNumFtVcpus;
    }
}
