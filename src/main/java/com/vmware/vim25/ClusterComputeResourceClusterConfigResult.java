package com.vmware.vim25;

import java.util.Arrays;

/**
 * ClusterConfigResult is the result returned for the ConfigureHCI_Task method.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceClusterConfigResult extends DynamicData {

    private ManagedObjectReference[] configuredHosts;
    private FolderFailedHostResult[] failedHosts;

    @Override
    public String toString() {
        return "ClusterComputeResourceClusterConfigResult{" +
                "configuredHosts=" + Arrays.toString(configuredHosts) +
                ", failedHosts=" + Arrays.toString(failedHosts) +
                "} " + super.toString();
    }

    public ManagedObjectReference[] getConfiguredHosts() {
        return configuredHosts;
    }

    public void setConfiguredHosts(final ManagedObjectReference[] configuredHosts) {
        this.configuredHosts = configuredHosts;
    }

    public FolderFailedHostResult[] getFailedHosts() {
        return failedHosts;
    }

    public void setFailedHosts(final FolderFailedHostResult[] failedHosts) {
        this.failedHosts = failedHosts;
    }
}
