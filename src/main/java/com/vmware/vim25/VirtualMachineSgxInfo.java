package com.vmware.vim25;

/**
 * This data object describes the virtual software guard extension (vSGX) configuration of this virtual machine.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
public class VirtualMachineSgxInfo extends DynamicData {

    private long epcSize;
    private VirtualMachineSgxInfoFlcModes flcMode;
    private String lePubKeyHash;
    private Boolean requireAttestation;

    @Override
    public String toString() {
        return "VirtualMachineSgxInfo{" +
                "epcSize=" + epcSize +
                ", flcMode=" + flcMode +
                ", lePubKeyHash='" + lePubKeyHash + '\'' +
                ", requireAttestation=" + requireAttestation +
                '}';
    }

    public long getEpcSize() {
        return epcSize;
    }

    public void setEpcSize(final long epcSize) {
        this.epcSize = epcSize;
    }

    public VirtualMachineSgxInfoFlcModes getFlcMode() {
        return flcMode;
    }

    public void setFlcMode(final VirtualMachineSgxInfoFlcModes flcMode) {
        this.flcMode = flcMode;
    }

    public String getLePubKeyHash() {
        return lePubKeyHash;
    }

    public void setLePubKeyHash(final String lePubKeyHash) {
        this.lePubKeyHash = lePubKeyHash;
    }

    public Boolean getRequireAttestation() {
        return requireAttestation;
    }

    public void setRequireAttestation(final Boolean requireAttestation) {
        this.requireAttestation = requireAttestation;
    }

}
