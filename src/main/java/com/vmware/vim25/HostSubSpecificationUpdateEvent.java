package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 19.04.18.
 */
public class HostSubSpecificationUpdateEvent extends HostEvent {

    private HostSubSpecification hostSubSpec;

    public HostSubSpecification getHostSubSpec() {
        return hostSubSpec;
    }

    public void setHostSubSpec(final HostSubSpecification hostSubSpec) {
        this.hostSubSpec = hostSubSpec;
    }
}
