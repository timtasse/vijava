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
 * This data object type contains information about backing a virtual disk using a raw device mapping. Supported for ESX Server 2.5 and 3.x.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */

@SuppressWarnings("all")
public class VirtualDiskRawDiskMappingVer1BackingInfo extends VirtualDeviceFileBackingInfo {

    private String changeId;
    private String compatibilityMode;
    private String contentId;
    private String deltaDiskFormat;
    private Integer deltaGrainSize;
    private String deviceName;
    private String diskMode;
    private String lunUuid;
    private VirtualDiskRawDiskMappingVer1BackingInfo parent;
    private String sharing;
    private String uuid;

    @Override
    public String toString() {
        return "VirtualDiskRawDiskMappingVer1BackingInfo{" +
                "changeId='" + changeId + '\'' +
                ", compatibilityMode='" + compatibilityMode + '\'' +
                ", contentId='" + contentId + '\'' +
                ", deltaDiskFormat='" + deltaDiskFormat + '\'' +
                ", deltaGrainSize=" + deltaGrainSize +
                ", deviceName='" + deviceName + '\'' +
                ", diskMode='" + diskMode + '\'' +
                ", lunUuid='" + lunUuid + '\'' +
                ", parent=" + parent +
                ", sharing='" + sharing + '\'' +
                ", uuid='" + uuid + '\'' +
                "} " + super.toString();
    }

    public String getLunUuid() {
        return this.lunUuid;
    }

    public void setLunUuid(String lunUuid) {
        this.lunUuid = lunUuid;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getCompatibilityMode() {
        return this.compatibilityMode;
    }

    public void setCompatibilityMode(String compatibilityMode) {
        this.compatibilityMode = compatibilityMode;
    }

    public String getDiskMode() {
        return this.diskMode;
    }

    public void setDiskMode(String diskMode) {
        this.diskMode = diskMode;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getContentId() {
        return this.contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getChangeId() {
        return this.changeId;
    }

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    public VirtualDiskRawDiskMappingVer1BackingInfo getParent() {
        return this.parent;
    }

    public void setParent(VirtualDiskRawDiskMappingVer1BackingInfo parent) {
        this.parent = parent;
    }

    public String getSharing() {
        return sharing;
    }

    public void setSharing(final String sharing) {
        this.sharing = sharing;
    }

    public String getDeltaDiskFormat() {
        return deltaDiskFormat;
    }

    public void setDeltaDiskFormat(final String deltaDiskFormat) {
        this.deltaDiskFormat = deltaDiskFormat;
    }

    public Integer getDeltaGrainSize() {
        return deltaGrainSize;
    }

    public void setDeltaGrainSize(final Integer deltaGrainSize) {
        this.deltaGrainSize = deltaGrainSize;
    }

}
