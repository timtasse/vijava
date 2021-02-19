package com.vmware.vim25;

/**
 * The set of NVM Express over Fabrics transport types.
 * For details, see:
 *
 * "NVM Express over Fabrics 1.0", Section 1.5.1, "Fabrics and Transports".
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public enum HostNvmeTransportType {

    fibreChannel,
    loopback,
    pcie,
    rdma,
    unsupported

}
