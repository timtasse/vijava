package com.vmware.vim25;

import java.util.Arrays;

/**
 * This data object captures a subset of initial configuration of the cluster, which was configured by calling the ConfigureHCI_Task method.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceHCIConfigInfo extends DynamicData {

    private ManagedObjectReference[] configuredHosts;
    private ClusterComputeResourceDVSSetting[] dvsSetting;
    private ClusterComputeResourceHostConfigurationProfile hostConfigProfile;
    private String workflowState;

    @Override
    public String toString() {
        return "ClusterComputeResourceHCIConfigInfo{" +
                "configuredHosts=" + Arrays.toString(configuredHosts) +
                ", dvsSetting=" + Arrays.toString(dvsSetting) +
                ", hostConfigProfile=" + hostConfigProfile +
                ", workflowState='" + workflowState + '\'' +
                "} " + super.toString();
    }

    public ManagedObjectReference[] getConfiguredHosts() {
        return configuredHosts;
    }

    public void setConfiguredHosts(final ManagedObjectReference[] configuredHosts) {
        this.configuredHosts = configuredHosts;
    }

    public ClusterComputeResourceDVSSetting[] getDvsSetting() {
        return dvsSetting;
    }

    public void setDvsSetting(final ClusterComputeResourceDVSSetting[] dvsSetting) {
        this.dvsSetting = dvsSetting;
    }

    public ClusterComputeResourceHostConfigurationProfile getHostConfigProfile() {
        return hostConfigProfile;
    }

    public void setHostConfigProfile(final ClusterComputeResourceHostConfigurationProfile hostConfigProfile) {
        this.hostConfigProfile = hostConfigProfile;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(final String workflowState) {
        this.workflowState = workflowState;
    }
}
