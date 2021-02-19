package com.vmware.vim25;

import java.util.Arrays;

/**
 * Description of Intel Software Guard Extensions information.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualMachineSgxTargetInfo extends VirtualMachineTargetInfo {

    private long maxEpcSize;
    private String[] flcModes;
    private String[] lePubKeyHashes;

    @Override
    public String toString() {
        return "VirtualMachineSgxTargetInfo{" +
                "maxEpcSize=" + maxEpcSize +
                ", flcModes=" + Arrays.toString(flcModes) +
                ", lePubKeyHashes=" + Arrays.toString(lePubKeyHashes) +
                "} " + super.toString();
    }

    public long getMaxEpcSize() {
        return maxEpcSize;
    }

    public void setMaxEpcSize(final long maxEpcSize) {
        this.maxEpcSize = maxEpcSize;
    }

    public String[] getFlcModes() {
        return flcModes;
    }

    public void setFlcModes(final String[] flcModes) {
        this.flcModes = flcModes;
    }

    public String[] getLePubKeyHashes() {
        return lePubKeyHashes;
    }

    public void setLePubKeyHashes(final String[] lePubKeyHashes) {
        this.lePubKeyHashes = lePubKeyHashes;
    }

}
