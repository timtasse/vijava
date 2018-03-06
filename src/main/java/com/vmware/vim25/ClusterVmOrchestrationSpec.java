package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class ClusterVmOrchestrationSpec extends ArrayUpdateSpec {

    public ClusterVmOrchestrationInfo info;

    public ClusterVmOrchestrationInfo getInfo() {
        return info;
    }

    public void setInfo(final ClusterVmOrchestrationInfo info) {
        this.info = info;
    }
}
