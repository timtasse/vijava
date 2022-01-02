package com.vmware.vim25;

import com.vmware.vim25.mo.HostSystem;

import java.util.List;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.3
 * @since 7.0.1.1
 */
public class ClusterComputeResourceVcsSlots extends DynamicData {

    private String systemId;
    private ManagedObjectReference host;
    private List<ManagedObjectReference> datastore;
    private int totalSlots;

    @Override
    public String toString() {
        return "ClusterComputeResourceVcsSlots{" +
                "systemId='" + systemId + '\'' +
                ", host=" + host +
                ", datastore=" + datastore +
                ", totalSlots=" + totalSlots +
                "} " + super.toString();
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(final String systemId) {
        this.systemId = systemId;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public void setHost(final HostSystem host) {
        this.host = host.getMOR();
    }

    public List<ManagedObjectReference> getDatastore() {
        return datastore;
    }

    public void setDatastore(final List<ManagedObjectReference> datastore) {
        this.datastore = datastore;
    }

    public int getTotalSlots() {
        return totalSlots;
    }

    public void setTotalSlots(final int totalSlots) {
        this.totalSlots = totalSlots;
    }

}
