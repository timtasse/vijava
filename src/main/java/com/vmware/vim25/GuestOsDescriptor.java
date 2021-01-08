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
 * This data object type contains information to describe a particular guest operating system.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.7
 */
public class GuestOsDescriptor extends DynamicData {

    private HostCpuIdInfo[] cpuFeatureMask;
    private Boolean defaultSecureBoot;
    private boolean diskUuidEnabled;
    private String family;
    private String fullName;
    private Boolean ich7mRecommended;
    private String id;
    private Integer numRecommendedCoresPerSocket;
    private Integer numRecommendedPhysicalSockets;
    private int numSupportedCoresPerSocket;
    private int numSupportedFloppyDevices;
    private int numSupportedPhysicalSockets;
    private Long persistentMemoryColdGrowthGranularityMB;
    private Boolean persistentMemoryColdGrowthSupported;
    private Boolean persistentMemoryHotAddSupported;
    private Long persistentMemoryHotGrowthGranularityMB;
    private Boolean persistentMemoryHotGrowthSupported;
    private Boolean persistentMemoryHotRemoveSupported;
    private Boolean persistentMemorySupported;
    private boolean recommended3D;
    private String recommendedCdromController;
    private int recommendedColorDepth;
    private String recommendedDiskController;
    private int recommendedDiskSizeMB;
    private String recommendedEthernetCard;
    private String recommendedFirmware;
    private int recommendedMemMB;
    private Long recommendedPersistentMemoryMB;
    private String recommendedSCSIController;
    private String recommendedUSBController;
    private boolean smcRecommended;
    private boolean smcRequired;
    private String[] supportedDiskControllerList;
    private String[] supportedEthernetCard;
    private String[] supportedFirmware;
    private boolean supportedForCreate;
    private int supportedMaxCPUs;
    private int supportedMaxMemMB;
    private Long supportedMaxPersistentMemoryMB;
    private int supportedMinMemMB;
    private Long supportedMinPersistentMemoryMB;
    private int supportedNumDisks;
    private String[] supportedUSBControllerList;
    private String supportLevel;
    private boolean supports3D;
    private boolean supportsCpuHotAdd;
    private boolean supportsCpuHotRemove;
    private boolean supportsHotPlugPCI;
    private boolean supportsMemoryHotAdd;
    private boolean supportsPvscsiControllerForBoot;
    private Boolean supportsSecureBoot;
    private Boolean supportsSlaveDisk;
    private Boolean supportsTPM20;
    private boolean supportsVMI;
    private boolean supportsWakeOnLan;
    private boolean usbRecommended;
    private BoolOption vbsSupported;
    private IntOption vRAMSizeInKB;
    private BoolOption vvtdSupported;
    private String[] wakeOnLanEthernetCard;

