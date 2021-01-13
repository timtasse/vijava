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
 * Information about a single NUMA node.
 *
 * NOTE: This data object is not modeled correctly if the NUMA node contains multiple disjoint memory ranges.
 * If there are multiple memory ranges, the client will see one memory ranges from this NumaNode object,
 * and the memory range may or may not belong to this NUMA node.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */

@SuppressWarnings("all")
public class HostNumaNode extends DynamicData {

    private byte typeId;
    private short[] cpuID;
    private long memoryRangeBegin;
    private long memoryRangeLength;
    private String[] pciId;

    @Override
    public String toString() {
        return "HostNumaNode{" +
                "cpuID=" + Arrays.toString(cpuID) +
                ", memoryRangeBegin=" + memoryRangeBegin +
                ", memoryRangeLength=" + memoryRangeLength +
                ", pciId=" + Arrays.toString(pciId) +
                ", typeId=" + typeId +
                "} " + super.toString();
    }

    public byte getTypeId() {
        return this.typeId;
    }

    public void setTypeId(byte typeId) {
        this.typeId = typeId;
    }

    public short[] getCpuID() {
        return this.cpuID;
    }

    public void setCpuID(short[] cpuID) {
        this.cpuID = cpuID;
    }

    public long getMemoryRangeBegin() {
        return this.memoryRangeBegin;
    }

    public void setMemoryRangeBegin(long memoryRangeBegin) {
        this.memoryRangeBegin = memoryRangeBegin;
    }

    public long getMemoryRangeLength() {
        return this.memoryRangeLength;
    }

    public void setMemoryRangeLength(long memoryRangeLength) {
        this.memoryRangeLength = memoryRangeLength;
    }

    public String[] getPciId() {
        return pciId;
    }

    public void setPciId(final String[] pciId) {
        this.pciId = pciId;
    }

}
