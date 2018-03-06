package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostInternetScsiHbaIscsiIpv6Address extends DynamicData {

    public String address;
    public String operation;
    public String origin;
    public int prefixLength;

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(final String operation) {
        this.operation = operation;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(final String origin) {
        this.origin = origin;
    }

    public int getPrefixLength() {
        return prefixLength;
    }

    public void setPrefixLength(final int prefixLength) {
        this.prefixLength = prefixLength;
    }
}
