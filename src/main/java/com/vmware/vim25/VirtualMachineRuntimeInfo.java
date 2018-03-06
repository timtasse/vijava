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

import java.util.Calendar;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.5
 */

@SuppressWarnings("all")
public class VirtualMachineRuntimeInfo extends DynamicData {

    public VirtualMachineDeviceRuntimeInfo[] device;
    public ManagedObjectReference host;
    public VirtualMachineConnectionState connectionState;
    public VirtualMachinePowerState powerState;
    public VirtualMachineFaultToleranceState faultToleranceState;
    public VirtualMachineRuntimeInfoDasProtectionState dasVmProtection;
    public boolean toolsInstallerMounted;
    public Calendar suspendTime;
    public Calendar bootTime;
    public Long suspendInterval;
    public VirtualMachineQuestionInfo question;
    @Deprecated
    public Long memoryOverhead;
    public Integer maxCpuUsage;
    public Integer maxMemoryUsage;
    public int numMksConnections;
    @Deprecated
    public VirtualMachineRecordReplayState recordReplayState;
    public Boolean cleanPowerOff;
    public Boolean paused;
    public Boolean quiescedForkParent;
    public String needSecondaryReason;
    public boolean onlineStandby;
    public String minRequiredEVCModeKey;
    public boolean consolidationNeeded;
    public VirtualMachineFeatureRequirement[] offlineFeatureRequirement;
    public VirtualMachineFeatureRequirement[] featureRequirement;
    public HostFeatureMask[] featureMask;
    public Long vFlashCacheAllocation;
    public Boolean snapshotInBackground;

    public VirtualMachineDeviceRuntimeInfo[] getDevice() {
        return this.device;
    }

    public void setDevice(VirtualMachineDeviceRuntimeInfo[] device) {
        this.device = device;
    }

    public ManagedObjectReference getHost() {
        return this.host;
    }

    public void setHost(ManagedObjectReference host) {
        this.host = host;
    }

    public VirtualMachineConnectionState getConnectionState() {
        return this.connectionState;
    }

    public void setConnectionState(VirtualMachineConnectionState connectionState) {
        this.connectionState = connectionState;
    }

    public VirtualMachinePowerState getPowerState() {
        return this.powerState;
    }

    public void setPowerState(VirtualMachinePowerState powerState) {
        this.powerState = powerState;
    }

    public VirtualMachineFaultToleranceState getFaultToleranceState() {
        return this.faultToleranceState;
    }

    public void setFaultToleranceState(VirtualMachineFaultToleranceState faultToleranceState) {
        this.faultToleranceState = faultToleranceState;
    }

    public VirtualMachineRuntimeInfoDasProtectionState getDasVmProtection() {
        return this.dasVmProtection;
    }

    public void setDasVmProtection(VirtualMachineRuntimeInfoDasProtectionState dasVmProtection) {
        this.dasVmProtection = dasVmProtection;
    }

    public boolean isToolsInstallerMounted() {
        return this.toolsInstallerMounted;
    }

    public void setToolsInstallerMounted(boolean toolsInstallerMounted) {
        this.toolsInstallerMounted = toolsInstallerMounted;
    }

    public Calendar getSuspendTime() {
        return this.suspendTime;
    }

    public void setSuspendTime(Calendar suspendTime) {
        this.suspendTime = suspendTime;
    }

    public Calendar getBootTime() {
        return this.bootTime;
    }

    public void setBootTime(Calendar bootTime) {
        this.bootTime = bootTime;
    }

    public long getSuspendInterval() {
        return this.suspendInterval;
    }

    public void setSuspendInterval(long suspendInterval) {
        this.suspendInterval = suspendInterval;
    }

    public VirtualMachineQuestionInfo getQuestion() {
        return this.question;
    }

    public void setQuestion(VirtualMachineQuestionInfo question) {
        this.question = question;
    }

    @Deprecated
    public long getMemoryOverhead() {
        return this.memoryOverhead;
    }

