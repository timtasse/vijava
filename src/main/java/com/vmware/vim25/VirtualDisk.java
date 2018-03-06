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
public class VirtualDisk extends VirtualDevice {

    @Deprecated
    public long capacityInKB;
    public Long capacityInBytes;
    @Deprecated
    public SharesInfo shares;
    public StorageIOAllocationInfo storageIOAllocation;
    @Deprecated
    public String diskObjectId;
    public VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo;
    public String[] iofilter;
    public ID vDiskId;

    @Deprecated
    public long getCapacityInKB() {
        return this.capacityInKB;
    }

    @Deprecated
    public void setCapacityInKB(long capacityInKB) {
        this.capacityInKB = capacityInKB;
    }

    public Long getCapacityInBytes() {
        return this.capacityInBytes;
    }

    public void setCapacityInBytes(Long capacityInBytes) {
        this.capacityInBytes = capacityInBytes;
    }

    @Deprecated
    public SharesInfo getShares() {
        return this.shares;
    }

    @Deprecated
    public void setShares(SharesInfo shares) {
        this.shares = shares;
    }

    public StorageIOAllocationInfo getStorageIOAllocation() {
        return this.storageIOAllocation;
    }

    public void setStorageIOAllocation(StorageIOAllocationInfo storageIOAllocation) {
        this.storageIOAllocation = storageIOAllocation;
    }

    @Deprecated
    public String getDiskObjectId() {
        return this.diskObjectId;
    }

    @Deprecated
    public void setDiskObjectId(String diskObjectId) {
        this.diskObjectId = diskObjectId;
    }

    public VirtualDiskVFlashCacheConfigInfo getVFlashCacheConfigInfo() {
        return this.vFlashCacheConfigInfo;
    }

    public void setVFlashCacheConfigInfo(VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo) {
        this.vFlashCacheConfigInfo = vFlashCacheConfigInfo;
    }

    public VirtualDiskVFlashCacheConfigInfo getvFlashCacheConfigInfo() {
        return vFlashCacheConfigInfo;
    }

    public void setvFlashCacheConfigInfo(final VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo) {
        this.vFlashCacheConfigInfo = vFlashCacheConfigInfo;
    }

    public ID getvDiskId() {
        return vDiskId;
    }

    public void setvDiskId(final ID vDiskId) {
        this.vDiskId = vDiskId;
    }

    public String[] getIofilter() {
        return iofilter;
    }

    public void setIofilter(final String[] iofilter) {
        this.iofilter = iofilter;
    }
}