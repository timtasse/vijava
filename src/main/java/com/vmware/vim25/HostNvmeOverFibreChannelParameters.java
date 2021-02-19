package com.vmware.vim25;

/**
 * This data object represents the transport specific parameters necessary to establish an NVME over Fibre Channel connection.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostNvmeOverFibreChannelParameters extends HostNvmeTransportParameters {

    private long nodeWorldWideName;
    private long portWorldWideName;

    @Override
    public String toString() {
        return "HostNvmeOverFibreChannelParameters{" +
                "nodeWorldWideName=" + nodeWorldWideName +
                ", portWorldWideName=" + portWorldWideName +
                "} " + super.toString();
    }

    public long getNodeWorldWideName() {
        return nodeWorldWideName;
    }

    public void setNodeWorldWideName(final long nodeWorldWideName) {
        this.nodeWorldWideName = nodeWorldWideName;
    }

    public long getPortWorldWideName() {
        return portWorldWideName;
    }

    public void setPortWorldWideName(final long portWorldWideName) {
        this.portWorldWideName = portWorldWideName;
    }

}
