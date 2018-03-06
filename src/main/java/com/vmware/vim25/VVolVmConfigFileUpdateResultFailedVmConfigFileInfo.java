package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VVolVmConfigFileUpdateResultFailedVmConfigFileInfo extends DynamicData {

    public LocalizedMethodFault fault;
    public String targetConfigVVolId;

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
}
