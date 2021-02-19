package com.vmware.vim25.ws;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 17.02.2020
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class WSClientOldJava extends WSClient {

    WSClientOldJava(final URL serverUrl, final boolean ignoreCert) {
        super(serverUrl, ignoreCert);
        if (ignoreCert) {
            final SSLContext sc = trustAllHttpsCertificates();
            if (sc != null) {
                HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            }
            HttpsURLConnection.setDefaultHostnameVerifier((urlHostName, session) -> true);
        }
    }

    @Override
    public Object invoke(final String methodName, final List<Argument> paras, final String returnType) throws RemoteException {
        final String soapMsg = XmlGen.generateSoapMethod(methodName, paras, this.getVimNameSpace());
        try {
            final HttpURLConnection postCon = (HttpURLConnection) this.getBaseUrl().openConnection();

            if (this.getConnectTimeout() > 0) {
                postCon.setConnectTimeout(this.getConnectTimeout());
            }
            if (this.getReadTimeout() > 0) {
                postCon.setReadTimeout(this.getReadTimeout());
            }
            try {
                postCon.setRequestMethod("POST");
            } catch (ProtocolException e) {
                LOGGER.error("Error during setRequestMethod in SOAPConnection", e);
            }
            postCon.setDoOutput(true);
            postCon.setDoInput(true);
            postCon.setRequestProperty(SOAP_ACTION_HEADER, this.getSoapAction());
            postCon.setRequestProperty("Content-Type", "text/xml; charset=utf-8");

            if (this.getCookie() != null) {
                postCon.setRequestProperty("Cookie", this.getCookie());
            }

            final OutputStream os = postCon.getOutputStream();
            final OutputStreamWriter out = new OutputStreamWriter(os, StandardCharsets.UTF_8);

            out.write(soapMsg);
            out.close();

            InputStream is;

            try {
                is = postCon.getInputStream();
            } catch (IOException ioe) {
                is = postCon.getErrorStream();
            }

            if (this.getCookie() == null) {
                this.setCookie(postCon.getHeaderField("Set-Cookie"));
            }
            return this.getXmlGen().fromXML(returnType, is);
        } catch (IOException e) {
            throw new RemoteException("Network Error to VI SOAP Service:" + e.getMessage(), e);
        } catch (Exception e) {
            throw new RemoteException("VI SDK invoke exception:" + e.getMessage(), e);
        }
    }
}
