package com.vmware.vim25;

/**
 * Specification of the backing of a virtual storage object.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.5
 */
public class VslmCreateSpecBackingSpec extends DynamicData {

    private ManagedObjectReference datastore;
    private String path;

    @Override
    public String toString() {
        return "VslmCreateSpecBackingSpec{" +
                "datastore=" + datastore +
                ", path='" + path + '\'' +
                "} " + super.toString();
    }

    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    public void setDatastore(final ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

}
