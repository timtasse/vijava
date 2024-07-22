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

package com.vmware.vim25;

import java.util.Arrays;
import java.util.List;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 5.1
 */
public class PropertyFilterSpec extends DynamicData {

    private PropertySpec[] propSet;
    private ObjectSpec[] objectSet;
    private Boolean reportMissingObjectsInResults;

    public static PropertyFilterSpec create(final ObjectSpec objectSet, final List<PropertySpec> propSet) {
        return create(new ObjectSpec[] {objectSet}, propSet.toArray(new PropertySpec[0]));
    }

    public static PropertyFilterSpec create(final ObjectSpec objectSet, final PropertySpec... propSet) {
        return create(new ObjectSpec[] {objectSet}, propSet);
    }

    public static PropertyFilterSpec create(final ObjectSpec[] objectSet, final PropertySpec... propSet) {
        final PropertyFilterSpec spec = new PropertyFilterSpec();
        spec.objectSet = objectSet;
        spec.propSet = propSet;
        return spec;
    }

    public static PropertyFilterSpec createDefault(final ManagedObjectReference mor, final String... properties) {
        final ObjectSpec objectSpec = new ObjectSpec();
        objectSpec.setObj(mor);
        objectSpec.setSkip(Boolean.FALSE);
        final PropertySpec propertySpec = new PropertySpec();
        propertySpec.setType(mor.getType());
        propertySpec.setAll(properties == null || properties.length == 0);
        propertySpec.setPathSet(properties);
        return create(objectSpec, propertySpec);
    }

    @Override
    public String toString() {
        return "PropertyFilterSpec{" +
                "propSet=" + Arrays.toString(propSet) +
                ", objectSet=" + Arrays.toString(objectSet) +
                ", reportMissingObjectsInResults=" + reportMissingObjectsInResults +
                "} " + super.toString();
    }

    public PropertySpec[] getPropSet() {
        return this.propSet;
    }

    public void setPropSet(final PropertySpec[] propSet) {
        this.propSet = propSet;
    }

    public ObjectSpec[] getObjectSet() {
        return this.objectSet;
    }

    public void setObjectSet(final ObjectSpec[] objectSet) {
        this.objectSet = objectSet;
    }

    public Boolean getReportMissingObjectsInResults() {
        return this.reportMissingObjectsInResults;
    }

    public void setReportMissingObjectsInResults(final Boolean reportMissingObjectsInResults) {
        this.reportMissingObjectsInResults = reportMissingObjectsInResults;
    }
}
