package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VirtualMachineWindowsQuiesceSpec extends VirtualMachineGuestQuiesceSpec {

    public Integer vssBackupType;
    public Boolean vssBootableSystemState;
    public Boolean vssPartialFileSupport;
    public String vssBackupContext;

    public String getVssBackupContext() {
        return vssBackupContext;
    }

    public void setVssBackupContext(final String vssBackupContext) {
        this.vssBackupContext = vssBackupContext;
    }

    public Integer getVssBackupType() {
        return vssBackupType;
    }

    public void setVssBackupType(final Integer vssBackupType) {
        this.vssBackupType = vssBackupType;
    }

    public Boolean isVssBootableSystemState() {
        return vssBootableSystemState;
    }

    public void setVssBootableSystemState(final Boolean vssBootableSystemState) {
        this.vssBootableSystemState = vssBootableSystemState;
    }

    public Boolean isVssPartialFileSupport() {
        return vssPartialFileSupport;
    }

    public void setVssPartialFileSupport(final Boolean vssPartialFileSupport) {
        this.vssPartialFileSupport = vssPartialFileSupport;
    }
}
