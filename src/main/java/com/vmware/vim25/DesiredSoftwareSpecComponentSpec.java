package com.vmware.vim25;

/**
 * Component information for the ESX host.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.2
 */
public class DesiredSoftwareSpecComponentSpec extends DynamicData {

    private String name;
    private String version;

    @Override
    public String toString() {
        return "DesiredSoftwareSpecComponentSpec{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
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
