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
 * Indicators of support for version-specific Distributed Port Mirroring sessions.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 5.1
 */
@SuppressWarnings("all")
public class VMwareDVSVspanCapability extends DynamicData {

    private boolean dvportSupported;
    private boolean encapRemoteSourceSupported;
    private Boolean erspanProtocolSupported;
    private Boolean mirrorNetstackSupported;
    private boolean mixedDestSupported;
    private boolean remoteDestSupported;
    private boolean remoteSourceSupported;

    @Override
    public String toString() {
        return "VMwareDVSVspanCapability{" +
                "dvportSupported=" + dvportSupported +
                ", encapRemoteSourceSupported=" + encapRemoteSourceSupported +
                ", erspanProtocolSupported=" + erspanProtocolSupported +
                ", mirrorNetstackSupported=" + mirrorNetstackSupported +
                ", mixedDestSupported=" + mixedDestSupported +
                ", remoteDestSupported=" + remoteDestSupported +
                ", remoteSourceSupported=" + remoteSourceSupported +
                "} " + super.toString();
    }

    public boolean isMixedDestSupported() {
        return this.mixedDestSupported;
    }

    public void setMixedDestSupported(boolean mixedDestSupported) {
        this.mixedDestSupported = mixedDestSupported;
    }

    public boolean isDvportSupported() {
        return this.dvportSupported;
    }

    public void setDvportSupported(boolean dvportSupported) {
        this.dvportSupported = dvportSupported;
    }

    public boolean isRemoteSourceSupported() {
        return this.remoteSourceSupported;
    }

    public void setRemoteSourceSupported(boolean remoteSourceSupported) {
        this.remoteSourceSupported = remoteSourceSupported;
    }

    public boolean isRemoteDestSupported() {
        return this.remoteDestSupported;
    }

    public void setRemoteDestSupported(boolean remoteDestSupported) {
        this.remoteDestSupported = remoteDestSupported;
    }

    public boolean isEncapRemoteSourceSupported() {
        return this.encapRemoteSourceSupported;
    }

    public void setEncapRemoteSourceSupported(boolean encapRemoteSourceSupported) {
        this.encapRemoteSourceSupported = encapRemoteSourceSupported;
    }

    public Boolean getErspanProtocolSupported() {
        return erspanProtocolSupported;
    }

    public void setErspanProtocolSupported(final Boolean erspanProtocolSupported) {
        this.erspanProtocolSupported = erspanProtocolSupported;
    }

    public Boolean getMirrorNetstackSupported() {
        return mirrorNetstackSupported;
    }

    public void setMirrorNetstackSupported(final Boolean mirrorNetstackSupported) {
        this.mirrorNetstackSupported = mirrorNetstackSupported;
    }

}
