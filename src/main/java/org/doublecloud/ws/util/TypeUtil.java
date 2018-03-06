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

package org.doublecloud.ws.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public final class TypeUtil {

    final public static Class<?> INT_ARRAY_CLASS = new int[]{}.getClass();
    final public static Class<?> BYTE_ARRAY_CLASS = new byte[]{}.getClass();
    final public static Class<?> LONG_ARRAY_CLASS = new long[]{}.getClass();

    private static final Logger LOGGER = LoggerFactory.getLogger(TypeUtil.class);
    private static final String PACKAGE_NAME = "com.vmware.vim25";
    private static final Map<String, Class<?>> VIM_CLASSES = new ConcurrentHashMap<>();
    private static final Set<String> PRIMITIVE_TYPES = new HashSet<>();
    private static final List<String> BASIC_TYPES = Arrays.asList("String", "int", "short", "long", "float", "Float", "byte", "boolean", "Boolean", "Calendar", "double",
            "List.String", "List.Integer", "List.Short", "List.Long", "List.Float", "List.Double", "List.Byte", "List.Boolean", "List.Calendar");
    private static final List<Package> BASIC_PACKAGES = Arrays.asList(String.class.getPackage(), Calendar.class.getPackage());
    private static Class<?>[] clazzes = new Class[]{
            java.lang.Integer.class, java.lang.Long.class,
            java.lang.Boolean.class, java.lang.Short.class,
            java.lang.Float.class, java.lang.String.class,
            java.lang.Byte.class, java.lang.Double.class
    };
    private static String[] xsdStrs = new String[]{
            "xsd:int", "xsd:long",
            "xsd:boolean", "xsd:short",
            "xsd:float", "xsd:string",
            "xsd:byte", "xsd:double"
    };

    static {
        PRIMITIVE_TYPES.add("int");
        PRIMITIVE_TYPES.add("boolean");
        PRIMITIVE_TYPES.add("short");
        PRIMITIVE_TYPES.add("float");
        PRIMITIVE_TYPES.add("byte");
        PRIMITIVE_TYPES.add("long");
        PRIMITIVE_TYPES.add("double");
    }

    private TypeUtil() {
        // Static Class
    }

    public static boolean isPrimitiveType(String type) {
        return PRIMITIVE_TYPES.contains(type);
    }

    public static boolean isBasicType(final String type) {
        return BASIC_TYPES.stream().filter(v -> type.startsWith(v)).findAny().isPresent();
    }

    public static boolean isBasicType(final Class<?> clazz) {
        return BASIC_PACKAGES.stream().filter(v -> clazz.getPackage() == null || v.equals(clazz.getPackage())).findAny().isPresent();
    }

    public final static Class<?> getVimClass(final String type) {
        if (VIM_CLASSES.containsKey(type)) {
            return VIM_CLASSES.get(type);
        } else {
            try {
                Class<?> clazz;
                if (type.endsWith("[]") == false) {
                    clazz = Class.forName(PACKAGE_NAME + "." + type);
                } else {
                    String arrayType = type.substring(0, type.length() - 2);
                    clazz = Array.newInstance(getVimClass(arrayType), 0).getClass();
                }

                VIM_CLASSES.put(type, clazz);

                return clazz;
            } catch (ClassNotFoundException cnfe) {
                LOGGER.error("Class {} not found", type, cnfe);
                return null;
            }
        }
    }

    //only for the basic data types as shown above
    public static String getXSIType(Object obj) {
        Class<?> type = obj.getClass();

        for (int i = 0; i < clazzes.length; i++) {
            if (type == clazzes[i]) {
                return xsdStrs[i];
            }
        }

        if (obj instanceof java.util.Calendar) {
            return "xsd:dateTime";
        }

        throw new RuntimeException("Unknown data type during serialization:" + type);
    }
}