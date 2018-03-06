package com.vmware.vim25;

import java.util.Calendar;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class HostSpecification extends DynamicData {

    public Calendar createdTime;
    public Calendar lastModified;
    public ManagedObjectReference host;
    public HostSubSpecification[] subSpecs;
    public String changeID;

    public String getChangeID() {
        return changeID;
    }

    public void setChangeID(final String changeID) {
        this.changeID = changeID;
    }

    public Calendar getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(final Calendar createdTime) {
        this.createdTime = createdTime;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public Calendar getLastModified() {
        return lastModified;
    }

    public void setLastModified(final Calendar lastModified) {
        this.lastModified = lastModified;
    }

    public HostSubSpecification[] getSubSpecs() {
        return subSpecs;
    }

    public void setSubSpecs(final HostSubSpecification[] subSpecs) {
        this.subSpecs = subSpecs;
    }
}
