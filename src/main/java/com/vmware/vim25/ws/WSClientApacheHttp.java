package com.vmware.vim25.ws;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
public final class WSClientApacheHttp extends WSClient {

    private final CloseableHttpClient httpClient;
    private final BasicCookieStore cookieStore;

    WSClientApacheHttp(final URL serverUrl, final boolean ignoreCert) {
        super(serverUrl, ignoreCert);
        this.cookieStore = new BasicCookieStore();
        final HttpClientBuilder httpClientBuilder = HttpClients.custom()
                .setDefaultCookieStore(cookieStore);
        if (ignoreCert) {
            try {
                final SSLContext sslContext = new SSLContextBuilder()
                        .loadTrustMaterial(null, (x509CertChain, authType) -> true)
                        .build();
                httpClientBuilder.setSSLContext(sslContext)
                        .setSSLSocketFactory(new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE));
            } catch (final NoSuchAlgorithmException | KeyManagementException | KeyStoreException e) {
                LOGGER.error("Error in setting other SSLContext", e);
            }
        }
        this.httpClient = httpClientBuilder.build();
    }

    @Override
    public Object invoke(final String methodName, final List<Argument> paras, final String returnType) throws RemoteException {
        final String soapMsg = XmlGen.generateSoapMethod(methodName, paras, this.getVimNameSpace());
        final HttpPost httpPost = new HttpPost(this.getBaseUri());
        final StringEntity entity = new StringEntity(soapMsg, ContentType.TEXT_XML);
        httpPost.setEntity(entity);
        httpPost.addHeader(SOAP_ACTION_HEADER, this.getSoapAction());
        //LOGGER.debug("Request-Header: {}", Arrays.toString(httpPost.getAllHeaders()));
        //LOGGER.debug(soapMsg);
        try (final CloseableHttpResponse response = this.httpClient.execute(httpPost);
             final InputStream is = response.getEntity().getContent()) {
            //LOGGER.debug("Response-Header: {}", Arrays.toString(response.getAllHeaders()));
            return this.getXmlGen().fromXML(returnType, is);
        } catch (final IOException e) {
            throw new RemoteException("Network Error to VI SOAP Service:" + e.getMessage(), e);
        } catch (final Exception e) {
            throw new RemoteException("VI SDK invoke exception:" + e.getMessage(), e);
        }
    }

}
