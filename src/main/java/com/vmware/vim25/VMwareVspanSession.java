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
 * The VMwareVspanSession data object defines the configuration of a VLAN Services and Protocols for Advanced Networks (VSPAN) session. You use a VSPAN session for the following operations:
 * To mirror network traffic (inbound/outbound) from a set of source entities to a set of destination entities.
 * To assist in troubleshooting.
 * As input for security and other network analysis appliances.
 * The type of entities that you can specify as source or destination is determined by the session type. You can use uplink distributed virtual ports only for mixed destination mirror VSPAN sessions (mixedDestMirror). For all sessions except mixedDestMirror sessions, you cannot use uplink distributed virtual ports as destination ports. sessionType is required for vSphere Distributed Switch 5.1 and later, ignored for prior version if set.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 5.0
 */
@SuppressWarnings("all")
public class VMwareVspanSession extends DynamicData {

    private String description;
    private VMwareVspanPort destinationPort;
    private boolean enabled;
    private Integer encapsulationVlanId;
    private String encapType;
    private Integer erspanCOS;
    private Boolean erspanGraNanosec;
    private Integer erspanId;
    private String key;
    private Integer mirroredPacketLength;
    private String name;
    private String netstack;
    private boolean normalTrafficAllowed;
    private Integer samplingRate;
    private String sessionType;
    private VMwareVspanPort sourcePortReceived;
    private VMwareVspanPort sourcePortTransmitted;
    private boolean stripOriginalVlan;

    @Override
    public String toString() {
        return "VMwareVspanSession{" +
                "description='" + description + '\'' +
                ", destinationPort=" + destinationPort +
                ", enabled=" + enabled +
                ", encapsulationVlanId=" + encapsulationVlanId +
                ", encapType='" + encapType + '\'' +
                ", erspanCOS=" + erspanCOS +
                ", erspanGraNanosec=" + erspanGraNanosec +
                ", erspanId=" + erspanId +
                ", key='" + key + '\'' +
                ", mirroredPacketLength=" + mirroredPacketLength +
                ", name='" + name + '\'' +
                ", netstack='" + netstack + '\'' +
                ", normalTrafficAllowed=" + normalTrafficAllowed +
                ", samplingRate=" + samplingRate +
                ", sessionType='" + sessionType + '\'' +
                ", sourcePortReceived=" + sourcePortReceived +
                ", sourcePortTransmitted=" + sourcePortTransmitted +
                ", stripOriginalVlan=" + stripOriginalVlan +
                "} " + super.toString();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public VMwareVspanPort getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(final VMwareVspanPort destinationPort) {
        this.destinationPort = destinationPort;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getEncapsulationVlanId() {
        return encapsulationVlanId;
    }

    public void setEncapsulationVlanId(final Integer encapsulationVlanId) {
        this.encapsulationVlanId = encapsulationVlanId;
    }

    public String getEncapType() {
        return encapType;
    }

    public void setEncapType(final String encapType) {
        this.encapType = encapType;
    }

    public Integer getErspanCOS() {
        return erspanCOS;
    }

    public void setErspanCOS(final Integer erspanCOS) {
        this.erspanCOS = erspanCOS;
    }

    public Boolean getErspanGraNanosec() {
        return erspanGraNanosec;
    }

    public void setErspanGraNanosec(final Boolean erspanGraNanosec) {
        this.erspanGraNanosec = erspanGraNanosec;
    }

    public Integer getErspanId() {
        return erspanId;
    }

    public void setErspanId(final Integer erspanId) {
        this.erspanId = erspanId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public Integer getMirroredPacketLength() {
        return mirroredPacketLength;
    }

    public void setMirroredPacketLength(final Integer mirroredPacketLength) {
        this.mirroredPacketLength = mirroredPacketLength;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNetstack() {
        return netstack;
    }

    public void setNetstack(final String netstack) {
        this.netstack = netstack;
    }

    public boolean isNormalTrafficAllowed() {
        return normalTrafficAllowed;
    }

    public void setNormalTrafficAllowed(final boolean normalTrafficAllowed) {
        this.normalTrafficAllowed = normalTrafficAllowed;
    }

    public Integer getSamplingRate() {
        return samplingRate;
    }

    public void setSamplingRate(final Integer samplingRate) {
        this.samplingRate = samplingRate;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(final String sessionType) {
        this.sessionType = sessionType;
    }

    public VMwareVspanPort getSourcePortReceived() {
        return sourcePortReceived;
    }

    public void setSourcePortReceived(final VMwareVspanPort sourcePortReceived) {
        this.sourcePortReceived = sourcePortReceived;
    }

    public VMwareVspanPort getSourcePortTransmitted() {
        return sourcePortTransmitted;
    }

    public void setSourcePortTransmitted(final VMwareVspanPort sourcePortTransmitted) {
        this.sourcePortTransmitted = sourcePortTransmitted;
    }

    public boolean isStripOriginalVlan() {
        return stripOriginalVlan;
    }

    public void setStripOriginalVlan(final boolean stripOriginalVlan) {
        this.stripOriginalVlan = stripOriginalVlan;
    }

}
