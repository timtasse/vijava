package com.vmware.vim25;

import java.util.Arrays;

/**
 * The DistributedVirtualPortgroupNsxPortgroupOperationResult data object defines the result of NSX port group operations,
 * including create, reconfigure and delete.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class DistributedVirtualPortgroupNsxPortgroupOperationResult extends DynamicData {

    private ManagedObjectReference[] portgroups;
    private DistributedVirtualPortgroupProblem[] problems;

    @Override
    public String toString() {
        return "DistributedVirtualPortgroupNsxPortgroupOperationResult{" +
                "portgroups=" + Arrays.toString(portgroups) +
                ", problems=" + Arrays.toString(problems) +
                "} " + super.toString();
    }

    public ManagedObjectReference[] getPortgroups() {
        return portgroups;
    }

    public void setPortgroups(final ManagedObjectReference[] portgroups) {
        this.portgroups = portgroups;
    }

    public DistributedVirtualPortgroupProblem[] getProblems() {
        return problems;
    }

    public void setProblems(final DistributedVirtualPortgroupProblem[] problems) {
        this.problems = problems;
    }

}
