/*================================================================================
Copyright (c) 2008 VMware, Inc. All Rights Reserved.

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
 * This managed object type describes networking host configuration and serves as the top level container for relevant networking data objects.
 *
 * @author Steve JIN (http://www.doublecloud.org), Lu Yu (lyu@vmware.com)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 5.5
 */
@SuppressWarnings("unused")
public class HostNetworkSystem extends ExtensibleManagedObject {

    public HostNetworkSystem(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public HostNetCapabilities getCapabilities() {
        return getCurrentProperty("capabilities", HostNetCapabilities.class);
    }

    public HostIpRouteConfig getConsoleIpRouteConfig() {
        return getCurrentProperty("consoleIpRouteConfig", HostIpRouteConfig.class);
    }

    @Deprecated(since = "5.5")
    public HostDnsConfig getDnsConfig() {
        return getCurrentProperty("dnsConfig", HostDnsConfig.class);
    }

    @Deprecated(since = "5.5")
    public HostIpRouteConfig getIpRouteConfig() {
        return getCurrentProperty("ipRouteConfig", HostIpRouteConfig.class);
    }

    public HostNetworkConfig getNetworkConfig() {
        return getCurrentProperty("networkConfig", HostNetworkConfig.class);
    }

    public HostNetworkInfo getNetworkInfo() {
        return getCurrentProperty("networkInfo", HostNetworkInfo.class);
    }

    @Deprecated(since = "4.0")
    public HostNetOffloadCapabilities getOffloadCapabilities() {
        return getCurrentProperty("offloadCapabilities", HostNetOffloadCapabilities.class);
    }

    public void addPortGroup(final HostPortGroupSpec portgrp) throws HostConfigFault, AlreadyExists, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("portgrp", HostPortGroupSpec.class, portgrp));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("AddPortGroup", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String addServiceConsoleVirtualNic(final String portgroup, final HostVirtualNicSpec nic)
            throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("portgroup", String.class, portgroup),
                new Argument("nic", HostVirtualNicSpec.class, nic));
        try {
            return this.getVimService().getWsc().invoke("AddServiceConsoleVirtualNic", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String addVirtualNic(final String portgroup, final HostVirtualNicSpec nic)
            throws HostConfigFault, InvalidState, AlreadyExists, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("portgroup", String.class, portgroup),
                new Argument("nic", HostVirtualNicSpec.class, nic));
        try {
            return this.getVimService().getWsc().invoke("AddVirtualNic", params, String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void addVirtualSwitch(final String vswitchName, final HostVirtualSwitchSpec spec)
            throws HostConfigFault, ResourceInUse, AlreadyExists, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vswitchName", String.class, vswitchName),
                new Argument("spec", HostVirtualSwitchSpec.class, spec));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("AddVirtualSwitch", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<PhysicalNicHintInfo> queryNetworkHint(final List<String> device)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("device", String[].class, device.toArray()));
        try {
            return (List<PhysicalNicHintInfo>) this.getVimService().getWsc()
                    .invoke("QueryNetworkHint", params, "List.PhysicalNicHintInfo");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void refreshNetworkSystem() throws RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RefreshNetworkSystem", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void removePortGroup(final String pgName) throws HostConfigFault, ResourceInUse, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("pgName", String.class, pgName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemovePortGroup", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void removeServiceConsoleVirtualNic(final String device) throws HostConfigFault, ResourceInUse, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("device", String.class, device));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveServiceConsoleVirtualNic", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void removeVirtualNic(final String device) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("device", String.class, device));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveVirtualNic", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void removeVirtualSwitch(final String vswitchName) throws HostConfigFault, ResourceInUse, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vswitchName", String.class, vswitchName));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveVirtualSwitch", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void restartServiceConsoleVirtualNic(final String device) throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("device", String.class, device));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RestartServiceConsoleVirtualNic", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateConsoleIpRouteConfig(final HostIpRouteConfig config) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("config", HostIpRouteConfig.class, config));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateConsoleIpRouteConfig", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "5.5")
    public void updateDnsConfig(final HostDnsConfig config) throws HostInDomain, HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("config", HostDnsConfig.class, config));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateDnsConfig", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostInDomain) {
                throw (HostInDomain) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "5.5")
    public void updateIpRouteConfig(final HostIpRouteConfig config) throws HostConfigFault, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("config", HostIpRouteConfig.class, config));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateIpRouteConfig", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "5.5")
    public void updateIpRouteTableConfig(final HostIpRouteTableConfig config) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("config", HostIpRouteTableConfig.class, config));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateIpRouteTableConfig", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public HostNetworkConfigResult updateNetworkConfig(final HostNetworkConfig config, final HostConfigChangeMode changeMode)
            throws HostConfigFault, AlreadyExists, NotFound, ResourceInUse, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("config", HostNetworkConfig.class, config),
                new Argument("changeMode", String.class, changeMode.name()));
        try {
            return this.getVimService().getWsc().invoke("UpdateNetworkConfig", params, HostNetworkConfigResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updatePhysicalNicLinkSpeed(final String device, final PhysicalNicLinkInfo linkSpeed)
            throws HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("device", String.class, device),
                new Argument("linkSpeed", PhysicalNicLinkInfo.class, linkSpeed));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdatePhysicalNicLinkSpeed", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updatePortGroup(final String pgName, final HostPortGroupSpec portgrp)
            throws AlreadyExists, HostConfigFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("pgName", String.class, pgName),
                new Argument("portgrp", HostPortGroupSpec.class, portgrp));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdatePortGroup", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateServiceConsoleVirtualNic(final String device, final HostVirtualNicSpec nic)
            throws HostConfigFault, ResourceInUse, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("device", String.class, device),
                new Argument("nic", HostVirtualNicSpec.class, nic));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateServiceConsoleVirtualNic", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateVirtualNic(final String device, final HostVirtualNicSpec nic)
            throws HostConfigFault, NotFound, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("device", String.class, device),
                new Argument("nic", HostVirtualNicSpec.class, nic));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateVirtualNic", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateVirtualSwitch(final String vswitchName, final HostVirtualSwitchSpec spec)
            throws HostConfigFault, ResourceInUse, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vswitchName", String.class, vswitchName),
                new Argument("spec", HostVirtualSwitchSpec.class, spec));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateVirtualSwitch", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ResourceInUse) {
                throw (ResourceInUse) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
