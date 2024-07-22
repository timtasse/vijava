package com.vmware.vim25;

import java.util.Collections;
import java.util.List;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class DVSManagerPhysicalNicsList extends DynamicData {

    private ManagedObjectReference host;
    private List<PhysicalNic> physicalNics = Collections.emptyList();

    @Override
    public String toString() {
        return "DVSManagerPhysicalNicsList{" +
                "host=" + host +
                ", physicalNics=" + physicalNics +
                '}';
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public List<PhysicalNic> getPhysicalNics() {
        return physicalNics;
    }

    public void setPhysicalNics(final List<PhysicalNic> physicalNics) {
        this.physicalNics = physicalNics;
    }

}
