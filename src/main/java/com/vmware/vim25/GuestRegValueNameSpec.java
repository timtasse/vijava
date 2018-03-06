package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class GuestRegValueNameSpec extends DynamicData {

    public GuestRegKeyNameSpec keyName;
    public String name;

    public GuestRegKeyNameSpec getKeyName() {
        return keyName;
    }

    public void setKeyName(final GuestRegKeyNameSpec keyName) {
        this.keyName = keyName;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
