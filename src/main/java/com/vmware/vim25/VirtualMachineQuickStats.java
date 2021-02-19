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
 * A set of statistics that are typically updated with near real-time regularity.
 * This data object type does not support notification, for scalability reasons.
 * Therefore, changes in QuickStats do not generate property collector updates.
 * To monitor statistics values, use the statistics and alarms modules instead.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
public class VirtualMachineQuickStats extends DynamicData {

    private Integer overallCpuUsage;
    private Integer overallCpuDemand;
    private Integer overallCpuReadiness;
    private Integer guestMemoryUsage;
    private Integer hostMemoryUsage;
    private ManagedEntityStatus guestHeartbeatStatus;
    private Integer distributedCpuEntitlement;
    private Integer distributedMemoryEntitlement;
    private Integer staticCpuEntitlement;
    private Integer staticMemoryEntitlement;
    private Integer grantedMemory;
    private Integer privateMemory;
    private Integer sharedMemory;
    private Integer swappedMemory;
    private Integer balloonedMemory;
    private Integer consumedOverheadMemory;
    private Integer ftLogBandwidth;
    private Integer ftSecondaryLatency;
    private ManagedEntityStatus ftLatencyStatus;
    private Long compressedMemory;
    private Integer uptimeSeconds;
    private Long ssdSwappedMemory;

    @Override
    public String toString() {
        return "VirtualMachineQuickStats{" +
                "overallCpuUsage=" + overallCpuUsage +
                ", overallCpuDemand=" + overallCpuDemand +
                ", overallCpuReadiness=" + overallCpuReadiness +
                ", guestMemoryUsage=" + guestMemoryUsage +
                ", hostMemoryUsage=" + hostMemoryUsage +
                ", guestHeartbeatStatus=" + guestHeartbeatStatus +
                ", distributedCpuEntitlement=" + distributedCpuEntitlement +
                ", distributedMemoryEntitlement=" + distributedMemoryEntitlement +
                ", staticCpuEntitlement=" + staticCpuEntitlement +
                ", staticMemoryEntitlement=" + staticMemoryEntitlement +
                ", grantedMemory=" + grantedMemory +
                ", privateMemory=" + privateMemory +
                ", sharedMemory=" + sharedMemory +
                ", swappedMemory=" + swappedMemory +
                ", balloonedMemory=" + balloonedMemory +
                ", consumedOverheadMemory=" + consumedOverheadMemory +
                ", ftLogBandwidth=" + ftLogBandwidth +
                ", ftSecondaryLatency=" + ftSecondaryLatency +
                ", ftLatencyStatus=" + ftLatencyStatus +
                ", compressedMemory=" + compressedMemory +
                ", uptimeSeconds=" + uptimeSeconds +
                ", ssdSwappedMemory=" + ssdSwappedMemory +
                "} " + super.toString();
    }

    public Integer getOverallCpuUsage() {
        return this.overallCpuUsage;
    }

    public void setOverallCpuUsage(Integer overallCpuUsage) {
        this.overallCpuUsage = overallCpuUsage;
    }

    public Integer getOverallCpuDemand() {
        return this.overallCpuDemand;
    }

    public void setOverallCpuDemand(Integer overallCpuDemand) {
        this.overallCpuDemand = overallCpuDemand;
    }

    public Integer getGuestMemoryUsage() {
        return this.guestMemoryUsage;
    }

    public void setGuestMemoryUsage(Integer guestMemoryUsage) {
        this.guestMemoryUsage = guestMemoryUsage;
    }

    public Integer getHostMemoryUsage() {
        return this.hostMemoryUsage;
    }

    public void setHostMemoryUsage(Integer hostMemoryUsage) {
        this.hostMemoryUsage = hostMemoryUsage;
    }

    public ManagedEntityStatus getGuestHeartbeatStatus() {
        return this.guestHeartbeatStatus;
    }

    public void setGuestHeartbeatStatus(ManagedEntityStatus guestHeartbeatStatus) {
        this.guestHeartbeatStatus = guestHeartbeatStatus;
    }

