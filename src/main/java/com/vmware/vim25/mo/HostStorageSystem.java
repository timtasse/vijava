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
 * This managed object gets and sets configuration information about the host's storage subsystem.
 * The properties and operations are used to configure the host to make storage available for virtual machines.
 * This object contains properties that are specific to ESX Server and general to both the ESX Server system and the hosted architecture.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7.2
 */
@SuppressWarnings("unchecked")
public class HostStorageSystem extends ExtensibleManagedObject {

    public HostStorageSystem(ServerConnection serverConnection, ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public HostFileSystemVolumeInfo getFileSystemVolumeInfo() {
        return (HostFileSystemVolumeInfo) getCurrentProperty("fileSystemVolumeInfo");
    }

    public HostMultipathStateInfo getMultipathStateInfo() {
        return (HostMultipathStateInfo) getCurrentProperty("multipathStateInfo");
    }

    public HostStorageDeviceInfo getStorageDeviceInfo() {
        return (HostStorageDeviceInfo) getCurrentProperty("storageDeviceInfo");
    }

    public String[] getSystemFile() {
        return (String[]) getCurrentProperty("systemFile");
    }

    public void addInternetScsiSendTargets(String iScsiHbaDevice, HostInternetScsiHbaSendTarget[] targets) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().addInternetScsiSendTargets(getMOR(), iScsiHbaDevice, targets);
    }

