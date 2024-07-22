package com.vmware.vim25;

/**
 * Device Swap: Report current status of device swap feature.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualMachineVirtualDeviceSwap extends DynamicData {

    private VirtualMachineVirtualDeviceSwapDeviceSwapInfo lsiToPvscsi;

    @Override
    public String toString() {
        return "VirtualMachineVirtualDeviceSwap{" +
                "lsiToPvscsi=" + lsiToPvscsi +
                '}';
    }

    public VirtualMachineVirtualDeviceSwapDeviceSwapInfo getLsiToPvscsi() {
        return lsiToPvscsi;
    }

    public void setLsiToPvscsi(final VirtualMachineVirtualDeviceSwapDeviceSwapInfo lsiToPvscsi) {
        this.lsiToPvscsi = lsiToPvscsi;
    }

}
