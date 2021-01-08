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

/**
 * The HardwareInfo data object type describes the hardware configuration of the host.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */

@SuppressWarnings("all")
public class HostHardwareInfo extends DynamicData {

    private HostBIOSInfo biosInfo;
    private HostCpuIdInfo[] cpuFeature;
    private HostCpuInfo cpuInfo;
    private HostCpuPackage[] cpuPkg;
    private HostCpuPowerManagementInfo cpuPowerManagementInfo;
    private long memorySize;
    private HostNumaInfo numaInfo;
    private HostPciDevice[] pciDevice;
    private HostPersistentMemoryInfo persistentMemoryInfo;
    private HostReliableMemoryInfo reliableMemoryInfo;
    private Boolean smcPresent;
    private HostSystemInfo systemInfo;

    @Override
    public String toString() {
        return "HostHardwareInfo{" +
                "biosInfo=" + biosInfo +
                ", cpuFeature=" + Arrays.toString(cpuFeature) +
                ", cpuInfo=" + cpuInfo +
                ", cpuPkg=" + Arrays.toString(cpuPkg) +
                ", cpuPowerManagementInfo=" + cpuPowerManagementInfo +
                ", memorySize=" + memorySize +
                ", numaInfo=" + numaInfo +
                ", pciDevice=" + Arrays.toString(pciDevice) +
                ", persistentMemoryInfo=" + persistentMemoryInfo +
                ", reliableMemoryInfo=" + reliableMemoryInfo +
                ", smcPresent=" + smcPresent +
                ", systemInfo=" + systemInfo +
                "} " + super.toString();
    }

    public HostSystemInfo getSystemInfo() {
        return this.systemInfo;
    }

    public void setSystemInfo(HostSystemInfo systemInfo) {
        this.systemInfo = systemInfo;
    }

    public HostCpuPowerManagementInfo getCpuPowerManagementInfo() {
        return this.cpuPowerManagementInfo;
    }

    public void setCpuPowerManagementInfo(HostCpuPowerManagementInfo cpuPowerManagementInfo) {
        this.cpuPowerManagementInfo = cpuPowerManagementInfo;
    }

    public HostCpuInfo getCpuInfo() {
        return this.cpuInfo;
    }

    public void setCpuInfo(HostCpuInfo cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public HostCpuPackage[] getCpuPkg() {
        return this.cpuPkg;
    }

    public void setCpuPkg(HostCpuPackage[] cpuPkg) {
        this.cpuPkg = cpuPkg;
    }

    public long getMemorySize() {
        return this.memorySize;
    }

    public void setMemorySize(long memorySize) {
        this.memorySize = memorySize;
    }

    public HostNumaInfo getNumaInfo() {
        return this.numaInfo;
    }

    public void setNumaInfo(HostNumaInfo numaInfo) {
        this.numaInfo = numaInfo;
    }

    public Boolean getSmcPresent() {
        return this.smcPresent;
    }

    public void setSmcPresent(Boolean smcPresent) {
        this.smcPresent = smcPresent;
    }

    public HostPciDevice[] getPciDevice() {
        return this.pciDevice;
    }

    public void setPciDevice(HostPciDevice[] pciDevice) {
        this.pciDevice = pciDevice;
    }

    public HostCpuIdInfo[] getCpuFeature() {
        return this.cpuFeature;
    }

    public void setCpuFeature(HostCpuIdInfo[] cpuFeature) {
        this.cpuFeature = cpuFeature;
    }

    public HostBIOSInfo getBiosInfo() {
        return this.biosInfo;
    }

    public void setBiosInfo(HostBIOSInfo biosInfo) {
        this.biosInfo = biosInfo;
    }

    public HostReliableMemoryInfo getReliableMemoryInfo() {
        return this.reliableMemoryInfo;
    }

    public void setReliableMemoryInfo(HostReliableMemoryInfo reliableMemoryInfo) {
        this.reliableMemoryInfo = reliableMemoryInfo;
    }

    public HostPersistentMemoryInfo getPersistentMemoryInfo() {
        return persistentMemoryInfo;
    }

    public void setPersistentMemoryInfo(final HostPersistentMemoryInfo persistentMemoryInfo) {
        this.persistentMemoryInfo = persistentMemoryInfo;
    }

}
