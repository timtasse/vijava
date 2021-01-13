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
 * The FlagInfo data object type encapsulates the flag settings for a virtual machine.
 * These properties are optional since the same structure is used to change the values during an edit or create operation.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.7
 */
@SuppressWarnings("all")
public class VirtualMachineFlagInfo extends DynamicData {

    private Boolean disableAcceleration;
    private Boolean enableLogging;
    private Boolean useToe;
    @Deprecated
    private Boolean runWithDebugInfo;
    private String monitorType;
    @Deprecated
    private String htSharing;
    @Deprecated
    private Boolean snapshotDisabled;
    private Boolean snapshotLocked;
    private Boolean diskUuidEnabled;
    private String virtualMmuUsage;
    private String virtualExecUsage;
    private String snapshotPowerOffBehavior;
    @Deprecated
    private Boolean recordReplayEnabled;
    private String faultToleranceType;
    private Boolean cbrcCacheEnabled;
    private Boolean vvtdEnabled;
    private Boolean vbsEnabled;

    @Override
    public String toString() {
        return "VirtualMachineFlagInfo{" +
                "cbrcCacheEnabled=" + cbrcCacheEnabled +
                ", disableAcceleration=" + disableAcceleration +
                ", diskUuidEnabled=" + diskUuidEnabled +
                ", enableLogging=" + enableLogging +
                ", faultToleranceType='" + faultToleranceType + '\'' +
                ", htSharing='" + htSharing + '\'' +
                ", monitorType='" + monitorType + '\'' +
                ", recordReplayEnabled=" + recordReplayEnabled +
                ", runWithDebugInfo=" + runWithDebugInfo +
                ", snapshotDisabled=" + snapshotDisabled +
                ", snapshotLocked=" + snapshotLocked +
                ", snapshotPowerOffBehavior='" + snapshotPowerOffBehavior + '\'' +
                ", useToe=" + useToe +
                ", vbsEnabled=" + vbsEnabled +
                ", virtualExecUsage='" + virtualExecUsage + '\'' +
                ", virtualMmuUsage='" + virtualMmuUsage + '\'' +
                ", vvtdEnabled=" + vvtdEnabled +
                "} " + super.toString();
    }

    public Boolean getCbrcCacheEnabled() {
        return cbrcCacheEnabled;
    }

    public void setCbrcCacheEnabled(final Boolean cbrcCacheEnabled) {
        this.cbrcCacheEnabled = cbrcCacheEnabled;
    }

    public Boolean getDisableAcceleration() {
        return disableAcceleration;
    }

    public void setDisableAcceleration(final Boolean disableAcceleration) {
        this.disableAcceleration = disableAcceleration;
    }

    public Boolean getDiskUuidEnabled() {
        return diskUuidEnabled;
    }

    public void setDiskUuidEnabled(final Boolean diskUuidEnabled) {
        this.diskUuidEnabled = diskUuidEnabled;
    }

    public Boolean getEnableLogging() {
        return enableLogging;
    }

    public void setEnableLogging(final Boolean enableLogging) {
        this.enableLogging = enableLogging;
    }

    public String getFaultToleranceType() {
        return faultToleranceType;
    }

    public void setFaultToleranceType(final String faultToleranceType) {
        this.faultToleranceType = faultToleranceType;
    }

    public String getHtSharing() {
        return htSharing;
    }

    public void setHtSharing(final String htSharing) {
        this.htSharing = htSharing;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(final String monitorType) {
        this.monitorType = monitorType;
    }

    public Boolean getRecordReplayEnabled() {
        return recordReplayEnabled;
    }

    public void setRecordReplayEnabled(final Boolean recordReplayEnabled) {
        this.recordReplayEnabled = recordReplayEnabled;
    }

    public Boolean getRunWithDebugInfo() {
        return runWithDebugInfo;
    }

    public void setRunWithDebugInfo(final Boolean runWithDebugInfo) {
        this.runWithDebugInfo = runWithDebugInfo;
    }

    public Boolean getSnapshotDisabled() {
        return snapshotDisabled;
    }

    public void setSnapshotDisabled(final Boolean snapshotDisabled) {
        this.snapshotDisabled = snapshotDisabled;
    }

    public Boolean getSnapshotLocked() {
        return snapshotLocked;
    }

    public void setSnapshotLocked(final Boolean snapshotLocked) {
        this.snapshotLocked = snapshotLocked;
    }

    public String getSnapshotPowerOffBehavior() {
        return snapshotPowerOffBehavior;
    }

    public void setSnapshotPowerOffBehavior(final String snapshotPowerOffBehavior) {
        this.snapshotPowerOffBehavior = snapshotPowerOffBehavior;
    }

    public Boolean getUseToe() {
        return useToe;
    }

    public void setUseToe(final Boolean useToe) {
        this.useToe = useToe;
    }

    public Boolean getVbsEnabled() {
        return vbsEnabled;
    }

    public void setVbsEnabled(final Boolean vbsEnabled) {
        this.vbsEnabled = vbsEnabled;
    }

    public String getVirtualExecUsage() {
        return virtualExecUsage;
    }

    public void setVirtualExecUsage(final String virtualExecUsage) {
        this.virtualExecUsage = virtualExecUsage;
    }

    public String getVirtualMmuUsage() {
        return virtualMmuUsage;
    }

    public void setVirtualMmuUsage(final String virtualMmuUsage) {
        this.virtualMmuUsage = virtualMmuUsage;
    }

    public Boolean getVvtdEnabled() {
        return vvtdEnabled;
    }

    public void setVvtdEnabled(final Boolean vvtdEnabled) {
        this.vvtdEnabled = vvtdEnabled;
    }

}
