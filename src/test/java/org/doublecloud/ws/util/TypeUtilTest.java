package org.doublecloud.ws.util;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 10.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
public class TypeUtilTest {

    @Test
    public void testIsPrimitiveType() throws Exception {
    }

    @Test
    public void testIsBasicType() throws Exception {
        //"String", "int", "short", "long", "float", "Float", "byte", "boolean", "Boolean", "Calendar", "double",
        //        "List.String", "List.Integer", "List.Short", "List.Long", "List.Float", "List.Double", "List.Byte", "List.Boolean", "List.Calendar")
        assertTrue(TypeUtil.isBasicType("boolean[]"));
        assertTrue(TypeUtil.isBasicType("String"));
        assertTrue(TypeUtil.isBasicType("int"));
        assertTrue(TypeUtil.isBasicType("short"));
        assertTrue(TypeUtil.isBasicType("long"));
        assertTrue(TypeUtil.isBasicType("float"));
        assertTrue(TypeUtil.isBasicType("Float"));
        assertTrue(TypeUtil.isBasicType("byte"));
        assertTrue(TypeUtil.isBasicType("Boolean"));
        assertTrue(TypeUtil.isBasicType("Calendar"));
        assertTrue(TypeUtil.isBasicType("double"));
        assertTrue(TypeUtil.isBasicType("List.String"));
    }

    @Test
    public void testIsBasicType1() throws Exception {
    }

    @Test
    public void testGetVimClass() throws Exception {
    }

    @Test
    public void testGetXSIType() throws Exception {
    }
}