    @Override
    public String toString() {
        return "GuestOsDescriptor{" +
                "cpuFeatureMask=" + Arrays.toString(cpuFeatureMask) +
                ", defaultSecureBoot=" + defaultSecureBoot +
                ", diskUuidEnabled=" + diskUuidEnabled +
                ", family='" + family + '\'' +
                ", fullName='" + fullName + '\'' +
                ", ich7mRecommended=" + ich7mRecommended +
                ", id='" + id + '\'' +
                ", numRecommendedCoresPerSocket=" + numRecommendedCoresPerSocket +
                ", numRecommendedPhysicalSockets=" + numRecommendedPhysicalSockets +
                ", numSupportedCoresPerSocket=" + numSupportedCoresPerSocket +
                ", numSupportedFloppyDevices=" + numSupportedFloppyDevices +
                ", numSupportedPhysicalSockets=" + numSupportedPhysicalSockets +
                ", persistentMemoryColdGrowthGranularityMB=" + persistentMemoryColdGrowthGranularityMB +
                ", persistentMemoryColdGrowthSupported=" + persistentMemoryColdGrowthSupported +
                ", persistentMemoryHotAddSupported=" + persistentMemoryHotAddSupported +
                ", persistentMemoryHotGrowthGranularityMB=" + persistentMemoryHotGrowthGranularityMB +
                ", persistentMemoryHotGrowthSupported=" + persistentMemoryHotGrowthSupported +
                ", persistentMemoryHotRemoveSupported=" + persistentMemoryHotRemoveSupported +
                ", persistentMemorySupported=" + persistentMemorySupported +
                ", recommended3D=" + recommended3D +
                ", recommendedCdromController='" + recommendedCdromController + '\'' +
                ", recommendedColorDepth=" + recommendedColorDepth +
                ", recommendedDiskController='" + recommendedDiskController + '\'' +
                ", recommendedDiskSizeMB=" + recommendedDiskSizeMB +
                ", recommendedEthernetCard='" + recommendedEthernetCard + '\'' +
                ", recommendedFirmware='" + recommendedFirmware + '\'' +
                ", recommendedMemMB=" + recommendedMemMB +
                ", recommendedPersistentMemoryMB=" + recommendedPersistentMemoryMB +
                ", recommendedSCSIController='" + recommendedSCSIController + '\'' +
                ", recommendedUSBController='" + recommendedUSBController + '\'' +
                ", smcRecommended=" + smcRecommended +
                ", smcRequired=" + smcRequired +
                ", supportedDiskControllerList=" + Arrays.toString(supportedDiskControllerList) +
                ", supportedEthernetCard=" + Arrays.toString(supportedEthernetCard) +
                ", supportedFirmware=" + Arrays.toString(supportedFirmware) +
                ", supportedForCreate=" + supportedForCreate +
                ", supportedMaxCPUs=" + supportedMaxCPUs +
                ", supportedMaxMemMB=" + supportedMaxMemMB +
                ", supportedMaxPersistentMemoryMB=" + supportedMaxPersistentMemoryMB +
                ", supportedMinMemMB=" + supportedMinMemMB +
                ", supportedMinPersistentMemoryMB=" + supportedMinPersistentMemoryMB +
                ", supportedNumDisks=" + supportedNumDisks +
                ", supportedUSBControllerList=" + Arrays.toString(supportedUSBControllerList) +
                ", supportLevel='" + supportLevel + '\'' +
                ", supports3D=" + supports3D +
                ", supportsCpuHotAdd=" + supportsCpuHotAdd +
                ", supportsCpuHotRemove=" + supportsCpuHotRemove +
                ", supportsHotPlugPCI=" + supportsHotPlugPCI +
                ", supportsMemoryHotAdd=" + supportsMemoryHotAdd +
                ", supportsPvscsiControllerForBoot=" + supportsPvscsiControllerForBoot +
                ", supportsSecureBoot=" + supportsSecureBoot +
                ", supportsSlaveDisk=" + supportsSlaveDisk +
                ", supportsTPM20=" + supportsTPM20 +
                ", supportsVMI=" + supportsVMI +
                ", supportsWakeOnLan=" + supportsWakeOnLan +
                ", usbRecommended=" + usbRecommended +
                ", vbsSupported=" + vbsSupported +
                ", vRAMSizeInKB=" + vRAMSizeInKB +
                ", vvtdSupported=" + vvtdSupported +
                ", wakeOnLanEthernetCard=" + Arrays.toString(wakeOnLanEthernetCard) +
                "} " + super.toString();
    }

    public HostCpuIdInfo[] getCpuFeatureMask() {
        return cpuFeatureMask;
    }

