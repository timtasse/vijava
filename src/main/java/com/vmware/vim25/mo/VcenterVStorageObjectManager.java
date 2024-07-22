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
 * @version 7.0.2
 * @since 6.5
 */
@SuppressWarnings("unused")
public class VcenterVStorageObjectManager extends VStorageObjectManagerBase {

    public VcenterVStorageObjectManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public void attachTagToVStorageObject(final ID id, final String category, final String tag) throws NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("category", String.class, category),
                new Argument("tag", String.class, tag));
        this.getVimService().getWsc().invokeWithoutReturn("AttachTagToVStorageObject", params);
    }

    public void clearVStorageObjectControlFlags(final ID id, final ManagedObjectReference datastore, final List<String> controlFlags) throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("controlFlags", String[].class, controlFlags.toArray()));
        this.getVimService().getWsc().invokeWithoutReturn("ClearVStorageObjectControlFlags", params);
    }

    public void clearVStorageObjectControlFlags(final ID id, final Datastore datastore, final List<String> controlFlags) throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        this.clearVStorageObjectControlFlags(id, datastore.getMOR(), controlFlags);
    }

    public Task cloneVStorageObject(final ID id, final ManagedObjectReference datastore, final VslmCloneSpec spec) throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("spec", VslmCloneSpec.class, spec));
        return this.invokeWithTaskReturn("CloneVStorageObject_Task", params);
    }

    public Task cloneVStorageObject(final ID id, final Datastore datastore, final VslmCloneSpec spec) throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        return this.cloneVStorageObject(id, datastore.getMOR(), spec);
    }

    public Task createDisk(final VslmCreateSpec spec) throws FileFault, InvalidDatastore, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(), new Argument("spec", VslmCreateSpec.class, spec));
        return this.invokeWithTaskReturn("CreateDisk_Task", params);
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
        return this.invokeWithTaskReturn("CreateDiskFromSnapshot_Task", params);
    }

    public Task createDiskFromSnapshot(final ID id, final Datastore datastore, final ID snapshotId, final String name,
                                       final List<VirtualMachineProfileSpec> profile, final CryptoSpec crypto, final String path)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.createDiskFromSnapshot(id, datastore.getMOR(), snapshotId, name, profile, crypto, path);
    }

    public Task deleteSnapshot(final ID id, final ManagedObjectReference datastore, final ID snapshotId)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("snapshotId", ID.class, snapshotId));
        return this.invokeWithTaskReturn("DeleteSnapshot_Task", params);
    }

    public Task deleteSnapshot(final ID id, final Datastore datastore, final ID snapshotId)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.deleteSnapshot(id, datastore.getMOR(), snapshotId);
    }

    public Task deleteVStorageObject(final ID id, final ManagedObjectReference datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        return this.invokeWithTaskReturn("DeleteVStorageObject_Task", params);
    }

    public Task deleteVStorageObject(final ID id, final Datastore datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        return this.deleteVStorageObject(id, datastore.getMOR());
    }

    public Task deleteVStorageObjectEx(final ID id, final ManagedObjectReference datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        return this.invokeWithTaskReturn("DeleteVStorageObjectEx_Task", params);
    }

    public Task deleteVStorageObjectEx(final ID id, final Datastore datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        return this.deleteVStorageObjectEx(id, datastore.getMOR());
    }

    public void detachTagFromVStorageObject(final ID id, final String category, final String tag) throws NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("category", String.class, category),
                new Argument("tag", String.class, tag));
        this.getVimService().getWsc().invokeWithoutReturn("DetachTagFromVStorageObject", params);
    }

    public Task extendDisk(final ID id, final ManagedObjectReference datastore, final long newCapacityInMB) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                Argument.fromBasicType("newCapacityInMB", newCapacityInMB));
        return this.invokeWithTaskReturn("ExtendDisk_Task", params);
    }

    public Task extendDisk(final ID id, final Datastore datastore, final long newCapacityInMB) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        return this.extendDisk(id, datastore.getMOR(), newCapacityInMB);
    }

    public Task inflateDisk(final ID id, final ManagedObjectReference datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        return this.invokeWithTaskReturn("InflateDisk_Task", params);
    }

    public Task inflateDisk(final ID id, final Datastore datastore) throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        return this.inflateDisk(id, datastore.getMOR());
    }

    public List<VslmTagEntry> listTagsAttachedToVStorageObject(final ID id) throws NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id));
        return this.getVimService().getWsc().invokeWithListReturn("ListTagsAttachedToVStorageObject", params, VslmTagEntry.class);
    }

    public List<ID> listVStorageObject(final ManagedObjectReference datastore) throws InvalidDatastore, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        return this.getVimService().getWsc().invokeWithListReturn("ListVStorageObject", params, ID.class);
    }

    public List<ID> listVStorageObject(final Datastore datastore) throws InvalidDatastore, RuntimeFault, RemoteException {
        return this.listVStorageObject(datastore.getMOR());
    }

    public List<ID> listVStorageObjectsAttachedToTag(final String category, final String tag) throws NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("category", String.class, category),
                new Argument("tag", String.class, tag));
        return this.getVimService().getWsc().invokeWithListReturn("ListVStorageObjectsAttachedToTag", params, ID.class);
    }

    public Task reconcileDatastoreInventory(final ManagedObjectReference datastore) throws InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        return this.invokeWithTaskReturn("ReconcileDatastoreInventory_Task", params);
    }

    public Task reconcileDatastoreInventory(final Datastore datastore) throws InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        return this.reconcileDatastoreInventory(datastore.getMOR());
    }

    public VStorageObject registerDisk(final String path, final String name) throws AlreadyExists, FileFault, InvalidDatastore, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("path", String.class, path),
                new Argument("name", String.class, name));
        return this.getVimService().getWsc().invoke("RegisterDisk", params, VStorageObject.class);
    }

    public Task relocateVStorageObject(final ID id, final ManagedObjectReference datastore, final VslmRelocateSpec spec)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("spec", VslmRelocateSpec.class, spec));
        return this.invokeWithTaskReturn("RelocateVStorageObject_Task", params);
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
        this.getVimService().getWsc().invokeWithoutReturn("RenameVStorageObject", params);
    }

    public void renameVStorageObject(final ID id, final Datastore datastore, final String name)
            throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        this.renameVStorageObject(id, datastore.getMOR(), name);
    }

    public VStorageObjectSnapshotInfo retrieveSnapshotInfo(final ID id, final ManagedObjectReference datastore)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        return this.getVimService().getWsc().invoke("RetrieveSnapshotInfo", params, VStorageObjectSnapshotInfo.class);
    }

    public VStorageObjectSnapshotInfo retrieveSnapshotInfo(final ID id, final Datastore datastore)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.retrieveSnapshotInfo(id, datastore.getMOR());
    }

    public List<vslmInfrastructureObjectPolicy> retrieveVStorageInfrastructureObjectPolicy(final ManagedObjectReference datastore)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        return this.getVimService().getWsc().invokeWithListReturn("RetrieveVStorageInfrastructureObjectPolicy", params, vslmInfrastructureObjectPolicy.class);
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
        return this.getVimService().getWsc().invoke("RetrieveVStorageObject", params, VStorageObject.class);
    }

    public VStorageObject retrieveVStorageObject(final ID id, final Datastore datastore)
            throws FileFault, InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        return this.retrieveVStorageObject(id, datastore.getMOR());
    }

    public List<VStorageObjectAssociations> retrieveVStorageObjectAssociations(final List<RetrieveVStorageObjSpec> ids) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("ids", RetrieveVStorageObjSpec[].class, ids.toArray()));
        return this.getVimService().getWsc().invokeWithListReturn("RetrieveVStorageObjectAssociations", params, VStorageObjectAssociations.class);
    }

    public VStorageObjectStateInfo retrieveVStorageObjectState(final ID id, final ManagedObjectReference datastore)
            throws FileFault, InvalidDatastore, NotFound, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        return this.getVimService().getWsc().invoke("RetrieveVStorageObjectState", params, VStorageObjectStateInfo.class);
    }

    public VStorageObjectStateInfo retrieveVStorageObjectState(final ID id, final Datastore datastore) throws FileFault, InvalidDatastore, NotFound, RemoteException {
        return this.retrieveVStorageObjectState(id, datastore.getMOR());
    }

    public Task revertVStorageObject(final ID id, final ManagedObjectReference datastore, final ID snapshotId)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("snapshotId", ID.class, snapshotId));
        return this.invokeWithTaskReturn("RevertVStorageObject_Task", params);
    }

    public Task revertVStorageObject(final ID id, final Datastore datastore, final ID snapshotId)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        return this.revertVStorageObject(id, datastore.getMOR(), snapshotId);
    }

    public void scheduleReconcileDatastoreInventory(final ManagedObjectReference datastore) throws InvalidDatastore, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("datastore", ManagedObjectReference.class, datastore));
        this.getVimService().getWsc().invokeWithoutReturn("ScheduleReconcileDatastoreInventory", params);
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
        this.getVimService().getWsc().invokeWithoutReturn("SetVStorageObjectControlFlags", params);
    }

    public void setVStorageObjectControlFlags(final ID id, final Datastore datastore, final List<String> controlFlags)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, RemoteException {
        this.setVStorageObjectControlFlags(id, datastore.getMOR(), controlFlags);
    }

    public Task updateVStorageInfrastructureObjectPolicy(final vslmInfrastructureObjectPolicySpec spec)
            throws InvalidDatastore, InvalidState, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", vslmInfrastructureObjectPolicySpec.class, spec));
        return this.invokeWithTaskReturn("UpdateVStorageInfrastructureObjectPolicy_Task", params);
    }

    public Task updateVStorageObjectCrypto(final ID id,
                                           final ManagedObjectReference datastore,
                                           final List<VirtualMachineProfileSpec> profile,
                                           final DiskCryptoSpec disksCrypto)
            throws FileFault, InvalidDatastore, NotFound, TaskInProgress, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("profile", VirtualMachineProfileSpec[].class, profile.toArray()),
                new Argument("disksCrypto", DiskCryptoSpec.class, disksCrypto));
        try {
            return this.invokeWithTaskReturn("UpdateVStorageObjectCrypto_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task updateVStorageObjectPolicy(final ID id, final ManagedObjectReference datastore, final List<VirtualMachineProfileSpec> profile)
            throws FileFault, InvalidDatastore, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("profile", VirtualMachineProfileSpec[].class, profile.toArray()));
        return this.invokeWithTaskReturn("UpdateVStorageObjectPolicy_Task", params);
    }

    public Task updateVStorageObjectPolicy(final ID id, final Datastore datastore, final List<VirtualMachineProfileSpec> profile)
            throws FileFault, InvalidDatastore, NotFound, RuntimeFault, TaskInProgress, RemoteException {
        return this.updateVStorageObjectPolicy(id, datastore.getMOR(), profile);
    }

    public Task createSnapshot(final ID id, final ManagedObjectReference datastore, final String description)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("description", String.class, description));
        try {
            return this.invokeWithTaskReturn("VStorageObjectCreateSnapshot_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task createSnapshot(final ID id, final Datastore datastore, final String description)
            throws FileFault, InvalidDatastore, InvalidState, NotFound, RuntimeFault {
        return this.createSnapshot(id, datastore.getMOR(), description);
    }

    public Task updateVStorageObjectMetadataEx(final ID id, final ManagedObjectReference datastore,
                                               final List<KeyValue> metadata, final List<String> deleteKeys) throws
            InvalidDatastore, InvalidState, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("id", ID.class, id),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                new Argument("metadata", KeyValue[].class, metadata == null ? null :metadata.toArray()),
                new Argument("deleteKeys", String[].class, deleteKeys == null ? null : deleteKeys.toArray()));
        try {
            return this.invokeWithTaskReturn("VCenterUpdateVStorageObjectMetadataEx_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task updateVStorageObjectMetadataEx(final ID id, final Datastore datastore,
                                               final List<KeyValue> metadata, final List<String> deleteKeys) throws
            InvalidDatastore, InvalidState, NotFound, RuntimeFault {
        return this.updateVStorageObjectMetadataEx(id, datastore.getMOR(), metadata, deleteKeys);
    }

}
