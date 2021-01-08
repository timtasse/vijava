package com.vmware.vim25;

import java.util.Arrays;

/**
 * VM specific faults. This Class is used in e.g. vim.host#HostEnterMaintenanceResult.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class FaultsByVM extends DynamicData {

    private LocalizedMethodFault[] faults;
    private ManagedObjectReference vm;

    @Override
    public String toString() {
        return "FaultsByVM{" +
                "faults=" + Arrays.toString(faults) +
                ", vm=" + vm +
                "} " + super.toString();
    }

    public LocalizedMethodFault[] getFaults() {
        return faults;
    }

    public void setFaults(final LocalizedMethodFault[] faults) {
        this.faults = faults;
    }

    public ManagedObjectReference getVm() {
        return vm;
    }

    public void setVm(final ManagedObjectReference vm) {
        this.vm = vm;
    }

}
