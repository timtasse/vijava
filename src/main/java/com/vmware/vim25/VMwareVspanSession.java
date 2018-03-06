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
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.5
 */
@SuppressWarnings("all")
public class VMwareVspanSession extends DynamicData {

    public String description;
    public VMwareVspanPort destinationPort;
    public boolean enabled;
    public Integer encapsulationVlanId;
    public String encapType;
    public Integer erspanCOS;
    public Boolean erspanGraNanosec;
    public Integer erspanId;
    public String key;
    public Integer mirroredPacketLength;
    public String name;
    public boolean normalTrafficAllowed;
    public Integer samplingRate;
    public String sessionType;
    public VMwareVspanPort sourcePortReceived;
    public VMwareVspanPort sourcePortTransmitted;
    public boolean stripOriginalVlan;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public VMwareVspanPort getSourcePortTransmitted() {
        return this.sourcePortTransmitted;
    }

    public void setSourcePortTransmitted(VMwareVspanPort sourcePortTransmitted) {
        this.sourcePortTransmitted = sourcePortTransmitted;
    }

    public VMwareVspanPort getSourcePortReceived() {
        return this.sourcePortReceived;
    }

    public void setSourcePortReceived(VMwareVspanPort sourcePortReceived) {
        this.sourcePortReceived = sourcePortReceived;
    }

    public VMwareVspanPort getDestinationPort() {
        return this.destinationPort;
    }

    public void setDestinationPort(VMwareVspanPort destinationPort) {
        this.destinationPort = destinationPort;
    }

    public int getEncapsulationVlanId() {
        return this.encapsulationVlanId;
    }

    public void setEncapsulationVlanId(int encapsulationVlanId) {
        this.encapsulationVlanId = encapsulationVlanId;
    }

    public boolean isStripOriginalVlan() {
        return this.stripOriginalVlan;
    }

    public void setStripOriginalVlan(boolean stripOriginalVlan) {
        this.stripOriginalVlan = stripOriginalVlan;
    }

    public int getMirroredPacketLength() {
        return this.mirroredPacketLength;
    }

    public void setMirroredPacketLength(int mirroredPacketLength) {
        this.mirroredPacketLength = mirroredPacketLength;
    }

    public boolean isNormalTrafficAllowed() {
        return this.normalTrafficAllowed;
    }

    public void setNormalTrafficAllowed(boolean normalTrafficAllowed) {
        this.normalTrafficAllowed = normalTrafficAllowed;
    }

    public String getSessionType() {
        return this.sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public int getSamplingRate() {
        return this.samplingRate;
    }

    public void setSamplingRate(int samplingRate) {
        this.samplingRate = samplingRate;
    }

    public String getEncapType() {
        return encapType;
    }

    public void setEncapType(final String encapType) {
        this.encapType = encapType;
    }

    public int getErspanCOS() {
        return erspanCOS;
    }

    public void setErspanCOS(final int erspanCOS) {
        this.erspanCOS = erspanCOS;
    }

    public boolean isErspanGraNanosec() {
        return erspanGraNanosec;
    }

    public void setErspanGraNanosec(final boolean erspanGraNanosec) {
        this.erspanGraNanosec = erspanGraNanosec;
    }

    public int getErspanId() {
        return erspanId;
    }

    public void setErspanId(final int erspanId) {
        this.erspanId = erspanId;
    }
}