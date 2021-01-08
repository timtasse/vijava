package com.vmware.vim25;

/**
 * This data object describes how a vmknic on a host must be configured.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceHostVmkNicInfo extends DynamicData {

    private HostVirtualNicSpec nicSpec;
    private String service;

    @Override
    public String toString() {
        return "ClusterComputeResourceHostVmkNicInfo{" +
                "nicSpec=" + nicSpec +
                ", service='" + service + '\'' +
                "} " + super.toString();
    }

    public HostVirtualNicSpec getNicSpec() {
        return nicSpec;
    }

    public void setNicSpec(final HostVirtualNicSpec nicSpec) {
        this.nicSpec = nicSpec;
    }

    public String getService() {
        return service;
    }

    public void setService(final String service) {
        this.service = service;
    }
}
