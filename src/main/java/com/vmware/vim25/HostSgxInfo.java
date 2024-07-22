package com.vmware.vim25;

/**
 * Data object describing the Software Guard Extension (SGX) configuration on the ESXi host.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 * @since 7.0
 */
@SuppressWarnings("unused")
public class HostSgxInfo extends DynamicData {

    private String sgxState;
    private long totalEpcMemory;
    private String flcMode;
    private String lePubKeyHash;
    private HostSgxRegistrationInfo registrationInfo;

    @Override
    public String toString() {
        return "HostSgxInfo{" +
                "sgxState='" + sgxState + '\'' +
                ", totalEpcMemory=" + totalEpcMemory +
                ", flcMode='" + flcMode + '\'' +
                ", lePubKeyHash='" + lePubKeyHash + '\'' +
                ", registrationInfo=" + registrationInfo +
                '}';
    }

    public HostSgxRegistrationInfo getRegistrationInfo() {
        return registrationInfo;
    }

    public void setRegistrationInfo(final HostSgxRegistrationInfo registrationInfo) {
        this.registrationInfo = registrationInfo;
    }

    public String getSgxState() {
        return sgxState;
    }

    public void setSgxState(final String sgxState) {
        this.sgxState = sgxState;
    }

    public long getTotalEpcMemory() {
        return totalEpcMemory;
    }

    public void setTotalEpcMemory(final long totalEpcMemory) {
        this.totalEpcMemory = totalEpcMemory;
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
