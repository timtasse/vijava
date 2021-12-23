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
 * Indicators of support for version-specific DVS features that are only available on a VMware-class switch.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2
 */
@SuppressWarnings("unused")
public class VMwareDVSFeatureCapability extends DVSFeatureCapability {

    private Boolean vspanSupported;
    private Boolean lldpSupported;
    @Deprecated
    private Boolean ipfixSupported;
    private VMwareDvsIpfixCapability ipfixCapability;
    private Boolean multicastSnoopingSupported;
    private VMwareDVSVspanCapability vspanCapability;
    private VMwareDvsLacpCapability lacpCapability;
    private Boolean nsxSupported;
    private VMwareDvsMtuCapability mtuCapability;

    @Override
    public String toString() {
        return "VMwareDVSFeatureCapability{" +
                "vspanSupported=" + vspanSupported +
                ", lldpSupported=" + lldpSupported +
                ", ipfixSupported=" + ipfixSupported +
                ", ipfixCapability=" + ipfixCapability +
                ", multicastSnoopingSupported=" + multicastSnoopingSupported +
                ", vspanCapability=" + vspanCapability +
                ", lacpCapability=" + lacpCapability +
                ", nsxSupported=" + nsxSupported +
                ", mtuCapability=" + mtuCapability +
                '}';
    }

    public Boolean getVspanSupported() {
        return vspanSupported;
    }

    public void setVspanSupported(final Boolean vspanSupported) {
        this.vspanSupported = vspanSupported;
    }

    public Boolean getLldpSupported() {
        return lldpSupported;
    }

    public void setLldpSupported(final Boolean lldpSupported) {
        this.lldpSupported = lldpSupported;
    }

    public Boolean getIpfixSupported() {
        return ipfixSupported;
    }

    public void setIpfixSupported(final Boolean ipfixSupported) {
        this.ipfixSupported = ipfixSupported;
    }

    public VMwareDvsIpfixCapability getIpfixCapability() {
        return ipfixCapability;
    }

    public void setIpfixCapability(final VMwareDvsIpfixCapability ipfixCapability) {
        this.ipfixCapability = ipfixCapability;
    }

    public Boolean getMulticastSnoopingSupported() {
        return multicastSnoopingSupported;
    }

    public void setMulticastSnoopingSupported(final Boolean multicastSnoopingSupported) {
        this.multicastSnoopingSupported = multicastSnoopingSupported;
    }

    public VMwareDVSVspanCapability getVspanCapability() {
        return vspanCapability;
    }

    public void setVspanCapability(final VMwareDVSVspanCapability vspanCapability) {
        this.vspanCapability = vspanCapability;
    }

    public VMwareDvsLacpCapability getLacpCapability() {
        return lacpCapability;
    }

    public void setLacpCapability(final VMwareDvsLacpCapability lacpCapability) {
        this.lacpCapability = lacpCapability;
    }

    public Boolean getNsxSupported() {
        return nsxSupported;
    }

    public void setNsxSupported(final Boolean nsxSupported) {
        this.nsxSupported = nsxSupported;
    }

    public VMwareDvsMtuCapability getMtuCapability() {
        return mtuCapability;
    }

    public void setMtuCapability(final VMwareDvsMtuCapability mtuCapability) {
        this.mtuCapability = mtuCapability;
    }

}
