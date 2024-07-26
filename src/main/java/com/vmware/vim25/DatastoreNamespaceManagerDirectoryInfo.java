package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.1
 */
@SuppressWarnings("unused")
public class DatastoreNamespaceManagerDirectoryInfo extends DynamicData {

    private long capacity;
    private long used;

    @Override
    public String toString() {
        return "DatastoreNamespaceManagerDirectoryInfo{" +
                "capacity=" + capacity +
                ", used=" + used +
                '}';
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(final long capacity) {
        this.capacity = capacity;
    }

    public long getUsed() {
        return used;
    }

    public void setUsed(final long used) {
        this.used = used;
    }

}
