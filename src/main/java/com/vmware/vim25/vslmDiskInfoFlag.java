package com.vmware.vim25;

/**
 * Flags representing the different information of a disk.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
public enum vslmDiskInfoFlag {
    allocated,
    backingObjectId,
    capacity,
    cbtEnabled,
    consumers,
    controlFlags,
    createTime,
    deviceName,
    id,
    ioFilter,
    keepAfterVmDelete,
    keyId,
    keyProviderId,
    name,
    nativeSnapshotSupported,
    parentPath,
    path,
    relocationDisabled,
    tentativeState,
    type
}
