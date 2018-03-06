package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class PlacementRankSpec extends DynamicData {

    public PlacementSpec[] specs;
    public ManagedObjectReference[] clusters;
    public PlacementAffinityRule[] rules;
    public StorageDrsPlacementRankVmSpec[] placementRankByVm;

    public ManagedObjectReference[] getClusters() {
        return clusters;
    }

    public void setClusters(final ManagedObjectReference[] clusters) {
        this.clusters = clusters;
    }

    public StorageDrsPlacementRankVmSpec[] getPlacementRankByVm() {
        return placementRankByVm;
    }

    public void setPlacementRankByVm(final StorageDrsPlacementRankVmSpec[] placementRankByVm) {
        this.placementRankByVm = placementRankByVm;
    }

    public PlacementAffinityRule[] getRules() {
        return rules;
    }

    public void setRules(final PlacementAffinityRule[] rules) {
        this.rules = rules;
    }

    public PlacementSpec[] getSpecs() {
        return specs;
    }

    public void setSpecs(final PlacementSpec[] specs) {
        this.specs = specs;
    }
}
