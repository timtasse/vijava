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
 * The HostProxySwitch is a software entity which represents the component of a DistributedVirtualSwitch on a particular host.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
@SuppressWarnings("unused")
public class HostProxySwitch extends DynamicData {

    private String dvsUuid;
    private String dvsName;
    private String key;
    private int numPorts;
    private Integer configNumPorts;
    private int numPortsAvailable;
    private List<KeyValue> uplinkPort = List.of();
    private Integer mtu;
    private List<String> pnic = List.of();
    private HostProxySwitchSpec spec;
    private List<HostProxySwitchHostLagConfig> hostLag = List.of();
    private Boolean networkReservationSupported;
    private Boolean nsxtEnabled;
    private Boolean ensEnabled;
    private Boolean ensInterruptEnabled;
    private List<DistributedVirtualSwitchHostMemberTransportZoneInfo> transportZones = List.of();
    private List<String> nsxUsedUplinkPort = List.of();
    private String nsxtStatus;
    private String nsxtStatusDetail;
    private HostProxySwitchEnsInfo ensInfo;
    private Boolean networkOffloadingEnabled;

    @Override
    public String toString() {
        return "HostProxySwitch{" +
                "dvsUuid='" + dvsUuid + '\'' +
                ", dvsName='" + dvsName + '\'' +
                ", key='" + key + '\'' +
                ", numPorts=" + numPorts +
                ", configNumPorts=" + configNumPorts +
                ", numPortsAvailable=" + numPortsAvailable +
                ", uplinkPort=" + uplinkPort +
                ", mtu=" + mtu +
                ", pnic=" + pnic +
                ", spec=" + spec +
                ", hostLag=" + hostLag +
                ", networkReservationSupported=" + networkReservationSupported +
                ", nsxtEnabled=" + nsxtEnabled +
                ", ensEnabled=" + ensEnabled +
                ", ensInterruptEnabled=" + ensInterruptEnabled +
                ", transportZones=" + transportZones +
                ", nsxUsedUplinkPort=" + nsxUsedUplinkPort +
                ", nsxtStatus='" + nsxtStatus + '\'' +
                ", nsxtStatusDetail='" + nsxtStatusDetail + '\'' +
                ", ensInfo=" + ensInfo +
                ", networkOffloadingEnabled=" + networkOffloadingEnabled +
                '}';
    }

    public String getDvsUuid() {
        return dvsUuid;
    }

    public void setDvsUuid(final String dvsUuid) {
        this.dvsUuid = dvsUuid;
    }

    public String getDvsName() {
        return dvsName;
    }

    public void setDvsName(final String dvsName) {
        this.dvsName = dvsName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public int getNumPorts() {
        return numPorts;
    }

    public void setNumPorts(final int numPorts) {
        this.numPorts = numPorts;
    }

    public Integer getConfigNumPorts() {
        return configNumPorts;
    }

    public void setConfigNumPorts(final Integer configNumPorts) {
        this.configNumPorts = configNumPorts;
    }

    public int getNumPortsAvailable() {
        return numPortsAvailable;
    }

    public void setNumPortsAvailable(final int numPortsAvailable) {
        this.numPortsAvailable = numPortsAvailable;
    }

    public List<KeyValue> getUplinkPort() {
        return uplinkPort;
    }

    public void setUplinkPort(final List<KeyValue> uplinkPort) {
        this.uplinkPort = uplinkPort;
    }

    public Integer getMtu() {
        return mtu;
    }

    public void setMtu(final Integer mtu) {
        this.mtu = mtu;
    }

    public List<String> getPnic() {
        return pnic;
    }

    public void setPnic(final List<String> pnic) {
        this.pnic = pnic;
    }

    public HostProxySwitchSpec getSpec() {
        return spec;
    }

    public void setSpec(final HostProxySwitchSpec spec) {
        this.spec = spec;
    }

    public List<HostProxySwitchHostLagConfig> getHostLag() {
        return hostLag;
    }

    public void setHostLag(final List<HostProxySwitchHostLagConfig> hostLag) {
        this.hostLag = hostLag;
    }

    public Boolean getNetworkReservationSupported() {
        return networkReservationSupported;
    }

    public void setNetworkReservationSupported(final Boolean networkReservationSupported) {
        this.networkReservationSupported = networkReservationSupported;
    }

    public Boolean getNsxtEnabled() {
        return nsxtEnabled;
    }

    public void setNsxtEnabled(final Boolean nsxtEnabled) {
        this.nsxtEnabled = nsxtEnabled;
    }

    public Boolean getEnsEnabled() {
        return ensEnabled;
    }

    public void setEnsEnabled(final Boolean ensEnabled) {
        this.ensEnabled = ensEnabled;
    }

    public Boolean getEnsInterruptEnabled() {
        return ensInterruptEnabled;
    }

    public void setEnsInterruptEnabled(final Boolean ensInterruptEnabled) {
        this.ensInterruptEnabled = ensInterruptEnabled;
    }

    public List<DistributedVirtualSwitchHostMemberTransportZoneInfo> getTransportZones() {
        return transportZones;
    }

    public void setTransportZones(final List<DistributedVirtualSwitchHostMemberTransportZoneInfo> transportZones) {
        this.transportZones = transportZones;
    }

    public List<String> getNsxUsedUplinkPort() {
        return nsxUsedUplinkPort;
    }

    public void setNsxUsedUplinkPort(final List<String> nsxUsedUplinkPort) {
        this.nsxUsedUplinkPort = nsxUsedUplinkPort;
    }

    public String getNsxtStatus() {
        return nsxtStatus;
    }

    public void setNsxtStatus(final String nsxtStatus) {
        this.nsxtStatus = nsxtStatus;
    }

    public String getNsxtStatusDetail() {
        return nsxtStatusDetail;
    }

    public void setNsxtStatusDetail(final String nsxtStatusDetail) {
        this.nsxtStatusDetail = nsxtStatusDetail;
    }

    public HostProxySwitchEnsInfo getEnsInfo() {
        return ensInfo;
    }

    public void setEnsInfo(final HostProxySwitchEnsInfo ensInfo) {
        this.ensInfo = ensInfo;
    }

    public Boolean getNetworkOffloadingEnabled() {
        return networkOffloadingEnabled;
    }

    public void setNetworkOffloadingEnabled(final Boolean networkOffloadingEnabled) {
        this.networkOffloadingEnabled = networkOffloadingEnabled;
    }

}
