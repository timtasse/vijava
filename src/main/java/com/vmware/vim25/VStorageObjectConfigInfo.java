package com.vmware.vim25;

import java.util.List;

/**
 * Data object specifies Virtual storage object configuration
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.1
 * @since 6.5
 */
public class VStorageObjectConfigInfo extends BaseConfigInfo {

    private Integer descriptorVersion;
    private long capacityInMB;
    private List<ID> consumerId;
    private List<VStorageObjectConsumptionType> consumptionType;

    @Override
    public String toString() {
        return "VStorageObjectConfigInfo{" +
                "descriptorVersion=" + descriptorVersion +
                ", capacityInMB=" + capacityInMB +
                ", consumerId=" + consumerId +
                ", consumptionType=" + consumptionType +
                "} " + super.toString();
    }

    public Integer getDescriptorVersion() {
        return descriptorVersion;
    }

    public void setDescriptorVersion(final Integer descriptorVersion) {
        this.descriptorVersion = descriptorVersion;
    }

    public long getCapacityInMB() {
        return capacityInMB;
    }

    public void setCapacityInMB(final long capacityInMB) {
        this.capacityInMB = capacityInMB;
    }

    public List<ID> getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(final List<ID> consumerId) {
        this.consumerId = consumerId;
    }

    public List<VStorageObjectConsumptionType> getConsumptionType() {
        return consumptionType;
    }

    public void setConsumptionType(final List<VStorageObjectConsumptionType> consumptionType) {
        this.consumptionType = consumptionType;
    }

}
