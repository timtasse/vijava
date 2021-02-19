package com.vmware.vim25;

/**
 * This data object represents a single entry in the Discovery Log returned by a Discovery controller.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostNvmeDiscoveryLogEntry extends DynamicData {

    private String subnqn;
    private String subsystemType;
    private int subsystemPortId;
    private int controllerId;
    private int adminQueueMaxSize;
    private HostNvmeTransportParameters transportParameters;
    private String transportRequirements;
    private boolean connected;

    @Override
    public String toString() {
        return "HostNvmeDiscoveryLogEntry{" +
                "subnqn='" + subnqn + '\'' +
                ", subsystemType='" + subsystemType + '\'' +
                ", subsystemPortId=" + subsystemPortId +
                ", controllerId=" + controllerId +
                ", adminQueueMaxSize=" + adminQueueMaxSize +
                ", transportParameters=" + transportParameters +
                ", transportRequirements='" + transportRequirements + '\'' +
                ", connected=" + connected +
                "} " + super.toString();
    }

    public String getSubnqn() {
        return subnqn;
    }

    public void setSubnqn(final String subnqn) {
        this.subnqn = subnqn;
    }

    public String getSubsystemType() {
        return subsystemType;
    }

    public void setSubsystemType(final String subsystemType) {
        this.subsystemType = subsystemType;
    }

    public int getSubsystemPortId() {
        return subsystemPortId;
    }

    public void setSubsystemPortId(final int subsystemPortId) {
        this.subsystemPortId = subsystemPortId;
    }

    public int getControllerId() {
        return controllerId;
    }

    public void setControllerId(final int controllerId) {
        this.controllerId = controllerId;
    }

    public int getAdminQueueMaxSize() {
        return adminQueueMaxSize;
    }

    public void setAdminQueueMaxSize(final int adminQueueMaxSize) {
        this.adminQueueMaxSize = adminQueueMaxSize;
    }

    public HostNvmeTransportParameters getTransportParameters() {
        return transportParameters;
    }

    public void setTransportParameters(final HostNvmeTransportParameters transportParameters) {
        this.transportParameters = transportParameters;
    }

    public String getTransportRequirements() {
        return transportRequirements;
    }

    public void setTransportRequirements(final String transportRequirements) {
        this.transportRequirements = transportRequirements;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(final boolean connected) {
        this.connected = connected;
    }

}
