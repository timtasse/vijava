package com.vmware.vim25;

/**
 * This data type describes the host's persistent state encryption.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class HostRuntimeInfoStateEncryptionInfo extends DynamicData {

    private HostRuntimeInfoStateEncryptionInfoProtectionMode protectionMode;
    private Boolean requireSecureBoot;
    private Boolean requireExecInstalledOnly;

    @Override
    public String toString() {
        return "HostRuntimeInfoStateEncryptionInfo{" +
                "protectionMode='" + protectionMode + '\'' +
                ", requireSecureBoot=" + requireSecureBoot +
                ", requireExecInstalledOnly=" + requireExecInstalledOnly +
                "} " + super.toString();
    }

    public HostRuntimeInfoStateEncryptionInfoProtectionMode getProtectionMode() {
        return protectionMode;
    }

    public void setProtectionMode(final HostRuntimeInfoStateEncryptionInfoProtectionMode protectionMode) {
        this.protectionMode = protectionMode;
    }

    public Boolean getRequireSecureBoot() {
        return requireSecureBoot;
    }

    public void setRequireSecureBoot(final Boolean requireSecureBoot) {
        this.requireSecureBoot = requireSecureBoot;
    }

    public Boolean getRequireExecInstalledOnly() {
        return requireExecInstalledOnly;
    }

    public void setRequireExecInstalledOnly(final Boolean requireExecInstalledOnly) {
        this.requireExecInstalledOnly = requireExecInstalledOnly;
    }

}
