package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VmfsConfigOption extends DynamicData {

    public int blockSizeOption;
    public int[] unmapGranularityOption;

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
}
