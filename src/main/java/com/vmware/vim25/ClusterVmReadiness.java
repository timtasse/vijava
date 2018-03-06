package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class ClusterVmReadiness extends DynamicData {

    public Integer postReadyDelay;
    public String readyCondition;

    public Integer getPostReadyDelay() {
        return postReadyDelay;
    }

    public void setPostReadyDelay(final Integer postReadyDelay) {
        this.postReadyDelay = postReadyDelay;
    }

    public String getReadyCondition() {
        return readyCondition;
    }

    public void setReadyCondition(final String readyCondition) {
        this.readyCondition = readyCondition;
    }
}
