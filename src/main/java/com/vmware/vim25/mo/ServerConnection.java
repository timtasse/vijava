/*================================================================================
Copyright (c) 2008 VMware, Inc. All Rights Reserved.

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

package com.vmware.vim25.mo;

import com.vmware.vim25.ws.VimStub;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * The class representing the connection to a server either VC server or ESX.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 */
public final class ServerConnection {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServerConnection.class);
    private final URL url;
    private ServiceInstance serviceInstance;
    private final VimStub vimService;
    private final AtomicBoolean loggedIn = new AtomicBoolean(true);

    public ServerConnection(final URL url, final VimStub vimService, final ServiceInstance serviceInstance) {
        this.url = url;
        this.vimService = vimService;
        this.serviceInstance = serviceInstance;
    }

    /**
     * Disconnect from the server and clean up
     */
    public void logout() {
        if (loggedIn.get()) {
            try {
                serviceInstance.getSessionManager().logout();
            } catch (final Exception e) {
                LOGGER.error("Failed to disconnect {}", this.url);
            } finally {
                this.loggedIn.set(false);
            }
        }
    }

    public ServiceInstance getServiceInstance() {
        if (!this.loggedIn.get()) {
            throw new IllegalStateException("Session is closed");
        }
        return serviceInstance;
    }

    void setServiceInstance(final ServiceInstance si) {
        this.serviceInstance = si;
    }

    public VimStub getVimService() {
        if (!this.loggedIn.get()) {
            throw new IllegalStateException("Session is closed");
        }
        return vimService;
    }

    public URL getUrl() {
        return url;
    }

}
