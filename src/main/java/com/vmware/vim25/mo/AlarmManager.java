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
 * The alarm manager is a singleton object for managing alarms within a service instance.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */
public class AlarmManager extends ManagedObject {

    public AlarmManager(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public AlarmExpression[] getDefaultExpression() {
        return (AlarmExpression[]) getCurrentProperty("defaultExpression");
    }

    public AlarmDescription getDescription() {
        return (AlarmDescription) this.getCurrentProperty("description");
    }

    /**
     * @since 4.0
     */
    public void acknowledgeAlarm(final Alarm alarm, final ManagedEntity entity) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("alarm", ManagedObjectReference.class, alarm),
                new Argument("entity", ManagedObjectReference.class, entity));
        this.getVimService().getWsc().invokeWithoutReturn("AcknowledgeAlarm", params);
    }

    /**
     * @since 4.0
     */
    public boolean areAlarmActionsEnabled(final ManagedEntity entity) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", ManagedObjectReference.class, entity));
        return this.getVimService().getWsc().invoke("AreAlarmActionsEnabled", params, Boolean.class);
    }

    public void clearTriggeredAlarms(final AlarmFilterSpec filter) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("filter", "AlarmFilterSpec", filter));
        this.getVimService().getWsc().invokeWithoutReturn("ClearTriggeredAlarms", params);
    }

    public Alarm createAlarm(final ManagedEntity me, final AlarmSpec as) throws InvalidName, DuplicateName, RuntimeFault, RemoteException {
        if (me == null) {
            throw new IllegalArgumentException("entity must not be null.");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", ManagedObjectReference.class, me.getMOR()),
                new Argument("spec", AlarmSpec.class, as));
        final ManagedObjectReference mor = this.getVimService().getWsc()
                .invoke("CreateAlarm", params, ManagedObjectReference.class);
        return new Alarm(this.getServerConnection(), mor);
    }

    /**
     * @since 4.0
     */
    public void enableAlarmActions(final ManagedEntity entity, final boolean enabled) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", ManagedObjectReference.class, entity.getMOR()),
                Argument.fromBasicType("enabled", enabled));
        this.getVimService().getWsc().invokeWithoutReturn("EnableAlarmActions", params);
    }

    public List<Alarm> getAlarm(final ManagedEntity me) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", ManagedObjectReference.class, me == null ? null : me.getMOR()));
        final List<ManagedObjectReference> mors = this.getVimService().getWsc().invokeWithListReturn("GetAlarm", params, ManagedObjectReference.class);
        return mors.stream().map(mor -> new Alarm(this.getServerConnection(), mor)).collect(Collectors.toList());
    }

    public List<AlarmState> getAlarmState(final ManagedEntity me) throws RuntimeFault, RemoteException {
        if (me == null) {
            throw new IllegalArgumentException("entity must not be null.");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", "ManagedObjectReference", me.getMOR()));
        return this.getVimService().getWsc().invokeWithListReturn("GetAlarmState", params, AlarmState.class);
    }

}
