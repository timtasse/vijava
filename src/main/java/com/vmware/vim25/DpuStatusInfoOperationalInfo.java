package com.vmware.vim25;

import java.util.Calendar;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class DpuStatusInfoOperationalInfo extends DynamicData {

    private String sensorId;
    private ElementDescription healthState;
    private String reading;
    private String units;
    private Calendar timeStamp;

    @Override
    public String toString() {
        return "DpuStatusInfoOperationalInfo{" +
                "sensorId='" + sensorId + '\'' +
                ", healthState=" + healthState +
                ", reading='" + reading + '\'' +
                ", units='" + units + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(final String sensorId) {
        this.sensorId = sensorId;
    }

    public ElementDescription getHealthState() {
        return healthState;
    }

    public void setHealthState(final ElementDescription healthState) {
        this.healthState = healthState;
    }

    public String getReading() {
        return reading;
    }

    public void setReading(final String reading) {
        this.reading = reading;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(final String units) {
        this.units = units;
    }

    public Calendar getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(final Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }

}
