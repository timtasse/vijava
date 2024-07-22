package com.vmware.vim25;

/**
 * This data object describes the virtual NUMA configuration for this virtual machine and configured through ConfigSpec.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualMachineVirtualNuma extends DynamicData {

    private Integer coresPerNumaNode;
    private Boolean exposeVnumaOnCpuHotadd;

    @Override
    public String toString() {
        return "VirtualMachineVirtualNuma{" +
                "coresPerNumaNode=" + coresPerNumaNode +
                ", exposeVnumaOnCpuHotadd=" + exposeVnumaOnCpuHotadd +
                '}';
    }

    public Integer getCoresPerNumaNode() {
        return coresPerNumaNode;
    }

    public void setCoresPerNumaNode(final Integer coresPerNumaNode) {
        this.coresPerNumaNode = coresPerNumaNode;
    }

    public Boolean getExposeVnumaOnCpuHotadd() {
        return exposeVnumaOnCpuHotadd;
    }

    public void setExposeVnumaOnCpuHotadd(final Boolean exposeVnumaOnCpuHotadd) {
        this.exposeVnumaOnCpuHotadd = exposeVnumaOnCpuHotadd;
    }

}
