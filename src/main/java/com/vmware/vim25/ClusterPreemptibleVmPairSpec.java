package com.vmware.vim25;

/**
 * Provides monitored and preemptible VM pair along with any of the operations (add, edit or remove) to append,
 * modify or remove this pair info from ClusterPreemptibleVmPairInfo list.
 * <p>
 * This data object is intended for VMware use and other usage is not supported.
 * This data object will be removed in a future release.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class ClusterPreemptibleVmPairSpec extends ArrayUpdateSpec {

    private ClusterPreemptibleVmPairInfo info;

    @Override
    public String toString() {
        return "ClusterPreemptibleVmPairSpec{" +
                "info=" + info +
                '}';
    }

    public ClusterPreemptibleVmPairInfo getInfo() {
        return info;
    }

    public void setInfo(final ClusterPreemptibleVmPairInfo info) {
        this.info = info;
    }

}
