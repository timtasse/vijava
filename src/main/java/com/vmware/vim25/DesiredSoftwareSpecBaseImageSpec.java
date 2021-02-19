package com.vmware.vim25;

/**
 * Describes base-image spec for the ESX host.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class DesiredSoftwareSpecBaseImageSpec extends DynamicData {

    private String version;

    @Override
    public String toString() {
        return "DesiredSoftwareSpecBaseImageSpec{" +
                "version='" + version + '\'' +
                "} " + super.toString();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

}
