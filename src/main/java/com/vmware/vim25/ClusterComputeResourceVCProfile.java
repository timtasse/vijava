package com.vmware.vim25;

/**
 * Describes cluster configuration for various vCenter services.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.1
 * @since 6.7.1
 */
public class ClusterComputeResourceVCProfile extends DynamicData {

    private ClusterConfigSpecEx clusterSpec;
    private String evcModeKey;
    private String evcGraphicsModeKey;

    @Override
    public String toString() {
        return "ClusterComputeResourceVCProfile{" +
                "clusterSpec=" + clusterSpec +
                ", evcModeKey='" + evcModeKey + '\'' +
                ", evcGraphicsModeKey='" + evcGraphicsModeKey + '\'' +
                "} " + super.toString();
    }

    public ClusterConfigSpecEx getClusterSpec() {
        return clusterSpec;
    }

    public void setClusterSpec(final ClusterConfigSpecEx clusterSpec) {
        this.clusterSpec = clusterSpec;
    }

    public String getEvcModeKey() {
        return evcModeKey;
    }

    public void setEvcModeKey(final String evcModeKey) {
        this.evcModeKey = evcModeKey;
    }

    public String getEvcGraphicsModeKey() {
        return evcGraphicsModeKey;
    }

    public void setEvcGraphicsModeKey(final String evcGraphicsModeKey) {
        this.evcGraphicsModeKey = evcGraphicsModeKey;
    }

}
