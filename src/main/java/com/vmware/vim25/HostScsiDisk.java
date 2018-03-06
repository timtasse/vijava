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
public class HostScsiDisk extends ScsiLun {

    public HostDiskDimensionsLba capacity;
    public String devicePath;
    public Boolean ssd;
    public Boolean localDisk;
    public String[] physicalLocation;
    public Boolean emulatedDIXDIFEnabled;
    public VsanHostVsanDiskInfo vsanDiskInfo;
    public String scsiDiskType;

    public HostDiskDimensionsLba getCapacity() {
        return this.capacity;
    }

    public void setCapacity(HostDiskDimensionsLba capacity) {
        this.capacity = capacity;
    }

    public String getDevicePath() {
        return this.devicePath;
    }

    public void setDevicePath(String devicePath) {
        this.devicePath = devicePath;
    }

    public Boolean getSsd() {
        return this.ssd;
    }

    public void setSsd(Boolean ssd) {
        this.ssd = ssd;
    }

    public Boolean isEmulatedDIXDIFEnabled() {
        return emulatedDIXDIFEnabled;
    }

    public void setEmulatedDIXDIFEnabled(final Boolean emulatedDIXDIFEnabled) {
        this.emulatedDIXDIFEnabled = emulatedDIXDIFEnabled;
    }

    public Boolean isLocalDisk() {
        return localDisk;
    }

    public void setLocalDisk(final Boolean localDisk) {
        this.localDisk = localDisk;
    }

    public String[] getPhysicalLocation() {
        return physicalLocation;
    }

    public void setPhysicalLocation(final String[] physicalLocation) {
        this.physicalLocation = physicalLocation;
    }

    public String getScsiDiskType() {
        return scsiDiskType;
    }

    public void setScsiDiskType(final String scsiDiskType) {
        this.scsiDiskType = scsiDiskType;
    }

    public Boolean isSsd() {
        return ssd;
    }

    public VsanHostVsanDiskInfo getVsanDiskInfo() {
        return vsanDiskInfo;
    }

    public void setVsanDiskInfo(final VsanHostVsanDiskInfo vsanDiskInfo) {
        this.vsanDiskInfo = vsanDiskInfo;
    }
}