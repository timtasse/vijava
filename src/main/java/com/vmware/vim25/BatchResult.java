package com.vmware.vim25;


/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class BatchResult extends DynamicData {

    public ManagedObjectReference ds;
    public LocalizedMethodFault fault;
    public String hostKey;
    public String result;

    public ManagedObjectReference getDs() {
        return ds;
    }

    public void setDs(final ManagedObjectReference ds) {
        this.ds = ds;
    }

    public LocalizedMethodFault getFault() {
        return fault;
    }

    public void setFault(final LocalizedMethodFault fault) {
        this.fault = fault;
    }

    public String getHostKey() {
        return hostKey;
    }

    public void setHostKey(final String hostKey) {
        this.hostKey = hostKey;
    }

    public String getResult() {
        return result;
    }

    public void setResult(final String result) {
        this.result = result;
    }
}
