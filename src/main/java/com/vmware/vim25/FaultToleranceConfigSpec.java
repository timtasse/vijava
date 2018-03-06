package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class FaultToleranceConfigSpec extends DynamicData {

    public FaultToleranceMetaSpec metaDataPath;
    public FaultToleranceVMConfigSpec secondaryVmSpec;

    public FaultToleranceMetaSpec getMetaDataPath() {
        return metaDataPath;
    }

    public void setMetaDataPath(final FaultToleranceMetaSpec metaDataPath) {
        this.metaDataPath = metaDataPath;
    }

    public FaultToleranceVMConfigSpec getSecondaryVmSpec() {
        return secondaryVmSpec;
    }

    public void setSecondaryVmSpec(final FaultToleranceVMConfigSpec secondaryVmSpec) {
        this.secondaryVmSpec = secondaryVmSpec;
    }
}
