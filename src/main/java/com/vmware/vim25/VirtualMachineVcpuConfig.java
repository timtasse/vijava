package com.vmware.vim25;

/**
 * Vcpu configuration.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualMachineVcpuConfig extends DynamicData {

    private LatencySensitivity latencySensitivity;

    @Override
    public String toString() {
        return "VirtualMachineVcpuConfig{" +
                "latencySensitivity=" + latencySensitivity +
                "} " + super.toString();
    }

    public LatencySensitivity getLatencySensitivity() {
        return latencySensitivity;
    }

    public void setLatencySensitivity(final LatencySensitivity latencySensitivity) {
        this.latencySensitivity = latencySensitivity;
    }

}
