package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class DvsVmVnicNetworkResourcePoolRuntimeInfo extends DynamicData {

    public DvsVnicAllocatedResource[] allocatedResource;
    public Integer available;
    public Integer capacity;
    public String key;
    public String name;
    public String status;
    public Integer usage;

    public DvsVnicAllocatedResource[] getAllocatedResource() {
        return allocatedResource;
    }

    public void setAllocatedResource(final DvsVnicAllocatedResource[] allocatedResource) {
        this.allocatedResource = allocatedResource;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(final int available) {
        this.available = available;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(final int capacity) {
        this.capacity = capacity;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(final int usage) {
        this.usage = usage;
    }
}
