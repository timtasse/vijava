package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VslmCreateSpecBackingSpec extends DynamicData {

    public ManagedObjectReference datastore;

    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    public void setDatastore(final ManagedObjectReference datastore) {
        this.datastore = datastore;
    }
}
