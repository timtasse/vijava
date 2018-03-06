package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VchaClusterHealth extends DynamicData {

    public LocalizableMessage[] additionalInformation;
    public LocalizableMessage[] healthMessages;
    public VchaClusterRuntimeInfo runtimeInfo;

    public LocalizableMessage[] getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(final LocalizableMessage[] additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public LocalizableMessage[] getHealthMessages() {
        return healthMessages;
    }

    public void setHealthMessages(final LocalizableMessage[] healthMessages) {
        this.healthMessages = healthMessages;
    }

    public VchaClusterRuntimeInfo getRuntimeInfo() {
        return runtimeInfo;
    }

    public void setRuntimeInfo(final VchaClusterRuntimeInfo runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
    }
}
