package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VRPEditSpec extends DynamicData {

    public ManagedObjectReference[] addedHubs;
    public Long changeVersion;
    public VrpResourceAllocationInfo cpuAllocation;
    public String description;
    public VrpResourceAllocationInfo memoryAllocation;
    public ManagedObjectReference[] removedHubs;
    public String vrpId;

    public ManagedObjectReference[] getAddedHubs() {
        return addedHubs;
    }

    public void setAddedHubs(final ManagedObjectReference[] addedHubs) {
        this.addedHubs = addedHubs;
    }

    public Long getChangeVersion() {
        return changeVersion;
    }

    public void setChangeVersion(final Long changeVersion) {
        this.changeVersion = changeVersion;
    }

    public VrpResourceAllocationInfo getCpuAllocation() {
        return cpuAllocation;
    }

    public void setCpuAllocation(final VrpResourceAllocationInfo cpuAllocation) {
        this.cpuAllocation = cpuAllocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public VrpResourceAllocationInfo getMemoryAllocation() {
        return memoryAllocation;
    }

    public void setMemoryAllocation(final VrpResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }

    public ManagedObjectReference[] getRemovedHubs() {
        return removedHubs;
    }

    public void setRemovedHubs(final ManagedObjectReference[] removedHubs) {
        this.removedHubs = removedHubs;
    }

    public String getVrpId() {
        return vrpId;
    }

    public void setVrpId(final String vrpId) {
        this.vrpId = vrpId;
    }
}
