package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VrpResourceAllocationInfo extends ResourceAllocationInfo {

    public Long reservationLimit;

    public Long getReservationLimit() {
        return reservationLimit;
    }

    public void setReservationLimit(final Long reservationLimit) {
        this.reservationLimit = reservationLimit;
    }
}
