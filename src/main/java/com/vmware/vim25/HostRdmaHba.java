package com.vmware.vim25;

/**
 * This data object describes the Remote Direct Memory Access (RDMA) host bus adapter interface.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostRdmaHba extends HostHostBusAdapter {

    private String associatedRdmaDevice;

    @Override
    public String toString() {
        return "HostRdmaHba{" +
                "associatedRdmaDevice='" + associatedRdmaDevice + '\'' +
                "} " + super.toString();
    }

    public String getAssociatedRdmaDevice() {
        return associatedRdmaDevice;
    }

    public void setAssociatedRdmaDevice(final String associatedRdmaDevice) {
        this.associatedRdmaDevice = associatedRdmaDevice;
    }

}
