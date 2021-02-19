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
 * The criteria specification for selecting ports.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 7.0
 */
public class DistributedVirtualSwitchPortCriteria extends DynamicData {

    private Boolean connected;
    private Boolean active;
    private Boolean uplinkPort;
    private Boolean nsxPort;
    @Deprecated
    private ManagedObjectReference scope;
    private String[] portgroupKey;
    private Boolean inside;
    private String[] portKey;
    private ManagedObjectReference host;

    @Override
    public String toString() {
        return "DistributedVirtualSwitchPortCriteria{" +
                "connected=" + connected +
                ", active=" + active +
                ", uplinkPort=" + uplinkPort +
                ", nsxPort=" + nsxPort +
                ", scope=" + scope +
                ", portgroupKey=" + Arrays.toString(portgroupKey) +
                ", inside=" + inside +
                ", portKey=" + Arrays.toString(portKey) +
                ", host=" + host +
                "} " + super.toString();
    }

    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(final Boolean connected) {
        this.connected = connected;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(final Boolean active) {
        this.active = active;
    }

    public Boolean getUplinkPort() {
        return uplinkPort;
    }

    public void setUplinkPort(final Boolean uplinkPort) {
        this.uplinkPort = uplinkPort;
    }

    public Boolean getNsxPort() {
        return nsxPort;
    }

    public void setNsxPort(final Boolean nsxPort) {
        this.nsxPort = nsxPort;
    }

    public ManagedObjectReference getScope() {
        return scope;
    }

    public void setScope(final ManagedObjectReference scope) {
        this.scope = scope;
    }

    public String[] getPortgroupKey() {
        return portgroupKey;
    }

    public void setPortgroupKey(final String[] portgroupKey) {
        this.portgroupKey = portgroupKey;
    }

    public Boolean getInside() {
        return inside;
    }

    public void setInside(final Boolean inside) {
        this.inside = inside;
    }

    public String[] getPortKey() {
        return portKey;
    }

    public void setPortKey(final String[] portKey) {
        this.portKey = portKey;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

}
