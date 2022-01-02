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
import java.util.Calendar;
import java.util.List;

/**
 * This managed object provides for NTP and date/time related configuration on a host.
 * Information regarding the running status of the NTP daemon and functionality to start and stop the daemon is provided by the {@see HostServiceSystem} object.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.3
 */
public class HostDateTimeSystem extends ManagedObject {

    public HostDateTimeSystem(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public HostDateTimeInfo getDateTimeInfo() {
        return getCurrentProperty("dateTimeInfo", HostDateTimeInfo.class);
    }

    /**
     * Retrieves the list of available timezones on the host. The API works off the public domain 'tz' timezone database.
     *
     * @return List of available timezones on the host.
     * @throws RuntimeFault Thrown if any type of runtime fault is thrown that is not covered by the other faults; for example, a communication error.
     */
    public List<HostDateTimeSystemTimeZone> queryAvailableTimeZones() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invokeWithListReturn("QueryAvailableTimeZones", this.getSingleSelfArgumentList(), HostDateTimeSystemTimeZone.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    /**
     * Get the current DateTime on the host.
     *
     * @return Current DateTime on the host.
     * @throws RuntimeFault Thrown if any type of runtime fault is thrown that is not covered by the other faults; for example, a communication error.
     */
    public Calendar queryDateTime() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("QueryDateTime", this.getSingleSelfArgumentList(), Calendar.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    /**
     * Refresh the DateTime related settings to pick up any changes that might have occurred.
     *
     * @throws RuntimeFault Thrown if any type of runtime fault is thrown that is not covered by the other faults; for example, a communication error.
     */
    public void refreshDateTimeSystem() throws RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RefreshDateTimeSystem", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    /**
     * Update the date/time on the host. This method should be used with caution since network delays, execution delays can result in time skews.
     *
     * @param dateTime DateTime to update the host to.
     * @throws HostConfigFault Thrown if an error occurs.
     * @throws RuntimeFault Thrown if any type of runtime fault is thrown that is not covered by the other faults; for example, a communication error.
     */
    public void updateDateTime(final Calendar dateTime) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(), new Argument("dateTime", Calendar.class, dateTime));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateDateTime", params);
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

    /**
     * Update the DateTime configuration of the host.
     *
     * @param config The new DateTime configuration information
     * @throws HostConfigFault Thrown if an error occurs.
     * @throws RuntimeFault Thrown if any type of runtime fault is thrown that is not covered by the other faults; for example, a communication error.
     */
    public void updateDateTimeConfig(final HostDateTimeConfig config) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(), new Argument("config", HostDateTimeConfig.class, config));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateDateTimeConfig", params);
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

    /**
     * Run a test to validate current time service configuration is functioning normally.
     * The report will provide a localized diagnostic of any issues. Only one diagnostic test may be running at a time.
     *
     * @return The status of the time service on this host based on present time service configuration.
     * @throws RuntimeFault Thrown if any type of runtime fault is thrown that is not covered by the other faults; for example, a communication error.
     */
    public HostDateTimeSystemServiceTestResult testTimeService() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("TestTimeService", this.getSingleSelfArgumentList(), HostDateTimeSystemServiceTestResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
