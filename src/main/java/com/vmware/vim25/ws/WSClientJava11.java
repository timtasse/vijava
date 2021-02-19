package com.vmware.vim25.ws;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.rmi.RemoteException;
import java.time.Duration;
import java.util.List;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 17.02.2020
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class WSClientJava11 extends WSClient {

    private HttpClient client;

    WSClientJava11(final URL serverUrl, final boolean ignoreCert) {
        super(serverUrl, ignoreCert);
        final HttpClient.Builder builder = HttpClient.newBuilder()
                .cookieHandler(new CookieManager());
        if (ignoreCert) {
            final SSLContext sc = trustAllHttpsCertificates();
            if (sc != null) {
                builder.sslContext(sc);
            }
        }
        this.client = builder.build();
    }

    @Override
    public Object invoke(final String methodName, final List<Argument> paras, final String returnType) throws RemoteException {
        final String soapMsg = XmlGen.generateSoapMethod(methodName, paras, this.getVimNameSpace());
        final HttpRequest.BodyPublisher body = HttpRequest.BodyPublishers.ofString(soapMsg);
        final HttpRequest.Builder builder = HttpRequest.newBuilder().uri(this.getBaseUri());
        if (this.getReadTimeout() > 0) {
            builder.timeout(Duration.ofMillis(this.getReadTimeout()));
        }
        if (this.getSoapAction() != null) {
            builder.header(SOAP_ACTION_HEADER, this.getSoapAction());
        }
        final HttpRequest request = builder.POST(body)
                .header("Content-Type", "text/xml; charset=utf-8")
                .build();
        try {
            final HttpResponse<InputStream> response = this.client.send(request, HttpResponse.BodyHandlers.ofInputStream());
            return this.getXmlGen().fromXML(returnType, response.body());
        } catch (IOException e) {
            throw new RemoteException("Network Error to VI SOAP Service:" + e.getMessage(), e);
        } catch (Exception e) {
            throw new RemoteException("VI SDK invoke exception:" + e.getMessage(), e);
        }
    }

}
