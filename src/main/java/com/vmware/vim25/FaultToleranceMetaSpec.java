package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class FaultToleranceMetaSpec extends DynamicData {

    public ManagedObjectReference metaDataDatastore;

    public ManagedObjectReference getMetaDataDatastore() {
        return metaDataDatastore;
    }

    public void setMetaDataDatastore(final ManagedObjectReference metaDataDatastore) {
        this.metaDataDatastore = metaDataDatastore;
    }
}
