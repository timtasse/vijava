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
 * Policy specification that carries a pre-defined Storage Policy to be associated with a Virtual Machine Home or a Virtual Disk object.
 * Such a pre-defined policy can be either be vSphere Storage Administrator defined or may come from a set of pre-defined policies from Storage Vendor.
 * Neither the association nor the policy data is persisted in Virtual Machine configuration.
 * This data is managed by the an extension of Virtual Center (Storage Policy Based Management).
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 5.5
 */
@SuppressWarnings("all")
public class VirtualMachineDefinedProfileSpec extends VirtualMachineProfileSpec {

    private VirtualMachineProfileRawData profileData;
    private String profileId;
    private KeyValue[] profileParams;
    private ReplicationSpec replicationSpec;

    @Override
    public String toString() {
        return "VirtualMachineDefinedProfileSpec{" +
                "profileData=" + profileData +
                ", profileId='" + profileId + '\'' +
                ", profileParams=" + Arrays.toString(profileParams) +
                ", replicationSpec=" + replicationSpec +
                "} " + super.toString();
    }

    public String getProfileId() {
        return this.profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public VirtualMachineProfileRawData getProfileData() {
        return this.profileData;
    }

    public void setProfileData(VirtualMachineProfileRawData profileData) {
        this.profileData = profileData;
    }

    public ReplicationSpec getReplicationSpec() {
        return replicationSpec;
    }

    public void setReplicationSpec(final ReplicationSpec replicationSpec) {
        this.replicationSpec = replicationSpec;
    }

    public KeyValue[] getProfileParams() {
        return profileParams;
    }

    public void setProfileParams(final KeyValue[] profileParams) {
        this.profileParams = profileParams;
    }

}
