package com.vmware.vim25;

import com.vmware.vim25.mo.Datastore;

/**
 * An incremental update to a Datastore list.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class ClusterDatastoreUpdateSpec extends ArrayUpdateSpec {

    private ManagedObjectReference datastore;

    @Override
    public String toString() {
        return "ClusterDatastoreUpdateSpec{" +
                "datastore=" + datastore +
                "} " + super.toString();
    }

    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    public void setDatastore(final ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public void setDatastore(final Datastore datastore) {
        this.datastore = datastore.getMOR();
    }

}
