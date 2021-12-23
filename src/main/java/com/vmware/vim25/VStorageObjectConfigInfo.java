package com.vmware.vim25;

import java.util.Arrays;

/**
 * Data object specifies Virtual storage object configuration
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VStorageObjectConfigInfo extends BaseConfigInfo {

    public long capacityInMB;
    public ID[] consumerId;
    public String[] consumptionType;

    @Override
    public String toString() {
        return "VStorageObjectConfigInfo{" +
                "capacityInMB=" + capacityInMB +
                ", consumerId=" + Arrays.toString(consumerId) +
                ", consumptionType=" + Arrays.toString(consumptionType) +
                '}';
    }

    public long getCapacityInMB() {
        return capacityInMB;
    }

    public void setCapacityInMB(final long capacityInMB) {
        this.capacityInMB = capacityInMB;
    }

    public ID[] getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(final ID[] consumerId) {
        this.consumerId = consumerId;
    }

    public String[] getConsumptionType() {
        return consumptionType;
    }

    public void setConsumptionType(final String[] consumptionType) {
        this.consumptionType = consumptionType;
    }

}
