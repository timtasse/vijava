package com.vmware.vim25;

/**
 * Describes cluster configuration for various vCenter services.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceVCProfile extends DynamicData {

    private ClusterConfigSpecEx clusterSpec;
    private String evcModeKey;

    @Override
    public String toString() {
        return "ClusterComputeResourceVCProfile{" +
                "clusterSpec=" + clusterSpec +
                ", evcModeKey='" + evcModeKey + '\'' +
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
}
