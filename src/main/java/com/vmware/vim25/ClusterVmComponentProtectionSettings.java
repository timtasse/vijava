package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class ClusterVmComponentProtectionSettings extends DynamicData {

    public Boolean enableAPDTimeoutForHosts;
    public String vmReactionOnAPDCleared;
    public String vmStorageProtectionForAPD;
    public String vmStorageProtectionForPDL;
    public Integer vmTerminateDelayForAPDSec;

    public boolean isEnableAPDTimeoutForHosts() {
        return enableAPDTimeoutForHosts;
    }

    public void setEnableAPDTimeoutForHosts(final boolean enableAPDTimeoutForHosts) {
        this.enableAPDTimeoutForHosts = enableAPDTimeoutForHosts;
    }

    public String getVmReactionOnAPDCleared() {
        return vmReactionOnAPDCleared;
    }

    public void setVmReactionOnAPDCleared(final String vmReactionOnAPDCleared) {
        this.vmReactionOnAPDCleared = vmReactionOnAPDCleared;
    }

    public String getVmStorageProtectionForAPD() {
        return vmStorageProtectionForAPD;
    }

    public void setVmStorageProtectionForAPD(final String vmStorageProtectionForAPD) {
        this.vmStorageProtectionForAPD = vmStorageProtectionForAPD;
    }

    public String getVmStorageProtectionForPDL() {
        return vmStorageProtectionForPDL;
    }

    public void setVmStorageProtectionForPDL(final String vmStorageProtectionForPDL) {
        this.vmStorageProtectionForPDL = vmStorageProtectionForPDL;
    }

    public int getVmTerminateDelayForAPDSec() {
        return vmTerminateDelayForAPDSec;
    }

    public void setVmTerminateDelayForAPDSec(final int vmTerminateDelayForAPDSec) {
        this.vmTerminateDelayForAPDSec = vmTerminateDelayForAPDSec;
    }
}
