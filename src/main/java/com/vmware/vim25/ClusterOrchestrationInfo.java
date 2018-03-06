package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class ClusterOrchestrationInfo extends DynamicData {

    public ClusterVmReadiness defaultVmReadiness;

    public ClusterVmReadiness getDefaultVmReadiness() {
        return defaultVmReadiness;
    }

    public void setDefaultVmReadiness(final ClusterVmReadiness defaultVmReadiness) {
        this.defaultVmReadiness = defaultVmReadiness;
    }
}
