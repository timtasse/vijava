package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VMwareDvsIpfixCapability extends DynamicData {

    public Boolean ipfixSupported;
    public Boolean ipv6ForIpfixSupported;
    public Boolean observationDomainIdSupported;

    public Boolean isIpfixSupported() {
        return ipfixSupported;
    }

    public void setIpfixSupported(final Boolean ipfixSupported) {
        this.ipfixSupported = ipfixSupported;
    }

    public Boolean isIpv6ForIpfixSupported() {
        return ipv6ForIpfixSupported;
    }

    public void setIpv6ForIpfixSupported(final Boolean ipv6ForIpfixSupported) {
        this.ipv6ForIpfixSupported = ipv6ForIpfixSupported;
    }

    public Boolean isObservationDomainIdSupported() {
        return observationDomainIdSupported;
    }

    public void setObservationDomainIdSupported(final Boolean observationDomainIdSupported) {
        this.observationDomainIdSupported = observationDomainIdSupported;
    }
}
