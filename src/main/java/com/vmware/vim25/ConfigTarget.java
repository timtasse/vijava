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
 * The ConfigTarget class contains information about "physical" devices that can be used to back virtual devices.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */

public class ConfigTarget extends DynamicData {

    private Boolean autoVmotion;
    private Long availablePersistentMemoryReservationMB;
    private VirtualMachineCdromInfo[] cdRom;
    private VirtualMachineDatastoreInfo[] datastore;
    private DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup;
    private DistributedVirtualSwitchInfo[] distributedVirtualSwitch;
    private VirtualMachineFloppyInfo[] floppy;
    private VirtualMachineIdeDiskDeviceInfo[] ideDisk;
    private VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo;
    private int maxMemMBOptimalPerf;
    private VirtualMachineNetworkInfo[] network;
    private int numCpuCores;
    private int numCpus;
    private int numNumaNodes;
    private OpaqueNetworkTargetInfo[] opaqueNetwork;
    private VirtualMachineParallelInfo[] parallel;
    private VirtualMachinePciPassthroughInfo[] pciPassthrough;
    private ResourcePoolRuntimeInfo resourcePool;
    private VirtualMachineScsiDiskDeviceInfo[] scsiDisk;
    private VirtualMachineScsiPassthroughInfo[] scsiPassthrough;
    private VirtualMachineSerialInfo[] serial;
    private VirtualMachinePciSharedGpuPassthroughInfo[] sharedGpuPassthroughTypes;
    private Boolean smcPresent;
    private VirtualMachineSoundInfo[] sound;
    private VirtualMachineSriovInfo[] sriov;
    private VirtualMachineUsbInfo[] usb;
    private VirtualMachineVFlashModuleInfo[] vFlashModule;

    @Override
    public String toString() {
        return "ConfigTarget{" +
                "autoVmotion=" + autoVmotion +
                ", availablePersistentMemoryReservationMB=" + availablePersistentMemoryReservationMB +
                ", cdRom=" + Arrays.toString(cdRom) +
                ", datastore=" + Arrays.toString(datastore) +
                ", distributedVirtualPortgroup=" + Arrays.toString(distributedVirtualPortgroup) +
                ", distributedVirtualSwitch=" + Arrays.toString(distributedVirtualSwitch) +
                ", floppy=" + Arrays.toString(floppy) +
                ", ideDisk=" + Arrays.toString(ideDisk) +
                ", legacyNetworkInfo=" + Arrays.toString(legacyNetworkInfo) +
                ", maxMemMBOptimalPerf=" + maxMemMBOptimalPerf +
                ", network=" + Arrays.toString(network) +
                ", numCpuCores=" + numCpuCores +
                ", numCpus=" + numCpus +
                ", numNumaNodes=" + numNumaNodes +
                ", opaqueNetwork=" + Arrays.toString(opaqueNetwork) +
                ", parallel=" + Arrays.toString(parallel) +
                ", pciPassthrough=" + Arrays.toString(pciPassthrough) +
                ", resourcePool=" + resourcePool +
                ", scsiDisk=" + Arrays.toString(scsiDisk) +
                ", scsiPassthrough=" + Arrays.toString(scsiPassthrough) +
                ", serial=" + Arrays.toString(serial) +
                ", sharedGpuPassthroughTypes=" + Arrays.toString(sharedGpuPassthroughTypes) +
                ", smcPresent=" + smcPresent +
                ", sound=" + Arrays.toString(sound) +
                ", sriov=" + Arrays.toString(sriov) +
                ", usb=" + Arrays.toString(usb) +
                ", vFlashModule=" + Arrays.toString(vFlashModule) +
                "} " + super.toString();
    }

    public Boolean getAutoVmotion() {
        return autoVmotion;
    }

    public void setAutoVmotion(final Boolean autoVmotion) {
        this.autoVmotion = autoVmotion;
    }

    public Long getAvailablePersistentMemoryReservationMB() {
        return availablePersistentMemoryReservationMB;
    }

    public void setAvailablePersistentMemoryReservationMB(final Long availablePersistentMemoryReservationMB) {
        this.availablePersistentMemoryReservationMB = availablePersistentMemoryReservationMB;
    }

    public VirtualMachineCdromInfo[] getCdRom() {
        return cdRom;
    }

    public void setCdRom(final VirtualMachineCdromInfo[] cdRom) {
        this.cdRom = cdRom;
    }

    public VirtualMachineDatastoreInfo[] getDatastore() {
        return datastore;
    }

    public void setDatastore(final VirtualMachineDatastoreInfo[] datastore) {
        this.datastore = datastore;
    }

    public DistributedVirtualPortgroupInfo[] getDistributedVirtualPortgroup() {
        return distributedVirtualPortgroup;
    }

    public void setDistributedVirtualPortgroup(final DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup) {
        this.distributedVirtualPortgroup = distributedVirtualPortgroup;
    }

    public DistributedVirtualSwitchInfo[] getDistributedVirtualSwitch() {
        return distributedVirtualSwitch;
    }

