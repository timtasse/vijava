package com.vmware.vim25;

/**
 * This data object represents a physical NIC backing for an RDMA device.
 * When an RDMA device is backed by a physical NIC,
 * it can be associated with the virtual NICs connected to a virtual switch which has the backing physical NIC as an uplink.
 * The actual bindings are created and destroyed dynamically based on application usage of the RDMA device.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostRdmaDevicePnicBacking extends HostRdmaDeviceBacking {

    private String pairedUplink;

    @Override
    public String toString() {
        return "HostRdmaDevicePnicBacking{" +
                "pairedUplink='" + pairedUplink + '\'' +
                "} " + super.toString();
    }

    public String getPairedUplink() {
        return pairedUplink;
    }

    public void setPairedUplink(final String pairedUplink) {
        this.pairedUplink = pairedUplink;
    }

}
