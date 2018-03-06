package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VslmCreateSpec extends DynamicData {

    public String name;
    public VslmCreateSpecBackingSpec backingSpec;
    public long capacityInMB;

    public VslmCreateSpecBackingSpec getBackingSpec() {
        return backingSpec;
    }

    public void setBackingSpec(final VslmCreateSpecBackingSpec backingSpec) {
        this.backingSpec = backingSpec;
    }

    public long getCapacityInMB() {
        return capacityInMB;
    }

    public void setCapacityInMB(final long capacityInMB) {
        this.capacityInMB = capacityInMB;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
