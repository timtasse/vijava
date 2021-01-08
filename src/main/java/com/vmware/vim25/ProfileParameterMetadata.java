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

/**
 * The ProfileParameterMetadata data object represents the metadata information for expressions, policy options, and host-specific configuration data.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */
@SuppressWarnings("all")
public class ProfileParameterMetadata extends DynamicData {

    private Object defaultValue;
    private Boolean hidden;
    private ExtendedElementDescription id;
    private boolean optional;
    private ProfileParameterMetadataParameterRelationMetadata[] parameterRelations;
    private Boolean readOnly;
    private Boolean securitySensitive;
    private String type;

    @Override
    public String toString() {
        return "ProfileParameterMetadata{" +
                "defaultValue=" + defaultValue +
                ", hidden=" + hidden +
                ", id=" + id +
                ", optional=" + optional +
                ", parameterRelations=" + Arrays.toString(parameterRelations) +
                ", readOnly=" + readOnly +
                ", securitySensitive=" + securitySensitive +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(final Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(final Boolean hidden) {
        this.hidden = hidden;
    }

    public ExtendedElementDescription getId() {
        return id;
    }

    public void setId(final ExtendedElementDescription id) {
        this.id = id;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(final boolean optional) {
        this.optional = optional;
    }

    public ProfileParameterMetadataParameterRelationMetadata[] getParameterRelations() {
        return parameterRelations;
    }

    public void setParameterRelations(final ProfileParameterMetadataParameterRelationMetadata[] parameterRelations) {
        this.parameterRelations = parameterRelations;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public Boolean getSecuritySensitive() {
        return securitySensitive;
    }

    public void setSecuritySensitive(final Boolean securitySensitive) {
        this.securitySensitive = securitySensitive;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

}
