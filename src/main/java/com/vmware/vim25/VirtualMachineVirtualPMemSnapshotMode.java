package com.vmware.vim25;

/**
 * The set of supported snapshot modes for VMs configured with NVDIMMs.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public enum VirtualMachineVirtualPMemSnapshotMode {

    independent_eraseonrevert,
    independent_persistent

}
