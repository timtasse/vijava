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
 * The OpaqueSwitch contains basic information about virtual switches that are managed by a management plane outside of vSphere.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.5
 */
@SuppressWarnings("all")
public class HostOpaqueSwitch extends DynamicData {

    private OptionValue[] extraConfig;
    private HostFeatureCapability[] featureCapability;
    private String key;
    private String name;
    private String[] pnic;
    private HostOpaqueSwitchPhysicalNicZone[] pnicZone;
    private String status;
    private HostVirtualNic[] vtep;

    @Override
    public String toString() {
        return "HostOpaqueSwitch{" +
                "extraConfig=" + Arrays.toString(extraConfig) +
                ", featureCapability=" + Arrays.toString(featureCapability) +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", pnic=" + Arrays.toString(pnic) +
                ", pnicZone=" + Arrays.toString(pnicZone) +
                ", status='" + status + '\'' +
                ", vtep=" + Arrays.toString(vtep) +
                "} " + super.toString();
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPnic() {
        return this.pnic;
    }

    public void setPnic(String[] pnic) {
        this.pnic = pnic;
    }

    public OptionValue[] getExtraConfig() {
        return extraConfig;
    }

    public void setExtraConfig(final OptionValue[] extraConfig) {
        this.extraConfig = extraConfig;
    }

    public HostOpaqueSwitchPhysicalNicZone[] getPnicZone() {
        return pnicZone;
    }

    public void setPnicZone(final HostOpaqueSwitchPhysicalNicZone[] pnicZone) {
        this.pnicZone = pnicZone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public HostVirtualNic[] getVtep() {
        return vtep;
    }

    public void setVtep(final HostVirtualNic[] vtep) {
        this.vtep = vtep;
    }

    public HostFeatureCapability[] getFeatureCapability() {
        return featureCapability;
    }

    public void setFeatureCapability(final HostFeatureCapability[] featureCapability) {
        this.featureCapability = featureCapability;
    }

}
