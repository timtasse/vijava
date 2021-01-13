package com.vmware.vim25;

/**
 * VMFS unmap reclaims unused storage space. This data object type describes the specification of VMFS unmap bandwidth.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VmfsUnmapBandwidthSpec extends DynamicData {

    private String policy;
    private long fixedValue;
    private long dynamicMin;
    private long dynamicMax;

    @Override
    public String toString() {
        return "VmfsUnmapBandwidthSpec{" +
                "dynamicMax=" + dynamicMax +
                ", dynamicMin=" + dynamicMin +
                ", fixedValue=" + fixedValue +
                ", policy='" + policy + '\'' +
                "} " + super.toString();
    }

    public long getDynamicMax() {
        return dynamicMax;
    }

    public void setDynamicMax(final long dynamicMax) {
        this.dynamicMax = dynamicMax;
    }

    public long getDynamicMin() {
        return dynamicMin;
    }

    public void setDynamicMin(final long dynamicMin) {
        this.dynamicMin = dynamicMin;
    }

    public long getFixedValue() {
        return fixedValue;
    }

    public void setFixedValue(final long fixedValue) {
        this.fixedValue = fixedValue;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(final String policy) {
        this.policy = policy;
    }

}
