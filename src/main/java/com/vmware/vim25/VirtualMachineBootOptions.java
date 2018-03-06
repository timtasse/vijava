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
public class VirtualMachineBootOptions extends DynamicData {

    public Long bootDelay;
    public VirtualMachineBootOptionsBootableDevice[] bootOrder;
    public Long bootRetryDelay;
    public Boolean bootRetryEnabled;
    public Boolean efiSecureBootEnabled;
    public Boolean enterBIOSSetup;
    public String networkBootProtocol;

    public Long getBootDelay() {
        return this.bootDelay;
    }

    public void setBootDelay(Long bootDelay) {
        this.bootDelay = bootDelay;
    }

    public Long getBootRetryDelay() {
        return this.bootRetryDelay;
    }

    public void setBootRetryDelay(Long bootRetryDelay) {
        this.bootRetryDelay = bootRetryDelay;
    }

    public VirtualMachineBootOptionsBootableDevice[] getBootOrder() {
        return this.bootOrder;
    }

    public void setBootOrder(VirtualMachineBootOptionsBootableDevice[] bootOrder) {
        this.bootOrder = bootOrder;
    }

    public Boolean isEnterBIOSSetup() {
        return enterBIOSSetup;
    }

    public void setEnterBIOSSetup(Boolean enterBIOSSetup) {
        this.enterBIOSSetup = enterBIOSSetup;
    }

    public Boolean isBootRetryEnabled() {
        return bootRetryEnabled;
    }

    public void setBootRetryEnabled(Boolean bootRetryEnabled) {
        this.bootRetryEnabled = bootRetryEnabled;
    }

    public Boolean isEfiSecureBootEnabled() {
        return efiSecureBootEnabled;
    }

    public void setEfiSecureBootEnabled(final Boolean efiSecureBootEnabled) {
        this.efiSecureBootEnabled = efiSecureBootEnabled;
    }

    public String getNetworkBootProtocol() {
        return networkBootProtocol;
    }

    public void setNetworkBootProtocol(final String networkBootProtocol) {
        this.networkBootProtocol = networkBootProtocol;
    }
}