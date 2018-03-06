package com.vmware.vim25;

import java.util.Calendar;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class HostSubSpecification extends DynamicData {

    public String name;
    public Calendar createdTime;
    public byte[] data;

    public Calendar getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(final Calendar createdTime) {
        this.createdTime = createdTime;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(final byte[] data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
