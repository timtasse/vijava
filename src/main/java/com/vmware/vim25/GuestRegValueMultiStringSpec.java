package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class GuestRegValueMultiStringSpec extends GuestRegValueDataSpec {

    public String[] value;

    public String[] getValue() {
        return value;
    }

    public void setValue(final String[] value) {
        this.value = value;
    }
}
