package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class PMemDatastoreInfo extends DatastoreInfo {

    private HostPMemVolume pmem;

    @Override
    public String toString() {
        return "PMemDatastoreInfo{" +
                "pmem=" + pmem +
                "} " + super.toString();
    }

    public HostPMemVolume getPmem() {
        return pmem;
    }

    public void setPmem(final HostPMemVolume pmem) {
        this.pmem = pmem;
    }

}
