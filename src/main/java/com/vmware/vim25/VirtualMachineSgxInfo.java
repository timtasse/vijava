package com.vmware.vim25;

/**
 * This data object describes the virtual software guard extension (vSGX) configuration of this virtual machine.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualMachineSgxInfo extends DynamicData {

    private long epcSize;
    private String flcMode;
    private String lePubKeyHash;

    @Override
    public String toString() {
        return "VirtualMachineSgxInfo{" +
                "epcSize=" + epcSize +
                ", flcMode='" + flcMode + '\'' +
                ", lePubKeyHash='" + lePubKeyHash + '\'' +
                "} " + super.toString();
    }

    public long getEpcSize() {
        return epcSize;
    }

    public void setEpcSize(final long epcSize) {
        this.epcSize = epcSize;
    }

    public String getFlcMode() {
        return flcMode;
    }

    public void setFlcMode(final String flcMode) {
        this.flcMode = flcMode;
    }

    public String getLePubKeyHash() {
        return lePubKeyHash;
    }

    public void setLePubKeyHash(final String lePubKeyHash) {
        this.lePubKeyHash = lePubKeyHash;
    }

}
