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

import java.util.List;

/**
 * Information about the system as a whole.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.3
 */
@SuppressWarnings("unused")
public class HostSystemInfo extends DynamicData {

    private String model;
    private List<HostSystemIdentificationInfo> otherIdentifyingInfo;
    private String serialNumber;
    private String uuid;
    private String vendor;
    private List<HostQualifiedName> qualifiedName;

    @Override
    public String toString() {
        return "HostSystemInfo{" +
                "model='" + model + '\'' +
                ", otherIdentifyingInfo=" + otherIdentifyingInfo +
                ", serialNumber='" + serialNumber + '\'' +
                ", uuid='" + uuid + '\'' +
                ", vendor='" + vendor + '\'' +
                ", qualifiedName=" + qualifiedName +
                "} " + super.toString();
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(final String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public List<HostSystemIdentificationInfo> getOtherIdentifyingInfo() {
        return otherIdentifyingInfo;
    }

    public void setOtherIdentifyingInfo(final List<HostSystemIdentificationInfo> otherIdentifyingInfo) {
        this.otherIdentifyingInfo = otherIdentifyingInfo;
    }

    public List<HostQualifiedName> getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(final List<HostQualifiedName> qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

}
