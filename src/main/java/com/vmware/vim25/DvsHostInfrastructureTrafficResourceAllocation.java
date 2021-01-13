package com.vmware.vim25;

/**
 * Resource allocation information for a host infrastructure traffic class.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class DvsHostInfrastructureTrafficResourceAllocation extends DynamicData {

    private Long limit;
    private SharesInfo shares;
    private Long reservation;

    @Override
    public String toString() {
        return "DvsHostInfrastructureTrafficResourceAllocation{" +
                "limit=" + limit +
                ", shares=" + shares +
                ", reservation=" + reservation +
                "} " + super.toString();
    }

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
