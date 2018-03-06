package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VirtualResourcePoolSpec extends DynamicData {

    public String vrpId;
    public String vrpName;
    public String description;
    public VrpResourceAllocationInfo cpuAllocation;
    public VrpResourceAllocationInfo memoryAllocation;
    public ManagedObjectReference[] rpList;
    public ManagedObjectReference[] hubList;
    public Boolean rootVRP;
    public Boolean staticVRP;
    public Long changeVersion;

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

    public ManagedObjectReference[] getHubList() {
        return hubList;
    }

    public void setHubList(final ManagedObjectReference[] hubList) {
        this.hubList = hubList;
    }

    public VrpResourceAllocationInfo getMemoryAllocation() {
        return memoryAllocation;
    }

    public void setMemoryAllocation(final VrpResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }

    public Boolean isRootVRP() {
        return rootVRP;
    }

    public void setRootVRP(final Boolean rootVRP) {
        this.rootVRP = rootVRP;
    }

    public ManagedObjectReference[] getRpList() {
        return rpList;
    }

    public void setRpList(final ManagedObjectReference[] rpList) {
        this.rpList = rpList;
    }

    public Boolean isStaticVRP() {
        return staticVRP;
    }

    public void setStaticVRP(final Boolean staticVRP) {
        this.staticVRP = staticVRP;
    }

    public String getVrpId() {
        return vrpId;
    }

    public void setVrpId(final String vrpId) {
        this.vrpId = vrpId;
    }

    public String getVrpName() {
        return vrpName;
    }

    public void setVrpName(final String vrpName) {
        this.vrpName = vrpName;
    }
}
