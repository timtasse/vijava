package com.vmware.vim25;

/**
 * Defines if the host is ready for NVDS to VDS migration.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.2
 */
public enum HostRuntimeInfoStatelessNvdsMigrationState {

    notNeeded,
    ready,
    unknown

}
