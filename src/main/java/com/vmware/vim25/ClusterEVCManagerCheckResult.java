package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class ClusterEVCManagerCheckResult extends DynamicData {

    public LocalizedMethodFault fault;
    public String evcModeKey;
    public ManagedObjectReference[] host;

    public LocalizedMethodFault getFault() {
        return fault;
    }

    public void setFault(final LocalizedMethodFault fault) {
        this.fault = fault;
    }

    public String getEvcModeKey() {
        return evcModeKey;
    }

    public void setEvcModeKey(final String evcModeKey) {
        this.evcModeKey = evcModeKey;
    }

    public ManagedObjectReference[] getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference[] host) {
        this.host = host;
    }
}
