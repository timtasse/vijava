package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Interface to manage virtual storage object on a vCenter. VStorageObjectManager and SPBM policy support:
 * All of the VStorageObjectManager APIs requiring ESXi host uses "Programatically selected" host to perform the actual operation.
 * If the selected host is of 6.5 version then policy would not be passed down to host.
 * In that case, user operation would succeed but if user checks SPBM Entity Compliance, it will show "Mismatch" / "Non Compliant" as a compliance result.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.5
 */
@SuppressWarnings("unchecked")
public class VcenterVStorageObjectManager extends VStorageObjectManagerBase {

    public VcenterVStorageObjectManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public void attachTagToVStorageObject(final ID id, final String category, final String tag) throws NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("category", "String", category),
                new Argument("tag", "String", tag));
        this.getVimService().getWsc().invokeWithoutReturn("AttachTagToVStorageObject", params);
    }

    public void clearVStorageObjectControlFlags(final ID id, final ManagedObjectReference datastore, final List<String> controlFlags) throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore),
                new Argument("controlFlags", "String[]", controlFlags));
        this.getVimService().getWsc().invokeWithoutReturn("ClearVStorageObjectControlFlags", params);
    }

    public void clearVStorageObjectControlFlags(final ID id, final Datastore datastore, final List<String> controlFlags) throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        this.clearVStorageObjectControlFlags(id, datastore.getMOR(), controlFlags);
    }

    public Task cloneVStorageObject(final ID id, final ManagedObjectReference datastore, final VslmCloneSpec spec) throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore),
                new Argument("spec", "VslmCloneSpec", spec));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc().invoke("CloneVStorageObject_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task cloneVStorageObject(final ID id, final Datastore datastore, final VslmCloneSpec spec) throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        return this.cloneVStorageObject(id, datastore.getMOR(), spec);
    }

    public Task createDisk(final VslmCreateSpec spec) throws FileFault, InvalidDatastore, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(), new Argument("spec", "VslmCreateSpec", spec));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc().invoke("CreateDisk_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task createDiskFromSnapshot(final ID id, final ManagedObjectReference datastore, final ID snapshotId, final String name,
                                       final List<VirtualMachineProfileSpec> profile, final CryptoSpec crypto, final String path)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore),
                new Argument("snapshotId", "ID", snapshotId),
                new Argument("name", "String", name),
                new Argument("profile", "VirtualMachineProfileSpec[]", profile.toArray()),
                new Argument("crypto", CryptoSpec.class.getSimpleName(), crypto),
                new Argument("path", "String", path));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc().invoke("CreateDiskFromSnapshot_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task createDiskFromSnapshot(final ID id, final Datastore datastore, final ID snapshotId, final String name,
                                       final List<VirtualMachineProfileSpec> profile, final CryptoSpec crypto, final String path)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.createDiskFromSnapshot(id, datastore.getMOR(), snapshotId, name, profile, crypto, path);
    }

    public Task deleteSnapshot(final ID id, final ManagedObjectReference datastore, final ID snapshotId)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore),
                new Argument("snapshotId", "ID", snapshotId));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc().invoke("DeleteSnapshot_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task deleteSnapshot(final ID id, final Datastore datastore, final ID snapshotId)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.deleteSnapshot(id, datastore.getMOR(), snapshotId);
    }

    public Task deleteVStorageObject(final ID id, final ManagedObjectReference datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc().invoke("DeleteVStorageObject_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task deleteVStorageObject(final ID id, final Datastore datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        return this.deleteVStorageObject(id, datastore.getMOR());
    }

    public void detachTagFromVStorageObject(final ID id, final String category, final String tag) throws NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("category", "String", category),
                new Argument("tag", "String", tag));
        this.getVimService().getWsc().invokeWithoutReturn("DetachTagFromVStorageObject", params);
    }

    public Task extendDisk(final ID id, final ManagedObjectReference datastore, final long newCapacityInMB) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore),
                new Argument("newCapacityInMB", "long", newCapacityInMB));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc().invoke("ExtendDisk_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task extendDisk(final ID id, final Datastore datastore, final long newCapacityInMB) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        return this.extendDisk(id, datastore.getMOR(), newCapacityInMB);
    }

    public Task inflateDisk(final ID id, final ManagedObjectReference datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc().invoke("InflateDisk_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task inflateDisk(final ID id, final Datastore datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        return this.inflateDisk(id, datastore.getMOR());
    }

    public List<VslmTagEntry> listTagsAttachedToVStorageObject(final ID id) throws NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id));
        return (List<VslmTagEntry>) this.getVimService().getWsc().invoke("ListTagsAttachedToVStorageObject", params, "List.VslmTagEntry");
    }

    public List<ID> listVStorageObject(final ManagedObjectReference datastore) throws InvalidDatastore, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore));
        return (List<ID>) this.getVimService().getWsc().invoke("ListVStorageObject", params, "List.ID");
    }

    public List<ID> listVStorageObject(final Datastore datastore) throws InvalidDatastore, RuntimeFault, RemoteException {
        return this.listVStorageObject(datastore.getMOR());
    }

    public List<ID> listVStorageObjectsAttachedToTag(final String category, final String tag) throws NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("category", "String", category),
                new Argument("tag", "String", tag));
        return (List<ID>) this.getVimService().getWsc().invoke("ListVStorageObjectsAttachedToTag", params, "List.ID");
    }

    public Task reconcileDatastoreInventory(final ManagedObjectReference datastore) throws InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc().invoke("ReconcileDatastoreInventory_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task reconcileDatastoreInventory(final Datastore datastore) throws InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        return this.reconcileDatastoreInventory(datastore.getMOR());
    }

    public VStorageObject registerDisk(final String path, final String name) throws AlreadyExists, FileFault, InvalidDatastore, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("path", "String", path),
                new Argument("name", "String", name));
        return (VStorageObject) this.getVimService().getWsc().invoke("RegisterDisk", params, VStorageObject.class.getSimpleName());
    }

    public Task relocateVStorageObject(final ID id, final ManagedObjectReference datastore, final VslmRelocateSpec spec)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore),
                new Argument("spec", VslmRelocateSpec.class.getSimpleName(), spec));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc().invoke("RelocateVStorageObject_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task relocateVStorageObject(final ID id, final Datastore datastore, final VslmRelocateSpec spec)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.relocateVStorageObject(id, datastore.getMOR(), spec);
    }

    public void renameVStorageObject(final ID id, final ManagedObjectReference datastore, final String name)
            throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore),
                new Argument("name", "String", name));
        this.getVimService().getWsc().invokeWithoutReturn("RenameVStorageObject", params);
    }

    public void renameVStorageObject(final ID id, final Datastore datastore, final String name)
            throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        this.renameVStorageObject(id, datastore.getMOR(), name);
    }

    public VStorageObjectSnapshotInfo retrieveSnapshotInfo(final ID id, final ManagedObjectReference datastore)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore));
        return (VStorageObjectSnapshotInfo) this.getVimService().getWsc().invoke("RetrieveSnapshotInfo", params, VStorageObjectSnapshotInfo.class.getSimpleName());
    }

    public VStorageObjectSnapshotInfo retrieveSnapshotInfo(final ID id, final Datastore datastore)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.retrieveSnapshotInfo(id, datastore.getMOR());
    }

    public List<vslmInfrastructureObjectPolicy> retrieveVStorageInfrastructureObjectPolicy(final ManagedObjectReference datastore)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore));
        return (List<vslmInfrastructureObjectPolicy>) this.getVimService().getWsc().invoke("RetrieveVStorageInfrastructureObjectPolicy", params, "List.vslmInfrastructureObjectPolicy");
    }

    public List<vslmInfrastructureObjectPolicy> retrieveVStorageInfrastructureObjectPolicy(final Datastore datastore)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.retrieveVStorageInfrastructureObjectPolicy(datastore.getMOR());
    }

    public VStorageObject retrieveVStorageObject(final ID id, final ManagedObjectReference datastore)
            throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore));
        return (VStorageObject) this.getVimService().getWsc().invoke("RetrieveVStorageObject", params, VStorageObject.class.getSimpleName());
    }

    public VStorageObject retrieveVStorageObject(final ID id, final Datastore datastore)
            throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        return this.retrieveVStorageObject(id, datastore.getMOR());
    }

    public List<VStorageObjectAssociations> retrieveVStorageObjectAssociations(final List<RetrieveVStorageObjSpec> ids) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("ids", "RetrieveVStorageObjSpec[]", ids.toArray()));
        return (List<VStorageObjectAssociations>) this.getVimService().getWsc().invoke("RetrieveVStorageObjectAssociations", params, "List.VStorageObjectAssociations");
    }

    public VStorageObjectStateInfo retrieveVStorageObjectState(final ID id, final ManagedObjectReference datastore)
            throws FileFault, InvalidDatastore, NotFound, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore));
        return (VStorageObjectStateInfo) this.getVimService().getWsc().invoke("RetrieveVStorageObjectState", params, VStorageObjectStateInfo.class.getSimpleName());
    }

    public VStorageObjectStateInfo retrieveVStorageObjectState(final ID id, final Datastore datastore) throws FileFault, InvalidDatastore, NotFound, RemoteException {
        return this.retrieveVStorageObjectState(id, datastore.getMOR());
    }

    public Task revertVStorageObject(final ID id, final ManagedObjectReference datastore, final ID snapshotId)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore),
                new Argument("snapshotId", "ID", snapshotId));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc().invoke("RevertVStorageObject_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task revertVStorageObject(final ID id, final Datastore datastore, final ID snapshotId)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.revertVStorageObject(id, datastore.getMOR(), snapshotId);
    }

    public void scheduleReconcileDatastoreInventory(final ManagedObjectReference datastore) throws InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), null));
        this.getVimService().getWsc().invokeWithoutReturn("ScheduleReconcileDatastoreInventory", params);
    }

    public void scheduleReconcileDatastoreInventory(final Datastore datastore) throws InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        this.scheduleReconcileDatastoreInventory(datastore.getMOR());
    }

    public void setVStorageObjectControlFlags(final ID id, final ManagedObjectReference datastore, final List<String> controlFlags)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore),
                new Argument("controlFlags", "String[]", controlFlags.toArray()));
        this.getVimService().getWsc().invokeWithoutReturn("SetVStorageObjectControlFlags", params);
    }

    public void setVStorageObjectControlFlags(final ID id, final Datastore datastore, final List<String> controlFlags)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        this.setVStorageObjectControlFlags(id, datastore.getMOR(), controlFlags);
    }

    public Task updateVStorageInfrastructureObjectPolicy(final vslmInfrastructureObjectPolicySpec spec)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", vslmInfrastructureObjectPolicySpec.class.getSimpleName(), spec));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc()
                .invoke("UpdateVStorageInfrastructureObjectPolicy_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task updateVStorageObjectPolicy(final ID id, final ManagedObjectReference datastore, final List<VirtualMachineProfileSpec> profile)
            throws FileFault, InvalidDatastore, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore),
                new Argument("profile", "VirtualMachineProfileSpec[]", profile.toArray()));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc()
                .invoke("UpdateVStorageObjectPolicy_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task updateVStorageObjectPolicy(final ID id, final Datastore datastore, final List<VirtualMachineProfileSpec> profile)
            throws FileFault, InvalidDatastore, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        return this.updateVStorageObjectPolicy(id, datastore.getMOR(), profile);
    }

    public Task createSnapshot(final ID id, final ManagedObjectReference datastore, final String description)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", "ID", id),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore),
                new Argument("description", "String", description));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc()
                .invoke("VStorageObjectCreateSnapshot_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task createSnapshot(final ID id, final Datastore datastore, final String description)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.createSnapshot(id, datastore.getMOR(), description);
    }

}
