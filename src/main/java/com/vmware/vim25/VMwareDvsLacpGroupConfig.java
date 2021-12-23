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

import java.util.Arrays;

/**
 * This class defines VMware specific multiple IEEE 802.3ad Dynamic Link Aggregation Control Protocol groups.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2
 * @since 5.5
 */
@SuppressWarnings("unused")
public class VMwareDvsLacpGroupConfig extends DynamicData {

    private String key;
    private String name;
    private VMwareUplinkLacpMode mode;
    private Integer uplinkNum;
    private VMwareDvsLacpLoadBalanceAlgorithm loadbalanceAlgorithm;
    private VMwareDvsLagVlanConfig vlan;
    private VMwareDvsLagIpfixConfig ipfix;
    private String[] uplinkName;
    private String[] uplinkPortKey;
    private VMwareUplinkLacpTimeoutMode timeoutMode;

    @Override
    public String toString() {
        return "VMwareDvsLacpGroupConfig{" +
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", mode=" + mode +
                ", uplinkNum=" + uplinkNum +
                ", loadbalanceAlgorithm=" + loadbalanceAlgorithm +
                ", vlan=" + vlan +
                ", ipfix=" + ipfix +
                ", uplinkName=" + Arrays.toString(uplinkName) +
                ", uplinkPortKey=" + Arrays.toString(uplinkPortKey) +
                ", timeoutMode=" + timeoutMode +
                '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public VMwareUplinkLacpMode getMode() {
        return mode;
    }

    public void setMode(final VMwareUplinkLacpMode mode) {
        this.mode = mode;
    }

    public Integer getUplinkNum() {
        return uplinkNum;
    }

    public void setUplinkNum(final Integer uplinkNum) {
        this.uplinkNum = uplinkNum;
    }

    public VMwareDvsLacpLoadBalanceAlgorithm getLoadbalanceAlgorithm() {
        return loadbalanceAlgorithm;
    }

    public void setLoadbalanceAlgorithm(final VMwareDvsLacpLoadBalanceAlgorithm loadbalanceAlgorithm) {
        this.loadbalanceAlgorithm = loadbalanceAlgorithm;
    }

    public VMwareDvsLagVlanConfig getVlan() {
        return vlan;
    }

    public void setVlan(final VMwareDvsLagVlanConfig vlan) {
        this.vlan = vlan;
    }

    public VMwareDvsLagIpfixConfig getIpfix() {
        return ipfix;
    }

    public void setIpfix(final VMwareDvsLagIpfixConfig ipfix) {
        this.ipfix = ipfix;
    }

    public String[] getUplinkName() {
        return uplinkName;
    }

    public void setUplinkName(final String[] uplinkName) {
        this.uplinkName = uplinkName;
    }

    public String[] getUplinkPortKey() {
        return uplinkPortKey;
    }

    public void setUplinkPortKey(final String[] uplinkPortKey) {
        this.uplinkPortKey = uplinkPortKey;
    }

    public VMwareUplinkLacpTimeoutMode getTimeoutMode() {
        return timeoutMode;
    }

    public void setTimeoutMode(final VMwareUplinkLacpTimeoutMode timeoutMode) {
        this.timeoutMode = timeoutMode;
    }

}
