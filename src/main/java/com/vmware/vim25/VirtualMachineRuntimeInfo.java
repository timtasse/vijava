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
import java.util.Calendar;

/**
 * The RuntimeInfo data object type provides information about the execution state and history of a virtual machine.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2
 */
@SuppressWarnings("unused")
public class VirtualMachineRuntimeInfo extends DynamicData {

    private Calendar bootTime;
    private Boolean cleanPowerOff;
    private VirtualMachineConnectionState connectionState;
    private boolean consolidationNeeded;
    private String cryptoState;
    private VirtualMachineRuntimeInfoDasProtectionState dasVmProtection;
    private VirtualMachineDeviceRuntimeInfo[] device;
    private VirtualMachineFaultToleranceState faultToleranceState;
    private HostFeatureMask[] featureMask;
    private VirtualMachineFeatureRequirement[] featureRequirement;
    private ManagedObjectReference host;
    private Boolean instantCloneFrozen;
    private Integer maxCpuUsage;
    private Integer maxMemoryUsage;
    @Deprecated
    private Long memoryOverhead;
    private String minRequiredEVCModeKey;
    private String needSecondaryReason;
    private int numMksConnections;
    private VirtualMachineFeatureRequirement[] offlineFeatureRequirement;
    private boolean onlineStandby;
    private Boolean paused;
    private VirtualMachinePowerState powerState;
    private VirtualMachineQuestionInfo question;
    private Boolean quiescedForkParent;
    @Deprecated
    private VirtualMachineRecordReplayState recordReplayState;
    private Boolean snapshotInBackground;
    private Long suspendInterval;
    private Calendar suspendTime;
    private boolean toolsInstallerMounted;
    @Deprecated
    private Long vFlashCacheAllocation;
    private Boolean vmFailoverInProgress;
    private Boolean suspendedToMemory;

    @Override
    public String toString() {
        return "VirtualMachineRuntimeInfo{" +
                "bootTime=" + bootTime +
                ", cleanPowerOff=" + cleanPowerOff +
                ", connectionState=" + connectionState +
                ", consolidationNeeded=" + consolidationNeeded +
                ", cryptoState='" + cryptoState + '\'' +
                ", dasVmProtection=" + dasVmProtection +
                ", device=" + Arrays.toString(device) +
                ", faultToleranceState=" + faultToleranceState +
                ", featureMask=" + Arrays.toString(featureMask) +
                ", featureRequirement=" + Arrays.toString(featureRequirement) +
                ", host=" + host +
                ", instantCloneFrozen=" + instantCloneFrozen +
                ", maxCpuUsage=" + maxCpuUsage +
                ", maxMemoryUsage=" + maxMemoryUsage +
                ", memoryOverhead=" + memoryOverhead +
                ", minRequiredEVCModeKey='" + minRequiredEVCModeKey + '\'' +
                ", needSecondaryReason='" + needSecondaryReason + '\'' +
                ", numMksConnections=" + numMksConnections +
                ", offlineFeatureRequirement=" + Arrays.toString(offlineFeatureRequirement) +
                ", onlineStandby=" + onlineStandby +
                ", paused=" + paused +
                ", powerState=" + powerState +
                ", question=" + question +
                ", quiescedForkParent=" + quiescedForkParent +
                ", recordReplayState=" + recordReplayState +
                ", snapshotInBackground=" + snapshotInBackground +
                ", suspendInterval=" + suspendInterval +
                ", suspendTime=" + suspendTime +
                ", toolsInstallerMounted=" + toolsInstallerMounted +
                ", vFlashCacheAllocation=" + vFlashCacheAllocation +
                ", vmFailoverInProgress=" + vmFailoverInProgress +
                ", suspendedToMemory=" + suspendedToMemory +
                '}';
    }

    public Calendar getBootTime() {
        return bootTime;
    }

    public void setBootTime(final Calendar bootTime) {
        this.bootTime = bootTime;
    }

    public Boolean getCleanPowerOff() {
        return cleanPowerOff;
    }

    public void setCleanPowerOff(final Boolean cleanPowerOff) {
        this.cleanPowerOff = cleanPowerOff;
    }

    public VirtualMachineConnectionState getConnectionState() {
        return connectionState;
    }

    public void setConnectionState(final VirtualMachineConnectionState connectionState) {
        this.connectionState = connectionState;
    }

    public boolean isConsolidationNeeded() {
        return consolidationNeeded;
    }

    public void setConsolidationNeeded(final boolean consolidationNeeded) {
        this.consolidationNeeded = consolidationNeeded;
    }

    public String getCryptoState() {
        return cryptoState;
    }

    public void setCryptoState(final String cryptoState) {
        this.cryptoState = cryptoState;
    }

    public VirtualMachineRuntimeInfoDasProtectionState getDasVmProtection() {
        return dasVmProtection;
    }

    public void setDasVmProtection(final VirtualMachineRuntimeInfoDasProtectionState dasVmProtection) {
        this.dasVmProtection = dasVmProtection;
    }

