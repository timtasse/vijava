package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 04.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public enum ClusterHostInfraUpdateHaModeActionOperationType {

    enterMaintenance("enterMaintenance"),
    enterQuarantine("enterQuarantine"),
    exitQuarantine("exitQuarantine");

    private final String val;

    ClusterHostInfraUpdateHaModeActionOperationType(final String val) {
        this.val = val;
    }

    public String getVal() {
        return this.val;
    }
}