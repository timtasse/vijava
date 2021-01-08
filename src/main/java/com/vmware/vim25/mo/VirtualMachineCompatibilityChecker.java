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
 * A singleton managed object that can answer questions about compatibility of a virtual machine with a host.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @Version 6.7
 * @since 4.0
 */
public class VirtualMachineCompatibilityChecker extends ManagedObject {

    public VirtualMachineCompatibilityChecker(ServerConnection sc, ManagedObjectReference mor) {
        super(sc, mor);
    }

    public Task checkCompatibility_Task(VirtualMachine vm, HostSystem host, ResourcePool pool, String[] testType)
            throws NoActiveHostInCluster, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference taskMor = getVimService().checkCompatibility_Task(getMOR(),
                vm == null ? null : vm.getMOR(), host == null ? null : host.getMOR(),
                pool == null ? null : pool.getMOR(), testType);
        return new Task(getServerConnection(), taskMor);
    }

    public Task checkPowerOn(final ManagedObjectReference vm, final ManagedObjectReference host, final ManagedObjectReference pool, final List<String> testType)
            throws DatacenterMismatch, InvalidArgument, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, vm),
                new Argument("host", ManagedObjectReference.class, host),
                new Argument("pool", ManagedObjectReference.class, pool),
                new Argument("testType", "String[]", testType != null ? testType.toArray() : null));
        final ManagedObjectReference mor = this.getVimService().getWsc()
                .invoke("CheckPowerOn_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task checkVmConfig(final VirtualMachineConfigSpec spec, final ManagedObjectReference vm, final ManagedObjectReference host, final ManagedObjectReference pool, final List<String> testType)
            throws DatacenterMismatch, InvalidArgument, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", VirtualMachineConfigSpec.class, spec),
                new Argument("vm", ManagedObjectReference.class, vm),
                new Argument("host", ManagedObjectReference.class, host),
                new Argument("pool", ManagedObjectReference.class, pool),
                new Argument("testType", "String[]", testType != null ? testType.toArray() : null));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("CheckVmConfig_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

}
