package com.vmware.vim25;

/**
 * Vendor specific add-on info for ESX host.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class DesiredSoftwareSpecVendorAddOnSpec extends DynamicData {

    private String name;
    private String version;

    @Override
    public String toString() {
        return "DesiredSoftwareSpecVendorAddOnSpec{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                "} " + super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

}
