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
 * @version 6.7
 * @since 4.0
 */

@SuppressWarnings("all")
public class VMwareDVSPortSetting extends DVPortSetting {

    private VmwareDistributedVirtualSwitchVlanSpec vlan;
    private IntPolicy qosTag;
    private VmwareUplinkPortTeamingPolicy uplinkTeamingPolicy;
    private DVSSecurityPolicy securityPolicy;
    private BoolPolicy ipfixEnabled;
    private BoolPolicy txUplink;
    private VMwareUplinkLacpPolicy lacpPolicy;
    private DVSMacManagementPolicy macManagementPolicy;

    @Override
    public String toString() {
        return "VMwareDVSPortSetting{" +
                "ipfixEnabled=" + ipfixEnabled +
                ", lacpPolicy=" + lacpPolicy +
                ", macManagementPolicy=" + macManagementPolicy +
                ", qosTag=" + qosTag +
                ", securityPolicy=" + securityPolicy +
                ", txUplink=" + txUplink +
                ", uplinkTeamingPolicy=" + uplinkTeamingPolicy +
                ", vlan=" + vlan +
                "} " + super.toString();
    }

    public VmwareDistributedVirtualSwitchVlanSpec getVlan() {
        return this.vlan;
    }

    public void setVlan(VmwareDistributedVirtualSwitchVlanSpec vlan) {
        this.vlan = vlan;
    }

    public IntPolicy getQosTag() {
        return this.qosTag;
    }

    public void setQosTag(IntPolicy qosTag) {
        this.qosTag = qosTag;
    }

    public VmwareUplinkPortTeamingPolicy getUplinkTeamingPolicy() {
        return this.uplinkTeamingPolicy;
    }

    public void setUplinkTeamingPolicy(VmwareUplinkPortTeamingPolicy uplinkTeamingPolicy) {
        this.uplinkTeamingPolicy = uplinkTeamingPolicy;
    }

    public DVSSecurityPolicy getSecurityPolicy() {
        return this.securityPolicy;
    }

    public void setSecurityPolicy(DVSSecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    public BoolPolicy getIpfixEnabled() {
        return this.ipfixEnabled;
    }

    public void setIpfixEnabled(BoolPolicy ipfixEnabled) {
        this.ipfixEnabled = ipfixEnabled;
    }

    public BoolPolicy getTxUplink() {
        return this.txUplink;
    }

    public void setTxUplink(BoolPolicy txUplink) {
        this.txUplink = txUplink;
    }

    public VMwareUplinkLacpPolicy getLacpPolicy() {
        return this.lacpPolicy;
    }

    public void setLacpPolicy(VMwareUplinkLacpPolicy lacpPolicy) {
        this.lacpPolicy = lacpPolicy;
    }

    public DVSMacManagementPolicy getMacManagementPolicy() {
        return macManagementPolicy;
    }

    public void setMacManagementPolicy(final DVSMacManagementPolicy macManagementPolicy) {
        this.macManagementPolicy = macManagementPolicy;
    }

}
