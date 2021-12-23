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
 * @version 7.0.2
 * @since 2.0
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
    private GuestInfoCustomizationInfo customizationInfo;

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
                ", customizationInfo=" + customizationInfo +
                '}';
    }

    @Deprecated
    public VirtualMachineToolsStatus getToolsStatus() {
        return this.toolsStatus;
    }

    @Deprecated
    public void setToolsStatus(final VirtualMachineToolsStatus toolsStatus) {
        this.toolsStatus = toolsStatus;
    }

    @Deprecated
    public String getToolsVersionStatus() {
        return this.toolsVersionStatus;
    }

    @Deprecated
    public void setToolsVersionStatus(final String toolsVersionStatus) {
        this.toolsVersionStatus = toolsVersionStatus;
    }

    public String getToolsVersionStatus2() {
        return this.toolsVersionStatus2;
    }

    public void setToolsVersionStatus2(final String toolsVersionStatus2) {
        this.toolsVersionStatus2 = toolsVersionStatus2;
    }

    public String getToolsRunningStatus() {
        return toolsRunningStatus;
    }

    public void setToolsRunningStatus(final String toolsRunningStatus) {
        this.toolsRunningStatus = toolsRunningStatus;
    }

    public String getToolsVersion() {
        return toolsVersion;
    }

    public void setToolsVersion(final String toolsVersion) {
        this.toolsVersion = toolsVersion;
    }

    public String getToolsInstallType() {
        return toolsInstallType;
    }

    public void setToolsInstallType(final String toolsInstallType) {
        this.toolsInstallType = toolsInstallType;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(final String guestId) {
        this.guestId = guestId;
    }

    public String getGuestFamily() {
        return guestFamily;
    }

    public void setGuestFamily(final String guestFamily) {
        this.guestFamily = guestFamily;
    }

    public String getGuestFullName() {
        return guestFullName;
    }

    public void setGuestFullName(final String guestFullName) {
        this.guestFullName = guestFullName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(final String hostName) {
        this.hostName = hostName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(final String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public GuestNicInfo[] getNet() {
        return net;
    }

    public void setNet(final GuestNicInfo[] net) {
        this.net = net;
    }

    public GuestStackInfo[] getIpStack() {
        return ipStack;
    }

    public void setIpStack(final GuestStackInfo[] ipStack) {
        this.ipStack = ipStack;
    }

    public GuestDiskInfo[] getDisk() {
        return disk;
    }

    public void setDisk(final GuestDiskInfo[] disk) {
        this.disk = disk;
    }

    public GuestScreenInfo getScreen() {
        return screen;
    }

    public void setScreen(final GuestScreenInfo screen) {
        this.screen = screen;
    }

    public String getGuestState() {
        return guestState;
    }

    public void setGuestState(final String guestState) {
        this.guestState = guestState;
    }

    public String getAppHeartbeatStatus() {
        return appHeartbeatStatus;
    }

    public void setAppHeartbeatStatus(final String appHeartbeatStatus) {
        this.appHeartbeatStatus = appHeartbeatStatus;
    }

    public Boolean getGuestKernelCrashed() {
        return guestKernelCrashed;
    }

    public void setGuestKernelCrashed(final Boolean guestKernelCrashed) {
        this.guestKernelCrashed = guestKernelCrashed;
    }

    public String getAppState() {
        return appState;
    }

    public void setAppState(final String appState) {
        this.appState = appState;
    }

    public Boolean getGuestOperationsReady() {
        return guestOperationsReady;
    }

    public void setGuestOperationsReady(final Boolean guestOperationsReady) {
        this.guestOperationsReady = guestOperationsReady;
    }

    public Boolean getInteractiveGuestOperationsReady() {
        return interactiveGuestOperationsReady;
    }

    public void setInteractiveGuestOperationsReady(final Boolean interactiveGuestOperationsReady) {
        this.interactiveGuestOperationsReady = interactiveGuestOperationsReady;
    }

    public Boolean getGuestStateChangeSupported() {
        return guestStateChangeSupported;
    }

    public void setGuestStateChangeSupported(final Boolean guestStateChangeSupported) {
        this.guestStateChangeSupported = guestStateChangeSupported;
    }

    public GuestInfoNamespaceGenerationInfo[] getGenerationInfo() {
        return generationInfo;
    }

    public void setGenerationInfo(final GuestInfoNamespaceGenerationInfo[] generationInfo) {
        this.generationInfo = generationInfo;
    }

    public String getHwVersion() {
        return hwVersion;
    }

    public void setHwVersion(final String hwVersion) {
        this.hwVersion = hwVersion;
    }

    public GuestInfoCustomizationInfo getCustomizationInfo() {
        return customizationInfo;
    }

    public void setCustomizationInfo(final GuestInfoCustomizationInfo customizationInfo) {
        this.customizationInfo = customizationInfo;
    }

}
