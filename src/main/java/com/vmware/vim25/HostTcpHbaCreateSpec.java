package com.vmware.vim25;

/**
 * A data object which specifies the parameters needed to create an NVME over TCP host bus adapter.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class HostTcpHbaCreateSpec extends HostHbaCreateSpec {

    private String pnic;

    @Override
    public String toString() {
        return "HostTcpHbaCreateSpec{" +
                "pnic='" + pnic + '\'' +
                "} " + super.toString();
    }

    public String getPnic() {
        return pnic;
    }

    public void setPnic(final String pnic) {
        this.pnic = pnic;
    }

}
