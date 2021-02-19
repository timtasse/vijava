package com.vmware.vim25;

/**
 * Possible RDMA device connection states. These correspond to possible link states as defined by the Infiniband (TM) specification.
 * Further details can be found in:
 *
 * "Infiniband (TM) Architecture Specification, Volume 1" section 7.2 "Link states"
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public enum HostRdmaDeviceConnectionState {

    active,
    activeDefer,
    armed,
    down,
    init,
    unknown

}
