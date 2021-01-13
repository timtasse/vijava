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
 * This data object type describes the VMware File System (VMFS) creation specification.
 * Once created, these properties for the most part cannot be changed. There are a few exceptions.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */
@SuppressWarnings("all")
public class HostVmfsSpec extends DynamicData {

    private HostScsiDiskPartition extent;
    @Deprecated
    private Integer blockSizeMb;
    private int majorVersion;
    private String volumeName;
    private Integer blockSize;
    private Integer unmapGranularity;
    private String unmapPriority;
    private VmfsUnmapBandwidthSpec unmapBandwidthSpec;

    @Override
    public String toString() {
        return "HostVmfsSpec{" +
                "blockSize=" + blockSize +
                ", blockSizeMb=" + blockSizeMb +
                ", extent=" + extent +
                ", majorVersion=" + majorVersion +
                ", unmapBandwidthSpec=" + unmapBandwidthSpec +
                ", unmapGranularity=" + unmapGranularity +
                ", unmapPriority='" + unmapPriority + '\'' +
                ", volumeName='" + volumeName + '\'' +
                "} " + super.toString();
    }

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

    public int getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(final int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public VmfsUnmapBandwidthSpec getUnmapBandwidthSpec() {
        return unmapBandwidthSpec;
    }

    public void setUnmapBandwidthSpec(final VmfsUnmapBandwidthSpec unmapBandwidthSpec) {
        this.unmapBandwidthSpec = unmapBandwidthSpec;
    }

}
