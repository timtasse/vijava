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
 * @version 6.7
 */
@SuppressWarnings("unchecked")
public class VirtualMachine extends ManagedEntity {

    public VirtualMachine(ServerConnection sc, ManagedObjectReference mor) {
        super(sc, mor);
    }

    public VirtualMachineCapability getCapability() {
        return (VirtualMachineCapability) getCurrentProperty("capability");
    }

    public VirtualMachineConfigInfo getConfig() {
        return (VirtualMachineConfigInfo) getCurrentProperty("config");
    }

    public Datastore[] getDatastores() throws InvalidProperty, RuntimeFault, RemoteException {
        return getDatastores("datastore");
    }

    public EnvironmentBrowser getEnvironmentBrowser() throws InvalidProperty, RuntimeFault, RemoteException {
        return (EnvironmentBrowser) getManagedObject("environmentBrowser");
    }

    public GuestInfo getGuest() {
        return (GuestInfo) getCurrentProperty("guest");
    }

    public ManagedEntityStatus getGuestHeartbeatStatus() {
        return (ManagedEntityStatus) getCurrentProperty("guestHeartbeatStatus");
    }

    @Deprecated(since = "4.0")
    public VirtualMachineFileLayout getLayout() {
        return (VirtualMachineFileLayout) getCurrentProperty("layout");
    }

    /**
     * @since SDK4.0
     */
    public VirtualMachineFileLayoutEx getLayoutEx() {
        return (VirtualMachineFileLayoutEx) getCurrentProperty("layoutEx");
    }

    public Network[] getNetworks() throws InvalidProperty, RuntimeFault, RemoteException {
        return getNetworks("network");
    }

    /**
     * @since SDK4.1
     */
    public ManagedEntity getParentVApp() {
        ManagedObjectReference mor = (ManagedObjectReference) getCurrentProperty("parentVApp");
        return new ManagedEntity(getServerConnection(), mor);
    }

    public ResourceConfigSpec getResourceConfig() {
        return (ResourceConfigSpec) getCurrentProperty("resourceConfig");
    }

    public ResourcePool getResourcePool() throws InvalidProperty, RuntimeFault, RemoteException {
        return (ResourcePool) getManagedObject("resourcePool");
    }

    /**
     * @since SDK4.1
     */
    public VirtualMachineSnapshot[] getRootSnapshot() {
        ManagedObjectReference[] mors = (ManagedObjectReference[]) getCurrentProperty("rootSnapshot");
        if (mors == null) {
            return new VirtualMachineSnapshot[0];
        }
        VirtualMachineSnapshot[] vmns = new VirtualMachineSnapshot[mors.length];
        for (int i = 0; i < mors.length; i++) {
            vmns[i] = new VirtualMachineSnapshot(getServerConnection(), mors[i]);
        }
        return vmns;
    }

    public VirtualMachineRuntimeInfo getRuntime() {
        return (VirtualMachineRuntimeInfo) getCurrentProperty("runtime");
    }

    public VirtualMachineSnapshotInfo getSnapshot() {
        return (VirtualMachineSnapshotInfo) getCurrentProperty("snapshot");
    }

    public VirtualMachineSnapshot getCurrentSnapShot() throws InvalidProperty, RuntimeFault, RemoteException {
        return (VirtualMachineSnapshot) getManagedObject("snapshot.currentSnapshot");
    }

    /**
     * @since SDK4.0
     */
    public VirtualMachineStorageInfo getStorage() {
        return (VirtualMachineStorageInfo) getCurrentProperty("storage");
    }

    public VirtualMachineSummary getSummary() {
        return (VirtualMachineSummary) getCurrentProperty("summary");
    }

    /**
     * @deprecated as of SDK4.1. Use acquireTicket instead.
     */
    @Deprecated(since = "4.1")
    public VirtualMachineMksTicket acquireMksTicket() throws RuntimeFault, RemoteException {
        return getVimService().acquireMksTicket(getMOR());
    }

