package com.vmware.vim25;

import java.util.Arrays;

/**
 * This data object type describes the NVME topology information.
 * The data objects in this data object type model the NVME storage objects from a topological point of view.
 * The NVME topological view organizes objects by NVME interface, which contains connected controllers,
 * which in turn contain attached namespaces.
 * Only storage adapters which support the NVME protocol will be represented as NVME interfaces in this data object.
 * In particular, an NVME interface will be created for each NVME over Fabrics adapter in the system.
 *
 * Note that it is possible for an adapter to be represented by both an NVME interface
 * in the NVME topology and a SCSI interface in the SCSI topology.
 * This can happen when an adapter supporting the NVME protocol is also presented as
 * a SCSI adapter and SCSI to NVME translation is performed.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostNvmeTopology extends DynamicData {

    private HostNvmeTopologyInterface[] adapter;

    @Override
    public String toString() {
        return "HostNvmeTopology{" +
                "adapter=" + Arrays.toString(adapter) +
                "} " + super.toString();
    }

    public HostNvmeTopologyInterface[] getAdapter() {
        return adapter;
    }

    public void setAdapter(final HostNvmeTopologyInterface[] adapter) {
        this.adapter = adapter;
    }

}
