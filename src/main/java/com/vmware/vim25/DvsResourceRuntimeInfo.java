package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class DvsResourceRuntimeInfo extends DynamicData {

    public DvsVnicAllocatedResource[] allocatedResource;
    public Integer available;
    public Integer capacity;
    public Integer usage;
    public DvsVmVnicNetworkResourcePoolRuntimeInfo[] vmVnicNetworkResourcePoolRuntime;

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

    public int getUsage() {
        return usage;
    }

    public void setUsage(final int usage) {
        this.usage = usage;
    }

    public DvsVmVnicNetworkResourcePoolRuntimeInfo[] getVmVnicNetworkResourcePoolRuntime() {
        return vmVnicNetworkResourcePoolRuntime;
    }

    public void setVmVnicNetworkResourcePoolRuntime(final DvsVmVnicNetworkResourcePoolRuntimeInfo[] vmVnicNetworkResourcePoolRuntime) {
        this.vmVnicNetworkResourcePoolRuntime = vmVnicNetworkResourcePoolRuntime;
    }
}
