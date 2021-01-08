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
 * Dataobject representing the feature capabilities of network resource management supported by the vSphere Distributed Switch.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.7
 * @since 5.0
 */

public class DVSNetworkResourceManagementCapability extends DynamicData {

    private Boolean networkResourceControlVersion3Supported;
    private boolean networkResourceManagementSupported;
    private int networkResourcePoolHighShareValue;
    private boolean qosSupported;
    private Boolean userDefinedInfraTrafficPoolSupported;
    private boolean userDefinedNetworkResourcePoolsSupported;

    @Override
    public String toString() {
        return "DVSNetworkResourceManagementCapability{" +
                "networkResourceControlVersion3Supported=" + networkResourceControlVersion3Supported +
                ", networkResourceManagementSupported=" + networkResourceManagementSupported +
                ", networkResourcePoolHighShareValue=" + networkResourcePoolHighShareValue +
                ", qosSupported=" + qosSupported +
                ", userDefinedInfraTrafficPoolSupported=" + userDefinedInfraTrafficPoolSupported +
                ", userDefinedNetworkResourcePoolsSupported=" + userDefinedNetworkResourcePoolsSupported +
                "} " + super.toString();
    }

    public Boolean getNetworkResourceControlVersion3Supported() {
        return networkResourceControlVersion3Supported;
    }

    public void setNetworkResourceControlVersion3Supported(final Boolean networkResourceControlVersion3Supported) {
        this.networkResourceControlVersion3Supported = networkResourceControlVersion3Supported;
    }

    public boolean isNetworkResourceManagementSupported() {
        return networkResourceManagementSupported;
    }

    public void setNetworkResourceManagementSupported(final boolean networkResourceManagementSupported) {
        this.networkResourceManagementSupported = networkResourceManagementSupported;
    }

    public int getNetworkResourcePoolHighShareValue() {
        return networkResourcePoolHighShareValue;
    }

    public void setNetworkResourcePoolHighShareValue(final int networkResourcePoolHighShareValue) {
        this.networkResourcePoolHighShareValue = networkResourcePoolHighShareValue;
    }

    public boolean isQosSupported() {
        return qosSupported;
    }

    public void setQosSupported(final boolean qosSupported) {
        this.qosSupported = qosSupported;
    }

    public Boolean getUserDefinedInfraTrafficPoolSupported() {
        return userDefinedInfraTrafficPoolSupported;
    }

    public void setUserDefinedInfraTrafficPoolSupported(final Boolean userDefinedInfraTrafficPoolSupported) {
        this.userDefinedInfraTrafficPoolSupported = userDefinedInfraTrafficPoolSupported;
    }

    public boolean isUserDefinedNetworkResourcePoolsSupported() {
        return userDefinedNetworkResourcePoolsSupported;
    }

    public void setUserDefinedNetworkResourcePoolsSupported(final boolean userDefinedNetworkResourcePoolsSupported) {
        this.userDefinedNetworkResourcePoolsSupported = userDefinedNetworkResourcePoolsSupported;
    }

}
