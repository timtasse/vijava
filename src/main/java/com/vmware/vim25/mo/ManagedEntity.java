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

import static org.doublecloud.ws.util.TypeUtil.asNullSafeList;

/**
 * ManagedEntity represents the managed objects that can be listed in the inventory tree.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
@SuppressWarnings("unused")
public class ManagedEntity extends ExtensibleManagedObject {

    private String name;

    public ManagedEntity(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public String getRealName() {
        return getCurrentProperty("name", String.class);
    }

    /**
     * @since SDK4.0
     */
    public boolean getAlarmActionEabled() {
        final Boolean aae = getCurrentProperty("alarmActionsEnabled", Boolean.class);
        return aae != null && aae;
    }

    public List<Event> getConfigIssue() {
        return asNullSafeList(getCurrentProperty("configIssue", Event[].class));
    }

    public ManagedEntityStatus getConfigStatus() {
        return getCurrentProperty("configStatus", ManagedEntityStatus.class);
    }

    public List<CustomFieldValue> getCustomValue() {
        return asNullSafeList(getCurrentProperty("customValue", CustomFieldValue[].class));
    }

    public List<AlarmState> getDeclaredAlarmState() {
        return asNullSafeList(getCurrentProperty("declaredAlarmState", AlarmState[].class));
    }

    public List<String> getDisabledMethod() {
        return asNullSafeList(getCurrentProperty("disabledMethod", String[].class));
    }

    public List<Integer> getEffectiveRole() {
        return Arrays.stream(getCurrentProperty("effectiveRole", int[].class)).boxed().collect(Collectors.toList());
    }

    public String getName() {
        if (this.name == null) {
            this.name = this.getRealName();
        }
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ManagedEntityStatus getOverallStatus() {
        return getCurrentProperty("overallStatus", ManagedEntityStatus.class);
    }

    public ManagedEntity getParent() {
        return (ManagedEntity) this.getManagedObject("parent");
    }

    public List<Permission> getPermission() {
        return asNullSafeList(getCurrentProperty("permission", Permission[].class));
    }

    public List<Task> getRecentTasks() {
        return getTasks("recentTask");
    }

    /**
     * @since SDK4.0
     */
    public List<Tag> getTag() {
        return asNullSafeList(getCurrentProperty("tag", Tag[].class));
    }

    public List<AlarmState> getTriggeredAlarmState() {
        return asNullSafeList(getCurrentProperty("triggeredAlarmState", AlarmState[].class));
    }

    public Task destroy_Task() throws VimFault, RuntimeFault {
        try {
            final var mor = this.getVimService().getWsc().invoke("Destroy_Task", this.getSingleSelfArgumentList(), ManagedObjectReference.class);
            return new Task(getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VimFault) {
                throw (VimFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void reload() throws RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("Reload", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task rename_Task(final String name) throws InvalidName, DuplicateName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("newName", String.class, name));
        try {
            final var mor = this.getVimService().getWsc().invoke("Rename_Task", params, ManagedObjectReference.class);
            return new Task(getServerConnection(), mor);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
