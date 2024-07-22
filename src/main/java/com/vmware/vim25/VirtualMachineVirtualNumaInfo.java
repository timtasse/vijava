package com.vmware.vim25;

/**
 * vNUMA: This is read-only data for ConfigInfo since this portion is not configurable.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualMachineVirtualNumaInfo extends DynamicData {

    private Integer coresPerNumaNode;
    private Boolean autoCoresPerNumaNode;
    private Boolean vnumaOnCpuHotaddExposed;

    @Override
    public String toString() {
        return "VirtualMachineVirtualNumaInfo{" +
                "coresPerNumaNode=" + coresPerNumaNode +
                ", autoCoresPerNumaNode=" + autoCoresPerNumaNode +
                ", vnumaOnCpuHotaddExposed=" + vnumaOnCpuHotaddExposed +
                '}';
    }

    public Integer getCoresPerNumaNode() {
        return coresPerNumaNode;
    }

    public void setCoresPerNumaNode(final Integer coresPerNumaNode) {
        this.coresPerNumaNode = coresPerNumaNode;
    }

    public Boolean getAutoCoresPerNumaNode() {
        return autoCoresPerNumaNode;
    }

    public void setAutoCoresPerNumaNode(final Boolean autoCoresPerNumaNode) {
        this.autoCoresPerNumaNode = autoCoresPerNumaNode;
    }

    public Boolean getVnumaOnCpuHotaddExposed() {
        return vnumaOnCpuHotaddExposed;
    }

    public void setVnumaOnCpuHotaddExposed(final Boolean vnumaOnCpuHotaddExposed) {
        this.vnumaOnCpuHotaddExposed = vnumaOnCpuHotaddExposed;
    }

}
