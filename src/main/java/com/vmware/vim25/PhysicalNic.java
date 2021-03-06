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
 * This data object type describes the physical network adapter as seen by the primary operating system.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 */
public class PhysicalNic extends DynamicData {

    private String key;
    private String device;
    private String pci;
    private String driver;
    private PhysicalNicLinkInfo linkSpeed;
    private PhysicalNicLinkInfo[] validLinkSpecification;
    private PhysicalNicSpec spec;
    private boolean wakeOnLanSupported;
    private String mac;
    private FcoeConfig fcoeConfiguration;
    private Boolean vmDirectPathGen2Supported;
    private String vmDirectPathGen2SupportedMode;
    private Boolean resourcePoolSchedulerAllowed;
    private String[] resourcePoolSchedulerDisallowedReason;
    private Boolean autoNegotiateSupported;
    private Boolean enhancedNetworkingStackSupported;
    private Boolean ensInterruptSupported;
    private String rdmaDevice;

    @Override
    public String toString() {
        return "PhysicalNic{" +
                "key='" + key + '\'' +
                ", device='" + device + '\'' +
                ", pci='" + pci + '\'' +
                ", driver='" + driver + '\'' +
                ", linkSpeed=" + linkSpeed +
                ", validLinkSpecification=" + Arrays.toString(validLinkSpecification) +
                ", spec=" + spec +
                ", wakeOnLanSupported=" + wakeOnLanSupported +
                ", mac='" + mac + '\'' +
                ", fcoeConfiguration=" + fcoeConfiguration +
                ", vmDirectPathGen2Supported=" + vmDirectPathGen2Supported +
                ", vmDirectPathGen2SupportedMode='" + vmDirectPathGen2SupportedMode + '\'' +
                ", resourcePoolSchedulerAllowed=" + resourcePoolSchedulerAllowed +
                ", resourcePoolSchedulerDisallowedReason=" + Arrays.toString(resourcePoolSchedulerDisallowedReason) +
                ", autoNegotiateSupported=" + autoNegotiateSupported +
                ", enhancedNetworkingStackSupported=" + enhancedNetworkingStackSupported +
                ", ensInterruptSupported=" + ensInterruptSupported +
                ", rdmaDevice='" + rdmaDevice + '\'' +
                "} " + super.toString();
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDevice() {
        return this.device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getPci() {
        return this.pci;
    }

    public void setPci(String pci) {
        this.pci = pci;
    }

    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public PhysicalNicLinkInfo getLinkSpeed() {
        return this.linkSpeed;
    }

    public void setLinkSpeed(PhysicalNicLinkInfo linkSpeed) {
        this.linkSpeed = linkSpeed;
    }

    public PhysicalNicLinkInfo[] getValidLinkSpecification() {
        return this.validLinkSpecification;
    }

    public void setValidLinkSpecification(PhysicalNicLinkInfo[] validLinkSpecification) {
        this.validLinkSpecification = validLinkSpecification;
    }

    public PhysicalNicSpec getSpec() {
        return this.spec;
    }

    public void setSpec(PhysicalNicSpec spec) {
        this.spec = spec;
    }

    public boolean isWakeOnLanSupported() {
        return this.wakeOnLanSupported;
    }

    public void setWakeOnLanSupported(boolean wakeOnLanSupported) {
        this.wakeOnLanSupported = wakeOnLanSupported;
    }

    public String getMac() {
        return this.mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public FcoeConfig getFcoeConfiguration() {
        return this.fcoeConfiguration;
    }

    public void setFcoeConfiguration(FcoeConfig fcoeConfiguration) {
        this.fcoeConfiguration = fcoeConfiguration;
    }

    public Boolean getVmDirectPathGen2Supported() {
        return this.vmDirectPathGen2Supported;
    }

    public void setVmDirectPathGen2Supported(Boolean vmDirectPathGen2Supported) {
        this.vmDirectPathGen2Supported = vmDirectPathGen2Supported;
    }

    public String getVmDirectPathGen2SupportedMode() {
        return this.vmDirectPathGen2SupportedMode;
    }

    public void setVmDirectPathGen2SupportedMode(String vmDirectPathGen2SupportedMode) {
        this.vmDirectPathGen2SupportedMode = vmDirectPathGen2SupportedMode;
    }

    public Boolean getResourcePoolSchedulerAllowed() {
        return this.resourcePoolSchedulerAllowed;
    }

    public void setResourcePoolSchedulerAllowed(Boolean resourcePoolSchedulerAllowed) {
        this.resourcePoolSchedulerAllowed = resourcePoolSchedulerAllowed;
    }

    public String[] getResourcePoolSchedulerDisallowedReason() {
        return this.resourcePoolSchedulerDisallowedReason;
    }

    public void setResourcePoolSchedulerDisallowedReason(String[] resourcePoolSchedulerDisallowedReason) {
        this.resourcePoolSchedulerDisallowedReason = resourcePoolSchedulerDisallowedReason;
    }

    public Boolean getAutoNegotiateSupported() {
        return this.autoNegotiateSupported;
    }

    public void setAutoNegotiateSupported(Boolean autoNegotiateSupported) {
        this.autoNegotiateSupported = autoNegotiateSupported;
    }

    public Boolean getEnhancedNetworkingStackSupported() {
        return enhancedNetworkingStackSupported;
    }

    public void setEnhancedNetworkingStackSupported(final Boolean enhancedNetworkingStackSupported) {
        this.enhancedNetworkingStackSupported = enhancedNetworkingStackSupported;
    }

    public Boolean getEnsInterruptSupported() {
        return ensInterruptSupported;
    }

    public void setEnsInterruptSupported(final Boolean ensInterruptSupported) {
        this.ensInterruptSupported = ensInterruptSupported;
    }

    public String getRdmaDevice() {
        return rdmaDevice;
    }

    public void setRdmaDevice(final String rdmaDevice) {
        this.rdmaDevice = rdmaDevice;
    }

}
