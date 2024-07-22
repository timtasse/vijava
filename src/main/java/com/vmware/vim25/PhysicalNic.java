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
 * This data object type describes the physical network adapter as seen by the primary operating system.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
@SuppressWarnings("unused")
public class PhysicalNic extends DynamicData {

    private String key;
    private String device;
    private String pci;
    private String driver;
    private String driverVersion;
    private String firmwareVersion;
    private PhysicalNicLinkInfo linkSpeed;
    private List<PhysicalNicLinkInfo> validLinkSpecification;
    private PhysicalNicSpec spec;
    private boolean wakeOnLanSupported;
    private String mac;
    private FcoeConfig fcoeConfiguration;
    private Boolean vmDirectPathGen2Supported;
    private String vmDirectPathGen2SupportedMode;
    private Boolean resourcePoolSchedulerAllowed;
    private List<PhysicalNicResourcePoolSchedulerDisallowedReason> resourcePoolSchedulerDisallowedReason;
    private Boolean autoNegotiateSupported;
    private Boolean enhancedNetworkingStackSupported;
    private Boolean ensInterruptSupported;
    private String rdmaDevice;
    private String dpuId;

    @Override
    public String toString() {
        return "PhysicalNic{" +
                "key='" + key + '\'' +
                ", device='" + device + '\'' +
                ", pci='" + pci + '\'' +
                ", driver='" + driver + '\'' +
                ", driverVersion='" + driverVersion + '\'' +
                ", firmwareVersion='" + firmwareVersion + '\'' +
                ", linkSpeed=" + linkSpeed +
                ", validLinkSpecification=" + validLinkSpecification +
                ", spec=" + spec +
                ", wakeOnLanSupported=" + wakeOnLanSupported +
                ", mac='" + mac + '\'' +
                ", fcoeConfiguration=" + fcoeConfiguration +
                ", vmDirectPathGen2Supported=" + vmDirectPathGen2Supported +
                ", vmDirectPathGen2SupportedMode='" + vmDirectPathGen2SupportedMode + '\'' +
                ", resourcePoolSchedulerAllowed=" + resourcePoolSchedulerAllowed +
                ", resourcePoolSchedulerDisallowedReason=" + resourcePoolSchedulerDisallowedReason +
                ", autoNegotiateSupported=" + autoNegotiateSupported +
                ", enhancedNetworkingStackSupported=" + enhancedNetworkingStackSupported +
                ", ensInterruptSupported=" + ensInterruptSupported +
                ", rdmaDevice='" + rdmaDevice + '\'' +
                ", dpuId='" + dpuId + '\'' +
                '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(final String device) {
        this.device = device;
    }

    public String getPci() {
        return pci;
    }

    public void setPci(final String pci) {
        this.pci = pci;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
    }

    public String getDriverVersion() {
        return driverVersion;
    }

    public void setDriverVersion(final String driverVersion) {
        this.driverVersion = driverVersion;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(final String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public PhysicalNicLinkInfo getLinkSpeed() {
        return linkSpeed;
    }

    public void setLinkSpeed(final PhysicalNicLinkInfo linkSpeed) {
        this.linkSpeed = linkSpeed;
    }

    public List<PhysicalNicLinkInfo> getValidLinkSpecification() {
        return validLinkSpecification;
    }

    public void setValidLinkSpecification(final List<PhysicalNicLinkInfo> validLinkSpecification) {
        this.validLinkSpecification = validLinkSpecification;
    }

    public PhysicalNicSpec getSpec() {
        return spec;
    }

    public void setSpec(final PhysicalNicSpec spec) {
        this.spec = spec;
    }

    public boolean isWakeOnLanSupported() {
        return wakeOnLanSupported;
    }

    public void setWakeOnLanSupported(final boolean wakeOnLanSupported) {
        this.wakeOnLanSupported = wakeOnLanSupported;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(final String mac) {
        this.mac = mac;
    }

    public FcoeConfig getFcoeConfiguration() {
        return fcoeConfiguration;
    }

    public void setFcoeConfiguration(final FcoeConfig fcoeConfiguration) {
        this.fcoeConfiguration = fcoeConfiguration;
    }

    public Boolean getVmDirectPathGen2Supported() {
        return vmDirectPathGen2Supported;
    }

    public void setVmDirectPathGen2Supported(final Boolean vmDirectPathGen2Supported) {
        this.vmDirectPathGen2Supported = vmDirectPathGen2Supported;
    }

    public String getVmDirectPathGen2SupportedMode() {
        return vmDirectPathGen2SupportedMode;
    }

    public void setVmDirectPathGen2SupportedMode(final String vmDirectPathGen2SupportedMode) {
        this.vmDirectPathGen2SupportedMode = vmDirectPathGen2SupportedMode;
    }

    public Boolean getResourcePoolSchedulerAllowed() {
        return resourcePoolSchedulerAllowed;
    }

    public void setResourcePoolSchedulerAllowed(final Boolean resourcePoolSchedulerAllowed) {
        this.resourcePoolSchedulerAllowed = resourcePoolSchedulerAllowed;
    }

    public List<PhysicalNicResourcePoolSchedulerDisallowedReason> getResourcePoolSchedulerDisallowedReason() {
        return resourcePoolSchedulerDisallowedReason;
    }

    public void setResourcePoolSchedulerDisallowedReason(final List<PhysicalNicResourcePoolSchedulerDisallowedReason> resourcePoolSchedulerDisallowedReason) {
        this.resourcePoolSchedulerDisallowedReason = resourcePoolSchedulerDisallowedReason;
    }

    public Boolean getAutoNegotiateSupported() {
        return autoNegotiateSupported;
    }

    public void setAutoNegotiateSupported(final Boolean autoNegotiateSupported) {
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

    public String getDpuId() {
        return dpuId;
    }

    public void setDpuId(final String dpuId) {
        this.dpuId = dpuId;
    }

}
