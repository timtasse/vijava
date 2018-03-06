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
public class StorageDrsPodConfigInfo extends DynamicData {

    public boolean enabled;
    public boolean ioLoadBalanceEnabled;
    public String defaultVmBehavior;
    public int loadBalanceInterval;
    public Boolean defaultIntraVmAffinity;
    public StorageDrsSpaceLoadBalanceConfig spaceLoadBalanceConfig;
    public StorageDrsIoLoadBalanceConfig ioLoadBalanceConfig;
    public ClusterRuleInfo[] rule;
    public OptionValue[] option;
    public StorageDrsAutomationConfig automationOverrides;

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isIoLoadBalanceEnabled() {
        return this.ioLoadBalanceEnabled;
    }

    public void setIoLoadBalanceEnabled(boolean ioLoadBalanceEnabled) {
        this.ioLoadBalanceEnabled = ioLoadBalanceEnabled;
    }

    public String getDefaultVmBehavior() {
        return this.defaultVmBehavior;
    }

    public void setDefaultVmBehavior(String defaultVmBehavior) {
        this.defaultVmBehavior = defaultVmBehavior;
    }

    public int getLoadBalanceInterval() {
        return this.loadBalanceInterval;
    }

    public void setLoadBalanceInterval(int loadBalanceInterval) {
        this.loadBalanceInterval = loadBalanceInterval;
    }

    public StorageDrsSpaceLoadBalanceConfig getSpaceLoadBalanceConfig() {
        return this.spaceLoadBalanceConfig;
    }

    public void setSpaceLoadBalanceConfig(StorageDrsSpaceLoadBalanceConfig spaceLoadBalanceConfig) {
        this.spaceLoadBalanceConfig = spaceLoadBalanceConfig;
    }

    public StorageDrsIoLoadBalanceConfig getIoLoadBalanceConfig() {
        return this.ioLoadBalanceConfig;
    }

    public void setIoLoadBalanceConfig(StorageDrsIoLoadBalanceConfig ioLoadBalanceConfig) {
        this.ioLoadBalanceConfig = ioLoadBalanceConfig;
    }

    public ClusterRuleInfo[] getRule() {
        return this.rule;
    }

    public void setRule(ClusterRuleInfo[] rule) {
        this.rule = rule;
    }

    public OptionValue[] getOption() {
        return this.option;
    }

    public void setOption(OptionValue[] option) {
        this.option = option;
    }

    public Boolean isDefaultIntraVmAffinity() {
        return defaultIntraVmAffinity;
    }

    public void setDefaultIntraVmAffinity(Boolean defaultIntraVmAffinity) {
        this.defaultIntraVmAffinity = defaultIntraVmAffinity;
    }

    public StorageDrsAutomationConfig getAutomationOverrides() {
        return automationOverrides;
    }

    public void setAutomationOverrides(final StorageDrsAutomationConfig automationOverrides) {
        this.automationOverrides = automationOverrides;
    }
}