package com.vmware.vim25;

/**
 * The PrecisionClockInfo data object type describes available host clock resources,
 * which can be used as backing reference for virtual precision clock devices.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualMachinePrecisionClockInfo extends VirtualMachineTargetInfo {

    private String systemClockProtocol;

    @Override
    public String toString() {
        return "VirtualMachinePrecisionClockInfo{" +
                "systemClockProtocol='" + systemClockProtocol + '\'' +
                "} " + super.toString();
    }

    public String getSystemClockProtocol() {
        return systemClockProtocol;
    }

    public void setSystemClockProtocol(final String systemClockProtocol) {
        this.systemClockProtocol = systemClockProtocol;
    }

}
