/*================================================================================
Copyright (c) 2012 Steve Jin. All Rights Reserved.
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

import com.vmware.vim25.*;
import com.vmware.vim25.mo.util.MorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * The managed object class corresponding to the one defined in VI SDK API
 * reference.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 */
@SuppressWarnings("unused")
public class ExtensionManager extends ManagedObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExtensionManager.class);

    public ExtensionManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    /**
     * Retrieve all the registered plugins objects
     *
     * @return An array of extension objects. If no extension found, an empty
     * array is returned.
     */

    public Extension[] getExtensionList() {
        return (Extension[]) getCurrentProperty("extensionList");
    }

    /**
     * @since SDK5.1
     */
    public ExtensionManagerIpAllocationUsage[] queryExtensionIpAllocationUsage(final String[] extensionKeys) throws RuntimeFault, RemoteException {
        return getVimService().queryExtensionIpAllocationUsage(getMOR(), extensionKeys);
    }

    /**
     * @since SDK4.0
     */
    public void setExtensionCertificate(final String extensionKey, final String certificatePem) throws NotFound, NoClientCertificate, RuntimeFault, RemoteException {
        getVimService().setExtensionCertificate(getMOR(), extensionKey, certificatePem);
    }

    /**
     * @since SDK5.0
     */
    public ManagedEntity[] queryManagedBy(final String extensionKey) throws RuntimeFault, RemoteException {
        final ManagedObjectReference[] mors = getVimService().queryManagedBy(getMOR(), extensionKey);
        return MorUtil.createManagedEntities(getServerConnection(), mors);
    }

    public void setPublicKey(final String extensionKey, final String publicKey) throws RuntimeFault, RemoteException {
        getVimService().setPublicKey(getMOR(), extensionKey, publicKey);
    }

    /**
     * Un-register an existing plugin If <code>keyStr</code> is null then a
     * <code>NullPointerException</code> is thrown.
     *
     * @param keyStr The unique key of the plugin
     * @throws RemoteException
     * @throws RuntimeFault
     * @throws NotFound        either because of the web service itself, or because of the
     *                         service provider unable to handle the request.
     */
    public void unregisterExtension(final String keyStr) throws NotFound, RuntimeFault, RemoteException {
        if (keyStr == null) {
            throw new NullPointerException();
        }
        getVimService().unregisterExtension(getMOR(), keyStr);
    }

    /**
     * Update an existing plugin with modified information If
     * <code>extension</code> is null then a <code>NullPointerException</code> is
     * thrown.
     *
     * @param extension The extension object with updated information
     * @throws RemoteException
     * @throws RuntimeFault
     * @throws NotFound        either because of the web service itself, or because of the
     *                         service provider unable to handle the request.
     */
    public void updateExtension(final Extension extension) throws NotFound, RuntimeFault, RemoteException {
        if (extension == null) {
            throw new NullPointerException();
        }

        encodeUrl(extension);

        getVimService().updateExtension(getMOR(), extension);
    }

    /**
     * Register a new plugin If <code>extension</code> is null then a
     * <code>NullPointerException</code> is thrown.
     *
     * @param extension The extension object to be registered
     * @throws RemoteException
     * @throws RuntimeFault    either because of the web service itself, or because of the
     *                         service provider unable to handle the request.
     */
    public void registerExtension(final Extension extension) throws RuntimeFault, RemoteException {
        if (extension == null) {
            throw new NullPointerException();
        }
        encodeUrl(extension);
        getVimService().registerExtension(getMOR(), extension);
    }

    /**
     * Find the extension based on the unique key of the plugin If
     * <code>keyStr</code> is null then a <code>NullPointerException</code>
     *
     * @param keyStr The unique key for the plugin
     * @return The extension object found with the unique key
     * @throws RemoteException
     * @throws RuntimeFault
     * @throws RemoteException if something is wrong with web service call, either because of
     *                         the web service itself, or because of the service provider unable
     *                         to handle the request.
     */
    public Extension findExtension(final String keyStr) throws RuntimeFault, RemoteException {
        if (keyStr == null) {
            throw new NullPointerException();
        }
        return getVimService().findExtension(getMOR(), keyStr);
    }

    private void encodeUrl(final Extension extension) {
        // replace all the & in the url with &amp;
        for (int i = 0; extension.client != null && i < extension.client.length; i++) {
            final ExtensionClientInfo eci = extension.client[i];
            if (eci.url.contains("&")) {
                eci.url = eci.url.replace("&", "&amp;");
            }
        }
        for (int i = 0; extension.server != null && i < extension.server.length; i++) {
            final ExtensionServerInfo esi = extension.server[i];
            if (esi.url.contains("&")) {
                esi.url = esi.url.replace("&", "&amp;");
            }
        }
    }

    /**
     * Print out information of all the plugins to LOGGER
     *
     * @throws RemoteException if something is wrong with web service call, either because of
     *                         the web service itself, or because of the service provider unable
     *                         to handle the request.
     * @deprecated
     */
    public void printAllExtensions() {
        final Extension[] exts = getExtensionList();
        if (exts == null) {
            LOGGER.info("there are no plugins registered");
            return;
        }
        LOGGER.info("There are totally {} plugin(s) registered.", exts.length);

        for (int i = 0; i < exts.length; i++) {
            LOGGER.info("---- Plugin # {} ---- ", i + 1);
            LOGGER.info("Key: {}", exts[i].getKey());
            LOGGER.info("Version: {}", exts[i].getVersion());
            LOGGER.info("Registration Time: {}", exts[i].getLastHeartbeatTime().getTime());
            LOGGER.info("Configuration URL: {}", exts[i].getServer()[0].getUrl());
        }
    }

}
