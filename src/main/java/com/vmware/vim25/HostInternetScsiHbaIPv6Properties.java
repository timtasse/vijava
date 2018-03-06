package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostInternetScsiHbaIPv6Properties extends DynamicData {

    public String ipv6DefaultGateway;
    public Boolean ipv6DhcpConfigurationEnabled;
    public Boolean ipv6LinkLocalAutoConfigurationEnabled;
    public Boolean ipv6RouterAdvertisementConfigurationEnabled;
    public HostInternetScsiHbaIscsiIpv6Address[] iscsiIpv6Address;

    public String getIpv6DefaultGateway() {
        return ipv6DefaultGateway;
    }

    public void setIpv6DefaultGateway(final String ipv6DefaultGateway) {
        this.ipv6DefaultGateway = ipv6DefaultGateway;
    }

    public Boolean isIpv6DhcpConfigurationEnabled() {
        return ipv6DhcpConfigurationEnabled;
    }

    public void setIpv6DhcpConfigurationEnabled(final Boolean ipv6DhcpConfigurationEnabled) {
        this.ipv6DhcpConfigurationEnabled = ipv6DhcpConfigurationEnabled;
    }

    public Boolean isIpv6LinkLocalAutoConfigurationEnabled() {
        return ipv6LinkLocalAutoConfigurationEnabled;
    }

    public void setIpv6LinkLocalAutoConfigurationEnabled(final Boolean ipv6LinkLocalAutoConfigurationEnabled) {
        this.ipv6LinkLocalAutoConfigurationEnabled = ipv6LinkLocalAutoConfigurationEnabled;
    }

    public Boolean isIpv6RouterAdvertisementConfigurationEnabled() {
        return ipv6RouterAdvertisementConfigurationEnabled;
    }

    public void setIpv6RouterAdvertisementConfigurationEnabled(final Boolean ipv6RouterAdvertisementConfigurationEnabled) {
        this.ipv6RouterAdvertisementConfigurationEnabled = ipv6RouterAdvertisementConfigurationEnabled;
    }

    public HostInternetScsiHbaIscsiIpv6Address[] getIscsiIpv6Address() {
        return iscsiIpv6Address;
    }

    public void setIscsiIpv6Address(final HostInternetScsiHbaIscsiIpv6Address[] iscsiIpv6Address) {
        this.iscsiIpv6Address = iscsiIpv6Address;
    }
}
