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

import java.util.List;

/**
 * The VirtualDeviceOption data object type contains information about a virtual device type,
 * the options for configuring the virtual device, and the relationship between this virtual device and other devices.
 * The vSphere API groups device configurations that are mutually exclusive into different configuration objects;
 * each of these configuration objects may define subtypes for virtual device backing options that are independent of the virtual device.
 * Backing-dependent options should appear in a subtype of VirtualDeviceBackingOption.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualDeviceOption extends DynamicData {

    private String type;
    private VirtualDeviceConnectOption connectOption;
    private VirtualDeviceBusSlotOption busSlotOption;
    private String controllerType;
    private BoolOption autoAssignController;
    private List<VirtualDeviceBackingOption> backingOption = List.of();
    private Integer defaultBackingOptionIndex;
    private List<String> licensingLimit = List.of();
    private boolean deprecated;
    private boolean plugAndPlay;
    private Boolean hotRemoveSupported;
    private Boolean numaSupported;

    @Override
    public String toString() {
        return "VirtualDeviceOption{" +
                "type='" + type + '\'' +
                ", connectOption=" + connectOption +
                ", busSlotOption=" + busSlotOption +
                ", controllerType='" + controllerType + '\'' +
                ", autoAssignController=" + autoAssignController +
                ", backingOption=" + backingOption +
                ", defaultBackingOptionIndex=" + defaultBackingOptionIndex +
                ", licensingLimit=" + licensingLimit +
                ", deprecated=" + deprecated +
                ", plugAndPlay=" + plugAndPlay +
                ", hotRemoveSupported=" + hotRemoveSupported +
                ", numaSupported=" + numaSupported +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public VirtualDeviceConnectOption getConnectOption() {
        return connectOption;
    }

    public void setConnectOption(final VirtualDeviceConnectOption connectOption) {
        this.connectOption = connectOption;
    }

    public VirtualDeviceBusSlotOption getBusSlotOption() {
        return busSlotOption;
    }

    public void setBusSlotOption(final VirtualDeviceBusSlotOption busSlotOption) {
        this.busSlotOption = busSlotOption;
    }

    public String getControllerType() {
        return controllerType;
    }

    public void setControllerType(final String controllerType) {
        this.controllerType = controllerType;
    }

    public BoolOption getAutoAssignController() {
        return autoAssignController;
    }

    public void setAutoAssignController(final BoolOption autoAssignController) {
        this.autoAssignController = autoAssignController;
    }

    public List<VirtualDeviceBackingOption> getBackingOption() {
        return backingOption;
    }

    public void setBackingOption(final List<VirtualDeviceBackingOption> backingOption) {
        this.backingOption = backingOption;
    }

    public Integer getDefaultBackingOptionIndex() {
        return defaultBackingOptionIndex;
    }

    public void setDefaultBackingOptionIndex(final Integer defaultBackingOptionIndex) {
        this.defaultBackingOptionIndex = defaultBackingOptionIndex;
    }

    public List<String> getLicensingLimit() {
        return licensingLimit;
    }

    public void setLicensingLimit(final List<String> licensingLimit) {
        this.licensingLimit = licensingLimit;
    }

    public boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(final boolean deprecated) {
        this.deprecated = deprecated;
    }

    public boolean isPlugAndPlay() {
        return plugAndPlay;
    }

    public void setPlugAndPlay(final boolean plugAndPlay) {
        this.plugAndPlay = plugAndPlay;
    }

    public Boolean getHotRemoveSupported() {
        return hotRemoveSupported;
    }

    public void setHotRemoveSupported(final Boolean hotRemoveSupported) {
        this.hotRemoveSupported = hotRemoveSupported;
    }

    public Boolean getNumaSupported() {
        return numaSupported;
    }

    public void setNumaSupported(final Boolean numaSupported) {
        this.numaSupported = numaSupported;
    }

}
