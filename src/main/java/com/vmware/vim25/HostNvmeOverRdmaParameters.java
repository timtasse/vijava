package com.vmware.vim25;

/**
 * This data object represents the transport specific parameters necessary to establish an NVME over RDMA connection.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostNvmeOverRdmaParameters extends HostNvmeTransportParameters {

    private String address;
    private String addressFamily;
    private Integer portNumber;

    @Override
    public String toString() {
        return "HostNvmeOverRdmaParameters{" +
                "address='" + address + '\'' +
                ", addressFamily='" + addressFamily + '\'' +
                ", portNumber=" + portNumber +
                "} " + super.toString();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getAddressFamily() {
        return addressFamily;
    }

    public void setAddressFamily(final String addressFamily) {
        this.addressFamily = addressFamily;
    }

    public Integer getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(final Integer portNumber) {
        this.portNumber = portNumber;
    }

}
