package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class GuestRegValueSpec extends DynamicData {

    public GuestRegValueNameSpec name;
    public GuestRegValueDataSpec data;

    public GuestRegValueDataSpec getData() {
        return data;
    }

    public void setData(final GuestRegValueDataSpec data) {
        this.data = data;
    }

    public GuestRegValueNameSpec getName() {
        return name;
    }

    public void setName(final GuestRegValueNameSpec name) {
        this.name = name;
    }
}
