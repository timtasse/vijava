package com.vmware.vim25;

/**
 * Type of file system volume
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 * @version 6.7
 */
public enum HostFileSystemVolumeFileSystemType {

    CIFS,
    NFS,
    NFS41,
    OTHER,
    PMEM,
    VFFS,
    VMFS,
    vsan,
    vsanD,
    VVOL

}
