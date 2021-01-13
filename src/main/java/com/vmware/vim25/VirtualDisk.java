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
 * This data object type contains information about a disk in a virtual machine.
 * The virtual disk backing object types describe the different virtual disk backings available. The disk format version in each case describes the version of the format that is used.
 *
 * Supported virtual disk backings:
 * Sparse disk format, version 1 and 2
 * The virtual disk backing grows when needed. Supported only for VMware Server.
 * Flat disk format, version 1 and 2
 * The virtual disk backing is preallocated. Version 1 is supported only for VMware Server.
 * Space efficient sparse disk format
 * The virtual disk backing grows on demand and incorporates additional space optimizations.
 * Raw disk format, version 2
 * The virtual disk backing uses a full physical disk drive to back the virtual disk. Supported only for VMware Server.
 * Partitioned raw disk format, version 2
 * The virtual disk backing uses one or more partitions on a physical disk drive to back a virtual disk. Supported only for VMware Server.
 * Raw disk mapping, version 1
 * The virtual disk backing uses a raw device mapping to back the virtual disk. Supported for ESX Server 2.5 and 3.x.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */
@SuppressWarnings("all")
public class VirtualDisk extends VirtualDevice {

    @Deprecated
    private Long capacityInKB;
    private Long capacityInBytes;
    @Deprecated
    private SharesInfo shares;
    @Deprecated
    private StorageIOAllocationInfo storageIOAllocation;
    @Deprecated
    private String diskObjectId;
    private VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo;
    private String[] iofilter;
    private ID vDiskId;
    private Boolean nativeUnmanagedLinkedClone;

    @Override
    public String toString() {
        return "VirtualDisk{" +
                "capacityInBytes=" + capacityInBytes +
                ", capacityInKB=" + capacityInKB +
                ", diskObjectId='" + diskObjectId + '\'' +
                ", iofilter=" + Arrays.toString(iofilter) +
                ", nativeUnmanagedLinkedClone=" + nativeUnmanagedLinkedClone +
                ", shares=" + shares +
                ", storageIOAllocation=" + storageIOAllocation +
                ", vDiskId=" + vDiskId +
                ", vFlashCacheConfigInfo=" + vFlashCacheConfigInfo +
                "} " + super.toString();
    }

    public Long getCapacityInBytes() {
        return capacityInBytes;
    }

    public void setCapacityInBytes(final Long capacityInBytes) {
        this.capacityInBytes = capacityInBytes;
        this.capacityInKB = (capacityInBytes/1024);
    }

    public String getDiskObjectId() {
        return diskObjectId;
    }

    public void setDiskObjectId(final String diskObjectId) {
        this.diskObjectId = diskObjectId;
    }

    public String[] getIofilter() {
        return iofilter;
    }

    public void setIofilter(final String[] iofilter) {
        this.iofilter = iofilter;
    }

    public Boolean getNativeUnmanagedLinkedClone() {
        return nativeUnmanagedLinkedClone;
    }

    public void setNativeUnmanagedLinkedClone(final Boolean nativeUnmanagedLinkedClone) {
        this.nativeUnmanagedLinkedClone = nativeUnmanagedLinkedClone;
    }

    public SharesInfo getShares() {
        return shares;
    }

    public void setShares(final SharesInfo shares) {
        this.shares = shares;
    }

    public StorageIOAllocationInfo getStorageIOAllocation() {
        return storageIOAllocation;
    }

    public void setStorageIOAllocation(final StorageIOAllocationInfo storageIOAllocation) {
        this.storageIOAllocation = storageIOAllocation;
    }

    public ID getvDiskId() {
        return vDiskId;
    }

    public void setvDiskId(final ID vDiskId) {
        this.vDiskId = vDiskId;
    }

    public VirtualDiskVFlashCacheConfigInfo getvFlashCacheConfigInfo() {
        return vFlashCacheConfigInfo;
    }

    public void setvFlashCacheConfigInfo(final VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo) {
        this.vFlashCacheConfigInfo = vFlashCacheConfigInfo;
    }

}
