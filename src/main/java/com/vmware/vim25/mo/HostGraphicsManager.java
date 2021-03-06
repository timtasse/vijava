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

package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * This managed object manages the graphics state of the host.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 5.5
 * @version 6.7
 */
public class HostGraphicsManager extends ExtensibleManagedObject {

    public HostGraphicsManager(ServerConnection serverConnection, ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public HostGraphicsConfig graphicsConfig() {
        return (HostGraphicsConfig) getCurrentProperty("graphicsConfig");
    }

    public HostGraphicsInfo[] getGraphicsInfo() {
        return (HostGraphicsInfo[]) getCurrentProperty("graphicsInfo");
    }

    public String[] getSharedPassthruGpuTypes() {
        return (String[]) getCurrentProperty("sharedPassthruGpuTypes");
    }

    public HostSharedGpuCapabilities[] sharedGpuCapabilities() {
        return (HostSharedGpuCapabilities[]) this.getCurrentProperty("sharedGpuCapabilities");
    }

    public String[] sharedPassthruGpuTypes() {
        return (String[]) this.getCurrentProperty("sharedPassthruGpuTypes");
    }

    public boolean isSharedGraphicsActive() throws RuntimeFault, RemoteException {
        return this.getVimService().getWsc().invoke("IsSharedGraphicsActive", this.getSingleSelfArgumentList(), Boolean.class);
    }

    public void refreshGraphicsManager() throws RuntimeFault, RemoteException {
        this.getVimService().getWsc().invokeWithoutReturn("RefreshGraphicsManager", this.getSingleSelfArgumentList());
    }

    public void updateGraphicsConfig(final HostGraphicsConfig config) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("config", HostGraphicsConfig.class, config));
        this.getVimService().getWsc().invokeWithoutReturn("UpdateGraphicsConfig", params);
    }

}
