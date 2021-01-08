/*================================================================================
Copyright (c) 2013 Steve Jin. All Rights Reserved.

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

package com.vmware.vim25;

import java.util.Arrays;

/**
 * This configuration data object type contains information about the execution environment for a virtual machine.
 * This includes information about which features are supported, such as:
 * Which guest operating systems are supported.
 * How devices are emulated. For example, that a CD-ROM drive can be emulated with a file or that a serial port can be emulated with a pipe.
 * VirtualCenter can provide a broader environment than any single physical host.
 * This is a departure from traditional virtualization approaches, which rely on the host system to define the environment for virtual machines.
 * This data object describes environment capabilities and is used by VirtualCenter to choose hosts on which to run virtual machines.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */

@SuppressWarnings("all")
public class VirtualMachineConfigOption extends DynamicData {

    private VirtualMachineCapability capabilities;
    private DatastoreOption datastore;
    private VirtualDevice[] defaultDevice;
    private String description;
    private int guestOSDefaultIndex;
    private GuestOsDescriptor[] guestOSDescriptor;
    private VirtualHardwareOption hardwareOptions;
    private VirtualMachinePropertyRelation[] propertyRelations;
    private String[] supportedMonitorType;
    private String[] supportedOvfEnvironmentTransport;
    private String[] supportedOvfInstallTransport;
    private String version;

    @Override
    public String toString() {
        return "VirtualMachineConfigOption{" +
                "capabilities=" + capabilities +
                ", datastore=" + datastore +
                ", defaultDevice=" + Arrays.toString(defaultDevice) +
                ", description='" + description + '\'' +
                ", guestOSDefaultIndex=" + guestOSDefaultIndex +
                ", guestOSDescriptor=" + Arrays.toString(guestOSDescriptor) +
                ", hardwareOptions=" + hardwareOptions +
                ", propertyRelations=" + Arrays.toString(propertyRelations) +
                ", supportedMonitorType=" + Arrays.toString(supportedMonitorType) +
                ", supportedOvfEnvironmentTransport=" + Arrays.toString(supportedOvfEnvironmentTransport) +
                ", supportedOvfInstallTransport=" + Arrays.toString(supportedOvfInstallTransport) +
                ", version='" + version + '\'' +
                "} " + super.toString();
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GuestOsDescriptor[] getGuestOSDescriptor() {
        return this.guestOSDescriptor;
    }

    public void setGuestOSDescriptor(GuestOsDescriptor[] guestOSDescriptor) {
        this.guestOSDescriptor = guestOSDescriptor;
    }

    public int getGuestOSDefaultIndex() {
        return this.guestOSDefaultIndex;
    }

    public void setGuestOSDefaultIndex(int guestOSDefaultIndex) {
        this.guestOSDefaultIndex = guestOSDefaultIndex;
    }

    public VirtualHardwareOption getHardwareOptions() {
        return this.hardwareOptions;
    }

    public void setHardwareOptions(VirtualHardwareOption hardwareOptions) {
        this.hardwareOptions = hardwareOptions;
    }

    public VirtualMachineCapability getCapabilities() {
        return this.capabilities;
    }

    public void setCapabilities(VirtualMachineCapability capabilities) {
        this.capabilities = capabilities;
    }

    public DatastoreOption getDatastore() {
        return this.datastore;
    }

    public void setDatastore(DatastoreOption datastore) {
        this.datastore = datastore;
    }

    public VirtualDevice[] getDefaultDevice() {
        return this.defaultDevice;
    }

    public void setDefaultDevice(VirtualDevice[] defaultDevice) {
        this.defaultDevice = defaultDevice;
    }

    public String[] getSupportedMonitorType() {
        return this.supportedMonitorType;
    }

    public void setSupportedMonitorType(String[] supportedMonitorType) {
        this.supportedMonitorType = supportedMonitorType;
    }

    public String[] getSupportedOvfEnvironmentTransport() {
        return this.supportedOvfEnvironmentTransport;
    }

    public void setSupportedOvfEnvironmentTransport(String[] supportedOvfEnvironmentTransport) {
        this.supportedOvfEnvironmentTransport = supportedOvfEnvironmentTransport;
    }

    public String[] getSupportedOvfInstallTransport() {
        return this.supportedOvfInstallTransport;
    }

    public void setSupportedOvfInstallTransport(String[] supportedOvfInstallTransport) {
        this.supportedOvfInstallTransport = supportedOvfInstallTransport;
    }

    public VirtualMachinePropertyRelation[] getPropertyRelations() {
        return propertyRelations;
    }

    public void setPropertyRelations(final VirtualMachinePropertyRelation[] propertyRelations) {
        this.propertyRelations = propertyRelations;
    }

}
