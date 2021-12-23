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

/**
 * This data object provides information about the state of PciPassthru for all pci devices.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2
 * @since 4.0
 */
@SuppressWarnings("unused")
public class HostPciPassthruInfo extends DynamicData {

    private String id;
    private String dependentDevice;
    private boolean passthruEnabled;
    private boolean passthruCapable;
    private boolean passthruActive;
    private String hardwareLabel;

    @Override
    public String toString() {
        return "HostPciPassthruInfo{" +
                "id='" + id + '\'' +
                ", dependentDevice='" + dependentDevice + '\'' +
                ", passthruEnabled=" + passthruEnabled +
                ", passthruCapable=" + passthruCapable +
                ", passthruActive=" + passthruActive +
                ", hardwareLabel='" + hardwareLabel + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getDependentDevice() {
        return dependentDevice;
    }

    public void setDependentDevice(final String dependentDevice) {
        this.dependentDevice = dependentDevice;
    }

    public boolean isPassthruEnabled() {
        return passthruEnabled;
    }

    public void setPassthruEnabled(final boolean passthruEnabled) {
        this.passthruEnabled = passthruEnabled;
    }

    public boolean isPassthruCapable() {
        return passthruCapable;
    }

    public void setPassthruCapable(final boolean passthruCapable) {
        this.passthruCapable = passthruCapable;
    }

    public boolean isPassthruActive() {
        return passthruActive;
    }

    public void setPassthruActive(final boolean passthruActive) {
        this.passthruActive = passthruActive;
    }

    public String getHardwareLabel() {
        return hardwareLabel;
    }

    public void setHardwareLabel(final String hardwareLabel) {
        this.hardwareLabel = hardwareLabel;
    }

}
