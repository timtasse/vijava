package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 04.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class QuarantineModeFault extends VmConfigFault {

    public String faultType;
    public String vmName;

    public String getFaultType() {
        return faultType;
    }

    public void setFaultType(final String faultType) {
        this.faultType = faultType;
    }

    public String getVmName() {
        return vmName;
    }

    public void setVmName(final String vmName) {
        this.vmName = vmName;
    }
}
