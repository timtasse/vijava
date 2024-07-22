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
import java.util.List;

/**
 * Runtime state of a virtual ethernet card device.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 * @since 4.1
 */
@SuppressWarnings("unused")
public class VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState extends VirtualMachineDeviceRuntimeInfoDeviceRuntimeState {

    /**
     * @deprecated As of vSphere API 8.0. VMDirectPath Gen 2 is no longer supported and there is no replacement.
     */
    @Deprecated
    private Boolean vmDirectPathGen2Active;
    /**
     * @deprecated As of vSphere API 8.0. VMDirectPath Gen 2 is no longer supported and there is no replacement.
     */
    @Deprecated
    private List<String> vmDirectPathGen2InactiveReasonVm;
    /**
     * @deprecated As of vSphere API 8.0. VMDirectPath Gen 2 is no longer supported and there is no replacement.
     */
    @Deprecated
    private List<String> vmDirectPathGen2InactiveReasonOther;
    /**
     * @deprecated As of vSphere API 8.0. VMDirectPath Gen 2 is no longer supported and there is no replacement.
     */
    @Deprecated
    private String vmDirectPathGen2InactiveReasonExtended;
    private Boolean uptv2Active;
    private List<String> uptv2InactiveReasonVm;
    private List<String> uptv2InactiveReasonOther;
    private ManagedEntityStatus reservationStatus;
    private ManagedEntityStatus attachmentStatus;
    private List<VirtualMachineFeatureRequirement> featureRequirement;

    @Override
    public String toString() {
        return "VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState{" +
                "vmDirectPathGen2Active=" + vmDirectPathGen2Active +
                ", vmDirectPathGen2InactiveReasonVm=" + vmDirectPathGen2InactiveReasonVm +
                ", vmDirectPathGen2InactiveReasonOther=" + vmDirectPathGen2InactiveReasonOther +
                ", vmDirectPathGen2InactiveReasonExtended='" + vmDirectPathGen2InactiveReasonExtended + '\'' +
                ", uptv2Active=" + uptv2Active +
                ", uptv2InactiveReasonVm=" + uptv2InactiveReasonVm +
                ", uptv2InactiveReasonOther=" + uptv2InactiveReasonOther +
                ", reservationStatus=" + reservationStatus +
                ", attachmentStatus=" + attachmentStatus +
                ", featureRequirement=" + featureRequirement +
                "} " + super.toString();
    }

    public Boolean getVmDirectPathGen2Active() {
        return vmDirectPathGen2Active;
    }

    public void setVmDirectPathGen2Active(final Boolean vmDirectPathGen2Active) {
        this.vmDirectPathGen2Active = vmDirectPathGen2Active;
    }

    public List<String> getVmDirectPathGen2InactiveReasonVm() {
        return vmDirectPathGen2InactiveReasonVm;
    }

    public void setVmDirectPathGen2InactiveReasonVm(final List<String> vmDirectPathGen2InactiveReasonVm) {
        this.vmDirectPathGen2InactiveReasonVm = vmDirectPathGen2InactiveReasonVm;
    }

    public List<String> getVmDirectPathGen2InactiveReasonOther() {
        return vmDirectPathGen2InactiveReasonOther;
    }

    public void setVmDirectPathGen2InactiveReasonOther(final List<String> vmDirectPathGen2InactiveReasonOther) {
        this.vmDirectPathGen2InactiveReasonOther = vmDirectPathGen2InactiveReasonOther;
    }

    public String getVmDirectPathGen2InactiveReasonExtended() {
        return vmDirectPathGen2InactiveReasonExtended;
    }

    public void setVmDirectPathGen2InactiveReasonExtended(final String vmDirectPathGen2InactiveReasonExtended) {
        this.vmDirectPathGen2InactiveReasonExtended = vmDirectPathGen2InactiveReasonExtended;
    }

    public Boolean getUptv2Active() {
        return uptv2Active;
    }

    public void setUptv2Active(final Boolean uptv2Active) {
        this.uptv2Active = uptv2Active;
    }

    public List<String> getUptv2InactiveReasonVm() {
        return uptv2InactiveReasonVm;
    }

    public void setUptv2InactiveReasonVm(final List<String> uptv2InactiveReasonVm) {
        this.uptv2InactiveReasonVm = uptv2InactiveReasonVm;
    }

    public List<String> getUptv2InactiveReasonOther() {
        return uptv2InactiveReasonOther;
    }

    public void setUptv2InactiveReasonOther(final List<String> uptv2InactiveReasonOther) {
        this.uptv2InactiveReasonOther = uptv2InactiveReasonOther;
    }

    public ManagedEntityStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(final ManagedEntityStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public ManagedEntityStatus getAttachmentStatus() {
        return attachmentStatus;
    }

    public void setAttachmentStatus(final ManagedEntityStatus attachmentStatus) {
        this.attachmentStatus = attachmentStatus;
    }

    public List<VirtualMachineFeatureRequirement> getFeatureRequirement() {
        return featureRequirement;
    }

    public void setFeatureRequirement(final List<VirtualMachineFeatureRequirement> featureRequirement) {
        this.featureRequirement = featureRequirement;
    }

}
