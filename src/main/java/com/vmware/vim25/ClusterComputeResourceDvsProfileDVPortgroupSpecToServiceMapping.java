package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping extends DynamicData {

    private DVPortgroupConfigSpec dvPortgroupSpec;
    private ManagedObjectReference dvPortgroup;
    private String service;

    @Override
    public String toString() {
        return "ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping{" +
                "dvPortgroup=" + dvPortgroup +
                ", dvPortgroupSpec=" + dvPortgroupSpec +
                ", service='" + service + '\'' +
                "} " + super.toString();
    }

    public ManagedObjectReference getDvPortgroup() {
        return dvPortgroup;
    }

    public void setDvPortgroup(final ManagedObjectReference dvPortgroup) {
        this.dvPortgroup = dvPortgroup;
    }

    public DVPortgroupConfigSpec getDvPortgroupSpec() {
        return dvPortgroupSpec;
    }

    public void setDvPortgroupSpec(final DVPortgroupConfigSpec dvPortgroupSpec) {
        this.dvPortgroupSpec = dvPortgroupSpec;
    }

    public String getService() {
        return service;
    }

    public void setService(final String service) {
        this.service = service;
    }
}
