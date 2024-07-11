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
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * This managed object manages the graphics state of the host.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 5.5
 * @version 7.0.3
 */
@SuppressWarnings("unused")
public class HostGraphicsManager extends ExtensibleManagedObject {

    public HostGraphicsManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public HostGraphicsConfig getGraphicsConfig() {
        return this.getCurrentProperty("graphicsConfig", HostGraphicsConfig.class);
    }

    public List<HostGraphicsInfo> getGraphicsInfo() {
        final var val = Optional.ofNullable(this.getCurrentProperty("graphicsInfo", HostGraphicsInfo[].class));
        return val.map(List::of).orElse(Collections.emptyList());
    }

    public List<String> getSharedPassthruGpuTypes() {
        final var val = Optional.ofNullable(this.getCurrentProperty("sharedPassthruGpuTypes", String[].class));
        return val.map(List::of).orElse(Collections.emptyList());
    }

    public List<HostSharedGpuCapabilities> getSharedGpuCapabilities() {
        final var val = Optional.ofNullable(this.getCurrentProperty("sharedGpuCapabilities", HostSharedGpuCapabilities[].class));
        return val.map(List::of).orElse(Collections.emptyList());
    }

    public boolean isSharedGraphicsActive() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("IsSharedGraphicsActive", this.getSingleSelfArgumentList(), Boolean.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void refreshGraphicsManager() throws RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RefreshGraphicsManager", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<VirtualMachineVgpuDeviceInfo> retrieveVgpuDeviceInfo() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invokeWithListReturn("RetrieveVgpuDeviceInfo",
                    this.getSingleSelfArgumentList(), VirtualMachineVgpuDeviceInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<VirtualMachineVgpuProfileInfo> retrieveVgpuProfileInfo() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invokeWithListReturn("RetrieveVgpuProfileInfo",
                    this.getSingleSelfArgumentList(), VirtualMachineVgpuProfileInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateGraphicsConfig(final HostGraphicsConfig config) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("config", HostGraphicsConfig.class, config));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateGraphicsConfig", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
