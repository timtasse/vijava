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
 * Information about the guest operating system.
 *
 * Most of this information is collected by VMware Tools.
 * In general, be sure you have VMware Tools installed and that the virtual machine is running when you access this information.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.9.1
 */
@SuppressWarnings("unused")
public class GuestInfo extends DynamicData {

    private VirtualMachineToolsStatus toolsStatus;
    private String toolsVersionStatus;
    private String toolsVersionStatus2;
    private String toolsRunningStatus;
    private String toolsVersion;
    private String toolsInstallType;
    private String guestId;
    private String guestFamily;
    private String guestFullName;
    private String hostName;
    private String ipAddress;
    private GuestNicInfo[] net;
    private GuestStackInfo[] ipStack;
    private GuestDiskInfo[] disk;
    private GuestScreenInfo screen;
    private String guestState;
    private String appHeartbeatStatus;
    private Boolean guestKernelCrashed;
    private String appState;
    private Boolean guestOperationsReady;
    private Boolean interactiveGuestOperationsReady;
    private Boolean guestStateChangeSupported;
    private GuestInfoNamespaceGenerationInfo[] generationInfo;
    private String hwVersion;

    @Override
    public String toString() {
        return "GuestInfo{" +
                "toolsStatus=" + toolsStatus +
                ", toolsVersionStatus='" + toolsVersionStatus + '\'' +
                ", toolsVersionStatus2='" + toolsVersionStatus2 + '\'' +
                ", toolsRunningStatus='" + toolsRunningStatus + '\'' +
                ", toolsVersion='" + toolsVersion + '\'' +
                ", toolsInstallType='" + toolsInstallType + '\'' +
                ", guestId='" + guestId + '\'' +
                ", guestFamily='" + guestFamily + '\'' +
                ", guestFullName='" + guestFullName + '\'' +
                ", hostName='" + hostName + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", net=" + Arrays.toString(net) +
                ", ipStack=" + Arrays.toString(ipStack) +
                ", disk=" + Arrays.toString(disk) +
                ", screen=" + screen +
                ", guestState='" + guestState + '\'' +
                ", appHeartbeatStatus='" + appHeartbeatStatus + '\'' +
                ", guestKernelCrashed=" + guestKernelCrashed +
                ", appState='" + appState + '\'' +
                ", guestOperationsReady=" + guestOperationsReady +
                ", interactiveGuestOperationsReady=" + interactiveGuestOperationsReady +
                ", guestStateChangeSupported=" + guestStateChangeSupported +
                ", generationInfo=" + Arrays.toString(generationInfo) +
                ", hwVersion='" + hwVersion + '\'' +
                "} " + super.toString();
    }

    @Deprecated
    public VirtualMachineToolsStatus getToolsStatus() {
        return this.toolsStatus;
    }

    @Deprecated
    public void setToolsStatus(VirtualMachineToolsStatus toolsStatus) {
        this.toolsStatus = toolsStatus;
    }

    @Deprecated
    public String getToolsVersionStatus() {
        return this.toolsVersionStatus;
    }

    @Deprecated
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

    public String getToolsVersion() {
        return this.toolsVersion;
    }

    public void setToolsVersion(String toolsVersion) {
        this.toolsVersion = toolsVersion;
    }

    public String getGuestId() {
        return this.guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getGuestFamily() {
        return this.guestFamily;
    }

    public void setGuestFamily(String guestFamily) {
        this.guestFamily = guestFamily;
    }

    public String getGuestFullName() {
        return this.guestFullName;
    }

    public void setGuestFullName(String guestFullName) {
        this.guestFullName = guestFullName;
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

    public GuestNicInfo[] getNet() {
        return this.net;
    }

    public void setNet(GuestNicInfo[] net) {
        this.net = net;
    }

    public GuestStackInfo[] getIpStack() {
        return this.ipStack;
    }

    public void setIpStack(GuestStackInfo[] ipStack) {
        this.ipStack = ipStack;
    }

    public GuestDiskInfo[] getDisk() {
        return this.disk;
    }

    public void setDisk(GuestDiskInfo[] disk) {
        this.disk = disk;
    }

    public GuestScreenInfo getScreen() {
        return this.screen;
    }

    public void setScreen(GuestScreenInfo screen) {
        this.screen = screen;
    }

    public String getGuestState() {
        return this.guestState;
    }

    public void setGuestState(String guestState) {
        this.guestState = guestState;
    }

    public String getAppHeartbeatStatus() {
        return this.appHeartbeatStatus;
    }

    public void setAppHeartbeatStatus(String appHeartbeatStatus) {
        this.appHeartbeatStatus = appHeartbeatStatus;
    }

    public String getAppState() {
        return this.appState;
    }

    public void setAppState(String appState) {
        this.appState = appState;
    }

    public Boolean getGuestOperationsReady() {
        return this.guestOperationsReady;
    }

    public void setGuestOperationsReady(Boolean guestOperationsReady) {
        this.guestOperationsReady = guestOperationsReady;
    }

    public Boolean getInteractiveGuestOperationsReady() {
        return this.interactiveGuestOperationsReady;
    }

    public void setInteractiveGuestOperationsReady(Boolean interactiveGuestOperationsReady) {
        this.interactiveGuestOperationsReady = interactiveGuestOperationsReady;
    }

    public GuestInfoNamespaceGenerationInfo[] getGenerationInfo() {
        return this.generationInfo;
    }

    public void setGenerationInfo(GuestInfoNamespaceGenerationInfo[] generationInfo) {
        this.generationInfo = generationInfo;
    }

    public String getToolsInstallType() {
        return toolsInstallType;
    }

    public void setToolsInstallType(final String toolsInstallType) {
        this.toolsInstallType = toolsInstallType;
    }

    public Boolean getGuestKernelCrashed() {
        return guestKernelCrashed;
    }

    public void setGuestKernelCrashed(final Boolean guestKernelCrashed) {
        this.guestKernelCrashed = guestKernelCrashed;
    }

    public Boolean getGuestStateChangeSupported() {
        return guestStateChangeSupported;
    }

    public void setGuestStateChangeSupported(final Boolean guestStateChangeSupported) {
        this.guestStateChangeSupported = guestStateChangeSupported;
    }

    public String getHwVersion() {
        return hwVersion;
    }

    public void setHwVersion(final String hwVersion) {
        this.hwVersion = hwVersion;
    }

}
