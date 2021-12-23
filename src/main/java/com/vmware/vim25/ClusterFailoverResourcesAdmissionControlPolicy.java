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
 * The ClusterFailoverResourcesAdmissionControlPolicy reserves a specified percentage of aggregate cluster resources for failover.
 * With the resources failover policy in place, vSphere HA uses the following calculations to control virtual machine migration in the cluster.
 *
 * 1. Calculate the total resource requirements for all powered-on virtual machines in the cluster.
 * 2. Calculate the total host resources available for virtual machines.
 * 3. Calculate the Current CPU failover capacity, memory failover capacity and optionally, persistent memory failover capacity for the cluster.
 * 4. Compare the current CPU failover capacity and current memory failover capacity with the configured resource percentages (cpuFailoverResourcesPercent
 *    and memoryFailoverResourcesPercent). If either current capacity is less than the corresponding configured capacity, HA does not allow the operation.
 *
 * HA uses the actual reservations of the virtual machines. If a virtual machine does not have reservations, meaning that the reservation is 0,
 * a default of 0MB memory and 256MHz CPU is applied.
 * This is controlled by the same HA advanced options used for the failover level policy (ClusterFailoverLevelAdmissionControlPolicy).
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 7.0.2
 * @since 4.0
 */
public class ClusterFailoverResourcesAdmissionControlPolicy extends ClusterDasAdmissionControlPolicy {

    private int cpuFailoverResourcesPercent;
    private int memoryFailoverResourcesPercent;
    private Integer failoverLevel;
    private Boolean autoComputePercentages;
    private Integer pMemFailoverResourcesPercent;
    private Boolean autoComputePMemFailoverResourcesPercent;

    @Override
    public String toString() {
        return "ClusterFailoverResourcesAdmissionControlPolicy{" +
                "cpuFailoverResourcesPercent=" + cpuFailoverResourcesPercent +
                ", memoryFailoverResourcesPercent=" + memoryFailoverResourcesPercent +
                ", failoverLevel=" + failoverLevel +
                ", autoComputePercentages=" + autoComputePercentages +
                ", pMemFailoverResourcesPercent=" + pMemFailoverResourcesPercent +
                ", autoComputePMemFailoverResourcesPercent=" + autoComputePMemFailoverResourcesPercent +
                '}';
    }

    public int getCpuFailoverResourcesPercent() {
        return cpuFailoverResourcesPercent;
    }

    public void setCpuFailoverResourcesPercent(final int cpuFailoverResourcesPercent) {
        this.cpuFailoverResourcesPercent = cpuFailoverResourcesPercent;
    }

    public int getMemoryFailoverResourcesPercent() {
        return memoryFailoverResourcesPercent;
    }

    public void setMemoryFailoverResourcesPercent(final int memoryFailoverResourcesPercent) {
        this.memoryFailoverResourcesPercent = memoryFailoverResourcesPercent;
    }

    public Integer getFailoverLevel() {
        return failoverLevel;
    }

    public void setFailoverLevel(final Integer failoverLevel) {
        this.failoverLevel = failoverLevel;
    }

    public Boolean getAutoComputePercentages() {
        return autoComputePercentages;
    }

    public void setAutoComputePercentages(final Boolean autoComputePercentages) {
        this.autoComputePercentages = autoComputePercentages;
    }

    public Integer getpMemFailoverResourcesPercent() {
        return pMemFailoverResourcesPercent;
    }

    public void setpMemFailoverResourcesPercent(final Integer pMemFailoverResourcesPercent) {
        this.pMemFailoverResourcesPercent = pMemFailoverResourcesPercent;
    }

    public Boolean getAutoComputePMemFailoverResourcesPercent() {
        return autoComputePMemFailoverResourcesPercent;
    }

    public void setAutoComputePMemFailoverResourcesPercent(final Boolean autoComputePMemFailoverResourcesPercent) {
        this.autoComputePMemFailoverResourcesPercent = autoComputePMemFailoverResourcesPercent;
    }

}
