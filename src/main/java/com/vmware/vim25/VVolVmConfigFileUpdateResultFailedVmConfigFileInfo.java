package com.vmware.vim25;

/**
 * Information of the failed update on the virtual machine config file.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VVolVmConfigFileUpdateResultFailedVmConfigFileInfo extends DynamicData {

    private String targetConfigVVolId;
    private String dsPath;
    private LocalizedMethodFault fault;

    @Override
    public String toString() {
        return "VVolVmConfigFileUpdateResultFailedVmConfigFileInfo{" +
                "targetConfigVVolId='" + targetConfigVVolId + '\'' +
                ", dsPath='" + dsPath + '\'' +
                ", fault=" + fault +
                "} " + super.toString();
    }

    public LocalizedMethodFault getFault() {
        return fault;
    }

    public void setFault(final LocalizedMethodFault fault) {
        this.fault = fault;
    }

    public String getTargetConfigVVolId() {
        return targetConfigVVolId;
    }

    public void setTargetConfigVVolId(final String targetConfigVVolId) {
        this.targetConfigVVolId = targetConfigVVolId;
    }

    public String getDsPath() {
        return dsPath;
    }

    public void setDsPath(final String dsPath) {
        this.dsPath = dsPath;
    }

}
