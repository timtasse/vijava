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
public class HostVmfsVolume extends HostFileSystemVolume {

    public Integer blockSize;
    @Deprecated
    public int blockSizeMb;
    public HostScsiDiskPartition[] extent;
    public HostForceMountedInfo forceMountedInfo;
    public Boolean local;
    public int majorVersion;
    public int maxBlocks;
    public String scsiDiskType;
    public Boolean ssd;
    public Integer unmapGranularity;
    public String unmapPriority;
    public String uuid;
    public String version;
    public boolean vmfsUpgradable;

    @Deprecated
    public int getBlockSizeMb() {
        return this.blockSizeMb;
    }

    @Deprecated
    public void setBlockSizeMb(int blockSizeMb) {
        this.blockSizeMb = blockSizeMb;
    }

    public int getMaxBlocks() {
        return this.maxBlocks;
    }

    public void setMaxBlocks(int maxBlocks) {
        this.maxBlocks = maxBlocks;
    }

    public int getMajorVersion() {
        return this.majorVersion;
    }

    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public HostScsiDiskPartition[] getExtent() {
        return this.extent;
    }

    public void setExtent(HostScsiDiskPartition[] extent) {
        this.extent = extent;
    }

    public boolean isVmfsUpgradable() {
        return this.vmfsUpgradable;
    }

    public void setVmfsUpgradable(boolean vmfsUpgradable) {
        this.vmfsUpgradable = vmfsUpgradable;
    }

    public HostForceMountedInfo getForceMountedInfo() {
        return this.forceMountedInfo;
    }

    public void setForceMountedInfo(HostForceMountedInfo forceMountedInfo) {
        this.forceMountedInfo = forceMountedInfo;
    }

    public int getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(final int blockSize) {
        this.blockSize = blockSize;
    }

    public boolean isLocal() {
        return local;
    }

    public void setLocal(boolean local) {
        this.local = local;
    }

    public String getScsiDiskType() {
        return scsiDiskType;
    }

    public void setScsiDiskType(final String scsiDiskType) {
        this.scsiDiskType = scsiDiskType;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public int getUnmapGranularity() {
        return unmapGranularity;
    }

    public void setUnmapGranularity(final int unmapGranularity) {
        this.unmapGranularity = unmapGranularity;
    }

    public String getUnmapPriority() {
        return unmapPriority;
    }

    public void setUnmapPriority(final String unmapPriority) {
        this.unmapPriority = unmapPriority;
    }
}