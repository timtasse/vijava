package com.vmware.vim25;

import java.util.List;

/**
 * PolicyChangeBatch -- Structure to specify a list of object uuids and a policy for what-if analysis.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0.0
 */
@SuppressWarnings("unused")
public class VsanPolicyChangeBatch extends DynamicData {

    private List<String> uuid = List.of();
    private String policy;

    @Override
    public String toString() {
        return "VsanPolicyChangeBatch{" +
                "uuid=" + uuid +
                ", policy='" + policy + '\'' +
                '}';
    }

    public List<String> getUuid() {
        return uuid;
    }

    public void setUuid(final List<String> uuid) {
        this.uuid = uuid;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(final String policy) {
        this.policy = policy;
    }

}
