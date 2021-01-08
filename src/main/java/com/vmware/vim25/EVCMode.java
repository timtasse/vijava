/*================================================================================
Copyright (c) 2013 Steve Jin. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation 
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25;

import java.util.Arrays;

/**
 * The EVCMode data object describes an Enhanced vMotion Compatibility mode. An EVC mode is associated with a set of CPU features.
 * A vCenter Server defines the available EVC modes. You use them to establish a common set of features for compatibility between hosts in a cluster.
 * An EVC-enabled cluster supports safe vMotion of virtual machines across a range of CPU generations. You must use the vSphere Client to configure EVC.
 * When you add a host to an EVC-enabled cluster, the vCenter Server determines the CPU compatibility to preserve vMotion compatibility within the cluster.
 * If the host CPU is compatible with those already in the cluster, the Server adds the host to the cluster and configures it for compatible operation.
 * Hosts that are not compatible are not allowed to join the cluster.
 * <p>
 * The inherited key property is a string value that uniquely identifies an EVC mode. The vCenter Server assigns the key value;
 * the vSphere API uses the key to identify modes in summary and information objects:
 * <p>
 * ClusterComputeResourceSummary.currentEVCModeKey
 * HostListSummary.currentEVCModeKey
 * HostListSummary.maxEVCModeKey
 * VirtualMachineRuntimeInfo.minRequiredEVCModeKey
 * The inherited label and summary properties are human-readable strings.
 * <p>
 * You can use the track and vendorTier properties to determine feature-superset relationships between modes without examining the individual feature bits in guaranteedCPUFeatures.
 * The CPU feature baseline of mode A is a superset of mode B's baseline if and only if:
 * <p>
 * modeA.track is the same as or a superset of modeB.track
 * modeA.vendorTier is equal to or greater than modeB.vendorTier
 * Use the track and vendorTier properties only for the purpose of feature-superset calculations as described above.
 * Do not use them to infer the presence or absence of specific features. The property values for a given mode may change across releases as the set of available EVC modes changes,
 * to better represent mode relationships.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class EVCMode extends ElementDescription {

    private HostCpuIdInfo[] guaranteedCPUFeatures;
    private HostFeatureCapability[] featureCapability;
    private HostFeatureMask[] featureMask;
    private VirtualMachineFeatureRequirement[] featureRequirement;
    private String vendor;
    private String[] track;
    private int vendorTier;

    @Override
    public String toString() {
        return "EVCMode{" +
                "guaranteedCPUFeatures=" + Arrays.toString(guaranteedCPUFeatures) +
                ", featureCapability=" + Arrays.toString(featureCapability) +
                ", featureMask=" + Arrays.toString(featureMask) +
                ", featureRequirement=" + Arrays.toString(featureRequirement) +
                ", vendor='" + vendor + '\'' +
                ", track=" + Arrays.toString(track) +
                ", vendorTier=" + vendorTier +
                "} " + super.toString();
    }

    public HostCpuIdInfo[] getGuaranteedCPUFeatures() {
        return guaranteedCPUFeatures;
    }

    public void setGuaranteedCPUFeatures(final HostCpuIdInfo[] guaranteedCPUFeatures) {
        this.guaranteedCPUFeatures = guaranteedCPUFeatures;
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

    public String getVendor() {
        return vendor;
    }

    public void setVendor(final String vendor) {
        this.vendor = vendor;
    }

    public String[] getTrack() {
        return track;
    }

    public void setTrack(final String[] track) {
        this.track = track;
    }

    public int getVendorTier() {
        return vendorTier;
    }

    public void setVendorTier(final int vendorTier) {
        this.vendorTier = vendorTier;
    }

}
