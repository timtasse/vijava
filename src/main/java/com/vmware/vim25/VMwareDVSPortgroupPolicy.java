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
 * This class defines the VMware specific configuration for DistributedVirtualPort.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7.1
 */

@SuppressWarnings("all")
public class VMwareDVSPortgroupPolicy extends DVPortgroupPolicy {

    private boolean vlanOverrideAllowed;
    private boolean uplinkTeamingOverrideAllowed;
    @Deprecated(since = "6.7.1")
    private boolean securityPolicyOverrideAllowed;
    private Boolean ipfixOverrideAllowed;
    private Boolean macManagementOverrideAllowed;

    @Override
    public String toString() {
        return "VMwareDVSPortgroupPolicy{" +
                "ipfixOverrideAllowed=" + ipfixOverrideAllowed +
                ", macManagementOverrideAllowed=" + macManagementOverrideAllowed +
                ", securityPolicyOverrideAllowed=" + securityPolicyOverrideAllowed +
                ", uplinkTeamingOverrideAllowed=" + uplinkTeamingOverrideAllowed +
                ", vlanOverrideAllowed=" + vlanOverrideAllowed +
                "} " + super.toString();
    }

    public Boolean getIpfixOverrideAllowed() {
        return ipfixOverrideAllowed;
    }

    public void setIpfixOverrideAllowed(final Boolean ipfixOverrideAllowed) {
        this.ipfixOverrideAllowed = ipfixOverrideAllowed;
    }

    public Boolean getMacManagementOverrideAllowed() {
        return macManagementOverrideAllowed;
    }

    public void setMacManagementOverrideAllowed(final Boolean macManagementOverrideAllowed) {
        this.macManagementOverrideAllowed = macManagementOverrideAllowed;
    }

    public boolean isSecurityPolicyOverrideAllowed() {
        return securityPolicyOverrideAllowed;
    }

    public void setSecurityPolicyOverrideAllowed(final boolean securityPolicyOverrideAllowed) {
        this.securityPolicyOverrideAllowed = securityPolicyOverrideAllowed;
    }

    public boolean isUplinkTeamingOverrideAllowed() {
        return uplinkTeamingOverrideAllowed;
    }

    public void setUplinkTeamingOverrideAllowed(final boolean uplinkTeamingOverrideAllowed) {
        this.uplinkTeamingOverrideAllowed = uplinkTeamingOverrideAllowed;
    }

    public boolean isVlanOverrideAllowed() {
        return vlanOverrideAllowed;
    }

    public void setVlanOverrideAllowed(final boolean vlanOverrideAllowed) {
        this.vlanOverrideAllowed = vlanOverrideAllowed;
    }
}
