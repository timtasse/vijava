package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 22.05.18.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VsanNewPolicyBatch extends DynamicData {

    public String policy;
    public Long[] size;

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(final String policy) {
        this.policy = policy;
    }

    public Long[] getSize() {
        return size;
    }

    public void setSize(final Long[] size) {
        this.size = size;
    }
}
