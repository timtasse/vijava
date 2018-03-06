package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 04.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public enum HealthUpdateInfoComponentType {

    Fan("Fan"),
    Memory("Memory"),
    Network("Network"),
    Power("Power"),
    Storage("Storage");

    private final String val;

    HealthUpdateInfoComponentType(final String val) {
        this.val = val;
    }

    public String getVal() {
        return this.val;
    }
}