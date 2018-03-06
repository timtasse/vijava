package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class GatewayToHostAuthFault extends GatewayToHostConnectFault {

    public String[] invalidProperties;
    public String[] missingProperties;

    public String[] getInvalidProperties() {
        return invalidProperties;
    }

    public void setInvalidProperties(final String[] invalidProperties) {
        this.invalidProperties = invalidProperties;
    }

    public String[] getMissingProperties() {
        return missingProperties;
    }

    public void setMissingProperties(final String[] missingProperties) {
        this.missingProperties = missingProperties;
    }
}
