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
 * The ClusterConfigInfoEx data object describes a complete cluster configuration.
 * For information about configuring a cluster, see ClusterConfigSpecEx.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
public class ClusterConfigInfoEx extends ComputeResourceConfigInfo {

    private ClusterDasConfigInfo dasConfig;
    private ClusterDasVmConfigInfo[] dasVmConfig;
    private ClusterDrsConfigInfo drsConfig;
    private ClusterDrsVmConfigInfo[] drsVmConfig;
    private ClusterRuleInfo[] rule;
    private ClusterOrchestrationInfo orchestration;
    private ClusterVmOrchestrationInfo[] vmOrchestration;
    private ClusterDpmConfigInfo dpmConfigInfo;
    private ClusterDpmHostConfigInfo[] dpmHostConfig;
    private VsanClusterConfigInfo vsanConfigInfo;
    private VsanHostConfigInfo[] vsanHostConfig;
    private ClusterGroupInfo[] group;
    private ClusterInfraUpdateHaConfigInfo infraUpdateHaConfig;
    private ClusterProactiveDrsConfigInfo proactiveDrsConfig;
    private ClusterCryptoConfigInfo cryptoConfig;

    @Override
    public String toString() {
        return "ClusterConfigInfoEx{" +
                "dasConfig=" + dasConfig +
                ", dasVmConfig=" + Arrays.toString(dasVmConfig) +
                ", drsConfig=" + drsConfig +
                ", drsVmConfig=" + Arrays.toString(drsVmConfig) +
                ", rule=" + Arrays.toString(rule) +
                ", orchestration=" + orchestration +
                ", vmOrchestration=" + Arrays.toString(vmOrchestration) +
                ", dpmConfigInfo=" + dpmConfigInfo +
                ", dpmHostConfig=" + Arrays.toString(dpmHostConfig) +
                ", vsanConfigInfo=" + vsanConfigInfo +
                ", vsanHostConfig=" + Arrays.toString(vsanHostConfig) +
                ", group=" + Arrays.toString(group) +
                ", infraUpdateHaConfig=" + infraUpdateHaConfig +
                ", proactiveDrsConfig=" + proactiveDrsConfig +
                ", cryptoConfig=" + cryptoConfig +
                "} " + super.toString();
    }

    public ClusterDasConfigInfo getDasConfig() {
        return this.dasConfig;
    }

    public void setDasConfig(ClusterDasConfigInfo dasConfig) {
        this.dasConfig = dasConfig;
    }

    public ClusterDasVmConfigInfo[] getDasVmConfig() {
        return this.dasVmConfig;
    }

    public void setDasVmConfig(ClusterDasVmConfigInfo[] dasVmConfig) {
        this.dasVmConfig = dasVmConfig;
    }

    public ClusterDrsConfigInfo getDrsConfig() {
        return this.drsConfig;
    }

    public void setDrsConfig(ClusterDrsConfigInfo drsConfig) {
        this.drsConfig = drsConfig;
    }

    public ClusterDrsVmConfigInfo[] getDrsVmConfig() {
        return this.drsVmConfig;
    }

    public void setDrsVmConfig(ClusterDrsVmConfigInfo[] drsVmConfig) {
        this.drsVmConfig = drsVmConfig;
    }

    public ClusterRuleInfo[] getRule() {
        return this.rule;
    }

    public void setRule(ClusterRuleInfo[] rule) {
        this.rule = rule;
    }

    public ClusterDpmConfigInfo getDpmConfigInfo() {
        return this.dpmConfigInfo;
    }

    public void setDpmConfigInfo(ClusterDpmConfigInfo dpmConfigInfo) {
        this.dpmConfigInfo = dpmConfigInfo;
    }

    public ClusterDpmHostConfigInfo[] getDpmHostConfig() {
        return this.dpmHostConfig;
    }

    public void setDpmHostConfig(ClusterDpmHostConfigInfo[] dpmHostConfig) {
        this.dpmHostConfig = dpmHostConfig;
    }

    public VsanClusterConfigInfo getVsanConfigInfo() {
        return this.vsanConfigInfo;
    }

    public void setVsanConfigInfo(VsanClusterConfigInfo vsanConfigInfo) {
        this.vsanConfigInfo = vsanConfigInfo;
    }

    public VsanHostConfigInfo[] getVsanHostConfig() {
        return this.vsanHostConfig;
    }

    public void setVsanHostConfig(VsanHostConfigInfo[] vsanHostConfig) {
        this.vsanHostConfig = vsanHostConfig;
    }

    public ClusterGroupInfo[] getGroup() {
        return this.group;
    }

    public void setGroup(ClusterGroupInfo[] group) {
        this.group = group;
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

    public ClusterVmOrchestrationInfo[] getVmOrchestration() {
        return vmOrchestration;
    }

    public void setVmOrchestration(final ClusterVmOrchestrationInfo[] vmOrchestration) {
        this.vmOrchestration = vmOrchestration;
    }

    public ClusterCryptoConfigInfo getCryptoConfig() {
        return cryptoConfig;
    }

    public void setCryptoConfig(final ClusterCryptoConfigInfo cryptoConfig) {
        this.cryptoConfig = cryptoConfig;
    }

}
