package com.vmware.vim25;

import java.util.List;

/**
 * Description of Intel Software Guard Extensions information.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 * @since 7.0
 */
public class VirtualMachineSgxTargetInfo extends VirtualMachineTargetInfo {

    private long maxEpcSize;
    private List<VirtualMachineSgxInfoFlcModes> flcModes = List.of();
    private List<String> lePubKeyHashes = List.of();
    private Boolean requireAttestationSupported;

    @Override
    public String toString() {
        return "VirtualMachineSgxTargetInfo{" +
                "maxEpcSize=" + maxEpcSize +
                ", flcModes=" + flcModes +
                ", lePubKeyHashes=" + lePubKeyHashes +
                ", requireAttestationSupported=" + requireAttestationSupported +
                "} " + super.toString();
    }

    public long getMaxEpcSize() {
        return maxEpcSize;
    }

    public void setMaxEpcSize(final long maxEpcSize) {
        this.maxEpcSize = maxEpcSize;
    }

    public List<VirtualMachineSgxInfoFlcModes> getFlcModes() {
        return flcModes;
    }

    public void setFlcModes(final List<VirtualMachineSgxInfoFlcModes> flcModes) {
        this.flcModes = flcModes;
    }

    public List<String> getLePubKeyHashes() {
        return lePubKeyHashes;
    }

    public void setLePubKeyHashes(final List<String> lePubKeyHashes) {
        this.lePubKeyHashes = lePubKeyHashes;
    }

    public Boolean getRequireAttestationSupported() {
        return requireAttestationSupported;
    }

    public void setRequireAttestationSupported(final Boolean requireAttestationSupported) {
        this.requireAttestationSupported = requireAttestationSupported;
    }

}
