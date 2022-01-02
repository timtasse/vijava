package com.vmware.vim25;

/**
 * This data object describes the Transmission Control Protocol (TCP) host bus adapter interface.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class HostTcpHba extends HostHostBusAdapter {

    private String associatedPnic;

    @Override
    public String toString() {
        return "HostTcpHba{" +
                "associatedPnic='" + associatedPnic + '\'' +
                "} " + super.toString();
    }

    public String getAssociatedPnic() {
        return associatedPnic;
    }

    public void setAssociatedPnic(final String associatedPnic) {
        this.associatedPnic = associatedPnic;
    }

}
