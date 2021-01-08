package com.vmware.vim25;

import java.util.Arrays;

/**
 * Group of faults associated with Host. This Class is used in e.g. vim.host#HostEnterMaintenanceResult.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class FaultsByHost extends DynamicData {

    private LocalizedMethodFault[] faults;
    private ManagedObjectReference host;

    @Override
    public String toString() {
        return "FaultsByHost{" +
                "faults=" + Arrays.toString(faults) +
                ", host=" + host +
                "} " + super.toString();
    }

    public LocalizedMethodFault[] getFaults() {
        return faults;
    }

    public void setFaults(final LocalizedMethodFault[] faults) {
        this.faults = faults;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

}
