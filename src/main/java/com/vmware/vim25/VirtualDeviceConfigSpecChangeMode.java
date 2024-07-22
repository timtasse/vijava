package com.vmware.vim25;

/**
 * Describes the change mode of the device.
 * Applies only to virtual disks during VirtualDeviceSpec.Operation "add" that have no VirtualDeviceSpec.FileOperation set.
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
public enum VirtualDeviceConfigSpecChangeMode {
    fail,
    skip
}
