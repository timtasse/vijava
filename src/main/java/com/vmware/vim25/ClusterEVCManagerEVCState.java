package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 28.03.18.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class ClusterEVCManagerEVCState extends DynamicData {

    public String currentEVCModeKey;
    public HostFeatureCapability[] featureCapability;
    public HostFeatureMask[] featureMask;
    public VirtualMachineFeatureRequirement[] featureRequirement;
    public HostCpuIdInfo[] guaranteedCPUFeatures;
    public EVCMode[] supportedEVCMode;

    public String getCurrentEVCModeKey() {
        return currentEVCModeKey;
    }

    public void setCurrentEVCModeKey(final String currentEVCModeKey) {
        this.currentEVCModeKey = currentEVCModeKey;
    }

    public HostFeatureCapability[] getFeatureCapability() {
        return featureCapability;
    }

    public void setFeatureCapability(final HostFeatureCapability[] featureCapability) {
        this.featureCapability = featureCapability;
    }

    public HostFeatureMask[] getFeatureMask() {
        return featureMask;
    }

    public void setFeatureMask(final HostFeatureMask[] featureMask) {
        this.featureMask = featureMask;
    }

    public VirtualMachineFeatureRequirement[] getFeatureRequirement() {
        return featureRequirement;
    }

    public void setFeatureRequirement(final VirtualMachineFeatureRequirement[] featureRequirement) {
        this.featureRequirement = featureRequirement;
    }

    public HostCpuIdInfo[] getGuaranteedCPUFeatures() {
        return guaranteedCPUFeatures;
    }

    public void setGuaranteedCPUFeatures(final HostCpuIdInfo[] guaranteedCPUFeatures) {
        this.guaranteedCPUFeatures = guaranteedCPUFeatures;
    }

    public EVCMode[] getSupportedEVCMode() {
        return supportedEVCMode;
    }

    public void setSupportedEVCMode(final EVCMode[] supportedEVCMode) {
        this.supportedEVCMode = supportedEVCMode;
    }
}
