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
 * DataObject which provides a level of indirection when identifying VirtualNics during configuration.
 * This dataObject lets users specify a VirtualNic in terms of the portgroup/Dv Port the Virtual NIC is connected to.
 * This is useful in cases where VirtualNic will be created as part of a configuration operation and the created VirtualNic is referred to in some other part of configuration.
 * e.g: for configuring VMotion
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 4.0
 */

@SuppressWarnings("all")
public class HostVirtualNicConnection extends DynamicData {

    private DistributedVirtualSwitchPortConnection dvPort;
    private HostVirtualNicOpaqueNetworkSpec opNetwork;
    private String portgroup;

    @Override
    public String toString() {
        return "HostVirtualNicConnection{" +
                "dvPort=" + dvPort +
                ", opNetwork=" + opNetwork +
                ", portgroup='" + portgroup + '\'' +
                "} " + super.toString();
    }

    public String getPortgroup() {
        return this.portgroup;
    }

    public void setPortgroup(String portgroup) {
        this.portgroup = portgroup;
    }

    public DistributedVirtualSwitchPortConnection getDvPort() {
        return this.dvPort;
    }

    public void setDvPort(DistributedVirtualSwitchPortConnection dvPort) {
        this.dvPort = dvPort;
    }

    public HostVirtualNicOpaqueNetworkSpec getOpNetwork() {
        return opNetwork;
    }

    public void setOpNetwork(final HostVirtualNicOpaqueNetworkSpec opNetwork) {
        this.opNetwork = opNetwork;
    }

}
