package com.vmware.vim25;

/**
 * Information for the device swap operation.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualMachineVirtualDeviceSwapDeviceSwapInfo extends DynamicData {

    private Boolean enabled;
    private Boolean applicable;
    private VirtualMachineVirtualDeviceSwapDeviceSwapStatus status;

    @Override
    public String toString() {
        return "VirtualMachineVirtualDeviceSwapDeviceSwapInfo{" +
                "enabled=" + enabled +
                ", applicable=" + applicable +
                ", status='" + status + '\'' +
                '}';
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getApplicable() {
        return applicable;
    }

    public void setApplicable(final Boolean applicable) {
        this.applicable = applicable;
    }

    public VirtualMachineVirtualDeviceSwapDeviceSwapStatus getStatus() {
        return status;
    }

    public void setStatus(final VirtualMachineVirtualDeviceSwapDeviceSwapStatus status) {
        this.status = status;
    }

}
