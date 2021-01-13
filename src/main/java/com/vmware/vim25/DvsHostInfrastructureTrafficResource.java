package com.vmware.vim25;

/**
 * This class defines the resource allocation for a host infrastructure traffic class on a physical NIC
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class DvsHostInfrastructureTrafficResource extends DynamicData {

    private String key;
    private String description;
    private DvsHostInfrastructureTrafficResourceAllocation allocationInfo;

    @Override
    public String toString() {
        return "DvsHostInfrastructureTrafficResource{" +
                "key='" + key + '\'' +
                ", description='" + description + '\'' +
                ", allocationInfo=" + allocationInfo +
                "} " + super.toString();
    }

    public DvsHostInfrastructureTrafficResourceAllocation getAllocationInfo() {
        return allocationInfo;
    }

    public void setAllocationInfo(final DvsHostInfrastructureTrafficResourceAllocation allocationInfo) {
        this.allocationInfo = allocationInfo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }
}
