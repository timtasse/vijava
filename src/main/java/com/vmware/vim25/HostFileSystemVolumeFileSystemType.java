package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 * @version 6.7
 */
public enum HostFileSystemVolumeFileSystemType {

    CIFS("CIFS"),
    NFS("NFS"),
    NFS41("NFS41"),
    OTHER("OTHER"),
    PMEM("PMEM"),
    VFFS("VFFS"),
    VMFS("VMFS"),
    vsan("vsan"),
    VVOL("VVOL");

    private final String val;

    HostFileSystemVolumeFileSystemType(final String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
