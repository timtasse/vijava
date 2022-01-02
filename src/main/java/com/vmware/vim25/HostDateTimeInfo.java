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

import java.util.Calendar;

/**
 * This data object represents the dateTime configuration of the host.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.3
 */
@SuppressWarnings("unused")
public class HostDateTimeInfo extends DynamicData {

    private HostDateTimeSystemTimeZone timeZone;
    private HostDateTimeInfoProtocol systemClockProtocol;
    private HostNtpConfig ntpConfig;
    private HostPtpConfig ptpConfig;
    private Boolean enabled;
    private Boolean disableEvents;
    private Boolean disableFallback;
    private Boolean inFallbackState;
    private Boolean serviceSync;
    private Calendar lastSyncTime;
    private String remoteNtpServer;
    private Long ntpRunTime;
    private Long ptpRunTime;
    private String ntpDuration;
    private String ptpDuration;

    @Override
    public String toString() {
        return "HostDateTimeInfo{" +
                "timeZone=" + timeZone +
                ", systemClockProtocol=" + systemClockProtocol +
                ", ntpConfig=" + ntpConfig +
                ", ptpConfig=" + ptpConfig +
                ", enabled=" + enabled +
                ", disableEvents=" + disableEvents +
                ", disableFallback=" + disableFallback +
                ", inFallbackState=" + inFallbackState +
                ", serviceSync=" + serviceSync +
                ", lastSyncTime=" + lastSyncTime +
                ", remoteNtpServer='" + remoteNtpServer + '\'' +
                ", ntpRunTime=" + ntpRunTime +
                ", ptpRunTime=" + ptpRunTime +
                ", ntpDuration='" + ntpDuration + '\'' +
                ", ptpDuration='" + ptpDuration + '\'' +
                "} " + super.toString();
    }

    public HostDateTimeSystemTimeZone getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(final HostDateTimeSystemTimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public HostNtpConfig getNtpConfig() {
        return this.ntpConfig;
    }

    public void setNtpConfig(final HostNtpConfig ntpConfig) {
        this.ntpConfig = ntpConfig;
    }

    public HostDateTimeInfoProtocol getSystemClockProtocol() {
        return systemClockProtocol;
    }

    public void setSystemClockProtocol(final HostDateTimeInfoProtocol systemClockProtocol) {
        this.systemClockProtocol = systemClockProtocol;
    }

    public HostPtpConfig getPtpConfig() {
        return ptpConfig;
    }

    public void setPtpConfig(final HostPtpConfig ptpConfig) {
        this.ptpConfig = ptpConfig;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getDisableEvents() {
        return disableEvents;
    }

    public void setDisableEvents(final Boolean disableEvents) {
        this.disableEvents = disableEvents;
    }

    public Boolean getDisableFallback() {
        return disableFallback;
    }

    public void setDisableFallback(final Boolean disableFallback) {
        this.disableFallback = disableFallback;
    }

    public Boolean getInFallbackState() {
        return inFallbackState;
    }

    public void setInFallbackState(final Boolean inFallbackState) {
        this.inFallbackState = inFallbackState;
    }

    public Boolean getServiceSync() {
        return serviceSync;
    }

    public void setServiceSync(final Boolean serviceSync) {
        this.serviceSync = serviceSync;
    }

    public Calendar getLastSyncTime() {
        return lastSyncTime;
    }

    public void setLastSyncTime(final Calendar lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }

    public String getRemoteNtpServer() {
        return remoteNtpServer;
    }

    public void setRemoteNtpServer(final String remoteNtpServer) {
        this.remoteNtpServer = remoteNtpServer;
    }

    public Long getNtpRunTime() {
        return ntpRunTime;
    }

    public void setNtpRunTime(final Long ntpRunTime) {
        this.ntpRunTime = ntpRunTime;
    }

    public Long getPtpRunTime() {
        return ptpRunTime;
    }

    public void setPtpRunTime(final Long ptpRunTime) {
        this.ptpRunTime = ptpRunTime;
    }

    public String getNtpDuration() {
        return ntpDuration;
    }

    public void setNtpDuration(final String ntpDuration) {
        this.ntpDuration = ntpDuration;
    }

    public String getPtpDuration() {
        return ptpDuration;
    }

    public void setPtpDuration(final String ptpDuration) {
        this.ptpDuration = ptpDuration;
    }

}
