package com.vmware.vim25;

import java.util.Arrays;

/**
 * This data object describes the NVME interface that is associated with a list of connected NVME controllers.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostNvmeTopologyInterface extends DynamicData {

    private String key;
    private String adapter;
    private HostNvmeController[] connectedController;

    @Override
    public String toString() {
        return "HostNvmeTopologyInterface{" +
                "key='" + key + '\'' +
                ", adapter='" + adapter + '\'' +
                ", connectedController=" + Arrays.toString(connectedController) +
                "} " + super.toString();
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getAdapter() {
        return adapter;
    }

    public void setAdapter(final String adapter) {
        this.adapter = adapter;
    }

    public HostNvmeController[] getConnectedController() {
        return connectedController;
    }

    public void setConnectedController(final HostNvmeController[] connectedController) {
        this.connectedController = connectedController;
    }

}
