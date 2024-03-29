/*================================================================================
Copyright (c) 2011 VMware, Inc. All Rights Reserved.
Copyright (c) 2012 Steve Jin. All Rights Reserved.

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
 * This managed object type provides a way to configure resource usage for storage resources.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 4.1
 */
public class StorageResourceManager extends ManagedObject {

    public StorageResourceManager(ServerConnection serverConnection, ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    /**
     * @since SDK5.0
     */
    public Task applyStorageDrsRecommendation_Task(String[] keys) throws RuntimeFault, RemoteException {
        ManagedObjectReference taskMor = getVimService().applyStorageDrsRecommendation_Task(getMOR(), keys);
        return new Task(getServerConnection(), taskMor);
    }

    /**
     * @since SDK5.0
     */
    public Task applyStorageDrsRecommendationToPod_Task(StoragePod pod, String key) throws RuntimeFault, RemoteException {
        ManagedObjectReference taskMor = getVimService().applyStorageDrsRecommendationToPod_Task(getMOR(), pod.getMOR(), key);
        return new Task(getServerConnection(), taskMor);
    }

    /**
     * @since SDK5.0
     */
    public void cancelStorageDrsRecommendation(String[] keys) throws RuntimeFault, RemoteException {
        getVimService().cancelStorageDrsRecommendation(getMOR(), keys);
    }

    public Task configureDatastoreIORM_Task(Datastore datastore, StorageIORMConfigSpec spec) throws InaccessibleDatastore, IORMNotSupportedHostOnDatastore, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().configureDatastoreIORM_Task(getMOR(), datastore.getMOR(), spec);
        return new Task(getServerConnection(), mor);
    }

    /**
     * @since SDK5.0
     */
    public Task configureStorageDrsForPod_Task(StoragePod pod, StorageDrsConfigSpec spec, boolean modify) throws RuntimeFault, RemoteException {
        ManagedObjectReference taskMor = getVimService().configureStorageDrsForPod_Task(getMOR(), pod.getMOR(), spec, modify);
        return new Task(getServerConnection(), taskMor);
    }

    /**
     * @since SDK5.1
     */
    public StoragePerformanceSummary[] queryDatastorePerformanceSummary(Datastore datastore) throws NotFound, RuntimeFault, RemoteException {
        return getVimService().queryDatastorePerformanceSummary(getMOR(), datastore.getMOR());
    }

    public StorageIORMConfigOption queryIORMConfigOption(HostSystem host) throws RuntimeFault, RemoteException {
        return getVimService().queryIORMConfigOption(getMOR(), host.getMOR());
    }

    /**
     * @since SDK5.0
     */
    public StoragePlacementResult recommendDatastores(StoragePlacementSpec storageSpec) throws RuntimeFault, RemoteException {
        return getVimService().recommendDatastores(getMOR(), storageSpec);
    }

    /**
     * @since SDK5.0
     */
    public void refreshStorageDrsRecommendation(StoragePod pod) throws RuntimeFault, RemoteException {
        getVimService().refreshStorageDrsRecommendation(getMOR(), pod.getMOR());
    }

    public Task refreshRecommendationsForPod(final ManagedObjectReference pod) throws InvalidArgument, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("pod", ManagedObjectReference.class, pod));
        final ManagedObjectReference mor = this.getVimService().getWsc()
                .invoke("RefreshStorageDrsRecommendationsForPod_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public MethodFault validateStoragePodConfig(final ManagedObjectReference pod, final StorageDrsConfigSpec spec) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("pod", ManagedObjectReference.class, pod),
                new Argument("spec", StorageDrsConfigSpec.class.getSimpleName(), spec));
        return (MethodFault) this.getVimService().getWsc().invoke("ValidateStoragePodConfig", params, MethodFault.class.getSimpleName());
    }

}
