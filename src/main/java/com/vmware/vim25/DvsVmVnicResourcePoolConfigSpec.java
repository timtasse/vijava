package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class DvsVmVnicResourcePoolConfigSpec extends DynamicData {

    public String operation;
    public String key;
    public String configVersion;
    public DvsVmVnicResourceAllocation allocationInfo;
    public String name;
    public String description;

    public DvsVmVnicResourceAllocation getAllocationInfo() {
        return allocationInfo;
    }

    public void setAllocationInfo(final DvsVmVnicResourceAllocation allocationInfo) {
        this.allocationInfo = allocationInfo;
    }

    public String getConfigVersion() {
        return configVersion;
    }

    public void setConfigVersion(final String configVersion) {
        this.configVersion = configVersion;
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

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(final String operation) {
        this.operation = operation;
    }
}
