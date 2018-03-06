package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VirtualMachineCreateChildSpec extends DynamicData {

    public VirtualMachineRelocateSpec location;
    public boolean persistent;
    public OptionValue[] configParams;

    public OptionValue[] getConfigParams() {
        return configParams;
    }

    public void setConfigParams(final OptionValue[] configParams) {
        this.configParams = configParams;
    }

    public VirtualMachineRelocateSpec getLocation() {
        return location;
    }

    public void setLocation(final VirtualMachineRelocateSpec location) {
        this.location = location;
    }

    public boolean isPersistent() {
        return persistent;
    }

    public void setPersistent(final boolean persistent) {
        this.persistent = persistent;
    }
}
