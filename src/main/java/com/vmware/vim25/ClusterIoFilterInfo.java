package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 * @version 6.5
 */
public class ClusterIoFilterInfo extends IoFilterInfo {

    public String opType;
    public String vibUrl;

    public String getOpType() {
        return opType;
    }

    public void setOpType(final String opType) {
        this.opType = opType;
    }

    public String getVibUrl() {
        return vibUrl;
    }

    public void setVibUrl(final String vibUrl) {
        this.vibUrl = vibUrl;
    }
}
