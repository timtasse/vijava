package com.vmware.vim25;

import java.util.Arrays;

/**
 * Host configuration input to configure hosts in a cluster.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceHostConfigurationInput extends DynamicData {

    private Boolean allowedInNonMaintenanceMode;
    private ManagedObjectReference host;
    private ClusterComputeResourceHostVmkNicInfo[] hostVmkNics;

    @Override
    public String toString() {
        return "ClusterComputeResourceHostConfigurationInput{" +
                "allowedInNonMaintenanceMode=" + allowedInNonMaintenanceMode +
                ", host=" + host +
                ", hostVmkNics=" + Arrays.toString(hostVmkNics) +
                "} " + super.toString();
    }

    public Boolean getAllowedInNonMaintenanceMode() {
        return allowedInNonMaintenanceMode;
    }

    public void setAllowedInNonMaintenanceMode(final Boolean allowedInNonMaintenanceMode) {
        this.allowedInNonMaintenanceMode = allowedInNonMaintenanceMode;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public ClusterComputeResourceHostVmkNicInfo[] getHostVmkNics() {
        return hostVmkNics;
    }

    public void setHostVmkNics(final ClusterComputeResourceHostVmkNicInfo[] hostVmkNics) {
        this.hostVmkNics = hostVmkNics;
    }
}