    public VirtualMachineDeviceRuntimeInfo[] getDevice() {
        return device;
    }

    public void setDevice(final VirtualMachineDeviceRuntimeInfo[] device) {
        this.device = device;
    }

    public VirtualMachineFaultToleranceState getFaultToleranceState() {
        return faultToleranceState;
    }

    public void setFaultToleranceState(final VirtualMachineFaultToleranceState faultToleranceState) {
        this.faultToleranceState = faultToleranceState;
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

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public Boolean getInstantCloneFrozen() {
        return instantCloneFrozen;
    }

    public void setInstantCloneFrozen(final Boolean instantCloneFrozen) {
        this.instantCloneFrozen = instantCloneFrozen;
    }

    public Integer getMaxCpuUsage() {
        return maxCpuUsage;
    }

    public void setMaxCpuUsage(final Integer maxCpuUsage) {
        this.maxCpuUsage = maxCpuUsage;
    }

    public Integer getMaxMemoryUsage() {
        return maxMemoryUsage;
    }

    public void setMaxMemoryUsage(final Integer maxMemoryUsage) {
        this.maxMemoryUsage = maxMemoryUsage;
    }

    public Long getMemoryOverhead() {
        return memoryOverhead;
    }

    public void setMemoryOverhead(final Long memoryOverhead) {
        this.memoryOverhead = memoryOverhead;
    }

    public String getMinRequiredEVCModeKey() {
        return minRequiredEVCModeKey;
    }

    public void setMinRequiredEVCModeKey(final String minRequiredEVCModeKey) {
        this.minRequiredEVCModeKey = minRequiredEVCModeKey;
    }

    public String getNeedSecondaryReason() {
        return needSecondaryReason;
    }

    public void setNeedSecondaryReason(final String needSecondaryReason) {
        this.needSecondaryReason = needSecondaryReason;
    }

    public int getNumMksConnections() {
        return numMksConnections;
    }

    public void setNumMksConnections(final int numMksConnections) {
        this.numMksConnections = numMksConnections;
    }

    public VirtualMachineFeatureRequirement[] getOfflineFeatureRequirement() {
        return offlineFeatureRequirement;
    }

    public void setOfflineFeatureRequirement(final VirtualMachineFeatureRequirement[] offlineFeatureRequirement) {
        this.offlineFeatureRequirement = offlineFeatureRequirement;
    }

    public boolean isOnlineStandby() {
        return onlineStandby;
    }

    public void setOnlineStandby(final boolean onlineStandby) {
        this.onlineStandby = onlineStandby;
    }

    public Boolean getPaused() {
        return paused;
    }

    public void setPaused(final Boolean paused) {
        this.paused = paused;
    }

    public VirtualMachinePowerState getPowerState() {
        return powerState;
    }

    public void setPowerState(final VirtualMachinePowerState powerState) {
        this.powerState = powerState;
    }

    public VirtualMachineQuestionInfo getQuestion() {
        return question;
    }

    public void setQuestion(final VirtualMachineQuestionInfo question) {
        this.question = question;
    }

    public Boolean getQuiescedForkParent() {
        return quiescedForkParent;
    }

    public void setQuiescedForkParent(final Boolean quiescedForkParent) {
        this.quiescedForkParent = quiescedForkParent;
    }

    public VirtualMachineRecordReplayState getRecordReplayState() {
        return recordReplayState;
    }

    public void setRecordReplayState(final VirtualMachineRecordReplayState recordReplayState) {
        this.recordReplayState = recordReplayState;
    }

    public Boolean getSnapshotInBackground() {
        return snapshotInBackground;
    }

    public void setSnapshotInBackground(final Boolean snapshotInBackground) {
        this.snapshotInBackground = snapshotInBackground;
    }

    public Long getSuspendInterval() {
        return suspendInterval;
    }

    public void setSuspendInterval(final Long suspendInterval) {
        this.suspendInterval = suspendInterval;
    }

    public Calendar getSuspendTime() {
        return suspendTime;
    }

    public void setSuspendTime(final Calendar suspendTime) {
        this.suspendTime = suspendTime;
    }

    public boolean isToolsInstallerMounted() {
        return toolsInstallerMounted;
    }

    public void setToolsInstallerMounted(final boolean toolsInstallerMounted) {
        this.toolsInstallerMounted = toolsInstallerMounted;
    }

    public Long getvFlashCacheAllocation() {
        return vFlashCacheAllocation;
    }

    public void setvFlashCacheAllocation(final Long vFlashCacheAllocation) {
        this.vFlashCacheAllocation = vFlashCacheAllocation;
    }

    public Boolean getVmFailoverInProgress() {
        return vmFailoverInProgress;
    }

    public void setVmFailoverInProgress(final Boolean vmFailoverInProgress) {
        this.vmFailoverInProgress = vmFailoverInProgress;
    }

    public Boolean getSuspendedToMemory() {
        return suspendedToMemory;
    }

    public void setSuspendedToMemory(final Boolean suspendedToMemory) {
        this.suspendedToMemory = suspendedToMemory;
    }

}
