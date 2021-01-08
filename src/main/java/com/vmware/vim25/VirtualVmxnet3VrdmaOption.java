package com.vmware.vim25;

/**
 * The VirtualVmxnet3VrdmaOption data object type contains the options for the VirtualVmxnet3Vrdma data object type.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.5
 */
public class VirtualVmxnet3VrdmaOption extends VirtualVmxnet3Option {

    private ChoiceOption deviceProtocol;

    @Override
    public String toString() {
        return "VirtualVmxnet3VrdmaOption{" +
                "deviceProtocol=" + deviceProtocol +
                "} " + super.toString();
    }

    public ChoiceOption getDeviceProtocol() {
        return deviceProtocol;
    }

    public void setDeviceProtocol(final ChoiceOption deviceProtocol) {
        this.deviceProtocol = deviceProtocol;
    }

}
