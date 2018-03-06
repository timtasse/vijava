package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostDatastoreSystemDatastoreResult extends DynamicData {

    public LocalizedMethodFault fault;
    public ManagedObjectReference key;

    public LocalizedMethodFault getFault() {
        return fault;
    }

    public void setFault(final LocalizedMethodFault fault) {
        this.fault = fault;
    }

    public ManagedObjectReference getKey() {
        return key;
    }

    public void setKey(final ManagedObjectReference key) {
        this.key = key;
    }
}
