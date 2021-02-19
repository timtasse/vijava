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
 * @version 7.0.1
 */
public class ConfigTarget extends DynamicData {

    private int numCpus;
    private int numCpuCores;
    private int numNumaNodes;
    private Integer maxCpusPerHost;
    private Boolean smcPresent;
    private VirtualMachineDatastoreInfo[] datastore;
    private VirtualMachineNetworkInfo[] network;
    private OpaqueNetworkTargetInfo[] opaqueNetwork;
    private DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup;
    private DistributedVirtualSwitchInfo[] distributedVirtualSwitch;
    private VirtualMachineCdromInfo[] cdRom;
    private VirtualMachineSerialInfo[] serial;
    private VirtualMachineParallelInfo[] parallel;
    private VirtualMachineSoundInfo[] sound;
    private VirtualMachineUsbInfo[] usb;
    private VirtualMachineFloppyInfo[] floppy;
    private VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo;
    private VirtualMachineScsiPassthroughInfo[] scsiPassthrough;
    private VirtualMachineScsiDiskDeviceInfo[] scsiDisk;
    private VirtualMachineIdeDiskDeviceInfo[] ideDisk;
    private int maxMemMBOptimalPerf;
    private Integer supportedMaxMemMB;
    private ResourcePoolRuntimeInfo resourcePool;
    private Boolean autoVmotion;
    private VirtualMachinePciPassthroughInfo[] pciPassthrough;
    private VirtualMachineSriovInfo[] sriov;
    private VirtualMachineVFlashModuleInfo[] vFlashModule;
    private VirtualMachinePciSharedGpuPassthroughInfo[] sharedGpuPassthroughTypes;
    private Long availablePersistentMemoryReservationMB;
    private VirtualMachineDynamicPassthroughInfo[] dynamicPassthrough;
    private VirtualMachineSgxTargetInfo sgxTargetInfo;
    private VirtualMachinePrecisionClockInfo[] precisionClockInfo;
    private Boolean sevSupported;

    @Override
    public String toString() {
        return "ConfigTarget{" +
                "numCpus=" + numCpus +
                ", numCpuCores=" + numCpuCores +
                ", numNumaNodes=" + numNumaNodes +
                ", maxCpusPerHost=" + maxCpusPerHost +
                ", smcPresent=" + smcPresent +
                ", datastore=" + Arrays.toString(datastore) +
                ", network=" + Arrays.toString(network) +
                ", opaqueNetwork=" + Arrays.toString(opaqueNetwork) +
                ", distributedVirtualPortgroup=" + Arrays.toString(distributedVirtualPortgroup) +
                ", distributedVirtualSwitch=" + Arrays.toString(distributedVirtualSwitch) +
                ", cdRom=" + Arrays.toString(cdRom) +
                ", serial=" + Arrays.toString(serial) +
                ", parallel=" + Arrays.toString(parallel) +
                ", sound=" + Arrays.toString(sound) +
                ", usb=" + Arrays.toString(usb) +
                ", floppy=" + Arrays.toString(floppy) +
                ", legacyNetworkInfo=" + Arrays.toString(legacyNetworkInfo) +
                ", scsiPassthrough=" + Arrays.toString(scsiPassthrough) +
                ", scsiDisk=" + Arrays.toString(scsiDisk) +
                ", ideDisk=" + Arrays.toString(ideDisk) +
                ", maxMemMBOptimalPerf=" + maxMemMBOptimalPerf +
                ", supportedMaxMemMB=" + supportedMaxMemMB +
                ", resourcePool=" + resourcePool +
                ", autoVmotion=" + autoVmotion +
                ", pciPassthrough=" + Arrays.toString(pciPassthrough) +
                ", sriov=" + Arrays.toString(sriov) +
                ", vFlashModule=" + Arrays.toString(vFlashModule) +
                ", sharedGpuPassthroughTypes=" + Arrays.toString(sharedGpuPassthroughTypes) +
                ", availablePersistentMemoryReservationMB=" + availablePersistentMemoryReservationMB +
                ", dynamicPassthrough=" + Arrays.toString(dynamicPassthrough) +
                ", sgxTargetInfo=" + sgxTargetInfo +
                ", precisionClockInfo=" + Arrays.toString(precisionClockInfo) +
                ", sevSupported=" + sevSupported +
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

    public Integer getMaxCpusPerHost() {
        return maxCpusPerHost;
    }

    public void setMaxCpusPerHost(final Integer maxCpusPerHost) {
        this.maxCpusPerHost = maxCpusPerHost;
    }

    public Integer getSupportedMaxMemMB() {
        return supportedMaxMemMB;
    }

    public void setSupportedMaxMemMB(final Integer supportedMaxMemMB) {
        this.supportedMaxMemMB = supportedMaxMemMB;
    }

    public VirtualMachineDynamicPassthroughInfo[] getDynamicPassthrough() {
        return dynamicPassthrough;
    }

    public void setDynamicPassthrough(final VirtualMachineDynamicPassthroughInfo[] dynamicPassthrough) {
        this.dynamicPassthrough = dynamicPassthrough;
    }

    public VirtualMachineSgxTargetInfo getSgxTargetInfo() {
        return sgxTargetInfo;
    }

    public void setSgxTargetInfo(final VirtualMachineSgxTargetInfo sgxTargetInfo) {
        this.sgxTargetInfo = sgxTargetInfo;
    }

    public VirtualMachinePrecisionClockInfo[] getPrecisionClockInfo() {
        return precisionClockInfo;
    }

    public void setPrecisionClockInfo(final VirtualMachinePrecisionClockInfo[] precisionClockInfo) {
        this.precisionClockInfo = precisionClockInfo;
    }

    public Boolean getSevSupported() {
        return sevSupported;
    }

    public void setSevSupported(final Boolean sevSupported) {
        this.sevSupported = sevSupported;
    }

}
