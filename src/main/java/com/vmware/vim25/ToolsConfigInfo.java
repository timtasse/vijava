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
 * ToolsConfigInfo is a data object type containing settings for the VMware Tools software running in the guest operating system.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.1
 */
public class ToolsConfigInfo extends DynamicData {

    private Integer toolsVersion;
    private String toolsInstallType;
    private Boolean afterPowerOn;
    private Boolean afterResume;
    private Boolean beforeGuestStandby;
    private Boolean beforeGuestShutdown;
    private Boolean beforeGuestReboot;
    private String toolsUpgradePolicy;
    private String pendingCustomization;
    private CryptoKeyId customizationKeyId;
    private Boolean syncTimeWithHostAllowed;
    private Boolean syncTimeWithHost;
    private ToolsConfigInfoToolsLastInstallInfo lastInstallInfo;

    @Override
    public String toString() {
        return "ToolsConfigInfo{" +
                "toolsVersion=" + toolsVersion +
                ", toolsInstallType='" + toolsInstallType + '\'' +
                ", afterPowerOn=" + afterPowerOn +
                ", afterResume=" + afterResume +
                ", beforeGuestStandby=" + beforeGuestStandby +
                ", beforeGuestShutdown=" + beforeGuestShutdown +
                ", beforeGuestReboot=" + beforeGuestReboot +
                ", toolsUpgradePolicy='" + toolsUpgradePolicy + '\'' +
                ", pendingCustomization='" + pendingCustomization + '\'' +
                ", customizationKeyId=" + customizationKeyId +
                ", syncTimeWithHostAllowed=" + syncTimeWithHostAllowed +
                ", syncTimeWithHost=" + syncTimeWithHost +
                ", lastInstallInfo=" + lastInstallInfo +
                "} " + super.toString();
    }

    public Integer getToolsVersion() {
        return toolsVersion;
    }

    public void setToolsVersion(final Integer toolsVersion) {
        this.toolsVersion = toolsVersion;
    }

    public String getToolsInstallType() {
        return toolsInstallType;
    }

    public void setToolsInstallType(final String toolsInstallType) {
        this.toolsInstallType = toolsInstallType;
    }

    public Boolean getAfterPowerOn() {
        return afterPowerOn;
    }

    public void setAfterPowerOn(final Boolean afterPowerOn) {
        this.afterPowerOn = afterPowerOn;
    }

    public Boolean getAfterResume() {
        return afterResume;
    }

    public void setAfterResume(final Boolean afterResume) {
        this.afterResume = afterResume;
    }

    public Boolean getBeforeGuestStandby() {
        return beforeGuestStandby;
    }

    public void setBeforeGuestStandby(final Boolean beforeGuestStandby) {
        this.beforeGuestStandby = beforeGuestStandby;
    }

    public Boolean getBeforeGuestShutdown() {
        return beforeGuestShutdown;
    }

    public void setBeforeGuestShutdown(final Boolean beforeGuestShutdown) {
        this.beforeGuestShutdown = beforeGuestShutdown;
    }

    public Boolean getBeforeGuestReboot() {
        return beforeGuestReboot;
    }

    public void setBeforeGuestReboot(final Boolean beforeGuestReboot) {
        this.beforeGuestReboot = beforeGuestReboot;
    }

    public String getToolsUpgradePolicy() {
        return toolsUpgradePolicy;
    }

    public void setToolsUpgradePolicy(final String toolsUpgradePolicy) {
        this.toolsUpgradePolicy = toolsUpgradePolicy;
    }

    public String getPendingCustomization() {
        return pendingCustomization;
    }

    public void setPendingCustomization(final String pendingCustomization) {
        this.pendingCustomization = pendingCustomization;
    }

    public CryptoKeyId getCustomizationKeyId() {
        return customizationKeyId;
    }

    public void setCustomizationKeyId(final CryptoKeyId customizationKeyId) {
        this.customizationKeyId = customizationKeyId;
    }

    public Boolean getSyncTimeWithHostAllowed() {
        return syncTimeWithHostAllowed;
    }

    public void setSyncTimeWithHostAllowed(final Boolean syncTimeWithHostAllowed) {
        this.syncTimeWithHostAllowed = syncTimeWithHostAllowed;
    }

    public Boolean getSyncTimeWithHost() {
        return syncTimeWithHost;
    }

    public void setSyncTimeWithHost(final Boolean syncTimeWithHost) {
        this.syncTimeWithHost = syncTimeWithHost;
    }

    public ToolsConfigInfoToolsLastInstallInfo getLastInstallInfo() {
        return lastInstallInfo;
    }

    public void setLastInstallInfo(final ToolsConfigInfoToolsLastInstallInfo lastInstallInfo) {
        this.lastInstallInfo = lastInstallInfo;
    }

}
