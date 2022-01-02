package com.vmware.vim25;

/**
 * The BaseIndependentFilterSpec is base class for two different types of independent filter specs
 * {@see VirtualMachineIndependentFilterSpec} and {@see VirtualMachineEmptyIndependentFilterSpec}
 * which are used to specify independent filters to be attached/removed on VMs virtual disk.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.2.1
 */
public class VirtualMachineBaseIndependentFilterSpec extends DynamicData {

    @Override
    public String toString() {
        return "VirtualMachineBaseIndependentFilterSpec{} " + super.toString();
    }

}
