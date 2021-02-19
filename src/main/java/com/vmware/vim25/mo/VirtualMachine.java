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
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * VirtualMachine is the managed object type for manipulating virtual machines, including templates that can be deployed (repeatedly) as new virtual machines.
 * This type provides methods for configuring and controlling a virtual machine.
 * VirtualMachine extends the ManagedEntity type because virtual machines are part of a virtual infrastructure inventory.
 * The parent of a virtual machine must be a folder, and a virtual machine has no children.
 *
 * Destroying a virtual machine disposes of all associated storage, including the virtual disks.
 * To remove a virtual machine while retaining its virtual disk storage, a client must remove the virtual disks from the virtual machine before destroying it.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.1
 */
@SuppressWarnings("unused")
public class VirtualMachine extends ManagedEntity {

    public VirtualMachine(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public VirtualMachineCapability getCapability() {
        return getCurrentProperty("capability", VirtualMachineCapability.class);
    }

    public VirtualMachineConfigInfo getConfig() {
        return getCurrentProperty("config", VirtualMachineConfigInfo.class);
    }

    public List<Datastore> getDatastores() {
        return Arrays.asList(this.getDatastores("datastore"));
    }

    public EnvironmentBrowser getEnvironmentBrowser() {
        return (EnvironmentBrowser) getManagedObject("environmentBrowser");
    }

    public GuestInfo getGuest() {
        return getCurrentProperty("guest", GuestInfo.class);
    }

    public ManagedEntityStatus getGuestHeartbeatStatus() {
        return getCurrentProperty("guestHeartbeatStatus", ManagedEntityStatus.class);
    }

    @Deprecated(since = "4.0")
    public VirtualMachineFileLayout getLayout() {
        return getCurrentProperty("layout", VirtualMachineFileLayout.class);
    }

    public VirtualMachineFileLayoutEx getLayoutEx() {
        return getCurrentProperty("layoutEx", VirtualMachineFileLayoutEx.class);
    }

    public List<Network> getNetworks() {
        return Arrays.asList(this.getNetworks("network"));
    }

    public ManagedEntity getParentVApp() {
        final ManagedObjectReference mor = getCurrentProperty("parentVApp", ManagedObjectReference.class);
        if (mor == null) {
            return null;
        }
        return new ManagedEntity(this.getServerConnection(), mor);
    }

    public ResourceConfigSpec getResourceConfig() {
        return getCurrentProperty("resourceConfig", ResourceConfigSpec.class);
    }

    public ResourcePool getResourcePool() {
        return (ResourcePool) getManagedObject("resourcePool");
    }

    public List<VirtualMachineSnapshot> getRootSnapshot() {
        return Optional.ofNullable(getCurrentProperty("rootSnapshot", ManagedObjectReference[].class)).stream()
                .flatMap(Arrays::stream)
                .map(mor -> new VirtualMachineSnapshot(this.getServerConnection(), mor))
                .collect(Collectors.toList());
    }

    public VirtualMachineRuntimeInfo getRuntime() {
        return getCurrentProperty("runtime", VirtualMachineRuntimeInfo.class);
    }

    public VirtualMachineSnapshotInfo getSnapshot() {
        return getCurrentProperty("snapshot", VirtualMachineSnapshotInfo.class);
    }

    public VirtualMachineSnapshot getCurrentSnapShot() {
        return (VirtualMachineSnapshot) getManagedObject("snapshot.currentSnapshot");
    }

    public VirtualMachineStorageInfo getStorage() {
        return getCurrentProperty("storage", VirtualMachineStorageInfo.class);
    }

    public VirtualMachineSummary getSummary() {
        return getCurrentProperty("summary", VirtualMachineSummary.class);
    }

    @Deprecated(since = "4.1")
    public VirtualMachineMksTicket acquireMksTicket() throws RuntimeFault {
        try {
            return this.getVimService().getWsc()
                    .invoke("AcquireMksTicket", this.getSingleSelfArgumentList(), VirtualMachineMksTicket.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public VirtualMachineTicket acquireTicket(final VirtualMachineTicketType ticketType) throws InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("ticketType", String.class, ticketType.name()));
        try {
            return this.getVimService().getWsc().invoke("AcquireTicket", params, VirtualMachineTicket.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void answerVM(final String questionId, final String answerChoice) throws ConcurrentAccess, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("questionId", String.class, questionId),
                new Argument("answerChoice", String.class, answerChoice));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("AnswerVM", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ConcurrentAccess) {
                throw (ConcurrentAccess) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task applyEvcMode(final List<HostFeatureMask> mask, final Boolean completeMasks)
            throws InvalidPowerState, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("mask", HostFeatureMask[].class, mask.toArray()),
                Argument.fromBasicType("completeMasks", completeMasks));
        try {
            return this.invokeWithTaskReturn("ApplyEvcModeVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public Task attachDisk(final ID diskId, final ManagedObjectReference datastore,
                           final Integer controllerKey, final Integer unitNumber)
            throws DeviceUnsupportedForVmVersion, FileFault, InvalidController, InvalidDatastore, InvalidState,
            MissingController, NotFound, RuntimeFault, VmConfigFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("diskId", ID.class, diskId),
                new Argument("datastore", ManagedObjectReference.class, datastore),
                Argument.fromBasicType("controllerKey", controllerKey),
                Argument.fromBasicType("unitNumber", unitNumber));
        try {
            return this.invokeWithTaskReturn("AttachDisk_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DeviceUnsupportedForVmVersion) {
                throw (DeviceUnsupportedForVmVersion) cause;
            }
            if (cause instanceof MissingController) {
                throw (MissingController) cause;
            }
            if (cause instanceof InvalidController) {
                throw (InvalidController) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
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

    public void checkCustomizationSpec(final CustomizationSpec spec) throws CustomizationFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", CustomizationSpec.class, spec));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("CheckCustomizationSpec", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof CustomizationFault) {
                throw (CustomizationFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task cloneVM(final ManagedObjectReference folder, final String name, final VirtualMachineCloneSpec spec)
            throws VmConfigFault, TaskInProgress, CustomizationFault, FileFault, InvalidState,
            InsufficientResourcesFault, MigrationFault, InvalidDatastore, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("folder", ManagedObjectReference.class, folder),
                new Argument("name", String.class, name),
                new Argument("spec", VirtualMachineCloneSpec.class, spec));
        try {
            return this.invokeWithTaskReturn("CloneVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof MigrationFault) {
                throw (MigrationFault) cause;
            }
            if (cause instanceof CustomizationFault) {
                throw (CustomizationFault) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task consolidateVMDisks() throws TaskInProgress, InvalidState, FileFault, VmConfigFault, RuntimeFault {
        try {
            return this.invokeWithTaskReturn("ConsolidateVMDisks_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task createScreenshot() throws TaskInProgress, FileFault, InvalidPowerState, InvalidState, RuntimeFault {
        try {
            return this.invokeWithTaskReturn("CreateScreenshot_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "6.0")
    public Task createSecondaryVM(final ManagedObjectReference host)
            throws TaskInProgress, InvalidState, InsufficientResourcesFault, VmFaultToleranceIssue, FileFault,
            VmConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference.class, host));
        try {
            return this.invokeWithTaskReturn("CreateSecondaryVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof VmFaultToleranceIssue) {
                throw (VmFaultToleranceIssue) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task createSecondaryVMEx(final ManagedObjectReference host, final FaultToleranceConfigSpec spec)
            throws FileFault, InsufficientResourcesFault, InvalidState, RuntimeFault, TaskInProgress,
            VmConfigFault, VmFaultToleranceIssue {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference.class, host),
                new Argument("spec", FaultToleranceConfigSpec.class, spec));
        try {
            return this.invokeWithTaskReturn("CreateSecondaryVMEx_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof VmFaultToleranceIssue) {
                throw (VmFaultToleranceIssue) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task createSnapshot(final String name, final String description, final boolean memory, final boolean quiesce)
            throws InvalidName, InvalidPowerState, VmConfigFault, SnapshotFault, TaskInProgress, FileFault, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name),
                new Argument("description", String.class, description),
                Argument.fromBasicType("memory", memory),
                Argument.fromBasicType("quiesce", quiesce));
        try {
            return this.invokeWithTaskReturn("CreateSnapshot_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof SnapshotFault) {
                throw (SnapshotFault) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task createSnapshotEx(final String name, final String description, final boolean memory,
                                 final VirtualMachineGuestQuiesceSpec quiesceSpec)
            throws FileFault, InvalidName, InvalidPowerState, InvalidState, RuntimeFault, SnapshotFault, TaskInProgress, VmConfigFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name),
                new Argument("description", String.class, description),
                Argument.fromBasicType("memory", memory),
                new Argument("quiesceSpec", VirtualMachineGuestQuiesceSpec.class, quiesceSpec));
        try {
            return this.invokeWithTaskReturn("CreateSnapshotEx_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof SnapshotFault) {
                throw (SnapshotFault) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task cryptoUnlock() throws InvalidState, InvalidVmState, NotSupported, RuntimeFault {
        try {
            return this.invokeWithTaskReturn("CryptoUnlock_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidVmState) {
                throw (InvalidVmState) cause;
            }
            if (cause instanceof NotSupported) {
                throw (NotSupported) cause;
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

    public Task customizeVM(final CustomizationSpec spec) throws CustomizationFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", CustomizationSpec.class, spec));
        try {
            return this.invokeWithTaskReturn("CustomizeVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof CustomizationFault) {
                throw (CustomizationFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void defragmentAllDisks() throws InvalidPowerState, TaskInProgress, FileFault, InvalidState, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("DefragmentAllDisks", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task detachDisk(final ID diskId) throws FileFault, InvalidState, NotFound, RuntimeFault, VmConfigFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("diskId", ID.class, diskId));
        try {
            return this.invokeWithTaskReturn("DetachDisk_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task disableSecondaryVM(final ManagedObjectReference vm)
            throws TaskInProgress, VmFaultToleranceIssue, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, vm));
        try {
            return this.invokeWithTaskReturn("DisableSecondaryVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmFaultToleranceIssue) {
                throw (VmFaultToleranceIssue) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public boolean dropConnections(final List<VirtualMachineConnection> listOfConnections)
            throws InvalidPowerState, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("listOfConnections", VirtualMachineConnection[].class, listOfConnections.toArray()));
        try {
            return this.getVimService().getWsc().invoke("DropConnections", params, Boolean.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public Task enableSecondaryVM(final ManagedObjectReference vm, final ManagedObjectReference host)
            throws TaskInProgress, VmFaultToleranceIssue, InvalidState, VmConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, vm),
                new Argument("host", ManagedObjectReference.class, host));
        try {
            return this.invokeWithTaskReturn("EnableSecondaryVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof VmFaultToleranceIssue) {
                throw (VmFaultToleranceIssue) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task estimateStorageForConsolidateSnapshots() throws TaskInProgress, InvalidState, FileFault, VmConfigFault, RuntimeFault {
        try {
            return this.invokeWithTaskReturn("EstimateStorageForConsolidateSnapshots_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public HttpNfcLease exportVm() throws InvalidPowerState, TaskInProgress, InvalidState, FileFault, RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("ExportVm", this.getSingleSelfArgumentList(), HttpNfcLease.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public String extractOvfEnvironment() throws InvalidState, RuntimeFault {
        try {
            return this.getVimService().getWsc()
                    .invoke("ExtractOvfEnvironment", this.getSingleSelfArgumentList(), String.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task instantClone(final VirtualMachineInstantCloneSpec spec)
            throws DisallowedMigrationDeviceAttached, FileFault, InsufficientResourcesFault,
            InvalidDatastore, InvalidState, RuntimeFault, TaskInProgress {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", VirtualMachineInstantCloneSpec.class, spec));
        try {
            return this.invokeWithTaskReturn("InstantClone_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof DisallowedMigrationDeviceAttached) {
                throw (DisallowedMigrationDeviceAttached) cause;
            }
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task makePrimaryVM(final ManagedObjectReference vm)
            throws TaskInProgress, VmFaultToleranceIssue, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, vm));
        try {
            return this.invokeWithTaskReturn("MakePrimaryVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmFaultToleranceIssue) {
                throw (VmFaultToleranceIssue) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
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

    public void markAsTemplate() throws FileFault, InvalidPowerState, VmConfigFault, InvalidState, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("MarkAsTemplate", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
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

    public void markAsVirtualMachine(final ManagedObjectReference pool, final ManagedObjectReference host)
            throws VmConfigFault, FileFault, InvalidState, InvalidDatastore, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("pool", ManagedObjectReference.class, pool),
                new Argument("host", ManagedObjectReference.class, host));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("MarkAsVirtualMachine", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
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

    @Deprecated(since = "6.5")
    public Task migrateVM(final ManagedObjectReference pool, final ManagedObjectReference host,
                          final VirtualMachineMovePriority priority, final VirtualMachinePowerState state)
            throws VmConfigFault, Timedout, FileFault, InvalidPowerState, InvalidState, InsufficientResourcesFault,
            NoActiveHostInCluster, MigrationFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("pool", ManagedObjectReference.class, pool),
                new Argument("host", ManagedObjectReference.class, host),
                new Argument("priority", VirtualMachineMovePriority.class, priority),
                new Argument("state", VirtualMachinePowerState.class, state));
        try {
            return this.invokeWithTaskReturn("MigrateVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof NoActiveHostInCluster) {
                throw (NoActiveHostInCluster) cause;
            }
            if (cause instanceof MigrationFault) {
                throw (MigrationFault) cause;
            }
            if (cause instanceof Timedout) {
                throw (Timedout) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public void mountToolsInstaller() throws VmToolsUpgradeFault, VmConfigFault, InvalidState, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("MountToolsInstaller", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmToolsUpgradeFault) {
                throw (VmToolsUpgradeFault) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
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

    public Task powerOffVM() throws TaskInProgress, InvalidPowerState, InvalidState, RuntimeFault {
        try {
            return this.invokeWithTaskReturn("PowerOffVM_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public Task powerOnVM(final ManagedObjectReference host) throws VmConfigFault, TaskInProgress, FileFault,
            InvalidPowerState, InvalidState, InsufficientResourcesFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference.class, host));
        try {
            return this.invokeWithTaskReturn("PowerOnVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public Task promoteDisks(final boolean unlink, final List<VirtualDisk> disks)
            throws InvalidPowerState, InvalidState, TaskInProgress, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("unlink", unlink),
                new Argument("disks", VirtualDisk[].class, disks.toArray()));
        try {
            return this.invokeWithTaskReturn("PromoteDisks_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public int putUsbScanCodes(final UsbScanCodeSpec spec) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", UsbScanCodeSpec.class, spec));
        try {
            return this.getVimService().getWsc().invoke("PutUsbScanCodes", params, Integer.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public DiskChangeInfo queryChangedDiskAreas(final ManagedObjectReference snapshot, final int deviceKey,
                                                final long startOffset, final String changeId)
            throws FileFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("snapshot", ManagedObjectReference.class, snapshot),
                Argument.fromBasicType("deviceKey", deviceKey),
                Argument.fromBasicType("startOffset", startOffset),
                new Argument("changeId", String.class, changeId));
        try {
            return this.getVimService().getWsc().invoke("QueryChangedDiskAreas", params, DiskChangeInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<VirtualMachineConnection> queryConnections()
            throws InvalidPowerState, InvalidState, Timedout, VmConfigFault, RuntimeFault {
        try {
            return (List<VirtualMachineConnection>) this.getVimService().getWsc()
                    .invoke("QueryConnections", this.getSingleSelfArgumentList(), "List.VirtualMachineConnection");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof Timedout) {
                throw (Timedout) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    @Deprecated(since = "6.0")
    @SuppressWarnings("unchecked")
    public List<MethodFault> queryFaultToleranceCompatibility() throws InvalidState, VmConfigFault, RuntimeFault {
        try {
            return (List<MethodFault>) this.getVimService().getWsc()
                    .invoke("QueryFaultToleranceCompatibility", this.getSingleSelfArgumentList(), "List.MethodFault");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
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

    @SuppressWarnings("unchecked")
    public List<MethodFault> queryFaultToleranceCompatibilityEx(final Boolean forLegacyFt)
            throws InvalidState, RuntimeFault, VmConfigFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("forLegacyFt", Boolean.class, forLegacyFt));
        try {
            return (List<MethodFault>) this.getVimService().getWsc()
                    .invoke("QueryFaultToleranceCompatibilityEx", params, "List.MethodFault");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
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

    @SuppressWarnings("unchecked")
    public List<String> queryUnownedFiles() throws RuntimeFault {
        try {
            return (List<String>) this.getVimService().getWsc()
                    .invoke("QueryUnownedFiles", this.getSingleSelfArgumentList(), "List.String");
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void rebootGuest() throws TaskInProgress, InvalidPowerState, InvalidState, ToolsUnavailable, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RebootGuest", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ToolsUnavailable) {
                throw (ToolsUnavailable) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public Task reconfigVM(final VirtualMachineConfigSpec spec)
            throws InvalidName, InvalidPowerState, VmWwnConflict, TooManyDevices, CpuHotPlugNotSupported,
            MemoryHotPlugNotSupported, VmConfigFault, DuplicateName, TaskInProgress, FileFault, InvalidState,
            ConcurrentAccess, InvalidDatastore, InsufficientResourcesFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", VirtualMachineConfigSpec.class, spec));
        try {
            return this.invokeWithTaskReturn("ReconfigVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmWwnConflict) {
                throw (VmWwnConflict) cause;
            }
            if (cause instanceof TooManyDevices) {
                throw (TooManyDevices) cause;
            }
            if (cause instanceof CpuHotPlugNotSupported) {
                throw (CpuHotPlugNotSupported) cause;
            }
            if (cause instanceof MemoryHotPlugNotSupported) {
                throw (MemoryHotPlugNotSupported) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof DuplicateName) {
                throw (DuplicateName) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof ConcurrentAccess) {
                throw (ConcurrentAccess) cause;
            }
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public void refreshStorageInfo() throws RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RefreshStorageInfo", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task reloadVirtualMachineFromPath(final String configurationPath)
            throws InvalidPowerState, TaskInProgress, FileFault, InvalidState, VmConfigFault, AlreadyExists, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("configurationPath", String.class, configurationPath));
        try {
            return this.invokeWithTaskReturn("reloadVirtualMachineFromPath_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public Task relocateVM(final VirtualMachineRelocateSpec spec, final VirtualMachineMovePriority priority)
            throws VmConfigFault, Timedout, FileFault, InvalidState, InsufficientResourcesFault,
            MigrationFault, InvalidDatastore, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", VirtualMachineRelocateSpec.class, spec),
                new Argument("priority", VirtualMachineMovePriority.class, priority));
        try {
            return this.invokeWithTaskReturn("RelocateVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof MigrationFault) {
                throw (MigrationFault) cause;
            }
            if (cause instanceof InvalidDatastore) {
                throw (InvalidDatastore) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof Timedout) {
                throw (Timedout) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task removeAllSnapshots(final Boolean consolidate) throws SnapshotFault, TaskInProgress, InvalidPowerState,
            InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("consolidate", Boolean.class, consolidate));
        try {
            return this.invokeWithTaskReturn("RemoveAllSnapshots_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof SnapshotFault) {
                throw (SnapshotFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public void resetGuestInformation() throws InvalidState, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ResetGuestInformation", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task resetVM() throws TaskInProgress, InvalidPowerState, InvalidState, RuntimeFault {
        try {
            return this.invokeWithTaskReturn("ResetVM_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public Task revertToCurrentSnapshot(final ManagedObjectReference host, final Boolean suppressPowerOn)
            throws VmConfigFault, SnapshotFault, TaskInProgress, InvalidPowerState, InvalidState,
            InsufficientResourcesFault, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference.class, host),
                new Argument("suppressPowerOn", Boolean.class, suppressPowerOn));
        try {
            return this.invokeWithTaskReturn("RevertToCurrentSnapshot_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof InsufficientResourcesFault) {
                throw (InsufficientResourcesFault) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof SnapshotFault) {
                throw (SnapshotFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public void sendNMI() throws InvalidState, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("SendNMI", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void setDisplayTopology(final List<VirtualMachineDisplayTopology> displays)
            throws InvalidPowerState, InvalidState, ToolsUnavailable, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("displays", VirtualMachineDisplayTopology[].class, displays.toArray()));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("SetDisplayTopology", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ToolsUnavailable) {
                throw (ToolsUnavailable) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public void setScreenResolution(final int width, final int height)
            throws InvalidPowerState, InvalidState, ToolsUnavailable, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("width", width),
                Argument.fromBasicType("height", height));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("SetScreenResolution", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ToolsUnavailable) {
                throw (ToolsUnavailable) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public void shutdownGuest() throws TaskInProgress, InvalidPowerState, InvalidState, ToolsUnavailable, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ShutdownGuest", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ToolsUnavailable) {
                throw (ToolsUnavailable) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public void standbyGuest() throws TaskInProgress, InvalidPowerState, InvalidState, ToolsUnavailable, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("StandbyGuest", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ToolsUnavailable) {
                throw (ToolsUnavailable) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    @Deprecated(since = "5.1")
    public Task startRecording(final String name, final String description)
            throws InvalidPowerState, InvalidState, TaskInProgress, FileFault, SnapshotFault, VmConfigIncompatibleForRecordReplay,
            VmConfigFault, RecordReplayDisabled, HostIncompatibleForRecordReplay, InvalidName, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name),
                new Argument("description", String.class, description));
        try {
            return this.invokeWithTaskReturn("StartRecording_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostIncompatibleForRecordReplay) {
                throw (HostIncompatibleForRecordReplay) cause;
            }
            if (cause instanceof VmConfigIncompatibleForRecordReplay) {
                throw (VmConfigIncompatibleForRecordReplay) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof SnapshotFault) {
                throw (SnapshotFault) cause;
            }
            if (cause instanceof RecordReplayDisabled) {
                throw (RecordReplayDisabled) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    @Deprecated(since = "5.1")
    public Task startReplaying(final VirtualMachineSnapshot replaySnapshot)
            throws InvalidPowerState, InvalidState, TaskInProgress, FileFault, SnapshotFault, VmConfigIncompatibleForRecordReplay,
            VmConfigFault, RecordReplayDisabled, HostIncompatibleForRecordReplay, NotFound, RuntimeFault {
        if (replaySnapshot == null) {
            throw new IllegalArgumentException("replaySnapshot must not be null");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("replaySnapshot", ManagedObjectReference.class, replaySnapshot));
        try {
            return this.invokeWithTaskReturn("StartReplaying_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostIncompatibleForRecordReplay) {
                throw (HostIncompatibleForRecordReplay) cause;
            }
            if (cause instanceof VmConfigIncompatibleForRecordReplay) {
                throw (VmConfigIncompatibleForRecordReplay) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
            }
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof SnapshotFault) {
                throw (SnapshotFault) cause;
            }
            if (cause instanceof RecordReplayDisabled) {
                throw (RecordReplayDisabled) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    @Deprecated(since = "5.1")
    public Task stopRecording() throws InvalidPowerState, InvalidState, TaskInProgress, FileFault, SnapshotFault, RuntimeFault {
        try {
            return this.invokeWithTaskReturn("StopRecording_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof SnapshotFault) {
                throw (SnapshotFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    @Deprecated(since = "5.1")
    public Task stopReplaying() throws InvalidPowerState, InvalidState, TaskInProgress, FileFault, SnapshotFault, RuntimeFault {
        try {
            return this.invokeWithTaskReturn("StopReplaying_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof FileFault) {
                throw (FileFault) cause;
            }
            if (cause instanceof SnapshotFault) {
                throw (SnapshotFault) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public Task suspendVM() throws TaskInProgress, InvalidPowerState, InvalidState, RuntimeFault {
        try {
            return this.invokeWithTaskReturn("SuspendVM_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

    public Task terminateFaultTolerantVM(final ManagedObjectReference vm)
            throws TaskInProgress, VmFaultToleranceIssue, InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vm", ManagedObjectReference.class, vm));
        try {
            return this.invokeWithTaskReturn("TerminateFaultTolerantVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmFaultToleranceIssue) {
                throw (VmFaultToleranceIssue) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
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

    public void terminateVM() throws InvalidState, RuntimeFault, TaskInProgress {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("TerminateVM", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
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

    public Task turnOffFaultToleranceForVM() throws TaskInProgress, VmFaultToleranceIssue, InvalidState, RuntimeFault {
        try {
            return this.invokeWithTaskReturn("TurnOffFaultToleranceForVM_Task", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmFaultToleranceIssue) {
                throw (VmFaultToleranceIssue) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
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

    public void unmountToolsInstaller() throws InvalidState, VmConfigFault, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UnmountToolsInstaller", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
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

    public void unregisterVM() throws InvalidPowerState, TaskInProgress, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UnregisterVM", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public Task upgradeTools(final String installerOptions)
            throws TaskInProgress, VmToolsUpgradeFault, InvalidState, ToolsUnavailable, VmConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("installerOptions", String.class, installerOptions));
        try {
            return this.invokeWithTaskReturn("UpgradeTools_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof VmToolsUpgradeFault) {
                throw (VmToolsUpgradeFault) cause;
            }
            if (cause instanceof ToolsUnavailable) {
                throw (ToolsUnavailable) cause;
            }
            if (cause instanceof VmConfigFault) {
                throw (VmConfigFault) cause;
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

    public Task upgradeVM(final String version)
            throws TaskInProgress, InvalidPowerState, InvalidState, AlreadyUpgraded, NoDiskFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("version", String.class, version));
        try {
            return this.invokeWithTaskReturn("UpgradeVM_Task", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AlreadyUpgraded) {
                throw (AlreadyUpgraded) cause;
            }
            if (cause instanceof NoDiskFound) {
                throw (NoDiskFound) cause;
            }
            if (cause instanceof TaskInProgress) {
                throw (TaskInProgress) cause;
            }
            if (cause instanceof InvalidPowerState) {
                throw (InvalidPowerState) cause;
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

}
