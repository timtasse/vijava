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
 * Data object representing the status of the hardware components of the host.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
@SuppressWarnings("unused")
public class HostHardwareStatusInfo extends DynamicData {

    private List<HostHardwareElementInfo> memoryStatusInfo = List.of();
    private List<HostHardwareElementInfo> cpuStatusInfo = List.of();
    private List<HostStorageElementInfo> storageStatusInfo = List.of();
    private List<DpuStatusInfo> dpuStatusInfo = List.of();

    @Override
    public String toString() {
        return "HostHardwareStatusInfo{" +
                "memoryStatusInfo=" + memoryStatusInfo +
                ", cpuStatusInfo=" + cpuStatusInfo +
                ", storageStatusInfo=" + storageStatusInfo +
                ", dpuStatusInfo=" + dpuStatusInfo +
                '}';
    }

    public List<HostHardwareElementInfo> getMemoryStatusInfo() {
        return memoryStatusInfo;
    }

    public void setMemoryStatusInfo(final List<HostHardwareElementInfo> memoryStatusInfo) {
        this.memoryStatusInfo = memoryStatusInfo;
    }

    public List<HostHardwareElementInfo> getCpuStatusInfo() {
        return cpuStatusInfo;
    }

    public void setCpuStatusInfo(final List<HostHardwareElementInfo> cpuStatusInfo) {
        this.cpuStatusInfo = cpuStatusInfo;
    }

    public List<HostStorageElementInfo> getStorageStatusInfo() {
        return storageStatusInfo;
    }

    public void setStorageStatusInfo(final List<HostStorageElementInfo> storageStatusInfo) {
        this.storageStatusInfo = storageStatusInfo;
    }

    public List<DpuStatusInfo> getDpuStatusInfo() {
        return dpuStatusInfo;
    }

    public void setDpuStatusInfo(final List<DpuStatusInfo> dpuStatusInfo) {
        this.dpuStatusInfo = dpuStatusInfo;
    }

}
