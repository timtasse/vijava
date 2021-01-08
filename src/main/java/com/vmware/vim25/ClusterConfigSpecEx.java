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
 * The ClusterConfigSpecEx data object provides a set of update specifications for complete cluster configuration.
 * You can configure a cluster when you create a new cluster (the CreateClusterEx method) or when you reconfigure an existing cluster (the ReconfigureComputeResource_Task method).
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.7.1
 */

@SuppressWarnings("all")
public class ClusterConfigSpecEx extends ComputeResourceConfigSpec {

    private ClusterDasConfigInfo dasConfig;
    private ClusterDasVmConfigSpec[] dasVmConfigSpec;
    private ClusterDpmConfigInfo dpmConfig;
    private ClusterDpmHostConfigSpec[] dpmHostConfigSpec;
    private ClusterDrsConfigInfo drsConfig;
    private ClusterDrsVmConfigSpec[] drsVmConfigSpec;
    private ClusterGroupSpec[] groupSpec;
    private ClusterInfraUpdateHaConfigInfo infraUpdateHaConfig;
    private Boolean inHciWorkflow;
    private ClusterOrchestrationInfo orchestration;
    private ClusterProactiveDrsConfigInfo proactiveDrsConfig;
    private ClusterRuleSpec[] rulesSpec;
    private ClusterVmOrchestrationSpec[] vmOrchestrationSpec;
    private VsanClusterConfigInfo vsanConfig;
    private VsanHostConfigInfo[] vsanHostConfigSpec;

    @Override
    public String toString() {
        return "ClusterConfigSpecEx{" +
                "dasConfig=" + dasConfig +
                ", dasVmConfigSpec=" + Arrays.toString(dasVmConfigSpec) +
                ", dpmConfig=" + dpmConfig +
                ", dpmHostConfigSpec=" + Arrays.toString(dpmHostConfigSpec) +
                ", drsConfig=" + drsConfig +
                ", drsVmConfigSpec=" + Arrays.toString(drsVmConfigSpec) +
                ", groupSpec=" + Arrays.toString(groupSpec) +
                ", infraUpdateHaConfig=" + infraUpdateHaConfig +
                ", inHciWorkflow=" + inHciWorkflow +
                ", orchestration=" + orchestration +
                ", proactiveDrsConfig=" + proactiveDrsConfig +
                ", rulesSpec=" + Arrays.toString(rulesSpec) +
                ", vmOrchestrationSpec=" + Arrays.toString(vmOrchestrationSpec) +
                ", vsanConfig=" + vsanConfig +
                ", vsanHostConfigSpec=" + Arrays.toString(vsanHostConfigSpec) +
                "} " + super.toString();
    }

    public ClusterDasConfigInfo getDasConfig() {
        return dasConfig;
    }

    public void setDasConfig(final ClusterDasConfigInfo dasConfig) {
        this.dasConfig = dasConfig;
    }

    public ClusterDasVmConfigSpec[] getDasVmConfigSpec() {
        return dasVmConfigSpec;
    }

    public void setDasVmConfigSpec(final ClusterDasVmConfigSpec[] dasVmConfigSpec) {
        this.dasVmConfigSpec = dasVmConfigSpec;
    }

    public ClusterDpmConfigInfo getDpmConfig() {
        return dpmConfig;
    }

    public void setDpmConfig(final ClusterDpmConfigInfo dpmConfig) {
        this.dpmConfig = dpmConfig;
    }

    public ClusterDpmHostConfigSpec[] getDpmHostConfigSpec() {
        return dpmHostConfigSpec;
    }

    public void setDpmHostConfigSpec(final ClusterDpmHostConfigSpec[] dpmHostConfigSpec) {
        this.dpmHostConfigSpec = dpmHostConfigSpec;
    }

    public ClusterDrsConfigInfo getDrsConfig() {
        return drsConfig;
    }

    public void setDrsConfig(final ClusterDrsConfigInfo drsConfig) {
        this.drsConfig = drsConfig;
    }

    public ClusterDrsVmConfigSpec[] getDrsVmConfigSpec() {
        return drsVmConfigSpec;
    }

    public void setDrsVmConfigSpec(final ClusterDrsVmConfigSpec[] drsVmConfigSpec) {
        this.drsVmConfigSpec = drsVmConfigSpec;
    }

    public ClusterGroupSpec[] getGroupSpec() {
        return groupSpec;
    }

    public void setGroupSpec(final ClusterGroupSpec[] groupSpec) {
        this.groupSpec = groupSpec;
    }

    public ClusterInfraUpdateHaConfigInfo getInfraUpdateHaConfig() {
        return infraUpdateHaConfig;
    }

    public void setInfraUpdateHaConfig(final ClusterInfraUpdateHaConfigInfo infraUpdateHaConfig) {
        this.infraUpdateHaConfig = infraUpdateHaConfig;
    }

    public Boolean getInHciWorkflow() {
        return inHciWorkflow;
    }

    public void setInHciWorkflow(final Boolean inHciWorkflow) {
        this.inHciWorkflow = inHciWorkflow;
    }

    public ClusterOrchestrationInfo getOrchestration() {
        return orchestration;
    }

    public void setOrchestration(final ClusterOrchestrationInfo orchestration) {
        this.orchestration = orchestration;
    }

    public ClusterProactiveDrsConfigInfo getProactiveDrsConfig() {
        return proactiveDrsConfig;
    }

    public void setProactiveDrsConfig(final ClusterProactiveDrsConfigInfo proactiveDrsConfig) {
        this.proactiveDrsConfig = proactiveDrsConfig;
    }

    public ClusterRuleSpec[] getRulesSpec() {
        return rulesSpec;
    }

    public void setRulesSpec(final ClusterRuleSpec[] rulesSpec) {
        this.rulesSpec = rulesSpec;
    }

    public ClusterVmOrchestrationSpec[] getVmOrchestrationSpec() {
        return vmOrchestrationSpec;
    }

    public void setVmOrchestrationSpec(final ClusterVmOrchestrationSpec[] vmOrchestrationSpec) {
        this.vmOrchestrationSpec = vmOrchestrationSpec;
    }

    public VsanClusterConfigInfo getVsanConfig() {
        return vsanConfig;
    }

    public void setVsanConfig(final VsanClusterConfigInfo vsanConfig) {
        this.vsanConfig = vsanConfig;
    }

    public VsanHostConfigInfo[] getVsanHostConfigSpec() {
        return vsanHostConfigSpec;
    }

    public void setVsanHostConfigSpec(final VsanHostConfigInfo[] vsanHostConfigSpec) {
        this.vsanHostConfigSpec = vsanHostConfigSpec;
    }
}
