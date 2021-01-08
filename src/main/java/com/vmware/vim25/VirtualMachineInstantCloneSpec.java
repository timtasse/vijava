package com.vmware.vim25;

import java.util.Arrays;

/**
 * Specification for creating an Instant Clone of a powered-on virtual machine.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualMachineInstantCloneSpec extends DynamicData {

    private String biosUuid;
    private OptionValue[] config;
    private VirtualMachineRelocateSpec location;
    private String name;

    @Override
    public String toString() {
        return "VirtualMachineInstantCloneSpec{" +
                "biosUuid='" + biosUuid + '\'' +
                ", config=" + Arrays.toString(config) +
                ", location=" + location +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    public String getBiosUuid() {
        return biosUuid;
    }

    public void setBiosUuid(final String biosUuid) {
        this.biosUuid = biosUuid;
    }

    public OptionValue[] getConfig() {
        return config;
    }

    public void setConfig(final OptionValue[] config) {
        this.config = config;
    }

    public VirtualMachineRelocateSpec getLocation() {
        return location;
    }

    public void setLocation(final VirtualMachineRelocateSpec location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
