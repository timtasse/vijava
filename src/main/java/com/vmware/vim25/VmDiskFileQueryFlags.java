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
public class VmDiskFileQueryFlags extends DynamicData {

    public boolean capacityKb;
    public Boolean controllerType;
    public Boolean diskExtents;
    public boolean diskType;
    public Boolean encryption;
    public boolean hardwareVersion;
    public Boolean thin;

    public boolean isDiskType() {
        return this.diskType;
    }

    public void setDiskType(boolean diskType) {
        this.diskType = diskType;
    }

    public boolean isCapacityKb() {
        return this.capacityKb;
    }

    public void setCapacityKb(boolean capacityKb) {
        this.capacityKb = capacityKb;
    }

    public boolean isHardwareVersion() {
        return this.hardwareVersion;
    }

    public void setHardwareVersion(boolean hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public boolean isControllerType() {
        return controllerType;
    }

    public void setControllerType(boolean controllerType) {
        this.controllerType = controllerType;
    }

    public boolean isDiskExtents() {
        return diskExtents;
    }

    public void setDiskExtents(boolean diskExtents) {
        this.diskExtents = diskExtents;
    }

    public boolean isEncryption() {
        return encryption;
    }

    public void setEncryption(final boolean encryption) {
        this.encryption = encryption;
    }

    public boolean isThin() {
        return thin;
    }

    public void setThin(boolean thin) {
        this.thin = thin;
    }
}