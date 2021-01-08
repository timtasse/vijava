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
import java.util.Collections;
import java.util.List;

/**
 * This managed object type defines an alarm that is triggered and an action that occurs due to the triggered alarm when certain conditions are met on a specific ManagedEntity object.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */

public class Alarm extends ExtensibleManagedObject {

    public Alarm(ServerConnection sc, ManagedObjectReference mor) {
        super(sc, mor);
    }

    public AlarmInfo getAlarmInfo() {
        return (AlarmInfo) getCurrentProperty("info");
    }

    public ManagedEntity getAssociatedEntity() {
        return (ManagedEntity) getManagedObject("info.entity");
    }

    public void reconfigureAlarm(AlarmSpec alarmSpec) throws InvalidName, DuplicateName, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(
                new Argument("_this", "ManagedObjectReference", this.getMOR()),
                new Argument("spec", "AlarmSpec", alarmSpec));
        this.getVimService().getWsc().invokeWithoutReturn("ReconfigureAlarm", params);
    }

    public void removeAlarm() throws RuntimeFault, RemoteException {
        final List<Argument> params = Collections.singletonList(new Argument("_this", "ManagedObjectReference", this.getMOR()));
        this.getVimService().getWsc().invokeWithoutReturn("RemoveAlarm", params);
    }

}
