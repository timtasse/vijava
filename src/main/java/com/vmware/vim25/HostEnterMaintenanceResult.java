package com.vmware.vim25;

import java.util.Arrays;

/**
 * EnterMaintenanceResult is the result returned to the QueryWhatIfEnterMaintenance method.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class HostEnterMaintenanceResult extends DynamicData {

    private FaultsByHost[] hostFaults;
    private FaultsByVM[]   vmFaults;

    @Override
    public String toString() {
        return "HostEnterMaintenanceResult{" +
                "hostFaults=" + Arrays.toString(hostFaults) +
                ", vmFaults=" + Arrays.toString(vmFaults) +
                "} " + super.toString();
    }

    public FaultsByHost[] getHostFaults() {
        return hostFaults;
    }

    public void setHostFaults(final FaultsByHost[] hostFaults) {
        this.hostFaults = hostFaults;
    }

    public FaultsByVM[] getVmFaults() {
        return vmFaults;
    }

    public void setVmFaults(final FaultsByVM[] vmFaults) {
        this.vmFaults = vmFaults;
    }

}
