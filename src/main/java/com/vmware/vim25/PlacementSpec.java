package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class PlacementSpec extends DynamicData {

    public VirtualMachineMovePriority priority;
    public ManagedObjectReference vm;
    public VirtualMachineConfigSpec configSpec;
    public VirtualMachineRelocateSpec relocateSpec;
    public ManagedObjectReference[] hosts;
    public ManagedObjectReference datastores;
    public ManagedObjectReference[] storagePods;
    public Boolean disallowPrerequisiteMoves;
    public ClusterRuleInfo[] rules;
    public String key;
    public String placementType;
    public VirtualMachineCloneSpec cloneSpec;
    public String cloneName;

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(final String cloneName) {
        this.cloneName = cloneName;
    }

    public VirtualMachineCloneSpec getCloneSpec() {
        return cloneSpec;
    }

    public void setCloneSpec(final VirtualMachineCloneSpec cloneSpec) {
        this.cloneSpec = cloneSpec;
    }

    public VirtualMachineConfigSpec getConfigSpec() {
        return configSpec;
    }

    public void setConfigSpec(final VirtualMachineConfigSpec configSpec) {
        this.configSpec = configSpec;
    }

    public ManagedObjectReference getDatastores() {
        return datastores;
    }

    public void setDatastores(final ManagedObjectReference datastores) {
        this.datastores = datastores;
    }

    public Boolean isDisallowPrerequisiteMoves() {
        return disallowPrerequisiteMoves;
    }

    public void setDisallowPrerequisiteMoves(final Boolean disallowPrerequisiteMoves) {
        this.disallowPrerequisiteMoves = disallowPrerequisiteMoves;
    }

    public ManagedObjectReference[] getHosts() {
        return hosts;
    }

    public void setHosts(final ManagedObjectReference[] hosts) {
        this.hosts = hosts;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getPlacementType() {
        return placementType;
    }

    public void setPlacementType(final String placementType) {
        this.placementType = placementType;
    }

    public VirtualMachineMovePriority getPriority() {
        return priority;
    }

    public void setPriority(final VirtualMachineMovePriority priority) {
        this.priority = priority;
    }

    public VirtualMachineRelocateSpec getRelocateSpec() {
        return relocateSpec;
    }

    public void setRelocateSpec(final VirtualMachineRelocateSpec relocateSpec) {
        this.relocateSpec = relocateSpec;
    }

    public ClusterRuleInfo[] getRules() {
        return rules;
    }

    public void setRules(final ClusterRuleInfo[] rules) {
        this.rules = rules;
    }

    public ManagedObjectReference[] getStoragePods() {
        return storagePods;
    }

    public void setStoragePods(final ManagedObjectReference[] storagePods) {
        this.storagePods = storagePods;
    }

    public ManagedObjectReference getVm() {
        return vm;
    }

    public void setVm(final ManagedObjectReference vm) {
        this.vm = vm;
    }
}
