package com.vmware.vim25;

import java.util.List;

/**
 * This data object represents the transport specific parameters necessary to establish an NVME over TCP connection.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class HostNvmeOverTcpParameters extends HostNvmeTransportParameters {

    private String address;
    private Integer portNumber;
    private List<HostDigestVerificationSetting> digestVerification;

    @Override
    public String toString() {
        return "HostNvmeOverTcpParameters{" +
                "address='" + address + '\'' +
                ", portNumber=" + portNumber +
                ", digestVerification=" + digestVerification +
                "} " + super.toString();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public Integer getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(final Integer portNumber) {
        this.portNumber = portNumber;
    }

    public List<HostDigestVerificationSetting> getDigestVerification() {
        return digestVerification;
    }

    public void setDigestVerification(final List<HostDigestVerificationSetting> digestVerification) {
        this.digestVerification = digestVerification;
    }

}
