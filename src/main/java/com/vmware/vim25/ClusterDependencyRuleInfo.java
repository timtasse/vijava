package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class ClusterDependencyRuleInfo extends ClusterRuleInfo {

    public String dependsOnVmGroup;
    public String vmGroup;

    public String getDependsOnVmGroup() {
        return dependsOnVmGroup;
    }

    public void setDependsOnVmGroup(final String dependsOnVmGroup) {
        this.dependsOnVmGroup = dependsOnVmGroup;
    }

    public String getVmGroup() {
        return vmGroup;
    }

    public void setVmGroup(final String vmGroup) {
        this.vmGroup = vmGroup;
    }
}
