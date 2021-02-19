package com.vmware.vim25.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;

/**
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
public final class WSClientFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(WSClientFactory.class);

    private WSClientFactory() {
        // Factory
    }

    public static WSClient getClient(final URL serverUrl) {
        return getClient(serverUrl, true);
    }

    public static WSClient getClient(final URL serverUrl, final boolean ignoreCert) {
        try {
            WSClientFactory.class.getClassLoader().loadClass("com.vmware.vim25.ws.WSClientApacheHttp");
            LOGGER.info("Apache HttpClient is installed, using this implementation");
            return new WSClientApacheHttp(serverUrl, ignoreCert);
        } catch (final ClassNotFoundException ignored) {
            // Apache HttpClient not available
        }
        if (Integer.parseInt(System.getProperty("java.specification.version")) >= 11) {
            LOGGER.info("Java11 is detected, using this implementation");
            return new WSClientJava11(serverUrl, ignoreCert);
        }
        LOGGER.info("No other implementation possible, using the old Java way");
        return new WSClientOldJava(serverUrl, ignoreCert);
    }

}
