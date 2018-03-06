package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class KmipServerStatus extends DynamicData {

    public KeyProviderId clusterId;
    public String description;
    public String name;
    public ManagedEntityStatus status;

    public KeyProviderId getClusterId() {
        return clusterId;
    }

    public void setClusterId(final KeyProviderId clusterId) {
        this.clusterId = clusterId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ManagedEntityStatus getStatus() {
        return status;
    }

    public void setStatus(final ManagedEntityStatus status) {
        this.status = status;
    }
}
