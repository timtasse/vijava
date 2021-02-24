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
 * A subset of virtual machine guest information.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.9.1
 */
@SuppressWarnings("unused")
public class VirtualMachineGuestSummary extends DynamicData {

    private String guestId;
    private String guestFullName;
    @Deprecated(since = "4.0")
    private VirtualMachineToolsStatus toolsStatus;
    @Deprecated(since = "5.1")
    private String toolsVersionStatus;
    private String toolsVersionStatus2;
    private String toolsRunningStatus;
    private String hostName;
    private String ipAddress;
    private String hwVersion;

    @Override
    public String toString() {
        return "VirtualMachineGuestSummary{" +
                "guestId='" + guestId + '\'' +
                ", guestFullName='" + guestFullName + '\'' +
                ", toolsStatus=" + toolsStatus +
                ", toolsVersionStatus='" + toolsVersionStatus + '\'' +
                ", toolsVersionStatus2='" + toolsVersionStatus2 + '\'' +
                ", toolsRunningStatus='" + toolsRunningStatus + '\'' +
                ", hostName='" + hostName + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", hwVersion='" + hwVersion + '\'' +
                "} " + super.toString();
    }

    public String getGuestId() {
        return this.guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getGuestFullName() {
        return this.guestFullName;
    }

    public void setGuestFullName(String guestFullName) {
        this.guestFullName = guestFullName;
    }

    public VirtualMachineToolsStatus getToolsStatus() {
        return this.toolsStatus;
    }

    public void setToolsStatus(VirtualMachineToolsStatus toolsStatus) {
        this.toolsStatus = toolsStatus;
    }

    public String getToolsVersionStatus() {
        return this.toolsVersionStatus;
    }

    public void setToolsVersionStatus(String toolsVersionStatus) {
        this.toolsVersionStatus = toolsVersionStatus;
    }

    public String getToolsVersionStatus2() {
        return this.toolsVersionStatus2;
    }

    public void setToolsVersionStatus2(String toolsVersionStatus2) {
        this.toolsVersionStatus2 = toolsVersionStatus2;
    }

    public String getToolsRunningStatus() {
        return this.toolsRunningStatus;
    }

    public void setToolsRunningStatus(String toolsRunningStatus) {
        this.toolsRunningStatus = toolsRunningStatus;
    }

    public String getHostName() {
        return this.hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getHwVersion() {
        return hwVersion;
    }

    public void setHwVersion(final String hwVersion) {
        this.hwVersion = hwVersion;
    }

}
