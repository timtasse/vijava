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
 * The VsanHostConfigInfo data object contains host-specific settings for the VSAN service.
 * This data object is used both for specifying settings for updating the VSAN service,
 * and as an output datatype when retrieving current VSAN service settings.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
public class VsanHostConfigInfo extends DynamicData {

    private Boolean enabled;
    private ManagedObjectReference hostSystem;
    private VsanHostConfigInfoClusterInfo clusterInfo;
    private VsanHostConfigInfoStorageInfo storageInfo;
    private VsanHostConfigInfoNetworkInfo networkInfo;
    private VsanHostFaultDomainInfo faultDomainInfo;
    private Boolean vsanEsaEnabled;

    @Override
    public String toString() {
        return "VsanHostConfigInfo{" +
                "enabled=" + enabled +
                ", hostSystem=" + hostSystem +
                ", clusterInfo=" + clusterInfo +
                ", storageInfo=" + storageInfo +
                ", networkInfo=" + networkInfo +
                ", faultDomainInfo=" + faultDomainInfo +
                ", vsanEsaEnabled=" + vsanEsaEnabled +
                '}';
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public ManagedObjectReference getHostSystem() {
        return hostSystem;
    }

    public void setHostSystem(final ManagedObjectReference hostSystem) {
        this.hostSystem = hostSystem;
    }

    public VsanHostConfigInfoClusterInfo getClusterInfo() {
        return clusterInfo;
    }

    public void setClusterInfo(final VsanHostConfigInfoClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
    }

    public VsanHostConfigInfoStorageInfo getStorageInfo() {
        return storageInfo;
    }

    public void setStorageInfo(final VsanHostConfigInfoStorageInfo storageInfo) {
        this.storageInfo = storageInfo;
    }

    public VsanHostConfigInfoNetworkInfo getNetworkInfo() {
        return networkInfo;
    }

    public void setNetworkInfo(final VsanHostConfigInfoNetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
    }

    public VsanHostFaultDomainInfo getFaultDomainInfo() {
        return faultDomainInfo;
    }

    public void setFaultDomainInfo(final VsanHostFaultDomainInfo faultDomainInfo) {
        this.faultDomainInfo = faultDomainInfo;
    }

    public Boolean getVsanEsaEnabled() {
        return vsanEsaEnabled;
    }

    public void setVsanEsaEnabled(final Boolean vsanEsaEnabled) {
        this.vsanEsaEnabled = vsanEsaEnabled;
    }

}
