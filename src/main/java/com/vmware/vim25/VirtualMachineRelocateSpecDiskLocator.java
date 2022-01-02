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
import java.util.List;

/**
 * The DiskLocator data object type specifies a virtual disk device (by ID) and a datastore locator for the disk's storage.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2.1
 */
@SuppressWarnings("unused")
public class VirtualMachineRelocateSpecDiskLocator extends DynamicData {

    private int diskId;
    private ManagedObjectReference datastore;
    private String diskMoveType;
    private VirtualDeviceBackingInfo diskBackingInfo;
    private VirtualMachineProfileSpec[] profile;
    private VirtualMachineRelocateSpecDiskLocatorBackingSpec backing;
    private VirtualMachineBaseIndependentFilterSpec[] filterSpec;

    @Override
    public String toString() {
        return "VirtualMachineRelocateSpecDiskLocator{" +
                "diskId=" + diskId +
                ", datastore=" + datastore +
                ", diskMoveType='" + diskMoveType + '\'' +
                ", diskBackingInfo=" + diskBackingInfo +
                ", profile=" + Arrays.toString(profile) +
                ", backing=" + backing +
                ", filterSpec=" + Arrays.toString(filterSpec) +
                "} " + super.toString();
    }

    public int getDiskId() {
        return this.diskId;
    }

    public void setDiskId(final int diskId) {
        this.diskId = diskId;
    }

    public ManagedObjectReference getDatastore() {
        return this.datastore;
    }

    public void setDatastore(final ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public String getDiskMoveType() {
        return this.diskMoveType;
    }

    public void setDiskMoveType(final String diskMoveType) {
        this.diskMoveType = diskMoveType;
    }

    public VirtualDeviceBackingInfo getDiskBackingInfo() {
        return this.diskBackingInfo;
    }

    public void setDiskBackingInfo(final VirtualDeviceBackingInfo diskBackingInfo) {
        this.diskBackingInfo = diskBackingInfo;
    }

    public VirtualMachineProfileSpec[] getProfile() {
        return this.profile;
    }

    public void setProfile(final VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

    public VirtualMachineRelocateSpecDiskLocatorBackingSpec getBacking() {
        return backing;
    }

    public void setBacking(final VirtualMachineRelocateSpecDiskLocatorBackingSpec backing) {
        this.backing = backing;
    }

    public List<VirtualMachineBaseIndependentFilterSpec> getFilterSpec() {
        return Arrays.asList(filterSpec);
    }

    public void setFilterSpec(final List<VirtualMachineBaseIndependentFilterSpec> filterSpec) {
        this.filterSpec = filterSpec.toArray(new VirtualMachineBaseIndependentFilterSpec[0]);
    }

}
