/*================================================================================
Copyright (c) 2013 Steve Jin. All Rights Reserved.
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

import com.vmware.vim25.EventFilterSpec;
import com.vmware.vim25.ManagedObjectReference;
import org.doublecloud.ws.util.ReflectUtil;
import org.doublecloud.ws.util.TypeUtil;
import org.doublecloud.ws.util.XmlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public abstract class XmlGen {

    protected static final Logger LOGGER = LoggerFactory.getLogger(XmlGen.class);

    /*
    extra method because of non thread-safety of DateFormat
    2018-04-19T14:49:13Z
    2018-04-19T14:50:12.95902Z
    2018-04-19T14:50:47.00073Z
    2018-04-19T14:51:47.00068Z
     */
    public static DateFormat getDateFormat() {
        final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSX");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateFormat;
    }

    public static String generateSoapMethod(final String methodName, final List<Argument> paras, final String vimNameSpace) {
        final StringBuilder sb = new StringBuilder();
        sb.append(SoapConsts.SOAP_HEADER);
        sb.append(SoapConsts.TAG_START);
        sb.append(methodName);
        sb.append(vimNameSpace);

        for (final Argument para : paras) {
            if (para.getValue() == null) {
                continue;
            }
            if (TypeUtil.isBasicType(para.getType())) {
                generateSoapAttribute(sb, para.getName(), para.getValue().getClass(), para.getValue());
            } else {
                final Class<?> clazz = TypeUtil.getVimClass(para.getType());
                generateSoapAttribute(sb, para.getName(), clazz, para.getValue());
            }
        }
        sb.append(SoapConsts.TAG_START_END);
        sb.append(methodName);
        sb.append(SoapConsts.TAG_END);
        sb.append(SoapConsts.SOAP_END);
        return sb.toString();
    }

    private static void generateSoapAttribute(final StringBuilder sb, final String tagName, final Class<?> type, final Object obj) {
        final Class<?> clazz = obj.getClass();

        if (clazz.isArray()) {
            handleArrays(sb, tagName, type, obj);
            return;
        }

        if (obj instanceof List<?>) {
            handleArrays(sb, tagName, type, ((List<?>)obj).toArray());
            return;
        }

        // from now on, no array type
        if (clazz == ManagedObjectReference.class) { //MOR]
            final ManagedObjectReference mor = (ManagedObjectReference) obj;
            sb.append("<");
            sb.append(tagName);
            sb.append(" xsi:type=\"ManagedObjectReference\" type=\"");
            sb.append(mor.getType());
            sb.append("\">");
            sb.append(mor.getVal());
            SoapConsts.appendTagEnd(sb, tagName);
            return;
        }
        if (clazz.getCanonicalName().startsWith("java.lang")) { //basic data type
            if (clazz != type) {
                SoapConsts.appendTagStartWithXSI(sb, tagName, TypeUtil.getXSIType(obj));
            } else {
                SoapConsts.appendTagStart(sb, tagName);
            }

            if (clazz == String.class) {
                final String temp = XmlUtil.escapeForXML((String) obj);
                sb.append(temp);
            } else {
                sb.append(obj);
            }
            SoapConsts.appendTagEnd(sb, tagName);
        } else if (clazz.isEnum()) { //enum data type
            SoapConsts.appendTagStart(sb, tagName);
            sb.append(obj);
            SoapConsts.appendTagEnd(sb, tagName);
        } else if (obj instanceof Calendar) {
            SoapConsts.appendTagStartWithXSI(sb, tagName, "xsd:dateTime");
            sb.append(getDateFormat().format(((Calendar) obj).getTime()));
            SoapConsts.appendTagEnd(sb, tagName);
        } else { // VIM type
            if (clazz == type) {
                SoapConsts.appendTagStart(sb, tagName);
            } else {
                final String nameSpaceType = clazz.getSimpleName();
                SoapConsts.appendTagStartWithXSI(sb, tagName, nameSpaceType);
            }

            final List<Field> fields = ReflectUtil.getAllFields(clazz);

            for (Field f : fields) {
                final String fName = f.getName();

                Object value = null;
                try {
                    if (!f.canAccess(obj)) {
                        f.setAccessible(true);
                        value = f.get(obj);
                        f.setAccessible(false);
                    } else {
                        value = f.get(obj);
                    }
                } catch (IllegalAccessException iae) {
                    LOGGER.error("ReflectionError in Field {} of Class {}", fName, clazz.getSimpleName(), iae);
                }
                if (value == null) {
                    continue;
                }

                final Class<?> fType = f.getType();
                if (fType == int.class && value.equals(0) && EventFilterSpec.class == type && "filter".equals(tagName)) {
                    continue;
                }
                generateSoapAttribute(sb, fName, fType, value);
            }
            SoapConsts.appendTagEnd(sb, tagName);
        }
    }

    private static void handleArrays(final StringBuilder sb, final String tagName, final Class<?> type, final Object obj) {
        if (obj.getClass() == TypeUtil.INT_ARRAY_CLASS) {
            int[] objs = (int[]) obj;
            for (int i = 0; i < objs.length; i++) {
                SoapConsts.appendTagStart(sb, tagName);
                sb.append(objs[i]);
                SoapConsts.appendTagEnd(sb, tagName);
            }
        } else if (obj.getClass() == TypeUtil.BYTE_ARRAY_CLASS) {
            byte[] objs = (byte[]) obj;
            for (int i = 0; i < objs.length; i++) {
                SoapConsts.appendTagStart(sb, tagName);
                sb.append(objs[i]);
                SoapConsts.appendTagEnd(sb, tagName);
            }
        } else if (obj.getClass() == TypeUtil.LONG_ARRAY_CLASS) {
            long[] objs = (long[]) obj;
            for (int i = 0; i < objs.length; i++) {
                SoapConsts.appendTagStart(sb, tagName);
                sb.append(objs[i]);
                SoapConsts.appendTagEnd(sb, tagName);
            }
        } else {
            Object[] objs = (Object[]) obj;
            for (int i = 0; i < objs.length; i++) {
                generateSoapAttribute(sb, tagName, type.getComponentType(), objs[i]);
            }
        }
    }

    public abstract Object fromXML(String returnType, InputStream in) throws Exception;

}
