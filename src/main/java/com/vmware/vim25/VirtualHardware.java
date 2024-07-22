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
 * The VirtualHardware data object type contains the complete configuration of the hardware in a virtual machine.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualHardware extends DynamicData {

    private int numCPU;
    private Integer numCoresPerSocket;
    private Boolean autoCoresPerSocket;
    private int memoryMB;
    private Boolean virtualICH7MPresent;
    private Boolean virtualSMCPresent;
    private List<VirtualDevice> device;
    private VirtualHardwareMotherboardLayout motherboardLayout;
    private Integer simultaneousThreads;

    @Override
    public String toString() {
        return "VirtualHardware{" +
                "numCPU=" + numCPU +
                ", numCoresPerSocket=" + numCoresPerSocket +
                ", autoCoresPerSocket=" + autoCoresPerSocket +
                ", memoryMB=" + memoryMB +
                ", virtualICH7MPresent=" + virtualICH7MPresent +
                ", virtualSMCPresent=" + virtualSMCPresent +
                ", device=" + device +
                ", motherboardLayout=" + motherboardLayout +
                ", simultaneousThreads=" + simultaneousThreads +
                '}';
    }

    public int getNumCPU() {
        return numCPU;
    }

    public void setNumCPU(final int numCPU) {
        this.numCPU = numCPU;
    }

    public Integer getNumCoresPerSocket() {
        return numCoresPerSocket;
    }

    public void setNumCoresPerSocket(final Integer numCoresPerSocket) {
        this.numCoresPerSocket = numCoresPerSocket;
    }

    public Boolean getAutoCoresPerSocket() {
        return autoCoresPerSocket;
    }

    public void setAutoCoresPerSocket(final Boolean autoCoresPerSocket) {
        this.autoCoresPerSocket = autoCoresPerSocket;
    }

    public int getMemoryMB() {
        return memoryMB;
    }

    public void setMemoryMB(final int memoryMB) {
        this.memoryMB = memoryMB;
    }

    public Boolean getVirtualICH7MPresent() {
        return virtualICH7MPresent;
    }

    public void setVirtualICH7MPresent(final Boolean virtualICH7MPresent) {
        this.virtualICH7MPresent = virtualICH7MPresent;
    }

    public Boolean getVirtualSMCPresent() {
        return virtualSMCPresent;
    }

    public void setVirtualSMCPresent(final Boolean virtualSMCPresent) {
        this.virtualSMCPresent = virtualSMCPresent;
    }

    public List<VirtualDevice> getDevice() {
        return device;
    }

    public void setDevice(final List<VirtualDevice> device) {
        this.device = device;
    }

    public VirtualHardwareMotherboardLayout getMotherboardLayout() {
        return motherboardLayout;
    }

    public void setMotherboardLayout(final VirtualHardwareMotherboardLayout motherboardLayout) {
        this.motherboardLayout = motherboardLayout;
    }

    public Integer getSimultaneousThreads() {
        return simultaneousThreads;
    }

    public void setSimultaneousThreads(final Integer simultaneousThreads) {
        this.simultaneousThreads = simultaneousThreads;
    }

}
