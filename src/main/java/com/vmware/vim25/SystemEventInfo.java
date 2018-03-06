package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class SystemEventInfo extends DynamicData {

    public String message;
    public long recordId;
    public long selType;
    public long sensorNumber;
    public String when;

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public long getRecordId() {
        return recordId;
    }

    public void setRecordId(final long recordId) {
        this.recordId = recordId;
    }

    public long getSelType() {
        return selType;
    }

    public void setSelType(final long selType) {
        this.selType = selType;
    }

    public long getSensorNumber() {
        return sensorNumber;
    }

    public void setSensorNumber(final long sensorNumber) {
        this.sensorNumber = sensorNumber;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(final String when) {
        this.when = when;
    }
}
