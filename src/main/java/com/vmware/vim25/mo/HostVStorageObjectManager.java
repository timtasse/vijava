package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Interface to manage virtual storage object on an ESXi host.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2
 * @since 6.5
 */
@SuppressWarnings("unchecked")
public class HostVStorageObjectManager extends VStorageObjectManagerBase {

    public HostVStorageObjectManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public void clearVStorageObjectControlFlags(final ID id, final ManagedObjectReference datastore, final List<String> controlFlags) throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("controlFlags", String[].class, controlFlags.toArray()));
        this.getVimService().getWsc().invokeWithoutReturn("HostClearVStorageObjectControlFlags", params);
    }

    public void clearVStorageObjectControlFlags(final ID id, final Datastore datastore, final List<String> controlFlags) throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        this.clearVStorageObjectControlFlags(id, datastore.getMOR(), controlFlags);
    }

    public Task cloneVStorageObject(final ID id, final ManagedObjectReference datastore, final VslmCloneSpec spec) throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("spec", VslmCloneSpec.class, spec));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("HostCloneVStorageObject_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task cloneVStorageObject(final ID id, final Datastore datastore, final VslmCloneSpec spec) throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        return this.cloneVStorageObject(id, datastore.getMOR(), spec);
    }

    public Task createDisk(final VslmCreateSpec spec) throws FileFault, InvalidDatastore, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(), new Argument("spec", VslmCreateSpec.class, spec));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("HostCreateDisk_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task deleteVStorageObject(final ID id, final ManagedObjectReference datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("HostDeleteVStorageObject_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task deleteVStorageObject(final ID id, final Datastore datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        return this.deleteVStorageObject(id, datastore.getMOR());
    }

    public Task deleteVStorageObjectEx(final ID id, final ManagedObjectReference datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("HostDeleteVStorageObjectEx_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task deleteVStorageObjectEx(final ID id, final Datastore datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        return this.deleteVStorageObjectEx(id, datastore.getMOR());
    }

    public Task extendDisk(final ID id, final ManagedObjectReference datastore, final long newCapacityInMB) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                Argument.fromBasicType("newCapacityInMB", newCapacityInMB));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("HostExtendDisk_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task extendDisk(final ID id, final Datastore datastore, final long newCapacityInMB) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        return this.extendDisk(id, datastore.getMOR(), newCapacityInMB);
    }

    public Task inflateDisk(final ID id, final ManagedObjectReference datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("HostInflateDisk_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task inflateDisk(final ID id, final Datastore datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        return this.inflateDisk(id, datastore.getMOR());
    }

    public List<ID> listVStorageObject(final ManagedObjectReference datastore) throws InvalidDatastore, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        return this.getVimService().getWsc().invokeWithListReturn("HostListVStorageObject", params, ID.class);
    }

    public List<ID> listVStorageObject(final Datastore datastore) throws InvalidDatastore, RuntimeFault, RemoteException {
        return this.listVStorageObject(datastore.getMOR());
    }

    public Task reconcileDatastoreInventory(final ManagedObjectReference datastore) throws InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        final ManagedObjectReference mor = this.getVimService().getWsc()
                .invoke("HostReconcileDatastoreInventory_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task reconcileDatastoreInventory(final Datastore datastore) throws InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        return this.reconcileDatastoreInventory(datastore.getMOR());
    }

    public VStorageObject registerDisk(final String path, final String name) throws AlreadyExists, FileFault, InvalidDatastore, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("path", String.class, path),
                new Argument("name", String.class, name));
        return this.getVimService().getWsc().invoke("HostRegisterDisk", params, VStorageObject.class);
    }

    public Task relocateVStorageObject(final ID id, final ManagedObjectReference datastore, final VslmRelocateSpec spec)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("spec", VslmRelocateSpec.class, spec));
        final ManagedObjectReference mor = this.getVimService().getWsc()
                .invoke("HostRelocateVStorageObject_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task relocateVStorageObject(final ID id, final Datastore datastore, final VslmRelocateSpec spec)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.relocateVStorageObject(id, datastore.getMOR(), spec);
    }

    public void renameVStorageObject(final ID id, final ManagedObjectReference datastore, final String name)
            throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("name", String.class, name));
        this.getVimService().getWsc().invokeWithoutReturn("HostRenameVStorageObject", params);
    }

    public void renameVStorageObject(final ID id, final Datastore datastore, final String name)
            throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        this.renameVStorageObject(id, datastore.getMOR(), name);
    }

    public List<vslmInfrastructureObjectPolicy> retrieveVStorageInfrastructureObjectPolicy(final ManagedObjectReference datastore)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        return this.getVimService().getWsc()
                .invokeWithListReturn("HostRetrieveVStorageInfrastructureObjectPolicy", params, vslmInfrastructureObjectPolicy.class);
    }

    public List<vslmInfrastructureObjectPolicy> retrieveVStorageInfrastructureObjectPolicy(final Datastore datastore)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.retrieveVStorageInfrastructureObjectPolicy(datastore.getMOR());
    }

    public VStorageObject retrieveVStorageObject(final ID id, final ManagedObjectReference datastore)
            throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        return this.getVimService().getWsc().invoke("HostRetrieveVStorageObject", params, VStorageObject.class);
    }

    public VStorageObject retrieveVStorageObject(final ID id, final Datastore datastore) throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        return this.retrieveVStorageObject(id, datastore.getMOR());
    }

    public List<KeyValue> retrieveVStorageObjectMetadata(final ID id, final ManagedObjectReference datastore, final ID snapshotId, final String prefix)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("snapshotId", ID.class, snapshotId),
                new Argument("prefix", String.class, prefix));
        return this.getVimService().getWsc().invokeWithListReturn("HostRetrieveVStorageObjectMetadata", params, KeyValue.class);
    }

    public String retrieveVStorageObjectMetadataValue(final ID id, final ManagedObjectReference datastore, final ID snapshotId, final String key)
            throws InvalidDatastore, InvalidState, KeyNotFound, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("snapshotId", ID.class, snapshotId),
                new Argument("key", String.class, key));
        return this.getVimService().getWsc().invoke("HostRetrieveVStorageObjectMetadataValue", params, String.class);
    }

    public VStorageObjectStateInfo retrieveVStorageObjectState(final ID id, final ManagedObjectReference datastore) throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        return this.getVimService().getWsc().invoke("HostRetrieveVStorageObjectState", params, VStorageObjectStateInfo.class);
    }

    public VStorageObjectStateInfo retrieveVStorageObjectState(final ID id, final Datastore datastore) throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        return this.retrieveVStorageObjectState(id, datastore.getMOR());
    }

    public void scheduleReconcileDatastoreInventory(final ManagedObjectReference datastore) throws InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        this.getVimService().getWsc().invokeWithoutReturn("HostScheduleReconcileDatastoreInventory", params);
    }

    public void scheduleReconcileDatastoreInventory(final Datastore datastore) throws InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        this.scheduleReconcileDatastoreInventory(datastore.getMOR());
    }

    public void setVStorageObjectControlFlags(final ID id, final ManagedObjectReference datastore, final List<String> controlFlags)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("controlFlags", String[].class, controlFlags.toArray()));
        this.getVimService().getWsc().invokeWithoutReturn("HostSetVStorageObjectControlFlags", params);
    }

    public void setVStorageObjectControlFlags(final ID id, final Datastore datastore, final List<String> controlFlags)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        this.setVStorageObjectControlFlags(id, datastore.getMOR(), controlFlags);
    }

    public Task updateVStorageObjectMetadata(final ID id, final ManagedObjectReference datastore, final List<KeyValue> metadata, final List<String> deleteKeys)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("metadata", KeyValue[].class, metadata.toArray()),
                new Argument("deleteKeys", String[].class, deleteKeys.toArray()));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("HostUpdateVStorageObjectMetadata_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task updateVStorageObjectMetadataEx(final ID id, final ManagedObjectReference datastore, final List<KeyValue> metadata, final List<String> deleteKeys)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("metadata", KeyValue[].class, metadata.toArray()),
                new Argument("deleteKeys", String[].class, deleteKeys.toArray()));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("HostUpdateVStorageObjectMetadataEx_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task createDiskFromSnapshot(final ID id, final ManagedObjectReference datastore, final ID snapshotId, final String name,
                                       final List<VirtualMachineProfileSpec> profile, final CryptoSpec crypto, final String path)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("snapshotId", ID.class, snapshotId),
                new Argument("name", String.class, name),
                new Argument("profile", VirtualMachineProfileSpec[].class, profile.toArray()),
                new Argument("crypto", CryptoSpec.class, crypto),
                new Argument("path", String.class, path));
        final ManagedObjectReference mor = this.getVimService().getWsc()
                .invoke("HostVStorageObjectCreateDiskFromSnapshot_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task createDiskFromSnapshot(final ID id, final Datastore datastore, final ID snapshotId, final String name,
                                       final List<VirtualMachineProfileSpec> profile, final CryptoSpec crypto, final String path)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.createDiskFromSnapshot(id, datastore.getMOR(), snapshotId, name, profile, crypto, path);
    }

    public Task createSnapshot(final ID id, final ManagedObjectReference datastore, final String description)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("description", String.class, description));
        final ManagedObjectReference mor = this.getVimService().getWsc()
                .invoke("HostVStorageObjectCreateSnapshot_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task createSnapshot(final ID id, final Datastore datastore, final String description)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.createSnapshot(id, datastore.getMOR(), description);
    }

    public Task deleteSnapshot(final ID id, final ManagedObjectReference datastore, final ID snapshotId)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("snapshotId", ID.class, snapshotId));
        final ManagedObjectReference mor = this.getVimService().getWsc()
                .invoke("HostVStorageObjectDeleteSnapshot_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task deleteSnapshot(final ID id, final Datastore datastore, final ID snapshotId)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.deleteSnapshot(id, datastore.getMOR(), snapshotId);
    }

    public VStorageObjectSnapshotInfo retrieveSnapshotInfo(final ID id, final ManagedObjectReference datastore)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        return this.getVimService().getWsc()
                .invoke("HostVStorageObjectRetrieveSnapshotInfo", params, VStorageObjectSnapshotInfo.class);
    }

    public VStorageObjectSnapshotInfo retrieveSnapshotInfo(final ID id, final Datastore datastore)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.retrieveSnapshotInfo(id, datastore.getMOR());
    }

    public Task revertVStorageObject(final ID id, final ManagedObjectReference datastore, final ID snapshotId)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("snapshotId", ID.class, snapshotId));
        final ManagedObjectReference mor = this.getVimService().getWsc()
                .invoke("HostVStorageObjectRevert_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task revertVStorageObject(final ID id, final Datastore datastore, final ID snapshotId)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.revertVStorageObject(id, datastore.getMOR(), snapshotId);
    }

}
