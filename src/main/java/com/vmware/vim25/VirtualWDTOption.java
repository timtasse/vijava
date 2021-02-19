package com.vmware.vim25;

/**
 * This data object type contains the options for the virtual watchdog timer class.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualWDTOption extends VirtualDeviceOption {

    private BoolOption runOnBoot;

    @Override
    public String toString() {
        return "VirtualWDTOption{" +
                "runOnBoot=" + runOnBoot +
                "} " + super.toString();
    }

    public BoolOption getRunOnBoot() {
        return runOnBoot;
    }

    public void setRunOnBoot(final BoolOption runOnBoot) {
        this.runOnBoot = runOnBoot;
    }

}
