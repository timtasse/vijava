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
 * The VirtualDeviceConnectInfo data object type contains information about connectable virtual devices.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */

@SuppressWarnings("all")
public class VirtualDeviceConnectInfo extends DynamicData {

    private boolean allowGuestControl;
    private boolean connected;
    private String migrateConnect;
    private boolean startConnected;
    private String status;

    @Override
    public String toString() {
        return "VirtualDeviceConnectInfo{" +
                "allowGuestControl=" + allowGuestControl +
                ", connected=" + connected +
                ", migrateConnect='" + migrateConnect + '\'' +
                ", startConnected=" + startConnected +
                ", status='" + status + '\'' +
                "} " + super.toString();
    }

    public boolean isStartConnected() {
        return this.startConnected;
    }

    public void setStartConnected(boolean startConnected) {
        this.startConnected = startConnected;
    }

    public boolean isAllowGuestControl() {
        return this.allowGuestControl;
    }

    public void setAllowGuestControl(boolean allowGuestControl) {
        this.allowGuestControl = allowGuestControl;
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMigrateConnect() {
        return migrateConnect;
    }

    public void setMigrateConnect(final String migrateConnect) {
        this.migrateConnect = migrateConnect;
    }

}
