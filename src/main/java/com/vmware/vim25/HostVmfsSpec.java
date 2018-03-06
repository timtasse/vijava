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
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.5
 */
@SuppressWarnings("all")
public class HostVmfsSpec extends DynamicData {

    public HostScsiDiskPartition extent;
    @Deprecated
    public Integer blockSizeMb;
    public int majorVersion;
    public String volumeName;
    public Integer blockSize;
    public Integer unmapGranularity;
    public String unmapPriority;

    public HostScsiDiskPartition getExtent() {
        return this.extent;
    }

    public void setExtent(HostScsiDiskPartition extent) {
        this.extent = extent;
    }

    @Deprecated
    public Integer getBlockSizeMb() {
        return this.blockSizeMb;
    }

    @Deprecated
    public void setBlockSizeMb(Integer blockSizeMb) {
        this.blockSizeMb = blockSizeMb;
    }

    public Integer getMajorVersion() {
        return this.majorVersion;
    }

    public void setMajorVersion(Integer majorVersion) {
        this.majorVersion = majorVersion;
    }

    public String getVolumeName() {
        return this.volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public Integer getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(final Integer blockSize) {
        this.blockSize = blockSize;
    }

    public Integer getUnmapGranularity() {
        return unmapGranularity;
    }

    public void setUnmapGranularity(final Integer unmapGranularity) {
        this.unmapGranularity = unmapGranularity;
    }

    public String getUnmapPriority() {
        return unmapPriority;
    }

    public void setUnmapPriority(final String unmapPriority) {
        this.unmapPriority = unmapPriority;
    }
}