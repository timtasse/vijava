package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class StorageDrsPlacementRankVmSpec extends DynamicData {

    public PlacementSpec vmPlacementSpec;
    public ManagedObjectReference[] vmClusters;

    public ManagedObjectReference[] getVmClusters() {
        return vmClusters;
    }

    public void setVmClusters(final ManagedObjectReference[] vmClusters) {
        this.vmClusters = vmClusters;
    }

    public PlacementSpec getVmPlacementSpec() {
        return vmPlacementSpec;
    }

    public void setVmPlacementSpec(final PlacementSpec vmPlacementSpec) {
        this.vmPlacementSpec = vmPlacementSpec;
    }
}
