package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public enum VirtualMachineToolsInstallType {

    guestToolsTypeMSI("guestToolsTypeMSI"),
    guestToolsTypeOpenVMTools("guestToolsTypeOpenVMTools"),
    guestToolsTypeOSP("guestToolsTypeOSP"),
    guestToolsTypeTar("guestToolsTypeTar"),
    guestToolsTypeUnknown("guestToolsTypeUnknown");

    private final String val;

    VirtualMachineToolsInstallType(final String val) {
        this.val = val;
    }

    public String getVal() {
        return this.val;
    }
}