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
 * The VirtualHardwareOption data object contains the options available for all virtual devices.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
public class VirtualHardwareOption extends DynamicData {

    private int hwVersion;
    private List<VirtualDeviceOption> virtualDeviceOption;
    private boolean deviceListReadonly;
    private List<Integer> numCPU;
    private IntOption numCoresPerSocket;
    private BoolOption autoCoresPerSocket;
    private boolean numCpuReadonly;
    private LongOption memoryMB;
    private IntOption numPCIControllers;
    private IntOption numIDEControllers;
    private IntOption numUSBControllers;
    private IntOption numUSBXHCIControllers;
    private IntOption numSIOControllers;
    private IntOption numPS2Controllers;
    private List<String> licensingLimit = List.of();
    private IntOption numSupportedWwnPorts;
    private IntOption numSupportedWwnNodes;
    private ResourceConfigOption resourceConfigOption;
    private IntOption numNVDIMMControllers;
    private IntOption numTPMDevices;
    private IntOption numWDTDevices;
    private IntOption numPrecisionClockDevices;
    private LongOption epcMemoryMB;
    private String acpiHostBridgesFirmware;
    private IntOption numCpuSimultaneousThreads;
    private IntOption numNumaNodes;
    private IntOption numDeviceGroups;
    private String deviceGroupTypes;

    @Override
    public String toString() {
        return "VirtualHardwareOption{" +
                "hwVersion=" + hwVersion +
                ", virtualDeviceOption=" + virtualDeviceOption +
                ", deviceListReadonly=" + deviceListReadonly +
                ", numCPU=" + numCPU +
                ", numCoresPerSocket=" + numCoresPerSocket +
                ", autoCoresPerSocket=" + autoCoresPerSocket +
                ", numCpuReadonly=" + numCpuReadonly +
                ", memoryMB=" + memoryMB +
                ", numPCIControllers=" + numPCIControllers +
                ", numIDEControllers=" + numIDEControllers +
                ", numUSBControllers=" + numUSBControllers +
                ", numUSBXHCIControllers=" + numUSBXHCIControllers +
                ", numSIOControllers=" + numSIOControllers +
                ", numPS2Controllers=" + numPS2Controllers +
                ", licensingLimit=" + licensingLimit +
                ", numSupportedWwnPorts=" + numSupportedWwnPorts +
                ", numSupportedWwnNodes=" + numSupportedWwnNodes +
                ", resourceConfigOption=" + resourceConfigOption +
                ", numNVDIMMControllers=" + numNVDIMMControllers +
                ", numTPMDevices=" + numTPMDevices +
                ", numWDTDevices=" + numWDTDevices +
                ", numPrecisionClockDevices=" + numPrecisionClockDevices +
                ", epcMemoryMB=" + epcMemoryMB +
                ", acpiHostBridgesFirmware='" + acpiHostBridgesFirmware + '\'' +
                ", numCpuSimultaneousThreads=" + numCpuSimultaneousThreads +
                ", numNumaNodes=" + numNumaNodes +
                ", numDeviceGroups=" + numDeviceGroups +
                ", deviceGroupTypes='" + deviceGroupTypes + '\'' +
                '}';
    }

    public int getHwVersion() {
        return hwVersion;
    }

    public void setHwVersion(final int hwVersion) {
        this.hwVersion = hwVersion;
    }

    public List<VirtualDeviceOption> getVirtualDeviceOption() {
        return virtualDeviceOption;
    }

    public void setVirtualDeviceOption(final List<VirtualDeviceOption> virtualDeviceOption) {
        this.virtualDeviceOption = virtualDeviceOption;
    }

    public boolean isDeviceListReadonly() {
        return deviceListReadonly;
    }

    public void setDeviceListReadonly(final boolean deviceListReadonly) {
        this.deviceListReadonly = deviceListReadonly;
    }

    public List<Integer> getNumCPU() {
        return numCPU;
    }

    public void setNumCPU(final List<Integer> numCPU) {
        this.numCPU = numCPU;
    }

    public IntOption getNumCoresPerSocket() {
        return numCoresPerSocket;
    }

    public void setNumCoresPerSocket(final IntOption numCoresPerSocket) {
        this.numCoresPerSocket = numCoresPerSocket;
    }

    public BoolOption getAutoCoresPerSocket() {
        return autoCoresPerSocket;
    }

    public void setAutoCoresPerSocket(final BoolOption autoCoresPerSocket) {
        this.autoCoresPerSocket = autoCoresPerSocket;
    }

    public boolean isNumCpuReadonly() {
        return numCpuReadonly;
    }

    public void setNumCpuReadonly(final boolean numCpuReadonly) {
        this.numCpuReadonly = numCpuReadonly;
    }

    public LongOption getMemoryMB() {
        return memoryMB;
    }

