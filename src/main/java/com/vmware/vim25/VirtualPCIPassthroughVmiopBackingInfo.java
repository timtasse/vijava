package com.vmware.vim25;

/**
 * The VirtualPCIPassthrough.VmiopBackingInfo data object type contains information about the plugin
 * that emulates the virtual device via the VMIOP plugin interface.
 * At present, this interface is only used to implement vGPU.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 * @since 6.0
 */
@SuppressWarnings("unused")
public class VirtualPCIPassthroughVmiopBackingInfo extends VirtualPCIPassthroughPluginBackingInfo {

    private String vgpu;
    private Integer vgpuMigrateDataSizeMB;
    private Boolean migrateSupported;
    private Boolean enhancedMigrateCapability;

    @Override
    public String toString() {
        return "VirtualPCIPassthroughVmiopBackingInfo{" +
                "vgpu='" + vgpu + '\'' +
                ", vgpuMigrateDataSizeMB=" + vgpuMigrateDataSizeMB +
                ", migrateSupported=" + migrateSupported +
                ", enhancedMigrateCapability=" + enhancedMigrateCapability +
                "} ";
    }

    public Integer getVgpuMigrateDataSizeMB() {
        return vgpuMigrateDataSizeMB;
    }

    public void setVgpuMigrateDataSizeMB(final Integer vgpuMigrateDataSizeMB) {
        this.vgpuMigrateDataSizeMB = vgpuMigrateDataSizeMB;
    }

    public Boolean getEnhancedMigrateCapability() {
        return enhancedMigrateCapability;
    }

    public void setEnhancedMigrateCapability(final Boolean enhancedMigrateCapability) {
        this.enhancedMigrateCapability = enhancedMigrateCapability;
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
