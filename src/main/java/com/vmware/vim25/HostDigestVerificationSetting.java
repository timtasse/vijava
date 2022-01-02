package com.vmware.vim25;

/**
 * This enum specifies the supported digest verification settings.
 * For NVMe over TCP connections, both header and data digests may be requested during the process of establishing the connection. For details, see:
 * <p>
 * NVM Express Technical Proposal 8000 - NVMe/TCP Transport, Section 7.4.6, "PDU Header and Data Digests"
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public enum HostDigestVerificationSetting {

    dataOnly,
    digestDisabled,
    headerAndData,
    headerOnly

}
