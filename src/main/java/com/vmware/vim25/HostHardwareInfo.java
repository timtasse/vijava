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
 * @version 7.0.1
 */
@SuppressWarnings("unused")
public class HostHardwareInfo extends DynamicData {

    private HostSystemInfo systemInfo;
    private HostCpuPowerManagementInfo cpuPowerManagementInfo;
    private HostCpuInfo cpuInfo;
    private HostCpuPackage[] cpuPkg;
    private long memorySize;
    private HostNumaInfo numaInfo;
    private Boolean smcPresent;
    private HostPciDevice[] pciDevice;
    private HostCpuIdInfo[] cpuFeature;
    private HostBIOSInfo biosInfo;
    private HostReliableMemoryInfo reliableMemoryInfo;
    private HostPersistentMemoryInfo persistentMemoryInfo;
    private HostSgxInfo sgxInfo;
    private HostSevInfo sevInfo;

    @Override
    public String toString() {
        return "HostHardwareInfo{" +
                "systemInfo=" + systemInfo +
                ", cpuPowerManagementInfo=" + cpuPowerManagementInfo +
                ", cpuInfo=" + cpuInfo +
                ", cpuPkg=" + Arrays.toString(cpuPkg) +
                ", memorySize=" + memorySize +
                ", numaInfo=" + numaInfo +
                ", smcPresent=" + smcPresent +
                ", pciDevice=" + Arrays.toString(pciDevice) +
                ", cpuFeature=" + Arrays.toString(cpuFeature) +
                ", biosInfo=" + biosInfo +
                ", reliableMemoryInfo=" + reliableMemoryInfo +
                ", persistentMemoryInfo=" + persistentMemoryInfo +
                ", sgxInfo=" + sgxInfo +
                ", sevInfo=" + sevInfo +
                "} " + super.toString();
    }

    public HostSystemInfo getSystemInfo() {
        return this.systemInfo;
    }

    public void setSystemInfo(final HostSystemInfo systemInfo) {
        this.systemInfo = systemInfo;
    }

    public HostCpuPowerManagementInfo getCpuPowerManagementInfo() {
        return this.cpuPowerManagementInfo;
    }

    public void setCpuPowerManagementInfo(final HostCpuPowerManagementInfo cpuPowerManagementInfo) {
        this.cpuPowerManagementInfo = cpuPowerManagementInfo;
    }

    public HostCpuInfo getCpuInfo() {
        return this.cpuInfo;
    }

    public void setCpuInfo(final HostCpuInfo cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public HostCpuPackage[] getCpuPkg() {
        return this.cpuPkg;
    }

    public void setCpuPkg(final HostCpuPackage[] cpuPkg) {
        this.cpuPkg = cpuPkg;
    }

    public long getMemorySize() {
        return this.memorySize;
    }

    public void setMemorySize(final long memorySize) {
        this.memorySize = memorySize;
    }

    public HostNumaInfo getNumaInfo() {
        return this.numaInfo;
    }

    public void setNumaInfo(final HostNumaInfo numaInfo) {
        this.numaInfo = numaInfo;
    }

    public Boolean getSmcPresent() {
        return this.smcPresent;
    }

    public void setSmcPresent(final Boolean smcPresent) {
        this.smcPresent = smcPresent;
    }

    public HostPciDevice[] getPciDevice() {
        return this.pciDevice;
    }

    public void setPciDevice(final HostPciDevice[] pciDevice) {
        this.pciDevice = pciDevice;
    }

    public HostCpuIdInfo[] getCpuFeature() {
        return this.cpuFeature;
    }

    public void setCpuFeature(final HostCpuIdInfo[] cpuFeature) {
        this.cpuFeature = cpuFeature;
    }

    public HostBIOSInfo getBiosInfo() {
        return this.biosInfo;
    }

    public void setBiosInfo(final HostBIOSInfo biosInfo) {
        this.biosInfo = biosInfo;
    }

    public HostReliableMemoryInfo getReliableMemoryInfo() {
        return this.reliableMemoryInfo;
    }

    public void setReliableMemoryInfo(final HostReliableMemoryInfo reliableMemoryInfo) {
        this.reliableMemoryInfo = reliableMemoryInfo;
    }

    public HostPersistentMemoryInfo getPersistentMemoryInfo() {
        return persistentMemoryInfo;
    }

    public void setPersistentMemoryInfo(final HostPersistentMemoryInfo persistentMemoryInfo) {
        this.persistentMemoryInfo = persistentMemoryInfo;
    }

    public HostSgxInfo getSgxInfo() {
        return sgxInfo;
    }

    public void setSgxInfo(final HostSgxInfo sgxInfo) {
        this.sgxInfo = sgxInfo;
    }

    public HostSevInfo getSevInfo() {
        return sevInfo;
    }

    public void setSevInfo(final HostSevInfo sevInfo) {
        this.sevInfo = sevInfo;
    }

}
