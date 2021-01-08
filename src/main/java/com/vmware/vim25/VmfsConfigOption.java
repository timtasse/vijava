package com.vmware.vim25;

import java.util.Arrays;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.5
 */
public class VmfsConfigOption extends DynamicData {

    private int blockSizeOption;
    private LongOption unmapBandwidthDynamicMax;
    private LongOption unmapBandwidthDynamicMin;
    private LongOption unmapBandwidthFixedValue;
    private Long unmapBandwidthIncrement;
    private int[] unmapGranularityOption;

    @Override
    public String toString() {
        return "VmfsConfigOption{" +
                "blockSizeOption=" + blockSizeOption +
                ", unmapBandwidthDynamicMax=" + unmapBandwidthDynamicMax +
                ", unmapBandwidthDynamicMin=" + unmapBandwidthDynamicMin +
                ", unmapBandwidthFixedValue=" + unmapBandwidthFixedValue +
                ", unmapBandwidthIncrement=" + unmapBandwidthIncrement +
                ", unmapGranularityOption=" + Arrays.toString(unmapGranularityOption) +
                "} " + super.toString();
    }

    public int getBlockSizeOption() {
        return blockSizeOption;
    }

    public void setBlockSizeOption(final int blockSizeOption) {
        this.blockSizeOption = blockSizeOption;
    }

    public int[] getUnmapGranularityOption() {
        return unmapGranularityOption;
    }

    public void setUnmapGranularityOption(final int[] unmapGranularityOption) {
        this.unmapGranularityOption = unmapGranularityOption;
    }

    public LongOption getUnmapBandwidthDynamicMax() {
        return unmapBandwidthDynamicMax;
    }

    public void setUnmapBandwidthDynamicMax(final LongOption unmapBandwidthDynamicMax) {
        this.unmapBandwidthDynamicMax = unmapBandwidthDynamicMax;
    }

    public LongOption getUnmapBandwidthDynamicMin() {
        return unmapBandwidthDynamicMin;
    }

    public void setUnmapBandwidthDynamicMin(final LongOption unmapBandwidthDynamicMin) {
        this.unmapBandwidthDynamicMin = unmapBandwidthDynamicMin;
    }

    public LongOption getUnmapBandwidthFixedValue() {
        return unmapBandwidthFixedValue;
    }

    public void setUnmapBandwidthFixedValue(final LongOption unmapBandwidthFixedValue) {
        this.unmapBandwidthFixedValue = unmapBandwidthFixedValue;
    }

    public Long getUnmapBandwidthIncrement() {
        return unmapBandwidthIncrement;
    }

    public void setUnmapBandwidthIncrement(final Long unmapBandwidthIncrement) {
        this.unmapBandwidthIncrement = unmapBandwidthIncrement;
    }

}
