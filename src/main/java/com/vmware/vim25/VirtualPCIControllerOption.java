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
 * This data object type contains the options for a virtual PCI Controller.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */
@SuppressWarnings("all")
public class VirtualPCIControllerOption extends VirtualControllerOption {

    private IntOption numSCSIControllers;
    private IntOption numEthernetCards;
    private IntOption numVideoCards;
    private IntOption numSoundCards;
    private IntOption numVmiRoms;
    private IntOption numVmciDevices;
    private IntOption numPCIPassthroughDevices;
    private IntOption numSasSCSIControllers;
    private IntOption numVmxnet3EthernetCards;
    private IntOption numParaVirtualSCSIControllers;
    private IntOption numSATAControllers;
    private IntOption numNVMEControllers;
    private IntOption numVmxnet3VrdmaEthernetCards;

    @Override
    public String toString() {
        return "VirtualPCIControllerOption{" +
                "numEthernetCards=" + numEthernetCards +
                ", numNVMEControllers=" + numNVMEControllers +
                ", numParaVirtualSCSIControllers=" + numParaVirtualSCSIControllers +
                ", numPCIPassthroughDevices=" + numPCIPassthroughDevices +
                ", numSasSCSIControllers=" + numSasSCSIControllers +
                ", numSATAControllers=" + numSATAControllers +
                ", numSCSIControllers=" + numSCSIControllers +
                ", numSoundCards=" + numSoundCards +
                ", numVideoCards=" + numVideoCards +
                ", numVmciDevices=" + numVmciDevices +
                ", numVmiRoms=" + numVmiRoms +
                ", numVmxnet3EthernetCards=" + numVmxnet3EthernetCards +
                ", numVmxnet3VrdmaEthernetCards=" + numVmxnet3VrdmaEthernetCards +
                "} " + super.toString();
    }

    public IntOption getNumSCSIControllers() {
        return this.numSCSIControllers;
    }

    public void setNumSCSIControllers(IntOption numSCSIControllers) {
        this.numSCSIControllers = numSCSIControllers;
    }

    public IntOption getNumEthernetCards() {
        return this.numEthernetCards;
    }

    public void setNumEthernetCards(IntOption numEthernetCards) {
        this.numEthernetCards = numEthernetCards;
    }

    public IntOption getNumVideoCards() {
        return this.numVideoCards;
    }

    public void setNumVideoCards(IntOption numVideoCards) {
        this.numVideoCards = numVideoCards;
    }

    public IntOption getNumSoundCards() {
        return this.numSoundCards;
    }

    public void setNumSoundCards(IntOption numSoundCards) {
        this.numSoundCards = numSoundCards;
    }

    public IntOption getNumVmiRoms() {
        return this.numVmiRoms;
    }

    public void setNumVmiRoms(IntOption numVmiRoms) {
        this.numVmiRoms = numVmiRoms;
    }

    public IntOption getNumVmciDevices() {
        return this.numVmciDevices;
    }

    public void setNumVmciDevices(IntOption numVmciDevices) {
        this.numVmciDevices = numVmciDevices;
    }

    public IntOption getNumPCIPassthroughDevices() {
        return this.numPCIPassthroughDevices;
    }

    public void setNumPCIPassthroughDevices(IntOption numPCIPassthroughDevices) {
        this.numPCIPassthroughDevices = numPCIPassthroughDevices;
    }

    public IntOption getNumSasSCSIControllers() {
        return this.numSasSCSIControllers;
    }

    public void setNumSasSCSIControllers(IntOption numSasSCSIControllers) {
        this.numSasSCSIControllers = numSasSCSIControllers;
    }

    public IntOption getNumVmxnet3EthernetCards() {
        return this.numVmxnet3EthernetCards;
    }

    public void setNumVmxnet3EthernetCards(IntOption numVmxnet3EthernetCards) {
        this.numVmxnet3EthernetCards = numVmxnet3EthernetCards;
    }

    public IntOption getNumParaVirtualSCSIControllers() {
        return this.numParaVirtualSCSIControllers;
    }

    public void setNumParaVirtualSCSIControllers(IntOption numParaVirtualSCSIControllers) {
        this.numParaVirtualSCSIControllers = numParaVirtualSCSIControllers;
    }

    public IntOption getNumSATAControllers() {
        return this.numSATAControllers;
    }

    public void setNumSATAControllers(IntOption numSATAControllers) {
        this.numSATAControllers = numSATAControllers;
    }

    public IntOption getNumNVMEControllers() {
        return numNVMEControllers;
    }

    public void setNumNVMEControllers(final IntOption numNVMEControllers) {
        this.numNVMEControllers = numNVMEControllers;
    }

    public IntOption getNumVmxnet3VrdmaEthernetCards() {
        return numVmxnet3VrdmaEthernetCards;
    }

    public void setNumVmxnet3VrdmaEthernetCards(final IntOption numVmxnet3VrdmaEthernetCards) {
        this.numVmxnet3VrdmaEthernetCards = numVmxnet3VrdmaEthernetCards;
    }

}
