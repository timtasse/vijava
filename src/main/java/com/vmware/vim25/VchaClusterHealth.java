package com.vmware.vim25;

import java.util.List;

/**
 * The VchaClusterHealth class describes the overall VCHA Cluster health.
 * Health information include the last known runtime information about the VCHA Cluster along with health messages and
 * any additional information applicable to the current VCHA Cluster health.
 * If the cluster state is healthy, there will not be any health messages or additional information provided.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VchaClusterHealth extends DynamicData {

    private VchaClusterRuntimeInfo runtimeInfo;
    private List<LocalizableMessage> healthMessages = List.of();
    private List<LocalizableMessage> additionalInformation = List.of();

    @Override
    public String toString() {
        return "VchaClusterHealth{" +
                "runtimeInfo=" + runtimeInfo +
                ", healthMessages=" + healthMessages +
                ", additionalInformation=" + additionalInformation +
                '}';
    }

    public VchaClusterRuntimeInfo getRuntimeInfo() {
        return runtimeInfo;
    }

    public void setRuntimeInfo(final VchaClusterRuntimeInfo runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
    }

    public List<LocalizableMessage> getHealthMessages() {
        return healthMessages;
    }

    public void setHealthMessages(final List<LocalizableMessage> healthMessages) {
        this.healthMessages = healthMessages;
    }

    public List<LocalizableMessage> getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(final List<LocalizableMessage> additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

}
