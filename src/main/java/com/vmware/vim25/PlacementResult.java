package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class PlacementResult extends DynamicData {

    public ClusterDrsFaults drsFault;
    public ClusterRecommendation[] recommendations;

    public ClusterDrsFaults getDrsFault() {
        return drsFault;
    }

    public void setDrsFault(final ClusterDrsFaults drsFault) {
        this.drsFault = drsFault;
    }

    public ClusterRecommendation[] getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(final ClusterRecommendation[] recommendations) {
        this.recommendations = recommendations;
    }
}
