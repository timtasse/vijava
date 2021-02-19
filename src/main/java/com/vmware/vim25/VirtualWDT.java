package com.vmware.vim25;

/**
 * This data object type represents a watchdog timer in a virtual machine.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualWDT extends VirtualDevice {

    private boolean runOnBoot;
    private boolean running;

    @Override
    public String toString() {
        return "VirtualWDT{" +
                "runOnBoot=" + runOnBoot +
                ", running=" + running +
                "} " + super.toString();
    }

    public boolean isRunOnBoot() {
        return runOnBoot;
    }

    public void setRunOnBoot(final boolean runOnBoot) {
        this.runOnBoot = runOnBoot;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(final boolean running) {
        this.running = running;
    }

}
