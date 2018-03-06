package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class FilterInUse extends ResourceInUse {

    public VirtualDiskId[] disk;

    public VirtualDiskId[] getDisk() {
        return disk;
    }

    public void setDisk(final VirtualDiskId[] disk) {
        this.disk = disk;
    }
}
