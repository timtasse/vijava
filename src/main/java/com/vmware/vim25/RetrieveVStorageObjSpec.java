package com.vmware.vim25;

/**
 * This data object is a pair of the virtural storage object id and its datastore.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class RetrieveVStorageObjSpec extends DynamicData {

    private ManagedObjectReference datastore;
    private ID id;

    @Override
    public String toString() {
        return "RetrieveVStorageObjSpec{" +
                "datastore=" + datastore +
                ", id=" + id +
                "} " + super.toString();
    }

    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    public void setDatastore(final ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public ID getId() {
        return id;
    }

    public void setId(final ID id) {
        this.id = id;
    }

}
