package com.vmware.vim25;

import java.util.Calendar;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VsanUpgradeSystemUpgradeHistoryItem extends DynamicData {

    public ManagedObjectReference host;
    public String message;
    public ManagedObjectReference task;
    public Calendar timestamp;

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public ManagedObjectReference getTask() {
        return task;
    }

    public void setTask(final ManagedObjectReference task) {
        this.task = task;
    }

    public Calendar getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(final Calendar timestamp) {
        this.timestamp = timestamp;
    }
}
