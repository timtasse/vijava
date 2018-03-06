package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VirtualMachineVMCIDeviceOptionFilterSpecOption extends DynamicData {

    public ChoiceOption action;
    public ChoiceOption direction;
    public LongOption lowerDstPortBoundary;
    public ChoiceOption protocol;
    public LongOption upperDstPortBoundary;

    public ChoiceOption getAction() {
        return action;
    }

    public void setAction(final ChoiceOption action) {
        this.action = action;
    }

    public ChoiceOption getDirection() {
        return direction;
    }

    public void setDirection(final ChoiceOption direction) {
        this.direction = direction;
    }

    public LongOption getLowerDstPortBoundary() {
        return lowerDstPortBoundary;
    }

    public void setLowerDstPortBoundary(final LongOption lowerDstPortBoundary) {
        this.lowerDstPortBoundary = lowerDstPortBoundary;
    }

    public ChoiceOption getProtocol() {
        return protocol;
    }

    public void setProtocol(final ChoiceOption protocol) {
        this.protocol = protocol;
    }

    public LongOption getUpperDstPortBoundary() {
        return upperDstPortBoundary;
    }

    public void setUpperDstPortBoundary(final LongOption upperDstPortBoundary) {
        this.upperDstPortBoundary = upperDstPortBoundary;
    }
}
