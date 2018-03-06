package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class DvsHostInfrastructureTrafficResource extends DynamicData {

    public DvsHostInfrastructureTrafficResourceAllocation allocationInfo;
    public String description;
    public String key;

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
