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
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.5
 */

@SuppressWarnings("all")
public class StoragePlacementAction extends ClusterAction {

    public ManagedObjectReference vm;
    public VirtualMachineRelocateSpec relocateSpec;
    public ManagedObjectReference destination;
    public Float spaceUtilBefore;
    public Float spaceUtilAfter;
    public Float ioLatencyBefore;
    public Float spaceDemandAfter;
    public Float spaceDemandBefore;

    public ManagedObjectReference getVm() {
        return this.vm;
    }

    public void setVm(ManagedObjectReference vm) {
        this.vm = vm;
    }

    public VirtualMachineRelocateSpec getRelocateSpec() {
        return this.relocateSpec;
    }

    public void setRelocateSpec(VirtualMachineRelocateSpec relocateSpec) {
        this.relocateSpec = relocateSpec;
    }

    public ManagedObjectReference getDestination() {
        return this.destination;
    }

    public void setDestination(ManagedObjectReference destination) {
        this.destination = destination;
    }

    public Float getSpaceUtilBefore() {
        return this.spaceUtilBefore;
    }

    public void setSpaceUtilBefore(Float spaceUtilBefore) {
        this.spaceUtilBefore = spaceUtilBefore;
    }

    public Float getSpaceUtilAfter() {
        return this.spaceUtilAfter;
    }

    public void setSpaceUtilAfter(Float spaceUtilAfter) {
        this.spaceUtilAfter = spaceUtilAfter;
    }

    public Float getIoLatencyBefore() {
        return this.ioLatencyBefore;
    }

    public void setIoLatencyBefore(Float ioLatencyBefore) {
        this.ioLatencyBefore = ioLatencyBefore;
    }

    public Float getSpaceDemandAfter() {
        return spaceDemandAfter;
    }

    public void setSpaceDemandAfter(final Float spaceDemandAfter) {
        this.spaceDemandAfter = spaceDemandAfter;
    }

    public Float getSpaceDemandBefore() {
        return spaceDemandBefore;
    }

    public void setSpaceDemandBefore(final Float spaceDemandBefore) {
        this.spaceDemandBefore = spaceDemandBefore;
    }
}