    public void setDistributedVirtualSwitch(final DistributedVirtualSwitchInfo[] distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }

    public VirtualMachineFloppyInfo[] getFloppy() {
        return floppy;
    }

    public void setFloppy(final VirtualMachineFloppyInfo[] floppy) {
        this.floppy = floppy;
    }

    public VirtualMachineIdeDiskDeviceInfo[] getIdeDisk() {
        return ideDisk;
    }

    public void setIdeDisk(final VirtualMachineIdeDiskDeviceInfo[] ideDisk) {
        this.ideDisk = ideDisk;
    }

    public VirtualMachineLegacyNetworkSwitchInfo[] getLegacyNetworkInfo() {
        return legacyNetworkInfo;
    }

    public void setLegacyNetworkInfo(final VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo) {
        this.legacyNetworkInfo = legacyNetworkInfo;
    }

    public int getMaxMemMBOptimalPerf() {
        return maxMemMBOptimalPerf;
    }

    public void setMaxMemMBOptimalPerf(final int maxMemMBOptimalPerf) {
        this.maxMemMBOptimalPerf = maxMemMBOptimalPerf;
    }

    public VirtualMachineNetworkInfo[] getNetwork() {
        return network;
    }

    public void setNetwork(final VirtualMachineNetworkInfo[] network) {
        this.network = network;
    }

    public int getNumCpuCores() {
        return numCpuCores;
    }

    public void setNumCpuCores(final int numCpuCores) {
        this.numCpuCores = numCpuCores;
    }

    public int getNumCpus() {
        return numCpus;
    }

    public void setNumCpus(final int numCpus) {
        this.numCpus = numCpus;
    }

    public int getNumNumaNodes() {
        return numNumaNodes;
    }

    public void setNumNumaNodes(final int numNumaNodes) {
        this.numNumaNodes = numNumaNodes;
    }

    public OpaqueNetworkTargetInfo[] getOpaqueNetwork() {
        return opaqueNetwork;
    }

    public void setOpaqueNetwork(final OpaqueNetworkTargetInfo[] opaqueNetwork) {
        this.opaqueNetwork = opaqueNetwork;
    }

    public VirtualMachineParallelInfo[] getParallel() {
        return parallel;
    }

    public void setParallel(final VirtualMachineParallelInfo[] parallel) {
        this.parallel = parallel;
    }

    public VirtualMachinePciPassthroughInfo[] getPciPassthrough() {
        return pciPassthrough;
    }

    public void setPciPassthrough(final VirtualMachinePciPassthroughInfo[] pciPassthrough) {
        this.pciPassthrough = pciPassthrough;
    }

    public ResourcePoolRuntimeInfo getResourcePool() {
        return resourcePool;
    }

    public void setResourcePool(final ResourcePoolRuntimeInfo resourcePool) {
        this.resourcePool = resourcePool;
    }

    public VirtualMachineScsiDiskDeviceInfo[] getScsiDisk() {
        return scsiDisk;
    }

    public void setScsiDisk(final VirtualMachineScsiDiskDeviceInfo[] scsiDisk) {
        this.scsiDisk = scsiDisk;
    }

    public VirtualMachineScsiPassthroughInfo[] getScsiPassthrough() {
        return scsiPassthrough;
    }

    public void setScsiPassthrough(final VirtualMachineScsiPassthroughInfo[] scsiPassthrough) {
        this.scsiPassthrough = scsiPassthrough;
    }

    public VirtualMachineSerialInfo[] getSerial() {
        return serial;
    }

    public void setSerial(final VirtualMachineSerialInfo[] serial) {
        this.serial = serial;
    }

    public VirtualMachinePciSharedGpuPassthroughInfo[] getSharedGpuPassthroughTypes() {
        return sharedGpuPassthroughTypes;
    }

    public void setSharedGpuPassthroughTypes(final VirtualMachinePciSharedGpuPassthroughInfo[] sharedGpuPassthroughTypes) {
        this.sharedGpuPassthroughTypes = sharedGpuPassthroughTypes;
    }

    public Boolean getSmcPresent() {
        return smcPresent;
    }

    public void setSmcPresent(final Boolean smcPresent) {
        this.smcPresent = smcPresent;
    }

    public VirtualMachineSoundInfo[] getSound() {
        return sound;
    }

    public void setSound(final VirtualMachineSoundInfo[] sound) {
        this.sound = sound;
    }

    public VirtualMachineSriovInfo[] getSriov() {
        return sriov;
    }

    public void setSriov(final VirtualMachineSriovInfo[] sriov) {
        this.sriov = sriov;
    }

    public VirtualMachineUsbInfo[] getUsb() {
        return usb;
    }

    public void setUsb(final VirtualMachineUsbInfo[] usb) {
        this.usb = usb;
    }

    public VirtualMachineVFlashModuleInfo[] getvFlashModule() {
        return vFlashModule;
    }

    public void setvFlashModule(final VirtualMachineVFlashModuleInfo[] vFlashModule) {
        this.vFlashModule = vFlashModule;
    }

}
