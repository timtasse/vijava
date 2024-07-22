package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VirtualEthernetCardResourceAllocation extends DynamicData {

    private Long reservation;
    private SharesInfo share;
    private Long limit;

    @Override
    public String toString() {
        return "VirtualEthernetCardResourceAllocation{" +
                "reservation=" + reservation +
                ", share=" + share +
                ", limit=" + limit +
                '}';
    }

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
