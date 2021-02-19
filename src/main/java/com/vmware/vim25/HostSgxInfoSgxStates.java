package com.vmware.vim25;

/**
 * Host SGX states.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public enum HostSgxInfoSgxStates {

    disabledBIOS,
    disabledCFW101,
    disabledCPUMismatch,
    disabledMaxEPCRegs,
    disabledNoFLC,
    disabledNUMAUnsup,
    enabled,
    notPresent

}
