package com.vmware.vim25;

/**
 * The VirtualPCIPassthrough.VmiopBackingInfo data object type contains information about the plugin
 * that emulates the virtual device via the VMIOP plugin interface.
 * At present, this interface is only used to implement vGPU.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2
 * @since 6.0
 */
@SuppressWarnings("unused")
public class VirtualPCIPassthroughVmiopBackingInfo extends VirtualPCIPassthroughPluginBackingInfo {

    private String vgpu;
    private Boolean migrateSupported;

    @Override
    public String toString() {
        return "VirtualPCIPassthroughVmiopBackingInfo{" +
                "vgpu='" + vgpu + '\'' +
                ", migrateSupported=" + migrateSupported +
                "} " + super.toString();
    }

    public String getVgpu() {
        return vgpu;
    }

    public void setVgpu(final String vgpu) {
        this.vgpu = vgpu;
    }

    public Boolean getMigrateSupported() {
        return migrateSupported;
    }

    public void setMigrateSupported(final Boolean migrateSupported) {
        this.migrateSupported = migrateSupported;
    }

}
