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
 * The DistributedVirtualPort data object represents a port in a DistributedVirtualSwitch.
 * Virtual ports are part of a distributed virtual portgroup.
 * Servers create virtual ports according to the portgroup type (DistributedVirtualPortgroup.Config.type).
 * @See DistributedVirtualPortgroupPortgroupType
 *
 * To configure host network access by port, set the distributed virtual port
 * in the host virtual NIC specification (HostVirtualNicSpec.distributedVirtualPort.portKey).
 *
 * To configure virtual machine network access by port,
 * set the port in the virtual Ethernet card backing (VirtualEthernetCard.backing.port.portKey).
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
public class DistributedVirtualPort extends DynamicData {

    private String key;
    private DVPortConfigInfo config;
    private String dvsUuid;
    private String portgroupKey;
    private ManagedObjectReference proxyHost;
    private DistributedVirtualSwitchPortConnectee connectee;
    private boolean conflict;
    private String conflictPortKey;
    private DVPortState state;
    private Integer connectionCookie;
    private Calendar lastStatusChange;
    private Boolean hostLocalPort;
    private String externalId;
    private String segmentPortId;

    @Override
    public String toString() {
        return "DistributedVirtualPort{" +
                "key='" + key + '\'' +
                ", config=" + config +
                ", dvsUuid='" + dvsUuid + '\'' +
                ", portgroupKey='" + portgroupKey + '\'' +
                ", proxyHost=" + proxyHost +
                ", connectee=" + connectee +
                ", conflict=" + conflict +
                ", conflictPortKey='" + conflictPortKey + '\'' +
                ", state=" + state +
                ", connectionCookie=" + connectionCookie +
                ", lastStatusChange=" + lastStatusChange +
                ", hostLocalPort=" + hostLocalPort +
                ", externalId='" + externalId + '\'' +
                ", segmentPortId='" + segmentPortId + '\'' +
                "} " + super.toString();
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public DVPortConfigInfo getConfig() {
        return this.config;
    }

    public void setConfig(DVPortConfigInfo config) {
        this.config = config;
    }

    public String getDvsUuid() {
        return this.dvsUuid;
    }

    public void setDvsUuid(String dvsUuid) {
        this.dvsUuid = dvsUuid;
    }

    public String getPortgroupKey() {
        return this.portgroupKey;
    }

    public void setPortgroupKey(String portgroupKey) {
        this.portgroupKey = portgroupKey;
    }

    public ManagedObjectReference getProxyHost() {
        return this.proxyHost;
    }

    public void setProxyHost(ManagedObjectReference proxyHost) {
        this.proxyHost = proxyHost;
    }

    public DistributedVirtualSwitchPortConnectee getConnectee() {
        return this.connectee;
    }

    public void setConnectee(DistributedVirtualSwitchPortConnectee connectee) {
        this.connectee = connectee;
    }

    public boolean isConflict() {
        return this.conflict;
    }

    public void setConflict(boolean conflict) {
        this.conflict = conflict;
    }

    public String getConflictPortKey() {
        return this.conflictPortKey;
    }

    public void setConflictPortKey(String conflictPortKey) {
        this.conflictPortKey = conflictPortKey;
    }

    public DVPortState getState() {
        return this.state;
    }

    public void setState(DVPortState state) {
        this.state = state;
    }

    public Integer getConnectionCookie() {
        return this.connectionCookie;
    }

    public void setConnectionCookie(Integer connectionCookie) {
        this.connectionCookie = connectionCookie;
    }

    public Calendar getLastStatusChange() {
        return this.lastStatusChange;
    }

    public void setLastStatusChange(Calendar lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    public Boolean getHostLocalPort() {
        return this.hostLocalPort;
    }

    public void setHostLocalPort(Boolean hostLocalPort) {
        this.hostLocalPort = hostLocalPort;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public String getSegmentPortId() {
        return segmentPortId;
    }

    public void setSegmentPortId(final String segmentPortId) {
        this.segmentPortId = segmentPortId;
    }

}
