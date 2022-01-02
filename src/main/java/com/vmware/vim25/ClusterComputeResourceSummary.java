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
import java.util.List;

/**
 * The ClusterComputeResourceSummary data object encapsulates runtime properties of a ClusterComputeResource.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.1.1
 */
public class ClusterComputeResourceSummary extends ComputeResourceSummary {

    @Deprecated
    private int currentFailoverLevel;
    private ClusterDasAdmissionControlInfo admissionControlInfo;
    private int numVmotions;
    private Integer targetBalance;
    private Integer currentBalance;
    private Integer drsScore;
    private int[] numVmsPerDrsScoreBucket;
    private ClusterUsageSummary usageSummary;
    private String currentEVCModeKey;
    private String currentEVCGraphicsModeKey;
    private ClusterDasData dasData;
    private String clusterMaintenanceModeStatus;
    private ClusterComputeResourceVcsHealthStatus vcsHealthStatus;
    private ClusterComputeResourceVcsSlots[] vcsSlots;

    @Override
    public String toString() {
        return "ClusterComputeResourceSummary{" +
                "currentFailoverLevel=" + currentFailoverLevel +
                ", admissionControlInfo=" + admissionControlInfo +
                ", numVmotions=" + numVmotions +
                ", targetBalance=" + targetBalance +
                ", currentBalance=" + currentBalance +
                ", drsScore=" + drsScore +
                ", numVmsPerDrsScoreBucket=" + Arrays.toString(numVmsPerDrsScoreBucket) +
                ", usageSummary=" + usageSummary +
                ", currentEVCModeKey='" + currentEVCModeKey + '\'' +
                ", currentEVCGraphicsModeKey='" + currentEVCGraphicsModeKey + '\'' +
                ", dasData=" + dasData +
                ", clusterMaintenanceModeStatus='" + clusterMaintenanceModeStatus + '\'' +
                ", vcsHealthStatus=" + vcsHealthStatus +
                ", vcsSlots=" + Arrays.toString(vcsSlots) +
                "} " + super.toString();
    }

    @Deprecated
    public int getCurrentFailoverLevel() {
        return this.currentFailoverLevel;
    }

    public ClusterDasAdmissionControlInfo getAdmissionControlInfo() {
        return this.admissionControlInfo;
    }

    public int getNumVmotions() {
        return this.numVmotions;
    }

    public Integer getTargetBalance() {
        return this.targetBalance;
    }

    public Integer getCurrentBalance() {
        return this.currentBalance;
    }

    public String getCurrentEVCModeKey() {
        return this.currentEVCModeKey;
    }

    public ClusterDasData getDasData() {
        return this.dasData;
    }

    @Deprecated
    public void setCurrentFailoverLevel(int currentFailoverLevel) {
        this.currentFailoverLevel = currentFailoverLevel;
    }

    public void setAdmissionControlInfo(final ClusterDasAdmissionControlInfo admissionControlInfo) {
        this.admissionControlInfo = admissionControlInfo;
    }

    public void setNumVmotions(final int numVmotions) {
        this.numVmotions = numVmotions;
    }

    public void setTargetBalance(final Integer targetBalance) {
        this.targetBalance = targetBalance;
    }

    public void setCurrentBalance(final Integer currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setCurrentEVCModeKey(final String currentEVCModeKey) {
        this.currentEVCModeKey = currentEVCModeKey;
    }

    public void setDasData(final ClusterDasData dasData) {
        this.dasData = dasData;
    }

    public ClusterUsageSummary getUsageSummary() {
        return usageSummary;
    }

    public void setUsageSummary(final ClusterUsageSummary usageSummary) {
        this.usageSummary = usageSummary;
    }

    public Integer getDrsScore() {
        return drsScore;
    }

    public void setDrsScore(final Integer drsScore) {
        this.drsScore = drsScore;
    }

    public int[] getNumVmsPerDrsScoreBucket() {
        return numVmsPerDrsScoreBucket;
    }

    public void setNumVmsPerDrsScoreBucket(final int[] numVmsPerDrsScoreBucket) {
        this.numVmsPerDrsScoreBucket = numVmsPerDrsScoreBucket;
    }

    public String getCurrentEVCGraphicsModeKey() {
        return currentEVCGraphicsModeKey;
    }

    public void setCurrentEVCGraphicsModeKey(final String currentEVCGraphicsModeKey) {
        this.currentEVCGraphicsModeKey = currentEVCGraphicsModeKey;
    }

    public String getClusterMaintenanceModeStatus() {
        return clusterMaintenanceModeStatus;
    }

    public void setClusterMaintenanceModeStatus(final String clusterMaintenanceModeStatus) {
        this.clusterMaintenanceModeStatus = clusterMaintenanceModeStatus;
    }

    public ClusterComputeResourceVcsHealthStatus getVcsHealthStatus() {
        return vcsHealthStatus;
    }

    public void setVcsHealthStatus(final ClusterComputeResourceVcsHealthStatus vcsHealthStatus) {
        this.vcsHealthStatus = vcsHealthStatus;
    }

    public List<ClusterComputeResourceVcsSlots> getVcsSlots() {
        return Arrays.asList(vcsSlots);
    }

    public void setVcsSlots(final List<ClusterComputeResourceVcsSlots> vcsSlots) {
        this.vcsSlots = vcsSlots.toArray(new ClusterComputeResourceVcsSlots[0]);
    }

}
