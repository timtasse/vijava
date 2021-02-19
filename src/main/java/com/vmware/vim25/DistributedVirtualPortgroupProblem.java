package com.vmware.vim25;

/**
 * The DistributedVirtualPortgroupProblem data object defines the error while excuting NSX port group operations.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class DistributedVirtualPortgroupProblem extends DynamicData {

    private String logicalSwitchUuid;
    private LocalizedMethodFault fault;

    @Override
    public String toString() {
        return "DistributedVirtualPortgroupProblem{" +
                "logicalSwitchUuid='" + logicalSwitchUuid + '\'' +
                ", fault=" + fault +
                "} " + super.toString();
    }

    public String getLogicalSwitchUuid() {
        return logicalSwitchUuid;
    }

    public void setLogicalSwitchUuid(final String logicalSwitchUuid) {
        this.logicalSwitchUuid = logicalSwitchUuid;
    }

    public LocalizedMethodFault getFault() {
        return fault;
    }

    public void setFault(final LocalizedMethodFault fault) {
        this.fault = fault;
    }

}
