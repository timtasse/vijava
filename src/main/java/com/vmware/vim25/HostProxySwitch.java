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
 * The HostProxySwitch is a software entity which represents the component of a DistributedVirtualSwitch on a particular host.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
public class HostProxySwitch extends DynamicData {

    private String dvsUuid;
    private String dvsName;
    private String key;
    private int numPorts;
    private Integer configNumPorts;
    private int numPortsAvailable;
    private KeyValue[] uplinkPort;
    private Integer mtu;
    private String[] pnic;
    private HostProxySwitchSpec spec;
    private HostProxySwitchHostLagConfig[] hostLag;
    private Boolean networkReservationSupported;
    private Boolean nsxtEnabled;
    private Boolean ensEnabled;
    private Boolean ensInterruptEnabled;
    private DistributedVirtualSwitchHostMemberTransportZoneInfo[] transportZones;
    private String[] nsxUsedUplinkPort;
    private String nsxtStatus;
    private String nsxtStatusDetail;

    @Override
    public String toString() {
        return "HostProxySwitch{" +
                "dvsUuid='" + dvsUuid + '\'' +
                ", dvsName='" + dvsName + '\'' +
                ", key='" + key + '\'' +
                ", numPorts=" + numPorts +
                ", configNumPorts=" + configNumPorts +
                ", numPortsAvailable=" + numPortsAvailable +
                ", uplinkPort=" + Arrays.toString(uplinkPort) +
                ", mtu=" + mtu +
                ", pnic=" + Arrays.toString(pnic) +
                ", spec=" + spec +
                ", hostLag=" + Arrays.toString(hostLag) +
                ", networkReservationSupported=" + networkReservationSupported +
                ", nsxtEnabled=" + nsxtEnabled +
                ", ensEnabled=" + ensEnabled +
                ", ensInterruptEnabled=" + ensInterruptEnabled +
                ", transportZones=" + Arrays.toString(transportZones) +
                ", nsxUsedUplinkPort=" + Arrays.toString(nsxUsedUplinkPort) +
                ", nsxtStatus='" + nsxtStatus + '\'' +
                ", nsxtStatusDetail='" + nsxtStatusDetail + '\'' +
                "} " + super.toString();
    }

    public String getDvsUuid() {
        return this.dvsUuid;
    }

    public void setDvsUuid(String dvsUuid) {
        this.dvsUuid = dvsUuid;
    }

    public String getDvsName() {
        return this.dvsName;
    }

    public void setDvsName(String dvsName) {
        this.dvsName = dvsName;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getNumPorts() {
        return this.numPorts;
    }

    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }

    public Integer getConfigNumPorts() {
        return this.configNumPorts;
    }

    public void setConfigNumPorts(Integer configNumPorts) {
        this.configNumPorts = configNumPorts;
    }

    public int getNumPortsAvailable() {
        return this.numPortsAvailable;
    }

    public void setNumPortsAvailable(int numPortsAvailable) {
        this.numPortsAvailable = numPortsAvailable;
    }

    public KeyValue[] getUplinkPort() {
        return this.uplinkPort;
    }

    public void setUplinkPort(KeyValue[] uplinkPort) {
        this.uplinkPort = uplinkPort;
    }

    public Integer getMtu() {
        return this.mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public String[] getPnic() {
        return this.pnic;
    }

    public void setPnic(String[] pnic) {
        this.pnic = pnic;
    }

    public HostProxySwitchSpec getSpec() {
        return this.spec;
    }

    public void setSpec(HostProxySwitchSpec spec) {
        this.spec = spec;
    }

    public HostProxySwitchHostLagConfig[] getHostLag() {
        return this.hostLag;
    }

    public void setHostLag(HostProxySwitchHostLagConfig[] hostLag) {
        this.hostLag = hostLag;
    }

    public Boolean getNetworkReservationSupported() {
        return this.networkReservationSupported;
    }

    public void setNetworkReservationSupported(Boolean networkReservationSupported) {
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

    public DistributedVirtualSwitchHostMemberTransportZoneInfo[] getTransportZones() {
        return transportZones;
    }

    public void setTransportZones(final DistributedVirtualSwitchHostMemberTransportZoneInfo[] transportZones) {
        this.transportZones = transportZones;
    }

    public String[] getNsxUsedUplinkPort() {
        return nsxUsedUplinkPort;
    }

    public void setNsxUsedUplinkPort(final String[] nsxUsedUplinkPort) {
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
}
