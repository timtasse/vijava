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
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

@SuppressWarnings("all")
public class EventDescriptionEventDetail extends DynamicData {
    public String key;
    public String description;
    public String category;
    public String formatOnDatacenter;
    public String formatOnComputeResource;
    public String formatOnHost;
    public String formatOnVm;
    public String fullFormat;
    public String longDescription;

    @Override
    public String toString() {
        return "EventDescriptionEventDetail{" +
                "key='" + key + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", formatOnDatacenter='" + formatOnDatacenter + '\'' +
                ", formatOnComputeResource='" + formatOnComputeResource + '\'' +
                ", formatOnHost='" + formatOnHost + '\'' +
                ", formatOnVm='" + formatOnVm + '\'' +
                ", fullFormat='" + fullFormat + '\'' +
                ", longDescription='" + longDescription + '\'' +
                "} " + super.toString();
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFormatOnDatacenter() {
        return this.formatOnDatacenter;
    }

    public void setFormatOnDatacenter(String formatOnDatacenter) {
        this.formatOnDatacenter = formatOnDatacenter;
    }

    public String getFormatOnComputeResource() {
        return this.formatOnComputeResource;
    }

    public void setFormatOnComputeResource(String formatOnComputeResource) {
        this.formatOnComputeResource = formatOnComputeResource;
    }

    public String getFormatOnHost() {
        return this.formatOnHost;
    }

    public void setFormatOnHost(String formatOnHost) {
        this.formatOnHost = formatOnHost;
    }

    public String getFormatOnVm() {
        return this.formatOnVm;
    }

    public void setFormatOnVm(String formatOnVm) {
        this.formatOnVm = formatOnVm;
    }

    public String getFullFormat() {
        return this.fullFormat;
    }

    public void setFullFormat(String fullFormat) {
        this.fullFormat = fullFormat;
    }

    public String getLongDescription() {
        return this.longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
