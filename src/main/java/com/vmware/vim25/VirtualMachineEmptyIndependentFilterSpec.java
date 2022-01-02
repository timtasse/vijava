package com.vmware.vim25;

/**
 * The EmptyIndependentFilterSpec data object is used to specify empty independent filter spec.
 * This obejct is passed during provisioning workflows to remove all attached independent filters.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.2.1
 */
public class VirtualMachineEmptyIndependentFilterSpec extends VirtualMachineBaseIndependentFilterSpec {

    @Override
    public String toString() {
        return "VirtualMachineEmptyIndependentFilterSpec{} " + super.toString();
    }

}
