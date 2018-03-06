package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class BaseConfigInfoDiskFileBackingInfo extends BaseConfigInfoFileBackingInfo {

    public String provisioningType;

    public String getProvisioningType() {
        return provisioningType;
    }

    public void setProvisioningType(final String provisioningType) {
        this.provisioningType = provisioningType;
    }

}
