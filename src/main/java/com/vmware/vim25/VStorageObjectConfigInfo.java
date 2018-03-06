package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VStorageObjectConfigInfo extends BaseConfigInfo {

    public long capacityInMB;
    public ID[] consumerId;
    public String[] consumptionType;

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