    public void setMemoryMB(final LongOption memoryMB) {
        this.memoryMB = memoryMB;
    }

    public IntOption getNumPCIControllers() {
        return numPCIControllers;
    }

    public void setNumPCIControllers(final IntOption numPCIControllers) {
        this.numPCIControllers = numPCIControllers;
    }

    public IntOption getNumIDEControllers() {
        return numIDEControllers;
    }

    public void setNumIDEControllers(final IntOption numIDEControllers) {
        this.numIDEControllers = numIDEControllers;
    }

    public IntOption getNumUSBControllers() {
        return numUSBControllers;
    }

    public void setNumUSBControllers(final IntOption numUSBControllers) {
        this.numUSBControllers = numUSBControllers;
    }

    public IntOption getNumUSBXHCIControllers() {
        return numUSBXHCIControllers;
    }

    public void setNumUSBXHCIControllers(final IntOption numUSBXHCIControllers) {
        this.numUSBXHCIControllers = numUSBXHCIControllers;
    }

    public IntOption getNumSIOControllers() {
        return numSIOControllers;
    }

    public void setNumSIOControllers(final IntOption numSIOControllers) {
        this.numSIOControllers = numSIOControllers;
    }

    public IntOption getNumPS2Controllers() {
        return numPS2Controllers;
    }

    public void setNumPS2Controllers(final IntOption numPS2Controllers) {
        this.numPS2Controllers = numPS2Controllers;
    }

    public List<String> getLicensingLimit() {
        return licensingLimit;
    }

    public void setLicensingLimit(final List<String> licensingLimit) {
        this.licensingLimit = licensingLimit;
    }

    public IntOption getNumSupportedWwnPorts() {
        return numSupportedWwnPorts;
    }

    public void setNumSupportedWwnPorts(final IntOption numSupportedWwnPorts) {
        this.numSupportedWwnPorts = numSupportedWwnPorts;
    }

    public IntOption getNumSupportedWwnNodes() {
        return numSupportedWwnNodes;
    }

    public void setNumSupportedWwnNodes(final IntOption numSupportedWwnNodes) {
        this.numSupportedWwnNodes = numSupportedWwnNodes;
    }

    public ResourceConfigOption getResourceConfigOption() {
        return resourceConfigOption;
    }

    public void setResourceConfigOption(final ResourceConfigOption resourceConfigOption) {
        this.resourceConfigOption = resourceConfigOption;
    }

    public IntOption getNumNVDIMMControllers() {
        return numNVDIMMControllers;
    }

    public void setNumNVDIMMControllers(final IntOption numNVDIMMControllers) {
        this.numNVDIMMControllers = numNVDIMMControllers;
    }

    public IntOption getNumTPMDevices() {
        return numTPMDevices;
    }

    public void setNumTPMDevices(final IntOption numTPMDevices) {
        this.numTPMDevices = numTPMDevices;
    }

    public IntOption getNumWDTDevices() {
        return numWDTDevices;
    }

    public void setNumWDTDevices(final IntOption numWDTDevices) {
        this.numWDTDevices = numWDTDevices;
    }

    public IntOption getNumPrecisionClockDevices() {
        return numPrecisionClockDevices;
    }

    public void setNumPrecisionClockDevices(final IntOption numPrecisionClockDevices) {
        this.numPrecisionClockDevices = numPrecisionClockDevices;
    }

    public LongOption getEpcMemoryMB() {
        return epcMemoryMB;
    }

    public void setEpcMemoryMB(final LongOption epcMemoryMB) {
        this.epcMemoryMB = epcMemoryMB;
    }

    public String getAcpiHostBridgesFirmware() {
        return acpiHostBridgesFirmware;
    }

    public void setAcpiHostBridgesFirmware(final String acpiHostBridgesFirmware) {
        this.acpiHostBridgesFirmware = acpiHostBridgesFirmware;
    }

    public IntOption getNumCpuSimultaneousThreads() {
        return numCpuSimultaneousThreads;
    }

    public void setNumCpuSimultaneousThreads(final IntOption numCpuSimultaneousThreads) {
        this.numCpuSimultaneousThreads = numCpuSimultaneousThreads;
    }

    public IntOption getNumNumaNodes() {
        return numNumaNodes;
    }

    public void setNumNumaNodes(final IntOption numNumaNodes) {
        this.numNumaNodes = numNumaNodes;
    }

    public IntOption getNumDeviceGroups() {
        return numDeviceGroups;
    }

    public void setNumDeviceGroups(final IntOption numDeviceGroups) {
        this.numDeviceGroups = numDeviceGroups;
    }

    public String getDeviceGroupTypes() {
        return deviceGroupTypes;
    }

    public void setDeviceGroupTypes(final String deviceGroupTypes) {
        this.deviceGroupTypes = deviceGroupTypes;
    }

}
