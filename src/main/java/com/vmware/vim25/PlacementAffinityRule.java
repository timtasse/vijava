package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class PlacementAffinityRule extends DynamicData {

    public String[] keys;
    public String ruleScope;
    public String ruleType;
    public ManagedObjectReference[] vms;

    public String[] getKeys() {
        return keys;
    }

    public void setKeys(final String[] keys) {
        this.keys = keys;
    }

    public String getRuleScope() {
        return ruleScope;
    }

    public void setRuleScope(final String ruleScope) {
        this.ruleScope = ruleScope;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(final String ruleType) {
        this.ruleType = ruleType;
    }

    public ManagedObjectReference[] getVms() {
        return vms;
    }

    public void setVms(final ManagedObjectReference[] vms) {
        this.vms = vms;
    }
}
