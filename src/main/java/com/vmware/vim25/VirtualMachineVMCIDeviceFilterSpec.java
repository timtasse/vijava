package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VirtualMachineVMCIDeviceFilterSpec extends DynamicData {

    public long rank;
    public String action;
    public String protocol;
    public String direction;
    public Long lowerDstPortBoundary;
    public Long upperDstPortBoundary;

    public String getAction() {
        return action;
    }

    public void setAction(final String action) {
        this.action = action;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(final String direction) {
        this.direction = direction;
    }

    public long getLowerDstPortBoundary() {
        return lowerDstPortBoundary;
    }

    public void setLowerDstPortBoundary(final long lowerDstPortBoundary) {
        this.lowerDstPortBoundary = lowerDstPortBoundary;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }

    public long getRank() {
        return rank;
    }

    public void setRank(final long rank) {
        this.rank = rank;
    }

    public long getUpperDstPortBoundary() {
        return upperDstPortBoundary;
    }

    public void setUpperDstPortBoundary(final long upperDstPortBoundary) {
        this.upperDstPortBoundary = upperDstPortBoundary;
    }
}
