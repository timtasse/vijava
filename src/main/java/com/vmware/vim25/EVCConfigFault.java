package com.vmware.vim25;

import java.util.List;

/**
 * An attempt to enable Enhanced VMotion Compatibility on a cluster has failed.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0.0
 */
@SuppressWarnings("unused")
public class EVCConfigFault extends VimFault {

    private transient List<LocalizedMethodFault> faults = List.of();

    public List<LocalizedMethodFault> getFaults() {
        return faults;
    }

    public void setFaults(final List<LocalizedMethodFault> faults) {
        this.faults = faults;
    }

}
