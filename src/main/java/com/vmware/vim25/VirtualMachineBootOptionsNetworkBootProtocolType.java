package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public enum VirtualMachineBootOptionsNetworkBootProtocolType {

    ipv4("ipv4"),
    ipv6("ipv6");

    private final String val;

    VirtualMachineBootOptionsNetworkBootProtocolType(final String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
