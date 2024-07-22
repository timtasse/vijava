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
 * The VirtualSriovEthernetCard data object defines the properties of a SR-IOV enabled Ethernet card attached to a virtual machine.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 * @since 5.5
 */
@SuppressWarnings("unused")
public class VirtualSriovEthernetCard extends VirtualEthernetCard {

    private Boolean allowGuestOSMtuChange;
    private VirtualSriovEthernetCardSriovBackingInfo sriovBacking;
    private VirtualPCIPassthroughDvxBackingInfo dvxBackingInfo;

    @Override
    public String toString() {
        return "VirtualSriovEthernetCard{" +
                "allowGuestOSMtuChange=" + allowGuestOSMtuChange +
                ", sriovBacking=" + sriovBacking +
                ", dvxBackingInfo=" + dvxBackingInfo +
                "} " + super.toString();
    }

    public VirtualPCIPassthroughDvxBackingInfo getDvxBackingInfo() {
        return dvxBackingInfo;
    }

    public void setDvxBackingInfo(final VirtualPCIPassthroughDvxBackingInfo dvxBackingInfo) {
        this.dvxBackingInfo = dvxBackingInfo;
    }

    public Boolean getAllowGuestOSMtuChange() {
        return this.allowGuestOSMtuChange;
    }

    public void setAllowGuestOSMtuChange(final Boolean allowGuestOSMtuChange) {
        this.allowGuestOSMtuChange = allowGuestOSMtuChange;
    }

    public VirtualSriovEthernetCardSriovBackingInfo getSriovBacking() {
        return this.sriovBacking;
    }

    public void setSriovBacking(final VirtualSriovEthernetCardSriovBackingInfo sriovBacking) {
        this.sriovBacking = sriovBacking;
    }

}
