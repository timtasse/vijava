package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.1
 */
public class HostSevInfo extends DynamicData {

    private String sevState;
    private long maxSevEsGuests;

    @Override
    public String toString() {
        return "HostSevInfo{" +
                "maxSevEsGuests=" + maxSevEsGuests +
                ", sevState='" + sevState + '\'' +
                "} " + super.toString();
    }

    public long getMaxSevEsGuests() {
        return maxSevEsGuests;
    }

    public void setMaxSevEsGuests(final long maxSevEsGuests) {
        this.maxSevEsGuests = maxSevEsGuests;
    }

    public String getSevState() {
        return sevState;
    }

    public void setSevState(final String sevState) {
        this.sevState = sevState;
    }

}
