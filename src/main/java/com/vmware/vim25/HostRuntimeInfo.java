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
import java.util.Calendar;

/**
 * This data object type describes the runtime state of a host.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 7.0.2
 */
@SuppressWarnings("unused")
public class HostRuntimeInfo extends DynamicData {

    private HostSystemConnectionState connectionState;
    private HostSystemPowerState powerState;
    private String standbyMode;
    private boolean inMaintenanceMode;
    private Boolean inQuarantineMode;
    private Calendar bootTime;
    private HealthSystemRuntime healthSystemRuntime;
    private ClusterDasFdmHostState dasHostState;
    private HostTpmDigestInfo[] tpmPcrValues;
    private VsanHostRuntimeInfo vsanRuntimeInfo;
    private HostRuntimeInfoNetworkRuntimeInfo networkRuntimeInfo;
    private HostVFlashManagerVFlashResourceRunTimeInfo vFlashResourceRuntimeInfo;
    private Long hostMaxVirtualDiskCapacity;
    private String cryptoState;
    private CryptoKeyId cryptoKeyId;
    private String statelessNvdsMigrationReady;

    @Override
    public String toString() {
        return "HostRuntimeInfo{" +
                "connectionState=" + connectionState +
                ", powerState=" + powerState +
                ", standbyMode='" + standbyMode + '\'' +
                ", inMaintenanceMode=" + inMaintenanceMode +
                ", inQuarantineMode=" + inQuarantineMode +
                ", bootTime=" + bootTime +
                ", healthSystemRuntime=" + healthSystemRuntime +
                ", dasHostState=" + dasHostState +
                ", tpmPcrValues=" + Arrays.toString(tpmPcrValues) +
                ", vsanRuntimeInfo=" + vsanRuntimeInfo +
                ", networkRuntimeInfo=" + networkRuntimeInfo +
                ", vFlashResourceRuntimeInfo=" + vFlashResourceRuntimeInfo +
                ", hostMaxVirtualDiskCapacity=" + hostMaxVirtualDiskCapacity +
                ", cryptoState='" + cryptoState + '\'' +
                ", cryptoKeyId=" + cryptoKeyId +
                ", statelessNvdsMigrationReady='" + statelessNvdsMigrationReady + '\'' +
                '}';
    }

    public HostSystemConnectionState getConnectionState() {
        return connectionState;
    }

    public void setConnectionState(final HostSystemConnectionState connectionState) {
        this.connectionState = connectionState;
    }

    public HostSystemPowerState getPowerState() {
        return powerState;
    }

    public void setPowerState(final HostSystemPowerState powerState) {
        this.powerState = powerState;
    }

    public String getStandbyMode() {
        return standbyMode;
    }

    public void setStandbyMode(final String standbyMode) {
        this.standbyMode = standbyMode;
    }

    public boolean isInMaintenanceMode() {
        return inMaintenanceMode;
    }

    public void setInMaintenanceMode(final boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
    }

    public Boolean getInQuarantineMode() {
        return inQuarantineMode;
    }

    public void setInQuarantineMode(final Boolean inQuarantineMode) {
        this.inQuarantineMode = inQuarantineMode;
    }

    public Calendar getBootTime() {
        return bootTime;
    }

    public void setBootTime(final Calendar bootTime) {
        this.bootTime = bootTime;
    }

    public HealthSystemRuntime getHealthSystemRuntime() {
        return healthSystemRuntime;
    }

    public void setHealthSystemRuntime(final HealthSystemRuntime healthSystemRuntime) {
        this.healthSystemRuntime = healthSystemRuntime;
    }

    public ClusterDasFdmHostState getDasHostState() {
        return dasHostState;
    }

    public void setDasHostState(final ClusterDasFdmHostState dasHostState) {
        this.dasHostState = dasHostState;
    }

    public HostTpmDigestInfo[] getTpmPcrValues() {
        return tpmPcrValues;
    }

    public void setTpmPcrValues(final HostTpmDigestInfo[] tpmPcrValues) {
        this.tpmPcrValues = tpmPcrValues;
    }

    public VsanHostRuntimeInfo getVsanRuntimeInfo() {
        return vsanRuntimeInfo;
    }

    public void setVsanRuntimeInfo(final VsanHostRuntimeInfo vsanRuntimeInfo) {
        this.vsanRuntimeInfo = vsanRuntimeInfo;
    }

    public HostRuntimeInfoNetworkRuntimeInfo getNetworkRuntimeInfo() {
        return networkRuntimeInfo;
    }

    public void setNetworkRuntimeInfo(final HostRuntimeInfoNetworkRuntimeInfo networkRuntimeInfo) {
        this.networkRuntimeInfo = networkRuntimeInfo;
    }

    public HostVFlashManagerVFlashResourceRunTimeInfo getvFlashResourceRuntimeInfo() {
        return vFlashResourceRuntimeInfo;
    }

    public void setvFlashResourceRuntimeInfo(final HostVFlashManagerVFlashResourceRunTimeInfo vFlashResourceRuntimeInfo) {
        this.vFlashResourceRuntimeInfo = vFlashResourceRuntimeInfo;
    }

    public Long getHostMaxVirtualDiskCapacity() {
        return hostMaxVirtualDiskCapacity;
    }

    public void setHostMaxVirtualDiskCapacity(final Long hostMaxVirtualDiskCapacity) {
        this.hostMaxVirtualDiskCapacity = hostMaxVirtualDiskCapacity;
    }

    public String getCryptoState() {
        return cryptoState;
    }

    public void setCryptoState(final String cryptoState) {
        this.cryptoState = cryptoState;
    }

    public CryptoKeyId getCryptoKeyId() {
        return cryptoKeyId;
    }

    public void setCryptoKeyId(final CryptoKeyId cryptoKeyId) {
        this.cryptoKeyId = cryptoKeyId;
    }

    public String getStatelessNvdsMigrationReady() {
        return statelessNvdsMigrationReady;
    }

    public void setStatelessNvdsMigrationReady(final String statelessNvdsMigrationReady) {
        this.statelessNvdsMigrationReady = statelessNvdsMigrationReady;
    }

}
