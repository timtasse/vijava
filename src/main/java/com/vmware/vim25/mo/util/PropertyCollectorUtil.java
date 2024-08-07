/*================================================================================
Copyright (c) 2008 VMware, Inc. All Rights Reserved.

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

package com.vmware.vim25.mo.util;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.TypeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Utility class for the PropertyCollector API.
 *
 * @author Steve JIN (sjin@vmware.com)
 */
public class PropertyCollectorUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyCollectorUtil.class);

    //final public static Object NULL = new Object();

    public static Object convertProperty(final Object dynaPropVal) {
        Object propertyValue = null;

        final Class<?> propClass = dynaPropVal.getClass();
        final String propName = propClass.getName();
        if (propName.contains("ArrayOf")) //Check the dynamic propery for ArrayOfXXX object
        {
            final String methodName = propName.substring(propName.indexOf("ArrayOf") + "ArrayOf".length());
            // If object is ArrayOfXXX object, then get the XXX[] by invoking getXXX() on the object. For Ex:
            // ArrayOfManagedObjectReference.getManagedObjectReference() returns ManagedObjectReference[] array.
            try {
                Method getMethod;
                try {
                    getMethod = propClass.getMethod("get" + methodName, (Class<?>[]) null);
                } catch (final NoSuchMethodException nsme) {
                    getMethod = propClass.getMethod("get_" + methodName.toLowerCase(), (Class<?>[]) null);
                }
                propertyValue = getMethod.invoke(dynaPropVal, (Object[]) null);
            } catch (final Exception e) {
                LOGGER.error("ReflectionError in Method {} in Class {}", methodName, propClass.getSimpleName(), e);
            }
        } else {
            propertyValue = dynaPropVal;
        }

        return propertyValue;
    }

    public static List<SelectionSpec> createSelectionSpec(final List<String> names) {
        return names.stream().map(SelectionSpec::create).collect(Collectors.toList());
//        final SelectionSpec[] sss = new SelectionSpec[names.length];
//        for (int i = 0; i < names.length; i++) {
//            sss[i] = new SelectionSpec();
//            sss[i].setName(names[i]);
//        }
//        return sss;
    }

    public static TraversalSpec createTraversalSpecWithString(final String name, final String type, final String path, final List<String> selectPath) {
        return createTraversalSpec(name, type, path, createSelectionSpec(selectPath));
    }

    public static TraversalSpec createTraversalSpec(final String name, final String type, final String path, final List<SelectionSpec> selectSet) {
        final TraversalSpec ts = new TraversalSpec();
        ts.setName(name);
        ts.setType(type);
        ts.setPath(path);
        ts.setSkip(Boolean.FALSE);
        ts.setSelectSet(selectSet);
        return ts;
    }

    /**
     * This code takes an array of [typename, property, property, ...]
     * and converts it into a PropertySpec[].
     *
     * @param typeProplists 2D array of type and properties to retrieve
     * @return Array of container filter specs
     */
    public static List<PropertySpec> buildPropertySpecArray(final List<TypeInfo> typeProplists) {

        return typeProplists.stream().map(t -> PropertySpec.create(t.getType(), t.getProperties())).collect(Collectors.toList());
//        PropertySpec[] pSpecs = new PropertySpec[typeProplists.length];
//
//        for (int i = 0; i < typeProplists.length; i++) {
//            String type = typeProplists[i][0];
//            String[] props = new String[typeProplists[i].length - 1];
//            for (int j = 0; j < props.length; j++) {
//                props[j] = typeProplists[i][j + 1];
//            }
//
//            pSpecs[i] = PropertySpec.create(type, props.length == 0, props);
//        }
//        return pSpecs;
    }

    /**
     * This method creates a SelectionSpec[] to traverses the entire
     * inventory tree starting at a Folder
     * NOTE: This full traversal is based on VC2/ESX3 inventory structure.
     * It does not search new ManagedEntities like Network, DVS, etc.
     * If you want a full traversal with VC4/ESX4, use buildFullTraversalV4().
     *
     * @return The SelectionSpec[]
     */
    public static List<TraversalSpec> buildFullTraversal() {
        final List<TraversalSpec> tSpecs = buildFullTraversalV2NoFolder();

        // Recurse through the folders
        final TraversalSpec visitFolders = createTraversalSpecWithString("visitFolders",
                "Folder", "childEntity",
                List.of("visitFolders", "dcToHf", "dcToVmf", "crToH", "crToRp", "HToVm", "rpToVm"));

        tSpecs.set(0, visitFolders);
        return tSpecs;
//        final SelectionSpec[] sSpecs = new SelectionSpec[tSpecs.size() + 1];
//        sSpecs[0] = visitFolders;
//        for (int i = 1; i < sSpecs.length; i++)
//            sSpecs[i] = tSpecs.get(i - 1);
//
//        return sSpecs;
    }

    /**
     * This method creates basic set of TraveralSpec without visitFolders spec
     *
     * @return The TraversalSpec[]
     */
    private static List<TraversalSpec> buildFullTraversalV2NoFolder() {
        // Recurse through all ResourcePools
        final TraversalSpec rpToRp = createTraversalSpecWithString("rpToRp",
                "ResourcePool", "resourcePool",
                List.of("rpToRp", "rpToVm"));

        // Recurse through all ResourcePools
        final TraversalSpec rpToVm = createTraversalSpec("rpToVm",
                "ResourcePool", "vm",
                List.of());

        // Traversal through ResourcePool branch
        final TraversalSpec crToRp = createTraversalSpecWithString("crToRp",
                "ComputeResource", "resourcePool",
                List.of("rpToRp", "rpToVm"));

        // Traversal through host branch
        final TraversalSpec crToH = createTraversalSpec("crToH",
                "ComputeResource", "host",
                List.of());

        // Traversal through hostFolder branch
        final TraversalSpec dcToHf = createTraversalSpecWithString("dcToHf",
                "Datacenter", "hostFolder",
                List.of("visitFolders"));

        // Traversal through vmFolder branch
        final TraversalSpec dcToVmf = createTraversalSpecWithString("dcToVmf",
                "Datacenter", "vmFolder",
                List.of("visitFolders"));

        final TraversalSpec HToVm = createTraversalSpecWithString("HToVm",
                "HostSystem", "vm",
                List.of("visitFolders"));

        return Arrays.asList(dcToVmf, dcToHf, crToH, crToRp, rpToRp, HToVm, rpToVm);
    }

    /**
     * This method creates a SelectionSpec[] to traverses the entire
     * inventory tree starting at a Folder
     *
     * @return The SelectionSpec[]
     */
    public static List<TraversalSpec> buildFullTraversalV4() {
        final List<TraversalSpec> tSpecs = buildFullTraversalV2NoFolder();

        final TraversalSpec dcToDs = createTraversalSpecWithString("dcToDs",
                "Datacenter", "datastoreFolder",
                List.of("visitFolders"));

        final TraversalSpec vAppToRp = createTraversalSpecWithString("vAppToRp",
                "VirtualApp", "resourcePool",
                List.of("rpToRp", "vAppToRp"));

        /**
         * Copyright 2009 Altor Networks, contribution by Elsa Bignoli
         * @author Elsa Bignoli (elsa@altornetworks.com)
         */
        // Traversal through netFolder branch
        final TraversalSpec dcToNetf = createTraversalSpecWithString("dcToNetf",
                "Datacenter", "networkFolder",
                List.of("visitFolders"));

        // Recurse through the folders
        final TraversalSpec visitFolders = createTraversalSpecWithString("visitFolders",
                "Folder", "childEntity",
                List.of("visitFolders", "dcToHf", "dcToVmf", "dcToDs", "dcToNetf", "crToH", "crToRp", "HToVm", "rpToVm"));

        final List<TraversalSpec> target = new ArrayList<>();
        target.add(visitFolders);
        target.add(dcToDs);
        target.add(dcToNetf);
        target.add(vAppToRp);
        target.addAll(tSpecs);
        return target;
//        SelectionSpec[] sSpecs = new SelectionSpec[tSpecs.size() + 4];
//        sSpecs[0] = visitFolders;
//        sSpecs[1] = dcToDs;
//        sSpecs[2] = dcToNetf;
//        sSpecs[3] = vAppToRp;
//        for (int i = 4; i < sSpecs.length; i++) {
//            sSpecs[i] = tSpecs.get(i - 4);
//        }
//
//        return sSpecs;
    }

}
