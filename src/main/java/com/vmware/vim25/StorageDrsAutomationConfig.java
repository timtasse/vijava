package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class StorageDrsAutomationConfig extends DynamicData {

    public String ioLoadBalanceAutomationMode;
    public String policyEnforcementAutomationMode;
    public String ruleEnforcementAutomationMode;
    public String spaceLoadBalanceAutomationMode;
    public String vmEvacuationAutomationMode;

    public String getIoLoadBalanceAutomationMode() {
        return ioLoadBalanceAutomationMode;
    }

    public void setIoLoadBalanceAutomationMode(final String ioLoadBalanceAutomationMode) {
        this.ioLoadBalanceAutomationMode = ioLoadBalanceAutomationMode;
    }

    public String getPolicyEnforcementAutomationMode() {
        return policyEnforcementAutomationMode;
    }

    public void setPolicyEnforcementAutomationMode(final String policyEnforcementAutomationMode) {
        this.policyEnforcementAutomationMode = policyEnforcementAutomationMode;
    }

    public String getRuleEnforcementAutomationMode() {
        return ruleEnforcementAutomationMode;
    }

    public void setRuleEnforcementAutomationMode(final String ruleEnforcementAutomationMode) {
        this.ruleEnforcementAutomationMode = ruleEnforcementAutomationMode;
    }

    public String getSpaceLoadBalanceAutomationMode() {
        return spaceLoadBalanceAutomationMode;
    }

    public void setSpaceLoadBalanceAutomationMode(final String spaceLoadBalanceAutomationMode) {
        this.spaceLoadBalanceAutomationMode = spaceLoadBalanceAutomationMode;
    }

    public String getVmEvacuationAutomationMode() {
        return vmEvacuationAutomationMode;
    }

    public void setVmEvacuationAutomationMode(final String vmEvacuationAutomationMode) {
        this.vmEvacuationAutomationMode = vmEvacuationAutomationMode;
    }
}
