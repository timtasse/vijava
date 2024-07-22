package com.vmware.vim25;

import java.util.List;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.0.0
 */
public class ClusterEVCManagerEVCState extends DynamicData {

    private List<EVCMode> supportedEVCMode = List.of();
    private String currentEVCModeKey;
    @Deprecated
    private List<HostCpuIdInfo> guaranteedCPUFeatures = List.of();
    private List<HostFeatureCapability> featureCapability = List.of();
    private List<HostFeatureMask> featureMask = List.of();
    private List<VirtualMachineFeatureRequirement> featureRequirement = List.of();

    @Override
    public String toString() {
        return "ClusterEVCManagerEVCState{" +
                "supportedEVCMode=" + supportedEVCMode +
                ", currentEVCModeKey='" + currentEVCModeKey + '\'' +
                ", guaranteedCPUFeatures=" + guaranteedCPUFeatures +
                ", featureCapability=" + featureCapability +
                ", featureMask=" + featureMask +
                ", featureRequirement=" + featureRequirement +
                '}';
    }

    public List<EVCMode> getSupportedEVCMode() {
        return supportedEVCMode;
    }

    public void setSupportedEVCMode(final List<EVCMode> supportedEVCMode) {
        this.supportedEVCMode = supportedEVCMode;
    }

    public String getCurrentEVCModeKey() {
        return currentEVCModeKey;
    }

    public void setCurrentEVCModeKey(final String currentEVCModeKey) {
        this.currentEVCModeKey = currentEVCModeKey;
    }

    public List<HostCpuIdInfo> getGuaranteedCPUFeatures() {
        return guaranteedCPUFeatures;
    }

    public void setGuaranteedCPUFeatures(final List<HostCpuIdInfo> guaranteedCPUFeatures) {
        this.guaranteedCPUFeatures = guaranteedCPUFeatures;
    }

    public List<HostFeatureCapability> getFeatureCapability() {
        return featureCapability;
    }

    public void setFeatureCapability(final List<HostFeatureCapability> featureCapability) {
        this.featureCapability = featureCapability;
    }

    public List<HostFeatureMask> getFeatureMask() {
        return featureMask;
    }

    public void setFeatureMask(final List<HostFeatureMask> featureMask) {
        this.featureMask = featureMask;
    }

    public List<VirtualMachineFeatureRequirement> getFeatureRequirement() {
        return featureRequirement;
    }

    public void setFeatureRequirement(final List<VirtualMachineFeatureRequirement> featureRequirement) {
        this.featureRequirement = featureRequirement;
    }

}
