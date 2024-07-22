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
 * Specification for a virtual machine cloning operation.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualMachineCloneSpec extends DynamicData {

    private VirtualMachineRelocateSpec location;
    private boolean template;
    private VirtualMachineConfigSpec config;
    private CustomizationSpec customization;
    private boolean powerOn;
    private ManagedObjectReference snapshot;
    private Boolean memory;
    private String tpmProvisionPolicy;

    @Override
    public String toString() {
        return "VirtualMachineCloneSpec{" +
                "location=" + location +
                ", template=" + template +
                ", config=" + config +
                ", customization=" + customization +
                ", powerOn=" + powerOn +
                ", snapshot=" + snapshot +
                ", memory=" + memory +
                ", tpmProvisionPolicy='" + tpmProvisionPolicy + '\'' +
                '}';
    }

    public VirtualMachineRelocateSpec getLocation() {
        return location;
    }

    public void setLocation(final VirtualMachineRelocateSpec location) {
        this.location = location;
    }

    public boolean isTemplate() {
        return template;
    }

    public void setTemplate(final boolean template) {
        this.template = template;
    }

    public VirtualMachineConfigSpec getConfig() {
        return config;
    }

    public void setConfig(final VirtualMachineConfigSpec config) {
        this.config = config;
    }

    public CustomizationSpec getCustomization() {
        return customization;
    }

    public void setCustomization(final CustomizationSpec customization) {
        this.customization = customization;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(final boolean powerOn) {
        this.powerOn = powerOn;
    }

    public ManagedObjectReference getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(final ManagedObjectReference snapshot) {
        this.snapshot = snapshot;
    }

    public Boolean getMemory() {
        return memory;
    }

    public void setMemory(final Boolean memory) {
        this.memory = memory;
    }

    public String getTpmProvisionPolicy() {
        return tpmProvisionPolicy;
    }

    public void setTpmProvisionPolicy(final String tpmProvisionPolicy) {
        this.tpmProvisionPolicy = tpmProvisionPolicy;
    }

}
