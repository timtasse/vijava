package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VVolHostPE extends DynamicData {

    public ManagedObjectReference key;
    public HostProtocolEndpoint[] protocolEndpoint;

    public ManagedObjectReference getKey() {
        return key;
    }

    public void setKey(final ManagedObjectReference key) {
        this.key = key;
    }

    public HostProtocolEndpoint[] getProtocolEndpoint() {
        return protocolEndpoint;
    }

    public void setProtocolEndpoint(final HostProtocolEndpoint[] protocolEndpoint) {
        this.protocolEndpoint = protocolEndpoint;
    }
}