    public Integer getDistributedCpuEntitlement() {
        return this.distributedCpuEntitlement;
    }

    public void setDistributedCpuEntitlement(Integer distributedCpuEntitlement) {
        this.distributedCpuEntitlement = distributedCpuEntitlement;
    }

    public Integer getDistributedMemoryEntitlement() {
        return this.distributedMemoryEntitlement;
    }

    public void setDistributedMemoryEntitlement(Integer distributedMemoryEntitlement) {
        this.distributedMemoryEntitlement = distributedMemoryEntitlement;
    }

    public Integer getStaticCpuEntitlement() {
        return this.staticCpuEntitlement;
    }

    public void setStaticCpuEntitlement(Integer staticCpuEntitlement) {
        this.staticCpuEntitlement = staticCpuEntitlement;
    }

    public Integer getStaticMemoryEntitlement() {
        return this.staticMemoryEntitlement;
    }

    public void setStaticMemoryEntitlement(Integer staticMemoryEntitlement) {
        this.staticMemoryEntitlement = staticMemoryEntitlement;
    }

    public Integer getPrivateMemory() {
        return this.privateMemory;
    }

    public void setPrivateMemory(Integer privateMemory) {
        this.privateMemory = privateMemory;
    }

    public Integer getSharedMemory() {
        return this.sharedMemory;
    }

    public void setSharedMemory(Integer sharedMemory) {
        this.sharedMemory = sharedMemory;
    }

    public Integer getSwappedMemory() {
        return this.swappedMemory;
    }

    public void setSwappedMemory(Integer swappedMemory) {
        this.swappedMemory = swappedMemory;
    }

    public Integer getBalloonedMemory() {
        return this.balloonedMemory;
    }

    public void setBalloonedMemory(Integer balloonedMemory) {
        this.balloonedMemory = balloonedMemory;
    }

    public Integer getConsumedOverheadMemory() {
        return this.consumedOverheadMemory;
    }

    public void setConsumedOverheadMemory(Integer consumedOverheadMemory) {
        this.consumedOverheadMemory = consumedOverheadMemory;
    }

    public Integer getFtLogBandwidth() {
        return this.ftLogBandwidth;
    }

    public void setFtLogBandwidth(Integer ftLogBandwidth) {
        this.ftLogBandwidth = ftLogBandwidth;
    }

    public Integer getFtSecondaryLatency() {
        return this.ftSecondaryLatency;
    }

    public void setFtSecondaryLatency(Integer ftSecondaryLatency) {
        this.ftSecondaryLatency = ftSecondaryLatency;
    }

    public ManagedEntityStatus getFtLatencyStatus() {
        return this.ftLatencyStatus;
    }

    public void setFtLatencyStatus(ManagedEntityStatus ftLatencyStatus) {
        this.ftLatencyStatus = ftLatencyStatus;
    }

    public Long getCompressedMemory() {
        return this.compressedMemory;
    }

    public void setCompressedMemory(Long compressedMemory) {
        this.compressedMemory = compressedMemory;
    }

    public Integer getUptimeSeconds() {
        return this.uptimeSeconds;
    }

    public void setUptimeSeconds(Integer uptimeSeconds) {
        this.uptimeSeconds = uptimeSeconds;
    }

    public Long getSsdSwappedMemory() {
        return this.ssdSwappedMemory;
    }

    public void setSsdSwappedMemory(Long ssdSwappedMemory) {
        this.ssdSwappedMemory = ssdSwappedMemory;
    }

    public Integer getOverallCpuReadiness() {
        return overallCpuReadiness;
    }

    public void setOverallCpuReadiness(final Integer overallCpuReadiness) {
        this.overallCpuReadiness = overallCpuReadiness;
    }

    public Integer getGrantedMemory() {
        return grantedMemory;
    }

    public void setGrantedMemory(final Integer grantedMemory) {
        this.grantedMemory = grantedMemory;
    }

}
