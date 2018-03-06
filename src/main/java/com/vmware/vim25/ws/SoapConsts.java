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
package com.vmware.vim25.ws;

import org.dom4j.Namespace;
import org.dom4j.QName;

public class SoapConsts {

    public final static String XSI_NAMESPACE_URI = "http://www.w3.org/2001/XMLSchema-instance";
    public final static Namespace XSI = new Namespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
    public static final Namespace SOAPENV = new Namespace("soapenv", "http://schemas.xmlsoap.org/soap/envelope/");
    public static final QName FAULT_QNAME = new QName("Fault", SOAPENV);
    public static final QName BODY_QNAME = new QName("Body", SOAPENV);
    public final static QName XSI_TYPE = new QName("type", XSI);

    public final static String SOAP_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><soapenv:Envelope xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><soapenv:Body>";
    public final static String SOAP_END = "</soapenv:Body></soapenv:Envelope>";
    public final static String TAG_START = "<";
    public final static String TAG_END = ">";
    public final static String TAG_START_END = "</";

    public static void appendTagStart(final StringBuilder sb, final String tagName) {
        sb.append(TAG_START);
        sb.append(tagName);
        sb.append(TAG_END);
    }

    public static void appendTagStartWithXSI(final StringBuilder sb, final String tagName, final String xsiType) {
        sb.append(TAG_START);
        sb.append(tagName);
        sb.append(" xsi:type=\"");
        sb.append(xsiType);
        sb.append('"');
        sb.append(TAG_END);
    }

    public static void appendTagEnd(final StringBuilder sb, final String tagName) {
        sb.append(TAG_START_END);
        sb.append(tagName);
        sb.append(TAG_END);
    }

}
