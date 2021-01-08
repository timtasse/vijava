package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class FolderNewHostSpec extends DynamicData {

    private String esxLicense;
    private HostConnectSpec hostCnxSpec;

    @Override
    public String toString() {
        return "FolderNewHostSpec{" +
                "esxLicense='" + esxLicense + '\'' +
                ", hostCnxSpec=" + hostCnxSpec +
                "} " + super.toString();
    }

    public String getEsxLicense() {
        return esxLicense;
    }

    public void setEsxLicense(final String esxLicense) {
        this.esxLicense = esxLicense;
    }

    public HostConnectSpec getHostCnxSpec() {
        return hostCnxSpec;
    }

    public void setHostCnxSpec(final HostConnectSpec hostCnxSpec) {
        this.hostCnxSpec = hostCnxSpec;
    }
}
