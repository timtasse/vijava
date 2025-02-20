/*================================================================================
Copyright (c) 2011 VMware, Inc. All Rights Reserved.

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

package com.vmware.vim;

import com.vmware.vim25.*;
import com.vmware.vim25.mo.*;
import static org.doublecloud.ws.util.TypeUtil.asNullSafeList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * VirtualMachineDeviceManager manages the virtual devices in a much
 * simplified way than using the reconfigVM_Task() method defined in
 * VirtualMachine managed object.
 * <p>
 * Devices it manages include: FloppyDrive, CdDrive, NetworkAdapter, UsbDevice, HardDisk
 * Operations include:
 * create -- create something new
 * add -- add something existing but not yet attached to the virtual machine
 * remove -- remove the device(s) from the virtual machine
 * get -- retrieve the device(s) from the virtual machine
 * update -- update the existing device with new configuration
 *
 * @author Steve Jin (http://www.doublecloud.org)
 */

public class VirtualMachineDeviceManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(VirtualMachineDeviceManager.class);

    private final VirtualMachine vm;

    public VirtualMachineDeviceManager(VirtualMachine vm) {
        this.vm = vm;
    }

    public VirtualMachine getVM() {
        return this.vm;
    }

    /*############################################################
    Floppy Drive Management
    ############################################################*/

    /**
     * @param floppyImagePath - i.e. "[storage1] myVM/myFloppy.flp" Note: there is a space after ].
     */
    public Task addFloppyDriveFromISO(String floppyImagePath, boolean startConnected) throws InvalidName, VmConfigFault, DuplicateName, TaskInProgress, FileFault, InvalidState, ConcurrentAccess, InvalidDatastore, InsufficientResourcesFault, RuntimeFault, RemoteException {
        return addFloppyDrive(floppyImagePath, null, null, startConnected);
    }

    /**
     * @param hostDevice - i.e. "/dev/fd0"
     */
    public Task addFloppyDriveFromHost(String hostDevice, boolean startConnected) throws InvalidName, VmConfigFault, DuplicateName, TaskInProgress, FileFault, InvalidState, ConcurrentAccess, InvalidDatastore, InsufficientResourcesFault, RuntimeFault, RemoteException {
        return addFloppyDrive(null, null, hostDevice, startConnected);
    }

    public Task createFloppyDrive(String floppyImagePath, boolean startConnected) throws InvalidName, VmConfigFault, DuplicateName, TaskInProgress, FileFault, InvalidState, ConcurrentAccess, InvalidDatastore, InsufficientResourcesFault, RuntimeFault, RemoteException {
        return addFloppyDrive(null, floppyImagePath, null, startConnected);
    }

    private Task addFloppyDrive(String floppyImagePath, String newFloppyImagePath, String hostDevice, boolean startConnected) throws InvalidName, VmConfigFault, DuplicateName, TaskInProgress, FileFault, InvalidState, ConcurrentAccess, InvalidDatastore, InsufficientResourcesFault, RuntimeFault, RemoteException {
        // Any VM associated with the device must be powered off.
        if (vm.getRuntime().getPowerState() == VirtualMachinePowerState.poweredOff) {
            throw new RuntimeException("Invalid power state: power off this VM before adding a floppy drive.");
        }

        VirtualFloppy floppy = new VirtualFloppy();
        floppy.setConnectable(new VirtualDeviceConnectInfo());
        floppy.getConnectable().setStartConnected(startConnected);

        if (hostDevice != null) {
            VirtualFloppyDeviceBackingInfo backing = new VirtualFloppyDeviceBackingInfo();
            backing.deviceName = hostDevice;
            floppy.setBacking(backing);
        } else if (floppyImagePath != null) {
            VirtualFloppyImageBackingInfo backing = new VirtualFloppyImageBackingInfo();
            backing.fileName = floppyImagePath;
            floppy.setBacking(backing);
        } else if (newFloppyImagePath != null) {
            VirtualFloppyImageBackingInfo backing = new VirtualFloppyImageBackingInfo();
            backing.fileName = newFloppyImagePath;
            floppy.setBacking(backing);
        } else {
            // The VIM API doesn't allow for the possibility of adding a drive
            // without hooking it up to something. In an ideal world, I'd probably
            // want an ISO backing without having to specify a valid ISO at this
            // time. So we'll create a remote passthrough backing and just set it
            // as not connected.
            VirtualFloppyRemoteDeviceBackingInfo backing = new VirtualFloppyRemoteDeviceBackingInfo();
            backing.deviceName = "";
            floppy.setBacking(backing);
            floppy.getConnectable().setStartConnected(false);
            floppy.getConnectable().setConnected(false);
        }

        floppy.setKey(-1);

        VirtualDeviceConfigSpec floppySpec = new VirtualDeviceConfigSpec();
        floppySpec.setOperation(VirtualDeviceConfigSpecOperation.add);
        if (newFloppyImagePath != null) {
            floppySpec.setFileOperation(VirtualDeviceConfigSpecFileOperation.create);
        }
        floppySpec.setDevice(floppy);

        VirtualMachineConfigSpec config = new VirtualMachineConfigSpec();
        config.setDeviceChange(List.of(floppySpec));

        VirtualIDEController controller = getFirstAvailableController(VirtualIDEController.class);

        if (controller != null) {
            config.getDeviceChange().get(0).getDevice().setControllerKey(controller.getKey());
        } else {
            throw new RuntimeException("No available IDE controller for floppy drive.");
        }

        return vm.reconfigVM(config);
    }

    /*############################################################
    CD/DVC Drive Management
    ############################################################*/
    public void addCdDriveFromIso(String isoPath, boolean startConnected) throws InvalidProperty, RuntimeFault, RemoteException, InterruptedException {
        addCdDrive(isoPath, null, startConnected);
    }

    public void addCdDriveFromHost(String hostDevice, boolean startConnected) throws InvalidProperty, RuntimeFault, RemoteException, InterruptedException {
        addCdDrive(null, hostDevice, startConnected);
    }

    private void addCdDrive(String isoPath, String hostDevice, boolean startConnected) throws InvalidProperty, RuntimeFault, RemoteException, InterruptedException {
        VirtualMachinePowerState powerState = vm.getRuntime().getPowerState();
        if (powerState != VirtualMachinePowerState.poweredOff) {
            throw new RuntimeException("VM is not yet powered off for adding a CD drive.");
        }

        VirtualCdrom cdrom = new VirtualCdrom();
        cdrom.setConnectable(new VirtualDeviceConnectInfo());
        cdrom.getConnectable().setAllowGuestControl(true);
        cdrom.getConnectable().setStartConnected(startConnected);

        if (hostDevice != null) {
            validateCdromHostDevice(hostDevice);
            VirtualCdromAtapiBackingInfo backing = new VirtualCdromAtapiBackingInfo();
            backing.deviceName = hostDevice;
            cdrom.setBacking(backing);
        } else if (isoPath != null) {
            VirtualCdromIsoBackingInfo backing = new VirtualCdromIsoBackingInfo();
            backing.fileName = isoPath;
            cdrom.setBacking(backing);
        } else {
            // We don't allow adding a CD drive without hooking it up to something.
            // In an ideal world, you may want an ISO backing without having to specify a valid ISO
            // at this time. Create a remote passthrough backing and just set it as not connected.
            VirtualCdromRemotePassthroughBackingInfo backing = new VirtualCdromRemotePassthroughBackingInfo();
            backing.exclusive = true;
            backing.deviceName = "";
            cdrom.setBacking(backing);
        }

        cdrom.setKey(-1);

        VirtualDeviceConfigSpec cdSpec = new VirtualDeviceConfigSpec();
        cdSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
        cdSpec.setDevice(cdrom);

        VirtualMachineConfigSpec config = new VirtualMachineConfigSpec();
        config.setDeviceChange(List.of(cdSpec));

        VirtualIDEController controller = getFirstAvailableController(VirtualIDEController.class);

        if (controller != null) {
            config.getDeviceChange().get(0).getDevice().setControllerKey(controller.getKey());
        } else {
            throw new RuntimeException("No free IDE controller for addtional CD Drive.");
        }

        Task task = vm.reconfigVM(config);
        task.waitForTask();
    }

    private void validateCdromHostDevice(String hostDevice) throws InvalidProperty, RuntimeFault, RemoteException {
        List<String> validCdList = getValidCdromOnHost();

        if (!validCdList.contains(hostDevice)) {
            throw new RuntimeException("Invalid host device path for CD drives.");
        }
    }

    private List<String> getValidCdromOnHost() throws InvalidProperty, RuntimeFault, RemoteException {
        List<String> result = new ArrayList<String>();

        EnvironmentBrowser envBrower = vm.getEnvironmentBrowser();

        ConfigTarget configTarget;

        try {
            configTarget = envBrower.queryConfigTarget(null);
        } catch (Exception ex) {
            throw new RuntimeException("Error in getting Cdrom devices from host.");
        }

        if (configTarget != null && configTarget.getCdRom() != null) {
            for (VirtualMachineCdromInfo cdromInfo : configTarget.getCdRom()) {
                result.add(cdromInfo.name);
            }
        }
        return result;
    }


    /*############################################################
    Hard Disk Management
    ############################################################*/
    public void createHardDisk(int diskSizeMB, VirtualDiskType type, VirtualDiskMode mode) throws Exception {
        VirtualMachineConfigSpec vmConfigSpec = new VirtualMachineConfigSpec();
        VirtualDeviceConfigSpec diskSpec = new VirtualDeviceConfigSpec();

        VirtualDiskFlatVer2BackingInfo diskfileBacking = new VirtualDiskFlatVer2BackingInfo();
        diskfileBacking.setFileName("");
        diskfileBacking.setDiskMode(mode.toString());
        diskfileBacking.setThinProvisioned(type == VirtualDiskType.thin);

        VirtualSCSIController scsiController = getFirstAvailableController(VirtualSCSIController.class);
        int unitNumber = getFirstFreeUnitNumberForController(scsiController);
        VirtualDisk disk = new VirtualDisk();
        disk.setControllerKey(scsiController.getKey());
        disk.setUnitNumber(unitNumber);
        disk.setBacking(diskfileBacking);
        disk.setCapacityInBytes(1048576L * diskSizeMB);
        disk.setKey(-1);

        diskSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
        diskSpec.setFileOperation(VirtualDeviceConfigSpecFileOperation.create);
        diskSpec.setDevice(disk);
        VirtualDeviceConfigSpec vdiskSpec = diskSpec;

        vmConfigSpec.setDeviceChange(List.of(vdiskSpec));
        Task task = vm.reconfigVM(vmConfigSpec);

        task.waitForTask(200, 100);
    }

    public void addHardDisk(String diskFilePath, VirtualDiskMode diskMode) throws Exception {
        VirtualMachineConfigSpec vmConfigSpec = new VirtualMachineConfigSpec();

        VirtualDeviceConfigSpec diskSpec = new VirtualDeviceConfigSpec();
        vmConfigSpec.setDeviceChange(List.of(diskSpec));

        VirtualDiskFlatVer2BackingInfo diskfileBacking = new VirtualDiskFlatVer2BackingInfo();
        diskfileBacking.setFileName(diskFilePath);
        diskfileBacking.setDiskMode(diskMode.toString());


        VirtualSCSIController scsiController = getFirstAvailableController(VirtualSCSIController.class);
        int unitNumber = getFirstFreeUnitNumberForController(scsiController);

        VirtualDisk disk = new VirtualDisk();
        disk.setControllerKey(scsiController.getKey());
        disk.setUnitNumber(unitNumber);
        disk.setBacking(diskfileBacking);
        //Unlike required by API ref, the capacityKB is optional. So skip setCapacityInKB() method.
        disk.setKey(-100);

        diskSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
        diskSpec.setDevice(disk);

        Task task = vm.reconfigVM(vmConfigSpec);

        task.waitForTask(200, 100);
    }

    public VirtualDisk findHardDisk(String diskName) {
        List<VirtualDevice> devices = getAllVirtualDevices();

        for (final VirtualDevice device : devices) {
            if (device instanceof VirtualDisk) {
                VirtualDisk vDisk = (VirtualDisk) device;
                if (diskName.equalsIgnoreCase(vDisk.getDeviceInfo().getLabel())) {
                    return vDisk;
                }
            }
        }
        return null;
    }

    private int getFirstFreeUnitNumberForController(VirtualController controller) {
        // If there are some devices attached then search which nodes are free
        // otherwise all nodes are free so just return the first one.
        if (controller.device == null) {
            return 0;
        }

        int maxNodes = getMaxNodesPerControllerOfType(controller);

        if (controller.device.length < maxNodes) {
            List<Integer> usedNodeList = new ArrayList<Integer>();
            List<VirtualDevice> devices = getAllVirtualDevices();

            // If this is SCSI controller then its controller also occupies one node.
            if (controller instanceof VirtualSCSIController) {
                usedNodeList.add(((VirtualSCSIController) controller).scsiCtlrUnitNumber);
            }

            for (VirtualDevice device : devices) {
                if (device.getControllerKey() != null && device.getControllerKey() == controller.getKey()) {
                    usedNodeList.add(device.getUnitNumber());
                }
            }
            for (int i = 0; i < maxNodes; i++) {
                if (!usedNodeList.contains(i)) {
                    return i;
                }
            }
        }

        return -1;
    }
  

  /*############################################################
  Network Adapter Management
  ############################################################*/

    /**
     * Create a new virtual network adapter on the VM
     * Your MAC address should start with 00:50:56
     */
    public void createNetworkAdapter(VirtualNetworkAdapterType type, String networkName, String macAddress, boolean wakeOnLan, boolean startConnected) throws InvalidProperty, RuntimeFault, RemoteException, InterruptedException {
        VirtualMachinePowerState powerState = vm.getRuntime().getPowerState();
        String vmVerStr = vm.getConfig().getVersion();
        int vmVer = Integer.parseInt(vmVerStr.substring(vmVerStr.length() - 2));

        if ((powerState == VirtualMachinePowerState.suspended) ||
                (powerState == VirtualMachinePowerState.suspended && vmVer < 7)) {
            throw new InvalidPowerState();
        }

        HostSystem host = new HostSystem(vm.getServerConnection(), vm.getRuntime().getHost());
        ComputeResource cr = (ComputeResource) host.getParent();
        EnvironmentBrowser envBrowser = cr.getEnvironmentBrowser();
        ConfigTarget configTarget = envBrowser.queryConfigTarget(host);
        VirtualMachineConfigOption vmCfgOpt = envBrowser.queryConfigOption(null, host);

        type = validateNicType(vmCfgOpt.getGuestOSDescriptor(), vm.getConfig().getGuestId(), type);

        VirtualDeviceConfigSpec nicSpec = createNicSpec(type, networkName, macAddress, wakeOnLan, startConnected, configTarget);

        VirtualMachineConfigSpec vmConfigSpec = new VirtualMachineConfigSpec();
        vmConfigSpec.setDeviceChange(List.of(nicSpec));
        Task task = vm.reconfigVM(vmConfigSpec);

        task.waitForTask(200, 100);
    }

    private VirtualDeviceConfigSpec createNicSpec(VirtualNetworkAdapterType adapterType, String networkName, String macAddress, boolean wakeOnLan, boolean startConnected, ConfigTarget configTarget) {
        VirtualDeviceConfigSpec result = null;
        DistributedVirtualPortgroupInfo dvPortgroupInfo = null;

        // Try vDS portgroup first
        if (configTarget.getDistributedVirtualPortgroup() != null) {
            dvPortgroupInfo = findDVPortgroupInfo(configTarget.getDistributedVirtualPortgroup(), networkName);
        }

        if (dvPortgroupInfo != null) {
            validateDVPortGroupForVNicConnection(dvPortgroupInfo);
            VirtualEthernetCardDistributedVirtualPortBackingInfo nicBacking = new VirtualEthernetCardDistributedVirtualPortBackingInfo();
            nicBacking.port = new DistributedVirtualSwitchPortConnection();
            nicBacking.port.portgroupKey = dvPortgroupInfo.getPortgroupKey();
            nicBacking.port.switchUuid = dvPortgroupInfo.getSwitchUuid();
            result = createNicSpec(adapterType, macAddress, wakeOnLan, startConnected, nicBacking);
        } else {
            NetworkSummary netSummary = getHostNetworkSummaryByName(
                    networkName, configTarget.getNetwork());
            VirtualEthernetCardNetworkBackingInfo nicBacking = new VirtualEthernetCardNetworkBackingInfo();
            nicBacking.network = netSummary.network;
            nicBacking.deviceName = netSummary.name;
            result = createNicSpec(adapterType, macAddress, wakeOnLan, startConnected, nicBacking);
        }
        return result;
    }

    // Validate if vDS Portgroup can be bound to vnic
    private void validateDVPortGroupForVNicConnection(DistributedVirtualPortgroupInfo dvPortgroupInfo) {
        if (dvPortgroupInfo.isUplinkPortgroup()) {
            throw new RuntimeException("The vDS portgroup's uplinkPortgroup should not be null");
        }

        DistributedVirtualPortgroupPortgroupType portgroupType = DistributedVirtualPortgroupPortgroupType.valueOf(dvPortgroupInfo.getPortgroupType());

        String prodLineId = vm.getServerConnection().getServiceInstance().getAboutInfo().getProductLineId();
        // standalone host cannot do early or late binding
        if (prodLineId.indexOf("ESX") != -1 &&
                (portgroupType == DistributedVirtualPortgroupPortgroupType.earlyBinding ||
                        portgroupType == DistributedVirtualPortgroupPortgroupType.lateBinding)) {
            throw new RuntimeException("ESX does not support early or late binding!");
        }
    }

    private static NetworkSummary getHostNetworkSummaryByName(String networkName, List<VirtualMachineNetworkInfo> hostNetworkList) {
        NetworkSummary result = null;
        boolean isNetworkExistingOnHost = false;

        // Check each of the provided network names against host networks to see if it exists on host
        for (VirtualMachineNetworkInfo netInfo : hostNetworkList) {
            if (networkName.equals(netInfo.name)) {
                isNetworkExistingOnHost = true;

                if (netInfo.network.accessible) {
                    result = netInfo.network;
                    break;
                } else {
                    throw new RuntimeException("Network: " + networkName + " is not accessible.");
                }
            }
        }
        if (!isNetworkExistingOnHost) {
            throw new RuntimeException("Network: " + networkName + " does not exist on host network.");
        }
        return result;
    }

    private static DistributedVirtualPortgroupInfo findDVPortgroupInfo(List<DistributedVirtualPortgroupInfo> hostDistributedVirtualPortgroupInfo,
                                                                       String portgroupName) {
        DistributedVirtualPortgroupInfo result = null;

        if (hostDistributedVirtualPortgroupInfo != null) {
            for (DistributedVirtualPortgroupInfo portgroupInfo : hostDistributedVirtualPortgroupInfo) {
                if (portgroupInfo.getPortgroupName().equalsIgnoreCase(portgroupName)) {
                    result = portgroupInfo;
                    break;
                }
            }
        }
        return result;
    }

    private static VirtualDeviceConfigSpec createNicSpec(VirtualNetworkAdapterType adapterType, String macAddress, boolean wakeOnLan, boolean startConnected, VirtualDeviceBackingInfo nicBacking) {
        VirtualDeviceConfigSpec result = new VirtualDeviceConfigSpec();

        VirtualEthernetCard device;
        switch (adapterType) {
            case VirtualVmxnet:
                device = new VirtualVmxnet();
                break;
            case VirtualVmxnet2:
                device = new VirtualVmxnet2();
                break;
            case VirtualVmxnet3:
                device = new VirtualVmxnet3();
                break;
            case VirtualPCNet32:
                device = new VirtualPCNet32();
                break;
            case VirtualE1000:
                device = new VirtualE1000();
                break;
            default:
                device = new VirtualVmxnet();
                break;
        }

        if (macAddress == null) {
            device.setAddressType("generated");
        } else {
            device.setAddressType("manual");
            device.setMacAddress(macAddress);
        }
        device.setWakeOnLanEnabled(wakeOnLan);

        device.setBacking(nicBacking);
        device.setConnectable(new VirtualDeviceConnectInfo());
        device.getConnectable().setConnected(true);
        device.getConnectable().setStartConnected(startConnected);
        device.setKey(-1);

        result.setOperation(VirtualDeviceConfigSpecOperation.add);
        result.setDevice(device);

        return result;
    }

    // Check network adapter type if it's supported by the guest OS
    private static VirtualNetworkAdapterType validateNicType(GuestOsDescriptor[] guestOsDescriptorList,
                                                             VirtualMachineGuestOsIdentifier guestId, VirtualNetworkAdapterType adapterType) throws DeviceNotSupported {
        VirtualNetworkAdapterType result = adapterType;

        GuestOsDescriptor guestOsInfo = null;

        for (GuestOsDescriptor desc : guestOsDescriptorList) {
            if (desc.getId().equalsIgnoreCase(guestId.name())) {
                guestOsInfo = desc;
                break;
            }
        }

        if (adapterType == VirtualNetworkAdapterType.Unknown) {
            result = TryGetNetworkAdapterType(guestOsInfo);
        } else {
            if (guestOsInfo.getSupportedEthernetCard() != null) {
                boolean supported = false;
                List<String> supportedTypeList = new ArrayList<String>();

                for (String supportedAdapterName : guestOsInfo.getSupportedEthernetCard()) {
                    VirtualNetworkAdapterType supportedAdapterType = GetNetworkAdapterTypeByApiType(supportedAdapterName);
                    supportedTypeList.add(supportedAdapterType.toString());

                    if (supportedAdapterType == adapterType) {
                        supported = true;
                        break;
                    }
                }

                if (!supported) {
                    DeviceNotSupported dns = new DeviceNotSupported();
                    dns.setDevice("Virtual NIC");
                    dns.setReason("The requested NIC is not supported in this OS.");
                    throw dns;
                }
            }
        }
        return result;
    }

    // Returns VirtualEthernetCard type recommended for the selected GuestOs
    private static VirtualNetworkAdapterType TryGetNetworkAdapterType(GuestOsDescriptor guestOsInfo) {
        String ethernetCardType = guestOsInfo.getRecommendedEthernetCard();

        if ((ethernetCardType == null || ethernetCardType.isEmpty()) &&
                (guestOsInfo.getSupportedEthernetCard() != null) &&
                ((guestOsInfo.getSupportedEthernetCard().size() > 0))) {
            ethernetCardType = guestOsInfo.getSupportedEthernetCard().get(0);
        }
        return GetNetworkAdapterTypeByApiType(ethernetCardType);
    }

    private static VirtualNetworkAdapterType GetNetworkAdapterTypeByApiType(String ethernetCardType) {
        return VirtualNetworkAdapterType.valueOf(ethernetCardType);
    }
  
  
  /*############################################################
  Common Code for All Types of Devices
  ############################################################*/

    /**
     * Remove the device. Make sure the VM is powered off before calling this method.
     * If destroyDeviceBacking is true, it deletes backings for example files in datastore. BE CAREFUL!
     */
    public Task removeDevice(VirtualDevice device, boolean destroyDeviceBacking) throws InvalidName, VmConfigFault, DuplicateName, TaskInProgress, FileFault, InvalidState, ConcurrentAccess, InvalidDatastore, InsufficientResourcesFault, RuntimeFault, RemoteException {
        ArrayList<VirtualDevice> deviceList = new ArrayList<VirtualDevice>();
        deviceList.add(device);
        return removeDevices(deviceList, destroyDeviceBacking);
    }


    /**
     * Remove all devices as listed in the deviceList. These devices can be different types.
     * Make sure the VM is powered off before calling this method.
     * If destroyDeviceBacking is true, it deletes backings for example files in datastore. BE CAREFUL!
     */
    public Task removeDevices(List<VirtualDevice> deviceList, boolean destroyDeviceBacking) throws InvalidName, VmConfigFault, DuplicateName, TaskInProgress, FileFault, InvalidState, ConcurrentAccess, InvalidDatastore, InsufficientResourcesFault, RuntimeFault, RemoteException {
        List<VirtualDeviceConfigSpec> configSpecList = new ArrayList<VirtualDeviceConfigSpec>();

        boolean allDevicesSupportHotRemoval = allSupportHotRemoval(deviceList);
        VirtualMachinePowerState powerState = vm.getRuntime().getPowerState();
        if (!allDevicesSupportHotRemoval && powerState != VirtualMachinePowerState.poweredOff) {
            throw new RuntimeException("Invalid power state: power off the VM first.");
        }

        for (VirtualDevice device : deviceList) {
            try {
                // Empty SCSI controller removal
                // If the device's SCSI controller will get free after device removal
                // then also remove the controller. But only if the VM is powered off.
                if (device instanceof VirtualDisk && powerState == VirtualMachinePowerState.poweredOff) {
                    List<VirtualSCSIController> contollerList = getVirtualDevicesOfType(VirtualSCSIController.class);
                    for (VirtualSCSIController controller : contollerList) {
                        if (controller.getKey() == device.getControllerKey()) {
                            if (controller.device.length == 1 && controller.device[0] == device.getKey()) {
                                VirtualDeviceConfigSpec controllerSpec = new VirtualDeviceConfigSpec();
                                controllerSpec.setOperation(VirtualDeviceConfigSpecOperation.remove);
                                controllerSpec.setDevice(controller);
                                configSpecList.add(controllerSpec);
                            }
                            break;
                        }
                    }
                }

                //region Usb controller removal.
                // If the device's SCSI controller will get free after device removal, also remove the controller.
                if (device instanceof VirtualUSB) {
                    List<VirtualUSBController> contollerList = getVirtualDevicesOfType(VirtualUSBController.class);
                    for (VirtualUSBController controller : contollerList) {
                        if (controller.getKey() == device.getControllerKey()) {
                            if (controller.device.length == 1 && controller.device[0] == device.getKey()) {
                                VirtualDeviceConfigSpec controllerSpec = new VirtualDeviceConfigSpec();
                                controllerSpec.setOperation(VirtualDeviceConfigSpecOperation.remove);
                                controllerSpec.setDevice(controller);
                                configSpecList.add(controllerSpec);
                            }
                            break;
                        }
                    }
                    // remove the Usb controller when we want to remove the usb device.
                    continue;
                }

                VirtualDeviceConfigSpec deviceSpec = new VirtualDeviceConfigSpec();
                deviceSpec.setOperation(VirtualDeviceConfigSpecOperation.remove);
                deviceSpec.setDevice(device);
                if (destroyDeviceBacking) {
                    deviceSpec.setFileOperation(VirtualDeviceConfigSpecFileOperation.destroy);
                }

                configSpecList.add(deviceSpec);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }

        if (!configSpecList.isEmpty()) {
            VirtualMachineConfigSpec config = new VirtualMachineConfigSpec();
            config.setDeviceChange(configSpecList);
            Task task = vm.reconfigVM(config);
            return task;
        }
        return null;
    }

    /**
     * Get all the virtual devices of a virtual machine
     *
     * @return VirtualDevice[]
     */
    public List<VirtualDevice> getAllVirtualDevices() {
        VirtualDevice[] devices = (VirtualDevice[]) vm.getPropertyByPath("config.hardware.device");
        return asNullSafeList(devices);
    }

    @SuppressWarnings("unchecked")
    public <T extends VirtualDevice> List<T> getVirtualDevicesOfType(Class<T> clazz) {
        List<T> result = new ArrayList<T>();

        List<VirtualDevice> devices = getAllVirtualDevices();

        for (VirtualDevice dev : devices) {
            if (clazz.isInstance(dev)) // dynamic equivalent of instanceof operator
            {
                result.add((T) dev);
            }
        }
        return result;
    }

    public VirtualDevice getDeviceByBackingFileName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name must not be null!");
        }

        List<VirtualDevice> devices = this.getAllVirtualDevices();

        for (VirtualDevice device : devices) {
            VirtualDeviceBackingInfo bi = device.getBacking();
            if (bi instanceof VirtualDeviceFileBackingInfo) {
                String fileName = ((VirtualDeviceFileBackingInfo) bi).getFileName();
                if (name.equals(fileName))
                    return device;
            }
        }
        return null;
    }

    public <T extends VirtualController> T getFirstAvailableController(Class<T> clazz) {
        VirtualController vc = createControllerInstance(clazz);
        int maxNodes = getMaxNodesPerControllerOfType(vc);

        for (T controller : getVirtualDevicesOfType(clazz)) {
            // Check if controller can accept addition of new devices.
            if (controller.device == null || controller.device.length < maxNodes) {
                return controller;
            }
        }
        return null;
    }

    private <T extends VirtualController> VirtualController createControllerInstance(Class<T> clazz) {
        VirtualController vc = null;
        try {
            vc = clazz.getConstructor().newInstance();
            //vc = (T) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            LOGGER.error("InstantiationError of {}", clazz.getSimpleName(), e);
        }
        return vc;
    }

    private static int getMaxNodesPerControllerOfType(VirtualController controller) {
        int count = 0;

        if (VirtualSCSIController.class.isInstance(controller)) {
            // The actual device nodes of SCSI controller are 16
            // but one of them is reserved for the controller itself
            // so this means that the maximum free nodes are 15.
            count = 16;
        } else if (VirtualIDEController.class.isInstance(controller)) {
            count = 2;
        } else {
            throw new RuntimeException("Unknown controller type - " + controller.getDeviceInfo().getLabel());
        }
        return count;
    }

    private boolean allSupportHotRemoval(List<VirtualDevice> devices) {
        for (VirtualDevice device : devices) {
            if (device instanceof VirtualUSB || device instanceof VirtualDisk)
                return true;
        }
        return false;
    }

    /**
     * Enumeration for all the possible network adapter types
     */
    @SuppressWarnings("unused")
    public static enum VirtualNetworkAdapterType {
        VirtualE1000("VirtualE1000"),
        VirtualPCNet32("VirtualPCNet32"),
        VirtualVmxnet("VirtualVmxnet"),
        VirtualVmxnet2("VirtualVmxnet2"),
        VirtualVmxnet3("VirtualVmxnet3"),
        Unknown("Unknown");

        private final String val;

        private VirtualNetworkAdapterType(String val) {
            this.val = val;
        }
    }

}
