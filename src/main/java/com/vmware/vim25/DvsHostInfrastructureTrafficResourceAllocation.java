package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class DvsHostInfrastructureTrafficResourceAllocation extends DynamicData {

    public Long limit;
    public Long reservation;
    public SharesInfo shares;

    public long getLimit() {
        return limit;
    }

    public void setLimit(final long limit) {
        this.limit = limit;
    }

    public long getReservation() {
        return reservation;
    }

    public void setReservation(final long reservation) {
        this.reservation = reservation;
    }

    public SharesInfo getShares() {
        return shares;
    }

    public void setShares(final SharesInfo shares) {
        this.shares = shares;
    }
}
