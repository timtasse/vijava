package com.vmware.vim25.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
public final class WSClientFactory {

    public static final int DEFAULT_CONNECT_TIMEOUT = 30000;
    public static final int DEFAULT_SOCKET_TIMEOUT = 0;
    private static final Logger LOGGER = LoggerFactory.getLogger(WSClientFactory.class);

    private WSClientFactory() {
        // Factory
    }


    /**
     * Create the Client with the best possible implementation and set connect timeout to 30s and no socket timeout and ignores the certificate
     *
     * @param serverUrl URL to the ESX/vCenter
     * @return the created client
     */
    public static WSClient getClient(final URL serverUrl) {
        return getClient(serverUrl, true);
    }

    /**
     * Create the Client with the best possible implementation and set connect timeout to 30s and no socket timeout
     *
     * @param serverUrl  URL to the ESX/vCenter
     * @param ignoreCert should the certificate be ignored
     * @return the created client
     */
    public static WSClient getClient(final URL serverUrl, final boolean ignoreCert) {
        return getClient(serverUrl, ignoreCert, DEFAULT_CONNECT_TIMEOUT, DEFAULT_SOCKET_TIMEOUT);
    }

    /**
     * Create the Client with the best possible implementation
     *
     * @param serverUrl      URL to the ESX/vCenter
     * @param ignoreCert     should the certificate be ignored
     * @param connectTimeout the timeout for establishing the connection
     * @param socketTimeout  the timeout for the data to be received (keep long running requests in mind, e.g. VM creation)
     * @return the created client
     */
    public static WSClient getClient(final URL serverUrl, final boolean ignoreCert, final int connectTimeout, final int socketTimeout) {
        try {
            WSClientFactory.class.getClassLoader().loadClass("com.vmware.vim25.ws.WSClientApacheHttp");
            LOGGER.info("Apache HttpClient is installed, using this implementation");
            return new WSClientApacheHttp(serverUrl, ignoreCert,
                    connectTimeout != 0 ? connectTimeout : DEFAULT_CONNECT_TIMEOUT,
                    socketTimeout != 0 ? socketTimeout : DEFAULT_SOCKET_TIMEOUT);
        } catch (final ClassNotFoundException ignored) {
            // Apache HttpClient not available
        }
        if (Integer.parseInt(System.getProperty("java.specification.version")) >= 11) {
            LOGGER.info("Java11 is detected, using this implementation");
            return new WSClientJava11(serverUrl, ignoreCert,
                    connectTimeout != 0 ? connectTimeout : DEFAULT_CONNECT_TIMEOUT,
                    socketTimeout != 0 ? socketTimeout : DEFAULT_SOCKET_TIMEOUT);
        }
        LOGGER.info("No other implementation possible, using the old Java way");
        return new WSClientOldJava(serverUrl, ignoreCert,
                connectTimeout != 0 ? connectTimeout : DEFAULT_CONNECT_TIMEOUT,
                socketTimeout != 0 ? socketTimeout : DEFAULT_SOCKET_TIMEOUT);
    }

}
