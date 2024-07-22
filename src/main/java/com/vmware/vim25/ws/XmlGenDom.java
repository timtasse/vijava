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

import com.vmware.vim25.ManagedObjectReference;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.doublecloud.ws.util.ReflectUtil;
import org.doublecloud.ws.util.TypeUtil;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.*;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The XML serialization/de-serialization engine.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
public final class XmlGenDom extends XmlGen {

    private static int getNumberOfSameTags(final List<Element> subNodes, final int sizeOfSubNodes,
                                           final int from, final String tagName) {
        int numOfTags = 1;
        for (int j = from + 1; j < sizeOfSubNodes; j++) {
            if (subNodes.get(j).getName().equals(tagName)) {
                numOfTags++;
            } else {
                break;
            }
        }
        return numOfTags;
    }

    Element parseInputStreamXML(final InputStream is) throws RemoteException {
        if (is == null) {
            return null;
        }
        try (is) {
            final SAXReader reader = new SAXReader();
            reader.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            return reader.read(is).getRootElement().element(SoapConsts.BODY_QNAME);
        } catch (final DocumentException | IOException | SAXException e) {
            throw new RemoteException("VI SDK invoke exception:" + e, e);
        }
    }

    @Override
    Object fromXML(final String returnType, final InputStream is) throws RemoteException {
        final Element body = this.parseInputStreamXML(is);
        if (body == null) {
            return null;
        }
        if (LOGGER.isTraceEnabled()) {
            LOGGER.trace(body.asXML());
        }
        final Element fault = body.element(SoapConsts.FAULT_QNAME);
        if (fault != null) {
            final SoapFaultException sfe = this.parseSoapFault(fault);
            if (sfe.detail != null) {
                throw (RemoteException) sfe.detail;
            } else {
                throw sfe;
            }
        }

        final Element resp = body.elements().get(0);

        if (returnType == null) {
            return null;
        }
        return parseXmlElement(returnType, resp);
    }

    private SoapFaultException parseSoapFault(final Element root) {
        final SoapFaultException sfe = new SoapFaultException();

        sfe.setFaultCode(root.elementText("faultcode"));
        sfe.setFaultString(root.elementText("faultstring"));
        sfe.setFaultActor(root.elementText("faultactor"));

        final Element detailE = root.element("detail");
        if (detailE != null && detailE.nodeCount() > 0) {
            final Element faultE = (Element) detailE.node(0);
            final String faultTypeName = faultE.attributeValue(SoapConsts.XSI_TYPE);
            if (faultTypeName != null) {
                try {
                    sfe.detail = (Throwable) parseVimClassFromElement(TypeUtil.getVimClass(faultTypeName), faultE);
                } catch (final Exception ignored) {
                    // no further information available
                }
            }
        }
        return sfe;
    }

    private Object parseXmlElement(final String type, final Element root) {
        final List<Element> subNodes = root.elements();

        if (subNodes.isEmpty()) {
            if (type.startsWith("List.")) {
                return Collections.emptyList();
            }
            return null;
        }

        if (type.startsWith("ManagedObjectReference")) {
            if (!type.endsWith("[]")) {
                final Element e = subNodes.get(0);
                return ManagedObjectReference.create(e.attributeValue("type"), e.getText());
            } else {
                final ManagedObjectReference[] mos = new ManagedObjectReference[subNodes.size()];
                for (int i = 0; i < subNodes.size(); i++) {
                    final Element elem = subNodes.get(i);
                    mos[i] = ManagedObjectReference.create(elem.attributeValue("type"), elem.getText());
                }
                return mos;
            }
        } else if (TypeUtil.isBasicType(type)) {
            final List<String> vals = new ArrayList<>();
            for (final Element subNode : subNodes) {
                vals.add(subNode.getText());
            }
            return ReflectUtil.parseToObject(type, vals);
        } else if (type.startsWith("List.")) {
            final String arrayItemTypeName = type.substring(5);
            if ("ManagedObjectReference".equals(arrayItemTypeName)) {
                final List<ManagedObjectReference> morList = new ArrayList<>(subNodes.size());
                for (final Element e : subNodes) {
                    morList.add(ManagedObjectReference.create(e.attributeValue("type"), e.getText()));
                }
                return morList;
            } else {
                return subNodes.stream()
                        .map(e -> {
                            final String xsiType = e.attributeValue(SoapConsts.XSI_TYPE);
                            return parseVimClassFromElement(TypeUtil.getVimClass(xsiType == null ? arrayItemTypeName : xsiType), e);
                        })
                        .collect(Collectors.toList());
            }
        } else if (type.endsWith("[]")) { // array type
            final String arrayItemTypeName = type.substring(0, type.length() - 2);
            final Class<?> clazz = TypeUtil.getVimClass(arrayItemTypeName);
            final Object ao = Array.newInstance(clazz, subNodes.size());

            for (int i = 0; i < subNodes.size(); i++) {
                final Element e = subNodes.get(i);
                final String xsiType = e.attributeValue(SoapConsts.XSI_TYPE);
                final Object o = parseVimClassFromElement(TypeUtil.getVimClass(xsiType == null ? arrayItemTypeName : xsiType), subNodes.get(i));
                Array.set(ao, i, o);
            }
            return ao;
        } else {
            return parseVimClassFromElement(TypeUtil.getVimClass(type), subNodes.get(0));
        }
    }

