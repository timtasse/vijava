package com.vmware.vim25;

import java.util.Calendar;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class GuestRegKeySpec extends DynamicData {

    public GuestRegKeyNameSpec keyName;
    public String classType;
    public Calendar lastWritten;

    public String getClassType() {
        return classType;
    }

    public void setClassType(final String classType) {
        this.classType = classType;
    }

    public GuestRegKeyNameSpec getKeyName() {
        return keyName;
    }

    public void setKeyName(final GuestRegKeyNameSpec keyName) {
        this.keyName = keyName;
    }

    public Calendar getLastWritten() {
        return lastWritten;
    }

    public void setLastWritten(final Calendar lastWritten) {
        this.lastWritten = lastWritten;
    }
}
