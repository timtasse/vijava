package com.vmware.vim25;

import java.util.List;

/**
 * Describe the network offload specification of a VmwareDistributedVirtualSwitch.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class DistributedVirtualSwitchNetworkOffloadSpec extends DynamicData {

    private String id;
    private String name;
    private List<String> types;

    @Override
    public String toString() {
        return "DistributedVirtualSwitchNetworkOffloadSpec{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", types=" + types +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(final List<String> types) {
        this.types = types;
    }

}
