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
 * The VirtualHardwareOption data object contains the options available for all virtual devices.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
public class VirtualHardwareOption extends DynamicData {

    private int hwVersion;
    private VirtualDeviceOption[] virtualDeviceOption;
    private boolean deviceListReadonly;
    private int[] numCPU;
    private IntOption numCoresPerSocket;
    private boolean numCpuReadonly;
    private LongOption memoryMB;
    private IntOption numPCIControllers;
    private IntOption numIDEControllers;
    private IntOption numUSBControllers;
    private IntOption numUSBXHCIControllers;
    private IntOption numSIOControllers;
    private IntOption numPS2Controllers;
    private String[] licensingLimit;
    private IntOption numSupportedWwnPorts;
    private IntOption numSupportedWwnNodes;
    private ResourceConfigOption resourceConfigOption;
    private IntOption numNVDIMMControllers;
    private IntOption numTPMDevices;
    private IntOption numWDTDevices;
    private IntOption numPrecisionClockDevices;
    private LongOption epcMemoryMB;

    @Override
    public String toString() {
        return "VirtualHardwareOption{" +
                "hwVersion=" + hwVersion +
                ", virtualDeviceOption=" + Arrays.toString(virtualDeviceOption) +
                ", deviceListReadonly=" + deviceListReadonly +
                ", numCPU=" + Arrays.toString(numCPU) +
                ", numCoresPerSocket=" + numCoresPerSocket +
                ", numCpuReadonly=" + numCpuReadonly +
                ", memoryMB=" + memoryMB +
                ", numPCIControllers=" + numPCIControllers +
                ", numIDEControllers=" + numIDEControllers +
                ", numUSBControllers=" + numUSBControllers +
                ", numUSBXHCIControllers=" + numUSBXHCIControllers +
                ", numSIOControllers=" + numSIOControllers +
                ", numPS2Controllers=" + numPS2Controllers +
                ", licensingLimit=" + Arrays.toString(licensingLimit) +
                ", numSupportedWwnPorts=" + numSupportedWwnPorts +
                ", numSupportedWwnNodes=" + numSupportedWwnNodes +
                ", resourceConfigOption=" + resourceConfigOption +
                ", numNVDIMMControllers=" + numNVDIMMControllers +
                ", numTPMDevices=" + numTPMDevices +
                ", numWDTDevices=" + numWDTDevices +
                ", numPrecisionClockDevices=" + numPrecisionClockDevices +
                ", epcMemoryMB=" + epcMemoryMB +
                "} " + super.toString();
    }

    public int getHwVersion() {
        return this.hwVersion;
    }

    public void setHwVersion(int hwVersion) {
        this.hwVersion = hwVersion;
    }

    public VirtualDeviceOption[] getVirtualDeviceOption() {
        return this.virtualDeviceOption;
    }

    public void setVirtualDeviceOption(VirtualDeviceOption[] virtualDeviceOption) {
        this.virtualDeviceOption = virtualDeviceOption;
    }

    public boolean isDeviceListReadonly() {
        return this.deviceListReadonly;
    }

    public void setDeviceListReadonly(boolean deviceListReadonly) {
        this.deviceListReadonly = deviceListReadonly;
    }

    public int[] getNumCPU() {
        return this.numCPU;
    }

    public void setNumCPU(int[] numCPU) {
        this.numCPU = numCPU;
    }

    public IntOption getNumCoresPerSocket() {
        return this.numCoresPerSocket;
    }

    public void setNumCoresPerSocket(IntOption numCoresPerSocket) {
        this.numCoresPerSocket = numCoresPerSocket;
    }

    public boolean isNumCpuReadonly() {
        return this.numCpuReadonly;
    }

    public void setNumCpuReadonly(boolean numCpuReadonly) {
        this.numCpuReadonly = numCpuReadonly;
    }

    public LongOption getMemoryMB() {
        return this.memoryMB;
    }

    public void setMemoryMB(LongOption memoryMB) {
        this.memoryMB = memoryMB;
    }

    public IntOption getNumPCIControllers() {
        return this.numPCIControllers;
    }

    public void setNumPCIControllers(IntOption numPCIControllers) {
        this.numPCIControllers = numPCIControllers;
    }

    public IntOption getNumIDEControllers() {
        return this.numIDEControllers;
    }

    public void setNumIDEControllers(IntOption numIDEControllers) {
        this.numIDEControllers = numIDEControllers;
    }

    public IntOption getNumUSBControllers() {
        return this.numUSBControllers;
    }

    public void setNumUSBControllers(IntOption numUSBControllers) {
        this.numUSBControllers = numUSBControllers;
    }

    public IntOption getNumUSBXHCIControllers() {
        return this.numUSBXHCIControllers;
    }

    public void setNumUSBXHCIControllers(IntOption numUSBXHCIControllers) {
        this.numUSBXHCIControllers = numUSBXHCIControllers;
    }

    public IntOption getNumSIOControllers() {
        return this.numSIOControllers;
    }

    public void setNumSIOControllers(IntOption numSIOControllers) {
        this.numSIOControllers = numSIOControllers;
    }

    public IntOption getNumPS2Controllers() {
        return this.numPS2Controllers;
    }

    public void setNumPS2Controllers(IntOption numPS2Controllers) {
        this.numPS2Controllers = numPS2Controllers;
    }

    public String[] getLicensingLimit() {
        return this.licensingLimit;
    }

    public void setLicensingLimit(String[] licensingLimit) {
        this.licensingLimit = licensingLimit;
    }

    public IntOption getNumSupportedWwnPorts() {
        return this.numSupportedWwnPorts;
    }

    public void setNumSupportedWwnPorts(IntOption numSupportedWwnPorts) {
        this.numSupportedWwnPorts = numSupportedWwnPorts;
    }

    public IntOption getNumSupportedWwnNodes() {
        return this.numSupportedWwnNodes;
    }

    public void setNumSupportedWwnNodes(IntOption numSupportedWwnNodes) {
        this.numSupportedWwnNodes = numSupportedWwnNodes;
    }

    public ResourceConfigOption getResourceConfigOption() {
        return this.resourceConfigOption;
    }

    public void setResourceConfigOption(ResourceConfigOption resourceConfigOption) {
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

}
