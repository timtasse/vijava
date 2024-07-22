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
import java.util.stream.Collectors;

/**
 * The managed object class corresponding to the one defined in VI SDK API reference.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
public class PropertyCollector extends ManagedObject {

    public PropertyCollector(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public List<PropertyFilter> getFilters() {
        return Arrays.stream(this.getManagedObjects("filter"))
                .map(PropertyFilter.class::cast)
                .collect(Collectors.toList());
    }

    /**
     * @since SDK4.1
     */
    public void cancelRetrievePropertiesEx(final String token) throws InvalidProperty, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("token", String.class, token));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("CancelRetrievePropertiesEx", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidProperty) {
                throw (InvalidProperty) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void cancelWaitForUpdates() throws RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("CancelWaitForUpdates", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    /**
     * @since SDK4.1
     */
    public RetrieveResult continueRetrievePropertiesEx(final String token) throws InvalidProperty, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("token", String.class, token));
        try {
            return this.getVimService().getWsc().invoke("ContinueRetrievePropertiesEx", params, RetrieveResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidProperty) {
                throw (InvalidProperty) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    /**
     * @deprecated As of vSphere API 4.1, use WaitForUpdatesEx with a maxWaitSeconds of 0
     */
    @Deprecated
    public UpdateSet checkForUpdates(final String version) throws InvalidCollectorVersion, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("version", String.class, version));
        try {
            return this.getVimService().getWsc().invoke("CheckForUpdates", params, UpdateSet.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidCollectorVersion) {
                throw (InvalidCollectorVersion) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public PropertyFilter createFilter(final PropertyFilterSpec spec, final boolean partialUpdates) throws InvalidProperty, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", PropertyFilterSpec.class, spec),
                Argument.fromBasicType("partialUpdates", partialUpdates));
        try {
            final var mor = this.getVimService().getWsc().invoke("CreateFilter", params, ManagedObjectReference.class);
            return new PropertyFilter(getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidProperty) {
                throw (InvalidProperty) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    /**
     * @since SDK4.1
     */
    public PropertyCollector createPropertyCollector() throws RuntimeFault {
        try {
            final var mor = this.getVimService().getWsc().invoke("CreatePropertyCollector", this.getSingleSelfArgumentList(), ManagedObjectReference.class);
            return new PropertyCollector(getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    /**
     * @since SDK4.1
     */
    public void destroyPropertyCollector() throws RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DestroyPropertyCollector", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    /**
     * @deprecated as of SDK4.1
     */
    @Deprecated
    public ObjectContent[] retrieveProperties(final PropertyFilterSpec[] specSet) throws InvalidProperty, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("specSet", PropertyFilterSpec[].class, specSet));
        try {
            return this.getVimService().getWsc().invoke("RetrieveProperties", params, ObjectContent[].class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidProperty) {
                throw (InvalidProperty) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }

    }

    /**
     * @since SDK4.1
     */
    public RetrieveResult retrievePropertiesEx(final List<PropertyFilterSpec> specSet, final RetrieveOptions options) throws InvalidProperty, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("specSet", PropertyFilterSpec[].class, specSet),
                new Argument("options", RetrieveOptions.class, options == null ? new RetrieveOptions() : options));
        try {
            return this.getVimService().getWsc().invoke("RetrievePropertiesEx", params, RetrieveResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidProperty) {
                throw (InvalidProperty) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    /**
     * @deprecated as of SDK4.1
     */
    @Deprecated
    public UpdateSet waitForUpdates(final String version) throws InvalidCollectorVersion, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("version", String.class, version));
        try {
            return this.getVimService().getWsc().invoke("WaitForUpdates", params, UpdateSet.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidCollectorVersion) {
                throw (InvalidCollectorVersion) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }

    }

    /**
     * @since SDK4.1
     */
    public UpdateSet waitForUpdatesEx(final String version, final WaitOptions options) throws InvalidCollectorVersion, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("version", String.class, version),
                new Argument("options", WaitOptions.class, options == null ? new WaitOptions() : options));
        try {
            return this.getVimService().getWsc().invoke("WaitForUpdatesEx", params, UpdateSet.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidCollectorVersion) {
                throw (InvalidCollectorVersion) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
