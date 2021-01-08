package com.vmware.vim25;

/**
 * The VirtualVmxnet3Vrdma data object type represents an instance of the VRDMA virtual Remote Direct Memory Access adapter attached to a virtual machine.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.5
 */
public class VirtualVmxnet3Vrdma extends VirtualVmxnet3 {

    private String deviceProtocol;

    @Override
    public String toString() {
        return "VirtualVmxnet3Vrdma{" +
                "deviceProtocol='" + deviceProtocol + '\'' +
                "} " + super.toString();
    }

    public String getDeviceProtocol() {
        return deviceProtocol;
    }

    public void setDeviceProtocol(final String deviceProtocol) {
        this.deviceProtocol = deviceProtocol;
    }
}
