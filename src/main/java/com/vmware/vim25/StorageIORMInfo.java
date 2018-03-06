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
 * @author Stefan Dilk
 * @version 6.5
 */

@SuppressWarnings("all")
public class StorageIORMInfo extends DynamicData {

    public boolean enabled;
    public String congestionThresholdMode;
    public Integer congestionThreshold;
    public Integer percentOfPeakThroughput;
    public Integer reservableIopsThreshold;
    public boolean reservationEnabled;
    @Deprecated
    public boolean statsCollectionEnabled;
    public Boolean statsAggregationDisabled;

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getCongestionThresholdMode() {
        return this.congestionThresholdMode;
    }

    public void setCongestionThresholdMode(String congestionThresholdMode) {
        this.congestionThresholdMode = congestionThresholdMode;
    }

    public Integer getCongestionThreshold() {
        return this.congestionThreshold;
    }

    public void setCongestionThreshold(Integer congestionThreshold) {
        this.congestionThreshold = congestionThreshold;
    }

    public Integer getPercentOfPeakThroughput() {
        return this.percentOfPeakThroughput;
    }

    public void setPercentOfPeakThroughput(Integer percentOfPeakThroughput) {
        this.percentOfPeakThroughput = percentOfPeakThroughput;
    }

    public Integer getReservableIopsThreshold() {
        return reservableIopsThreshold;
    }

    public void setReservableIopsThreshold(final Integer reservableIopsThreshold) {
        this.reservableIopsThreshold = reservableIopsThreshold;
    }

    public boolean isReservationEnabled() {
        return reservationEnabled;
    }

    public void setReservationEnabled(final boolean reservationEnabled) {
        this.reservationEnabled = reservationEnabled;
    }

    @Deprecated
    public boolean isStatsCollectionEnabled() {
        return statsCollectionEnabled;
    }

    @Deprecated
    public void setStatsCollectionEnabled(boolean statsCollectionEnabled) {
        this.statsCollectionEnabled = statsCollectionEnabled;
    }

    public boolean isStatsAggregationDisabled() {
        return statsAggregationDisabled;
    }

    public void setStatsAggregationDisabled(boolean statsAggregationDisabled) {
        this.statsAggregationDisabled = statsAggregationDisabled;
    }
}