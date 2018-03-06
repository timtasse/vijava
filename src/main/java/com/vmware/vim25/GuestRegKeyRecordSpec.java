package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class GuestRegKeyRecordSpec extends DynamicData {

    public GuestRegKeySpec key;
    public LocalizedMethodFault fault;

    public LocalizedMethodFault getFault() {
        return fault;
    }

    public void setFault(final LocalizedMethodFault fault) {
        this.fault = fault;
    }

    public GuestRegKeySpec getKey() {
        return key;
    }

    public void setKey(final GuestRegKeySpec key) {
        this.key = key;
    }
}