    /**
     * Handle single VIM Data Object except MOR
     */
    @SuppressWarnings("all")
    private Object parseVimClassFromElement(final Class<?> clazz, final Element node) {
        final Object obj;
        try {
            obj = clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        final List<Element> subNodes = node.elements();
        final int sizeOfSubNodes = subNodes.size();

        for (int i = 0; i < sizeOfSubNodes; i++) {
            final Element e = subNodes.get(i);
            final String tagName = e.getName();

            try {
                final Field field = getField(clazz, tagName);
                Class<?> fType = field.getType();
                final boolean isFieldArray = fType.isArray();
                final boolean isList;
                //if field is an array, adjust it to the component type
                if (isFieldArray) {
                    fType = fType.getComponentType();
                }
                Class fRealType = fType;

                if (List.class.isAssignableFrom(fType)) {
                    fRealType = (Class<?>) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
                    isList = true;
                } else {
                    isList = false;
                }
                final String xsiType = e.attributeValue(SoapConsts.XSI_TYPE);
                if (xsiType != null && (!xsiType.startsWith("xsd:"))) {
                    fRealType = TypeUtil.getVimClass(xsiType);
                }

                if (fRealType == ManagedObjectReference.class) { // MOR
                    if (isFieldArray || isList) {
                        final int sizeOfFieldArray = getNumberOfSameTags(subNodes, sizeOfSubNodes, i, tagName);
                        final ArrayList<ManagedObjectReference> morList = new ArrayList<>(sizeOfFieldArray);
                        for (int j = 0; j < sizeOfFieldArray; j++) {
                            final Element elem = subNodes.get(j + i);
                            morList.add(ManagedObjectReference.create(elem.attributeValue("type"), elem.getText()));
                        }
                        if (isFieldArray) {
                            field.set(obj, morList.toArray(new ManagedObjectReference[0]));
                        } else {
                            field.set(obj, morList);
                        }
                        i = i + sizeOfFieldArray - 1;
                    } else {
                        field.set(obj, ManagedObjectReference.create(e.attributeValue("type"), e.getText()));
                    }
                } else if (fRealType.isEnum()) { // Enum type
                    if (!isFieldArray && !isList) {
                        final Object fo = Enum.valueOf(fRealType, e.getText());
                        field.set(obj, fo);
                    } else {
                        final int sizeOfFieldArray = getNumberOfSameTags(subNodes, sizeOfSubNodes, i, tagName);
                        final List<Object> objectList = new ArrayList<>(sizeOfFieldArray);
                        for (int j = 0; j < sizeOfFieldArray; j++) {
                            final String enumStr = (subNodes.get(j + i)).getText();
                            objectList.add(Enum.valueOf(fRealType, enumStr));
                        }
                        if (isFieldArray) {
                            final Object outputArray = Array.newInstance(fType, sizeOfFieldArray);
                            for (int j = 0; j < sizeOfFieldArray; j++) {
                                Array.set(outputArray, j, objectList.get(j));
                            }
                            field.set(obj, outputArray);
                        } else {
                            field.set(obj, objectList);
                        }
                        i = i + sizeOfFieldArray - 1;
                    }
                } else if (TypeUtil.isBasicType(fRealType)) { // basic data types
                    if (isFieldArray || isList) {
                        final int sizeOfFieldArray = getNumberOfSameTags(subNodes, sizeOfSubNodes, i, tagName);

                        final List<String> values = new ArrayList<>();
                        for (int j = 0; j < sizeOfFieldArray; j++) {
                            values.add((subNodes.get(j + i)).getText());
                        }

                        String fTrueType;
                        if (xsiType != null) {
                            fTrueType = xsiType.substring("xsd:".length()) + "[]";
                        } else {
                            if (isFieldArray) {
                                fTrueType = field.getType().getSimpleName();
                            } else {
                                fTrueType = fRealType.getSimpleName() + "[]";
                            }
                        }
                        if (isList && fRealType == String.class) {
                            field.set(obj, values);
                        } else {
                            final Object array = ReflectUtil.getObjectArray(fTrueType, values);
                            if (isList) {
                                field.set(obj, arrayToList(array));
                            } else {
                                field.set(obj, array);
                            }
                        }
                        i = i + sizeOfFieldArray - 1;
                    } else {
                        if (xsiType != null) {
                            ReflectUtil.setObjectField(obj, field, xsiType.substring("xsd:".length()), e.getText());
                        } else {
                            ReflectUtil.setObjectField(obj, field, fRealType.getSimpleName(), e.getText());
                        }
                    }
                } else { //VIM type
                    if (isFieldArray || isList) {
                        final Type genericType = field.getGenericType();
                        Class<?> fGenericType;
                        if (genericType instanceof ParameterizedType) {
                            fGenericType = (Class<?>) ((ParameterizedType) genericType).getActualTypeArguments()[0];
                        } else {
                            fGenericType = fType;
                        }
                        final int sizeOfFieldArray = getNumberOfSameTags(subNodes, sizeOfSubNodes, i, tagName);
                        final List<Object> objectList = new ArrayList<>(sizeOfFieldArray);
                        for (int j = 0; j < sizeOfFieldArray; j++) {
                            final Element elem = subNodes.get(j + i);
                            final String elemXsiType = elem.attributeValue(SoapConsts.XSI_TYPE);
                            if (elemXsiType != null) {
                                fGenericType = TypeUtil.getVimClass(elemXsiType);
                            }
                            final Object o = parseVimClassFromElement(fGenericType, elem);
                            objectList.add(o);
                        }
                        if (isFieldArray) {
                            final Object outputArray = Array.newInstance(fType, sizeOfFieldArray);
                            for (int j = 0; j < sizeOfFieldArray; j++) {
                                Array.set(outputArray, j, objectList.get(j));
                            }
                            field.set(obj, outputArray);
                        } else {
                            field.set(obj, objectList);
                        }
                        i = i + sizeOfFieldArray - 1;
                    } else { // single VIM
                        final Object o = parseVimClassFromElement(fRealType, e);
                        field.set(obj, o);
                    }
                }
            } catch (final NoSuchFieldException | IllegalAccessException exc) {
                LOGGER.error("Field {} could not found or accessed on Class {}", tagName, clazz.getSimpleName(), exc);
            }
        }
        return obj;
    }

    private static List<?> arrayToList(final Object array) {
        if (array instanceof int[]) {
            final var val = (int[]) array;
            return Arrays.stream(val).boxed().collect(Collectors.toList());
        }
        if (array instanceof short[]) {
            final var val = (short[]) array;
            return shortToShortList(val);
        }
        if (array instanceof byte[]) {
            final var val = (byte[]) array;
            return byteToByteList(val);
        }
        if (array instanceof long[]) {
            final var val = (long[]) array;
            return Arrays.stream(val).boxed().collect(Collectors.toList());
        }
        if (array instanceof float[]) {
            final var val = (float[]) array;
            return floatToFloatList(val);
        }
        if (array instanceof boolean[]) {
            final var val = (boolean[]) array;
            return booleanToBooleanList(val);
        }
        if (array instanceof String[]) {
            final var val = (String[]) array;
            return Arrays.asList(val);
        }
        throw new IllegalArgumentException("Unsupported array type: " + array.getClass());
    }

    private static List<Short> shortToShortList(final short[] input){
        final List<Short> output = new ArrayList<>(input.length);
        for (final short i : input) {
            output.add(i);
        }
        return output;
    }

    private static List<Byte> byteToByteList(final byte[] input){
        final List<Byte> output = new ArrayList<>(input.length);
        for (final byte i : input) {
            output.add(i);
        }
        return output;
    }

    private static List<Float> floatToFloatList(final float[] input){
        final List<Float> output = new ArrayList<>(input.length);
        for (final float i : input) {
            output.add(i);
        }
        return output;
    }

    private static List<Boolean> booleanToBooleanList(final boolean[] input){
        final List<Boolean> output = new ArrayList<>(input.length);
        for (final boolean i : input) {
            output.add(i);
        }
        return output;
    }

    private Field getField(final Class<?> clazz, final String tagName) throws NoSuchFieldException {
        final String name;
        if (TypeUtil.isPrimitiveType(tagName)) {
            name = "_" + tagName;
        } else {
            name = tagName;
        }
        Field field;
        try {
            field = clazz.getField(name);
        } catch (final NoSuchFieldException e) {
            field = this.getFieldRecursive(clazz, name);
        }
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        return field;
    }

    private Field getFieldRecursive(final Class<?> clazz, final String name) throws NoSuchFieldException {
        try {
            return clazz.getDeclaredField(name);
        } catch (final NoSuchFieldException e) {
            final Class<?> superclass = clazz.getSuperclass();
            if (superclass == null) {
                throw e;
            }
            return this.getFieldRecursive(superclass, name);
        }
    }

}
