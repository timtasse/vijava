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
 * A particular product may or may not support certain features. This data object indicates whether or not a service instance implements these features.
 * This data object type indicates the circumstances under which an operation throws a NotSupported fault.
 * Support for some features is indicated by the presence or absence of the manager object from the service instance.
 * For example, the AlarmManager manager object indicates collecting alarms is supported.
 * Other features indicate whether or not a given operation on an object throws a NotSupported fault.
 *
 * Some capabilities depend on the host or virtual machine version. These are specified by using the vim.host.Capability and vim.vm.Capability objects.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.1
 */
@SuppressWarnings("unused")
public class Capability extends DynamicData {

    private boolean provisioningSupported;
    private boolean multiHostSupported;
    private boolean userShellAccessSupported;
    private EVCMode[] supportedEVCMode;
    private FeatureEVCMode[] supportedEVCGraphicsMode;
    private Boolean networkBackupAndRestoreSupported;
    private Boolean ftDrsWithoutEvcSupported;
    private Boolean hciWorkflowSupported;
    private Integer computePolicyVersion;
    private Boolean clusterPlacementSupported;
    private Boolean lifecycleManagementSupported;
    private Boolean scalableSharesSupported;

    @Override
    public String toString() {
        return "Capability{" +
                "provisioningSupported=" + provisioningSupported +
                ", multiHostSupported=" + multiHostSupported +
                ", userShellAccessSupported=" + userShellAccessSupported +
                ", supportedEVCMode=" + Arrays.toString(supportedEVCMode) +
                ", supportedEVCGraphicsMode=" + Arrays.toString(supportedEVCGraphicsMode) +
                ", networkBackupAndRestoreSupported=" + networkBackupAndRestoreSupported +
                ", ftDrsWithoutEvcSupported=" + ftDrsWithoutEvcSupported +
                ", hciWorkflowSupported=" + hciWorkflowSupported +
                ", computePolicyVersion=" + computePolicyVersion +
                ", clusterPlacementSupported=" + clusterPlacementSupported +
                ", lifecycleManagementSupported=" + lifecycleManagementSupported +
                ", scalableSharesSupported=" + scalableSharesSupported +
                "} " + super.toString();
    }

    public Boolean getFtDrsWithoutEvcSupported() {
        return ftDrsWithoutEvcSupported;
    }

    public void setFtDrsWithoutEvcSupported(final Boolean ftDrsWithoutEvcSupported) {
        this.ftDrsWithoutEvcSupported = ftDrsWithoutEvcSupported;
    }

    public boolean isMultiHostSupported() {
        return multiHostSupported;
    }

    public void setMultiHostSupported(final boolean multiHostSupported) {
        this.multiHostSupported = multiHostSupported;
    }

    public Boolean getNetworkBackupAndRestoreSupported() {
        return networkBackupAndRestoreSupported;
    }

    public void setNetworkBackupAndRestoreSupported(final Boolean networkBackupAndRestoreSupported) {
        this.networkBackupAndRestoreSupported = networkBackupAndRestoreSupported;
    }

    public boolean isProvisioningSupported() {
        return provisioningSupported;
    }

    public void setProvisioningSupported(final boolean provisioningSupported) {
        this.provisioningSupported = provisioningSupported;
    }

    public EVCMode[] getSupportedEVCMode() {
        return supportedEVCMode;
    }

    public void setSupportedEVCMode(final EVCMode[] supportedEVCMode) {
        this.supportedEVCMode = supportedEVCMode;
    }

    public boolean isUserShellAccessSupported() {
        return userShellAccessSupported;
    }

    public void setUserShellAccessSupported(final boolean userShellAccessSupported) {
        this.userShellAccessSupported = userShellAccessSupported;
    }

    public Boolean getHciWorkflowSupported() {
        return hciWorkflowSupported;
    }

    public void setHciWorkflowSupported(final Boolean hciWorkflowSupported) {
        this.hciWorkflowSupported = hciWorkflowSupported;
    }

    public Integer getComputePolicyVersion() {
        return computePolicyVersion;
    }

    public void setComputePolicyVersion(final Integer computePolicyVersion) {
        this.computePolicyVersion = computePolicyVersion;
    }

    public Boolean getClusterPlacementSupported() {
        return clusterPlacementSupported;
    }

    public void setClusterPlacementSupported(final Boolean clusterPlacementSupported) {
        this.clusterPlacementSupported = clusterPlacementSupported;
    }

    public Boolean getLifecycleManagementSupported() {
        return lifecycleManagementSupported;
    }

    public void setLifecycleManagementSupported(final Boolean lifecycleManagementSupported) {
        this.lifecycleManagementSupported = lifecycleManagementSupported;
    }

    public Boolean getScalableSharesSupported() {
        return scalableSharesSupported;
    }

    public void setScalableSharesSupported(final Boolean scalableSharesSupported) {
        this.scalableSharesSupported = scalableSharesSupported;
    }

    public FeatureEVCMode[] getSupportedEVCGraphicsMode() {
        return supportedEVCGraphicsMode;
    }

    public void setSupportedEVCGraphicsMode(final FeatureEVCMode[] supportedEVCGraphicsMode) {
        this.supportedEVCGraphicsMode = supportedEVCGraphicsMode;
    }

}
