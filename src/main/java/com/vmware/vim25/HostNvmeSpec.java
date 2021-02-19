package com.vmware.vim25;

/**
 * Specifies the main parameters needed when connecting to an NVMe over Fabrics controller or Discovery Service.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostNvmeSpec extends DynamicData {

    private String hbaName;
    private HostNvmeTransportParameters transportParameters;

    @Override
    public String toString() {
        return "HostNvmeSpec{" +
                "hbaName='" + hbaName + '\'' +
                ", transportParameters=" + transportParameters +
                "} " + super.toString();
    }

    public String getHbaName() {
        return hbaName;
    }

    public void setHbaName(final String hbaName) {
        this.hbaName = hbaName;
    }

    public HostNvmeTransportParameters getTransportParameters() {
        return transportParameters;
    }

    public void setTransportParameters(final HostNvmeTransportParameters transportParameters) {
        this.transportParameters = transportParameters;
    }

}
