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
 * This class describes a DistributedVirtualPortgroup that a device backing can be attached to.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 7.0
 */
public class DistributedVirtualPortgroupInfo extends DynamicData {

    private String switchName;
    private String switchUuid;
    private String portgroupName;
    private String portgroupKey;
    private String portgroupType;
    private boolean uplinkPortgroup;
    private ManagedObjectReference portgroup;
    private Boolean networkReservationSupported;
    private String backingType;
    private String logicalSwitchUuid;
    private String segmentId;

    @Override
    public String toString() {
        return "DistributedVirtualPortgroupInfo{" +
                "switchName='" + switchName + '\'' +
                ", switchUuid='" + switchUuid + '\'' +
                ", portgroupName='" + portgroupName + '\'' +
                ", portgroupKey='" + portgroupKey + '\'' +
                ", portgroupType='" + portgroupType + '\'' +
                ", uplinkPortgroup=" + uplinkPortgroup +
                ", portgroup=" + portgroup +
                ", networkReservationSupported=" + networkReservationSupported +
                ", backingType='" + backingType + '\'' +
                ", logicalSwitchUuid='" + logicalSwitchUuid + '\'' +
                ", segmentId='" + segmentId + '\'' +
                "} " + super.toString();
    }

    public String getSwitchName() {
        return this.switchName;
    }

    public String getSwitchUuid() {
        return this.switchUuid;
    }

    public String getPortgroupName() {
        return this.portgroupName;
    }

    public String getPortgroupKey() {
        return this.portgroupKey;
    }

    public String getPortgroupType() {
        return this.portgroupType;
    }

    public boolean isUplinkPortgroup() {
        return this.uplinkPortgroup;
    }

    public ManagedObjectReference getPortgroup() {
        return this.portgroup;
    }

    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }

    public void setSwitchUuid(String switchUuid) {
        this.switchUuid = switchUuid;
    }

    public void setPortgroupName(String portgroupName) {
        this.portgroupName = portgroupName;
    }

    public void setPortgroupKey(String portgroupKey) {
        this.portgroupKey = portgroupKey;
    }

    public void setPortgroupType(String portgroupType) {
        this.portgroupType = portgroupType;
    }

    public void setUplinkPortgroup(boolean uplinkPortgroup) {
        this.uplinkPortgroup = uplinkPortgroup;
    }

    public void setPortgroup(ManagedObjectReference portgroup) {
        this.portgroup = portgroup;
    }

    public Boolean getNetworkReservationSupported() {
        return networkReservationSupported;
    }

    public void setNetworkReservationSupported(final Boolean networkReservationSupported) {
        this.networkReservationSupported = networkReservationSupported;
    }

    public String getBackingType() {
        return backingType;
    }

    public void setBackingType(final String backingType) {
        this.backingType = backingType;
    }

    public String getLogicalSwitchUuid() {
        return logicalSwitchUuid;
    }

    public void setLogicalSwitchUuid(final String logicalSwitchUuid) {
        this.logicalSwitchUuid = logicalSwitchUuid;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(final String segmentId) {
        this.segmentId = segmentId;
    }

}
