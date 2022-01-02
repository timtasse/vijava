package com.vmware.vim25;

/**
 * DataTransportConnectionInfo contains common information about data transport connections on a host.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class HostDataTransportConnectionInfo extends DynamicData {

    private long staticMemoryConsumed;

    @Override
    public String toString() {
        return "HostDataTransportConnectionInfo{" +
                "staticMemoryConsumed=" + staticMemoryConsumed +
                "} " + super.toString();
    }

    public long getStaticMemoryConsumed() {
        return staticMemoryConsumed;
    }

    public void setStaticMemoryConsumed(final long staticMemoryConsumed) {
        this.staticMemoryConsumed = staticMemoryConsumed;
    }

}
