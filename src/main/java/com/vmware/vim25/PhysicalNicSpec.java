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
 * This data object type describes the physical network adapter specification representing the properties on a physical network adapter that can be configured once the object exists.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */

@SuppressWarnings("all")
public class PhysicalNicSpec extends DynamicData {

    private HostIpConfig ip;
    private PhysicalNicLinkInfo linkSpeed;
    private Boolean enableEnhancedNetworkingStack;

    @Override
    public String toString() {
        return "PhysicalNicSpec{" +
                "enableEnhancedNetworkingStack=" + enableEnhancedNetworkingStack +
                ", ip=" + ip +
                ", linkSpeed=" + linkSpeed +
                "} " + super.toString();
    }

    public HostIpConfig getIp() {
        return this.ip;
    }

    public void setIp(HostIpConfig ip) {
        this.ip = ip;
    }

    public PhysicalNicLinkInfo getLinkSpeed() {
        return this.linkSpeed;
    }

    public void setLinkSpeed(PhysicalNicLinkInfo linkSpeed) {
        this.linkSpeed = linkSpeed;
    }

    public Boolean getEnableEnhancedNetworkingStack() {
        return enableEnhancedNetworkingStack;
    }

    public void setEnableEnhancedNetworkingStack(final Boolean enableEnhancedNetworkingStack) {
        this.enableEnhancedNetworkingStack = enableEnhancedNetworkingStack;
    }

}
