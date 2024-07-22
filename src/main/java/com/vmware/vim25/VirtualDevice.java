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
 * VirtualDevice is the base data object type for devices in a virtual machine.
 * This type contains enough information about a virtual device to allow clients to display devices they do not recognize.
 * For example, a client with an older version than the server to which it connects may see a device without knowing what it is.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 5.1
 */
@SuppressWarnings("unused")
public class VirtualDevice extends DynamicData {

    private int key;
    private Description deviceInfo;
    private VirtualDeviceBackingInfo backing;
    private VirtualDeviceConnectInfo connectable;
    private VirtualDeviceBusSlotInfo slotInfo;
    private Integer controllerKey;
    private Integer unitNumber;
    private Integer numaNode;
    private VirtualDeviceDeviceGroupInfo deviceGroupInfo;

    @Override
    public String toString() {
        return "VirtualDevice{" +
                "key=" + key +
                ", deviceInfo=" + deviceInfo +
                ", backing=" + backing +
                ", connectable=" + connectable +
                ", slotInfo=" + slotInfo +
                ", controllerKey=" + controllerKey +
                ", unitNumber=" + unitNumber +
                ", numaNode=" + numaNode +
                ", deviceGroupInfo=" + deviceGroupInfo +
                '}';
    }

    public int getKey() {
        return key;
    }

    public void setKey(final int key) {
        this.key = key;
    }

    public Description getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(final Description deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public VirtualDeviceBackingInfo getBacking() {
        return backing;
    }

    public void setBacking(final VirtualDeviceBackingInfo backing) {
        this.backing = backing;
    }

    public VirtualDeviceConnectInfo getConnectable() {
        return connectable;
    }

    public void setConnectable(final VirtualDeviceConnectInfo connectable) {
        this.connectable = connectable;
    }

    public VirtualDeviceBusSlotInfo getSlotInfo() {
        return slotInfo;
    }

    public void setSlotInfo(final VirtualDeviceBusSlotInfo slotInfo) {
        this.slotInfo = slotInfo;
    }

    public Integer getControllerKey() {
        return controllerKey;
    }

    public void setControllerKey(final Integer controllerKey) {
        this.controllerKey = controllerKey;
    }

    public Integer getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(final Integer unitNumber) {
        this.unitNumber = unitNumber;
    }

    public Integer getNumaNode() {
        return numaNode;
    }

    public void setNumaNode(final Integer numaNode) {
        this.numaNode = numaNode;
    }

    public VirtualDeviceDeviceGroupInfo getDeviceGroupInfo() {
        return deviceGroupInfo;
    }

    public void setDeviceGroupInfo(final VirtualDeviceDeviceGroupInfo deviceGroupInfo) {
        this.deviceGroupInfo = deviceGroupInfo;
    }

}
