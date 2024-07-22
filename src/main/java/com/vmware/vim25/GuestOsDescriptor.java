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

import java.util.Collections;
import java.util.List;

/**
 * This data object type contains information to describe a particular guest operating system.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
public class GuestOsDescriptor extends DynamicData {

    private String id;
    private String family;
    private String fullName;
    private int supportedMaxCPUs;
    private int numSupportedPhysicalSockets;
    private int numSupportedCoresPerSocket;
    private int supportedMinMemMB;
    private int supportedMaxMemMB;
    private int recommendedMemMB;
    private int recommendedColorDepth;
    private List<String> supportedDiskControllerList = Collections.emptyList();
    private String recommendedSCSIController;
    private String recommendedDiskController;
    private int supportedNumDisks;
    private int recommendedDiskSizeMB;
    private String recommendedCdromController;
    private List<String> supportedEthernetCard = Collections.emptyList();
    private String recommendedEthernetCard;
    private Boolean supportsSlaveDisk;
    private List<HostCpuIdInfo> cpuFeatureMask = Collections.emptyList();
    private boolean smcRequired;
    private boolean supportsWakeOnLan;
    private boolean supportsVMI;
    private boolean supportsMemoryHotAdd;
    private boolean supportsCpuHotAdd;
    private boolean supportsCpuHotRemove;
    private List<String> supportedFirmware = Collections.emptyList();
    private String recommendedFirmware;
    private List<String> supportedUSBControllerList = Collections.emptyList();
    private String recommendedUSBController;
    private boolean supports3D;
    private boolean recommended3D;
    private boolean smcRecommended;
    private Boolean ich7mRecommended;
    private boolean usbRecommended;
    private String supportLevel;
    private boolean supportedForCreate;
    private IntOption vRAMSizeInKB;
    private int numSupportedFloppyDevices;
    private List<String> wakeOnLanEthernetCard = Collections.emptyList();
    private boolean supportsPvscsiControllerForBoot;
    private boolean diskUuidEnabled;
    private boolean supportsHotPlugPCI;
    private Boolean supportsSecureBoot;
    private Boolean defaultSecureBoot;
    private Boolean persistentMemorySupported;
    private Long supportedMinPersistentMemoryMB;
    private Long supportedMaxPersistentMemoryMB;
    private Long recommendedPersistentMemoryMB;
    private Boolean persistentMemoryHotAddSupported;
    private Boolean persistentMemoryHotRemoveSupported;
    private Boolean persistentMemoryColdGrowthSupported;
    private Long persistentMemoryColdGrowthGranularityMB;
    private Boolean persistentMemoryHotGrowthSupported;
    private Long persistentMemoryHotGrowthGranularityMB;
    private Integer numRecommendedPhysicalSockets;
    private Integer numRecommendedCoresPerSocket;
    private BoolOption vvtdSupported;
    private BoolOption vbsSupported;
    private BoolOption vsgxSupported;
    private Boolean vsgxRemoteAttestationSupported;
    private Boolean supportsTPM20;
    private Boolean recommendedTPM20;
    private Boolean vwdtSupported;

    @Override
    public String toString() {
        return "GuestOsDescriptor{" +
                "id='" + id + '\'' +
                ", family='" + family + '\'' +
                ", fullName='" + fullName + '\'' +
                ", supportedMaxCPUs=" + supportedMaxCPUs +
                ", numSupportedPhysicalSockets=" + numSupportedPhysicalSockets +
                ", numSupportedCoresPerSocket=" + numSupportedCoresPerSocket +
                ", supportedMinMemMB=" + supportedMinMemMB +
                ", supportedMaxMemMB=" + supportedMaxMemMB +
                ", recommendedMemMB=" + recommendedMemMB +
                ", recommendedColorDepth=" + recommendedColorDepth +
                ", supportedDiskControllerList=" + supportedDiskControllerList +
                ", recommendedSCSIController='" + recommendedSCSIController + '\'' +
                ", recommendedDiskController='" + recommendedDiskController + '\'' +
                ", supportedNumDisks=" + supportedNumDisks +
                ", recommendedDiskSizeMB=" + recommendedDiskSizeMB +
                ", recommendedCdromController='" + recommendedCdromController + '\'' +
                ", supportedEthernetCard=" + supportedEthernetCard +
                ", recommendedEthernetCard='" + recommendedEthernetCard + '\'' +
                ", supportsSlaveDisk=" + supportsSlaveDisk +
                ", cpuFeatureMask=" + cpuFeatureMask +
                ", smcRequired=" + smcRequired +
                ", supportsWakeOnLan=" + supportsWakeOnLan +
                ", supportsVMI=" + supportsVMI +
                ", supportsMemoryHotAdd=" + supportsMemoryHotAdd +
                ", supportsCpuHotAdd=" + supportsCpuHotAdd +
                ", supportsCpuHotRemove=" + supportsCpuHotRemove +
                ", supportedFirmware=" + supportedFirmware +
                ", recommendedFirmware='" + recommendedFirmware + '\'' +
                ", supportedUSBControllerList=" + supportedUSBControllerList +
                ", recommendedUSBController='" + recommendedUSBController + '\'' +
                ", supports3D=" + supports3D +
                ", recommended3D=" + recommended3D +
                ", smcRecommended=" + smcRecommended +
                ", ich7mRecommended=" + ich7mRecommended +
                ", usbRecommended=" + usbRecommended +
                ", supportLevel='" + supportLevel + '\'' +
                ", supportedForCreate=" + supportedForCreate +
                ", vRAMSizeInKB=" + vRAMSizeInKB +
                ", numSupportedFloppyDevices=" + numSupportedFloppyDevices +
                ", wakeOnLanEthernetCard=" + wakeOnLanEthernetCard +
                ", supportsPvscsiControllerForBoot=" + supportsPvscsiControllerForBoot +
                ", diskUuidEnabled=" + diskUuidEnabled +
                ", supportsHotPlugPCI=" + supportsHotPlugPCI +
                ", supportsSecureBoot=" + supportsSecureBoot +
                ", defaultSecureBoot=" + defaultSecureBoot +
                ", persistentMemorySupported=" + persistentMemorySupported +
                ", supportedMinPersistentMemoryMB=" + supportedMinPersistentMemoryMB +
                ", supportedMaxPersistentMemoryMB=" + supportedMaxPersistentMemoryMB +
                ", recommendedPersistentMemoryMB=" + recommendedPersistentMemoryMB +
                ", persistentMemoryHotAddSupported=" + persistentMemoryHotAddSupported +
                ", persistentMemoryHotRemoveSupported=" + persistentMemoryHotRemoveSupported +
                ", persistentMemoryColdGrowthSupported=" + persistentMemoryColdGrowthSupported +
                ", persistentMemoryColdGrowthGranularityMB=" + persistentMemoryColdGrowthGranularityMB +
                ", persistentMemoryHotGrowthSupported=" + persistentMemoryHotGrowthSupported +
                ", persistentMemoryHotGrowthGranularityMB=" + persistentMemoryHotGrowthGranularityMB +
                ", numRecommendedPhysicalSockets=" + numRecommendedPhysicalSockets +
                ", numRecommendedCoresPerSocket=" + numRecommendedCoresPerSocket +
                ", vvtdSupported=" + vvtdSupported +
                ", vbsSupported=" + vbsSupported +
                ", vsgxSupported=" + vsgxSupported +
                ", vsgxRemoteAttestationSupported=" + vsgxRemoteAttestationSupported +
                ", supportsTPM20=" + supportsTPM20 +
                ", recommendedTPM20=" + recommendedTPM20 +
                ", vwdtSupported=" + vwdtSupported +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
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

    public int getSupportedMaxCPUs() {
        return supportedMaxCPUs;
    }

    public void setSupportedMaxCPUs(final int supportedMaxCPUs) {
        this.supportedMaxCPUs = supportedMaxCPUs;
    }

    public int getNumSupportedPhysicalSockets() {
        return numSupportedPhysicalSockets;
    }

    public void setNumSupportedPhysicalSockets(final int numSupportedPhysicalSockets) {
        this.numSupportedPhysicalSockets = numSupportedPhysicalSockets;
    }

    public int getNumSupportedCoresPerSocket() {
        return numSupportedCoresPerSocket;
    }

    public void setNumSupportedCoresPerSocket(final int numSupportedCoresPerSocket) {
        this.numSupportedCoresPerSocket = numSupportedCoresPerSocket;
    }

    public int getSupportedMinMemMB() {
        return supportedMinMemMB;
    }

    public void setSupportedMinMemMB(final int supportedMinMemMB) {
        this.supportedMinMemMB = supportedMinMemMB;
    }

    public int getSupportedMaxMemMB() {
        return supportedMaxMemMB;
    }

    public void setSupportedMaxMemMB(final int supportedMaxMemMB) {
        this.supportedMaxMemMB = supportedMaxMemMB;
    }

    public int getRecommendedMemMB() {
        return recommendedMemMB;
    }

    public void setRecommendedMemMB(final int recommendedMemMB) {
        this.recommendedMemMB = recommendedMemMB;
    }

    public int getRecommendedColorDepth() {
        return recommendedColorDepth;
    }

    public void setRecommendedColorDepth(final int recommendedColorDepth) {
        this.recommendedColorDepth = recommendedColorDepth;
    }

    public List<String> getSupportedDiskControllerList() {
        return supportedDiskControllerList;
    }

    public void setSupportedDiskControllerList(final List<String> supportedDiskControllerList) {
        this.supportedDiskControllerList = supportedDiskControllerList;
    }

    public String getRecommendedSCSIController() {
        return recommendedSCSIController;
    }

    public void setRecommendedSCSIController(final String recommendedSCSIController) {
        this.recommendedSCSIController = recommendedSCSIController;
    }

    public String getRecommendedDiskController() {
        return recommendedDiskController;
    }

    public void setRecommendedDiskController(final String recommendedDiskController) {
        this.recommendedDiskController = recommendedDiskController;
    }

    public int getSupportedNumDisks() {
        return supportedNumDisks;
    }

    public void setSupportedNumDisks(final int supportedNumDisks) {
        this.supportedNumDisks = supportedNumDisks;
    }

    public int getRecommendedDiskSizeMB() {
        return recommendedDiskSizeMB;
    }

    public void setRecommendedDiskSizeMB(final int recommendedDiskSizeMB) {
        this.recommendedDiskSizeMB = recommendedDiskSizeMB;
    }

    public String getRecommendedCdromController() {
        return recommendedCdromController;
    }

    public void setRecommendedCdromController(final String recommendedCdromController) {
        this.recommendedCdromController = recommendedCdromController;
    }

    public List<String> getSupportedEthernetCard() {
        return supportedEthernetCard;
    }

    public void setSupportedEthernetCard(final List<String> supportedEthernetCard) {
        this.supportedEthernetCard = supportedEthernetCard;
    }

    public String getRecommendedEthernetCard() {
        return recommendedEthernetCard;
    }

    public void setRecommendedEthernetCard(final String recommendedEthernetCard) {
        this.recommendedEthernetCard = recommendedEthernetCard;
    }

    public Boolean getSupportsSlaveDisk() {
        return supportsSlaveDisk;
    }

    public void setSupportsSlaveDisk(final Boolean supportsSlaveDisk) {
        this.supportsSlaveDisk = supportsSlaveDisk;
    }

    public List<HostCpuIdInfo> getCpuFeatureMask() {
        return cpuFeatureMask;
    }

    public void setCpuFeatureMask(final List<HostCpuIdInfo> cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public boolean isSmcRequired() {
        return smcRequired;
    }

    public void setSmcRequired(final boolean smcRequired) {
        this.smcRequired = smcRequired;
    }

    public boolean isSupportsWakeOnLan() {
        return supportsWakeOnLan;
    }

    public void setSupportsWakeOnLan(final boolean supportsWakeOnLan) {
        this.supportsWakeOnLan = supportsWakeOnLan;
    }

    public boolean isSupportsVMI() {
        return supportsVMI;
    }

    public void setSupportsVMI(final boolean supportsVMI) {
        this.supportsVMI = supportsVMI;
    }

    public boolean isSupportsMemoryHotAdd() {
        return supportsMemoryHotAdd;
    }

    public void setSupportsMemoryHotAdd(final boolean supportsMemoryHotAdd) {
        this.supportsMemoryHotAdd = supportsMemoryHotAdd;
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

    public List<String> getSupportedFirmware() {
        return supportedFirmware;
    }

    public void setSupportedFirmware(final List<String> supportedFirmware) {
        this.supportedFirmware = supportedFirmware;
    }

    public String getRecommendedFirmware() {
        return recommendedFirmware;
    }

    public void setRecommendedFirmware(final String recommendedFirmware) {
        this.recommendedFirmware = recommendedFirmware;
    }

    public List<String> getSupportedUSBControllerList() {
        return supportedUSBControllerList;
    }

    public void setSupportedUSBControllerList(final List<String> supportedUSBControllerList) {
        this.supportedUSBControllerList = supportedUSBControllerList;
    }

    public String getRecommendedUSBController() {
        return recommendedUSBController;
    }

    public void setRecommendedUSBController(final String recommendedUSBController) {
        this.recommendedUSBController = recommendedUSBController;
    }

    public boolean isSupports3D() {
        return supports3D;
    }

    public void setSupports3D(final boolean supports3D) {
        this.supports3D = supports3D;
    }

    public boolean isRecommended3D() {
        return recommended3D;
    }

    public void setRecommended3D(final boolean recommended3D) {
        this.recommended3D = recommended3D;
    }

    public boolean isSmcRecommended() {
        return smcRecommended;
    }

    public void setSmcRecommended(final boolean smcRecommended) {
        this.smcRecommended = smcRecommended;
    }

    public Boolean getIch7mRecommended() {
        return ich7mRecommended;
    }

    public void setIch7mRecommended(final Boolean ich7mRecommended) {
        this.ich7mRecommended = ich7mRecommended;
    }

    public boolean isUsbRecommended() {
        return usbRecommended;
    }

    public void setUsbRecommended(final boolean usbRecommended) {
        this.usbRecommended = usbRecommended;
    }

    public String getSupportLevel() {
        return supportLevel;
    }

    public void setSupportLevel(final String supportLevel) {
        this.supportLevel = supportLevel;
    }

    public boolean isSupportedForCreate() {
        return supportedForCreate;
    }

    public void setSupportedForCreate(final boolean supportedForCreate) {
        this.supportedForCreate = supportedForCreate;
    }

    public IntOption getvRAMSizeInKB() {
        return vRAMSizeInKB;
    }

    public void setvRAMSizeInKB(final IntOption vRAMSizeInKB) {
        this.vRAMSizeInKB = vRAMSizeInKB;
    }

    public int getNumSupportedFloppyDevices() {
        return numSupportedFloppyDevices;
    }

    public void setNumSupportedFloppyDevices(final int numSupportedFloppyDevices) {
        this.numSupportedFloppyDevices = numSupportedFloppyDevices;
    }

    public List<String> getWakeOnLanEthernetCard() {
        return wakeOnLanEthernetCard;
    }

    public void setWakeOnLanEthernetCard(final List<String> wakeOnLanEthernetCard) {
        this.wakeOnLanEthernetCard = wakeOnLanEthernetCard;
    }

    public boolean isSupportsPvscsiControllerForBoot() {
        return supportsPvscsiControllerForBoot;
    }

    public void setSupportsPvscsiControllerForBoot(final boolean supportsPvscsiControllerForBoot) {
        this.supportsPvscsiControllerForBoot = supportsPvscsiControllerForBoot;
    }

    public boolean isDiskUuidEnabled() {
        return diskUuidEnabled;
    }

    public void setDiskUuidEnabled(final boolean diskUuidEnabled) {
        this.diskUuidEnabled = diskUuidEnabled;
    }

    public boolean isSupportsHotPlugPCI() {
        return supportsHotPlugPCI;
    }

    public void setSupportsHotPlugPCI(final boolean supportsHotPlugPCI) {
        this.supportsHotPlugPCI = supportsHotPlugPCI;
    }

    public Boolean getSupportsSecureBoot() {
        return supportsSecureBoot;
    }

    public void setSupportsSecureBoot(final Boolean supportsSecureBoot) {
        this.supportsSecureBoot = supportsSecureBoot;
    }

    public Boolean getDefaultSecureBoot() {
        return defaultSecureBoot;
    }

    public void setDefaultSecureBoot(final Boolean defaultSecureBoot) {
        this.defaultSecureBoot = defaultSecureBoot;
    }

    public Boolean getPersistentMemorySupported() {
        return persistentMemorySupported;
    }

    public void setPersistentMemorySupported(final Boolean persistentMemorySupported) {
        this.persistentMemorySupported = persistentMemorySupported;
    }

    public Long getSupportedMinPersistentMemoryMB() {
        return supportedMinPersistentMemoryMB;
    }

    public void setSupportedMinPersistentMemoryMB(final Long supportedMinPersistentMemoryMB) {
        this.supportedMinPersistentMemoryMB = supportedMinPersistentMemoryMB;
    }

    public Long getSupportedMaxPersistentMemoryMB() {
        return supportedMaxPersistentMemoryMB;
    }

    public void setSupportedMaxPersistentMemoryMB(final Long supportedMaxPersistentMemoryMB) {
        this.supportedMaxPersistentMemoryMB = supportedMaxPersistentMemoryMB;
    }

    public Long getRecommendedPersistentMemoryMB() {
        return recommendedPersistentMemoryMB;
    }

    public void setRecommendedPersistentMemoryMB(final Long recommendedPersistentMemoryMB) {
        this.recommendedPersistentMemoryMB = recommendedPersistentMemoryMB;
    }

    public Boolean getPersistentMemoryHotAddSupported() {
        return persistentMemoryHotAddSupported;
    }

    public void setPersistentMemoryHotAddSupported(final Boolean persistentMemoryHotAddSupported) {
        this.persistentMemoryHotAddSupported = persistentMemoryHotAddSupported;
    }

    public Boolean getPersistentMemoryHotRemoveSupported() {
        return persistentMemoryHotRemoveSupported;
    }

    public void setPersistentMemoryHotRemoveSupported(final Boolean persistentMemoryHotRemoveSupported) {
        this.persistentMemoryHotRemoveSupported = persistentMemoryHotRemoveSupported;
    }

    public Boolean getPersistentMemoryColdGrowthSupported() {
        return persistentMemoryColdGrowthSupported;
    }

    public void setPersistentMemoryColdGrowthSupported(final Boolean persistentMemoryColdGrowthSupported) {
        this.persistentMemoryColdGrowthSupported = persistentMemoryColdGrowthSupported;
    }

    public Long getPersistentMemoryColdGrowthGranularityMB() {
        return persistentMemoryColdGrowthGranularityMB;
    }

    public void setPersistentMemoryColdGrowthGranularityMB(final Long persistentMemoryColdGrowthGranularityMB) {
        this.persistentMemoryColdGrowthGranularityMB = persistentMemoryColdGrowthGranularityMB;
    }

    public Boolean getPersistentMemoryHotGrowthSupported() {
        return persistentMemoryHotGrowthSupported;
    }

    public void setPersistentMemoryHotGrowthSupported(final Boolean persistentMemoryHotGrowthSupported) {
        this.persistentMemoryHotGrowthSupported = persistentMemoryHotGrowthSupported;
    }

    public Long getPersistentMemoryHotGrowthGranularityMB() {
        return persistentMemoryHotGrowthGranularityMB;
    }

    public void setPersistentMemoryHotGrowthGranularityMB(final Long persistentMemoryHotGrowthGranularityMB) {
        this.persistentMemoryHotGrowthGranularityMB = persistentMemoryHotGrowthGranularityMB;
    }

    public Integer getNumRecommendedPhysicalSockets() {
        return numRecommendedPhysicalSockets;
    }

    public void setNumRecommendedPhysicalSockets(final Integer numRecommendedPhysicalSockets) {
        this.numRecommendedPhysicalSockets = numRecommendedPhysicalSockets;
    }

    public Integer getNumRecommendedCoresPerSocket() {
        return numRecommendedCoresPerSocket;
    }

    public void setNumRecommendedCoresPerSocket(final Integer numRecommendedCoresPerSocket) {
        this.numRecommendedCoresPerSocket = numRecommendedCoresPerSocket;
    }

    public BoolOption getVvtdSupported() {
        return vvtdSupported;
    }

    public void setVvtdSupported(final BoolOption vvtdSupported) {
        this.vvtdSupported = vvtdSupported;
    }

    public BoolOption getVbsSupported() {
        return vbsSupported;
    }

    public void setVbsSupported(final BoolOption vbsSupported) {
        this.vbsSupported = vbsSupported;
    }

    public BoolOption getVsgxSupported() {
        return vsgxSupported;
    }

    public void setVsgxSupported(final BoolOption vsgxSupported) {
        this.vsgxSupported = vsgxSupported;
    }

    public Boolean getVsgxRemoteAttestationSupported() {
        return vsgxRemoteAttestationSupported;
    }

    public void setVsgxRemoteAttestationSupported(final Boolean vsgxRemoteAttestationSupported) {
        this.vsgxRemoteAttestationSupported = vsgxRemoteAttestationSupported;
    }

    public Boolean getSupportsTPM20() {
        return supportsTPM20;
    }

    public void setSupportsTPM20(final Boolean supportsTPM20) {
        this.supportsTPM20 = supportsTPM20;
    }

    public Boolean getRecommendedTPM20() {
        return recommendedTPM20;
    }

    public void setRecommendedTPM20(final Boolean recommendedTPM20) {
        this.recommendedTPM20 = recommendedTPM20;
    }

    public Boolean getVwdtSupported() {
        return vwdtSupported;
    }

    public void setVwdtSupported(final Boolean vwdtSupported) {
        this.vwdtSupported = vwdtSupported;
    }

}
