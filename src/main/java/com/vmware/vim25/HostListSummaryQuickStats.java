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
 * Included in the host statistics are fairness scores. Fairness scores are represented in units with relative values,
 * meaning they are evaluated relative to the scores of other hosts.
 * They should not be thought of as having any particular absolute value. Each fairness unit represents an increment of 0.001 in a fairness score.
 * The further the fairness score diverges from 1, the less fair the allocation.
 * Therefore, a fairness score of 990, representing 0.990, is more fair than a fairness score of 1015, which represents 1.015.
 * This is because 1.015 is further from 1 than 0.990.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */

@SuppressWarnings("all")
public class HostListSummaryQuickStats extends DynamicData {

    private Integer availablePMemCapacity;
    private Integer distributedCpuFairness;
    private Integer distributedMemoryFairness;
    private Integer overallCpuUsage;
    private Integer overallMemoryUsage;
    private Integer uptime;

    @Override
    public String toString() {
        return "HostListSummaryQuickStats{" +
                "availablePMemCapacity=" + availablePMemCapacity +
                ", distributedCpuFairness=" + distributedCpuFairness +
                ", distributedMemoryFairness=" + distributedMemoryFairness +
                ", overallCpuUsage=" + overallCpuUsage +
                ", overallMemoryUsage=" + overallMemoryUsage +
                ", uptime=" + uptime +
                "} " + super.toString();
    }

    public Integer getOverallCpuUsage() {
        return this.overallCpuUsage;
    }

    public void setOverallCpuUsage(Integer overallCpuUsage) {
        this.overallCpuUsage = overallCpuUsage;
    }

    public Integer getOverallMemoryUsage() {
        return this.overallMemoryUsage;
    }

    public void setOverallMemoryUsage(Integer overallMemoryUsage) {
        this.overallMemoryUsage = overallMemoryUsage;
    }

    public Integer getDistributedCpuFairness() {
        return this.distributedCpuFairness;
    }

    public void setDistributedCpuFairness(Integer distributedCpuFairness) {
        this.distributedCpuFairness = distributedCpuFairness;
    }

    public Integer getDistributedMemoryFairness() {
        return this.distributedMemoryFairness;
    }

    public void setDistributedMemoryFairness(Integer distributedMemoryFairness) {
        this.distributedMemoryFairness = distributedMemoryFairness;
    }

    public Integer getUptime() {
        return this.uptime;
    }

    public void setUptime(Integer uptime) {
        this.uptime = uptime;
    }

    public Integer getAvailablePMemCapacity() {
        return availablePMemCapacity;
    }

    public void setAvailablePMemCapacity(final Integer availablePMemCapacity) {
        this.availablePMemCapacity = availablePMemCapacity;
    }

}
