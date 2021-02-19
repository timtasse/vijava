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
 * Specification for moving or copying a virtual machine to a different datastore or host.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
public class VirtualMachineRelocateSpec extends DynamicData {

    private ServiceLocator service;
    private ManagedObjectReference folder;
    private ManagedObjectReference datastore;
    private String diskMoveType;
    private ManagedObjectReference pool;
    private ManagedObjectReference host;
    private VirtualMachineRelocateSpecDiskLocator[] disk;
    @Deprecated
    private VirtualMachineRelocateTransformation transform;
    private VirtualDeviceConfigSpec[] deviceChange;
    private VirtualMachineProfileSpec[] profile;
    private CryptoSpec cryptoSpec;

    @Override
    public String toString() {
        return "VirtualMachineRelocateSpec{" +
                "service=" + service +
                ", folder=" + folder +
                ", datastore=" + datastore +
                ", diskMoveType='" + diskMoveType + '\'' +
                ", pool=" + pool +
                ", host=" + host +
                ", disk=" + Arrays.toString(disk) +
                ", transform=" + transform +
                ", deviceChange=" + Arrays.toString(deviceChange) +
                ", profile=" + Arrays.toString(profile) +
                ", cryptoSpec=" + cryptoSpec +
                "} " + super.toString();
    }

    public ManagedObjectReference getDatastore() {
        return this.datastore;
    }

    public void setDatastore(ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public String getDiskMoveType() {
        return this.diskMoveType;
    }

    public void setDiskMoveType(String diskMoveType) {
        this.diskMoveType = diskMoveType;
    }

    public ManagedObjectReference getPool() {
        return this.pool;
    }

    public void setPool(ManagedObjectReference pool) {
        this.pool = pool;
    }

    public ManagedObjectReference getHost() {
        return this.host;
    }

    public void setHost(ManagedObjectReference host) {
        this.host = host;
    }

    public VirtualMachineRelocateSpecDiskLocator[] getDisk() {
        return this.disk;
    }

    public void setDisk(VirtualMachineRelocateSpecDiskLocator[] disk) {
        this.disk = disk;
    }

    @Deprecated
    public VirtualMachineRelocateTransformation getTransform() {
        return this.transform;
    }

    @Deprecated
    public void setTransform(VirtualMachineRelocateTransformation transform) {
        this.transform = transform;
    }

    public VirtualDeviceConfigSpec[] getDeviceChange() {
        return this.deviceChange;
    }

    public void setDeviceChange(VirtualDeviceConfigSpec[] deviceChange) {
        this.deviceChange = deviceChange;
    }

    public VirtualMachineProfileSpec[] getProfile() {
        return this.profile;
    }

    public void setProfile(VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

    public ManagedObjectReference getFolder() {
        return folder;
    }

    public void setFolder(final ManagedObjectReference folder) {
        this.folder = folder;
    }

    public ServiceLocator getService() {
        return service;
    }

    public void setService(final ServiceLocator service) {
        this.service = service;
    }

    public CryptoSpec getCryptoSpec() {
        return cryptoSpec;
    }

    public void setCryptoSpec(final CryptoSpec cryptoSpec) {
        this.cryptoSpec = cryptoSpec;
    }

}
