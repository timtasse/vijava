package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VirtualEthernetCardResourceAllocation extends DynamicData {

    public Long reservation;
    public SharesInfo share;
    public Long limit;

    public Long getLimit() {
        return limit;
    }

    public void setLimit(final Long limit) {
        this.limit = limit;
    }

    public Long getReservation() {
        return reservation;
    }

    public void setReservation(final Long reservation) {
        this.reservation = reservation;
    }

    public SharesInfo getShare() {
        return share;
    }

    public void setShare(final SharesInfo share) {
        this.share = share;
    }
}
