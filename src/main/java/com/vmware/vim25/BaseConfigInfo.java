package com.vmware.vim25;

import java.util.Calendar;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class BaseConfigInfo extends DynamicData {

    public BaseConfigInfoBackingInfo backing;
    public Calendar createTime;
    public ID id;
    public String name;

    public BaseConfigInfoBackingInfo getBacking() {
        return backing;
    }

    public void setBacking(final BaseConfigInfoBackingInfo backing) {
        this.backing = backing;
    }

    public Calendar getCreateTime() {
        return createTime;
    }

    public void setCreateTime(final Calendar createTime) {
        this.createTime = createTime;
    }

    public ID getId() {
        return id;
    }

    public void setId(final ID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
