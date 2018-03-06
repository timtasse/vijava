package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public enum VirtualMachineWindowsQuiesceSpecVssBackupContext {

    ctx_auto("ctx_auto"),
    ctx_backup("ctx_backup"),
    ctx_file_share_backup("ctx_file_share_backup");

    private final String val;

    VirtualMachineWindowsQuiesceSpecVssBackupContext(final String val) {
        this.val = val;
    }

    public String getVal() {
        return this.val;
    }
}