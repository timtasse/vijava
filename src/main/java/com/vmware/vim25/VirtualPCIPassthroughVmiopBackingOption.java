package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VirtualPCIPassthroughVmiopBackingOption extends VirtualPCIPassthroughPluginBackingOption {

    public int maxInstances;
    public StringOption vgpu;

    public int getMaxInstances() {
        return maxInstances;
    }

    public void setMaxInstances(final int maxInstances) {
        this.maxInstances = maxInstances;
    }

    public StringOption getVgpu() {
        return vgpu;
    }

    public void setVgpu(final StringOption vgpu) {
        this.vgpu = vgpu;
    }
}
