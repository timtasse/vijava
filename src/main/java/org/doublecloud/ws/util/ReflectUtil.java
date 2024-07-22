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

import javax.xml.bind.DatatypeConverter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectUtil {

    protected static final Logger LOGGER = LoggerFactory.getLogger(ReflectUtil.class);

    public static List<Field> getAllFields(Class<?> c) {
        List<Field> listOfFields = new ArrayList<>();
        getAllFields(c, listOfFields);
        return listOfFields;
    }

    private static void getAllFields(Class<?> clazz, List<Field> listOfFields) {
        Class<?> superClass = clazz.getSuperclass();

        if (superClass != null) {
            getAllFields(superClass, listOfFields);
        }

        Field[] fields = clazz.getDeclaredFields();
        for (final Field field : fields) {
            if (!field.isSynthetic()) {
                listOfFields.add(field);
            }
        }
    }

    public static void setArrayField(Object obj, List<Object> vimObjList, Field vimArrayField, Class<?> vimArrayType) throws IllegalAccessException {
        Object ao = Array.newInstance(vimArrayType, vimObjList.size());
        for (int i = 0; i < vimObjList.size(); i++) {
            Array.set(ao, i, vimObjList.get(i));
        }
        vimArrayField.set(obj, ao);

        vimObjList.clear();
    }

    public static void setObjectField(final Object object, final Field field, final String type, final String value) throws IllegalArgumentException, IllegalAccessException {
        if ("String".equals(type) || "string".equals(type)) {
            field.set(object, value);
        } else if ("int".equals(type) || "Integer".equals(type)) {
            field.set(object, Integer.parseInt(value));
        } else if ("short".equals(type) || "Short".equals(type)) {
            field.set(object, Short.parseShort(value));
        } else if ("byte".equals(type) || "Byte".equals(type)) {
            field.set(object, Byte.parseByte(value));
        } else if ("long".equals(type) || "Long".equals(type)) {
            field.set(object, Long.parseLong(value));
        } else if ("float".equals(type) || "Float".equals(type)) {
            field.set(object, Float.parseFloat(value));
        } else if ("boolean".equals(type) || "Boolean".equals(type)) {
            field.set(object, Boolean.parseBoolean(value));
        } else if ("Calendar".equals(type) || "dateTime".equals(type)) {
            final Calendar cal = DatatypeConverter.parseTime(value);
            field.set(object, cal);
        } else if ("double".equals(type) || "Double".equals(type)) {
            field.set(object, Double.parseDouble(value));
        } else {
            throw new RuntimeException("Unexpected Type at setObjectField: " + field.getType().getCanonicalName() + field.getName());
        }
    }

    public static Object getObjectArray(String type, List<String> values) throws IllegalArgumentException, IllegalAccessException {
        if ("String[]".equals(type) || "string[]".equals(type)) {
            final String[] vals = new String[values.size()];
            return values.toArray(vals);
        } else if ("int[]".equalsIgnoreCase(type) || "Integer[]".equals(type)) {
            return toIntArray(values);
        } else if ("short[]".equalsIgnoreCase(type)) {
            return toShortArray(values);
        } else if ("byte[]".equalsIgnoreCase(type)) {
            return toByteArray(values);
        } else if ("long[]".equalsIgnoreCase(type)) {
            return toLongArray(values);
        } else if ("float[]".equalsIgnoreCase(type)) {
            return toFloatArray(values);
        } else if ("boolean[]".equalsIgnoreCase(type)) {
            return toBooleanArray(values);
        } else if ("byte[][]".equalsIgnoreCase(type)) {
            return values.stream().map(v -> toByteArray(List.of(v))).toArray(byte[][]::new);
        } else {
            throw new RuntimeException("Unexpected Type at getObjectArray: " + type);
        }
    }

    private static byte[] toByteArray(List<String> values) {
        if(values.size() == 1) {
            final byte[] test = tryBase64Decode(values.get(0));
            if (test != null) {
                return test;
            }
        }
        byte[] bs = new byte[values.size()];
        for (int i = 0; i < bs.length; i++) {
            bs[i] = Byte.parseByte(values.get(i));
        }
        return bs;
    }

    private static byte[] tryBase64Decode(final String value) {
        try {
            return Base64.getDecoder().decode(value);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    private static long[] toLongArray(List<String> values) {
        long[] ls = new long[values.size()];
        for (int i = 0; i < ls.length; i++) {
            ls[i] = Long.parseLong(values.get(i));
        }
        return ls;
    }

    private static short[] toShortArray(List<String> values) {
        short[] ss = new short[values.size()];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = Short.parseShort(values.get(i));
        }
        return ss;
    }

    private static float[] toFloatArray(List<String> values) {
        float[] fs = new float[values.size()];
        for (int i = 0; i < fs.length; i++) {
            fs[i] = Float.parseFloat(values.get(i));
        }
        return fs;
    }

    private static double[] toDoubleArray(List<String> values) {
        double[] ds = new double[values.size()];
        for (int i = 0; i < ds.length; i++) {
            ds[i] = Double.parseDouble(values.get(i));
        }
        return ds;
    }

    private static int[] toIntArray(List<String> values) {
        int[] is = new int[values.size()];
        for (int i = 0; i < is.length; i++) {
            is[i] = Integer.parseInt(values.get(i));
        }
        return is;
    }

    private static boolean[] toBooleanArray(List<String> values) {
        boolean[] bs = new boolean[values.size()];
        for (int i = 0; i < bs.length; i++) {
            bs[i] = Boolean.parseBoolean(values.get(i));
        }
        return bs;
    }

    public static Object parseToObject(final String type, final List<String> values) {
        if ("string".equalsIgnoreCase(type)) {
            return values.get(0);
        } else if ("String[]".equals(type)) {
            return values.toArray(new String[values.size()]);
        } else if ("int".equals(type)) {
            return Integer.valueOf(values.get(0));
        } else if ("int[]".equals(type)) {
            return values.stream().mapToInt(Integer::parseInt).toArray();
            //return toIntArray(values);
        } else if ("short".equals(type)) {
            return Short.parseShort(values.get(0));
        } else if ("short[]".equals(type)) {
            return toShortArray(values);
        } else if ("byte".equals(type)) {
            return Byte.parseByte(values.get(0));
        } else if ("byte[]".equals(type)) {
            return toByteArray(values);
        } else if ("long".equals(type)) {
            return Long.parseLong(values.get(0));
        } else if ("long[]".equals(type)) {
            return values.stream().mapToLong(Long::parseLong).toArray();
            //return toLongArray(values);
        } else if ("float".equals(type)) {
            return Float.parseFloat(values.get(0));
        } else if ("float[]".equals(type)) {
            return toFloatArray(values);
        } else if ("boolean".equals(type)) {
            return Boolean.parseBoolean(values.get(0));
        } else if ("boolean[]".equals(type)) {
            return toBooleanArray(values);
        } else if ("Calendar".equals(type) || "dateTime".equals(type)) {
            Calendar cal = DatatypeConverter.parseTime(values.get(0));
            return cal;
        } else if ("double".equals(type)) {
            return Double.parseDouble(values.get(0));
        } else if ("double[]".equals(type)) {
            return values.stream().mapToDouble(Double::parseDouble).toArray();
            //return toDoubleArray(values);
        } else if ("List.String".equalsIgnoreCase(type)) {
            return values;
        } else if ("List.Integer".equalsIgnoreCase(type)) {
            return values.stream().map(Integer::parseInt).collect(Collectors.toList());
        } else if ("List.Long".equalsIgnoreCase(type)) {
            return values.stream().map(Long::parseLong).collect(Collectors.toList());
        } else if ("List.Short".equalsIgnoreCase(type)) {
            return values.stream().map(Short::parseShort).collect(Collectors.toList());
        } else if ("List.Byte".equalsIgnoreCase(type)) {
            return values.stream().map(Byte::parseByte).collect(Collectors.toList());
        } else if ("List.Float".equalsIgnoreCase(type)) {
            return values.stream().map(Float::parseFloat).collect(Collectors.toList());
        } else if ("List.Double".equalsIgnoreCase(type)) {
            return values.stream().map(Double::parseDouble).collect(Collectors.toList());
        } else if ("List.Boolean".equalsIgnoreCase(type)) {
            return values.stream().map(Boolean::parseBoolean).collect(Collectors.toList());
        } else if ("List.Calendar".equalsIgnoreCase(type)) {
            return values.stream().map(DatatypeConverter::parseTime).collect(Collectors.toList());
        } else {
            throw new RuntimeException("Unexpected Type at parseToObject: " + type + values.get(0));
        }
    }

}
