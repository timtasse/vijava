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
import java.util.Collections;
import java.util.List;

/**
 * The ConfigTarget class contains information about "physical" devices that can be used to back virtual devices.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
public class ConfigTarget extends DynamicData {

    private int numCpus;
    private int numCpuCores;
    private int numNumaNodes;
    private Integer maxCpusPerHost;
    private Boolean smcPresent;
    private List<VirtualMachineDatastoreInfo> datastore;
    private List<VirtualMachineNetworkInfo> network;
    private List<OpaqueNetworkTargetInfo> opaqueNetwork;
    private List<DistributedVirtualPortgroupInfo> distributedVirtualPortgroup;
    private List<DistributedVirtualSwitchInfo> distributedVirtualSwitch;
    private List<VirtualMachineCdromInfo> cdRom;
    private List<VirtualMachineSerialInfo> serial;
    private List<VirtualMachineParallelInfo> parallel;
    private List<VirtualMachineSoundInfo> sound;
    private List<VirtualMachineUsbInfo> usb;
    private List<VirtualMachineFloppyInfo> floppy;
    private List<VirtualMachineLegacyNetworkSwitchInfo> legacyNetworkInfo;
    private List<VirtualMachineScsiPassthroughInfo> scsiPassthrough;
    private List<VirtualMachineScsiDiskDeviceInfo> scsiDisk;
    private List<VirtualMachineIdeDiskDeviceInfo> ideDisk;
    private int maxMemMBOptimalPerf;
    private Integer supportedMaxMemMB;
    private ResourcePoolRuntimeInfo resourcePool;
    private Boolean autoVmotion;
    private List<VirtualMachinePciPassthroughInfo> pciPassthrough = Collections.emptyList();
    private List<VirtualMachineSriovInfo> sriov = Collections.emptyList();
    private List<VirtualMachineVFlashModuleInfo> vFlashModule = Collections.emptyList();
    private List<VirtualMachinePciSharedGpuPassthroughInfo> sharedGpuPassthroughTypes = Collections.emptyList();
    private Long availablePersistentMemoryReservationMB;
    private List<VirtualMachineDynamicPassthroughInfo> dynamicPassthrough = Collections.emptyList();
    private VirtualMachineSgxTargetInfo sgxTargetInfo;
    private List<VirtualMachinePrecisionClockInfo> precisionClockInfo = Collections.emptyList();
    private Boolean sevSupported;
    private List<VirtualMachineVgpuDeviceInfo> vgpuDeviceInfo = Collections.emptyList();
    private List<VirtualMachineVgpuProfileInfo> vgpuProfileInfo = Collections.emptyList();
    private List<VirtualMachineVendorDeviceGroupInfo> vendorDeviceGroupInfo = Collections.emptyList();
    private Integer maxSimultaneousThreads;
    private List<VirtualMachineDvxClassInfo> dvxClassInfo = Collections.emptyList();

    @Override
    public String toString() {
        return "ConfigTarget{" +
                "numCpus=" + numCpus +
                ", numCpuCores=" + numCpuCores +
                ", numNumaNodes=" + numNumaNodes +
                ", maxCpusPerHost=" + maxCpusPerHost +
                ", smcPresent=" + smcPresent +
                ", datastore=" + datastore +
                ", network=" + network +
                ", opaqueNetwork=" + opaqueNetwork +
                ", distributedVirtualPortgroup=" + distributedVirtualPortgroup +
                ", distributedVirtualSwitch=" + distributedVirtualSwitch +
                ", cdRom=" + cdRom +
                ", serial=" + serial +
                ", parallel=" + parallel +
                ", sound=" + sound +
                ", usb=" + usb +
                ", floppy=" + floppy +
                ", legacyNetworkInfo=" + legacyNetworkInfo +
                ", scsiPassthrough=" + scsiPassthrough +
                ", scsiDisk=" + scsiDisk +
                ", ideDisk=" + ideDisk +
                ", maxMemMBOptimalPerf=" + maxMemMBOptimalPerf +
                ", supportedMaxMemMB=" + supportedMaxMemMB +
                ", resourcePool=" + resourcePool +
                ", autoVmotion=" + autoVmotion +
                ", pciPassthrough=" + pciPassthrough +
                ", sriov=" + sriov +
                ", vFlashModule=" + vFlashModule +
                ", sharedGpuPassthroughTypes=" + sharedGpuPassthroughTypes +
                ", availablePersistentMemoryReservationMB=" + availablePersistentMemoryReservationMB +
                ", dynamicPassthrough=" + dynamicPassthrough +
                ", sgxTargetInfo=" + sgxTargetInfo +
                ", precisionClockInfo=" + precisionClockInfo +
                ", sevSupported=" + sevSupported +
                ", vgpuDeviceInfo=" + vgpuDeviceInfo +
                ", vgpuProfileInfo=" + vgpuProfileInfo +
                ", vendorDeviceGroupInfo=" + vendorDeviceGroupInfo +
                ", maxSimultaneousThreads=" + maxSimultaneousThreads +
                ", dvxClassInfo=" + dvxClassInfo +
                '}';
    }

    public int getNumCpus() {
        return numCpus;
    }

    public void setNumCpus(final int numCpus) {
        this.numCpus = numCpus;
    }

    public int getNumCpuCores() {
        return numCpuCores;
    }

    public void setNumCpuCores(final int numCpuCores) {
        this.numCpuCores = numCpuCores;
    }

    public int getNumNumaNodes() {
        return numNumaNodes;
    }

    public void setNumNumaNodes(final int numNumaNodes) {
        this.numNumaNodes = numNumaNodes;
    }

    public Integer getMaxCpusPerHost() {
        return maxCpusPerHost;
    }

    public void setMaxCpusPerHost(final Integer maxCpusPerHost) {
        this.maxCpusPerHost = maxCpusPerHost;
    }

    public Boolean getSmcPresent() {
        return smcPresent;
    }

    public void setSmcPresent(final Boolean smcPresent) {
        this.smcPresent = smcPresent;
    }

    public List<VirtualMachineDatastoreInfo> getDatastore() {
        return datastore;
    }

    public void setDatastore(final List<VirtualMachineDatastoreInfo> datastore) {
        this.datastore = datastore;
    }

    public List<VirtualMachineNetworkInfo> getNetwork() {
        return network;
    }

    public void setNetwork(final List<VirtualMachineNetworkInfo> network) {
        this.network = network;
    }

    public List<OpaqueNetworkTargetInfo> getOpaqueNetwork() {
        return opaqueNetwork;
    }

    public void setOpaqueNetwork(final List<OpaqueNetworkTargetInfo> opaqueNetwork) {
        this.opaqueNetwork = opaqueNetwork;
    }

    public List<DistributedVirtualPortgroupInfo> getDistributedVirtualPortgroup() {
        return distributedVirtualPortgroup;
    }

    public void setDistributedVirtualPortgroup(final List<DistributedVirtualPortgroupInfo> distributedVirtualPortgroup) {
        this.distributedVirtualPortgroup = distributedVirtualPortgroup;
    }

    public List<DistributedVirtualSwitchInfo> getDistributedVirtualSwitch() {
        return distributedVirtualSwitch;
    }

    public void setDistributedVirtualSwitch(final List<DistributedVirtualSwitchInfo> distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }

    public List<VirtualMachineCdromInfo> getCdRom() {
        return cdRom;
    }

    public void setCdRom(final List<VirtualMachineCdromInfo> cdRom) {
        this.cdRom = cdRom;
    }

    public List<VirtualMachineSerialInfo> getSerial() {
        return serial;
    }

    public void setSerial(final List<VirtualMachineSerialInfo> serial) {
        this.serial = serial;
    }

    public List<VirtualMachineParallelInfo> getParallel() {
        return parallel;
    }

    public void setParallel(final List<VirtualMachineParallelInfo> parallel) {
        this.parallel = parallel;
    }

    public List<VirtualMachineSoundInfo> getSound() {
        return sound;
    }

    public void setSound(final List<VirtualMachineSoundInfo> sound) {
        this.sound = sound;
    }

    public List<VirtualMachineUsbInfo> getUsb() {
        return usb;
    }

    public void setUsb(final List<VirtualMachineUsbInfo> usb) {
        this.usb = usb;
    }

    public List<VirtualMachineFloppyInfo> getFloppy() {
        return floppy;
    }

    public void setFloppy(final List<VirtualMachineFloppyInfo> floppy) {
        this.floppy = floppy;
    }

    public List<VirtualMachineLegacyNetworkSwitchInfo> getLegacyNetworkInfo() {
        return legacyNetworkInfo;
    }

    public void setLegacyNetworkInfo(final List<VirtualMachineLegacyNetworkSwitchInfo> legacyNetworkInfo) {
        this.legacyNetworkInfo = legacyNetworkInfo;
    }

    public List<VirtualMachineScsiPassthroughInfo> getScsiPassthrough() {
        return scsiPassthrough;
    }

    public void setScsiPassthrough(final List<VirtualMachineScsiPassthroughInfo> scsiPassthrough) {
        this.scsiPassthrough = scsiPassthrough;
    }

    public List<VirtualMachineScsiDiskDeviceInfo> getScsiDisk() {
        return scsiDisk;
    }

    public void setScsiDisk(final List<VirtualMachineScsiDiskDeviceInfo> scsiDisk) {
        this.scsiDisk = scsiDisk;
    }

    public List<VirtualMachineIdeDiskDeviceInfo> getIdeDisk() {
        return ideDisk;
    }

    public void setIdeDisk(final List<VirtualMachineIdeDiskDeviceInfo> ideDisk) {
        this.ideDisk = ideDisk;
    }

    public int getMaxMemMBOptimalPerf() {
        return maxMemMBOptimalPerf;
    }

    public void setMaxMemMBOptimalPerf(final int maxMemMBOptimalPerf) {
        this.maxMemMBOptimalPerf = maxMemMBOptimalPerf;
    }

    public Integer getSupportedMaxMemMB() {
        return supportedMaxMemMB;
    }

    public void setSupportedMaxMemMB(final Integer supportedMaxMemMB) {
        this.supportedMaxMemMB = supportedMaxMemMB;
    }

    public ResourcePoolRuntimeInfo getResourcePool() {
        return resourcePool;
    }

    public void setResourcePool(final ResourcePoolRuntimeInfo resourcePool) {
        this.resourcePool = resourcePool;
    }

    public Boolean getAutoVmotion() {
        return autoVmotion;
    }

    public void setAutoVmotion(final Boolean autoVmotion) {
        this.autoVmotion = autoVmotion;
    }

    public List<VirtualMachinePciPassthroughInfo> getPciPassthrough() {
        return pciPassthrough;
    }

    public void setPciPassthrough(final List<VirtualMachinePciPassthroughInfo> pciPassthrough) {
        this.pciPassthrough = pciPassthrough;
    }

    public List<VirtualMachineSriovInfo> getSriov() {
        return sriov;
    }

    public void setSriov(final List<VirtualMachineSriovInfo> sriov) {
        this.sriov = sriov;
    }

    public List<VirtualMachineVFlashModuleInfo> getvFlashModule() {
        return vFlashModule;
    }

    public void setvFlashModule(final List<VirtualMachineVFlashModuleInfo> vFlashModule) {
        this.vFlashModule = vFlashModule;
    }

    public List<VirtualMachinePciSharedGpuPassthroughInfo> getSharedGpuPassthroughTypes() {
        return sharedGpuPassthroughTypes;
    }

    public void setSharedGpuPassthroughTypes(final List<VirtualMachinePciSharedGpuPassthroughInfo> sharedGpuPassthroughTypes) {
        this.sharedGpuPassthroughTypes = sharedGpuPassthroughTypes;
    }

    public Long getAvailablePersistentMemoryReservationMB() {
        return availablePersistentMemoryReservationMB;
    }

    public void setAvailablePersistentMemoryReservationMB(final Long availablePersistentMemoryReservationMB) {
        this.availablePersistentMemoryReservationMB = availablePersistentMemoryReservationMB;
    }

    public List<VirtualMachineDynamicPassthroughInfo> getDynamicPassthrough() {
        return dynamicPassthrough;
    }

    public void setDynamicPassthrough(final List<VirtualMachineDynamicPassthroughInfo> dynamicPassthrough) {
        this.dynamicPassthrough = dynamicPassthrough;
    }

    public VirtualMachineSgxTargetInfo getSgxTargetInfo() {
        return sgxTargetInfo;
    }

    public void setSgxTargetInfo(final VirtualMachineSgxTargetInfo sgxTargetInfo) {
        this.sgxTargetInfo = sgxTargetInfo;
    }

    public List<VirtualMachinePrecisionClockInfo> getPrecisionClockInfo() {
        return precisionClockInfo;
    }

    public void setPrecisionClockInfo(final List<VirtualMachinePrecisionClockInfo> precisionClockInfo) {
        this.precisionClockInfo = precisionClockInfo;
    }

    public Boolean getSevSupported() {
        return sevSupported;
    }

    public void setSevSupported(final Boolean sevSupported) {
        this.sevSupported = sevSupported;
    }

    public List<VirtualMachineVgpuDeviceInfo> getVgpuDeviceInfo() {
        return vgpuDeviceInfo;
    }

    public void setVgpuDeviceInfo(final List<VirtualMachineVgpuDeviceInfo> vgpuDeviceInfo) {
        this.vgpuDeviceInfo = vgpuDeviceInfo;
    }

    public List<VirtualMachineVgpuProfileInfo> getVgpuProfileInfo() {
        return vgpuProfileInfo;
    }

    public void setVgpuProfileInfo(final List<VirtualMachineVgpuProfileInfo> vgpuProfileInfo) {
        this.vgpuProfileInfo = vgpuProfileInfo;
    }

    public List<VirtualMachineVendorDeviceGroupInfo> getVendorDeviceGroupInfo() {
        return vendorDeviceGroupInfo;
    }

    public void setVendorDeviceGroupInfo(final List<VirtualMachineVendorDeviceGroupInfo> vendorDeviceGroupInfo) {
        this.vendorDeviceGroupInfo = vendorDeviceGroupInfo;
    }

    public Integer getMaxSimultaneousThreads() {
        return maxSimultaneousThreads;
    }

    public void setMaxSimultaneousThreads(final Integer maxSimultaneousThreads) {
        this.maxSimultaneousThreads = maxSimultaneousThreads;
    }

    public List<VirtualMachineDvxClassInfo> getDvxClassInfo() {
        return dvxClassInfo;
    }

    public void setDvxClassInfo(final List<VirtualMachineDvxClassInfo> dvxClassInfo) {
        this.dvxClassInfo = dvxClassInfo;
    }

}
