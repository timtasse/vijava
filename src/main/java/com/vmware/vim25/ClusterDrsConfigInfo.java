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
 * The ClusterDrsConfigInfo data object contains configuration information for the VMware DRS service.
 *
 * All fields are optional. If you set the modify parameter to true when you call ReconfigureComputeResource_Task,
 * an unset property has no effect on the existing property value in the cluster configuration on the Server.
 * If you set the modify parameter to false when you reconfigure a cluster,
 * the cluster configuration is reverted to the default values, then the new configuration values are applied.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
public class ClusterDrsConfigInfo extends DynamicData {

    @Deprecated(since = "7.0")
    private Boolean enabled;
    private Boolean enableVmBehaviorOverrides;
    private DrsBehavior defaultVmBehavior;
    private Integer vmotionRate;
    private String scaleDescendantsShares;
    private OptionValue[] option;

    @Override
    public String toString() {
        return "ClusterDrsConfigInfo{" +
                "enabled=" + enabled +
                ", enableVmBehaviorOverrides=" + enableVmBehaviorOverrides +
                ", defaultVmBehavior=" + defaultVmBehavior +
                ", vmotionRate=" + vmotionRate +
                ", scaleDescendantsShares='" + scaleDescendantsShares + '\'' +
                ", option=" + Arrays.toString(option) +
                "} " + super.toString();
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getEnableVmBehaviorOverrides() {
        return this.enableVmBehaviorOverrides;
    }

    public void setEnableVmBehaviorOverrides(Boolean enableVmBehaviorOverrides) {
        this.enableVmBehaviorOverrides = enableVmBehaviorOverrides;
    }

    public DrsBehavior getDefaultVmBehavior() {
        return this.defaultVmBehavior;
    }

    public void setDefaultVmBehavior(DrsBehavior defaultVmBehavior) {
        this.defaultVmBehavior = defaultVmBehavior;
    }

    public Integer getVmotionRate() {
        return this.vmotionRate;
    }

    public void setVmotionRate(Integer vmotionRate) {
        this.vmotionRate = vmotionRate;
    }

    public OptionValue[] getOption() {
        return this.option;
    }

    public void setOption(OptionValue[] option) {
        this.option = option;
    }

    public String getScaleDescendantsShares() {
        return scaleDescendantsShares;
    }

    public void setScaleDescendantsShares(final String scaleDescendantsShares) {
        this.scaleDescendantsShares = scaleDescendantsShares;
    }

}
