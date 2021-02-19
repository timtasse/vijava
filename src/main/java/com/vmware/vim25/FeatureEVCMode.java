package com.vmware.vim25;

import java.util.Arrays;

/**
 * The FeatureEVCMode data object describes an Enhanced vMotion Compatibility mode for VMFeature.
 * An Feature EVC mode is associated with a set of features. This object is modeled after EVCMode, which is more CPU-centric.
 * Members that are specific to CPU are removed in favor of VMFeature EVC properties.
 * For more information about EVC interaction, see {@see EVCMode}.
 * The inherited key property is a string value that uniquely identifies an EVC mode.
 * The vCenter Server assigns the key value; the vSphere API uses the key to identify modes in summary and information objects, for example:
 *
 * {@link ClusterComputeResourceSummary#getCurrentEVCGraphicsModeKey}
 * {@link HostListSummary#getCurrentEVCGraphicsModeKey}
 *
 * The inherited label and summary properties are human-readable strings.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.1
 */
public class FeatureEVCMode extends ElementDescription {

    private HostFeatureMask[] mask;
    private HostFeatureCapability[] capability;
    private VirtualMachineFeatureRequirement[] requirement;

    @Override
    public String toString() {
        return "FeatureEVCMode{" +
                "capability=" + Arrays.toString(capability) +
                ", mask=" + Arrays.toString(mask) +
                ", requirement=" + Arrays.toString(requirement) +
                "} " + super.toString();
    }

    public HostFeatureCapability[] getCapability() {
        return capability;
    }

    public void setCapability(final HostFeatureCapability[] capability) {
        this.capability = capability;
    }

    public HostFeatureMask[] getMask() {
        return mask;
    }

    public void setMask(final HostFeatureMask[] mask) {
        this.mask = mask;
    }

    public VirtualMachineFeatureRequirement[] getRequirement() {
        return requirement;
    }

    public void setRequirement(final VirtualMachineFeatureRequirement[] requirement) {
        this.requirement = requirement;
    }

}
