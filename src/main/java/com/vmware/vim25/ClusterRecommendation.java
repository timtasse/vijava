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
import java.util.Calendar;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.5
 */

@SuppressWarnings("unused")
public class ClusterRecommendation extends DynamicData {

    private String key;
    private String type;
    private Calendar time;
    private int rating;
    private String reason;
    private String reasonText;
    private String[] prerequisite;
    private ClusterAction[] action;
    private ManagedObjectReference target;
    private LocalizableMessage warningDetails;
    private String warningText;

    @Override
    public String toString() {
        return "ClusterRecommendation{" +
                "key='" + key + '\'' +
                ", type='" + type + '\'' +
                ", time=" + time +
                ", rating=" + rating +
                ", reason='" + reason + '\'' +
                ", reasonText='" + reasonText + '\'' +
                ", prerequisite=" + Arrays.toString(prerequisite) +
                ", action=" + Arrays.toString(action) +
                ", target=" + target +
                ", warningDetails=" + warningDetails +
                ", warningText='" + warningText + '\'' +
                "} " + super.toString();
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getType() {
        return this.type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public Calendar getTime() {
        return this.time;
    }

    public void setTime(final Calendar time) {
        this.time = time;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(final int rating) {
        this.rating = rating;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public String getReasonText() {
        return this.reasonText;
    }

    public void setReasonText(final String reasonText) {
        this.reasonText = reasonText;
    }

    public String[] getPrerequisite() {
        return this.prerequisite;
    }

    public void setPrerequisite(final String[] prerequisite) {
        this.prerequisite = prerequisite;
    }

    public ClusterAction[] getAction() {
        return this.action;
    }

    public void setAction(final ClusterAction[] action) {
        this.action = action;
    }

    public ManagedObjectReference getTarget() {
        return this.target;
    }

    public void setTarget(final ManagedObjectReference target) {
        this.target = target;
    }

    public LocalizableMessage getWarningDetails() {
        return warningDetails;
    }

    public void setWarningDetails(final LocalizableMessage warningDetails) {
        this.warningDetails = warningDetails;
    }

    public String getWarningText() {
        return warningText;
    }

    public void setWarningText(final String warningText) {
        this.warningText = warningText;
    }
}
