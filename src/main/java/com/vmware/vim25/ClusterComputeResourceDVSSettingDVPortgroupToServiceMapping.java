package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping extends DynamicData {

    private ManagedObjectReference dvPortgroup;
    private String service;

    @Override
    public String toString() {
        return "ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping{" +
                "dvPortgroup=" + dvPortgroup +
                ", service='" + service + '\'' +
                "} " + super.toString();
    }

    public ManagedObjectReference getDvPortgroup() {
        return dvPortgroup;
    }

    public void setDvPortgroup(final ManagedObjectReference dvPortgroup) {
        this.dvPortgroup = dvPortgroup;
    }

    public String getService() {
        return service;
    }

    public void setService(final String service) {
        this.service = service;
    }
}
