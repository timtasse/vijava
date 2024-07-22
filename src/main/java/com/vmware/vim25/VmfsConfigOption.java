package com.vmware.vim25;

import java.util.List;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 * @since 6.5
 */
public class VmfsConfigOption extends DynamicData {

    private int blockSizeOption;
    private List<Integer> unmapGranularityOption;
    private LongOption unmapBandwidthFixedValue;
    private LongOption unmapBandwidthDynamicMin;
    private LongOption unmapBandwidthDynamicMax;
    private Long unmapBandwidthIncrement;
    private Long unmapBandwidthUltraLow;

    @Override
    public String toString() {
        return "VmfsConfigOption{" +
                "blockSizeOption=" + blockSizeOption +
                ", unmapGranularityOption=" + unmapGranularityOption +
                ", unmapBandwidthFixedValue=" + unmapBandwidthFixedValue +
                ", unmapBandwidthDynamicMin=" + unmapBandwidthDynamicMin +
                ", unmapBandwidthDynamicMax=" + unmapBandwidthDynamicMax +
                ", unmapBandwidthIncrement=" + unmapBandwidthIncrement +
                ", unmapBandwidthUltraLow=" + unmapBandwidthUltraLow +
                '}';
    }

    public List<Integer> getUnmapGranularityOption() {
        return unmapGranularityOption;
    }

    public void setUnmapGranularityOption(final List<Integer> unmapGranularityOption) {
        this.unmapGranularityOption = unmapGranularityOption;
    }

    public Long getUnmapBandwidthUltraLow() {
        return unmapBandwidthUltraLow;
    }

    public void setUnmapBandwidthUltraLow(final Long unmapBandwidthUltraLow) {
        this.unmapBandwidthUltraLow = unmapBandwidthUltraLow;
    }

    public int getBlockSizeOption() {
        return blockSizeOption;
    }

    public void setBlockSizeOption(final int blockSizeOption) {
        this.blockSizeOption = blockSizeOption;
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
