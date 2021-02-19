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
 * This is the Linux counterpart to the Windows Sysprep object. LinuxPrep contains machine-wide settings that
 * identify a Linux machine in the same way that the Sysprep type identifies a Windows machine.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
public class CustomizationLinuxPrep extends CustomizationIdentitySettings {

    private CustomizationName hostName;
    private String domain;
    private String timeZone;
    private Boolean hwClockUTC;
    private String scriptText;

    @Override
    public String toString() {
        return "CustomizationLinuxPrep{" +
                "hostName=" + hostName +
                ", domain='" + domain + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", hwClockUTC=" + hwClockUTC +
                ", scriptText='" + scriptText + '\'' +
                "} " + super.toString();
    }

    public CustomizationName getHostName() {
        return this.hostName;
    }

    public void setHostName(CustomizationName hostName) {
        this.hostName = hostName;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Boolean getHwClockUTC() {
        return this.hwClockUTC;
    }

    public void setHwClockUTC(Boolean hwClockUTC) {
        this.hwClockUTC = hwClockUTC;
    }

    public String getScriptText() {
        return scriptText;
    }

    public void setScriptText(final String scriptText) {
        this.scriptText = scriptText;
    }

}
