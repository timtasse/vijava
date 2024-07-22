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
 * Base class for numeric sensor information.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
@SuppressWarnings("unused")
public class HostNumericSensorInfo extends DynamicData {

    private String name;
    private ElementDescription healthState;
    private long currentReading;
    private int unitModifier;
    private String baseUnits;
    private String rateUnits;
    private HostNumericSensorType sensorType;
    private String id;
    private Long sensorNumber;
    private String timeStamp;
    private HostFru fru;

    @Override
    public String toString() {
        return "HostNumericSensorInfo{" +
                "name='" + name + '\'' +
                ", healthState=" + healthState +
                ", currentReading=" + currentReading +
                ", unitModifier=" + unitModifier +
                ", baseUnits='" + baseUnits + '\'' +
                ", rateUnits='" + rateUnits + '\'' +
                ", sensorType=" + sensorType +
                ", id='" + id + '\'' +
                ", sensorNumber=" + sensorNumber +
                ", timeStamp='" + timeStamp + '\'' +
                ", fru=" + fru +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ElementDescription getHealthState() {
        return healthState;
    }

    public void setHealthState(final ElementDescription healthState) {
        this.healthState = healthState;
    }

    public long getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(final long currentReading) {
        this.currentReading = currentReading;
    }

    public int getUnitModifier() {
        return unitModifier;
    }

    public void setUnitModifier(final int unitModifier) {
        this.unitModifier = unitModifier;
    }

    public String getBaseUnits() {
        return baseUnits;
    }

    public void setBaseUnits(final String baseUnits) {
        this.baseUnits = baseUnits;
    }

    public String getRateUnits() {
        return rateUnits;
    }

    public void setRateUnits(final String rateUnits) {
        this.rateUnits = rateUnits;
    }

    public HostNumericSensorType getSensorType() {
        return sensorType;
    }

    public void setSensorType(final HostNumericSensorType sensorType) {
        this.sensorType = sensorType;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Long getSensorNumber() {
        return sensorNumber;
    }

    public void setSensorNumber(final Long sensorNumber) {
        this.sensorNumber = sensorNumber;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(final String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public HostFru getFru() {
        return fru;
    }

    public void setFru(final HostFru fru) {
        this.fru = fru;
    }

}
