package com.vmware.vim25;

/**
 * This enum specifies the supported address families for NVME over Fabrics.
 * For details, see:
 *
 * "NVM Express over Fabrics 1.0", Section 5.3, Figure 34, "Discovery Log Page Entry"
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public enum HostNvmeTransportParametersNvmeAddressFamily {

    fc,
    infiniBand,
    ipv4,
    ipv6,
    loopback,
    unknown

}
