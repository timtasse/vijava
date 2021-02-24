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

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;

/**
 * The Web Service Engine
 *
 * @author Steve Jin (sjin@vmware.com)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
@SuppressWarnings("unchecked")
public abstract class WSClient {

    protected static final Logger LOGGER = LoggerFactory.getLogger(WSClient.class);
    protected static final String SOAP_ACTION_HEADER = "SOAPAction";
    protected static final String SOAP_ACTION_V40 = "urn:vim25/4.0";
    protected static final String SOAP_ACTION_V41 = "urn:vim25/4.1";
    protected static final String SOAP_ACTION_V50 = "urn:vim25/5.0";
    protected static final String SOAP_ACTION_V51 = "urn:vim25/5.1";
    protected static final String SOAP_ACTION_V55 = "urn:vim25/5.5";
    protected static final String SOAP_ACTION_V60 = "urn:vim25/6.0";
    protected static final String SOAP_ACTION_V65 = "urn:vim25/6.5";
    protected static final String SOAP_ACTION_V67 = "urn:vim25/6.7";
    protected static final String SOAP_ACTION_V671 = "urn:vim25/6.7.1";
    protected static final String SOAP_ACTION_V672 = "urn:vim25/6.7.2";
    protected static final String SOAP_ACTION_V70 = "urn:vim25/7.0.0.0";
    protected static final String SOAP_ACTION_V701 = "urn:vim25/7.0.1.0";

    private final URL baseUrl;
    private final URI baseUri;
    private final XmlGen xmlGen = new XmlGenDom();
    private String cookie;
    private String vimNameSpace;
    private String soapAction;
    private int connectTimeout;
    private int readTimeout;

    public WSClient(final URL serverUrl, final boolean ignoreCert) {
        this.baseUrl = serverUrl;
        URI uri;
        try {
            uri = this.baseUrl.toURI();
        } catch (URISyntaxException e) {
            LOGGER.error("URI Error", e);
            uri = null;
        }
        this.baseUri = uri;
    }

    protected static SSLContext trustAllHttpsCertificates() {
        try {
            final TrustManager[] trustAllCerts = new TrustManager[1];
            trustAllCerts[0] = new TrustAllManager();
            final SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, null);
            return sc;
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            LOGGER.error("Error in setting other SSLContext", e);
        }
        return null;
    }

    public Object invoke(final String methodName, final Argument[] paras, final String returnType) throws RemoteException {
        return this.invoke(methodName, Arrays.asList(paras), returnType);
    }

    public <T> T invoke(final String methodName, final List<Argument> paras, final Class<?> T) throws RemoteException {
        return (T) this.invoke(methodName, paras, T.getSimpleName());
    }

    public <T> T invokeWithoutReturn(final String methodName, final List<Argument> paras) throws RemoteException {
        return (T) this.invoke(methodName, paras, (String) null);
    }

    public abstract Object invoke(final String methodName, final List<Argument> paras, final String returnType) throws RemoteException;

    /*===============================================
       * API versions *
      "4.0"       vSphere 4.0 (and u1)
      "4.1"       vSphere 4.1
      "5.0"       vSphere 5.0
      "5.1"       vSphere 5.1
      "5.5"       vSphere 5.5
      "6.0"       vSphere 6.0
      "6.5"       vSphere 6.5
      "6.7"       vSphere 6.7
      "6.7.1"     vSphere 6.7u1
      "6.7.2"     vSphere 6.7u3
      "7.0"       vSphere 7.0
      "7.0.1"     vSphere 7.0u1
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
            case "6.7":
                soapAction = SOAP_ACTION_V67;
                break;
            case "6.7.1":
                soapAction = SOAP_ACTION_V671;
                break;
            case "6.7.2":
                soapAction = SOAP_ACTION_V672;
                break;
            case "7.0.0.0":
                soapAction = SOAP_ACTION_V70;
                break;
            case "7.0.1.0":
                soapAction = SOAP_ACTION_V701;
                break;
            default:
                soapAction = SOAP_ACTION_V70;
        }
    }

    public URL getBaseUrl() {
        return this.baseUrl;
    }

    public URI getBaseUri() {
        return baseUri;
    }

    public XmlGen getXmlGen() {
        return xmlGen;
    }

    public String getSoapAction() {
        return soapAction;
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

    static class TrustAllManager implements X509TrustManager {
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
