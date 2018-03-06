package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 02.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class OpaqueNetworkCapability extends DynamicData {

    public boolean networkReservationSupported;

    public boolean isNetworkReservationSupported() {
        return networkReservationSupported;
    }

    public void setNetworkReservationSupported(final boolean networkReservationSupported) {
        this.networkReservationSupported = networkReservationSupported;
    }
}
