package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class FaultToleranceDiskSpec extends DynamicData {

    public VirtualDevice disk;
    public ManagedObjectReference datastore;

    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    public void setDatastore(final ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public VirtualDevice getDisk() {
        return disk;
    }

    public void setDisk(final VirtualDevice disk) {
        this.disk = disk;
    }
}
