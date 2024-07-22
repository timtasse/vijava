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
import java.util.List;

/**
 * The RuntimeInfo data object type provides information about the execution state and history of a virtual machine.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualMachineRuntimeInfo extends DynamicData {

    private List<VirtualMachineDeviceRuntimeInfo> device;
    private ManagedObjectReference host;
    private VirtualMachineConnectionState connectionState;
    private VirtualMachinePowerState powerState;
    private Boolean vmFailoverInProgress;
    private VirtualMachineFaultToleranceState faultToleranceState;
    private VirtualMachineRuntimeInfoDasProtectionState dasVmProtection;
    private boolean toolsInstallerMounted;
    private Calendar suspendTime;
    private Calendar bootTime;
    private Long suspendInterval;
    private VirtualMachineQuestionInfo question;
    /**
     * @deprecated As of vSphere API 4.1, use the PerformanceManager memory overhead counter to get this value.
     */
    @Deprecated
    private Long memoryOverhead;
    private Integer maxCpuUsage;
    private Integer maxMemoryUsage;
    private int numMksConnections;
    /**
     * @deprecated as of vSphere API 6.0
     */
    @Deprecated
    private VirtualMachineRecordReplayState recordReplayState;
    private Boolean cleanPowerOff;
    private String needSecondaryReason;
    private Boolean onlineStandby;
    private String minRequiredEVCModeKey;
    private Boolean consolidationNeeded;
    private List<VirtualMachineFeatureRequirement> offlineFeatureRequirement;
    private List<VirtualMachineFeatureRequirement> featureRequirement;
    private List<HostFeatureMask> featureMask;
    /**
     * @deprecated since vSphere 7.0 because vFlash Read Cache end of availability.
     */
    @Deprecated
    private Long vFlashCacheAllocation;
    private Boolean paused;
    private Boolean snapshotInBackground;
    private Boolean quiescedForkParent;
    private Boolean instantCloneFrozen;
    private VirtualMachineCryptoState cryptoState;
    private Boolean suspendedToMemory;
    private Long opNotificationTimeout;

    @Override
    public String toString() {
        return "VirtualMachineRuntimeInfo{" +
                "device=" + device +
                ", host=" + host +
                ", connectionState=" + connectionState +
                ", powerState=" + powerState +
                ", vmFailoverInProgress=" + vmFailoverInProgress +
                ", faultToleranceState=" + faultToleranceState +
                ", dasVmProtection=" + dasVmProtection +
                ", toolsInstallerMounted=" + toolsInstallerMounted +
                ", suspendTime=" + suspendTime +
                ", bootTime=" + bootTime +
                ", suspendInterval=" + suspendInterval +
                ", question=" + question +
                ", memoryOverhead=" + memoryOverhead +
                ", maxCpuUsage=" + maxCpuUsage +
                ", maxMemoryUsage=" + maxMemoryUsage +
                ", numMksConnections=" + numMksConnections +
                ", recordReplayState=" + recordReplayState +
                ", cleanPowerOff=" + cleanPowerOff +
                ", needSecondaryReason='" + needSecondaryReason + '\'' +
                ", onlineStandby=" + onlineStandby +
                ", minRequiredEVCModeKey='" + minRequiredEVCModeKey + '\'' +
                ", consolidationNeeded=" + consolidationNeeded +
                ", offlineFeatureRequirement=" + offlineFeatureRequirement +
                ", featureRequirement=" + featureRequirement +
                ", featureMask=" + featureMask +
                ", vFlashCacheAllocation=" + vFlashCacheAllocation +
                ", paused=" + paused +
                ", snapshotInBackground=" + snapshotInBackground +
                ", quiescedForkParent=" + quiescedForkParent +
                ", instantCloneFrozen=" + instantCloneFrozen +
                ", cryptoState=" + cryptoState +
                ", suspendedToMemory=" + suspendedToMemory +
                ", opNotificationTimeout=" + opNotificationTimeout +
                '}';
    }

    public List<VirtualMachineDeviceRuntimeInfo> getDevice() {
        return device;
    }

    public void setDevice(final List<VirtualMachineDeviceRuntimeInfo> device) {
        this.device = device;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public VirtualMachineConnectionState getConnectionState() {
        return connectionState;
    }

    public void setConnectionState(final VirtualMachineConnectionState connectionState) {
        this.connectionState = connectionState;
    }

    public VirtualMachinePowerState getPowerState() {
        return powerState;
    }

    public void setPowerState(final VirtualMachinePowerState powerState) {
        this.powerState = powerState;
    }

    public Boolean getVmFailoverInProgress() {
        return vmFailoverInProgress;
    }

    public void setVmFailoverInProgress(final Boolean vmFailoverInProgress) {
        this.vmFailoverInProgress = vmFailoverInProgress;
    }

    public VirtualMachineFaultToleranceState getFaultToleranceState() {
        return faultToleranceState;
    }

    public void setFaultToleranceState(final VirtualMachineFaultToleranceState faultToleranceState) {
        this.faultToleranceState = faultToleranceState;
    }

    public VirtualMachineRuntimeInfoDasProtectionState getDasVmProtection() {
        return dasVmProtection;
    }

    public void setDasVmProtection(final VirtualMachineRuntimeInfoDasProtectionState dasVmProtection) {
        this.dasVmProtection = dasVmProtection;
    }

    public boolean isToolsInstallerMounted() {
        return toolsInstallerMounted;
    }

    public void setToolsInstallerMounted(final boolean toolsInstallerMounted) {
        this.toolsInstallerMounted = toolsInstallerMounted;
    }

    public Calendar getSuspendTime() {
        return suspendTime;
    }

    public void setSuspendTime(final Calendar suspendTime) {
        this.suspendTime = suspendTime;
    }

    public Calendar getBootTime() {
        return bootTime;
    }

    public void setBootTime(final Calendar bootTime) {
        this.bootTime = bootTime;
    }

    public Long getSuspendInterval() {
        return suspendInterval;
    }

    public void setSuspendInterval(final Long suspendInterval) {
        this.suspendInterval = suspendInterval;
    }

    public VirtualMachineQuestionInfo getQuestion() {
        return question;
    }

    public void setQuestion(final VirtualMachineQuestionInfo question) {
        this.question = question;
    }

    public Long getMemoryOverhead() {
        return memoryOverhead;
    }

    public void setMemoryOverhead(final Long memoryOverhead) {
        this.memoryOverhead = memoryOverhead;
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

    public int getNumMksConnections() {
        return numMksConnections;
    }

    public void setNumMksConnections(final int numMksConnections) {
        this.numMksConnections = numMksConnections;
    }

    public VirtualMachineRecordReplayState getRecordReplayState() {
        return recordReplayState;
    }

    public void setRecordReplayState(final VirtualMachineRecordReplayState recordReplayState) {
        this.recordReplayState = recordReplayState;
    }

    public Boolean getCleanPowerOff() {
        return cleanPowerOff;
    }

    public void setCleanPowerOff(final Boolean cleanPowerOff) {
        this.cleanPowerOff = cleanPowerOff;
    }

    public String getNeedSecondaryReason() {
        return needSecondaryReason;
    }

    public void setNeedSecondaryReason(final String needSecondaryReason) {
        this.needSecondaryReason = needSecondaryReason;
    }

    public Boolean getOnlineStandby() {
        return onlineStandby;
    }

    public void setOnlineStandby(final Boolean onlineStandby) {
        this.onlineStandby = onlineStandby;
    }

    public String getMinRequiredEVCModeKey() {
        return minRequiredEVCModeKey;
    }

    public void setMinRequiredEVCModeKey(final String minRequiredEVCModeKey) {
        this.minRequiredEVCModeKey = minRequiredEVCModeKey;
    }

    public Boolean getConsolidationNeeded() {
        return consolidationNeeded;
    }

    public void setConsolidationNeeded(final Boolean consolidationNeeded) {
        this.consolidationNeeded = consolidationNeeded;
    }

    public List<VirtualMachineFeatureRequirement> getOfflineFeatureRequirement() {
        return offlineFeatureRequirement;
    }

    public void setOfflineFeatureRequirement(final List<VirtualMachineFeatureRequirement> offlineFeatureRequirement) {
        this.offlineFeatureRequirement = offlineFeatureRequirement;
    }

    public List<VirtualMachineFeatureRequirement> getFeatureRequirement() {
        return featureRequirement;
    }

    public void setFeatureRequirement(final List<VirtualMachineFeatureRequirement> featureRequirement) {
        this.featureRequirement = featureRequirement;
    }

    public List<HostFeatureMask> getFeatureMask() {
        return featureMask;
    }

    public void setFeatureMask(final List<HostFeatureMask> featureMask) {
        this.featureMask = featureMask;
    }

    public Long getvFlashCacheAllocation() {
        return vFlashCacheAllocation;
    }

    public void setvFlashCacheAllocation(final Long vFlashCacheAllocation) {
        this.vFlashCacheAllocation = vFlashCacheAllocation;
    }

    public Boolean getPaused() {
        return paused;
    }

    public void setPaused(final Boolean paused) {
        this.paused = paused;
    }

    public Boolean getSnapshotInBackground() {
        return snapshotInBackground;
    }

    public void setSnapshotInBackground(final Boolean snapshotInBackground) {
        this.snapshotInBackground = snapshotInBackground;
    }

    public Boolean getQuiescedForkParent() {
        return quiescedForkParent;
    }

    public void setQuiescedForkParent(final Boolean quiescedForkParent) {
        this.quiescedForkParent = quiescedForkParent;
    }

    public Boolean getInstantCloneFrozen() {
        return instantCloneFrozen;
    }

    public void setInstantCloneFrozen(final Boolean instantCloneFrozen) {
        this.instantCloneFrozen = instantCloneFrozen;
    }

    public VirtualMachineCryptoState getCryptoState() {
        return cryptoState;
    }

    public void setCryptoState(final VirtualMachineCryptoState cryptoState) {
        this.cryptoState = cryptoState;
    }

    public Boolean getSuspendedToMemory() {
        return suspendedToMemory;
    }

    public void setSuspendedToMemory(final Boolean suspendedToMemory) {
        this.suspendedToMemory = suspendedToMemory;
    }

    public Long getOpNotificationTimeout() {
        return opNotificationTimeout;
    }

    public void setOpNotificationTimeout(final Long opNotificationTimeout) {
        this.opNotificationTimeout = opNotificationTimeout;
    }

}
