/*================================================================================
Copyright (c) 2013 Steve Jin, All Rights Reserved.
Copyright (c) 2009 VMware, Inc. All Rights Reserved.

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

package com.vmware.vim25.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * The Web Service Engine
 *
 * @author Steve Jin (sjin@vmware.com)
 * @author Stefan Dilk
 */

public final class WSClient {

    public static final ConcurrentLinkedQueue<Long> COUNT_OLD = new ConcurrentLinkedQueue<>();
    public static final ConcurrentLinkedQueue<Long> COUNT_NEW = new ConcurrentLinkedQueue<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(WSClient.class);
    private static final String SOAP_ACTION_HEADER = "SOAPAction";
    private static final String SOAP_ACTION_V40 = "urn:vim25/4.0";
    private static final String SOAP_ACTION_V41 = "urn:vim25/4.1";
    private static final String SOAP_ACTION_V50 = "urn:vim25/5.0";
    private static final String SOAP_ACTION_V51 = "urn:vim25/5.1";
    private static final String SOAP_ACTION_V55 = "urn:vim25/5.5";
    private static final String SOAP_ACTION_V60 = "urn:vim25/6.0";
    private static final String SOAP_ACTION_V65 = "urn:vim25/6.5";

    private final URL baseUrl;
    private final XmlGen xmlGen = new XmlGenDom();
    private String cookie;
    private String vimNameSpace;
    private String soapAction;
    private int connectTimeout;
    private int readTimeout;

    public WSClient(final String serverUrl) throws MalformedURLException {
        this(serverUrl, true);
    }

    public WSClient(final String serverUrl, final boolean ignoreCert) throws MalformedURLException {
        if (serverUrl.endsWith("/")) {
            this.baseUrl = new URL(serverUrl.substring(0, serverUrl.length() - 1));
        } else {
            this.baseUrl = new URL(serverUrl);
        }
        if (ignoreCert) {
            trustAllHttpsCertificates();
            HttpsURLConnection.setDefaultHostnameVerifier((urlHostName, session) -> true);
        }
    }

    private static void trustAllHttpsCertificates() {
        try {
            final TrustManager[] trustAllCerts = new TrustManager[1];
            trustAllCerts[0] = new TrustAllManager();
            final SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, null);
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            LOGGER.error("Error in setting other SSLContext", e);
        }
    }

    public Object invoke(final String methodName, final Argument[] paras, final String returnType) throws RemoteException {
        final long start = System.nanoTime();
        final String soapMsg = XmlGen.toXML(methodName, paras, this.vimNameSpace);
        COUNT_OLD.add(System.nanoTime() - start);

        try (final InputStream is = this.post(soapMsg)) {
            return xmlGen.fromXML(returnType, is);
        } catch (Exception e) {
            throw new RemoteException("VI SDK invoke exception:" + e, e);
        }
    }

    public Object invoke(final String methodName, final List<Argument> paras, final String returnType) throws RemoteException {
        final long start = System.nanoTime();
        final String soapMsg = XmlGen.generateSoapMethod(methodName, paras, this.vimNameSpace);
        COUNT_NEW.add(System.nanoTime() - start);

        try (final InputStream is = this.post(soapMsg)) {
            return xmlGen.fromXML(returnType, is);
        } catch (Exception e) {
            throw new RemoteException("VI SDK invoke exception:" + e, e);
        }
    }

    public StringBuffer invokeAsString(String methodName, Argument[] paras) throws RemoteException {
        final String soapMsg = XmlGen.toXML(methodName, paras, this.vimNameSpace);

        try (final InputStream is = post(soapMsg)) {
            return readStream(is);
        } catch (Exception e) {
            throw new RemoteException("VI SDK invoke exception:" + e, e);
        }
    }

    public InputStream post(String soapMsg) throws IOException {
        final HttpURLConnection postCon = (HttpURLConnection) baseUrl.openConnection();

        if (connectTimeout > 0) {
            postCon.setConnectTimeout(connectTimeout);
        }
        if (readTimeout > 0) {
            postCon.setReadTimeout(readTimeout);
        }
        try {
            postCon.setRequestMethod("POST");
        } catch (ProtocolException e) {
            LOGGER.error("Error during setRequestMethod in SOAPConnection", e);
        }
        postCon.setDoOutput(true);
        postCon.setDoInput(true);
        postCon.setRequestProperty(SOAP_ACTION_HEADER, soapAction);
        postCon.setRequestProperty("Content-Type", "text/xml; charset=utf-8");

        if (cookie != null) {
            postCon.setRequestProperty("Cookie", cookie);
        }

        final OutputStream os = postCon.getOutputStream();
        final OutputStreamWriter out = new OutputStreamWriter(os, "UTF8");

        out.write(soapMsg);
        out.close();

        InputStream is;

        try {
            is = postCon.getInputStream();
        } catch (IOException ioe) {
            is = postCon.getErrorStream();
        }

        if (cookie == null) {
            cookie = postCon.getHeaderField("Set-Cookie");
        }
        return is;
    }

    /*===============================================
       * API versions *
      "4.0"       vSphere 4.0 (and u1)
      "4.1"       vSphere 4.1
      "5.0"       vSphere 5.0
      "5.1"       vSphere 5.1
      "5.5"       vSphere 5.5
      "6.0"       vSphere 6.0
      "6.5"       vSphere 6.5
      ===============================================*/
    public void setSoapActionOnApiVersion(String apiVersion) {
        switch (apiVersion) {
            case "4.0":
                soapAction = SOAP_ACTION_V40;
                break;
            case "4.1":
                soapAction = SOAP_ACTION_V41;
                break;
            case "5.0":
                soapAction = SOAP_ACTION_V50;
                break;
            case "5.1":
                soapAction = SOAP_ACTION_V51;
                break;
            case "5.5":
                soapAction = SOAP_ACTION_V55;
                break;
            case "6.0":
                soapAction = SOAP_ACTION_V60;
                break;
            case "6.5":
                soapAction = SOAP_ACTION_V65;
                break;
            default:
                soapAction = SOAP_ACTION_V65;
        }
    }

    private StringBuffer readStream(InputStream is) throws IOException {
        try (final InputStreamReader isr = new InputStreamReader(is);
             final BufferedReader in = new BufferedReader(isr)) {
            final StringBuffer sb = new StringBuffer();
            String lineStr;
            while ((lineStr = in.readLine()) != null) {
                sb.append(lineStr);
            }
            return sb;
        }
    }

    public URL getBaseUrl() {
        return this.baseUrl;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getVimNameSpace() {
        return vimNameSpace;
    }

    public void setVimNameSpace(String vimNameSpace) {
        this.vimNameSpace = vimNameSpace;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public void setConnectTimeout(int timeoutMilliSec) {
        this.connectTimeout = timeoutMilliSec;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public void setReadTimeout(int timeoutMilliSec) {
        this.readTimeout = timeoutMilliSec;
    }

    private static class TrustAllManager implements X509TrustManager {
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        @Override
        public void checkServerTrusted(X509Certificate[] certs, String authType) throws CertificateException {
        }

        @Override
        public void checkClientTrusted(X509Certificate[] certs, String authType) throws CertificateException {
        }
    }
}