    /**
     * @since SDK4.1
     */
    public VirtualMachineTicket acquireTicket(String ticketType) throws InvalidState, RuntimeFault, RemoteException {
        return getVimService().acquireTicket(getMOR(), ticketType);
    }

    public void answerVM(String questionId, String answerChoice) throws ConcurrentAccess, RuntimeFault, RemoteException {
        getVimService().answerVM(getMOR(), questionId, answerChoice);
    }

    public Task applyEvcMode(final List<HostFeatureMask> mask, final Boolean completeMasks) throws InvalidPowerState, InvalidState, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("mask", "HostFeatureMask[]", mask),
                new Argument("completeMasks", "boolean", completeMasks));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc()
                .invoke("ApplyEvcModeVM_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task attachDisk(final ID diskId, final ManagedObjectReference datastore, final Integer controllerKey, final Integer unitNumber) throws DeviceUnsupportedForVmVersion, FileFault, InvalidController, InvalidDatastore, InvalidState, MissingController, NotFound, RuntimeFault, VmConfigFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("diskId", "ID", diskId),
                new Argument("datastore", ManagedObjectReference.class.getSimpleName(), datastore),
                new Argument("controllerKey", "int", controllerKey),
                new Argument("unitNumber", "int", unitNumber));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc().invoke("AttachDisk_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public void checkCustomizationSpec(CustomizationSpec spec) throws CustomizationFault, RuntimeFault, RemoteException {
        getVimService().checkCustomizationSpec(getMOR(), spec);
    }

    public Task cloneVM_Task(Folder folder, String name, VirtualMachineCloneSpec spec) throws VmConfigFault, TaskInProgress, CustomizationFault, FileFault, InvalidState, InsufficientResourcesFault, MigrationFault, InvalidDatastore, RuntimeFault, RemoteException {
        if (folder == null) {
            throw new IllegalArgumentException("folder must not be null.");
        }
        ManagedObjectReference mor = getVimService().cloneVM_Task(getMOR(), folder.getMOR(), name, spec);
        return new Task(getServerConnection(), mor);
    }

    /**
     * @since SDK5.0
     */
    public Task consolidateVMDisks_Task() throws TaskInProgress, InvalidState, FileFault, VmConfigFault, RuntimeFault, RemoteException {
        ManagedObjectReference taskMor = getVimService().consolidateVMDisks_Task(getMOR());
        return new Task(getServerConnection(), taskMor);
    }

    /**
     * @since SDK4.0
     */
    public Task createScreenshot_Task() throws TaskInProgress, FileFault, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().createScreenshot_Task(getMOR());
        return new Task(getServerConnection(), mor);
    }

    /**
     * @since SDK4.0
     */
    @Deprecated(since = "6.0")
    public Task createSecondaryVM_Task(HostSystem host)
            throws TaskInProgress, InvalidState, InsufficientResourcesFault, VmFaultToleranceIssue, FileFault, VmConfigFault, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().createSecondaryVM_Task(getMOR(), host == null ? null : host.getMOR());
        return new Task(getServerConnection(), mor);
    }

    public Task createSecondaryVMEx_Task(final ManagedObjectReference host, final FaultToleranceConfigSpec spec)
            throws FileFault, InsufficientResourcesFault, InvalidState, ManagedObjectNotFound, NotSupported, RuntimeFault, TaskInProgress, VmConfigFault, VmFaultToleranceIssue, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("host", ManagedObjectReference.class.getSimpleName(), host),
                new Argument("spec", FaultToleranceConfigSpec.class.getSimpleName(), spec));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc()
                .invoke("CreateSecondaryVMEx_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task createSnapshot_Task(String name, String description, boolean memory, boolean quiesce)
            throws InvalidName, VmConfigFault, SnapshotFault, TaskInProgress, FileFault, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().createSnapshot_Task(getMOR(), name, description, memory, quiesce);
        return new Task(getServerConnection(), mor);
    }

    public Task createSnapshotEx_Task(final String name, final String description, final boolean memory, final VirtualMachineGuestQuiesceSpec quiesceSpec)
            throws FileFault, InvalidArgument, InvalidName, InvalidPowerState, InvalidState, NotSupported, RuntimeFault, SnapshotFault, TaskInProgress, VmConfigFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", "String", name),
                new Argument("description", "String", description),
                new Argument("memory", "boolean", memory),
                new Argument("quiesceSpec", VirtualMachineGuestQuiesceSpec.class.getSimpleName(), quiesceSpec));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc()
                .invoke("CreateSnapshotEx_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task cryptoUnlock_Task() throws InvalidState, InvalidVmState, NotSupported, RuntimeFault, RemoteException {
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc()
                .invoke("CryptoUnlock_Task", this.getSingleSelfArgumentList(), ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    public Task customizeVM_Task(CustomizationSpec spec) throws CustomizationFault, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().customizeVM_Task(getMOR(), spec);
        return new Task(getServerConnection(), mor);
    }

    public void defragmentAllDisks() throws InvalidPowerState, TaskInProgress, FileFault, InvalidState, RuntimeFault, RemoteException {
        getVimService().defragmentAllDisks(getMOR());
    }

    public Task detachDisk_Task(final ID diskId) throws FileFault, InvalidState, NotFound, RuntimeFault, VmConfigFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("diskId", "ID", diskId));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc()
                .invoke("DetachDisk_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    /**
     * @since SDK4.0
     */
    public Task disableSecondaryVM_Task(VirtualMachine vm) throws TaskInProgress, VmFaultToleranceIssue, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().disableSecondaryVM_Task(getMOR(), vm.getMOR());
        return new Task(getServerConnection(), mor);
    }

    /**
     * @since SDK4.0
     */
    public Task enableSecondaryVM_Task(VirtualMachine vm, HostSystem host) throws TaskInProgress, VmFaultToleranceIssue, InvalidState, VmConfigFault, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().enableSecondaryVM_Task(getMOR(), vm.getMOR(),
                host == null ? null : host.getMOR());
        return new Task(getServerConnection(), mor);
    }

    /**
     * @since SDK5.0
     */
    public Task estimateStorageForConsolidateSnapshots_Task() throws TaskInProgress, InvalidState, FileFault, VmConfigFault, RuntimeFault, RemoteException {
        ManagedObjectReference taskMor = getVimService().estimateStorageForConsolidateSnapshots_Task(getMOR());
        return new Task(getServerConnection(), taskMor);
    }

    /**
     * @since SDK4.0
     */
    public HttpNfcLease exportVm() throws InvalidPowerState, TaskInProgress, InvalidState, FileFault, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().exportVm(getMOR());
        return new HttpNfcLease(getServerConnection(), mor);
    }

    /**
     * @since SDK4.0
     */
    public String extractOvfEnvironment() throws InvalidState, RuntimeFault, RemoteException {
        return getVimService().extractOvfEnvironment(getMOR());
    }

    public Task instantClone_Task(final VirtualMachineInstantCloneSpec spec)
            throws DisallowedMigrationDeviceAttached, FileFault, InsufficientResourcesFault, InvalidArgument,
            InvalidDatastore, InvalidState, RuntimeFault, TaskInProgress, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", VirtualMachineInstantCloneSpec.class.getSimpleName(), spec));
        final ManagedObjectReference mor = (ManagedObjectReference) this.getVimService().getWsc()
                .invoke("InstantClone_Task", params, ManagedObjectReference.class.getSimpleName());
        return new Task(this.getServerConnection(), mor);
    }

    /**
     * @since SDK4.0
     */
    public Task makePrimaryVM_Task(VirtualMachine vm) throws TaskInProgress, VmFaultToleranceIssue, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().makePrimaryVM_Task(getMOR(), vm.getMOR());
        return new Task(getServerConnection(), mor);
    }

    public void markAsTemplate() throws VmConfigFault, InvalidState, RuntimeFault, RemoteException {
        getVimService().markAsTemplate(getMOR());
    }

    public void markAsVirtualMachine(ResourcePool pool, HostSystem host) throws VmConfigFault, FileFault, InvalidState, InvalidDatastore, RuntimeFault, RemoteException {
        if (pool == null) {
            throw new IllegalArgumentException("pool must not be null.");
        }
        getVimService().markAsVirtualMachine(getMOR(), pool.getMOR(), host == null ? null : host.getMOR());
    }

    @Deprecated(since = "6.5")
    public Task migrateVM_Task(ResourcePool pool, HostSystem host, VirtualMachineMovePriority priority,
                               VirtualMachinePowerState state) throws VmConfigFault, Timedout, FileFault, InvalidState, InsufficientResourcesFault, MigrationFault, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().migrateVM_Task(getMOR(), pool == null ? null : pool.getMOR(), host == null ? null : host.getMOR(), priority, state);
        return new Task(getServerConnection(), mor);
    }

    public void mountToolsInstaller() throws InvalidState, RuntimeFault, RemoteException {
        getVimService().mountToolsInstaller(getMOR());
    }

    public Task powerOffVM_Task() throws TaskInProgress, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().powerOffVM_Task(getMOR());
        return new Task(getServerConnection(), mor);
    }

    public Task powerOnVM_Task(HostSystem host) throws VmConfigFault, TaskInProgress, FileFault, InvalidState, InsufficientResourcesFault, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().powerOnVM_Task(getMOR(), host == null ? null : host.getMOR());
        return new Task(getServerConnection(), mor);
    }

    /**
     * @since SDK4.0
     */
    public Task promoteDisks_Task(boolean unlink, VirtualDisk[] disks) throws InvalidPowerState, InvalidState, TaskInProgress, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().promoteDisks_Task(getMOR(), unlink, disks);
        return new Task(getServerConnection(), mor);
    }

    public int putUsbScanCodes(final UsbScanCodeSpec spec) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("spec", UsbScanCodeSpec.class.getSimpleName(), spec));
        return (Integer) this.getVimService().getWsc().invoke("PutUsbScanCodes", params, "Integer");
    }

    /**
     * @since SDK4.0
     */
    public DiskChangeInfo queryChangedDiskAreas(VirtualMachineSnapshot snapshot, int deviceKey, long startOffset, String changeId) throws FileFault, NotFound, RuntimeFault, RemoteException {
        return getVimService().queryChangedDiskAreas(getMOR(),
                snapshot == null ? null : snapshot.getMOR(),
                deviceKey, startOffset, changeId);
    }

    /**
     * @since SDK4.1
     */
    @Deprecated(since = "6.0")
    public LocalizedMethodFault[] queryFaultToleranceCompatibility() throws InvalidState, VmConfigFault, RuntimeFault, RemoteException {
        return getVimService().queryFaultToleranceCompatibility(getMOR());
    }

    public List<MethodFault> queryFaultToleranceCompatibilityEx(final Boolean forLegacyFt) throws InvalidState, NotSupported, RuntimeFault, VmConfigFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("forLegacyFt", "boolean", forLegacyFt));
        return (List<MethodFault>) this.getVimService().getWsc().invoke("QueryFaultToleranceCompatibilityEx", params, "List.MethodFault");
    }

    /**
     * @since SDK4.0
     */
    public String[] queryUnownedFiles() throws RuntimeFault, RemoteException {
        return getVimService().queryUnownedFiles(getMOR());
    }

    public void rebootGuest() throws TaskInProgress, InvalidState, ToolsUnavailable, RuntimeFault, RemoteException {
        getVimService().rebootGuest(getMOR());
    }

    public Task reconfigVM_Task(VirtualMachineConfigSpec spec) throws InvalidName, VmConfigFault, DuplicateName, TaskInProgress, FileFault, InvalidState, ConcurrentAccess, InvalidDatastore, InsufficientResourcesFault, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().reconfigVM_Task(getMOR(), spec);
        return new Task(getServerConnection(), mor);
    }

    /**
     * @since SDK4.0
     */
    public void refreshStorageInfo() throws RuntimeFault, RemoteException {
        getVimService().refreshStorageInfo(getMOR());
    }

    /**
     * @since SDK4.1
     */
    public Task reloadVirtualMachineFromPath_Task(String configurationPath) throws InvalidPowerState, TaskInProgress, FileFault, InvalidState, VmConfigFault, AlreadyExists, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().reloadVirtualMachineFromPath_Task(getMOR(), configurationPath);
        return new Task(getServerConnection(), mor);
    }

    //SDK2.5 signature for back compatibility
    public Task relocateVM_Task(VirtualMachineRelocateSpec spec) throws VmConfigFault, Timedout, FileFault, InvalidState, InsufficientResourcesFault, MigrationFault, InvalidDatastore, RuntimeFault, RemoteException {
        return relocateVM_Task(spec, null);
    }

    //SDK4.0 signature
    public Task relocateVM_Task(VirtualMachineRelocateSpec spec, VirtualMachineMovePriority priority) throws VmConfigFault, Timedout, FileFault, InvalidState, InsufficientResourcesFault, MigrationFault, InvalidDatastore, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().relocateVM_Task(getMOR(), spec, priority);
        return new Task(getServerConnection(), mor);
    }

    //SDK4.1 signature for back compatibility
    public Task removeAllSnapshots_Task() throws SnapshotFault, TaskInProgress, InvalidState, RuntimeFault, RemoteException {
        return removeAllSnapshots_Task(null);
    }

    //SDK5.0 signature
    public Task removeAllSnapshots_Task(Boolean consolidate) throws SnapshotFault, TaskInProgress, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().removeAllSnapshots_Task(getMOR(), consolidate);
        return new Task(getServerConnection(), mor);
    }

    public void resetGuestInformation() throws InvalidState, RuntimeFault, RemoteException {
        getVimService().resetGuestInformation(getMOR());
    }

    public Task resetVM_Task() throws TaskInProgress, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().resetVM_Task(getMOR());
        return new Task(getServerConnection(), mor);
    }

    //SDK2.5 signature for back compatibility
    public Task revertToCurrentSnapshot_Task(HostSystem host) throws VmConfigFault, SnapshotFault, TaskInProgress, InvalidState, InsufficientResourcesFault, NotFound, RuntimeFault, RemoteException {
        return revertToCurrentSnapshot_Task(host, null);
    }

    //SDK4.0 signature
    public Task revertToCurrentSnapshot_Task(HostSystem host, Boolean suppressPowerOn) throws VmConfigFault, SnapshotFault, TaskInProgress, InvalidState, InsufficientResourcesFault, NotFound, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().revertToCurrentSnapshot_Task(getMOR(), host == null ? null : host.getMOR(), suppressPowerOn);
        return new Task(getServerConnection(), mor);
    }

    public void sendNMI() throws InvalidState, RuntimeFault, RemoteException {
        this.getVimService().getWsc().invokeWithoutReturn("SendNMI", this.getSingleSelfArgumentList());
    }

    /**
     * @since SDK4.0
     */
    public void setDisplayTopology(VirtualMachineDisplayTopology[] displays) throws InvalidState, ToolsUnavailable, RuntimeFault, RemoteException {
        getVimService().setDisplayTopology(getMOR(), displays);
    }

    public void setScreenResolution(int width, int height) throws InvalidPowerState, ToolsUnavailable, RuntimeFault, RemoteException {
        getVimService().setScreenResolution(getMOR(), width, height);
    }

    public void shutdownGuest() throws TaskInProgress, InvalidState, ToolsUnavailable, RuntimeFault, RemoteException {
        getVimService().shutdownGuest(getMOR());
    }

    public void standbyGuest() throws TaskInProgress, InvalidState, ToolsUnavailable, RuntimeFault, RemoteException {
        getVimService().standbyGuest(getMOR());
    }

    /**
     * @since SDK4.0
     */
    @Deprecated(since = "5.1")
    public Task startRecording_Task(String name, String description) throws InvalidPowerState, InvalidState, TaskInProgress, FileFault, SnapshotFault, VmConfigFault, RecordReplayDisabled, HostIncompatibleForRecordReplay, InvalidName, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().startRecording_Task(getMOR(), name, description);
        return new Task(getServerConnection(), mor);
    }

    /**
     * @since SDK4.0
     */
    @Deprecated(since = "5.1")
    public Task startReplaying_Task(VirtualMachineSnapshot replaySnapshot) throws InvalidPowerState, InvalidState, TaskInProgress, FileFault, SnapshotFault, VmConfigFault, RecordReplayDisabled, HostIncompatibleForRecordReplay, InvalidName, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().startReplaying_Task(getMOR(), replaySnapshot.getMOR());
        return new Task(getServerConnection(), mor);
    }

    /**
     * @since SDK4.0
     */
    @Deprecated(since = "5.1")
    public Task stopRecording_Task() throws InvalidPowerState, InvalidState, TaskInProgress, FileFault, SnapshotFault, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().stopRecording_Task(getMOR());
        return new Task(getServerConnection(), mor);
    }

    /**
     * @since SDK4.0
     */
    @Deprecated(since = "5.1")
    public Task stopReplaying_Task() throws InvalidPowerState, InvalidState, TaskInProgress, FileFault, SnapshotFault, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().stopReplaying_Task(getMOR());
        return new Task(getServerConnection(), mor);
    }

    public Task suspendVM_Task() throws TaskInProgress, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().suspendVM_Task(getMOR());
        return new Task(getServerConnection(), mor);
    }

    /**
     * @since SDK4.0
     */
    public Task terminateFaultTolerantVM_Task(VirtualMachine vm) throws TaskInProgress, VmFaultToleranceIssue, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().terminateFaultTolerantVM_Task(getMOR(),
                vm == null ? null : vm.getMOR());
        return new Task(getServerConnection(), mor);
    }

    public void terminateVM() throws InvalidState, NotSupported, RuntimeFault, TaskInProgress, RemoteException {
        this.getVimService().getWsc().invokeWithoutReturn("TerminateVM", this.getSingleSelfArgumentList());
    }

    /**
     * @since SDK4.0
     */
    public Task turnOffFaultToleranceForVM_Task() throws TaskInProgress, VmFaultToleranceIssue, InvalidState, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().turnOffFaultToleranceForVM_Task(getMOR());
        return new Task(getServerConnection(), mor);
    }

    public void unmountToolsInstaller() throws InvalidState, RuntimeFault, RemoteException {
        getVimService().unmountToolsInstaller(getMOR());
    }

    public void unregisterVM() throws InvalidPowerState, RuntimeFault, RemoteException {
        getVimService().unregisterVM(getMOR());
    }

    public Task upgradeTools_Task(String installerOptions) throws TaskInProgress, VmToolsUpgradeFault, InvalidState, ToolsUnavailable, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().upgradeTools_Task(getMOR(), installerOptions);
        return new Task(getServerConnection(), mor);
    }

    public Task upgradeVM_Task(String version) throws TaskInProgress, InvalidState, AlreadyUpgraded, NoDiskFound, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().upgradeVM_Task(getMOR(), version);
        return new Task(getServerConnection(), mor);
    }
}
