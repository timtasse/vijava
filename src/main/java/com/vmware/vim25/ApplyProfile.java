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

/**
 * The ApplyProfile data object is the base class for all data objects that define profile configuration data.
 * ApplyProfile defines ESX configuration data storage and it supports recursive profile definition for the profile plug-in architecture.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 4.0
 */

public class ApplyProfile extends DynamicData {

    private Boolean copyEnableStatus;
    private boolean enabled;
    private Boolean favorite;
    private Boolean hidden;
    private ProfilePolicy[] policy;
    private String profileTypeName;
    private String profileVersion;
    private ProfileApplyProfileProperty[] property;
    private Boolean toBeDeleted;
    private Boolean toBeMerged;
    private Boolean toReplaceWith;

    public Boolean getCopyEnableStatus() {
        return copyEnableStatus;
    }

    public void setCopyEnableStatus(final Boolean copyEnableStatus) {
        this.copyEnableStatus = copyEnableStatus;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(final Boolean favorite) {
        this.favorite = favorite;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(final Boolean hidden) {
        this.hidden = hidden;
    }

    public ProfilePolicy[] getPolicy() {
        return policy;
    }

    public void setPolicy(final ProfilePolicy[] policy) {
        this.policy = policy;
    }

    public String getProfileTypeName() {
        return profileTypeName;
    }

    public void setProfileTypeName(final String profileTypeName) {
        this.profileTypeName = profileTypeName;
    }

    public String getProfileVersion() {
        return profileVersion;
    }

    public void setProfileVersion(final String profileVersion) {
        this.profileVersion = profileVersion;
    }

    public ProfileApplyProfileProperty[] getProperty() {
        return property;
    }

    public void setProperty(final ProfileApplyProfileProperty[] property) {
        this.property = property;
    }

    public Boolean getToBeDeleted() {
        return toBeDeleted;
    }

    public void setToBeDeleted(final Boolean toBeDeleted) {
        this.toBeDeleted = toBeDeleted;
    }

    public Boolean getToBeMerged() {
        return toBeMerged;
    }

    public void setToBeMerged(final Boolean toBeMerged) {
        this.toBeMerged = toBeMerged;
    }

    public Boolean getToReplaceWith() {
        return toReplaceWith;
    }

    public void setToReplaceWith(final Boolean toReplaceWith) {
        this.toReplaceWith = toReplaceWith;
    }

}
