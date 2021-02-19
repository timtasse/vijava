package com.vmware.vim25;

import java.util.Arrays;

/**
 * This data object represents the Discovery Log returned by an NVME over Fabrics Discovery controller.
 * The Discovery Log consists of pages which contain a number of entries.
 * It provides an inventory of NVM subsystems with which the host may attempt to form an association through an NVME over Fabrics adapter.
 * For details, see:
 *
 * "NVM Express over Fabrics 1.0", Section 5.3, Discovery Log Page
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostNvmeDiscoveryLog extends DynamicData {

    private HostNvmeDiscoveryLogEntry[] entry;
    private boolean complete;

    @Override
    public String toString() {
        return "HostNvmeDiscoveryLog{" +
                "entry=" + Arrays.toString(entry) +
                ", complete=" + complete +
                "} " + super.toString();
    }

    public HostNvmeDiscoveryLogEntry[] getEntry() {
        return entry;
    }

    public void setEntry(final HostNvmeDiscoveryLogEntry[] entry) {
        this.entry = entry;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(final boolean complete) {
        this.complete = complete;
    }

}
