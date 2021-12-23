package com.vmware.vim25;

/**
 * The set of valid encrypted Fault Tolerance modes for a VM. If the VM is encrypted, its encrypted Fault Tolerance mode will be required.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.2
 */
public enum VirtualMachineConfigSpecEncryptedFtModes {

    ftEncryptionDisabled,
    ftEncryptionOpportunistic,
    ftEncryptionRequired

}