    @Deprecated
    public void setMemoryOverhead(long memoryOverhead) {
        this.memoryOverhead = memoryOverhead;
    }

    public int getMaxCpuUsage() {
        return this.maxCpuUsage;
    }

    public void setMaxCpuUsage(int maxCpuUsage) {
        this.maxCpuUsage = maxCpuUsage;
    }

    public int getMaxMemoryUsage() {
        return this.maxMemoryUsage;
    }

    public void setMaxMemoryUsage(int maxMemoryUsage) {
        this.maxMemoryUsage = maxMemoryUsage;
    }

    public int getNumMksConnections() {
        return this.numMksConnections;
    }

    public void setNumMksConnections(int numMksConnections) {
        this.numMksConnections = numMksConnections;
    }

    @Deprecated
    public VirtualMachineRecordReplayState getRecordReplayState() {
        return this.recordReplayState;
    }

    @Deprecated
    public void setRecordReplayState(VirtualMachineRecordReplayState recordReplayState) {
        this.recordReplayState = recordReplayState;
    }

    public String getNeedSecondaryReason() {
        return this.needSecondaryReason;
    }

    public void setNeedSecondaryReason(String needSecondaryReason) {
        this.needSecondaryReason = needSecondaryReason;
    }

    public String getMinRequiredEVCModeKey() {
        return this.minRequiredEVCModeKey;
    }

    public void setMinRequiredEVCModeKey(String minRequiredEVCModeKey) {
        this.minRequiredEVCModeKey = minRequiredEVCModeKey;
    }

    public VirtualMachineFeatureRequirement[] getOfflineFeatureRequirement() {
        return this.offlineFeatureRequirement;
    }

    public void setOfflineFeatureRequirement(VirtualMachineFeatureRequirement[] offlineFeatureRequirement) {
        this.offlineFeatureRequirement = offlineFeatureRequirement;
    }

    public VirtualMachineFeatureRequirement[] getFeatureRequirement() {
        return this.featureRequirement;
    }

    public void setFeatureRequirement(VirtualMachineFeatureRequirement[] featureRequirement) {
        this.featureRequirement = featureRequirement;
    }

    public HostFeatureMask[] getFeatureMask() {
        return this.featureMask;
    }

    public void setFeatureMask(HostFeatureMask[] featureMask) {
        this.featureMask = featureMask;
    }

    public long getVFlashCacheAllocation() {
        return this.vFlashCacheAllocation;
    }

    public void setVFlashCacheAllocation(long vFlashCacheAllocation) {
        this.vFlashCacheAllocation = vFlashCacheAllocation;
    }

    public Boolean isCleanPowerOff() {
        return cleanPowerOff;
    }

    public void setCleanPowerOff(Boolean cleanPowerOff) {
        this.cleanPowerOff = cleanPowerOff;
    }

    public boolean isOnlineStandby() {
        return onlineStandby;
    }

    public void setOnlineStandby(boolean onlineStandby) {
        this.onlineStandby = onlineStandby;
    }

    public boolean isConsolidationNeeded() {
        return consolidationNeeded;
    }

    public void setConsolidationNeeded(boolean consolidationNeeded) {
        this.consolidationNeeded = consolidationNeeded;
    }

    public long getvFlashCacheAllocation() {
        return vFlashCacheAllocation;
    }

    public void setvFlashCacheAllocation(final long vFlashCacheAllocation) {
        this.vFlashCacheAllocation = vFlashCacheAllocation;
    }

    public boolean isSnapshotInBackground() {
        return snapshotInBackground;
    }

    public void setSnapshotInBackground(final boolean snapshotInBackground) {
        this.snapshotInBackground = snapshotInBackground;
    }

    public Boolean getPaused() {
        return paused;
    }

    public void setPaused(final Boolean paused) {
        this.paused = paused;
    }

    public Boolean getQuiescedForkParent() {
        return quiescedForkParent;
    }

    public void setQuiescedForkParent(final Boolean quiescedForkParent) {
        this.quiescedForkParent = quiescedForkParent;
    }
}