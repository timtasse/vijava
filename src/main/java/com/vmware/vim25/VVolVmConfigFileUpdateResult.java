package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VVolVmConfigFileUpdateResult extends DynamicData {

    public VVolVmConfigFileUpdateResultFailedVmConfigFileInfo[] failedVmConfigFile;
    public KeyValue[] succeededVmConfigFile;

    public VVolVmConfigFileUpdateResultFailedVmConfigFileInfo[] getFailedVmConfigFile() {
        return failedVmConfigFile;
    }

    public void setFailedVmConfigFile(final VVolVmConfigFileUpdateResultFailedVmConfigFileInfo[] failedVmConfigFile) {
        this.failedVmConfigFile = failedVmConfigFile;
    }

    public KeyValue[] getSucceededVmConfigFile() {
        return succeededVmConfigFile;
    }

    public void setSucceededVmConfigFile(final KeyValue[] succeededVmConfigFile) {
        this.succeededVmConfigFile = succeededVmConfigFile;
    }
}
