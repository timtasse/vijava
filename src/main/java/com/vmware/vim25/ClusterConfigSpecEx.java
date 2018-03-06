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

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.5
 */

@SuppressWarnings("all")
public class ClusterConfigSpecEx extends ComputeResourceConfigSpec {

    public ClusterDasConfigInfo dasConfig;
    public ClusterDasVmConfigSpec[] dasVmConfigSpec;
    public ClusterDrsConfigInfo drsConfig;
    public ClusterDrsVmConfigSpec[] drsVmConfigSpec;
    public ClusterRuleSpec[] rulesSpec;
    public ClusterOrchestrationInfo orchestration;
    public ClusterVmOrchestrationSpec[] vmOrchestrationSpec;
    public ClusterDpmConfigInfo dpmConfig;
    public ClusterDpmHostConfigSpec[] dpmHostConfigSpec;
    public VsanClusterConfigInfo vsanConfig;
    public VsanHostConfigInfo[] vsanHostConfigSpec;
    public ClusterGroupSpec[] groupSpec;
    public ClusterInfraUpdateHaConfigInfo infraUpdateHaConfig;
    public ClusterProactiveDrsConfigInfo proactiveDrsConfig;

    public ClusterDasConfigInfo getDasConfig() {
        return this.dasConfig;
    }

    public void setDasConfig(ClusterDasConfigInfo dasConfig) {
        this.dasConfig = dasConfig;
    }

    public ClusterDasVmConfigSpec[] getDasVmConfigSpec() {
        return this.dasVmConfigSpec;
    }

    public void setDasVmConfigSpec(ClusterDasVmConfigSpec[] dasVmConfigSpec) {
        this.dasVmConfigSpec = dasVmConfigSpec;
    }

    public ClusterDrsConfigInfo getDrsConfig() {
        return this.drsConfig;
    }

    public void setDrsConfig(ClusterDrsConfigInfo drsConfig) {
        this.drsConfig = drsConfig;
    }

    public ClusterDrsVmConfigSpec[] getDrsVmConfigSpec() {
        return this.drsVmConfigSpec;
    }

    public void setDrsVmConfigSpec(ClusterDrsVmConfigSpec[] drsVmConfigSpec) {
        this.drsVmConfigSpec = drsVmConfigSpec;
    }

    public ClusterRuleSpec[] getRulesSpec() {
        return this.rulesSpec;
    }

    public void setRulesSpec(ClusterRuleSpec[] rulesSpec) {
        this.rulesSpec = rulesSpec;
    }

    public ClusterDpmConfigInfo getDpmConfig() {
        return this.dpmConfig;
    }

    public void setDpmConfig(ClusterDpmConfigInfo dpmConfig) {
        this.dpmConfig = dpmConfig;
    }

    public ClusterDpmHostConfigSpec[] getDpmHostConfigSpec() {
        return this.dpmHostConfigSpec;
    }

    public void setDpmHostConfigSpec(ClusterDpmHostConfigSpec[] dpmHostConfigSpec) {
        this.dpmHostConfigSpec = dpmHostConfigSpec;
    }

    public VsanClusterConfigInfo getVsanConfig() {
        return this.vsanConfig;
    }

    public void setVsanConfig(VsanClusterConfigInfo vsanConfig) {
        this.vsanConfig = vsanConfig;
    }

    public VsanHostConfigInfo[] getVsanHostConfigSpec() {
        return this.vsanHostConfigSpec;
    }

    public void setVsanHostConfigSpec(VsanHostConfigInfo[] vsanHostConfigSpec) {
        this.vsanHostConfigSpec = vsanHostConfigSpec;
    }

    public ClusterGroupSpec[] getGroupSpec() {
        return this.groupSpec;
    }

    public void setGroupSpec(ClusterGroupSpec[] groupSpec) {
        this.groupSpec = groupSpec;
    }

    public ClusterInfraUpdateHaConfigInfo getInfraUpdateHaConfig() {
        return infraUpdateHaConfig;
    }

    public void setInfraUpdateHaConfig(final ClusterInfraUpdateHaConfigInfo infraUpdateHaConfig) {
        this.infraUpdateHaConfig = infraUpdateHaConfig;
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

    public ClusterVmOrchestrationSpec[] getVmOrchestrationSpec() {
        return vmOrchestrationSpec;
    }

    public void setVmOrchestrationSpec(final ClusterVmOrchestrationSpec[] vmOrchestrationSpec) {
        this.vmOrchestrationSpec = vmOrchestrationSpec;
    }
}