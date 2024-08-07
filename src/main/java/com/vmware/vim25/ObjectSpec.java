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
public class ObjectSpec extends DynamicData {

    private ManagedObjectReference obj;
    private Boolean skip;
    private SelectionSpec[] selectSet;

    public static ObjectSpec create(final ManagedObjectReference obj, final Boolean skip, final List<TraversalSpec> selectSet) {
        final ObjectSpec spec = new ObjectSpec();
        spec.obj = obj;
        spec.skip = skip;
        spec.selectSet = selectSet.toArray(new SelectionSpec[0]);
        return spec;
    }

    @Override
    public String toString() {
        return "ObjectSpec{" +
                "obj=" + obj +
                ", skip=" + skip +
                ", selectSet=" + Arrays.toString(selectSet) +
                "} ";
    }

    public ManagedObjectReference getObj() {
        return this.obj;
    }

    public void setObj(final ManagedObjectReference obj) {
        this.obj = obj;
    }

    public Boolean getSkip() {
        return this.skip;
    }

    public void setSkip(final Boolean skip) {
        this.skip = skip;
    }

    public SelectionSpec[] getSelectSet() {
        return this.selectSet;
    }

    public void setSelectSet(final SelectionSpec[] selectSet) {
        this.selectSet = selectSet;
    }
}
