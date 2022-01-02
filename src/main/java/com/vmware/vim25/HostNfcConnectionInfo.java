package com.vmware.vim25;

/**
 * NfcConnectionInfo contains information about an NFC connection on the host.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class HostNfcConnectionInfo extends HostDataTransportConnectionInfo {

    private Long streamingMemoryConsumed;

    @Override
    public String toString() {
        return "HostNfcConnectionInfo{" +
                "streamingMemoryConsumed=" + streamingMemoryConsumed +
                "} " + super.toString();
    }

    public Long getStreamingMemoryConsumed() {
        return streamingMemoryConsumed;
    }

    public void setStreamingMemoryConsumed(final Long streamingMemoryConsumed) {
        this.streamingMemoryConsumed = streamingMemoryConsumed;
    }

}
