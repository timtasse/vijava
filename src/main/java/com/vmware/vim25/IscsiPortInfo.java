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
public class IscsiPortInfo extends DynamicData {

    public IscsiStatus complianceStatus;
    public String externalId;
    public String opaqueNetworkId;
    public String opaqueNetworkName;
    public String opaqueNetworkType;
    public String pathStatus;
    public PhysicalNic pnic;
    public String pnicDevice;
    public String portgroupKey;
    public String portgroupName;
    public String portKey;
    public String switchName;
    public String switchUuid;
    public HostVirtualNic vnic;
    public String vnicDevice;

    public String getVnicDevice() {
        return this.vnicDevice;
    }

    public void setVnicDevice(String vnicDevice) {
        this.vnicDevice = vnicDevice;
    }

    public HostVirtualNic getVnic() {
        return this.vnic;
    }

    public void setVnic(HostVirtualNic vnic) {
        this.vnic = vnic;
    }

    public String getPnicDevice() {
        return this.pnicDevice;
    }

    public void setPnicDevice(String pnicDevice) {
        this.pnicDevice = pnicDevice;
    }

    public PhysicalNic getPnic() {
        return this.pnic;
    }

    public void setPnic(PhysicalNic pnic) {
        this.pnic = pnic;
    }

    public String getSwitchName() {
        return this.switchName;
    }

    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }

    public String getSwitchUuid() {
        return this.switchUuid;
    }

    public void setSwitchUuid(String switchUuid) {
        this.switchUuid = switchUuid;
    }

    public String getPortgroupName() {
        return this.portgroupName;
    }

    public void setPortgroupName(String portgroupName) {
        this.portgroupName = portgroupName;
    }

    public String getPortgroupKey() {
        return this.portgroupKey;
    }

    public void setPortgroupKey(String portgroupKey) {
        this.portgroupKey = portgroupKey;
    }

    public String getPortKey() {
        return this.portKey;
    }

    public void setPortKey(String portKey) {
        this.portKey = portKey;
    }

    public IscsiStatus getComplianceStatus() {
        return this.complianceStatus;
    }

    public void setComplianceStatus(IscsiStatus complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    public String getPathStatus() {
        return this.pathStatus;
    }

    public void setPathStatus(String pathStatus) {
        this.pathStatus = pathStatus;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public String getOpaqueNetworkId() {
        return opaqueNetworkId;
    }

    public void setOpaqueNetworkId(final String opaqueNetworkId) {
        this.opaqueNetworkId = opaqueNetworkId;
    }

    public String getOpaqueNetworkName() {
        return opaqueNetworkName;
    }

    public void setOpaqueNetworkName(final String opaqueNetworkName) {
        this.opaqueNetworkName = opaqueNetworkName;
    }

    public String getOpaqueNetworkType() {
        return opaqueNetworkType;
    }

    public void setOpaqueNetworkType(final String opaqueNetworkType) {
        this.opaqueNetworkType = opaqueNetworkType;
    }
}