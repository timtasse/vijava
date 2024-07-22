package com.vmware.vim25;

/**
 * NFS mount request can be failed due to a number of reasons as defined in this enum MountFailedReason.
 * The reason for the mount failure is reported in mountFailedReason.
 * This is applicable only for those datastores to which mount retry is configured.
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
public enum HostMountInfoMountFailedReason {
    CONN_LIMIT_EXCEEDED,
    CONNECT_FAILURE,
    MOUNT_DENIED,
    MOUNT_EXISTS,
    MOUNT_NOT_DIR,
    MOUNT_NOT_SUPPORTED,
    NFS_NOT_SUPPORTED,
    OTHERS,
    VOLUME_LIMIT_EXCEEDED
}
