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
 * The ScsiLun data object describes a SCSI logical unit. A SCSI logical unit is a host device that an ESX Server or virtual machine can use for I/O operations.
 * An ESX Server creates SCSI logical unit objects to represent devices in the host configuration.
 * (See the definition of ScsiLunType for a list of the supported device types.)
 * The vSphere API uses one of two object types to represent a SCSI logical unit, depending on the device type.
 *
 * Disks containing file system volumes or parts of volumes for hosts or raw disks for virtual machines.
 * To represent disks, the ESX Server creates a HostScsiDisk object, which inherits properties from the ScsiLun base class.
 * Other SCSI devices, for example SCSI passthrough devices for virtual machines. To represent one of these devices, the ESX Server creates a ScsiLun object.
 * When the Server creates a HostScsiDisk or ScsiLun object, it specifies a valid device name and type:
 *
 * deviceName - A string representing the name of the device that is meaningful to the host. The following are some examples of device names.
 *         /dev/cdrom
 *         /vmkdev/vmhba0:0:1:0
 *         PhysicalDrive0
 * deviceType - A string describing the type of device. The following are some examples of device types.
 *         scsi-cdrom
 *         scsi-tape
 *         scsi-disk
 *         scsi-processor
 *         scsi-unknown
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
@SuppressWarnings("unused")
public class ScsiLun extends HostDevice {

    private String key;
    private String uuid;
    private List<ScsiLunDescriptor> descriptor;
    private String canonicalName;
    private String displayName;
    private ScsiLunType lunType;
    private String vendor;
    private String model;
    private String revision;
    private Integer scsiLevel;
    private String serialNumber;
    private ScsiLunDurableName durableName;
    private List<ScsiLunDurableName> alternateName;
    private byte[] standardInquiry;
    private Integer queueDepth;
    private List<ScsiLunState> operationalState;
    private ScsiLunCapabilities capabilities;
    private ScsiLunVStorageSupportStatus vStorageSupport;
    private Boolean protocolEndpoint;
    private Boolean perenniallyReserved;
    private Boolean clusteredVmdkSupported;
    private DeviceProtocol applicationProtocol;
    private Boolean dispersedNs;

    @Override
    public String toString() {
        return "ScsiLun{" +
                "key='" + key + '\'' +
                ", uuid='" + uuid + '\'' +
                ", descriptor=" + descriptor +
                ", canonicalName='" + canonicalName + '\'' +
                ", displayName='" + displayName + '\'' +
                ", lunType=" + lunType +
                ", vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", revision='" + revision + '\'' +
                ", scsiLevel=" + scsiLevel +
                ", serialNumber='" + serialNumber + '\'' +
                ", durableName=" + durableName +
                ", alternateName=" + alternateName +
                ", standardInquiry=" + Arrays.toString(standardInquiry) +
                ", queueDepth=" + queueDepth +
                ", operationalState=" + operationalState +
                ", capabilities=" + capabilities +
                ", vStorageSupport=" + vStorageSupport +
                ", protocolEndpoint=" + protocolEndpoint +
                ", perenniallyReserved=" + perenniallyReserved +
                ", clusteredVmdkSupported=" + clusteredVmdkSupported +
                ", applicationProtocol=" + applicationProtocol +
                ", dispersedNs=" + dispersedNs +
                '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public List<ScsiLunDescriptor> getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(final List<ScsiLunDescriptor> descriptor) {
        this.descriptor = descriptor;
    }

    public String getCanonicalName() {
        return canonicalName;
    }

    public void setCanonicalName(final String canonicalName) {
        this.canonicalName = canonicalName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public ScsiLunType getLunType() {
        return lunType;
    }

    public void setLunType(final ScsiLunType lunType) {
        this.lunType = lunType;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(final String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(final String revision) {
        this.revision = revision;
    }

    public Integer getScsiLevel() {
        return scsiLevel;
    }

    public void setScsiLevel(final Integer scsiLevel) {
        this.scsiLevel = scsiLevel;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(final String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ScsiLunDurableName getDurableName() {
        return durableName;
    }

    public void setDurableName(final ScsiLunDurableName durableName) {
        this.durableName = durableName;
    }

    public List<ScsiLunDurableName> getAlternateName() {
        return alternateName;
    }

    public void setAlternateName(final List<ScsiLunDurableName> alternateName) {
        this.alternateName = alternateName;
    }

    public byte[] getStandardInquiry() {
        return standardInquiry;
    }

    public void setStandardInquiry(final byte[] standardInquiry) {
        this.standardInquiry = standardInquiry;
    }

    public Integer getQueueDepth() {
        return queueDepth;
    }

    public void setQueueDepth(final Integer queueDepth) {
        this.queueDepth = queueDepth;
    }

    public List<ScsiLunState> getOperationalState() {
        return operationalState;
    }

    public void setOperationalState(final List<ScsiLunState> operationalState) {
        this.operationalState = operationalState;
    }

    public ScsiLunCapabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(final ScsiLunCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    public ScsiLunVStorageSupportStatus getvStorageSupport() {
        return vStorageSupport;
    }

    public void setvStorageSupport(final ScsiLunVStorageSupportStatus vStorageSupport) {
        this.vStorageSupport = vStorageSupport;
    }

    public Boolean getProtocolEndpoint() {
        return protocolEndpoint;
    }

    public void setProtocolEndpoint(final Boolean protocolEndpoint) {
        this.protocolEndpoint = protocolEndpoint;
    }

    public Boolean getPerenniallyReserved() {
        return perenniallyReserved;
    }

    public void setPerenniallyReserved(final Boolean perenniallyReserved) {
        this.perenniallyReserved = perenniallyReserved;
    }

    public Boolean getClusteredVmdkSupported() {
        return clusteredVmdkSupported;
    }

    public void setClusteredVmdkSupported(final Boolean clusteredVmdkSupported) {
        this.clusteredVmdkSupported = clusteredVmdkSupported;
    }

    public DeviceProtocol getApplicationProtocol() {
        return applicationProtocol;
    }

    public void setApplicationProtocol(final DeviceProtocol applicationProtocol) {
        this.applicationProtocol = applicationProtocol;
    }

    public Boolean getDispersedNs() {
        return dispersedNs;
    }

    public void setDispersedNs(final Boolean dispersedNs) {
        this.dispersedNs = dispersedNs;
    }

}
