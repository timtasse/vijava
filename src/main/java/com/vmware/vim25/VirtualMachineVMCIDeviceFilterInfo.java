package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VirtualMachineVMCIDeviceFilterInfo extends DynamicData {

    public VirtualMachineVMCIDeviceFilterSpec[] filters;

    public VirtualMachineVMCIDeviceFilterSpec[] getFilters() {
        return filters;
    }

    public void setFilters(final VirtualMachineVMCIDeviceFilterSpec[] filters) {
        this.filters = filters;
    }
}