    public void setCpuFeatureMask(final HostCpuIdInfo[] cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public Boolean getDefaultSecureBoot() {
        return defaultSecureBoot;
    }

    public void setDefaultSecureBoot(final Boolean defaultSecureBoot) {
        this.defaultSecureBoot = defaultSecureBoot;
    }

    public boolean isDiskUuidEnabled() {
        return diskUuidEnabled;
    }

    public void setDiskUuidEnabled(final boolean diskUuidEnabled) {
        this.diskUuidEnabled = diskUuidEnabled;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(final String family) {
        this.family = family;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public Boolean getIch7mRecommended() {
        return ich7mRecommended;
    }

    public void setIch7mRecommended(final Boolean ich7mRecommended) {
        this.ich7mRecommended = ich7mRecommended;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Integer getNumRecommendedCoresPerSocket() {
        return numRecommendedCoresPerSocket;
    }

    public void setNumRecommendedCoresPerSocket(final Integer numRecommendedCoresPerSocket) {
        this.numRecommendedCoresPerSocket = numRecommendedCoresPerSocket;
    }

    public Integer getNumRecommendedPhysicalSockets() {
        return numRecommendedPhysicalSockets;
    }

    public void setNumRecommendedPhysicalSockets(final Integer numRecommendedPhysicalSockets) {
        this.numRecommendedPhysicalSockets = numRecommendedPhysicalSockets;
    }

    public int getNumSupportedCoresPerSocket() {
        return numSupportedCoresPerSocket;
    }

    public void setNumSupportedCoresPerSocket(final int numSupportedCoresPerSocket) {
        this.numSupportedCoresPerSocket = numSupportedCoresPerSocket;
    }

    public int getNumSupportedFloppyDevices() {
        return numSupportedFloppyDevices;
    }

    public void setNumSupportedFloppyDevices(final int numSupportedFloppyDevices) {
        this.numSupportedFloppyDevices = numSupportedFloppyDevices;
    }

    public int getNumSupportedPhysicalSockets() {
        return numSupportedPhysicalSockets;
    }

    public void setNumSupportedPhysicalSockets(final int numSupportedPhysicalSockets) {
        this.numSupportedPhysicalSockets = numSupportedPhysicalSockets;
    }

    public Long getPersistentMemoryColdGrowthGranularityMB() {
        return persistentMemoryColdGrowthGranularityMB;
    }

    public void setPersistentMemoryColdGrowthGranularityMB(final Long persistentMemoryColdGrowthGranularityMB) {
        this.persistentMemoryColdGrowthGranularityMB = persistentMemoryColdGrowthGranularityMB;
    }

    public Boolean getPersistentMemoryColdGrowthSupported() {
        return persistentMemoryColdGrowthSupported;
    }

    public void setPersistentMemoryColdGrowthSupported(final Boolean persistentMemoryColdGrowthSupported) {
        this.persistentMemoryColdGrowthSupported = persistentMemoryColdGrowthSupported;
    }

    public Boolean getPersistentMemoryHotAddSupported() {
        return persistentMemoryHotAddSupported;
    }

    public void setPersistentMemoryHotAddSupported(final Boolean persistentMemoryHotAddSupported) {
        this.persistentMemoryHotAddSupported = persistentMemoryHotAddSupported;
    }

    public Long getPersistentMemoryHotGrowthGranularityMB() {
        return persistentMemoryHotGrowthGranularityMB;
    }

    public void setPersistentMemoryHotGrowthGranularityMB(final Long persistentMemoryHotGrowthGranularityMB) {
        this.persistentMemoryHotGrowthGranularityMB = persistentMemoryHotGrowthGranularityMB;
    }

    public Boolean getPersistentMemoryHotGrowthSupported() {
        return persistentMemoryHotGrowthSupported;
    }

    public void setPersistentMemoryHotGrowthSupported(final Boolean persistentMemoryHotGrowthSupported) {
        this.persistentMemoryHotGrowthSupported = persistentMemoryHotGrowthSupported;
    }

    public Boolean getPersistentMemoryHotRemoveSupported() {
        return persistentMemoryHotRemoveSupported;
    }

    public void setPersistentMemoryHotRemoveSupported(final Boolean persistentMemoryHotRemoveSupported) {
        this.persistentMemoryHotRemoveSupported = persistentMemoryHotRemoveSupported;
    }

    public Boolean getPersistentMemorySupported() {
        return persistentMemorySupported;
    }

    public void setPersistentMemorySupported(final Boolean persistentMemorySupported) {
        this.persistentMemorySupported = persistentMemorySupported;
    }

    public boolean isRecommended3D() {
        return recommended3D;
    }

    public void setRecommended3D(final boolean recommended3D) {
        this.recommended3D = recommended3D;
    }

    public String getRecommendedCdromController() {
        return recommendedCdromController;
    }

    public void setRecommendedCdromController(final String recommendedCdromController) {
        this.recommendedCdromController = recommendedCdromController;
    }

    public int getRecommendedColorDepth() {
        return recommendedColorDepth;
    }

    public void setRecommendedColorDepth(final int recommendedColorDepth) {
        this.recommendedColorDepth = recommendedColorDepth;
    }

    public String getRecommendedDiskController() {
        return recommendedDiskController;
    }

    public void setRecommendedDiskController(final String recommendedDiskController) {
        this.recommendedDiskController = recommendedDiskController;
    }

    public int getRecommendedDiskSizeMB() {
        return recommendedDiskSizeMB;
    }

    public void setRecommendedDiskSizeMB(final int recommendedDiskSizeMB) {
        this.recommendedDiskSizeMB = recommendedDiskSizeMB;
    }

    public String getRecommendedEthernetCard() {
        return recommendedEthernetCard;
    }

    public void setRecommendedEthernetCard(final String recommendedEthernetCard) {
        this.recommendedEthernetCard = recommendedEthernetCard;
    }

    public String getRecommendedFirmware() {
        return recommendedFirmware;
    }

    public void setRecommendedFirmware(final String recommendedFirmware) {
        this.recommendedFirmware = recommendedFirmware;
    }

    public int getRecommendedMemMB() {
        return recommendedMemMB;
    }

    public void setRecommendedMemMB(final int recommendedMemMB) {
        this.recommendedMemMB = recommendedMemMB;
    }

    public Long getRecommendedPersistentMemoryMB() {
        return recommendedPersistentMemoryMB;
    }

    public void setRecommendedPersistentMemoryMB(final Long recommendedPersistentMemoryMB) {
        this.recommendedPersistentMemoryMB = recommendedPersistentMemoryMB;
    }

    public String getRecommendedSCSIController() {
        return recommendedSCSIController;
    }

    public void setRecommendedSCSIController(final String recommendedSCSIController) {
        this.recommendedSCSIController = recommendedSCSIController;
    }

    public String getRecommendedUSBController() {
        return recommendedUSBController;
    }

    public void setRecommendedUSBController(final String recommendedUSBController) {
        this.recommendedUSBController = recommendedUSBController;
    }

    public boolean isSmcRecommended() {
        return smcRecommended;
    }

    public void setSmcRecommended(final boolean smcRecommended) {
        this.smcRecommended = smcRecommended;
    }

    public boolean isSmcRequired() {
        return smcRequired;
    }

    public void setSmcRequired(final boolean smcRequired) {
        this.smcRequired = smcRequired;
    }

    public String[] getSupportedDiskControllerList() {
        return supportedDiskControllerList;
    }

    public void setSupportedDiskControllerList(final String[] supportedDiskControllerList) {
        this.supportedDiskControllerList = supportedDiskControllerList;
    }

    public String[] getSupportedEthernetCard() {
        return supportedEthernetCard;
    }

    public void setSupportedEthernetCard(final String[] supportedEthernetCard) {
        this.supportedEthernetCard = supportedEthernetCard;
    }

    public String[] getSupportedFirmware() {
        return supportedFirmware;
    }

    public void setSupportedFirmware(final String[] supportedFirmware) {
        this.supportedFirmware = supportedFirmware;
    }

    public boolean isSupportedForCreate() {
        return supportedForCreate;
    }

    public void setSupportedForCreate(final boolean supportedForCreate) {
        this.supportedForCreate = supportedForCreate;
    }

    public int getSupportedMaxCPUs() {
        return supportedMaxCPUs;
    }

    public void setSupportedMaxCPUs(final int supportedMaxCPUs) {
        this.supportedMaxCPUs = supportedMaxCPUs;
    }

    public int getSupportedMaxMemMB() {
        return supportedMaxMemMB;
    }

    public void setSupportedMaxMemMB(final int supportedMaxMemMB) {
        this.supportedMaxMemMB = supportedMaxMemMB;
    }

    public Long getSupportedMaxPersistentMemoryMB() {
        return supportedMaxPersistentMemoryMB;
    }

    public void setSupportedMaxPersistentMemoryMB(final Long supportedMaxPersistentMemoryMB) {
        this.supportedMaxPersistentMemoryMB = supportedMaxPersistentMemoryMB;
    }

    public int getSupportedMinMemMB() {
        return supportedMinMemMB;
    }

    public void setSupportedMinMemMB(final int supportedMinMemMB) {
        this.supportedMinMemMB = supportedMinMemMB;
    }

    public Long getSupportedMinPersistentMemoryMB() {
        return supportedMinPersistentMemoryMB;
    }

    public void setSupportedMinPersistentMemoryMB(final Long supportedMinPersistentMemoryMB) {
        this.supportedMinPersistentMemoryMB = supportedMinPersistentMemoryMB;
    }

    public int getSupportedNumDisks() {
        return supportedNumDisks;
    }

    public void setSupportedNumDisks(final int supportedNumDisks) {
        this.supportedNumDisks = supportedNumDisks;
    }

    public String[] getSupportedUSBControllerList() {
        return supportedUSBControllerList;
    }

    public void setSupportedUSBControllerList(final String[] supportedUSBControllerList) {
        this.supportedUSBControllerList = supportedUSBControllerList;
    }

    public String getSupportLevel() {
        return supportLevel;
    }

    public void setSupportLevel(final String supportLevel) {
        this.supportLevel = supportLevel;
    }

    public boolean isSupports3D() {
        return supports3D;
    }

    public void setSupports3D(final boolean supports3D) {
        this.supports3D = supports3D;
    }

    public boolean isSupportsCpuHotAdd() {
        return supportsCpuHotAdd;
    }

    public void setSupportsCpuHotAdd(final boolean supportsCpuHotAdd) {
        this.supportsCpuHotAdd = supportsCpuHotAdd;
    }

    public boolean isSupportsCpuHotRemove() {
        return supportsCpuHotRemove;
    }

    public void setSupportsCpuHotRemove(final boolean supportsCpuHotRemove) {
        this.supportsCpuHotRemove = supportsCpuHotRemove;
    }

    public boolean isSupportsHotPlugPCI() {
        return supportsHotPlugPCI;
    }

    public void setSupportsHotPlugPCI(final boolean supportsHotPlugPCI) {
        this.supportsHotPlugPCI = supportsHotPlugPCI;
    }

    public boolean isSupportsMemoryHotAdd() {
        return supportsMemoryHotAdd;
    }

    public void setSupportsMemoryHotAdd(final boolean supportsMemoryHotAdd) {
        this.supportsMemoryHotAdd = supportsMemoryHotAdd;
    }

    public boolean isSupportsPvscsiControllerForBoot() {
        return supportsPvscsiControllerForBoot;
    }

    public void setSupportsPvscsiControllerForBoot(final boolean supportsPvscsiControllerForBoot) {
        this.supportsPvscsiControllerForBoot = supportsPvscsiControllerForBoot;
    }

    public Boolean getSupportsSecureBoot() {
        return supportsSecureBoot;
    }

    public void setSupportsSecureBoot(final Boolean supportsSecureBoot) {
        this.supportsSecureBoot = supportsSecureBoot;
    }

    public Boolean getSupportsSlaveDisk() {
        return supportsSlaveDisk;
    }

    public void setSupportsSlaveDisk(final Boolean supportsSlaveDisk) {
        this.supportsSlaveDisk = supportsSlaveDisk;
    }

    public Boolean getSupportsTPM20() {
        return supportsTPM20;
    }

    public void setSupportsTPM20(final Boolean supportsTPM20) {
        this.supportsTPM20 = supportsTPM20;
    }

    public boolean isSupportsVMI() {
        return supportsVMI;
    }

    public void setSupportsVMI(final boolean supportsVMI) {
        this.supportsVMI = supportsVMI;
    }

    public boolean isSupportsWakeOnLan() {
        return supportsWakeOnLan;
    }

    public void setSupportsWakeOnLan(final boolean supportsWakeOnLan) {
        this.supportsWakeOnLan = supportsWakeOnLan;
    }

    public boolean isUsbRecommended() {
        return usbRecommended;
    }

    public void setUsbRecommended(final boolean usbRecommended) {
        this.usbRecommended = usbRecommended;
    }

    public BoolOption getVbsSupported() {
        return vbsSupported;
    }

    public void setVbsSupported(final BoolOption vbsSupported) {
        this.vbsSupported = vbsSupported;
    }

    public IntOption getvRAMSizeInKB() {
        return vRAMSizeInKB;
    }

    public void setvRAMSizeInKB(final IntOption vRAMSizeInKB) {
        this.vRAMSizeInKB = vRAMSizeInKB;
    }

    public BoolOption getVvtdSupported() {
        return vvtdSupported;
    }

    public void setVvtdSupported(final BoolOption vvtdSupported) {
        this.vvtdSupported = vvtdSupported;
    }

    public String[] getWakeOnLanEthernetCard() {
        return wakeOnLanEthernetCard;
    }

    public void setWakeOnLanEthernetCard(final String[] wakeOnLanEthernetCard) {
        this.wakeOnLanEthernetCard = wakeOnLanEthernetCard;
    }

}
