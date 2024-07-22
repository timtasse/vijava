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
 * The VirtualEthernetCard data object contains the properties of an Ethernet adapter attached to a virtual machine.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.5
 */
@SuppressWarnings("unused")
public class VirtualEthernetCard extends VirtualDevice {

    private String addressType;
    private String macAddress;
    private Boolean wakeOnLanEnabled;
    private VirtualEthernetCardResourceAllocation resourceAllocation;
    private String externalId;
    private Boolean uptCompatibilityEnabled;

    @Override
    public String toString() {
        return "VirtualEthernetCard{" +
                "addressType='" + addressType + '\'' +
                ", macAddress='" + macAddress + '\'' +
                ", wakeOnLanEnabled=" + wakeOnLanEnabled +
                ", resourceAllocation=" + resourceAllocation +
                ", externalId='" + externalId + '\'' +
                ", uptCompatibilityEnabled=" + uptCompatibilityEnabled +
                "} " + super.toString();
    }

    public String getAddressType() {
        return this.addressType;
    }

    public void setAddressType(final String addressType) {
        this.addressType = addressType;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public void setMacAddress(final String macAddress) {
        this.macAddress = macAddress;
    }

    public boolean isWakeOnLanEnabled() {
        return wakeOnLanEnabled;
    }

    public void setWakeOnLanEnabled(final boolean wakeOnLanEnabled) {
        this.wakeOnLanEnabled = wakeOnLanEnabled;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public boolean isUptCompatibilityEnabled() {
        return uptCompatibilityEnabled;
    }

    public void setUptCompatibilityEnabled(final boolean uptCompatibilityEnabled) {
        this.uptCompatibilityEnabled = uptCompatibilityEnabled;
    }

    public VirtualEthernetCardResourceAllocation getResourceAllocation() {
        return resourceAllocation;
    }

    public void setResourceAllocation(final VirtualEthernetCardResourceAllocation resourceAllocation) {
        this.resourceAllocation = resourceAllocation;
    }

}
