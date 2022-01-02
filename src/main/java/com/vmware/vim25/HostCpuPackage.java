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

import java.util.List;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */
@SuppressWarnings("unused")
public class HostCpuPackage extends DynamicData {

    private short index;
    private String vendor;
    private long hz;
    private long busHz;
    private String description;
    private List<Short> threadId;
    private List<HostCpuIdInfo> cpuFeature;

    @Override
    public String toString() {
        return "HostCpuPackage{" +
                "index=" + index +
                ", vendor='" + vendor + '\'' +
                ", hz=" + hz +
                ", busHz=" + busHz +
                ", description='" + description + '\'' +
                ", threadId=" + threadId +
                ", cpuFeature=" + cpuFeature +
                "} " + super.toString();
    }

    public short getIndex() {
        return this.index;
    }

    public void setIndex(final short index) {
        this.index = index;
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setVendor(final String vendor) {
        this.vendor = vendor;
    }

    public long getHz() {
        return this.hz;
    }

    public void setHz(final long hz) {
        this.hz = hz;
    }

    public long getBusHz() {
        return this.busHz;
    }

    public void setBusHz(final long busHz) {
        this.busHz = busHz;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public List<HostCpuIdInfo> getCpuFeature() {
        return cpuFeature;
    }

    public void setCpuFeature(final List<HostCpuIdInfo> cpuFeature) {
        this.cpuFeature = cpuFeature;
    }

    public List<Short> getThreadId() {
        return threadId;
    }

    public void setThreadId(final List<Short> threadId) {
        this.threadId = threadId;
    }

}