    public void addInternetScsiStaticTargets(String iScsiHbaDevice, HostInternetScsiHbaStaticTarget[] targets) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().addInternetScsiStaticTargets(getMOR(), iScsiHbaDevice, targets);
    }

    public void attachScsiLun(String lunUuid) throws NotFound, HostConfigFault, InvalidState, RuntimeFault, RemoteException {
        getVimService().attachScsiLun(getMOR(), lunUuid);
    }

    public Task attachScsiLunEx(final List<String> lunUuid) throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunUuid", "String[]", lunUuid));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("AttachScsiLunEx_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public void attachVmfsExtent(String vmfsPath, HostScsiDiskPartition extent) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().attachVmfsExtent(getMOR(), vmfsPath, extent);
    }

    public void changeNFSUserPassword(final String password) throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("password", "String", password));
        this.getVimService().getWsc().invokeWithoutReturn("ChangeNFSUserPassword", params);
    }

    public void clearNFSUser() throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Collections.singletonList(this.getSelfArgument());
        this.getVimService().getWsc().invokeWithoutReturn("ClearNFSUser", params);
    }

    //SDK4.1 signature for back compatibility
    public HostDiskPartitionInfo computeDiskPartitionInfo(String devicePath, HostDiskPartitionLayout layout) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        return computeDiskPartitionInfo(devicePath, layout, null);
    }

    //SDK5.0 signature
    public HostDiskPartitionInfo computeDiskPartitionInfo(String devicePath, HostDiskPartitionLayout layout, String partitionFormat) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        return getVimService().computeDiskPartitionInfo(getMOR(), devicePath, layout, partitionFormat);
    }

    //SDK4.1 signature for back compatibility
    public HostDiskPartitionInfo computeDiskPartitionInfoForResize(HostScsiDiskPartition partition, HostDiskPartitionBlockRange blockRange) throws NotFound, HostConfigFault, RuntimeFault, RemoteException {
        return computeDiskPartitionInfoForResize(partition, blockRange, null);
    }

    //SDK5.0 signature
    public HostDiskPartitionInfo computeDiskPartitionInfoForResize(HostScsiDiskPartition partition, HostDiskPartitionBlockRange blockRange, String partitionFormat) throws NotFound, HostConfigFault, RuntimeFault, RemoteException {
        return getVimService().computeDiskPartitionInfoForResize(getMOR(), partition, blockRange, partitionFormat);
    }

    public void deleteScsiLunState(final String lunCanonicalName) throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunCanonicalName", "String", lunCanonicalName));
        this.getVimService().getWsc().invokeWithoutReturn("DeleteScsiLunState", params);
    }

    public void deleteVffsVolumeState(String vffsUuid) throws HostConfigFault, RuntimeFault, RemoteException {
        getVimService().deleteVffsVolumeState(this.getMOR(), vffsUuid);
    }

    public void deleteVmfsVolumeState(final String vmfsUuid) throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", "String", vmfsUuid));
        this.getVimService().getWsc().invokeWithoutReturn("DeleteVmfsVolumeState", params);
    }

    public void destroyVffs(String vffsPath) throws NotFound, HostConfigFault, ResourceInUse, RuntimeFault, RemoteException {
        getVimService().destroyVffs(this.getMOR(), vffsPath);
    }

    public void detachScsiLun(String lunUuid) throws NotFound, HostConfigFault, InvalidState, ResourceInUse, RuntimeFault, RemoteException {
        getVimService().detachScsiLun(getMOR(), lunUuid);
    }

    public Task detachScsiLunEx(final List<String> lunUuid) throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunUuid", "String[]", lunUuid.toArray()));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("DetachScsiLunEx_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public void disableMultipathPath(String pathName) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().disableMultipathPath(getMOR(), pathName);
    }

    public void discoverFcoeHbas(FcoeConfigFcoeSpecification fcoeSpec) throws FcoeFaultPnicHasNoPortSet, HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().discoverFcoeHbas(getMOR(), fcoeSpec);
    }

    public void enableMultipathPath(String pathName) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().enableMultipathPath(getMOR(), pathName);
    }

    public void expandVmfsExtent(String vmfsPath, HostScsiDiskPartition extent) throws NotFound, HostConfigFault, RuntimeFault, RemoteException {
        getVimService().expandVmfsExtent(getMOR(), vmfsPath, extent);
    }

    public void extendVffs(String vffsPath, String devicePath, HostDiskPartitionSpec spec) throws NotFound, HostConfigFault, ResourceInUse, RuntimeFault, RemoteException {
        getVimService().extendVffs(this.getMOR(), vffsPath, devicePath, spec);
    }

    public HostVffsVolume formatVffs(String vffsPath, String devicePath, HostVffsSpec createSpec) throws AlreadyExists, HostConfigFault, ResourceInUse, RuntimeFault, RemoteException {
        return getVimService().formatVffs(this.getMOR(), createSpec);
    }

    public HostVmfsVolume formatVmfs(HostVmfsSpec createSpec) throws HostConfigFault, AlreadyExists, RuntimeFault, RemoteException {
        return getVimService().formatVmfs(getMOR(), createSpec);
    }

    public Task markAsLocal(final String scsiDiskUuid) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("scsiDiskUuid", "String", scsiDiskUuid));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("MarkAsLocal_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task markAsNonLocal(final String scsiDiskUuid) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("scsiDiskUuid", "String", scsiDiskUuid));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("MarkAsNonLocal_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task markAsNonSsd(final String scsiDiskUuid) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("scsiDiskUuid", "String", scsiDiskUuid));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("MarkAsNonSsd_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task markAsSsd(final String scsiDiskUuid) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("scsiDiskUuid", "String", scsiDiskUuid));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("MarkAsSsd_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public void markForRemoval(final String hbaName, final boolean remove) throws HostConfigFault, InvalidArgument, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("hbaName", String.class, hbaName),
                new Argument("remove", "boolean", remove));
        this.getVimService().getWsc().invokeWithoutReturn("MarkForRemoval", params);
    }

    public void markPerenniallyReserved(final String lunUuid, final boolean state) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunUuid", String.class, lunUuid),
                new Argument("state", "boolean", state));
        this.getVimService().getWsc().invokeWithoutReturn("MarkPerenniallyReserved", params);
    }

    public Task markPerenniallyReservedEx(final List<String> lunUuid, final boolean state) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunUuid", "String[]", lunUuid.toArray()),
                new Argument("state", "boolean", state));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("MarkPerenniallyReservedEx_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public void mountVffsVolume(String vffsUuid) throws NotFound, InvalidState, HostConfigFault, ResourceInUse, RuntimeFault, RemoteException {
        getVimService().mountVffsVolume(this.getMOR(), vffsUuid);
    }

    public void mountVmfsVolume(String vmfsUuid) throws NotFound, InvalidState, HostConfigFault, ResourceInUse, RuntimeFault, RemoteException {
        getVimService().mountVmfsVolume(getMOR(), vmfsUuid);
    }

    public Task mountVmfsVolumeEx(final List<String> vmfsUuid) throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", "String[]", vmfsUuid.toArray()));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("MountVmfsVolumeEx_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public HostScsiDisk[] queryAvailableSsds(String vffsPath) throws NotFound, HostConfigFault, RuntimeFault, RemoteException {
        return getVimService().queryAvailableSsds(this.getMOR(), vffsPath);
    }

    public HostNasVolumeUserInfo queryNFSUser() throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Collections.singletonList(this.getSelfArgument());
        return (HostNasVolumeUserInfo) this.getVimService().getWsc().invoke("QueryNFSUser", params, "HostNasVolumeUserInfo");
    }

    /**
     * @since 4.0
     */
    public HostPathSelectionPolicyOption[] queryPathSelectionPolicyOptions() throws HostConfigFault, RuntimeFault, RemoteException {
        return getVimService().queryPathSelectionPolicyOptions(getMOR());
    }

    /**
     * @since 4.0
     */
    public HostStorageArrayTypePolicyOption[] queryStorageArrayTypePolicyOptions() throws HostConfigFault, RuntimeFault, RemoteException {
        return getVimService().queryStorageArrayTypePolicyOptions(getMOR());
    }

    /**
     * @since 4.0
     */
    public HostUnresolvedVmfsVolume[] queryUnresolvedVmfsVolume() throws RuntimeFault, RemoteException {
        return getVimService().queryUnresolvedVmfsVolume(getMOR());
    }

    public List<VmfsConfigOption> queryVmfsConfigOption() throws RuntimeFault, RemoteException {
        final List<Argument> params = Collections.singletonList(this.getSelfArgument());
        return (List<VmfsConfigOption>) this.getVimService().getWsc().invoke("QueryVmfsConfigOption", params, "List.VmfsConfigOption");
    }

    public void refreshStorageSystem() throws RuntimeFault, RemoteException {
        getVimService().refreshStorageSystem(getMOR());
    }

    public void removeInternetScsiSendTargets(String iScsiHbaDevice, HostInternetScsiHbaSendTarget[] targets) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().removeInternetScsiSendTargets(getMOR(), iScsiHbaDevice, targets);
    }

    public void removeInternetScsiStaticTargets(String iScsiHbaDevice, HostInternetScsiHbaStaticTarget[] targets) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().removeInternetScsiStaticTargets(getMOR(), iScsiHbaDevice, targets);
    }

    public void rescanAllHba() throws HostConfigFault, RuntimeFault, RemoteException {
        getVimService().rescanAllHba(getMOR());
    }

    public void rescanHba(String hbaDevice) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().rescanHba(getMOR(), hbaDevice);
    }

    /**
     * @since SDK5.5
     */
    public void rescanVffs() throws HostConfigFault, RuntimeFault, RemoteException {
        getVimService().rescanVffs(this.getMOR());
    }

    public void rescanVmfs() throws HostConfigFault, RuntimeFault, RemoteException {
        getVimService().rescanVmfs(getMOR());
    }

    /**
     * @since 4.0
     */
    public HostUnresolvedVmfsResolutionResult[] resolveMultipleUnresolvedVmfsVolumes(HostUnresolvedVmfsResolutionSpec[] resolutionSpec) throws HostConfigFault, RuntimeFault, RemoteException {
        return getVimService().resolveMultipleUnresolvedVmfsVolumes(getMOR(), resolutionSpec);
    }

    /**
     * @since SDK5.5
     */
    public Task resolveMultipleUnresolvedVmfsVolumesEx_Task(HostUnresolvedVmfsResolutionSpec[] resolutionSpec) throws HostConfigFault, RuntimeFault, RemoteException {
        ManagedObjectReference mor = getVimService().resolveMultipleUnresolvedVmfsVolumesEx_Task(this.getMOR(), resolutionSpec);
        return new Task(this.getServerConnection(), mor);
    }

    public HostDiskPartitionInfo[] retrieveDiskPartitionInfo(String[] devicePath) throws RuntimeFault, RemoteException {
        return getVimService().retrieveDiskPartitionInfo(getMOR(), devicePath);
    }

    public void setMultipathLunPolicy(String lunId, HostMultipathInfoLogicalUnitPolicy policy) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().setMultipathLunPolicy(getMOR(), lunId, policy);
    }

    public void setNFSUser(final String user, final String password) throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("user", "String", user),
                new Argument("password", "String", password));
        this.getVimService().getWsc().invokeWithoutReturn("SetNFSUser", params);
    }

    public Task turnDiskLocatorLedOff(final List<String> scsiDiskUuids) throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("scsiDiskUuids", "String[]", scsiDiskUuids.toArray()));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("TurnDiskLocatorLedOff_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task turnDiskLocatorLedOn(final List<String> scsiDiskUuids) throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("scsiDiskUuids", "String[]", scsiDiskUuids.toArray()));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("TurnDiskLocatorLedOn_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task unmapVmfsVolumeEx(final List<String> vmfsUuid) throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", "String[]", vmfsUuid.toArray()));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("UnmapVmfsVolumeEx_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    /**
     * @since SDK4.0
     */
    public void unmountForceMountedVmfsVolume(String vmfsUuid) throws NotFound, HostConfigFault, RuntimeFault, RemoteException {
        getVimService().unmountForceMountedVmfsVolume(getMOR(), vmfsUuid);
    }

    /**
     * @since SDK5.5
     */
    public void unmountVffsVolume(String vffsUuid) throws NotFound, InvalidState, HostConfigFault, ResourceInUse, RuntimeFault, RemoteException {
        getVimService().unmountVffsVolume(this.getMOR(), vffsUuid);
    }

    /**
     * @since SDK5.0
     */
    public void unmountVmfsVolume(String vmfsUuid) throws NotFound, InvalidState, HostConfigFault, ResourceInUse, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", "String", vmfsUuid));
        this.getVimService().getWsc().invokeWithoutReturn("UnmountVmfsVolume", params);
    }

    public Task unmountVmfsVolumeEx(List<String> vmfsUuids) throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", "String[]", vmfsUuids.toArray()));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("UnmountVmfsVolumeEx_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public void updateDiskPartitions(String devicePath, HostDiskPartitionSpec spec) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().updateDiskPartitions(getMOR(), devicePath, spec);
    }

    public void updateInternetScsiAlias(String iScsiHbaDevice, String iScsiAlias) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().updateInternetScsiAlias(getMOR(), iScsiHbaDevice, iScsiAlias);
    }

    //SDK2.5 signature for back compatibility
    public void updateInternetScsiAuthenticationProperties(String iScsiHbaDevice, HostInternetScsiHbaAuthenticationProperties authenticationProperties)
            throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        updateInternetScsiAuthenticationProperties(iScsiHbaDevice, authenticationProperties, null);
    }

    //SDK4.0 signature
    public void updateInternetScsiAuthenticationProperties(String iScsiHbaDevice, HostInternetScsiHbaAuthenticationProperties authenticationProperties, HostInternetScsiHbaTargetSet targetSet)
            throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().updateInternetScsiAuthenticationProperties(getMOR(), iScsiHbaDevice, authenticationProperties, targetSet);
    }

    /**
     * @since 4.0
     */
    public void updateInternetScsiAdvancedOptions(String iScsiHbaDevice, HostInternetScsiHbaTargetSet targetSet, HostInternetScsiHbaParamValue[] options) throws NotFound, HostConfigFault, RuntimeFault, RemoteException {
        getVimService().updateInternetScsiAdvancedOptions(getMOR(), iScsiHbaDevice, targetSet, options);
    }

    /**
     * @since 4.0
     */
    public void updateInternetScsiDigestProperties(String iScsiHbaDevice, HostInternetScsiHbaTargetSet targetSet, HostInternetScsiHbaDigestProperties digestProperties) throws NotFound, HostConfigFault, RuntimeFault, RemoteException {
        getVimService().updateInternetScsiDigestProperties(getMOR(), iScsiHbaDevice, targetSet, digestProperties);
    }

    /**
     * @since 4.0
     */
    public void updateScsiLunDisplayName(String lunUuid, String displayName) throws NotFound, HostConfigFault, InvalidName, DuplicateName, RuntimeFault, RemoteException {
        getVimService().updateScsiLunDisplayName(getMOR(), lunUuid, displayName);
    }

    public void updateInternetScsiDiscoveryProperties(String iScsiHbaDevice, HostInternetScsiHbaDiscoveryProperties discoveryProperties)
            throws NotFound, RuntimeFault, RemoteException {
        getVimService().updateInternetScsiDiscoveryProperties(getMOR(), iScsiHbaDevice, discoveryProperties);
    }

    public void updateInternetScsiIPProperties(String iScsiHbaDevice, HostInternetScsiHbaIPProperties ipProperties)
            throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().updateInternetScsiIPProperties(getMOR(), iScsiHbaDevice, ipProperties);
    }

    public void updateInternetScsiName(String iScsiHbaDevice, String iScsiName) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().updateInternetScsiName(getMOR(), iScsiHbaDevice, iScsiName);
    }

    public void updateSoftwareInternetScsiEnabled(boolean enabled) throws HostConfigFault, RuntimeFault, RemoteException {
        getVimService().updateSoftwareInternetScsiEnabled(getMOR(), enabled);
    }

    public void updateVmfsUnmapBandwidth(final String vmfsUuid, final VmfsUnmapBandwidthSpec unmapBandwidthSpec) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", "String", vmfsUuid),
                new Argument("unmapBandwidthSpec", "VmfsUnmapBandwidthSpec", unmapBandwidthSpec)
        );
        this.getVimService().getWsc().invokeWithoutReturn("UpdateVmfsUnmapBandwidth", params);
    }

    public void updateVmfsUnmapPriority(final String vmfsUuid, final String unmapPriority) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("vmfsUuid", "String", vmfsUuid),
                new Argument("unmapPriority", "String", unmapPriority)
        );
        this.getVimService().getWsc().invokeWithoutReturn("UpdateVmfsUnmapPriority", params);
    }

    public void upgradeVmfs(String vmfsPath) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().upgradeVmfs(getMOR(), vmfsPath);
    }

    public void upgradeVmLayout(String vmfsPath) throws HostConfigFault, NotFound, RuntimeFault, RemoteException {
        getVimService().upgradeVmfs(getMOR(), vmfsPath);
    }

}
