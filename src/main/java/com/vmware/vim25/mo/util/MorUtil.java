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

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.ManagedObject;
import com.vmware.vim25.mo.ServerConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;

/**
 * Utility class for the Managed Object and ManagedObjectReference.
 *
 * @author Steve JIN (sjin@vmware.com)
 */
public final class MorUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(MorUtil.class);

    public static final String MO_PACKAGE_NAME = "com.vmware.vim25.mo";

    private MorUtil() {
        // Util class
    }

    public static ManagedObjectReference[] createMORs(final ManagedObject[] mos) {
        if (mos == null) {
            throw new IllegalArgumentException();
        }
        final ManagedObjectReference[] mors = new ManagedObjectReference[mos.length];
        for (int i = 0; i < mos.length; i++) {
            mors[i] = mos[i].getMOR();
        }
        return mors;
    }

    public static ManagedObject createExactManagedObject(final ServerConnection sc, final ManagedObjectReference mor) {
        if (mor == null) {
            return null;
        }

        final String moType = mor.getType();

        try {
            final Class moClass = Class.forName(MO_PACKAGE_NAME + "." + moType);
            Constructor constructor = moClass.getConstructor(
                    new Class[]{ServerConnection.class, ManagedObjectReference.class});
            return (ManagedObject) constructor.newInstance(new Object[]{sc, mor});
        } catch (final Exception e) {
            LOGGER.error("ReflectionError in createExactManagedObject", e);
            return null;
        }
    }

    public static ManagedEntity createExactManagedEntity(final ServerConnection sc, final ManagedObjectReference mor, final String name) {
        final ManagedEntity entity = (ManagedEntity) createExactManagedObject(sc, mor);
        if (entity == null) {
            return null;
        }
        if (name != null) {
            entity.setName(name);
        } else {
            entity.getRealName();
        }
        return entity;
    }

    public static ManagedEntity[] createManagedEntities(final ServerConnection sc, final ManagedObjectReference[] mors) {
        if (mors == null) {
            return new ManagedEntity[0];
        }
        final ManagedEntity[] mes = new ManagedEntity[mors.length];

        for (int i = 0; i < mors.length; i++) {
            mes[i] = createExactManagedEntity(sc, mors[i], null);
        }

        return mes;
    }

}
