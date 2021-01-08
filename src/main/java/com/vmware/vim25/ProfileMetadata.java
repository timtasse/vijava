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
 * This data object represents the metadata information of a Profile.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 4.0
 */

@SuppressWarnings("all")
public class ProfileMetadata extends DynamicData {

    private ExtendedDescription description;
    private String key;
    private ProfileMetadataProfileOperationMessage[] operationMessages;
    private String profileCategory;
    private String profileComponent;
    private String profileTypeName;
    private ProfileMetadataProfileSortSpec[] sortSpec;

    @Override
    public String toString() {
        return "ProfileMetadata{" +
                "description=" + description +
                ", key='" + key + '\'' +
                ", operationMessages=" + Arrays.toString(operationMessages) +
                ", profileCategory='" + profileCategory + '\'' +
                ", profileComponent='" + profileComponent + '\'' +
                ", profileTypeName='" + profileTypeName + '\'' +
                ", sortSpec=" + Arrays.toString(sortSpec) +
                "} " + super.toString();
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getProfileTypeName() {
        return this.profileTypeName;
    }

    public void setProfileTypeName(String profileTypeName) {
        this.profileTypeName = profileTypeName;
    }

    public ExtendedDescription getDescription() {
        return this.description;
    }

    public void setDescription(ExtendedDescription description) {
        this.description = description;
    }

    public ProfileMetadataProfileSortSpec[] getSortSpec() {
        return this.sortSpec;
    }

    public void setSortSpec(ProfileMetadataProfileSortSpec[] sortSpec) {
        this.sortSpec = sortSpec;
    }

    public String getProfileCategory() {
        return this.profileCategory;
    }

    public void setProfileCategory(String profileCategory) {
        this.profileCategory = profileCategory;
    }

    public String getProfileComponent() {
        return this.profileComponent;
    }

    public void setProfileComponent(String profileComponent) {
        this.profileComponent = profileComponent;
    }

    public ProfileMetadataProfileOperationMessage[] getOperationMessages() {
        return operationMessages;
    }

    public void setOperationMessages(final ProfileMetadataProfileOperationMessage[] operationMessages) {
        this.operationMessages = operationMessages;
    }

}
